package com.applovin.impl.sdk.d;

import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.b;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.common.stats.LoggingConstants;
import com.tapjoy.TapjoyConstants;
import com.youappi.sdk.net.model.ProductRequestItem;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class b extends a {
    b(com.applovin.impl.sdk.j jVar) {
        super("TaskApiSubmitData", jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            this.f3073b.H().c();
            JSONObject a2 = com.applovin.impl.sdk.e.e.a(jSONObject);
            com.applovin.impl.sdk.b.c v = this.f3073b.v();
            v.a(com.applovin.impl.sdk.b.b.M, a2.getString("device_id"));
            v.a(com.applovin.impl.sdk.b.b.O, a2.getString("device_token"));
            v.a(com.applovin.impl.sdk.b.b.N, a2.getString("publisher_id"));
            v.a();
            com.applovin.impl.sdk.e.e.d(a2, this.f3073b);
            this.f3073b.h();
            com.applovin.impl.sdk.e.e.e(a2, this.f3073b);
            String a3 = com.applovin.impl.sdk.e.f.a(a2, "latest_version", "", this.f3073b);
            if (e(a3)) {
                this.f3073b.u().e("ALSdk", "Please integrate the latest version of the AppLovin SDK (" + a3 + "). Not doing so can negatively impact your eCPMs!");
            }
            this.f3073b.D().b();
            this.f3073b.E().b();
        } catch (Throwable th) {
            a("Unable to parse API response", th);
        }
    }

    private void b(JSONObject jSONObject) throws JSONException {
        com.applovin.impl.sdk.k G = this.f3073b.G();
        k.b c2 = G.c();
        k.d a2 = G.a();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("model", a2.f3311a);
        jSONObject2.put(com.umeng.commonsdk.proguard.d.w, a2.f3312b);
        jSONObject2.put("brand", a2.f3314d);
        jSONObject2.put("brand_name", a2.e);
        jSONObject2.put("hardware", a2.f);
        jSONObject2.put("sdk_version", a2.h);
        jSONObject2.put("revision", a2.g);
        jSONObject2.put("adns", a2.m);
        jSONObject2.put("adnsd", a2.n);
        jSONObject2.put("gy", com.applovin.impl.sdk.e.i.a(a2.v));
        jSONObject2.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, a2.i);
        jSONObject2.put(com.umeng.commonsdk.proguard.d.O, a2.j);
        jSONObject2.put("orientation_lock", a2.l);
        jSONObject2.put("tz_offset", a2.o);
        jSONObject2.put("adr", com.applovin.impl.sdk.e.i.a(a2.q));
        jSONObject2.put("wvvc", a2.p);
        jSONObject2.put("volume", a2.s);
        jSONObject2.put("type", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
        jSONObject2.put("sim", com.applovin.impl.sdk.e.i.a(a2.u));
        jSONObject2.put(ProductRequestItem.Device.TYPE_TV, com.applovin.impl.sdk.e.i.a(a2.w));
        jSONObject2.put("fs", a2.y);
        g(jSONObject2);
        Boolean bool = a2.z;
        if (bool != null) {
            jSONObject2.put("huc", bool.toString());
        }
        Boolean bool2 = a2.A;
        if (bool2 != null) {
            jSONObject2.put("aru", bool2.toString());
        }
        k.c cVar = a2.r;
        if (cVar != null) {
            jSONObject2.put("act", cVar.f3309a);
            jSONObject2.put("acm", cVar.f3310b);
        }
        String str = a2.t;
        if (com.applovin.impl.sdk.e.i.b(str)) {
            jSONObject2.put("ua", com.applovin.impl.sdk.e.i.e(str));
        }
        String str2 = a2.x;
        if (!TextUtils.isEmpty(str2)) {
            jSONObject2.put("so", com.applovin.impl.sdk.e.i.e(str2));
        }
        Locale locale = a2.k;
        if (locale != null) {
            jSONObject2.put("locale", com.applovin.impl.sdk.e.i.e(locale.toString()));
        }
        jSONObject.put("device_info", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(com.umeng.commonsdk.proguard.d.n, c2.f3307c);
        jSONObject3.put("installer_name", c2.f3308d);
        jSONObject3.put("app_name", c2.f3305a);
        jSONObject3.put("app_version", c2.f3306b);
        jSONObject3.put("installed_at", c2.f);
        jSONObject3.put("tg", c2.e);
        jSONObject3.put("applovin_sdk_version", AppLovinSdk.VERSION);
        jSONObject3.put("first_install", String.valueOf(this.f3073b.A()));
        String str3 = (String) this.f3073b.a(com.applovin.impl.sdk.b.b.ei);
        if (str3 != null && str3.length() > 0) {
            jSONObject3.put("plugin_version", str3);
        }
        jSONObject.put("app_info", jSONObject3);
    }

    private void c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.eA)).booleanValue()) {
            jSONObject.put(LoggingConstants.LOG_FILE_PREFIX, this.f3073b.D().c());
        }
        if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.Z)).booleanValue()) {
            JSONObject b2 = com.applovin.impl.sdk.network.c.b(d());
            if (b2.length() > 0) {
                jSONObject.put("network_response_codes", b2);
            }
            if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.aa)).booleanValue()) {
                com.applovin.impl.sdk.network.c.a(d());
            }
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray a2;
        if (!((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.eG)).booleanValue() || (a2 = this.f3073b.H().a()) == null || a2.length() <= 0) {
            return;
        }
        jSONObject.put("errors", a2);
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONArray a2;
        if (!((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.eF)).booleanValue() || (a2 = this.f3073b.E().a()) == null || a2.length() <= 0) {
            return;
        }
        jSONObject.put("tasks", a2);
    }

    private boolean e(String str) {
        try {
            if (com.applovin.impl.sdk.e.i.b(str) && !AppLovinSdk.VERSION.equals(str)) {
                List<String> a2 = com.applovin.impl.sdk.e.c.a(str, "\\.");
                List<String> a3 = com.applovin.impl.sdk.e.c.a(AppLovinSdk.VERSION, "\\.");
                if (a2.size() == 3 && a3.size() == 3) {
                    for (int i = 0; i < 3; i++) {
                        int parseInt = Integer.parseInt(a3.get(i));
                        int parseInt2 = Integer.parseInt(a2.get(i));
                        if (parseInt < parseInt2) {
                            return true;
                        }
                        if (parseInt > parseInt2) {
                            return false;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a("Encountered exception while checking if current version is outdated", th);
        }
        return false;
    }

    private void f(JSONObject jSONObject) {
        w<JSONObject> wVar = new w<JSONObject>(com.applovin.impl.sdk.network.b.a(this.f3073b).a(com.applovin.impl.sdk.e.e.a("2.0/device", this.f3073b)).c(com.applovin.impl.sdk.e.e.b("2.0/device", this.f3073b)).a(com.applovin.impl.sdk.e.e.c(this.f3073b)).b("POST").a(jSONObject).a((b.a) new JSONObject()).a(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dS)).intValue()).a(), this.f3073b) { // from class: com.applovin.impl.sdk.d.b.1
            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(int i) {
                com.applovin.impl.sdk.e.e.a(i, this.f3073b);
            }

            @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
            public void a(JSONObject jSONObject2, int i) {
                b.this.a(jSONObject2);
            }
        };
        wVar.a(com.applovin.impl.sdk.b.b.ay);
        wVar.b(com.applovin.impl.sdk.b.b.az);
        this.f3073b.C().a(wVar);
    }

    private void g(JSONObject jSONObject) {
        try {
            k.a d2 = this.f3073b.G().d();
            String str = d2.f3304b;
            if (com.applovin.impl.sdk.e.i.b(str)) {
                jSONObject.put("idfa", str);
            }
            jSONObject.put("dnt", Boolean.toString(d2.f3303a));
        } catch (Throwable th) {
            a("Failed to populate advertising info", th);
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.h;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b("Submitting user data...");
            JSONObject jSONObject = new JSONObject();
            b(jSONObject);
            c(jSONObject);
            d(jSONObject);
            e(jSONObject);
            f(jSONObject);
        } catch (JSONException e) {
            a("Unable to build JSON message with collected data", e);
            this.f3073b.E().a(a());
        }
    }
}
