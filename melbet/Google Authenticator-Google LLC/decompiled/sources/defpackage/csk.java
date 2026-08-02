package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csk {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    public static boolean a(Context context) {
        return b(context.getPackageManager());
    }

    public static boolean b(PackageManager packageManager) {
        Boolean bool = d;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            d = bool;
        }
        return bool.booleanValue();
    }

    public static boolean c(Context context) {
        return d(context.getPackageManager());
    }

    public static boolean d(PackageManager packageManager) {
        Boolean bool = b;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            b = bool;
        }
        return bool.booleanValue();
    }

    public static boolean e(Context context) {
        Boolean bool = c;
        if (bool == null) {
            bool = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            c = bool;
        }
        return bool.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
