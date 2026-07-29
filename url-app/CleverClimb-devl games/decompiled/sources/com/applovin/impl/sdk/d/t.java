package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.d.q;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* loaded from: classes.dex */
class t extends a {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f3135a;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f3136c;

    /* renamed from: d, reason: collision with root package name */
    private final AppLovinAdLoadListener f3137d;
    private final com.applovin.impl.sdk.ad.b e;

    t(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderAppLovinAd", jVar);
        this.f3135a = jSONObject;
        this.f3136c = jSONObject2;
        this.e = bVar;
        this.f3137d = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.t;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Rendering ad...");
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f3135a, this.f3136c, this.e, this.f3073b);
        boolean booleanValue = com.applovin.impl.sdk.e.f.a(this.f3135a, "gs_load_immediately", (Boolean) true, this.f3073b).booleanValue();
        boolean booleanValue2 = com.applovin.impl.sdk.e.f.a(this.f3135a, "vs_load_immediately", (Boolean) true, this.f3073b).booleanValue();
        d dVar = new d(aVar, this.f3073b, this.f3137d);
        dVar.a(booleanValue2);
        dVar.b(booleanValue);
        q.a aVar2 = q.a.CACHING_OTHER;
        if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.aS)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = q.a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = q.a.CACHING_INCENTIVIZED;
            }
        }
        this.f3073b.C().a(dVar, aVar2);
    }
}
