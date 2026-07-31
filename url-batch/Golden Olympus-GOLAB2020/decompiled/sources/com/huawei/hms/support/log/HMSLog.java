package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.AndroidException;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.b;
import com.ironsource.b9;

/* loaded from: classes.dex */
public class HMSLog {

    /* renamed from: a, reason: collision with root package name */
    private static final b f14399a = new b();

    private static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + "(" + packageInfo.versionCode + ")";
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        f14399a.a(3, str, str2);
    }

    public static void e(String str, String str2) {
        f14399a.a(6, str, str2);
    }

    public static void i(String str, String str2) {
        f14399a.a(4, str, str2);
    }

    public static void init(Context context, int i4, String str) {
        b bVar = f14399a;
        bVar.a(context, i4, str);
        bVar.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f14399a.a(6);
    }

    public static boolean isInfoEnable() {
        return f14399a.a(4);
    }

    public static boolean isWarnEnable() {
        return f14399a.a(5);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z4) {
        if (hMSExtLogger == null) {
            throw new IllegalArgumentException("extLogger is not able to be null");
        }
        a aVar = new a(hMSExtLogger);
        if (z4) {
            f14399a.a(aVar);
        } else {
            f14399a.a().a(aVar);
        }
    }

    public static void w(String str, String str2) {
        f14399a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        f14399a.b(6, str, str2, th);
    }

    public static void e(String str, long j4, String str2) {
        f14399a.a(6, str, b9.i.f15550d + j4 + "] " + str2);
    }

    public static void e(String str, long j4, String str2, Throwable th) {
        f14399a.b(6, str, b9.i.f15550d + j4 + "] " + str2, th);
    }
}
