package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cch {
    private static final hkh a = hkh.l("com/google/android/apps/authenticator2/util/PackageUtils");

    public static String a(Context context) {
        PackageInfo packageInfo;
        long longVersionCode;
        PackageManager.PackageInfoFlags of;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            }
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        } catch (PackageManager.NameNotFoundException e) {
            ((hkf) ((hkf) ((hkf) a.g()).h(e)).i("com/google/android/apps/authenticator2/util/PackageUtils", "getVersionCode", (char) 29, "PackageUtils.java")).s("Could not get the package info.");
            return "-1";
        }
    }
}
