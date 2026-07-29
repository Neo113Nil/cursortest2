package com.applovin.impl.mediation.b;

import android.app.Activity;
import android.graphics.Point;
import android.text.TextUtils;
import com.applovin.impl.sdk.c.g;
import com.applovin.impl.sdk.c.h;
import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.d.w;
import com.applovin.impl.sdk.e.i;
import com.applovin.impl.sdk.j;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.b;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.cmplay.base.util.webview.util.WebUtils;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.ProductRequestItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f2727a;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.mediation.c f2728c;

    /* renamed from: d, reason: collision with root package name */
    private final Activity f2729d;
    private final MaxAdListener e;
    private JSONArray f;

    public c(String str, com.applovin.impl.mediation.c cVar, Activity activity, j jVar, MaxAdListener maxAdListener) {
        super("TaskFetchMediatedAd " + str, jVar);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (maxAdListener == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        this.f2727a = str;
        this.f2728c = cVar;
        this.f2729d = activity;
        this.e = maxAdListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        boolean z = i != 204;
        this.f3073b.u().a(c(), Boolean.valueOf(z), "Unable to fetch " + this.f2727a + " ad: server returned " + i);
        b(i);
    }

    private void a(h hVar) {
        if (System.currentTimeMillis() - hVar.b(g.f3052c) > TimeUnit.MINUTES.toMillis(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.ea)).intValue())) {
            hVar.b(g.f3052c, System.currentTimeMillis());
            hVar.c(g.f3053d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            com.applovin.impl.sdk.e.e.d(jSONObject, this.f3073b);
            com.applovin.impl.sdk.e.e.c(jSONObject, this.f3073b);
            com.applovin.impl.sdk.e.e.f(jSONObject, this.f3073b);
            com.applovin.impl.mediation.c.b.a(jSONObject, this.f3073b);
            com.applovin.impl.mediation.c.b.b(jSONObject, this.f3073b);
            this.f3073b.h();
            f b2 = b(jSONObject);
            if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.a.g)).booleanValue()) {
                this.f3073b.C().a(b2);
            } else {
                this.f3073b.C().a(b2, q.a.MEDIATION_MAIN);
            }
        } catch (Throwable th) {
            a("Unable to process mediated ad response", th);
            b(-800);
        }
    }

    private f b(JSONObject jSONObject) {
        return new f(this.f2727a, jSONObject, this.f2728c, this.f2729d, this.f3073b, this.e);
    }

    private void b(int i) {
        com.applovin.impl.sdk.e.g.a(this.e, this.f2727a, i, this.f3073b);
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("loaded", new JSONArray((Collection) this.f3073b.a(this.f2729d).getLoadedAdapterClassnames()));
            jSONObject2.put("failed", new JSONArray((Collection) this.f3073b.a(this.f2729d).getFailedAdapterClassnames()));
            jSONObject.put("classname_info", jSONObject2);
            jSONObject.put("initialized_adapter_classnames", new JSONArray((Collection) this.f3073b.a(this.f2729d).getInitializedAdapterNames()));
        } catch (Exception e) {
            a("Failed to populate adapter classnames", e);
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        if (this.f != null) {
            jSONObject.put("signal_data", this.f);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f2727a);
        if (this.f2728c != null && ((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.a.f)).booleanValue()) {
            jSONObject2.put("extra_parameters", com.applovin.impl.sdk.e.f.a((Map<String, ?>) com.applovin.impl.sdk.e.f.a(this.f2728c.a())));
        }
        if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.V)).booleanValue()) {
            jSONObject2.put("n", String.valueOf(com.applovin.impl.sdk.f.a(this.f3073b.s()).b(this.f2727a)));
        }
        jSONObject.put("ad_info", jSONObject2);
    }

    private String f() {
        return com.applovin.impl.mediation.c.b.a(this.f3073b);
    }

    private void f(JSONObject jSONObject) throws JSONException {
        k G = this.f3073b.G();
        k.d a2 = G.a();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("brand", a2.f3314d);
        jSONObject2.put("brand_name", a2.e);
        jSONObject2.put("hardware", a2.f);
        jSONObject2.put("api_level", a2.h);
        jSONObject2.put(com.umeng.commonsdk.proguard.d.O, a2.j);
        jSONObject2.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, a2.i);
        jSONObject2.put("locale", a2.k);
        jSONObject2.put("model", a2.f3311a);
        jSONObject2.put(com.umeng.commonsdk.proguard.d.w, a2.f3312b);
        jSONObject2.put(TapjoyConstants.TJC_PLATFORM, a2.f3313c);
        jSONObject2.put("revision", a2.g);
        jSONObject2.put("orientation_lock", a2.l);
        jSONObject2.put("tz_offset", a2.o);
        jSONObject2.put("wvvc", a2.p);
        jSONObject2.put("adns", a2.m);
        jSONObject2.put("adnsd", a2.n);
        jSONObject2.put("sim", i.a(a2.u));
        jSONObject2.put("gy", i.a(a2.v));
        jSONObject2.put(ProductRequestItem.Device.TYPE_TV, i.a(a2.w));
        jSONObject2.put("fs", a2.y);
        jSONObject2.put("adr", i.a(a2.q));
        jSONObject2.put("volume", a2.s);
        jSONObject2.put("network", com.applovin.impl.sdk.e.e.d(this.f3073b));
        if (i.b(a2.t)) {
            jSONObject2.put("ua", a2.t);
        }
        if (i.b(a2.x)) {
            jSONObject2.put("so", a2.x);
        }
        k.c cVar = a2.r;
        if (cVar != null) {
            jSONObject2.put("act", cVar.f3309a);
            jSONObject2.put("acm", cVar.f3310b);
        }
        Boolean bool = a2.z;
        if (bool != null) {
            jSONObject2.put("huc", bool.toString());
        }
        Boolean bool2 = a2.A;
        if (bool2 != null) {
            jSONObject2.put("aru", bool2.toString());
        }
        Point a3 = com.applovin.impl.sdk.e.d.a(d());
        jSONObject2.put("dx", Integer.toString(a3.x));
        jSONObject2.put("dy", Integer.toString(a3.y));
        g(jSONObject2);
        jSONObject.put("device_info", jSONObject2);
        k.b c2 = G.c();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(com.umeng.commonsdk.proguard.d.n, c2.f3307c);
        jSONObject3.put("installer_name", c2.f3308d);
        jSONObject3.put("app_name", c2.f3305a);
        jSONObject3.put("app_version", c2.f3306b);
        jSONObject3.put("installed_at", c2.f);
        jSONObject3.put("tg", c2.e);
        jSONObject3.put("api_did", this.f3073b.a(com.applovin.impl.sdk.b.b.M));
        jSONObject3.put("sdk_version", AppLovinSdk.VERSION);
        jSONObject3.put("build", 109);
        jSONObject3.put("test_ads", this.f3073b.l().isTestAdsEnabled());
        jSONObject3.put("first_install", String.valueOf(this.f3073b.A()));
        String str = (String) this.f3073b.a(com.applovin.impl.sdk.b.b.ei);
        if (i.b(str)) {
            jSONObject3.put("plugin_version", str);
        }
        jSONObject.put("app_info", jSONObject3);
    }

    private String g() {
        return com.applovin.impl.mediation.c.b.b(this.f3073b);
    }

    private void g(JSONObject jSONObject) {
        try {
            k.a d2 = this.f3073b.G().d();
            String str = d2.f3304b;
            if (i.b(str)) {
                jSONObject.put("idfa", str);
            }
            jSONObject.put("dnt", d2.f3303a);
        } catch (Throwable th) {
            a("Failed to populate advertising info", th);
        }
    }

    private JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        e(jSONObject);
        f(jSONObject);
        d(jSONObject);
        c(jSONObject);
        jSONObject.put(WebUtils.SC, i.e((String) this.f3073b.a(com.applovin.impl.sdk.b.b.Q)));
        jSONObject.put("sc2", i.e((String) this.f3073b.a(com.applovin.impl.sdk.b.b.R)));
        jSONObject.put("server_installed_at", i.e((String) this.f3073b.a(com.applovin.impl.sdk.b.b.S)));
        String str = (String) this.f3073b.a(com.applovin.impl.sdk.b.d.r);
        if (i.b(str)) {
            jSONObject.put("persisted_data", i.e(str));
        }
        return jSONObject;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.C;
    }

    public void a(JSONArray jSONArray) {
        this.f = jSONArray;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Fetching next ad for ad unit id: " + this.f2727a);
        h D = this.f3073b.D();
        D.a(g.p);
        a(D);
        try {
            JSONObject h = h();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (h.has("huc")) {
                hashMap.put("huc", String.valueOf(com.applovin.impl.sdk.e.f.a(h, "huc", (Boolean) false, this.f3073b)));
            }
            if (h.has("aru")) {
                hashMap.put("aru", String.valueOf(com.applovin.impl.sdk.e.f.a(h, "aru", (Boolean) false, this.f3073b)));
            }
            if (!((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.eU)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3073b.s());
            }
            w<JSONObject> wVar = new w<JSONObject>(com.applovin.impl.sdk.network.b.a(this.f3073b).b("POST").a(f()).c(g()).a((Map<String, String>) hashMap).a(h).a((b.a) new JSONObject()).b(((Long) this.f3073b.a(com.applovin.impl.sdk.b.a.e)).intValue()).a(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dO)).intValue()).c(((Long) this.f3073b.a(com.applovin.impl.sdk.b.a.f2998d)).intValue()).a(), this.f3073b) { // from class: com.applovin.impl.mediation.b.c.1
                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(int i) {
                    c.this.a(i);
                }

                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(JSONObject jSONObject, int i) {
                    if (i != 200) {
                        c.this.a(i);
                        return;
                    }
                    com.applovin.impl.sdk.e.f.b(jSONObject, "ad_fetch_latency_millis", this.f3144d.a(), this.f3073b);
                    com.applovin.impl.sdk.e.f.b(jSONObject, "ad_fetch_response_size", this.f3144d.b(), this.f3073b);
                    c.this.a(jSONObject);
                }
            };
            wVar.a(com.applovin.impl.sdk.b.a.f2995a);
            wVar.b(com.applovin.impl.sdk.b.a.f2996b);
            this.f3073b.C().a(wVar);
        } catch (Throwable th) {
            a("Unable to fetch ad " + this.f2727a, th);
            a(0);
            this.f3073b.E().a(a());
        }
    }
}
