package com.cmplay.base.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemProperties;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/* compiled from: PhoneModelUtils.java */
/* loaded from: classes.dex */
public class v {
    private static boolean a(Context context, int i, String str) {
        try {
            Class<?> cls = Class.forName("android.content.Context");
            Field declaredField = cls.getDeclaredField("APP_OPS_SERVICE");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(cls);
            if (!(obj instanceof String)) {
                return false;
            }
            Object invoke = cls.getMethod("getSystemService", String.class).invoke(context, (String) obj);
            Class<?> cls2 = Class.forName("android.app.AppOpsManager");
            Field declaredField2 = cls2.getDeclaredField("MODE_ALLOWED");
            declaredField2.setAccessible(true);
            return ((Integer) cls2.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(invoke, 24, Integer.valueOf(i), str)).intValue() != declaredField2.getInt(cls2);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        if (b() || a()) {
            String packageName = context.getPackageName();
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(packageName, 0).applicationInfo;
                if (!a() && !c()) {
                    return Build.VERSION.SDK_INT >= 19 ? (33554432 & applicationInfo.flags) == 0 : (134217728 & applicationInfo.flags) == 0;
                }
                return a(context, applicationInfo.uid, packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean a() {
        String str = SystemProperties.get("ro.build.version.emui", "unkonw");
        if (str == null) {
            return false;
        }
        String[] split = str.split("_");
        if (split.length <= 1 || !split[0].equalsIgnoreCase("EmotionUI")) {
            return false;
        }
        String[] split2 = split[1].split("\\.");
        String[] split3 = "2.3".split("\\.");
        int length = split2.length > split3.length ? split3.length : split2.length;
        for (int i = 0; i < length; i++) {
            try {
                int intValue = Integer.valueOf(split2[i]).intValue();
                int intValue2 = Integer.valueOf(split3[i]).intValue();
                if (intValue != intValue2) {
                    return intValue > intValue2;
                }
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return true;
    }

    public static boolean b() {
        String str = SystemProperties.get("ro.miui.ui.version.name", "unkonw");
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase("V5") || str.equalsIgnoreCase("V6")) {
            return d();
        }
        return false;
    }

    public static boolean c() {
        if (SystemProperties.get("ro.miui.ui.version.name", "unkonw").equalsIgnoreCase("V6")) {
            return d();
        }
        return false;
    }

    private static boolean d() {
        try {
            String str = SystemProperties.get("ro.build.version.incremental", "unkonw");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (Pattern.compile("(?i)[a-z]").matcher(str).find()) {
                if (!str.startsWith("JLB") || Float.valueOf(str.substring(3, str.length())).floatValue() >= 22.0f) {
                    return true;
                }
            } else {
                String[] split = str.split("\\.");
                String[] split2 = "3.3.29".split("\\.");
                int length = split.length > split2.length ? split2.length : split.length;
                for (int i = 0; i < length; i++) {
                    int intValue = Integer.valueOf(split[i]).intValue();
                    int intValue2 = Integer.valueOf(split2[i]).intValue();
                    if (intValue != intValue2) {
                        if (intValue > intValue2) {
                            return true;
                        }
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
