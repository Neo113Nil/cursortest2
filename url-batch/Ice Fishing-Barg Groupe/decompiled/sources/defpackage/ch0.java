package defpackage;

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
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.ice.fishing.grenza.R;
import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class ch0 {
    public static final int PxuCJdSBwIXG;
    public static final ch0 lS5Rgt96tfkO;

    static {
        int i = hh0.TSizfFm2Yiuu;
        PxuCJdSBwIXG = 12451000;
        lS5Rgt96tfkO = new ch0();
    }

    public Intent PxuCJdSBwIXG(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && fx1.bEKsvqmvPh2y(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(PxuCJdSBwIXG);
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
                q3 PxuCJdSBwIXG2 = dv2.PxuCJdSBwIXG(context);
                sb.append(PxuCJdSBwIXG2.PxuCJdSBwIXG.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int lS5Rgt96tfkO(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        Bundle bundle;
        int i2 = hh0.TSizfFm2Yiuu;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !hh0.lS5Rgt96tfkO.get()) {
            synchronized (zv.gPXPFXrUH4XX) {
                try {
                    if (!zv.BRwzKIf41E4i) {
                        zv.BRwzKIf41E4i = true;
                        try {
                            bundle = dv2.PxuCJdSBwIXG(context).PxuCJdSBwIXG.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            zv.XL4ISE6Oc65B = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i3 = zv.XL4ISE6Oc65B;
            if (i3 == 0) {
                throw new GooglePlayServicesMissingManifestValueException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (i3 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + PxuCJdSBwIXG + " but found " + i3 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        int i4 = 0;
        if (!fx1.bEKsvqmvPh2y(context)) {
            if (fx1.gPXPFXrUH4XX == null) {
                fx1.gPXPFXrUH4XX = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!fx1.gPXPFXrUH4XX.booleanValue()) {
                z = true;
                if (i >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i5 = 9;
                if (z) {
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
                    synchronized (ih0.class) {
                        if (ih0.OPXfSBeufaJ8 == null) {
                            jx2 jx2Var = qx2.PxuCJdSBwIXG;
                            synchronized (qx2.class) {
                                if (qx2.TSizfFm2Yiuu == null) {
                                    qx2.TSizfFm2Yiuu = context.getApplicationContext();
                                } else {
                                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            ih0 ih0Var = new ih0(i4);
                            context.getApplicationContext();
                            ih0.OPXfSBeufaJ8 = ih0Var;
                        }
                    }
                    if (ih0.gPXPFXrUH4XX(packageInfo2)) {
                        if (z) {
                            jh0.x50lh2ztY7Y5(packageInfo);
                            if (!ih0.gPXPFXrUH4XX(packageInfo)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i6 = packageInfo2.versionCode;
                            if ((i6 == -1 ? -1 : i6 / 1000) < (i != -1 ? i / 1000 : -1)) {
                                Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + i6);
                                i5 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                        i5 = 1;
                                        if (i5 != 18) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                }
                                i5 = !applicationInfo.enabled ? 3 : 0;
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
                if (i5 != 18) {
                    if (i5 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused4) {
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return i5;
                }
                return 18;
            }
        }
        z = false;
        if (i >= 0) {
        }
    }
}
