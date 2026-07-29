package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.network.b;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
class y extends a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.a.c f3149a;

    /* renamed from: c, reason: collision with root package name */
    private final AppLovinAdLoadListener f3150c;

    y(com.applovin.impl.a.c cVar, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskResolveVastWrapper", jVar);
        this.f3150c = appLovinAdLoadListener;
        this.f3149a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        d("Failed to resolve VAST wrapper due to error code " + i);
        if (i == -103) {
            com.applovin.impl.sdk.e.l.a(this.f3150c, this.f3149a.g(), i, this.f3073b);
        } else {
            com.applovin.impl.a.i.a(this.f3149a, this.f3150c, i == -102 ? com.applovin.impl.a.d.TIMED_OUT : com.applovin.impl.a.d.GENERAL_WRAPPER_ERROR, i, this.f3073b);
        }
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.x;
    }

    @Override // java.lang.Runnable
    public void run() {
        String a2 = com.applovin.impl.a.i.a(this.f3149a);
        if (!com.applovin.impl.sdk.e.i.b(a2)) {
            d("Resolving VAST failed. Could not find resolution URL");
            a(-1);
            return;
        }
        a("Resolving VAST ad with depth " + this.f3149a.a() + " at " + a2);
        try {
            this.f3073b.C().a(new w<com.applovin.impl.sdk.e.m>(com.applovin.impl.sdk.network.b.a(this.f3073b).a(a2).b("GET").a((b.a) com.applovin.impl.sdk.e.m.f3253a).a(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.eR)).intValue()).b(((Integer) this.f3073b.a(com.applovin.impl.sdk.b.b.eS)).intValue()).a(false).a(), this.f3073b) { // from class: com.applovin.impl.sdk.d.y.1
                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(int i) {
                    d("Unable to resolve VAST wrapper. Server returned " + i);
                    y.this.a(i);
                }

                @Override // com.applovin.impl.sdk.d.w, com.applovin.impl.sdk.network.a.b
                public void a(com.applovin.impl.sdk.e.m mVar, int i) {
                    this.f3073b.C().a(s.a(mVar, y.this.f3149a, y.this.f3150c, y.this.f3073b));
                }
            });
        } catch (Throwable th) {
            a("Unable to resolve VAST wrapper", th);
            a(-1);
            this.f3073b.E().a(a());
        }
    }
}
