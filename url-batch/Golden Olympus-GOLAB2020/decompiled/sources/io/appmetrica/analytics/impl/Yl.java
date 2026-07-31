package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Yl {

    /* renamed from: a, reason: collision with root package name */
    public final Sa f38572a;

    /* renamed from: b, reason: collision with root package name */
    public final C2932ra f38573b;

    /* renamed from: c, reason: collision with root package name */
    public final Si f38574c;

    /* renamed from: d, reason: collision with root package name */
    public final Ne f38575d;

    /* renamed from: e, reason: collision with root package name */
    public final Im f38576e;

    /* renamed from: f, reason: collision with root package name */
    public final C3028v2 f38577f;

    /* renamed from: g, reason: collision with root package name */
    public final C3 f38578g;

    /* renamed from: h, reason: collision with root package name */
    public final C2976t2 f38579h;

    /* renamed from: i, reason: collision with root package name */
    public final Cb f38580i;

    /* renamed from: j, reason: collision with root package name */
    public final Fm f38581j;

    /* renamed from: k, reason: collision with root package name */
    public final Hd f38582k;

    /* renamed from: l, reason: collision with root package name */
    public final Y9 f38583l;

    public Yl() {
        this(new Cb(), new Sa(), new C2932ra(), new Si(), new Ne(), new Im(), new C3(), new C3028v2(), new C2976t2(), new Fm(), new Hd(), new Y9());
    }

    public final void a(C2580dm c2580dm, Ab ab) {
        long j4;
        long j5;
        String str;
        ArrayList a4;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = ab.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c2580dm.f38865g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = ab.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c2580dm.f38868j = Gm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = ab.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c2580dm.f38871m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = ab.optJSONObject(CrashHianalyticsData.TIME);
        if (optJSONObject8 != null) {
            try {
                c2580dm.f38870l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C3074wm c3074wm = new C3074wm();
        JSONObject optJSONObject9 = ab.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c3074wm.f40099a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c3074wm.f40099a);
        }
        this.f38576e.getClass();
        c2580dm.f38874p = new Hm(c3074wm.f40099a);
        this.f38573b.getClass();
        C2970sm c2970sm = new C2970sm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = ab.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                E4 e4 = new E4();
                e4.f37400a = C2932ra.a(optJSONObject10, "permissions_collecting", c2970sm.f39812a);
                e4.f37401b = C2932ra.a(optJSONObject10, "features_collecting", c2970sm.f39813b);
                e4.f37402c = C2932ra.a(optJSONObject10, "google_aid", c2970sm.f39814c);
                e4.f37403d = C2932ra.a(optJSONObject10, "sim_info", c2970sm.f39815d);
                e4.f37404e = C2932ra.a(optJSONObject10, "huawei_oaid", c2970sm.f39816e);
                e4.f37405f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c2580dm.f38860b = new G4(e4);
            }
        } catch (Throwable unused4) {
        }
        this.f38572a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = ab.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject optJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c2580dm.f38862d = str;
                }
                ArrayList a5 = Sa.a(optJSONObject11, "report");
                if (!AbstractC2713io.a((Collection) a5)) {
                    c2580dm.f38863e = a5;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c2580dm.f38864f = str2;
                }
                ArrayList a6 = Sa.a(optJSONObject11, "startup");
                if (!AbstractC2713io.a((Collection) a6)) {
                    c2580dm.f38861c = a6;
                }
                ArrayList a7 = Sa.a(optJSONObject11, "diagnostic");
                if (!AbstractC2713io.a((Collection) a7)) {
                    c2580dm.f38872n = a7;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Sa.f38252a.contains(next2) && (a4 = Sa.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a4);
                    }
                }
                c2580dm.f38873o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f38574c.getClass();
        C3100xm c3100xm = new C3100xm();
        JSONObject optJSONObject12 = ab.optJSONObject("retry_policy");
        int i4 = c3100xm.f40234w;
        int i5 = c3100xm.f40235x;
        if (optJSONObject12 != null) {
            i4 = optJSONObject12.optInt("max_interval_seconds", i4);
            i5 = optJSONObject12.optInt("exponential_multiplier", c3100xm.f40235x);
        }
        c2580dm.f38875q = new RetryPolicyConfig(i4, i5);
        this.f38575d.getClass();
        if (c2580dm.f38860b.f37558a) {
            JSONObject optJSONObject13 = ab.optJSONObject("permissions_collecting");
            C3022um c3022um = new C3022um();
            if (optJSONObject13 != null) {
                j4 = optJSONObject13.optLong("check_interval_seconds", c3022um.f39948a);
                j5 = optJSONObject13.optLong("force_send_interval_seconds", c3022um.f39949b);
            } else {
                j4 = c3022um.f39948a;
                j5 = c3022um.f39949b;
            }
            c2580dm.f38869k = new Le(j4, j5);
        }
        C3002u2 c3002u2 = this.f38577f.f39956a;
        C2867om c2867om = new C2867om();
        JSONObject optJSONObject14 = ab.optJSONObject("auto_inapp_collecting");
        if (optJSONObject14 != null) {
            c2867om.f39590a = optJSONObject14.optInt("send_frequency_seconds", c2867om.f39590a);
            c2867om.f39591b = optJSONObject14.optInt("first_collecting_inapp_max_age_seconds", c2867om.f39591b);
        }
        c3002u2.getClass();
        c2580dm.f38876r = new BillingConfig(c2867om.f39590a, c2867om.f39591b);
        C3 c32 = this.f38578g;
        c32.getClass();
        C2893pm c2893pm = new C2893pm();
        JSONObject optJSONObject15 = ab.optJSONObject("cache_control");
        if (optJSONObject15 != null) {
            c2893pm.f39632a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject15, "last_known_location_ttl", c2893pm.f39632a);
        }
        c32.f37274a.getClass();
        c2580dm.f38877s = new C3133z3(c2893pm.f39632a);
        this.f38579h.getClass();
        C2976t2.a(c2580dm, ab);
        Fm fm = this.f38581j;
        fm.getClass();
        JSONObject optJSONObject16 = ab.optJSONObject("startup_update");
        C3048vm c3048vm = new C3048vm();
        Integer a8 = Bb.a(optJSONObject16, "interval_seconds", null);
        if (a8 != null) {
            c3048vm.f39987a = a8.intValue();
        }
        fm.f37544a.getClass();
        c2580dm.f38879u = new Dm(c3048vm.f39987a);
        Map<String, C2987td> c4 = this.f38582k.f37635a.c();
        Gd gd = new Gd(ab);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C2987td> entry : c4.entrySet()) {
            Object invoke = gd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c2580dm.f38880v = linkedHashMap;
        X9 x9 = this.f38583l.f38552a;
        C2944rm c2944rm = new C2944rm();
        JSONObject optJSONObject17 = ab.optJSONObject("external_attribution");
        if (optJSONObject17 != null) {
            c2944rm.f39755a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject17, "collecting_interval_seconds", c2944rm.f39755a);
        }
        x9.getClass();
        c2580dm.f38881w = new W9(c2944rm.f39755a);
    }

    public Yl(Cb cb, Sa sa, C2932ra c2932ra, Si si, Ne ne, Im im, C3 c32, C3028v2 c3028v2, C2976t2 c2976t2, Fm fm, Hd hd, Y9 y9) {
        this.f38572a = sa;
        this.f38573b = c2932ra;
        this.f38574c = si;
        this.f38575d = ne;
        this.f38576e = im;
        this.f38578g = c32;
        this.f38577f = c3028v2;
        this.f38579h = c2976t2;
        this.f38580i = cb;
        this.f38581j = fm;
        this.f38582k = hd;
        this.f38583l = y9;
    }
}
