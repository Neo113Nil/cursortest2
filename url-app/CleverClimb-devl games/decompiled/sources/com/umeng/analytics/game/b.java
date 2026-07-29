package com.umeng.analytics.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.tapjoy.TapjoyConstants;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.game.a;
import com.umeng.analytics.pro.r;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: InternalGameAgent.java */
/* loaded from: classes2.dex */
class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8847a = true;
    private Context A;

    /* renamed from: b, reason: collision with root package name */
    private com.umeng.analytics.b f8848b = MobclickAgent.getAgent();

    /* renamed from: c, reason: collision with root package name */
    private a f8849c = null;

    /* renamed from: d, reason: collision with root package name */
    private final int f8850d = 100;
    private final int e = 1;
    private final int f = 0;
    private final int g = -1;
    private final int h = 1;
    private final String i = AppLovinEventTypes.USER_COMPLETED_LEVEL;
    private final String j = "pay";
    private final String k = "buy";
    private final String l = "use";
    private final String m = "bonus";
    private final String n = "item";
    private final String o = "cash";
    private final String p = "coin";
    private final String q = "source";
    private final String r = "amount";
    private final String s = TapjoyConstants.TJC_USER_LEVEL;
    private final String t = "bonus_source";
    private final String u = AppLovinEventTypes.USER_COMPLETED_LEVEL;
    private final String v = "status";
    private final String w = "duration";
    private final String x = "curtype";
    private final String y = "orderid";
    private final String z = "UMGameAgent.init(Context) should be called before any game api";

    public b() {
        f8847a = true;
    }

    void a(Context context) {
        if (context == null) {
            MLog.e("Context is null, can't init GameAgent");
            return;
        }
        this.A = context.getApplicationContext();
        this.f8848b.a((r) this);
        this.f8849c = new a(this.A);
    }

    void a(boolean z) {
        MLog.d(String.format("Trace sleep time : %b", Boolean.valueOf(z)));
        f8847a = z;
    }

    void a(String str) {
        try {
            if (this.A == null) {
                MLog.e("UMGameAgent.init(Context) should be called before any game api");
                return;
            }
            this.f8849c.f8840b = str;
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.A);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("userlevel", str).commit();
            }
        } catch (Throwable unused) {
        }
    }

    void b(String str) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15101", 0, "\\|");
            return;
        }
        this.f8849c.f8839a = str;
        this.f8849c.a(str);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, str);
        hashMap.put("status", 0);
        if (this.f8849c.f8840b != null) {
            hashMap.put(TapjoyConstants.TJC_USER_LEVEL, this.f8849c.f8840b);
        }
        this.f8848b.a(this.A, AppLovinEventTypes.USER_COMPLETED_LEVEL, hashMap);
    }

    private void a(String str, int i) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            return;
        }
        a.C0392a b2 = this.f8849c.b(str);
        if (b2 != null) {
            long e = b2.e();
            if (e <= 0) {
                MLog.d("level duration is 0");
                return;
            }
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, str);
            hashMap.put("status", Integer.valueOf(i));
            hashMap.put("duration", Long.valueOf(e));
            if (this.f8849c.f8840b != null) {
                hashMap.put(TapjoyConstants.TJC_USER_LEVEL, this.f8849c.f8840b);
            }
            this.f8848b.a(this.A, AppLovinEventTypes.USER_COMPLETED_LEVEL, hashMap);
            return;
        }
        MLog.w(String.format("finishLevel(or failLevel) called before startLevel", new Object[0]));
    }

    void c(String str) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
        } else if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15102", 0, "\\|");
        } else {
            a(str, 1);
        }
    }

    void d(String str) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
        } else if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15103", 0, "\\|");
        } else {
            a(str, -1);
        }
    }

    void a(double d2, double d3, int i) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15104", 0, "\\|");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("cash", Long.valueOf((long) (d2 * 100.0d)));
        hashMap.put("coin", Long.valueOf((long) (d3 * 100.0d)));
        hashMap.put("source", Integer.valueOf(i));
        if (this.f8849c.f8840b != null) {
            hashMap.put(TapjoyConstants.TJC_USER_LEVEL, this.f8849c.f8840b);
        }
        if (this.f8849c.f8839a != null) {
            hashMap.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f8849c.f8839a);
        }
        this.f8848b.a(this.A, "pay", hashMap);
    }

    void a(double d2, String str, int i, double d3, int i2) {
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15104", 0, "\\|");
        } else {
            double d4 = i;
            Double.isNaN(d4);
            a(d2, d3 * d4, i2);
            a(str, i, d3);
        }
    }

    void a(String str, int i, double d2) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15106", 0, "\\|");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("item", str);
        hashMap.put("amount", Integer.valueOf(i));
        double d3 = i;
        Double.isNaN(d3);
        hashMap.put("coin", Long.valueOf((long) (d3 * d2 * 100.0d)));
        if (this.f8849c.f8840b != null) {
            hashMap.put(TapjoyConstants.TJC_USER_LEVEL, this.f8849c.f8840b);
        }
        if (this.f8849c.f8839a != null) {
            hashMap.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f8849c.f8839a);
        }
        this.f8848b.a(this.A, "buy", hashMap);
    }

    void b(String str, int i, double d2) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15107", 0, "\\|");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("item", str);
        hashMap.put("amount", Integer.valueOf(i));
        double d3 = i;
        Double.isNaN(d3);
        hashMap.put("coin", Long.valueOf((long) (d3 * d2 * 100.0d)));
        if (this.f8849c.f8840b != null) {
            hashMap.put(TapjoyConstants.TJC_USER_LEVEL, this.f8849c.f8840b);
        }
        if (this.f8849c.f8839a != null) {
            hashMap.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f8849c.f8839a);
        }
        this.f8848b.a(this.A, "use", hashMap);
    }

    void a(double d2, int i) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15108", 0, "\\|");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("coin", Long.valueOf((long) (d2 * 100.0d)));
        hashMap.put("bonus_source", Integer.valueOf(i));
        if (this.f8849c.f8840b != null) {
            hashMap.put(TapjoyConstants.TJC_USER_LEVEL, this.f8849c.f8840b);
        }
        if (this.f8849c.f8839a != null) {
            hashMap.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f8849c.f8839a);
        }
        this.f8848b.a(this.A, "bonus", hashMap);
    }

    void a(String str, int i, double d2, int i2) {
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15108", 0, "\\|");
        } else {
            double d3 = i;
            Double.isNaN(d3);
            a(d3 * d2, i2);
            a(str, i, d2);
        }
    }

    @Override // com.umeng.analytics.pro.r
    public void a() {
        MLog.d("App resume from background");
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15109", 0, "\\|");
        } else if (f8847a) {
            this.f8849c.b();
        }
    }

    @Override // com.umeng.analytics.pro.r
    public void b() {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15110", 0, "\\|");
        } else if (f8847a) {
            this.f8849c.a();
        }
    }

    void a(double d2, String str, double d3, int i, String str2) {
        if (this.A == null) {
            MLog.e("UMGameAgent.init(Context) should be called before any game api");
            return;
        }
        if (AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue() || AnalyticsConfig.getVerticalType(this.A) == MobclickAgent.EScenarioType.E_UM_NORMAL.toValue()) {
            MLog.e("UMGameAgent class is UMGameAgent API, can't be use in no-game scenario. ");
            UMConfigure.umDebugLog.aq("A_15105", 0, "\\|");
            return;
        }
        if (d2 < 0.0d || d3 < 0.0d) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str) && str.length() > 0 && str.length() <= 3) {
            hashMap.put("curtype", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                int length = str2.getBytes("UTF-8").length;
                if (length > 0 && length <= 1024) {
                    hashMap.put("orderid", str2);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        hashMap.put("cash", Long.valueOf((long) (d2 * 100.0d)));
        hashMap.put("coin", Long.valueOf((long) (d3 * 100.0d)));
        hashMap.put("source", Integer.valueOf(i));
        if (this.f8849c.f8840b != null) {
            hashMap.put(TapjoyConstants.TJC_USER_LEVEL, this.f8849c.f8840b);
        }
        if (this.f8849c.f8839a != null) {
            hashMap.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, this.f8849c.f8839a);
        }
        this.f8848b.a(this.A, "pay", hashMap);
    }
}
