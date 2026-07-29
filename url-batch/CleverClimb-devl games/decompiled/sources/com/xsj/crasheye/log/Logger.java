package com.xsj.crasheye.log;

import android.util.Log;
import com.xsj.crasheye.Crasheye;

/* loaded from: classes2.dex */
public class Logger {
    public static void logInfo(String str) {
        if (!Crasheye.DEBUG || str == null) {
            return;
        }
        Log.i("Crasheye", str);
    }

    public static void logWarning(String str) {
        if (str != null) {
            Log.w("Crasheye", str);
        }
    }

    public static void logError(String str) {
        if (str != null) {
            Log.e("Crasheye", str);
        }
    }
}
