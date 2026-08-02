package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmd {
    public static boolean a = false;
    public static boolean b = false;

    @Deprecated
    static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean d = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Context context, int i) {
        boolean z;
        String packageName;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (cqx.a) {
                if (!cqx.b) {
                    cqx.b = true;
                    try {
                        bundle = csr.b(context).b(context.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        cqx.c = bundle.getInt("com.google.android.gms.version");
                    }
                }
            }
            int i2 = cqx.c;
            if (i2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i2 != 263005000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i2);
            }
        }
        try {
            if (!csk.e(context)) {
                if (csk.a == null) {
                    csk.a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                }
                if (!csk.a.booleanValue()) {
                    z = true;
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
                    cme.a(context);
                    if (cme.b(packageInfo2, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    } else {
                        if (z) {
                            oy.at(packageInfo);
                            if (!cme.b(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            if (csn.a(packageInfo2.versionCode) >= csn.a(i)) {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                        return 1;
                                    }
                                }
                                return !applicationInfo.enabled ? 3 : 0;
                            }
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
                            return 2;
                        }
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            cme.a(context);
            if (cme.b(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
        z = false;
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (z) {
        }
    }

    @Deprecated
    public static void c(Context context, int i) {
        clm clmVar = clm.d;
        int l = clmVar.l(context, i);
        if (l != 0) {
            Intent m = clmVar.m(context, l, "e");
            Log.e("GooglePlayServicesUtil", a.Y(l, "GooglePlayServices not available due to error "));
            if (m != null) {
                throw new cmc(l, "Google Play Services not available", m);
            }
            throw new cmb(l);
        }
    }

    public static boolean d(Context context) {
        try {
            if (!b) {
                PackageInfo c2 = csr.b(context).c("com.google.android.gms", 134217792);
                cme.a(context);
                if (c2 == null || cme.b(c2, false) || !cme.b(c2, true)) {
                    a = false;
                } else {
                    a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            b = true;
        }
        return a || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean e(Context context, int i) {
        if (i == 1) {
            return g(context);
        }
        return false;
    }

    @Deprecated
    public static boolean f(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean g(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
