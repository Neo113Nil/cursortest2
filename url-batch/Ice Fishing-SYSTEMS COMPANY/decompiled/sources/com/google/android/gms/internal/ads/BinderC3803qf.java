package com.google.android.gms.internal.ads;

import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.qf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3803qf extends AbstractBinderC3533lf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33734n;

    /* renamed from: u, reason: collision with root package name */
    public final k2.x f33735u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f33736v;

    public /* synthetic */ BinderC3803qf(k2.x xVar, Object obj, int i) {
        this.f33734n = i;
        this.f33735u = xVar;
        this.f33736v = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void a(C4927z0 c4927z0) {
        switch (this.f33734n) {
            case 0:
                F2.d dVar = (F2.d) this.f33735u;
                if (dVar != null) {
                    dVar.onAdFailedToLoad(c4927z0.b());
                    break;
                }
                break;
            default:
                G2.b bVar = (G2.b) this.f33735u;
                if (bVar != null) {
                    bVar.onAdFailedToLoad(c4927z0.b());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void c() {
        C4018uf c4018uf;
        switch (this.f33734n) {
            case 0:
                F2.d dVar = (F2.d) this.f33735u;
                if (dVar != null) {
                    dVar.onAdLoaded((C3695of) this.f33736v);
                    break;
                }
                break;
            default:
                G2.b bVar = (G2.b) this.f33735u;
                if (bVar != null && (c4018uf = (C4018uf) this.f33736v) != null) {
                    bVar.onAdLoaded(c4018uf);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void s(int i) {
        int i4 = this.f33734n;
    }

    private final void G3(int i) {
    }

    private final void H3(int i) {
    }
}
