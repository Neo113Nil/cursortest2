package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes12.dex */
public class phc {
    private static String zmn;

    public static boolean zmn(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), fs(context));
    }

    public static String fs(Context context) {
        if (!TextUtils.isEmpty(zmn)) {
            return zmn;
        }
        String zmn2 = zmn();
        zmn = zmn2;
        if (!TextUtils.isEmpty(zmn2)) {
            return zmn;
        }
        String fs = fs();
        zmn = fs;
        if (!TextUtils.isEmpty(fs)) {
            return zmn;
        }
        return zmn;
    }

    private static String zmn() {
        String processName;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            processName = Application.getProcessName();
            return processName;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String fs() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, null);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String zn(Context context) {
        String fs = fs(context);
        return (TextUtils.isEmpty(fs) || !fs.contains(":")) ? fs : fs.replace(":", "_");
    }
}
