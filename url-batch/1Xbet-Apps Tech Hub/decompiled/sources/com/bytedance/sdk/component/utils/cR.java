package com.bytedance.sdk.component.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: ProcessUtil.java */
/* loaded from: classes.dex */
public class cR {
    private static String pvs;

    public static boolean pvs(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), icD(context));
    }

    public static String icD(Context context) {
        if (!TextUtils.isEmpty(pvs)) {
            return pvs;
        }
        String pvs2 = pvs();
        pvs = pvs2;
        if (!TextUtils.isEmpty(pvs2)) {
            return pvs;
        }
        String icD = icD();
        pvs = icD;
        if (!TextUtils.isEmpty(icD)) {
            return pvs;
        }
        String vG = vG(context);
        pvs = vG;
        return vG;
    }

    private static String pvs() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String icD() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String vG(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }
}
