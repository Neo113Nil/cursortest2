package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4140wt implements XA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3602mu f35084b;

    public /* synthetic */ C4140wt(C3602mu c3602mu, int i) {
        this.f35083a = i;
        this.f35084b = c3602mu;
    }

    @Override // com.google.android.gms.internal.ads.XA
    public final /* synthetic */ Object apply(Object obj) {
        C3602mu c3602mu = this.f35084b;
        switch (this.f35083a) {
            case 0:
                int i = t2.C.f40822b;
                u2.i.d("", (C2494Bp) obj);
                t2.C.k("Failed to get a cache key, reverting to legacy flow.");
                C4194xt c4194xt = new C4194xt(null, c3602mu.A());
                c3602mu.f32776w = c4194xt;
                return c4194xt;
            default:
                C2687Ne c2687Ne = (C2687Ne) obj;
                C4194xt c4194xt2 = new C4194xt(c2687Ne, new C4303zu(c2687Ne.f26575C));
                c3602mu.f32776w = c4194xt2;
                return c4194xt2;
        }
    }
}
