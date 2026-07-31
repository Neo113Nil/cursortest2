package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.e3;
import com.chartboost.sdk.impl.k3;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class s3 extends k3 {
    public final JSONObject u;
    public final JSONObject v;
    public final JSONObject w;
    public final JSONObject x;
    public final JSONObject y;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[xi.values().length];
            try {
                iArr[xi.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xi.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(e3.c method, String host, String path, ig requestBodyFields, af priority, String str, k3.a aVar, p7 eventTracker, zg session) {
        super(method, host, path, requestBodyFields, priority, str, aVar, eventTracker, session);
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBodyFields, "requestBodyFields");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        this.u = new JSONObject();
        this.v = new JSONObject();
        this.w = new JSONObject();
        this.x = new JSONObject();
        this.y = new JSONObject();
    }

    public final void b(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b3.a(this.x, key, obj);
        a("ad", this.x);
    }

    public final void c(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        b3.a(this.u, key, obj);
        a("sdk", this.u);
    }

    @Override // com.chartboost.sdk.impl.k3
    public void f() {
        m();
        n();
        o();
        q();
        l();
    }

    public final void m() {
        JSONObject jSONObject = this.v;
        ig j = j();
        b3.a(jSONObject, "app", j != null ? j.h : null);
        JSONObject jSONObject2 = this.v;
        ig j2 = j();
        b3.a(jSONObject2, POBConstants.KEY_BUNDLE, j2 != null ? j2.e : null);
        JSONObject jSONObject3 = this.v;
        ig j3 = j();
        b3.a(jSONObject3, "bundle_id", j3 != null ? j3.f : null);
        b3.a(this.v, SDKAnalyticsEvents.PARAMETER_SESSION_ID, "");
        b3.a(this.v, "ui", -1);
        b3.a(this.v, "test_mode", Boolean.FALSE);
        a("app", this.v);
    }

    public final void n() {
        b3.a(this.y, "app", b3.a(b3.a("ver", k7.a.b())));
        a("bidrequest", this.y);
    }

    public final void o() {
        l6 b;
        l6 b2;
        l6 b3;
        l6 b4;
        l6 b5;
        pf g;
        yd d;
        l6 b6;
        l6 b7;
        pf g2;
        wh j;
        ig j2 = j();
        JSONObject jSONObject = j2 != null ? j2.m : null;
        b3.a(this.w, "carrier", b3.a(b3.a("carrier_name", jSONObject != null ? jSONObject.optString("carrier-name") : null), b3.a("mobile_country_code", jSONObject != null ? jSONObject.optString("mobile-country-code") : null), b3.a("mobile_network_code", jSONObject != null ? jSONObject.optString("mobile-network-code") : null), b3.a("iso_country_code", jSONObject != null ? jSONObject.optString("iso-country-code") : null), b3.a("phone_type", jSONObject != null ? Integer.valueOf(jSONObject.optInt("phone-type")) : null)));
        JSONObject jSONObject2 = this.w;
        ig j3 = j();
        b3.a(jSONObject2, "model", j3 != null ? j3.a : null);
        JSONObject jSONObject3 = this.w;
        ig j4 = j();
        b3.a(jSONObject3, "make", j4 != null ? j4.k : null);
        JSONObject jSONObject4 = this.w;
        ig j5 = j();
        b3.a(jSONObject4, CommonUrlParts.DEVICE_TYPE, j5 != null ? j5.j : null);
        JSONObject jSONObject5 = this.w;
        ig j6 = j();
        b3.a(jSONObject5, "actual_device_type", j6 != null ? j6.l : null);
        JSONObject jSONObject6 = this.w;
        ig j7 = j();
        b3.a(jSONObject6, "os", j7 != null ? j7.b : null);
        JSONObject jSONObject7 = this.w;
        ig j8 = j();
        b3.a(jSONObject7, "country", j8 != null ? j8.c : null);
        JSONObject jSONObject8 = this.w;
        ig j9 = j();
        b3.a(jSONObject8, POBConstants.KEY_LANGUAGE, j9 != null ? j9.d : null);
        ig j10 = j();
        b3.a(this.w, "timestamp", (j10 == null || (j = j10.j()) == null) ? null : String.valueOf(TimeUnit.MILLISECONDS.toSeconds(j.a())));
        JSONObject jSONObject9 = this.w;
        ig j11 = j();
        b3.a(jSONObject9, "reachability", (j11 == null || (g2 = j11.g()) == null) ? null : g2.b());
        JSONObject jSONObject10 = this.w;
        ig j12 = j();
        b3.a(jSONObject10, "is_portrait", (j12 == null || (b7 = j12.b()) == null) ? null : Boolean.valueOf(b7.k()));
        JSONObject jSONObject11 = this.w;
        ig j13 = j();
        b3.a(jSONObject11, "scale", (j13 == null || (b6 = j13.b()) == null) ? null : Float.valueOf(b6.h()));
        JSONObject jSONObject12 = this.w;
        ig j14 = j();
        b3.a(jSONObject12, "timezone", j14 != null ? j14.o : null);
        JSONObject jSONObject13 = this.w;
        ig j15 = j();
        b3.a(jSONObject13, "connectiontype", (j15 == null || (g = j15.g()) == null || (d = g.d()) == null) ? null : Integer.valueOf(d.c()));
        JSONObject jSONObject14 = this.w;
        ig j16 = j();
        b3.a(jSONObject14, "dw", (j16 == null || (b5 = j16.b()) == null) ? null : Integer.valueOf(b5.c()));
        JSONObject jSONObject15 = this.w;
        ig j17 = j();
        b3.a(jSONObject15, "dh", (j17 == null || (b4 = j17.b()) == null) ? null : Integer.valueOf(b4.a()));
        JSONObject jSONObject16 = this.w;
        ig j18 = j();
        b3.a(jSONObject16, "dpi", (j18 == null || (b3 = j18.b()) == null) ? null : b3.d());
        JSONObject jSONObject17 = this.w;
        ig j19 = j();
        b3.a(jSONObject17, "w", (j19 == null || (b2 = j19.b()) == null) ? null : Integer.valueOf(b2.j()));
        JSONObject jSONObject18 = this.w;
        ig j20 = j();
        b3.a(jSONObject18, "h", (j20 == null || (b = j20.b()) == null) ? null : Integer.valueOf(b.e()));
        b3.a(this.w, "user_agent", kj.b.a());
        b3.a(this.w, "device_family", "");
        b3.a(this.w, "retina", Boolean.FALSE);
        p();
        ig j21 = j();
        cf cfVar = j21 != null ? j21.r : null;
        if (cfVar != null) {
            a(cfVar);
        }
        a("device", this.w);
    }

    public final void p() {
        ig j = j();
        s9 c = j != null ? j.c() : null;
        if (c != null) {
            b3.a(this.w, "identity", c.b());
            int i = a.a[c.f().ordinal()];
            if (i == 1) {
                b3.a(this.w, CommonUrlParts.LIMIT_AD_TRACKING, Boolean.TRUE);
            } else if (i == 2) {
                b3.a(this.w, CommonUrlParts.LIMIT_AD_TRACKING, Boolean.FALSE);
            }
            Integer e = c.e();
            if (e != null) {
                b3.a(this.w, "appsetidscope", Integer.valueOf(e.intValue()));
                return;
            }
            return;
        }
        xb.b("Missing identity in the CB SDK. This will affect ads performance.", null);
    }

    public final void a(cf cfVar) {
        String h = cfVar.h();
        if (h != null) {
            b3.a(this.w, "consent", h);
        }
        b3.a(this.w, "pidatauseconsent", cfVar.f());
        JSONObject g = cfVar.g();
        if (g != null) {
            try {
                g.put("gpp", cfVar.b());
                g.put(POBConstants.KEY_GPP_SID, cfVar.a());
            } catch (JSONException e) {
                xb.b("Failed to add GPP and/or GPP SID to request body", e);
            }
            b3.a(this.w, "privacy", g);
        }
    }

    public final void q() {
        i5 a2;
        lc d;
        JSONObject jSONObject = this.u;
        ig j = j();
        String str = null;
        b3.a(jSONObject, "sdk", j != null ? j.g : null);
        ig j2 = j();
        if (j2 != null && (d = j2.d()) != null) {
            b3.a(this.u, "mediation", d.c());
            b3.a(this.u, "mediation_version", d.b());
            b3.a(this.u, "adapter_version", d.a());
        }
        b3.a(this.u, "commit_hash", "046e4d88fb5334ad97b395fba791da746b7830e2");
        ig j3 = j();
        if (j3 != null && (a2 = j3.a()) != null) {
            str = a2.a();
        }
        if (!l1.b().a(str)) {
            b3.a(this.u, "config_variant", str);
        }
        a("sdk", this.u);
    }

    public final void l() {
        JSONObject jSONObject = this.x;
        ig j = j();
        b3.a(jSONObject, "session", j != null ? Integer.valueOf(j.i()) : null);
        if (this.x.isNull("cache")) {
            b3.a(this.x, "cache", Boolean.FALSE);
        }
        if (this.x.isNull("amount")) {
            b3.a(this.x, "amount", 0);
        }
        if (this.x.isNull("retry_count")) {
            b3.a(this.x, "retry_count", 0);
        }
        if (this.x.isNull("location")) {
            b3.a(this.x, "location", "");
        }
        a("ad", this.x);
    }
}
