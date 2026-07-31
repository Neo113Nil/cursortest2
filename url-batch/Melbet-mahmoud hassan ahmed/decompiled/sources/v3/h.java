package v3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f22820a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f22821b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f22822c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f22823d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f22824e;

    public static boolean a(@RecentlyNonNull Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(@RecentlyNonNull PackageManager packageManager) {
        if (f22824e == null) {
            boolean z6 = false;
            if (l.j() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z6 = true;
            }
            f22824e = Boolean.valueOf(z6);
        }
        return f22824e.booleanValue();
    }

    public static boolean c(@RecentlyNonNull Context context) {
        if (f22822c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z6 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z6 = true;
            }
            f22822c = Boolean.valueOf(z6);
        }
        return f22822c.booleanValue();
    }

    @TargetApi(21)
    public static boolean d(@RecentlyNonNull Context context) {
        return h(context);
    }

    @TargetApi(20)
    public static boolean e(@RecentlyNonNull Context context) {
        return f(context.getPackageManager());
    }

    @TargetApi(20)
    public static boolean f(@RecentlyNonNull PackageManager packageManager) {
        if (f22820a == null) {
            boolean z6 = false;
            if (l.f() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z6 = true;
            }
            f22820a = Boolean.valueOf(z6);
        }
        return f22820a.booleanValue();
    }

    @TargetApi(26)
    public static boolean g(@RecentlyNonNull Context context) {
        if (e(context)) {
            if (!l.i()) {
                return true;
            }
            if (h(context) && !l.j()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean h(@RecentlyNonNull Context context) {
        if (f22821b == null) {
            boolean z6 = false;
            if (l.g() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z6 = true;
            }
            f22821b = Boolean.valueOf(z6);
        }
        return f22821b.booleanValue();
    }

    public static boolean i(@RecentlyNonNull Context context) {
        if (f22823d == null) {
            boolean z6 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z6 = false;
            }
            f22823d = Boolean.valueOf(z6);
        }
        return f22823d.booleanValue();
    }
}
