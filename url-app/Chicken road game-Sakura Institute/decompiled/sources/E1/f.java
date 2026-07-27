package E1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.chicken.road.kedro.laqer.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2289a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f2290b;

    static {
        int i2 = h.f2293c;
        f2289a = 12451000;
        f2290b = new f();
    }

    public Intent a(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && M1.a.J(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f2289a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                M1.b a4 = M1.c.a(context);
                sb.append(a4.f3573a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i2) {
        boolean z4;
        PackageInfo packageInfo;
        Bundle bundle;
        boolean z5 = true;
        int i4 = 0;
        int i5 = h.f2293c;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f2292b.get()) {
            synchronized (H1.o.f3284a) {
                try {
                    if (!H1.o.f3285b) {
                        H1.o.f3285b = true;
                        try {
                            bundle = M1.c.a(context).f3573a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e4);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            H1.o.f3286c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i6 = H1.o.f3286c;
            if (i6 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i6 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f2289a + " but found " + i6 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (!M1.a.J(context)) {
            if (M1.a.f3571h == null) {
                M1.a.f3571h = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!M1.a.f3571h.booleanValue()) {
                z4 = true;
                if (i2 >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i7 = 9;
                if (z4) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    synchronized (i.class) {
                        if (i.f2294e == null) {
                            m mVar = q.f2306a;
                            synchronized (q.class) {
                                if (q.f2308c == null) {
                                    q.f2308c = context.getApplicationContext();
                                } else {
                                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            i iVar = new i(i4);
                            context.getApplicationContext();
                            i.f2294e = iVar;
                        }
                    }
                    if (i.n(packageInfo2)) {
                        if (z4) {
                            H1.o.d(packageInfo);
                            if (!i.n(packageInfo)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z4 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i8 = packageInfo2.versionCode;
                            if ((i8 == -1 ? -1 : i8 / 1000) < (i2 != -1 ? i2 / 1000 : -1)) {
                                Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i2 + " but found " + i8);
                                i7 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e5) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e5);
                                        i7 = 1;
                                        if (i7 != 18) {
                                        }
                                        if (z5) {
                                        }
                                    }
                                }
                                i7 = !applicationInfo.enabled ? 3 : 0;
                            }
                        } else {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                }
                if (i7 != 18) {
                    if (i7 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z5 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused4) {
                        }
                    }
                    z5 = false;
                }
                if (z5) {
                    return i7;
                }
                return 18;
            }
        }
        z4 = false;
        if (i2 >= 0) {
        }
    }
}
