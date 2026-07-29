package com.cmplay.policy.gdpr;

import android.util.Log;

/* loaded from: classes.dex */
public class LogUtil {
    public static void d(String str, String str2) {
        if (GDPRController.isDebug()) {
            Log.d(str, str2);
        }
    }
}
