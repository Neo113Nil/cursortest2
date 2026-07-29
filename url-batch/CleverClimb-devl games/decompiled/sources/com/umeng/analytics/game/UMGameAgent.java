package com.umeng.analytics.game;

import android.content.Context;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.common.MLog;

/* loaded from: classes2.dex */
public class UMGameAgent extends MobclickAgent {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8835a = "Input string is null or empty";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8836b = "Input string must be less than 64 chars";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8837c = "Input value type is negative";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8838d = "The int value for 'Pay Channels' ranges between 1 ~ 99 ";
    private static final b e = new b();
    private static Context f;

    public static void init(Context context) {
        try {
            if (f == null && context != null) {
                f = context.getApplicationContext();
            }
            e.a(f);
        } catch (Throwable unused) {
            MLog.e("please check Context!");
        }
    }

    public static void setTraceSleepTime(boolean z) {
        e.a(z);
    }

    public static void setPlayerLevel(int i) {
        e.a(String.valueOf(i));
    }

    public static void startLevel(String str) {
        if (a(str)) {
            MLog.e(f8835a);
            UMConfigure.umDebugLog.aq("A_15111", 0, "\\|");
        } else if (str.length() > 64) {
            MLog.e(f8836b);
            UMConfigure.umDebugLog.aq("A_15112", 0, "\\|");
        } else {
            e.b(str);
        }
    }

    public static void finishLevel(String str) {
        if (a(str)) {
            MLog.e(f8835a);
            UMConfigure.umDebugLog.aq("A_15113", 0, "\\|");
        } else if (str.length() > 64) {
            MLog.e(f8836b);
            UMConfigure.umDebugLog.aq("A_15114", 0, "\\|");
        } else {
            e.c(str);
        }
    }

    public static void failLevel(String str) {
        if (a(str)) {
            MLog.e(f8835a);
            UMConfigure.umDebugLog.aq("A_15115", 0, "\\|");
        } else if (str.length() > 64) {
            MLog.e(f8836b);
            UMConfigure.umDebugLog.aq("A_15116", 0, "\\|");
        } else {
            e.d(str);
        }
    }

    public static void pay(double d2, double d3, int i) {
        if (i <= 0 || i >= 100) {
            MLog.e(f8838d);
            UMConfigure.umDebugLog.aq("A_15118", 0, "\\|");
        } else if (d2 < 0.0d || d3 < 0.0d) {
            MLog.e(f8837c);
            UMConfigure.umDebugLog.aq("A_15117", 0, "\\|");
        } else {
            e.a(d2, d3, i);
        }
    }

    public static void pay(double d2, String str, int i, double d3, int i2) {
        if (i2 <= 0 || i2 >= 100) {
            MLog.e(f8838d);
            UMConfigure.umDebugLog.aq("A_15119", 0, "\\|");
            return;
        }
        if (d2 < 0.0d || i < 0 || d3 < 0.0d) {
            MLog.e(f8837c);
            UMConfigure.umDebugLog.aq("A_15120", 0, "\\|");
        } else if (a(str)) {
            MLog.e(f8835a);
            UMConfigure.umDebugLog.aq("A_15121", 0, "\\|");
        } else {
            e.a(d2, str, i, d3, i2);
        }
    }

    public static void exchange(double d2, String str, double d3, int i, String str2) {
        if (d2 < 0.0d || d3 < 0.0d) {
            MLog.e(f8837c);
            UMConfigure.umDebugLog.aq("A_15122", 0, "\\|");
        } else if (i <= 0 || i >= 100) {
            MLog.e(f8838d);
            UMConfigure.umDebugLog.aq("A_15123", 0, "\\|");
        } else {
            e.a(d2, str, d3, i, str2);
        }
    }

    public static void buy(String str, int i, double d2) {
        if (a(str)) {
            MLog.e(f8835a);
            UMConfigure.umDebugLog.aq("A_15124", 0, "\\|");
        } else if (i < 0 || d2 < 0.0d) {
            MLog.e(f8837c);
            UMConfigure.umDebugLog.aq("A_15125", 0, "\\|");
        } else {
            e.a(str, i, d2);
        }
    }

    public static void use(String str, int i, double d2) {
        if (a(str)) {
            MLog.e(f8835a);
            UMConfigure.umDebugLog.aq("A_15126", 0, "\\|");
        } else if (i < 0 || d2 < 0.0d) {
            MLog.e(f8837c);
            UMConfigure.umDebugLog.aq("A_15127", 0, "\\|");
        } else {
            e.b(str, i, d2);
        }
    }

    public static void bonus(double d2, int i) {
        if (d2 < 0.0d) {
            MLog.e(f8837c);
            UMConfigure.umDebugLog.aq("A_15128", 0, "\\|");
        } else if (i <= 0 || i >= 100) {
            MLog.e(f8838d);
            UMConfigure.umDebugLog.aq("A_15129", 0, "\\|");
        } else {
            e.a(d2, i);
        }
    }

    public static void bonus(String str, int i, double d2, int i2) {
        if (a(str)) {
            MLog.e(f8835a);
            UMConfigure.umDebugLog.aq("A_15130", 0, "\\|");
            return;
        }
        if (i < 0 || d2 < 0.0d) {
            MLog.e(f8837c);
            UMConfigure.umDebugLog.aq("A_15131", 0, "\\|");
        } else if (i2 <= 0 || i2 >= 100) {
            MLog.e(f8838d);
            UMConfigure.umDebugLog.aq("A_15132", 0, "\\|");
        } else {
            e.a(str, i, d2, i2);
        }
    }

    private static boolean a(String str) {
        return str == null || str.trim().length() <= 0;
    }
}
