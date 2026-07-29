package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.network.b;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.d f3105a;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinAdLoadListener f3106c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3107d;

    public m(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", jVar);
    }

    m(com.applovin.impl.sdk.ad.d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.j jVar) {
        super(str, jVar);
        this.f3107d = false;
        this.f3105a = dVar;
        this.f3106c = appLovinAdLoadListener;
    }

    private void a(com.applovin.impl.sdk.c.h hVar) {
        if (System.currentTimeMillis() - hVar.b(com.applovin.impl.sdk.c.g.f3052c) > TimeUnit.MINUTES.toMillis(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.ea)).intValue())) {
            hVar.b(com.applovin.impl.sdk.c.g.f3052c, System.currentTimeMillis());
            hVar.c(com.applovin.impl.sdk.c.g.f3053d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        boolean z = i != 204;
        b().u().a(c(), Boolean.valueOf(z), "Unable to fetch " + this.f3105a + " ad: server returned " + i);
        try {
            a(i);
        } catch (Throwable th) {
            b().u().c(c(), "Unable process a failure to recieve an ad", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.e.e.d(jSONObject, this.f3073b);
        com.applovin.impl.sdk.e.e.c(jSONObject, this.f3073b);
        this.f3073b.h();
        com.applovin.impl.sdk.e.e.e(jSONObject, this.f3073b);
        a a2 = a(jSONObject);
        if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.eY)).booleanValue()) {
            this.f3073b.C().a(a2);
        } else {
            this.f3073b.C().a(a2, q.a.MAIN);
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.n;
    }

    protected a a(JSONObject jSONObject) {
        return new r(jSONObject, this.f3105a, g(), this.f3106c, this.f3073b);
    }

    protected void a(int i) {
        if (this.f3106c != null) {
            if (this.f3106c instanceof com.applovin.impl.sdk.m) {
                ((com.applovin.impl.sdk.m) this.f3106c).a(this.f3105a, i);
            } else {
                this.f3106c.failedToReceiveAd(i);
            }
        }
    }

    public void a(boolean z) {
        this.f3107d = z;
    }

    Map<String, String> f() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", com.applovin.impl.sdk.e.i.e(this.f3105a.a()));
        if (this.f3105a.b() != null) {
            hashMap.put("size", this.f3105a.b().getLabel());
        }
        if (this.f3105a.c() != null) {
            hashMap.put("require", this.f3105a.c().getLabel());
        }
        if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.V)).booleanValue()) {
            hashMap.put("n", String.valueOf(com.applovin.impl.sdk.f.a(this.f3073b.s()).b(this.f3105a.a())));
        }
        return hashMap;
    }

    protected com.applovin.impl.sdk.ad.b g() {
        return this.f3105a.l() ? com.applovin.impl.sdk.ad.b.APPLOVIN_PRIMARY_ZONE : com.applovin.impl.sdk.ad.b.APPLOVIN_CUSTOM_ZONE;
    }

    protected String h() {
        return com.applovin.impl.sdk.e.e.e(this.f3073b);
    }

    protected String i() {
        return com.applovin.impl.sdk.e.e.f(this.f3073b);
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb;
        String str;
        if (this.f3107d) {
            sb = new StringBuilder();
            str = "Preloading next ad of zone: ";
        } else {
            sb = new StringBuilder();
            str = "Fetching next ad of zone: ";
        }
        sb.append(str);
        sb.append(this.f3105a);
        a(sb.toString());
        com.applovin.impl.sdk.c.h D = this.f3073b.D();
        D.a(com.applovin.impl.sdk.c.g.f3050a);
        a(D);
        try {
            w<JSONObject> wVar = new w<JSONObject>(com.applovin.impl.sdk.network.b.a(this.f3073b).a(h()).a(this.f3073b.G().a(f(), this.f3107d, false)).c(i()).b("GET").a((b.a) new JSONObject()).a(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dO)).intValue()).b(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.dN)).intValue()).a(), this.f3073b) { // from class: com.applovin.impl.sdk.d.m.1
                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(int i) {
                    m.this.b(i);
                }

                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(JSONObject jSONObject, int i) {
                    if (i != 200) {
                        m.this.b(i);
                        return;
                    }
                    com.applovin.impl.sdk.e.f.b(jSONObject, "ad_fetch_latency_millis", this.f3144d.a(), this.f3073b);
                    com.applovin.impl.sdk.e.f.b(jSONObject, "ad_fetch_response_size", this.f3144d.b(), this.f3073b);
                    m.this.b(jSONObject);
                }
            };
            wVar.a(com.applovin.impl.sdk.b.b.aw);
            wVar.b(com.applovin.impl.sdk.b.b.ax);
            this.f3073b.C().a(wVar);
        } catch (Throwable th) {
            a("Unable to fetch ad " + this.f3105a, th);
            b(0);
            this.f3073b.E().a(a());
        }
    }
}
