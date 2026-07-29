package com.chartboost.sdk.impl;

import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Libraries.d;
import com.chartboost.sdk.impl.aj;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class am extends aj {
    private final JSONObject n;
    private final JSONObject o;
    private final JSONObject p;
    private final JSONObject q;

    public am(String str, ap apVar, com.chartboost.sdk.Tracking.a aVar, int i, aj.a aVar2) {
        super(str, apVar, aVar, i, aVar2);
        this.n = new JSONObject();
        this.o = new JSONObject();
        this.p = new JSONObject();
        this.q = new JSONObject();
    }

    @Override // com.chartboost.sdk.impl.aj
    protected void c() {
        com.chartboost.sdk.Libraries.e.a(this.o, TapjoyConstants.TJC_APP_PLACEMENT, this.m.s);
        com.chartboost.sdk.Libraries.e.a(this.o, TJAdUnitConstants.String.BUNDLE, this.m.j);
        com.chartboost.sdk.Libraries.e.a(this.o, "bundle_id", this.m.k);
        com.chartboost.sdk.Libraries.e.a(this.o, "custom_id", com.chartboost.sdk.i.f3677a);
        com.chartboost.sdk.Libraries.e.a(this.o, TapjoyConstants.TJC_SESSION_ID, "");
        com.chartboost.sdk.Libraries.e.a(this.o, "ui", -1);
        com.chartboost.sdk.Libraries.e.a(this.o, "test_mode", false);
        com.chartboost.sdk.Libraries.e.a(this.o, "certification_providers", o.f());
        a(TapjoyConstants.TJC_APP_PLACEMENT, this.o);
        com.chartboost.sdk.Libraries.e.a(this.p, com.umeng.commonsdk.proguard.d.O, com.chartboost.sdk.Libraries.e.a(com.chartboost.sdk.Libraries.e.a(TapjoyConstants.TJC_CARRIER_NAME, this.m.v.optString("carrier-name")), com.chartboost.sdk.Libraries.e.a(TapjoyConstants.TJC_MOBILE_COUNTRY_CODE, this.m.v.optString("mobile-country-code")), com.chartboost.sdk.Libraries.e.a(TapjoyConstants.TJC_MOBILE_NETWORK_CODE, this.m.v.optString("mobile-network-code")), com.chartboost.sdk.Libraries.e.a("iso_country_code", this.m.v.optString("iso-country-code")), com.chartboost.sdk.Libraries.e.a("phone_type", Integer.valueOf(this.m.v.optInt("phone-type")))));
        com.chartboost.sdk.Libraries.e.a(this.p, "model", this.m.f);
        com.chartboost.sdk.Libraries.e.a(this.p, "device_type", this.m.t);
        com.chartboost.sdk.Libraries.e.a(this.p, "actual_device_type", this.m.u);
        com.chartboost.sdk.Libraries.e.a(this.p, com.umeng.commonsdk.proguard.d.w, this.m.g);
        com.chartboost.sdk.Libraries.e.a(this.p, com.umeng.commonsdk.proguard.d.N, this.m.h);
        com.chartboost.sdk.Libraries.e.a(this.p, com.umeng.commonsdk.proguard.d.M, this.m.i);
        com.chartboost.sdk.Libraries.e.a(this.p, TapjoyConstants.TJC_TIMESTAMP, String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.m.e.a())));
        com.chartboost.sdk.Libraries.e.a(this.p, "reachability", Integer.valueOf(this.m.f3736b.a()));
        com.chartboost.sdk.Libraries.e.a(this.p, "scale", this.m.r);
        com.chartboost.sdk.Libraries.e.a(this.p, "is_portrait", Boolean.valueOf(CBUtility.a(CBUtility.a())));
        com.chartboost.sdk.Libraries.e.a(this.p, "rooted_device", Boolean.valueOf(this.m.w));
        com.chartboost.sdk.Libraries.e.a(this.p, "timezone", this.m.x);
        com.chartboost.sdk.Libraries.e.a(this.p, "mobile_network", this.m.y);
        com.chartboost.sdk.Libraries.e.a(this.p, "dw", this.m.o);
        com.chartboost.sdk.Libraries.e.a(this.p, "dh", this.m.p);
        com.chartboost.sdk.Libraries.e.a(this.p, "dpi", this.m.q);
        com.chartboost.sdk.Libraries.e.a(this.p, "w", this.m.m);
        com.chartboost.sdk.Libraries.e.a(this.p, "h", this.m.n);
        com.chartboost.sdk.Libraries.e.a(this.p, "user_agent", com.chartboost.sdk.i.w);
        com.chartboost.sdk.Libraries.e.a(this.p, "device_family", "");
        com.chartboost.sdk.Libraries.e.a(this.p, "retina", false);
        d.a a2 = this.m.f3735a.a();
        com.chartboost.sdk.Libraries.e.a(this.p, "identity", a2.f3578b);
        if (a2.f3577a != -1) {
            com.chartboost.sdk.Libraries.e.a(this.p, "limit_ad_tracking", Boolean.valueOf(a2.f3577a == 1));
        }
        com.chartboost.sdk.Libraries.e.a(this.p, "pidatauseconsent", Integer.valueOf(com.chartboost.sdk.i.x.getValue()));
        a(TapjoyConstants.TJC_NOTIFICATION_DEVICE_PREFIX, this.p);
        com.chartboost.sdk.Libraries.e.a(this.n, "framework", "");
        com.chartboost.sdk.Libraries.e.a(this.n, TapjoyConstants.TJC_SDK_PLACEMENT, this.m.l);
        if (com.chartboost.sdk.i.f3680d != null) {
            com.chartboost.sdk.Libraries.e.a(this.n, "framework_version", com.chartboost.sdk.i.f);
            com.chartboost.sdk.Libraries.e.a(this.n, "wrapper_version", com.chartboost.sdk.i.f3678b);
        }
        com.chartboost.sdk.Libraries.e.a(this.n, "mediation", com.chartboost.sdk.i.h);
        com.chartboost.sdk.Libraries.e.a(this.n, "commit_hash", "ea5c9878e5dca6c95016765177cbd146c39a21f7");
        String str = this.m.f3737c.get().f3621a;
        if (!s.a().a(str)) {
            com.chartboost.sdk.Libraries.e.a(this.n, "config_variant", str);
        }
        a(TapjoyConstants.TJC_SDK_PLACEMENT, this.n);
        com.chartboost.sdk.Libraries.e.a(this.q, com.umeng.analytics.pro.b.ac, Integer.valueOf(this.m.f3738d.getInt("cbPrefSessionCount", 0)));
        if (this.q.isNull("cache")) {
            com.chartboost.sdk.Libraries.e.a(this.q, "cache", false);
        }
        if (this.q.isNull("amount")) {
            com.chartboost.sdk.Libraries.e.a(this.q, "amount", 0);
        }
        if (this.q.isNull("retry_count")) {
            com.chartboost.sdk.Libraries.e.a(this.q, "retry_count", 0);
        }
        if (this.q.isNull(GooglePlayServicesInterstitial.LOCATION_KEY)) {
            com.chartboost.sdk.Libraries.e.a(this.q, GooglePlayServicesInterstitial.LOCATION_KEY, "");
        }
        a("ad", this.q);
    }

    public void a(String str, Object obj, int i) {
        if (i == 0) {
            com.chartboost.sdk.Libraries.e.a(this.q, str, obj);
            a("ad", this.q);
        }
    }
}
