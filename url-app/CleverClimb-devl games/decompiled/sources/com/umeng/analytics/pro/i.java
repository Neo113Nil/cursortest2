package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.statistics.noise.ImLatent;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CoreProtocolImpl.java */
/* loaded from: classes2.dex */
public class i {
    private static boolean A = false;
    private static final String B = "n_sess_dp";
    private static final String C = "n_sess_dp_type";

    /* renamed from: a, reason: collision with root package name */
    private static Context f8920a = null;
    private static final String q = "first_activate_time";
    private static final String r = "ana_is_f";
    private static final String s = "thtstart";
    private static final String t = "dstk_last_time";
    private static final String u = "dstk_cnt";
    private static final String v = "gkvc";
    private static final String w = "ekvc";
    private static final String y = "-1";
    private static boolean z;

    /* renamed from: b, reason: collision with root package name */
    private ABTest f8921b;

    /* renamed from: c, reason: collision with root package name */
    private ImLatent f8922c;

    /* renamed from: d, reason: collision with root package name */
    private c f8923d;
    private SharedPreferences e;
    private String f;
    private String g;
    private String h;
    private String i;
    private long j;
    private int k;
    private JSONArray l;
    private final int m;
    private int n;
    private int o;
    private long p;
    private final long x;

    /* compiled from: CoreProtocolImpl.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8924a = 4097;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8925b = 4098;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8926c = 4099;

        /* renamed from: d, reason: collision with root package name */
        public static final int f8927d = 4100;
        public static final int e = 4101;
        public static final int f = 4102;
        public static final int g = 4103;
        public static final int h = 4104;
        public static final int i = 4105;
        public static final int j = 4106;
        public static final int k = 8193;
        public static final int l = 8194;
        public static final int m = 8195;
        public static final int n = 8196;
        public static final int o = 8197;
        public static final int p = 8198;
        public static final int q = 8199;
        public static final int r = 8200;
        public static final int s = 8201;
        public static final int t = 8202;
    }

    private i() {
        this.f8921b = null;
        this.f8922c = null;
        this.f8923d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = 0L;
        this.k = 10;
        this.l = new JSONArray();
        this.m = 5000;
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.x = 28800000L;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8920a);
            this.p = sharedPreferences.getLong(s, 0L);
            this.n = sharedPreferences.getInt(v, 0);
            this.o = sharedPreferences.getInt(w, 0);
            this.f8923d = new c();
            this.f8921b = ABTest.getService(f8920a);
            this.f8922c = ImLatent.getService(f8920a, StatTracer.getInstance(f8920a));
        } catch (Throwable unused) {
        }
    }

    /* compiled from: CoreProtocolImpl.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final i f8928a = new i();

        private b() {
        }
    }

    public static i a(Context context) {
        if (f8920a == null && context != null) {
            f8920a = context.getApplicationContext();
        }
        return b.f8928a;
    }

    public void a(Object obj, int i) {
        try {
            switch (i) {
                case 4097:
                    if (obj != null) {
                        d(obj);
                    }
                    if (!y.equals(((JSONObject) obj).optString("__i"))) {
                        a(false);
                        break;
                    }
                    break;
                case 4098:
                    if (obj != null) {
                        d(obj);
                    }
                    if (!y.equals(((JSONObject) obj).optString("__i"))) {
                        a(false);
                        break;
                    }
                    break;
                case 4099:
                    p.a(f8920a);
                    break;
                case a.f8927d /* 4100 */:
                    h.a(f8920a);
                    break;
                case a.e /* 4101 */:
                    e(obj);
                    break;
                case a.f /* 4102 */:
                    q();
                    break;
                case a.g /* 4103 */:
                    o.a().a(f8920a, obj);
                    break;
                case a.h /* 4104 */:
                    o.a().b(f8920a, obj);
                    break;
                case a.i /* 4105 */:
                    a();
                    break;
                case a.j /* 4106 */:
                    f(obj);
                    break;
                default:
                    switch (i) {
                        case a.k /* 8193 */:
                            a(obj, 1, false);
                            break;
                        case 8194:
                            m.a(f8920a).a(obj);
                            break;
                        case a.m /* 8195 */:
                            com.umeng.analytics.b.a().a(obj);
                            break;
                        case a.n /* 8196 */:
                            com.umeng.analytics.b.a().k();
                            break;
                        case a.o /* 8197 */:
                            com.umeng.analytics.b.a().i();
                            break;
                        case a.p /* 8198 */:
                            if (!TextUtils.isEmpty(o.a().c())) {
                                g();
                                break;
                            }
                            break;
                        case a.q /* 8199 */:
                        case a.r /* 8200 */:
                            com.umeng.analytics.b.a().b(obj);
                            break;
                        case a.s /* 8201 */:
                            com.umeng.analytics.b.a().b((Object) null);
                            break;
                        case a.t /* 8202 */:
                            f();
                            break;
                    }
            }
        } catch (Throwable unused) {
        }
    }

    private void f() {
        try {
            Class.forName("com.umeng.analytics.vismode.event.VisualHelper").getMethod("loadNativeData", Context.class).invoke(null, f8920a);
        } catch (Exception unused) {
        }
    }

    private void g() {
        try {
            Class.forName("com.umeng.analytics.vismode.event.VisualHelper").getMethod("processCommond", Context.class, String.class).invoke(null, f8920a, AnalyticsConfig.getAppkey(f8920a));
        } catch (Exception unused) {
        }
    }

    public void a(Object obj, int i, boolean z2) {
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0) {
                return;
            }
            String optString = jSONObject.optString("__ii");
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8920a);
            if (i == 0) {
                long j = sharedPreferences.getLong(t, 0L);
                int i2 = sharedPreferences.getInt(u, 0);
                if (!a(j, i2)) {
                    return;
                } else {
                    sharedPreferences.edit().putLong(t, System.currentTimeMillis()).putInt(u, i2 == 5000 ? 0 : i2 + 1).commit();
                }
            }
            String string = sharedPreferences.getString(B, "");
            if (TextUtils.isEmpty(string)) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(string);
            }
            JSONObject j2 = com.umeng.analytics.b.a().j();
            if (y.equals(optString)) {
                jSONObject.put(C, i);
                if (!jSONObject.has(com.umeng.analytics.pro.b.ab) && j2.length() > 0) {
                    jSONObject.put(com.umeng.analytics.pro.b.ab, j2);
                }
                jSONArray.put(jSONObject);
                sharedPreferences.edit().putString(B, jSONArray.toString()).commit();
                return;
            }
            if (i != 3 && jSONArray.length() > 0) {
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    if (jSONObject2 != null && jSONObject2.length() > 0) {
                        int i4 = jSONObject2.getInt(C);
                        if (!jSONObject2.has(com.umeng.analytics.pro.b.ab) && j2.length() > 0) {
                            jSONObject2.put(com.umeng.analytics.pro.b.ab, j2);
                        }
                        switch (i4) {
                            case 0:
                                jSONObject2.put("_$!ts", System.currentTimeMillis());
                                break;
                            case 1:
                                jSONObject2.put("_$!ts", System.currentTimeMillis());
                                break;
                        }
                        jSONObject2.put("__ii", optString);
                        jSONObject2.remove(C);
                        g.a(f8920a).a(jSONObject2, i4);
                    }
                }
                com.umeng.analytics.b.a().c();
                sharedPreferences.edit().remove(B).commit();
            }
            g.a(f8920a).a(jSONObject, i);
            if (z2) {
                c(true);
                return;
            }
            if (UMEnvelopeBuild.isReadyBuild(f8920a, UMLogDataProtocol.UMBusinessType.U_DPLUS)) {
                Defcon service = Defcon.getService(f8920a);
                if (service.isOpen()) {
                    if (new ReportPolicy.DefconPolicy(StatTracer.getInstance(f8920a), service).shouldSendMessage(false)) {
                        c(true);
                        return;
                    }
                    return;
                }
                c(true);
            }
        } catch (Throwable unused) {
        }
    }

    public void a(boolean z2) {
        if (e(z2) && UMEnvelopeBuild.isReadyBuild(f8920a, UMLogDataProtocol.UMBusinessType.U_APP)) {
            c(false);
        }
    }

    private void c(boolean z2) {
        JSONObject buildEnvelopeWithExtHeader;
        JSONObject jSONObject = new JSONObject();
        if (z2) {
            if (AnalyticsConfig.FLAG_DPLUS) {
                jSONObject = b(UMEnvelopeBuild.maxDataSpace(f8920a));
            }
        } else {
            jSONObject = a(UMEnvelopeBuild.maxDataSpace(f8920a));
        }
        if (jSONObject == null || jSONObject.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
        JSONObject jSONObject3 = (JSONObject) jSONObject.opt("content");
        if (f8920a == null || jSONObject2 == null || jSONObject3 == null || (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f8920a, jSONObject2, jSONObject3)) == null) {
            return;
        }
        try {
            if (buildEnvelopeWithExtHeader.has(com.umeng.analytics.pro.b.ao)) {
                UMRTLog.i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt(com.umeng.analytics.pro.b.ao));
            }
        } catch (Throwable unused) {
        }
        b(buildEnvelopeWithExtHeader);
        a((Object) buildEnvelopeWithExtHeader);
    }

    public JSONObject a(long j) {
        if (TextUtils.isEmpty(o.a().c(f8920a))) {
            return null;
        }
        JSONObject b2 = b(false);
        int a2 = l.a().a(f8920a);
        if (b2.length() <= 0) {
            return null;
        }
        if (b2.length() == 1) {
            if (b2.optJSONObject(com.umeng.analytics.pro.b.G) != null && a2 != 3) {
                return null;
            }
            if (!TextUtils.isEmpty(b2.optString("userlevel")) && a2 != 3) {
                return null;
            }
        } else if (b2.length() == 2 && b2.optJSONObject(com.umeng.analytics.pro.b.G) != null && !TextUtils.isEmpty(b2.optString("userlevel")) && a2 != 3) {
            return null;
        }
        JSONObject d2 = d(false);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (a2 == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (b2 != null && b2.length() > 0) {
                jSONObject2.put("analytics", b2);
            }
            if (d2 != null && d2.length() > 0) {
                jSONObject.put("header", d2);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return a(jSONObject, j);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    public JSONObject b(long j) {
        if (!AnalyticsConfig.FLAG_DPLUS || TextUtils.isEmpty(o.a().c(f8920a))) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (AnalyticsConfig.FLAG_DPLUS) {
            jSONObject = g.a(f8920a).c();
            l.a().a(jSONObject, f8920a);
            Defcon service = Defcon.getService(f8920a);
            if (service.isOpen() && !new ReportPolicy.DefconPolicy(StatTracer.getInstance(f8920a), service).shouldSendMessage(false)) {
                jSONObject = new JSONObject();
            }
        }
        if (jSONObject.length() <= 0) {
            return null;
        }
        JSONObject d2 = d(true);
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObject3.put("dplus", jSONObject);
            }
            if (d2 != null && d2.length() > 0) {
                jSONObject2.put("header", d2);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return a(jSONObject2, j);
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    private JSONObject a(JSONObject jSONObject, long j) {
        try {
            if (k.a(jSONObject) <= j) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(com.umeng.analytics.pro.b.an, k.a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return k.a(f8920a, j, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private JSONObject d(boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && AnalyticsConfig.mWrapperVersion != null) {
                jSONObject.put("wrapper_version", AnalyticsConfig.mWrapperVersion);
                jSONObject.put("wrapper_type", AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f8920a);
            if (verticalType == MobclickAgent.EScenarioType.E_DUM_NORMAL.toValue()) {
                AnalyticsConfig.FLAG_DPLUS = true;
                verticalType = MobclickAgent.EScenarioType.E_UM_NORMAL.toValue();
            } else if (verticalType == MobclickAgent.EScenarioType.E_DUM_GAME.toValue()) {
                AnalyticsConfig.FLAG_DPLUS = true;
                verticalType = MobclickAgent.EScenarioType.E_UM_GAME.toValue();
            } else {
                AnalyticsConfig.FLAG_DPLUS = false;
            }
            jSONObject.put(com.umeng.analytics.pro.b.i, verticalType);
            jSONObject.put("sdk_version", q.f8958a);
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f8920a));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put("secret", MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f8920a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8920a);
            if (z2) {
                jSONObject.put(com.umeng.analytics.pro.b.l, j());
                jSONObject.put(com.umeng.analytics.pro.b.m, k());
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("dp_vers_name", "");
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put("app_version", string);
                        jSONObject.put("version_code", sharedPreferences.getInt("dp_vers_code", 0));
                        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                        if (TextUtils.isEmpty(imprintProperty)) {
                            jSONObject.put(com.umeng.analytics.pro.b.l, sharedPreferences.getString("dp_vers_pre_version", "0"));
                            jSONObject.put(com.umeng.analytics.pro.b.m, sharedPreferences.getString("dp_vers_date", format));
                        }
                        sharedPreferences.edit().putString("dp_pre_version", string).putString("dp_cur_version", DeviceConfig.getAppVersionName(f8920a)).putString("dp_pre_date", format).remove("dp_vers_name").remove("dp_vers_code").remove("dp_vers_date").remove("dp_vers_pre_version").commit();
                    }
                }
            } else {
                jSONObject.put(com.umeng.analytics.pro.b.l, h());
                jSONObject.put(com.umeng.analytics.pro.b.m, i());
                if (sharedPreferences != null) {
                    String string2 = sharedPreferences.getString("vers_name", "");
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject.put("app_version", string2);
                        jSONObject.put("version_code", sharedPreferences.getInt("vers_code", 0));
                        String format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                        if (TextUtils.isEmpty(imprintProperty)) {
                            jSONObject.put(com.umeng.analytics.pro.b.l, sharedPreferences.getString("vers_pre_version", "0"));
                            jSONObject.put(com.umeng.analytics.pro.b.m, sharedPreferences.getString("vers_date", format2));
                        }
                        sharedPreferences.edit().putString("pre_version", string2).putString("cur_version", DeviceConfig.getAppVersionName(f8920a)).putString("pre_date", format2).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public JSONObject b(boolean z2) {
        JSONObject jSONObject = null;
        try {
            JSONObject a2 = g.a(f8920a).a(z2);
            if (a2 == null) {
                try {
                    jSONObject = new JSONObject();
                } catch (Throwable unused) {
                    return a2;
                }
            } else {
                jSONObject = a2;
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8920a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("userlevel", string);
                }
            }
            if (p()) {
                this.j = c();
                if (this.j != 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("ts", this.j);
                    jSONObject.put(com.umeng.analytics.pro.b.D, jSONObject2);
                    sharedPreferences.edit().putLong(r, 0L).commit();
                }
            }
            String[] a3 = com.umeng.analytics.c.a(f8920a);
            if (a3 != null && !TextUtils.isEmpty(a3[0]) && !TextUtils.isEmpty(a3[1])) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(com.umeng.analytics.pro.b.H, a3[0]);
                jSONObject3.put(com.umeng.analytics.pro.b.I, a3[1]);
                if (jSONObject3.length() > 0) {
                    jSONObject.put(com.umeng.analytics.pro.b.G, jSONObject3);
                }
            }
            if (ABTest.getService(f8920a).isInTest()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(ABTest.getService(f8920a).getTestName(), ABTest.getService(f8920a).getGroupInfo());
                jSONObject.put(com.umeng.analytics.pro.b.F, jSONObject4);
            }
            l.a().b(jSONObject, f8920a);
            if (jSONObject.length() <= 0) {
                return jSONObject;
            }
            new JSONObject().put("analytics", jSONObject);
            return jSONObject;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    private String h() {
        String imprintProperty;
        String str = null;
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(f8920a, "pr_ve", null);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(imprintProperty)) {
            if (!TextUtils.isEmpty(this.f)) {
                return this.f;
            }
            if (this.e == null) {
                this.e = PreferenceWrapper.getDefault(f8920a);
            }
            str = this.e.getString("pre_version", "");
            String appVersionName = DeviceConfig.getAppVersionName(f8920a);
            if (TextUtils.isEmpty(str)) {
                this.e.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
                str = "0";
            } else {
                String string = this.e.getString("cur_version", "");
                if (!appVersionName.equals(string)) {
                    this.e.edit().putString("pre_version", string).putString("cur_version", appVersionName).commit();
                    str = string;
                }
            }
            this.f = str;
            return str;
        }
        str = imprintProperty;
        this.f = str;
        return str;
    }

    private String i() {
        String imprintProperty;
        String str = null;
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(f8920a, "ud_da", null);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(imprintProperty)) {
            if (!TextUtils.isEmpty(this.g)) {
                return this.g;
            }
            if (this.e == null) {
                this.e = PreferenceWrapper.getDefault(f8920a);
            }
            str = this.e.getString("pre_date", "");
            if (TextUtils.isEmpty(str)) {
                str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                this.e.edit().putString("pre_date", str).commit();
            } else {
                String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                if (!str.equals(format)) {
                    this.e.edit().putString("pre_date", format).commit();
                    str = format;
                }
            }
            this.g = str;
            return str;
        }
        str = imprintProperty;
        this.g = str;
        return str;
    }

    private String j() {
        String imprintProperty;
        String str = null;
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(f8920a, "pr_ve", null);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(imprintProperty)) {
            if (!TextUtils.isEmpty(this.h)) {
                return this.h;
            }
            if (this.e == null) {
                this.e = PreferenceWrapper.getDefault(f8920a);
            }
            str = this.e.getString("dp_pre_version", "");
            String appVersionName = DeviceConfig.getAppVersionName(f8920a);
            if (TextUtils.isEmpty(str)) {
                this.e.edit().putString("dp_pre_version", "0").putString("dp_cur_version", appVersionName).commit();
                str = "0";
            } else {
                String string = this.e.getString("dp_cur_version", "");
                if (!appVersionName.equals(string)) {
                    this.e.edit().putString("dp_pre_version", string).putString("dp_cur_version", appVersionName).commit();
                    str = string;
                }
            }
            this.h = str;
            return str;
        }
        str = imprintProperty;
        this.h = str;
        return str;
    }

    private String k() {
        String imprintProperty;
        String str = null;
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(f8920a, "ud_da", null);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(imprintProperty)) {
            if (!TextUtils.isEmpty(this.i)) {
                return this.i;
            }
            if (this.e == null) {
                this.e = PreferenceWrapper.getDefault(f8920a);
            }
            str = this.e.getString("dp_pre_date", "");
            if (TextUtils.isEmpty(str)) {
                str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                this.e.edit().putString("dp_pre_date", str).commit();
            } else {
                String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                if (!str.equals(format)) {
                    this.e.edit().putString("dp_pre_date", format).commit();
                    str = format;
                }
            }
            this.i = str;
            return str;
        }
        str = imprintProperty;
        this.i = str;
        return str;
    }

    public void a() {
        try {
            if (this.l.length() > 0) {
                g.a(f8920a).a(this.l);
                this.l = new JSONArray();
            }
            PreferenceWrapper.getDefault(f8920a).edit().putLong(s, this.p).putInt(v, this.n).putInt(w, this.o).commit();
        } catch (Throwable unused) {
        }
    }

    /* compiled from: CoreProtocolImpl.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, Object> f8933a;

        /* renamed from: b, reason: collision with root package name */
        private String f8934b;

        /* renamed from: c, reason: collision with root package name */
        private String f8935c;

        /* renamed from: d, reason: collision with root package name */
        private long f8936d;

        private d() {
            this.f8933a = null;
            this.f8934b = null;
            this.f8935c = null;
            this.f8936d = 0L;
        }

        public d(String str, Map<String, Object> map, String str2, long j) {
            this.f8933a = null;
            this.f8934b = null;
            this.f8935c = null;
            this.f8936d = 0L;
            this.f8933a = map;
            this.f8934b = str;
            this.f8936d = j;
            this.f8935c = str2;
        }

        public Map<String, Object> a() {
            return this.f8933a;
        }

        public String b() {
            return this.f8935c;
        }

        public String c() {
            return this.f8934b;
        }

        public long d() {
            return this.f8936d;
        }
    }

    private void d(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!a(this.p, this.n)) {
                    return;
                } else {
                    this.n++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!a(this.p, this.o)) {
                    return;
                } else {
                    this.o++;
                }
            }
            if (this.l.length() >= this.k) {
                g.a(f8920a).a(this.l);
                this.l = new JSONArray();
            }
            if (this.p == 0) {
                this.p = System.currentTimeMillis();
            }
            this.l.put(jSONObject);
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    private boolean a(long j, int i) {
        if (j == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j <= 28800000) {
            return i < 5000;
        }
        l();
        return true;
    }

    private void l() {
        try {
            this.n = 0;
            this.o = 0;
            this.p = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f8920a).edit().putLong(t, System.currentTimeMillis()).putInt(u, 0).commit();
        } catch (Throwable unused) {
        }
    }

    private boolean e(boolean z2) {
        if (p()) {
            return true;
        }
        if (this.f8923d == null) {
            this.f8923d = new c();
        }
        this.f8923d.a();
        ReportPolicy.ReportStrategy c2 = this.f8923d.c();
        boolean shouldSendMessage = c2.shouldSendMessage(z2);
        if (shouldSendMessage && (((c2 instanceof ReportPolicy.ReportByInterval) || (c2 instanceof ReportPolicy.DebugPolicy)) && m())) {
            a();
        }
        return shouldSendMessage;
    }

    private boolean m() {
        try {
            if (!TextUtils.isEmpty(o.a().c())) {
                b(f8920a);
            }
            if (this.l.length() <= 0) {
                return false;
            }
            for (int i = 0; i < this.l.length(); i++) {
                JSONObject optJSONObject = this.l.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    String optString = optJSONObject.optString("__i");
                    if (TextUtils.isEmpty(optString) || y.equals(optString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* compiled from: CoreProtocolImpl.java */
    public class c {

        /* renamed from: b, reason: collision with root package name */
        private ReportPolicy.ReportStrategy f8930b = null;

        /* renamed from: c, reason: collision with root package name */
        private int f8931c = -1;

        /* renamed from: d, reason: collision with root package name */
        private int f8932d = -1;
        private int e = -1;
        private int f = -1;

        public c() {
        }

        public void a() {
            try {
                int[] a2 = a(-1, -1);
                this.f8931c = a2[0];
                this.f8932d = a2[1];
            } catch (Throwable unused) {
            }
        }

        public int[] a(int i, int i2) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(i.f8920a, "report_policy", i.y)).intValue();
            int intValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(i.f8920a, "report_interval", i.y)).intValue();
            if (intValue == -1 || !ReportPolicy.isValid(intValue)) {
                return new int[]{i, i2};
            }
            int i3 = 90;
            if (intValue2 != -1 && intValue2 >= 90 && intValue2 <= 86400) {
                i3 = intValue2;
            }
            return new int[]{intValue, i3 * 1000};
        }

        public int a(int i) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(i.f8920a, "test_report_interval", i.y)).intValue();
            return (intValue == -1 || intValue < 90 || intValue > 86400) ? i : intValue * 1000;
        }

        protected void b() {
            int i;
            ReportPolicy.ReportStrategy defconPolicy;
            Defcon service = Defcon.getService(i.f8920a);
            if (!service.isOpen()) {
                boolean z = Integer.valueOf(UMEnvelopeBuild.imprintProperty(i.f8920a, "integrated_test", i.y)).intValue() == 1;
                if (UMConfigure.isDebugLog() && z && !MLog.DEBUG) {
                    UMConfigure.umDebugLog.mutlInfo("A_10112", 3, "\\|", null, null);
                }
                if (!MLog.DEBUG || !z) {
                    if (i.this.f8921b.isInTest() && "RPT".equals(i.this.f8921b.getTestName())) {
                        if (i.this.f8921b.getTestPolicy() == 6) {
                            if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(i.f8920a, "test_report_interval", i.y)).intValue() != -1) {
                                i = a(90000);
                            } else if (this.f8932d > 0) {
                                i = this.f8932d;
                            } else {
                                i = this.f;
                            }
                        } else {
                            i = 0;
                        }
                        this.f8930b = b(i.this.f8921b.getTestPolicy(), i);
                    } else {
                        int i2 = this.e;
                        int i3 = this.f;
                        if (this.f8931c != -1) {
                            i2 = this.f8931c;
                            i3 = this.f8932d;
                        }
                        this.f8930b = b(i2, i3);
                    }
                } else {
                    this.f8930b = new ReportPolicy.DebugPolicy(StatTracer.getInstance(i.f8920a));
                }
            } else {
                if (!((this.f8930b instanceof ReportPolicy.DefconPolicy) && this.f8930b.isValid())) {
                    defconPolicy = new ReportPolicy.DefconPolicy(StatTracer.getInstance(i.f8920a), service);
                } else {
                    defconPolicy = this.f8930b;
                }
                this.f8930b = defconPolicy;
            }
            MLog.d("Report policy : " + this.f8930b.getClass().getSimpleName());
            UMRTLog.i(UMRTLog.RTLOG_TAG, "Report policy : " + this.f8930b.getClass().getSimpleName());
            if (UMConfigure.isDebugLog()) {
                try {
                    if (this.f8930b instanceof ReportPolicy.ReportAtLaunch) {
                        UMConfigure.umDebugLog.mutlInfo("A_10110", 3, "", null, null);
                    } else if (this.f8930b instanceof ReportPolicy.ReportByInterval) {
                        UMConfigure.umDebugLog.mutlInfo("A_10111", 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) this.f8930b).getReportInterval() / 1000)});
                    } else if (this.f8930b instanceof ReportPolicy.DebugPolicy) {
                        UMConfigure.umDebugLog.mutlInfo("A_10113", 3, "", null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public ReportPolicy.ReportStrategy c() {
            b();
            return this.f8930b;
        }

        private ReportPolicy.ReportStrategy b(int i, int i2) {
            switch (i) {
                case 0:
                    return this.f8930b instanceof ReportPolicy.ReportRealtime ? this.f8930b : new ReportPolicy.ReportRealtime();
                case 1:
                    return this.f8930b instanceof ReportPolicy.ReportAtLaunch ? this.f8930b : new ReportPolicy.ReportAtLaunch();
                case 2:
                case 3:
                case 7:
                default:
                    return this.f8930b instanceof ReportPolicy.ReportAtLaunch ? this.f8930b : new ReportPolicy.ReportAtLaunch();
                case 4:
                    return this.f8930b instanceof ReportPolicy.ReportDaily ? this.f8930b : new ReportPolicy.ReportDaily(StatTracer.getInstance(i.f8920a));
                case 5:
                    return this.f8930b instanceof ReportPolicy.ReportWifiOnly ? this.f8930b : new ReportPolicy.ReportWifiOnly(i.f8920a);
                case 6:
                    if (this.f8930b instanceof ReportPolicy.ReportByInterval) {
                        ReportPolicy.ReportStrategy reportStrategy = this.f8930b;
                        ((ReportPolicy.ReportByInterval) reportStrategy).setReportInterval(i2);
                        return reportStrategy;
                    }
                    return new ReportPolicy.ReportByInterval(StatTracer.getInstance(i.f8920a), i2);
                case 8:
                    return this.f8930b instanceof ReportPolicy.SmartPolicy ? this.f8930b : new ReportPolicy.SmartPolicy(StatTracer.getInstance(i.f8920a));
            }
        }
    }

    private void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                if (jSONObject4.has(com.umeng.analytics.pro.b.N)) {
                    jSONObject3.put(com.umeng.analytics.pro.b.N, jSONObject4.getJSONArray(com.umeng.analytics.pro.b.N));
                }
                if (jSONObject4.has(com.umeng.analytics.pro.b.O)) {
                    jSONObject3.put(com.umeng.analytics.pro.b.O, jSONObject4.getJSONArray(com.umeng.analytics.pro.b.O));
                }
                if (jSONObject4.has("error")) {
                    jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                }
                if (jSONObject4.has(com.umeng.analytics.pro.b.n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(com.umeng.analytics.pro.b.n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(com.umeng.analytics.pro.b.t)) {
                                jSONObject5.remove(com.umeng.analytics.pro.b.t);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(com.umeng.analytics.pro.b.n, jSONArray2);
                }
                if (jSONObject4.has(com.umeng.analytics.pro.b.D)) {
                    jSONObject3.put(com.umeng.analytics.pro.b.D, jSONObject4.getJSONObject(com.umeng.analytics.pro.b.D));
                }
                if (jSONObject4.has(com.umeng.analytics.pro.b.G)) {
                    jSONObject3.put(com.umeng.analytics.pro.b.G, jSONObject4.getJSONObject(com.umeng.analytics.pro.b.G));
                }
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has("sdk_version")) {
                    jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                }
                if (jSONObject2.has("device_id")) {
                    jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                }
                if (jSONObject2.has("device_model")) {
                    jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                }
                if (jSONObject2.has("version_code")) {
                    jSONObject3.put("version", jSONObject2.getInt("version_code"));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
            }
            if (jSONObject3.length() > 0) {
                MLog.d("constructMessage:" + jSONObject3.toString());
                UMRTLog.i(UMRTLog.RTLOG_TAG, "constructMessage: " + jSONObject3.toString());
            }
        } catch (Throwable th) {
            MLog.e(th);
        }
    }

    public void a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has(com.umeng.analytics.pro.b.ao)) {
                        if (101 != jSONObject.getInt(com.umeng.analytics.pro.b.ao)) {
                            c(jSONObject);
                        }
                    } else {
                        c(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            if (jSONObject.getJSONObject("header").has(com.umeng.analytics.pro.b.an)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("analytics");
                    if (jSONObject2.has(com.umeng.analytics.pro.b.n)) {
                        JSONObject jSONObject3 = jSONObject2.getJSONArray(com.umeng.analytics.pro.b.n).getJSONObject(0);
                        if (jSONObject3 != null) {
                            g.a(f8920a).a(true, jSONObject3.getString("id"));
                        }
                    } else {
                        g.a(f8920a).g();
                    }
                } else if (jSONObject.has("dplus")) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject("dplus");
                    if (jSONObject4.has("events")) {
                        g.a(f8920a).b(0);
                    }
                    if (jSONObject4.has(com.umeng.analytics.pro.b.ac)) {
                        g.a(f8920a).b(4);
                    }
                    if (jSONObject4.has(com.umeng.analytics.pro.b.ah)) {
                        g.a(f8920a).b(1);
                    }
                }
                g.a(f8920a).a();
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics") && (optJSONObject = jSONObject.optJSONObject("analytics")) != null && optJSONObject.length() > 0) {
                if (optJSONObject.has(com.umeng.analytics.pro.b.n)) {
                    g.a(f8920a).a(true, false);
                }
                if (optJSONObject.has(com.umeng.analytics.pro.b.N) || optJSONObject.has(com.umeng.analytics.pro.b.O)) {
                    g.a(f8920a).d();
                }
                if (optJSONObject.has("error")) {
                    g.a(f8920a).e();
                }
            }
            if (jSONObject.has("dplus")) {
                g.a(f8920a).f();
            }
            g.a(f8920a).a();
        } catch (Exception unused) {
        }
    }

    public void b(Object obj) {
        Iterator<String> keys;
        z = true;
        b(f8920a);
        a();
        c(false);
        if (AnalyticsConfig.FLAG_DPLUS) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject h = com.umeng.analytics.b.a().h(f8920a);
            if (h != null && h.length() > 0 && (keys = h.keys()) != null) {
                while (keys.hasNext()) {
                    try {
                        String obj2 = keys.next().toString();
                        if (!Arrays.asList(com.umeng.analytics.pro.b.au).contains(obj2)) {
                            jSONObject.put(obj2, h.get(obj2));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            a(jSONObject, 2, false);
        }
    }

    public void b(Context context) {
        try {
            g.a(context).b();
            n();
        } catch (Throwable unused) {
        }
    }

    public void b() {
        z = true;
        c(false);
    }

    public void c(Object obj) {
        Iterator<String> keys;
        o();
        A = true;
        h();
        i();
        j();
        k();
        a(true);
        if (AnalyticsConfig.FLAG_DPLUS) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject h = com.umeng.analytics.b.a().h(f8920a);
            if (h != null && h.length() > 0 && (keys = h.keys()) != null) {
                while (keys.hasNext()) {
                    try {
                        String obj2 = keys.next().toString();
                        if (!Arrays.asList(com.umeng.analytics.pro.b.au).contains(obj2)) {
                            jSONObject.put(obj2, h.get(obj2));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            a(jSONObject, 2, false);
        }
    }

    private void n() {
        if (this.l.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.l.length(); i++) {
                try {
                    JSONObject jSONObject = this.l.getJSONObject(i);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String optString = jSONObject.optString("__i");
                        if (TextUtils.isEmpty(optString) || y.equals(optString)) {
                            String c2 = o.a().c();
                            if (TextUtils.isEmpty(c2)) {
                                c2 = y;
                            }
                            jSONObject.put("__i", c2);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.l = jSONArray;
        }
    }

    private void o() {
        SharedPreferences sharedPreferences;
        try {
            if (!p() || f8920a == null || (sharedPreferences = PreferenceWrapper.getDefault(f8920a)) == null || sharedPreferences.getLong(q, 0L) != 0) {
                return;
            }
            sharedPreferences.edit().putLong(q, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    public long c() {
        SharedPreferences sharedPreferences;
        long j = 0;
        try {
            if (f8920a == null || (sharedPreferences = PreferenceWrapper.getDefault(f8920a)) == null) {
                return 0L;
            }
            long j2 = sharedPreferences.getLong(q, 0L);
            if (j2 == 0) {
                try {
                    j = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(q, j).commit();
                    return j;
                } catch (Throwable unused) {
                }
            }
            return j2;
        } catch (Throwable unused2) {
            return j;
        }
    }

    private boolean p() {
        SharedPreferences sharedPreferences;
        try {
            if (f8920a == null || (sharedPreferences = PreferenceWrapper.getDefault(f8920a)) == null) {
                return false;
            }
            return sharedPreferences.getLong(r, -1L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void q() {
        try {
            b(f8920a);
            a();
            String[] a2 = com.umeng.analytics.c.a(f8920a);
            if (a2 == null || TextUtils.isEmpty(a2[0]) || TextUtils.isEmpty(a2[1])) {
                return;
            }
            boolean a3 = o.a().a(f8920a, System.currentTimeMillis());
            com.umeng.analytics.c.b(f8920a);
            if (a3) {
                o.a().b(f8920a, System.currentTimeMillis());
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    private void e(Object obj) {
        try {
            b(f8920a);
            a();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(com.umeng.analytics.pro.b.H);
                String string2 = jSONObject.getString("uid");
                String[] a2 = com.umeng.analytics.c.a(f8920a);
                if (a2 != null && string.equals(a2[0]) && string2.equals(a2[1])) {
                    return;
                }
                boolean a3 = o.a().a(f8920a, System.currentTimeMillis());
                com.umeng.analytics.c.a(f8920a, string, string2);
                if (a3) {
                    o.a().b(f8920a, System.currentTimeMillis());
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String optString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            g.a(f8920a).a(optString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    public void d() {
        JSONArray jSONArray;
        try {
            String c2 = o.a().c();
            if (TextUtils.isEmpty(c2)) {
                return;
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8920a);
            String string = sharedPreferences.getString(B, "");
            if (TextUtils.isEmpty(string)) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(string);
            }
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        int i2 = jSONObject.getInt(C);
                        switch (i2) {
                            case 0:
                                jSONObject.put("_$!ts", System.currentTimeMillis());
                                break;
                            case 1:
                                jSONObject.put("_$!ts", System.currentTimeMillis());
                                break;
                        }
                        jSONObject.put("__ii", c2);
                        jSONObject.remove(C);
                        g.a(f8920a).a(jSONObject, i2);
                    }
                }
                sharedPreferences.edit().remove(B).commit();
                if (UMEnvelopeBuild.isReadyBuild(f8920a, UMLogDataProtocol.UMBusinessType.U_DPLUS)) {
                    c(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void a(JSONObject jSONObject) {
        JSONObject d2;
        try {
            if (!UMEnvelopeBuild.isReadyBuild(f8920a, UMLogDataProtocol.UMBusinessType.U_DPLUS) || jSONObject == null || (d2 = d(true)) == null || d2.length() <= 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(com.umeng.analytics.pro.b.ac, jSONArray);
            jSONObject2.put("dplus", jSONObject3);
            if (f8920a == null || d2 == null) {
                return;
            }
            UMEnvelopeBuild.buildEnvelopeWithExtHeader(f8920a, d2, jSONObject2);
        } catch (Throwable unused) {
        }
    }
}
