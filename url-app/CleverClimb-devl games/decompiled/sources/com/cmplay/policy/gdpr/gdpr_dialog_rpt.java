package com.cmplay.policy.gdpr;

import android.content.Context;

/* loaded from: classes.dex */
public class gdpr_dialog_rpt extends BaseTracker {
    public gdpr_dialog_rpt() {
        super("cmplaysdk_gdpr");
    }

    public void report(Context context, int i, int i2) {
        try {
            setValue("uptime", System.currentTimeMillis() / 1000);
            setValue("network", NetUtil.getNetworkState(context));
            setValue("windows", i);
            setValue("action", i2);
            if (GDPRController.mReport != null) {
                GDPRController.mReport.doReport(getTableName(), buildToReportStr());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
