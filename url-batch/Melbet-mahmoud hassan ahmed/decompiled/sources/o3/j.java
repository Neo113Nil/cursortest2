package o3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import r3.m0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f19861a = 12451000;

    /* renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f19862b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f19863c = new AtomicBoolean();

    @Deprecated
    public static int a(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String b(int i7) {
        return b.k(i7);
    }

    @RecentlyNullable
    public static Context c(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @RecentlyNullable
    public static Resources d(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int e(@RecentlyNonNull Context context, int i7) {
        String valueOf;
        String str;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(l.f19866a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f19863c.get()) {
            int a7 = m0.a(context);
            if (a7 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (a7 != f19861a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a7);
            }
        }
        boolean z6 = (v3.h.g(context) || v3.h.i(context)) ? false : true;
        r3.o.a(i7 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z6) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            k.a(context);
            if (k.c(packageInfo2, true)) {
                if (z6) {
                    r3.o.i(packageInfo);
                    if (!k.c(packageInfo, true)) {
                        valueOf = String.valueOf(packageName);
                        str = " requires Google Play Store, but its signature is invalid.";
                    }
                }
                if (!z6 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (v3.o.a(packageInfo2.versionCode) >= v3.o.a(i7)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e7) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e7);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    int i8 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i7);
                    sb.append(" but found ");
                    sb.append(i8);
                    Log.w("GooglePlayServicesUtil", sb.toString());
                    return 2;
                }
                valueOf = String.valueOf(packageName);
                str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            } else {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            }
            Log.w("GooglePlayServicesUtil", valueOf.concat(str));
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean f(@RecentlyNonNull Context context, int i7) {
        if (i7 == 18) {
            return true;
        }
        if (i7 == 1) {
            return i(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean g(@RecentlyNonNull Context context) {
        if (!v3.l.d()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        r3.o.i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean h(int i7) {
        return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 9;
    }

    @TargetApi(21)
    static boolean i(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (v3.l.g()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !g(context);
    }
}
