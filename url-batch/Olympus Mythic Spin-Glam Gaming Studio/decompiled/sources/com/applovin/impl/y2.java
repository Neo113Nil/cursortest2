package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class y2 extends k3 implements MaxAd {
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private final a3 m;
    protected com.applovin.impl.mediation.h n;
    private final String o;
    private MaxAdWaterfallInfo p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private String x;
    private String y;

    protected y2(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var.e(), jSONObject, jSONObject2, kVar);
        this.k = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.m = a3Var;
        this.n = hVar;
        this.o = hVar != null ? hVar.b() : null;
    }

    private long J() {
        return a("load_started_time_ms", 0L);
    }

    public static y2 a(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat formatFromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(formatFromString, "Invalid ad format for string: " + string);
        if (formatFromString.isAdViewAd()) {
            return new b3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString == MaxAdFormat.NATIVE) {
            return new d3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (formatFromString.isFullscreenAd()) {
            return new c3(a3Var, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(h5 h5Var) {
        JSONObject a;
        if (h5Var.a("credentials")) {
            a = h5Var.a("credentials", new JSONObject());
        } else {
            a = h5Var.a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", R());
        }
        return JsonUtils.toBundle(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(h5 h5Var) {
        return Double.valueOf(JsonUtils.getDouble(h5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(h5 h5Var) {
        return JsonUtils.deepCopy(h5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(h5 h5Var) {
        return JsonUtils.getString(h5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public com.applovin.impl.mediation.h A() {
        return this.n;
    }

    public String B() {
        return a("bcode", "");
    }

    public long C() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String D() {
        return a("bid_response", (String) null);
    }

    public Bundle E() {
        JSONObject a;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return (Bundle) h5Var.a(new Function() { // from class: com.applovin.impl.y2$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Bundle c;
                    c = y2.this.c((h5) obj);
                    return c;
                }
            });
        }
        if (c("credentials")) {
            a = a("credentials", new JSONObject());
        } else {
            a = a("server_parameters", new JSONObject());
            JsonUtils.putString(a, "placement_id", R());
        }
        return JsonUtils.toBundle(a);
    }

    public long F() {
        return this.w;
    }

    public long G() {
        if (J() > 0) {
            return I() - J();
        }
        return -1L;
    }

    public long H() {
        return this.u;
    }

    public long I() {
        return a("load_completed_time_ms", 0L);
    }

    public String K() {
        return this.x;
    }

    public int L() {
        return a("mspc", ((Integer) this.a.a(r3.g8)).intValue());
    }

    public JSONObject M() {
        h5 h5Var = this.h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.y2$$ExternalSyntheticLambda2
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                JSONObject d;
                d = y2.d((h5) obj);
                return d;
            }
        }) : a("publisher_extra_info", new JSONObject());
    }

    public a3 N() {
        return this.m;
    }

    public String O() {
        return JsonUtils.getString(P(), "revenue_event", "");
    }

    public JSONObject P() {
        h5 h5Var = this.h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.y2$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                JSONObject f;
                f = y2.f((h5) obj);
                return f;
            }
        }) : a("revenue_parameters", new JSONObject());
    }

    public String Q() {
        return b("event_id", "");
    }

    public String R() {
        return a(BrandSafetyEvent.k, (String) null);
    }

    public long S() {
        return this.v;
    }

    public List T() {
        return b("mwf_info_urls");
    }

    public String U() {
        return b("waterfall_name", "");
    }

    public String V() {
        return b("waterfall_test_name", "");
    }

    public boolean W() {
        return StringUtils.isValidString(D());
    }

    public boolean X() {
        com.applovin.impl.mediation.h hVar = this.n;
        return hVar != null && hVar.k() && this.n.j();
    }

    public boolean Y() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean Z() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public abstract y2 a(com.applovin.impl.mediation.h hVar);

    public void a0() {
        this.w = SystemClock.elapsedRealtime() - this.s;
    }

    public void b0() {
        this.r = SystemClock.elapsedRealtime();
        this.t = this.a.m0().getTotalBackgroundDurationMillis();
    }

    public void c0() {
        long totalBackgroundDurationMillis = this.a.m0().getTotalBackgroundDurationMillis() - this.t;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.r;
        this.v = elapsedRealtime;
        this.u = elapsedRealtime - totalBackgroundDurationMillis;
    }

    public void d0() {
        this.s = SystemClock.elapsedRealtime();
    }

    public void e0() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void f0() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean g0() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.y;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.n;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a(BrandSafetyEvent.ad, "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(R());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.q;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.a.a(r3.l8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            h5 h5Var = this.h;
            return h5Var != null ? ((Double) h5Var.a(new Function() { // from class: com.applovin.impl.y2$$ExternalSyntheticLambda5
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    Double e;
                    e = y2.e((h5) obj);
                    return e;
                }
            })).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.a.O();
        if (!com.applovin.impl.sdk.o.a()) {
            return 0.0d;
        }
        this.a.O().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        h5 h5Var = this.h;
        return h5Var != null ? (String) h5Var.a(new Function() { // from class: com.applovin.impl.y2$$ExternalSyntheticLambda4
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                String g;
                g = y2.g((h5) obj);
                return g;
            }
        }) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int a = a("ad_width", -3);
        int a2 = a("ad_height", -3);
        return (a == -3 || a2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(a, a2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.p;
    }

    public void h(String str) {
        this.y = str;
    }

    public Boolean h0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public void i(String str) {
        this.x = str;
    }

    public Boolean i0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    public void t() {
        this.n = null;
        this.p = null;
    }

    @Override // com.applovin.impl.k3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + R() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public AtomicBoolean u() {
        return this.k;
    }

    public String v() {
        return a(POBConstants.KEY_ADOMAIN, (String) null);
    }

    public AtomicBoolean w() {
        return this.l;
    }

    public JSONObject x() {
        h5 h5Var = this.h;
        return h5Var != null ? (JSONObject) h5Var.a(new Function() { // from class: com.applovin.impl.y2$$ExternalSyntheticLambda1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                JSONObject b;
                b = y2.b((h5) obj);
                return b;
            }
        }) : a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.h hVar;
        if (!X() || (hVar = this.n) == null) {
            return null;
        }
        return hVar.d();
    }

    public String z() {
        return this.o;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject x = x();
        if (x.has(str)) {
            return JsonUtils.getString(x, str, str2);
        }
        Bundle l = l();
        if (l.containsKey(str)) {
            return l.getString(str);
        }
        JSONObject M = M();
        return M.has(str) ? JsonUtils.getString(M, str, str2) : a(str, str2);
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.p = maxAdWaterfallInfo;
    }

    public void a(long j) {
        this.q = j;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject M = M();
        JsonUtils.putAll(M, jSONObject);
        a("publisher_extra_info", (Object) M);
    }

    public void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i = BundleUtils.getInt("ad_width", bundle);
            int i2 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i);
            c("ad_height", i2);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
