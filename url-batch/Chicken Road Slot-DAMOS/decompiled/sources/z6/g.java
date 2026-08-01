package z6;

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
import c7.c0;
import com.appsflyer.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10881a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f10882b;

    static {
        int i3 = i.f10887e;
        f10881a = 12451000;
        f10882b = new g();
    }

    public Intent a(int i3, Context context, String str) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && g7.b.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f10881a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(i7.b.a(context).e(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb3 = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb3)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|3)|4|(4:8|2d|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:45)(1:47)|46)|48|(13:50|(1:52)(1:112)|53|(4:104|105|(1:107)(1:110)|108)(1:55)|56|57|(1:59)(1:102)|60|61|(1:63)(2:(2:73|(1:75))|(4:81|(1:83)(1:100)|(1:85)|(1:87)(4:88|(2:94|95)|90|(1:92)(1:93)))(1:80))|64|(1:(1:67)(1:68))|(1:70)(1:71)))|113|(0)(0)|53|(0)(0)|56|57|(0)(0)|60|61|(0)(0)|64|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0207, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0226 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i3) {
        boolean z10;
        int i10;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        int i11 = i.f10887e;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !i.f10886d.get()) {
            synchronized (c0.f1872a) {
                try {
                    if (!c0.f1873b) {
                        c0.f1873b = true;
                        try {
                            bundle = i7.b.a(context).d(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e2);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            c0.f1874c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i12 = c0.f1874c;
            if (i12 == 0) {
                throw new GooglePlayServicesMissingManifestValueException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (i12 != 12451000) {
                int i13 = f10881a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 104 + String.valueOf(i12).length() + 194);
                sb2.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb2.append(i13);
                sb2.append(" but found ");
                sb2.append(i12);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb2.toString());
            }
        }
        if (!g7.b.d(context)) {
            if (g7.b.f4281e == null) {
                g7.b.f4281e = Boolean.valueOf(g7.b.b() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (!g7.b.f4281e.booleanValue()) {
                z10 = true;
                c0.b(i3 < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                i10 = 9;
                if (z10) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
                j.a(context);
                if (j.d(packageInfo2, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                } else {
                    if (z10) {
                        c0.g(packageInfo);
                        if (!j.d(packageInfo, true)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i14 = packageInfo2.versionCode;
                        if ((i14 == -1 ? -1 : i14 / 1000) < (i3 != -1 ? i3 / 1000 : -1)) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i3).length() + 11 + String.valueOf(i14).length());
                            sb3.append("Google Play services out of date for ");
                            sb3.append(packageName);
                            sb3.append(".  Requires ");
                            sb3.append(i3);
                            sb3.append(" but found ");
                            sb3.append(i14);
                            Log.w("GooglePlayServicesUtil", sb3.toString());
                            i10 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e9) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e9);
                                    i10 = 1;
                                    if (i10 != 18 ? i10 == 1 ? i.b(context) : false : true) {
                                    }
                                }
                            }
                            i10 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                }
                if (i10 != 18 ? i10 == 1 ? i.b(context) : false : true) {
                    return 18;
                }
                return i10;
            }
        }
        z10 = false;
        c0.b(i3 < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        i10 = 9;
        if (z10) {
        }
        packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT < 28 ? 134217792 : 64);
        j.a(context);
        if (j.d(packageInfo2, true)) {
        }
        if (i10 != 18 ? i10 == 1 ? i.b(context) : false : true) {
        }
    }
}
