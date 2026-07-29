package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.t;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;

/* loaded from: classes2.dex */
public class AnalyticsConfig {
    public static final String[] UM_COMMON_VERSION_LIMIT = {"1.5.2", SdkVersion.SDK_VERSION};

    /* renamed from: b, reason: collision with root package name */
    private static String f8816b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f8817c = null;

    /* renamed from: d, reason: collision with root package name */
    private static String f8818d = null;
    public static String mWrapperType = null;
    public static String mWrapperVersion = null;
    private static int e = 0;
    public static String GPU_VENDER = "";
    public static String GPU_RENDERER = "";
    public static boolean ACTIVITY_DURATION_OPEN = true;
    public static boolean CATCH_EXCEPTION = true;
    public static long kContinueSessionMillis = 30000;
    public static boolean FLAG_DPLUS = false;

    /* renamed from: a, reason: collision with root package name */
    static double[] f8815a = null;

    static void a(String str) {
        f8817c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static double[] getLocation() {
        return f8815a;
    }

    static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f8818d = str;
            t.a(context).a(f8818d);
        } else {
            UMConfigure.umDebugLog.aq("A_10071", 0, "\\|");
        }
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f8818d)) {
            f8818d = t.a(context).c();
        }
        return f8818d;
    }

    static void a(Context context, int i) {
        e = i;
        t.a(context).a(e);
    }

    public static int getVerticalType(Context context) {
        if (e == 0) {
            e = t.a(context).d();
        }
        return e;
    }
}
