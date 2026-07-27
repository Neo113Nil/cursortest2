package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: com.yandex.varioqub.config.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0392b {
    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static String b() {
        Context context = AbstractC0394d.f5413a;
        if (context != null) {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        }
        kotlin.jvm.internal.i.l("appContext");
        throw null;
    }

    public static PackageInfo c() {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        Context context = AbstractC0394d.f5413a;
        if (context == null) {
            kotlin.jvm.internal.i.l("appContext");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        of = PackageManager.PackageInfoFlags.of(0L);
        packageInfo = packageManager.getPackageInfo(packageName, of);
        return packageInfo;
    }

    public static String d() {
        long longVersionCode;
        PackageInfo c2 = c();
        if (Build.VERSION.SDK_INT < 28) {
            return String.valueOf(c2.versionCode);
        }
        longVersionCode = c2.getLongVersionCode();
        return String.valueOf(longVersionCode);
    }
}
