package com.huawei.hms.ads.installreferrer.commons;

import android.util.Log;

/* loaded from: classes.dex */
public final class LogUtil {
    public static void logError(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static void logInfo(String str, String str2) {
        if (Log.isLoggable(str, 4)) {
            Log.i(str, str2);
        }
    }

    public static void logVerbose(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void logWarn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }
}
