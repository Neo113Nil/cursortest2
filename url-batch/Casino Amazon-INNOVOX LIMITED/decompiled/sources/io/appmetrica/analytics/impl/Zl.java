package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ImagesContract;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Zl {

    /* renamed from: a, reason: collision with root package name */
    public final C0650ya f1151a;
    public final X9 b;
    public final Gi c;
    public final Ae d;
    public final Im e;
    public final C0216h3 f;
    public final C0418p2 g;
    public final C0250ib h;
    public final Fm i;
    public final C0503sd j;
    public final E9 k;

    public Zl() {
        this(new C0250ib(), new C0650ya(), new X9(), new Gi(), new Ae(), new Im(), new C0216h3(), new C0418p2(), new Fm(), new C0503sd(), new E9());
    }

    public final void a(C0157em c0157em, C0198gb c0198gb) {
        long j;
        long j2;
        String str;
        ArrayList a2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c0198gb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0157em.g = optJSONObject3.optString(ImagesContract.URL, null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0198gb.get("distribution_customization");
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
            c0157em.j = Gm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c0198gb.optJSONObject("locale");
        String str2 = "";
        c0157em.m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c0198gb.optJSONObject(InfluenceConstants.TIME);
        if (optJSONObject8 != null) {
            try {
                c0157em.l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C0612wm c0612wm = new C0612wm();
        JSONObject optJSONObject9 = c0198gb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c0612wm.f1553a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c0612wm.f1553a);
        }
        this.e.getClass();
        c0157em.p = new Hm(c0612wm.f1553a);
        this.b.getClass();
        C0512sm c0512sm = new C0512sm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0198gb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0294k4 c0294k4 = new C0294k4();
                c0294k4.f1334a = X9.a(optJSONObject10, "permissions_collecting", c0512sm.f1490a);
                c0294k4.b = X9.a(optJSONObject10, "features_collecting", c0512sm.b);
                c0294k4.c = X9.a(optJSONObject10, "google_aid", c0512sm.c);
                c0294k4.d = X9.a(optJSONObject10, "sim_info", c0512sm.d);
                c0294k4.e = X9.a(optJSONObject10, "huawei_oaid", c0512sm.e);
                c0294k4.f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean(ViewProps.ENABLED)) : null;
                c0157em.b = new C0345m4(c0294k4);
            }
        } catch (Throwable unused4) {
        }
        this.f1151a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0198gb.get("query_hosts");
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
                    c0157em.d = str;
                }
                ArrayList a3 = C0650ya.a(optJSONObject11, "report");
                if (!mo.a((Collection) a3)) {
                    c0157em.e = a3;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0157em.f = str2;
                }
                ArrayList a4 = C0650ya.a(optJSONObject11, "startup");
                if (!mo.a((Collection) a4)) {
                    c0157em.c = a4;
                }
                ArrayList a5 = C0650ya.a(optJSONObject11, "diagnostic");
                if (!mo.a((Collection) a5)) {
                    c0157em.n = a5;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!C0650ya.f1582a.contains(next2) && (a2 = C0650ya.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a2);
                    }
                }
                c0157em.o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.c.getClass();
        C0637xm c0637xm = new C0637xm();
        JSONObject optJSONObject12 = c0198gb.optJSONObject("retry_policy");
        int i = c0637xm.w;
        int i2 = c0637xm.x;
        if (optJSONObject12 != null) {
            i = optJSONObject12.optInt("max_interval_seconds", i);
            i2 = optJSONObject12.optInt("exponential_multiplier", c0637xm.x);
        }
        c0157em.q = new RetryPolicyConfig(i, i2);
        this.d.getClass();
        if (c0157em.b.f1369a) {
            JSONObject optJSONObject13 = c0198gb.optJSONObject("permissions_collecting");
            C0562um c0562um = new C0562um();
            if (optJSONObject13 != null) {
                j = optJSONObject13.optLong("check_interval_seconds", c0562um.f1520a);
                j2 = optJSONObject13.optLong("force_send_interval_seconds", c0562um.b);
            } else {
                j = c0562um.f1520a;
                j2 = c0562um.b;
            }
            c0157em.k = new C0654ye(j, j2);
        }
        C0216h3 c0216h3 = this.f;
        c0216h3.getClass();
        C0438pm c0438pm = new C0438pm();
        JSONObject optJSONObject14 = c0198gb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0438pm.f1440a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0438pm.f1440a);
        }
        c0216h3.f1282a.getClass();
        c0157em.r = new C0138e3(c0438pm.f1440a);
        this.g.getClass();
        C0418p2.a(c0157em, c0198gb);
        Fm fm = this.i;
        fm.getClass();
        JSONObject optJSONObject15 = c0198gb.optJSONObject("startup_update");
        C0587vm c0587vm = new C0587vm();
        Integer a6 = AbstractC0224hb.a(optJSONObject15, "interval_seconds", null);
        if (a6 != null) {
            c0587vm.f1540a = a6.intValue();
        }
        fm.f849a.getClass();
        c0157em.t = new Dm(c0587vm.f1540a);
        Map<String, Zc> c = this.j.f1484a.c();
        C0478rd c0478rd = new C0478rd(c0198gb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Zc> entry : c.entrySet()) {
            Object invoke = c0478rd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0157em.u = linkedHashMap;
        D9 d9 = this.k.f824a;
        C0487rm c0487rm = new C0487rm();
        JSONObject optJSONObject16 = c0198gb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0487rm.f1472a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0487rm.f1472a);
        }
        d9.getClass();
        c0157em.v = new C9(c0487rm.f1472a);
    }

    public Zl(C0250ib c0250ib, C0650ya c0650ya, X9 x9, Gi gi, Ae ae, Im im, C0216h3 c0216h3, C0418p2 c0418p2, Fm fm, C0503sd c0503sd, E9 e9) {
        this.f1151a = c0650ya;
        this.b = x9;
        this.c = gi;
        this.d = ae;
        this.e = im;
        this.f = c0216h3;
        this.g = c0418p2;
        this.h = c0250ib;
        this.i = fm;
        this.j = c0503sd;
        this.k = e9;
    }
}
