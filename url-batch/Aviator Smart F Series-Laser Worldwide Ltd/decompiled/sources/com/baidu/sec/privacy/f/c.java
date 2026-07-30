package com.baidu.sec.privacy.f;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f10665a = false;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f10666b = false;

    /* renamed from: c, reason: collision with root package name */
    public static long f10667c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f10668d = false;

    public static void a(Throwable th) {
    }

    public static boolean b(Context context) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        try {
            if (!e.a(context, new String[]{"android.permission.GET_TASKS"})) {
                return true;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager.getRunningTasks(1) == null || (runningTaskInfo = activityManager.getRunningTasks(1).get(0)) == null) {
                return false;
            }
            componentName = runningTaskInfo.topActivity;
            return context.getPackageName().equals(componentName.getPackageName());
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static boolean c(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isScreenOn();
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }

    public static boolean d(Context context) {
        long currentTimeMillis;
        try {
            currentTimeMillis = System.currentTimeMillis();
        } catch (Throwable th) {
            a(th);
        }
        if (currentTimeMillis - f10667c < 1000) {
            return f10668d;
        }
        f10668d = c(context) && a(context);
        f10667c = currentTimeMillis;
        return f10668d;
    }

    public static void a(boolean z7) {
        f10665a = true;
        f10666b = z7;
    }

    public static boolean a(Context context) {
        String[] strArr;
        try {
            if (f10665a) {
                return f10666b;
            }
            if (context == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.importanceReasonCode == 0 && (strArr = runningAppProcessInfo.pkgList) != null && strArr.length != 0 && Arrays.asList(strArr).contains(context.getPackageName())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }
}
