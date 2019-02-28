package com.yayayahei;

import com.intellij.notification.EventLog;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.sun.jna.platform.win32.Advapi32Util;
import com.intellij.openapi.diagnostic.Logger;
import org.apache.commons.logging.Log;

public class CodeQualityAction extends AnAction {
    public static final Logger LOG = Logger.getInstance("com.yayayahei.code-quality");

    public CodeQualityAction() {
        super("CodeQuality");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        Messages.showMessageDialog(project, "Hello world!", "Greeting",Messages.getInformationIcon());
        LOG.info("Execute ** actionPerformed **.");
    }
    @Override
    public void update(AnActionEvent anActionEvent) {
        // Set the availability based on whether a project is open
        Project project = anActionEvent.getProject();
        anActionEvent.getPresentation().setEnabledAndVisible(project != null);
        LOG.info("Execute ** update **.");
    }
}