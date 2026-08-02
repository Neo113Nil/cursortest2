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

/* loaded from: classes.dex */
public final class Yl {

    /* renamed from: a, reason: collision with root package name */
    public final C1076xa f11318a;

    /* renamed from: b, reason: collision with root package name */
    public final W9 f11319b;

    /* renamed from: c, reason: collision with root package name */
    public final Fi f11320c;

    /* renamed from: d, reason: collision with root package name */
    public final C1132ze f11321d;

    /* renamed from: e, reason: collision with root package name */
    public final Hm f11322e;

    /* renamed from: f, reason: collision with root package name */
    public final C0629g3 f11323f;

    /* renamed from: g, reason: collision with root package name */
    public final C0835o2 f11324g;

    /* renamed from: h, reason: collision with root package name */
    public final C0663hb f11325h;

    /* renamed from: i, reason: collision with root package name */
    public final Em f11326i;

    /* renamed from: j, reason: collision with root package name */
    public final C0923rd f11327j;

    /* renamed from: k, reason: collision with root package name */
    public final D9 f11328k;

    public Yl() {
        this(new C0663hb(), new C1076xa(), new W9(), new Fi(), new C1132ze(), new Hm(), new C0629g3(), new C0835o2(), new Em(), new C0923rd(), new D9());
    }

    public final void a(C0571dm c0571dm, C0611fb c0611fb) {
        long j4;
        long j5;
        String str;
        ArrayList a3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c0611fb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0571dm.f11693g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0611fb.get("distribution_customization");
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
            c0571dm.f11696j = Fm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c0611fb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c0571dm.f11699m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c0611fb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c0571dm.f11698l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C1036vm c1036vm = new C1036vm();
        JSONObject optJSONObject9 = c0611fb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c1036vm.f12904a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c1036vm.f12904a);
        }
        this.f11322e.getClass();
        c0571dm.f11700p = new Gm(c1036vm.f12904a);
        this.f11319b.getClass();
        C0932rm c0932rm = new C0932rm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0611fb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0707j4 c0707j4 = new C0707j4();
                c0707j4.f12094a = W9.a(optJSONObject10, "permissions_collecting", c0932rm.f12685a);
                c0707j4.f12095b = W9.a(optJSONObject10, "features_collecting", c0932rm.f12686b);
                c0707j4.f12096c = W9.a(optJSONObject10, "google_aid", c0932rm.f12687c);
                c0707j4.f12097d = W9.a(optJSONObject10, "sim_info", c0932rm.f12688d);
                c0707j4.f12098e = W9.a(optJSONObject10, "huawei_oaid", c0932rm.f12689e);
                c0707j4.f12099f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0571dm.f11688b = new C0759l4(c0707j4);
            }
        } catch (Throwable unused4) {
        }
        this.f11318a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0611fb.get("query_hosts");
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
                    c0571dm.f11690d = str;
                }
                ArrayList a4 = C1076xa.a(optJSONObject11, "report");
                if (!AbstractC0779lo.a((Collection) a4)) {
                    c0571dm.f11691e = a4;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0571dm.f11692f = str2;
                }
                ArrayList a5 = C1076xa.a(optJSONObject11, "startup");
                if (!AbstractC0779lo.a((Collection) a5)) {
                    c0571dm.f11689c = a5;
                }
                ArrayList a6 = C1076xa.a(optJSONObject11, "diagnostic");
                if (!AbstractC0779lo.a((Collection) a6)) {
                    c0571dm.n = a6;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!C1076xa.f13022a.contains(next2) && (a3 = C1076xa.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a3);
                    }
                }
                c0571dm.o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f11320c.getClass();
        C1062wm c1062wm = new C1062wm();
        JSONObject optJSONObject12 = c0611fb.optJSONObject("retry_policy");
        int i4 = c1062wm.f12978w;
        int i5 = c1062wm.f12979x;
        if (optJSONObject12 != null) {
            i4 = optJSONObject12.optInt("max_interval_seconds", i4);
            i5 = optJSONObject12.optInt("exponential_multiplier", c1062wm.f12979x);
        }
        c0571dm.f11701q = new RetryPolicyConfig(i4, i5);
        this.f11321d.getClass();
        if (c0571dm.f11688b.f12259a) {
            JSONObject optJSONObject13 = c0611fb.optJSONObject("permissions_collecting");
            C0984tm c0984tm = new C0984tm();
            if (optJSONObject13 != null) {
                j4 = optJSONObject13.optLong("check_interval_seconds", c0984tm.f12790a);
                j5 = optJSONObject13.optLong("force_send_interval_seconds", c0984tm.f12791b);
            } else {
                j4 = c0984tm.f12790a;
                j5 = c0984tm.f12791b;
            }
            c0571dm.f11697k = new C1080xe(j4, j5);
        }
        C0629g3 c0629g3 = this.f11323f;
        c0629g3.getClass();
        C0855om c0855om = new C0855om();
        JSONObject optJSONObject14 = c0611fb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0855om.f12533a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0855om.f12533a);
        }
        c0629g3.f11905a.getClass();
        c0571dm.f11702r = new C0552d3(c0855om.f12533a);
        this.f11324g.getClass();
        C0835o2.a(c0571dm, c0611fb);
        Em em = this.f11326i;
        em.getClass();
        JSONObject optJSONObject15 = c0611fb.optJSONObject("startup_update");
        C1010um c1010um = new C1010um();
        Integer a7 = AbstractC0637gb.a(optJSONObject15, "interval_seconds", null);
        if (a7 != null) {
            c1010um.f12855a = a7.intValue();
        }
        em.f10262a.getClass();
        c0571dm.f11704t = new Cm(c1010um.f12855a);
        Map<String, Yc> c4 = this.f11327j.f12657a.c();
        C0898qd c0898qd = new C0898qd(c0611fb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Yc> entry : c4.entrySet()) {
            Object invoke = c0898qd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0571dm.f11705u = linkedHashMap;
        C9 c9 = this.f11328k.f10192a;
        C0907qm c0907qm = new C0907qm();
        JSONObject optJSONObject16 = c0611fb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0907qm.f12629a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0907qm.f12629a);
        }
        c9.getClass();
        c0571dm.v = new B9(c0907qm.f12629a);
    }

    public Yl(C0663hb c0663hb, C1076xa c1076xa, W9 w9, Fi fi, C1132ze c1132ze, Hm hm, C0629g3 c0629g3, C0835o2 c0835o2, Em em, C0923rd c0923rd, D9 d9) {
        this.f11318a = c1076xa;
        this.f11319b = w9;
        this.f11320c = fi;
        this.f11321d = c1132ze;
        this.f11322e = hm;
        this.f11323f = c0629g3;
        this.f11324g = c0835o2;
        this.f11325h = c0663hb;
        this.f11326i = em;
        this.f11327j = c0923rd;
        this.f11328k = d9;
    }
}
