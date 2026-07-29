package com.facebook.ads.internal.g;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.ads.internal.q.a.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5127a = Build.VERSION.RELEASE;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5128b;

    public b(Context context) {
        this.f5128b = context.getApplicationContext();
    }

    public String a() {
        return (Build.MANUFACTURER == null || Build.MANUFACTURER.length() <= 0) ? "" : Build.MANUFACTURER;
    }

    public String b() {
        return (Build.MODEL == null || Build.MODEL.length() <= 0) ? "" : Build.MODEL;
    }

    public String c() {
        String networkOperatorName;
        TelephonyManager telephonyManager = (TelephonyManager) this.f5128b.getSystemService("phone");
        return (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null || networkOperatorName.length() <= 0) ? "" : networkOperatorName;
    }

    public String d() {
        try {
            CharSequence applicationLabel = this.f5128b.getPackageManager().getApplicationLabel(this.f5128b.getPackageManager().getApplicationInfo(f(), 0));
            return (applicationLabel == null || applicationLabel.length() <= 0) ? "" : applicationLabel.toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public String e() {
        String installerPackageName;
        try {
            String f = f();
            return (f == null || f.length() < 0 || (installerPackageName = this.f5128b.getPackageManager().getInstallerPackageName(f)) == null) ? "" : installerPackageName.length() > 0 ? installerPackageName : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public String f() {
        PendingIntent activity = PendingIntent.getActivity(this.f5128b, 0, new Intent(), 0);
        return Build.VERSION.SDK_INT >= 17 ? activity.getCreatorPackage() : activity.getTargetPackage();
    }

    public String g() {
        try {
            return this.f5128b.getPackageManager().getPackageInfo(f(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public int h() {
        try {
            return this.f5128b.getPackageManager().getPackageInfo(f(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public boolean i() {
        return this.f5128b.checkCallingOrSelfPermission("android.permission.BIND_ACCESSIBILITY_SERVICE") == 0;
    }

    public int j() {
        return e.b(this.f5128b);
    }
}
