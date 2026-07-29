package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.d.q;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;

/* loaded from: classes.dex */
class v extends a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.a.c f3140a;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinAdLoadListener f3141c;

    v(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskRenderVastAd", jVar);
        if (cVar == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f3141c = appLovinAdLoadListener;
        this.f3140a = cVar;
    }

    private void a(com.applovin.impl.a.d dVar, Throwable th) {
        a("Failed to render valid VAST ad", th);
        com.applovin.impl.a.i.a(this.f3140a, this.f3141c, dVar, -6, this.f3073b);
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.v;
    }

    @Override // java.lang.Runnable
    public void run() {
        a("Rendering VAST ad...");
        int size = this.f3140a.b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        com.applovin.impl.a.j jVar = null;
        com.applovin.impl.a.b bVar = null;
        String str2 = "";
        com.applovin.impl.a.f fVar = null;
        for (com.applovin.impl.sdk.e.m mVar : this.f3140a.b()) {
            com.applovin.impl.sdk.e.m c2 = mVar.c(com.applovin.impl.a.i.a(mVar) ? "Wrapper" : "InLine");
            if (c2 != null) {
                com.applovin.impl.sdk.e.m c3 = c2.c("AdSystem");
                if (c3 != null) {
                    fVar = com.applovin.impl.a.f.a(c3, fVar, this.f3073b);
                }
                str2 = com.applovin.impl.a.i.a(c2, "AdTitle", str2);
                str = com.applovin.impl.a.i.a(c2, "Description", str);
                com.applovin.impl.a.i.a(c2.a("Impression"), hashSet, this.f3140a, this.f3073b);
                com.applovin.impl.a.i.a(c2.a("Error"), hashSet2, this.f3140a, this.f3073b);
                com.applovin.impl.sdk.e.m b2 = c2.b("Creatives");
                if (b2 != null) {
                    for (com.applovin.impl.sdk.e.m mVar2 : b2.d()) {
                        com.applovin.impl.sdk.e.m b3 = mVar2.b("Linear");
                        if (b3 != null) {
                            jVar = com.applovin.impl.a.j.a(b3, jVar, this.f3140a, this.f3073b);
                        } else {
                            com.applovin.impl.sdk.e.m c4 = mVar2.c("CompanionAds");
                            if (c4 != null) {
                                com.applovin.impl.sdk.e.m c5 = c4.c("Companion");
                                if (c5 != null) {
                                    bVar = com.applovin.impl.a.b.a(c5, bVar, this.f3140a, this.f3073b);
                                }
                            } else {
                                d("Received and will skip rendering for an unidentified creative: " + mVar2);
                            }
                        }
                    }
                }
            } else {
                d("Did not find wrapper or inline response for node: " + mVar);
            }
        }
        try {
            com.applovin.impl.a.a a2 = com.applovin.impl.a.a.ay().a(this.f3073b).a(this.f3140a.c()).b(this.f3140a.d()).a(this.f3140a.e()).a(this.f3140a.f()).a(str2).b(str).a(fVar).a(jVar).a(bVar).a(hashSet).b(hashSet2).a();
            com.applovin.impl.a.d a3 = com.applovin.impl.a.i.a(a2);
            if (a3 != null) {
                a(a3, (Throwable) null);
                return;
            }
            h hVar = new h(a2, this.f3073b, this.f3141c);
            q.a aVar = q.a.CACHING_OTHER;
            if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.aS)).booleanValue()) {
                if (a2.getType() == AppLovinAdType.REGULAR) {
                    aVar = q.a.CACHING_INTERSTITIAL;
                } else if (a2.getType() == AppLovinAdType.INCENTIVIZED) {
                    aVar = q.a.CACHING_INCENTIVIZED;
                }
            }
            this.f3073b.C().a(hVar, aVar);
        } catch (Throwable th) {
            a(com.applovin.impl.a.d.GENERAL_WRAPPER_ERROR, th);
            this.f3073b.E().a(a());
        }
    }
}
