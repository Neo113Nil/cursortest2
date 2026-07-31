package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes10.dex */
public final class k7 {
    public static boolean b;
    public static Application c;
    public static v6 d;
    public static final k7 a = new k7();
    public static String e = "not available";
    public static String f = "not available";
    public static String g = "not available";
    public static String h = "not available";
    public static String i = "not available";
    public static String j = "not available";
    public static String k = "not available";
    public static String l = "not available";
    public static String m = "unknown";

    public final void a(Application app, v6 dm) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(dm, "dm");
        if (b) {
            return;
        }
        c = app;
        d = dm;
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            e = MANUFACTURER;
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            f = MODEL;
            g = "Android " + Build.VERSION.RELEASE;
            h = n() ? "Amazon" : "Android";
            String country = Locale.getDefault().getCountry();
            if (country == null) {
                country = "Cannot retrieve country";
            }
            i = country;
            String m2 = m();
            if (m2 == null) {
                m2 = "Cannot retrieve language";
            }
            j = m2;
            l = p3.a();
            String a2 = a(app);
            if (a2 == null) {
                a2 = "Unknown version";
            }
            k = a2;
        } catch (Exception e2) {
            xb.b("Failed to initialize EnvironmentManager", e2);
        }
        b = true;
    }

    public final Application c() {
        return c;
    }

    public final boolean n() {
        return StringsKt.equals("Amazon", Build.MANUFACTURER, true);
    }

    public final boolean o() {
        return b;
    }

    public final String m() {
        try {
            return LocaleList.getDefault().get(0).getLanguage();
        } catch (Exception e2) {
            xb.a("Cannot retrieve language", e2);
            return null;
        }
    }

    public final v6 l() {
        a();
        return d;
    }

    public final String g() {
        a();
        return e;
    }

    public final String h() {
        a();
        return f;
    }

    public final String i() {
        a();
        return g;
    }

    public final String j() {
        a();
        return h;
    }

    public final String d() {
        a();
        return i;
    }

    public final String f() {
        a();
        return j;
    }

    public final String k() {
        a();
        return l;
    }

    public final String b() {
        a();
        return k;
    }

    public final String e() {
        a();
        return m;
    }

    public final String a(Context context) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageManager == null || packageName == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = packageManager.getPackageInfo(packageName, 0);
            }
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e2) {
            xb.b("Exception while retrieving appVersion: " + e2.getMessage(), (Throwable) null, 2, (Object) null);
            return null;
        }
    }

    public final void a() {
        if (b) {
            return;
        }
        xb.b("EnvironmentManager not initialized. Call init() first.", (Throwable) null, 2, (Object) null);
    }
}
