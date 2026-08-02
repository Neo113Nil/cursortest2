package io.appmetrica.analytics.impl;

import android.text.TextUtils;
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

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423cm {

    /* renamed from: a, reason: collision with root package name */
    public final Ea f7152a;

    /* renamed from: b, reason: collision with root package name */
    public final C0437da f7153b;

    /* renamed from: c, reason: collision with root package name */
    public final Ki f7154c;

    /* renamed from: d, reason: collision with root package name */
    public final Fe f7155d;

    /* renamed from: e, reason: collision with root package name */
    public final Lm f7156e;
    public final C0714o3 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0920w2 f7157g;

    /* renamed from: h, reason: collision with root package name */
    public final C0722ob f7158h;

    /* renamed from: i, reason: collision with root package name */
    public final Im f7159i;

    /* renamed from: j, reason: collision with root package name */
    public final C0982yd f7160j;

    /* renamed from: k, reason: collision with root package name */
    public final K9 f7161k;

    public C0423cm() {
        this(new C0722ob(), new Ea(), new C0437da(), new Ki(), new Fe(), new Lm(), new C0714o3(), new C0920w2(), new Im(), new C0982yd(), new K9());
    }

    public final void a(C0552hm c0552hm, C0670mb c0670mb) {
        long j3;
        long j4;
        String str;
        ArrayList a3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c0670mb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0552hm.f7468g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0670mb.get("distribution_customization");
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
            c0552hm.f7471j = Jm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c0670mb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c0552hm.f7474m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c0670mb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c0552hm.f7473l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C1016zm c1016zm = new C1016zm();
        JSONObject optJSONObject9 = c0670mb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c1016zm.f8714a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c1016zm.f8714a);
        }
        this.f7156e.getClass();
        c0552hm.f7476p = new Km(c1016zm.f8714a);
        this.f7153b.getClass();
        C0914vm c0914vm = new C0914vm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0670mb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0767q4 c0767q4 = new C0767q4();
                c0767q4.f8120a = C0437da.a(optJSONObject10, "permissions_collecting", c0914vm.f8531a);
                c0767q4.f8121b = C0437da.a(optJSONObject10, "features_collecting", c0914vm.f8532b);
                c0767q4.f8122c = C0437da.a(optJSONObject10, "google_aid", c0914vm.f8533c);
                c0767q4.f8123d = C0437da.a(optJSONObject10, "sim_info", c0914vm.f8534d);
                c0767q4.f8124e = C0437da.a(optJSONObject10, "huawei_oaid", c0914vm.f8535e);
                c0767q4.f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0552hm.f7464b = new C0818s4(c0767q4);
            }
        } catch (Throwable unused4) {
        }
        this.f7152a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0670mb.get("query_hosts");
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
                    c0552hm.f7466d = str;
                }
                ArrayList a4 = Ea.a(optJSONObject11, "report");
                if (!AbstractC0709no.a((Collection) a4)) {
                    c0552hm.f7467e = a4;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0552hm.f = str2;
                }
                ArrayList a5 = Ea.a(optJSONObject11, "startup");
                if (!AbstractC0709no.a((Collection) a5)) {
                    c0552hm.f7465c = a5;
                }
                ArrayList a6 = Ea.a(optJSONObject11, "diagnostic");
                if (!AbstractC0709no.a((Collection) a6)) {
                    c0552hm.f7475n = a6;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Ea.f5958a.contains(next2) && (a3 = Ea.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a3);
                    }
                }
                c0552hm.o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f7154c.getClass();
        Am am = new Am();
        JSONObject optJSONObject12 = c0670mb.optJSONObject("retry_policy");
        int i3 = am.f5789w;
        int i4 = am.f5790x;
        if (optJSONObject12 != null) {
            i3 = optJSONObject12.optInt("max_interval_seconds", i3);
            i4 = optJSONObject12.optInt("exponential_multiplier", am.f5790x);
        }
        c0552hm.f7477q = new RetryPolicyConfig(i3, i4);
        this.f7155d.getClass();
        if (c0552hm.f7464b.f8289a) {
            JSONObject optJSONObject13 = c0670mb.optJSONObject("permissions_collecting");
            C0966xm c0966xm = new C0966xm();
            if (optJSONObject13 != null) {
                j3 = optJSONObject13.optLong("check_interval_seconds", c0966xm.f8625a);
                j4 = optJSONObject13.optLong("force_send_interval_seconds", c0966xm.f8626b);
            } else {
                j3 = c0966xm.f8625a;
                j4 = c0966xm.f8626b;
            }
            c0552hm.f7472k = new De(j3, j4);
        }
        C0714o3 c0714o3 = this.f;
        c0714o3.getClass();
        C0836sm c0836sm = new C0836sm();
        JSONObject optJSONObject14 = c0670mb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0836sm.f8326a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0836sm.f8326a);
        }
        c0714o3.f7987a.getClass();
        c0552hm.f7478r = new C0636l3(c0836sm.f8326a);
        this.f7157g.getClass();
        C0920w2.a(c0552hm, c0670mb);
        Im im = this.f7159i;
        im.getClass();
        JSONObject optJSONObject15 = c0670mb.optJSONObject("startup_update");
        C0991ym c0991ym = new C0991ym();
        Integer a7 = AbstractC0696nb.a(optJSONObject15, "interval_seconds", null);
        if (a7 != null) {
            c0991ym.f8648a = a7.intValue();
        }
        im.f6175a.getClass();
        c0552hm.f7480t = new Gm(c0991ym.f8648a);
        Map<String, C0491fd> c3 = this.f7160j.f8641a.c();
        C0957xd c0957xd = new C0957xd(c0670mb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0491fd> entry : c3.entrySet()) {
            Object invoke = c0957xd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0552hm.f7481u = linkedHashMap;
        J9 j9 = this.f7161k.f6229a;
        C0888um c0888um = new C0888um();
        JSONObject optJSONObject16 = c0670mb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0888um.f8470a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0888um.f8470a);
        }
        j9.getClass();
        c0552hm.v = new I9(c0888um.f8470a);
    }

    public C0423cm(C0722ob c0722ob, Ea ea, C0437da c0437da, Ki ki, Fe fe, Lm lm, C0714o3 c0714o3, C0920w2 c0920w2, Im im, C0982yd c0982yd, K9 k9) {
        this.f7152a = ea;
        this.f7153b = c0437da;
        this.f7154c = ki;
        this.f7155d = fe;
        this.f7156e = lm;
        this.f = c0714o3;
        this.f7157g = c0920w2;
        this.f7158h = c0722ob;
        this.f7159i = im;
        this.f7160j = c0982yd;
        this.f7161k = k9;
    }
}
