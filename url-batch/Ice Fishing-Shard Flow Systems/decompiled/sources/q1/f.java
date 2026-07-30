package q1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.icefishing.icefish.ice.fishing.s294s.R;
import t1.u;
import x1.AbstractC1000b;
import z1.C1054b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7325a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f7326b;

    static {
        int i2 = g.f7329c;
        f7325a = 12451000;
        f7326b = new f();
    }

    public Intent a(int i2, Context context, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC1000b.c(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f7325a);
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
                a1.j a7 = C1054b.a(context);
                sb.append(a7.f3070a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
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

    /* JADX WARN: Removed duplicated region for block: B:132:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0257 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i2) {
        boolean z7;
        PackageInfo packageInfo;
        Bundle bundle;
        int i5 = g.f7329c;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !g.f7328b.get()) {
            synchronized (u.f8001a) {
                try {
                    if (!u.f8002b) {
                        u.f8002b = true;
                        try {
                            bundle = C1054b.a(context).f3070a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e7);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            u.f8003c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i7 = u.f8003c;
            if (i7 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i7 != 12451000) {
                int i8 = f7325a;
                StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 104 + String.valueOf(i7).length() + 194);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i8);
                sb.append(" but found ");
                sb.append(i7);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        int i9 = 0;
        if (!AbstractC1000b.c(context)) {
            if (AbstractC1000b.f8321d == null) {
                AbstractC1000b.f8321d = Boolean.valueOf(AbstractC1000b.b() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (!AbstractC1000b.f8321d.booleanValue()) {
                z7 = true;
                if (i2 >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i10 = 9;
                if (z7) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                    synchronized (h.class) {
                        if (h.f7330e == null) {
                            k kVar = o.f7348a;
                            synchronized (o.class) {
                                if (o.f7350c == null) {
                                    o.f7350c = context.getApplicationContext();
                                } else {
                                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            h hVar = new h(i9);
                            context.getApplicationContext();
                            h.f7330e = hVar;
                        }
                    }
                    if (h.v(packageInfo2)) {
                        if (z7) {
                            u.f(packageInfo);
                            if (!h.v(packageInfo)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z7 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i11 = packageInfo2.versionCode;
                            if ((i11 == -1 ? -1 : i11 / 1000) < (i2 != -1 ? i2 / 1000 : -1)) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i2).length() + 11 + String.valueOf(i11).length());
                                sb2.append("Google Play services out of date for ");
                                sb2.append(packageName);
                                sb2.append(".  Requires ");
                                sb2.append(i2);
                                sb2.append(" but found ");
                                sb2.append(i11);
                                Log.w("GooglePlayServicesUtil", sb2.toString());
                                i10 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e8) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e8);
                                        i10 = 1;
                                        if (i10 != 18 ? i10 == 1 ? g.a(context) : false : true) {
                                        }
                                    }
                                }
                                i10 = !applicationInfo.enabled ? 3 : 0;
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
                if (i10 != 18 ? i10 == 1 ? g.a(context) : false : true) {
                    return i10;
                }
                return 18;
            }
        }
        z7 = false;
        if (i2 >= 0) {
        }
    }
}
