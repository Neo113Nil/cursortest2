package com.huawei.hms.framework.common;

import android.content.Context;
import android.os.Process;

/* loaded from: classes.dex */
public class ContextCompat {
    public static boolean checkSelfPermission(Context context, String str) {
        if (context == null || str == null) {
            Logger.w("ContextCompat", "param is null");
            return false;
        }
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (RuntimeException e4) {
            Logger.e("ContextCompat", "dealType rethrowFromSystemServer:", e4);
            return false;
        }
    }

    public static Context getProtectedStorageContext(Context context) {
        if (context != null) {
            return context.createDeviceProtectedStorageContext();
        }
        Logger.w("ContextCompat", "context is null");
        return null;
    }

    public static Object getSystemService(Context context, String str) {
        if (context == null) {
            Logger.w("ContextCompat", "context is null");
            return null;
        }
        try {
            return context.getSystemService(str);
        } catch (RuntimeException e4) {
            Logger.e("ContextCompat", "SystemServer error:", e4);
            return null;
        }
    }
}
