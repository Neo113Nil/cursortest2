package com.bytedance.zmn.zmn.fs;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class zn {
    private static String zmn;

    public static String zmn() {
        String fs = fs();
        return (TextUtils.isEmpty(fs) || !fs.contains(":")) ? fs : fs.replace(":", "_");
    }

    public static String fs() {
        if (!TextUtils.isEmpty(zmn)) {
            return zmn;
        }
        String zn = zn();
        zmn = zn;
        if (!TextUtils.isEmpty(zn)) {
            return zmn;
        }
        String fb = fb();
        zmn = fb;
        if (!TextUtils.isEmpty(fb)) {
            return zmn;
        }
        return zmn;
    }

    private static String zn() {
        String processName;
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            processName = Application.getProcessName();
            return processName;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String fb() {
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
}
