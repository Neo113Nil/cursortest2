package a2;

import E.AbstractC0005f;
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
import com.rockchicken.pump.up.road.R;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import d2.s;
import i2.AbstractC0457a;
import i2.C0458b;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0166f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4276a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0166f f4277b;

    static {
        AtomicBoolean atomicBoolean = h.f4278a;
        f4276a = 12451000;
        f4277b = new C0166f();
    }

    public Intent a(int i4, Context context, String str) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC0457a.v(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f4276a);
        sb.append(TokenBuilder.TOKEN_DELIMITER);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(TokenBuilder.TOKEN_DELIMITER);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(TokenBuilder.TOKEN_DELIMITER);
        if (context != null) {
            try {
                L1.k a3 = C0458b.a(context);
                sb.append(a3.f1648a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i4) {
        boolean z;
        PackageInfo packageInfo;
        Bundle bundle;
        AtomicBoolean atomicBoolean = h.f4278a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z4 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f4279b.get()) {
            synchronized (s.f8298a) {
                try {
                    if (!s.f8299b) {
                        s.f8299b = true;
                        try {
                            bundle = C0458b.a(context).f1648a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e4) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e4);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            s.f8300c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i5 = s.f8300c;
            if (i5 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i5 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(AbstractC0005f.l("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", f4276a, " but found ", i5, ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"));
            }
        }
        int i6 = 0;
        if (!AbstractC0457a.v(context)) {
            if (AbstractC0457a.f9316e == null) {
                AbstractC0457a.f9316e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!AbstractC0457a.f9316e.booleanValue()) {
                z = true;
                if (i4 >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i7 = 9;
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
                    synchronized (i.class) {
                        if (i.f4281b == null) {
                            l lVar = p.f4293a;
                            synchronized (p.class) {
                                if (p.f4295c == null) {
                                    p.f4295c = context.getApplicationContext();
                                } else {
                                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            i iVar = new i(i6);
                            context.getApplicationContext();
                            i.f4281b = iVar;
                        }
                    }
                    if (i.v(packageInfo2)) {
                        if (z) {
                            s.c(packageInfo);
                            if (!i.v(packageInfo)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i8 = packageInfo2.versionCode;
                            if ((i8 == -1 ? -1 : i8 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) < (i4 != -1 ? i4 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : -1)) {
                                Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i4 + " but found " + i8);
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
                                        if (z4) {
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
                                    z4 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused4) {
                        }
                    }
                    z4 = false;
                }
                if (z4) {
                    return i7;
                }
                return 18;
            }
        }
        z = false;
        if (i4 >= 0) {
        }
    }
}
