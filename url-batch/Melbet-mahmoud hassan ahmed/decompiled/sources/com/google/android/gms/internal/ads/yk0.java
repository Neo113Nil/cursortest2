package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yk0 extends mk0 {

    /* renamed from: f, reason: collision with root package name */
    private final j3.b f14716f;

    /* renamed from: g, reason: collision with root package name */
    private final zk0 f14717g;

    public yk0(j3.b bVar, zk0 zk0Var) {
        this.f14716f = bVar;
        this.f14717g = zk0Var;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void D(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void e() {
        zk0 zk0Var;
        j3.b bVar = this.f14716f;
        if (bVar == null || (zk0Var = this.f14717g) == null) {
            return;
        }
        bVar.e(zk0Var);
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void w(cv cvVar) {
        j3.b bVar = this.f14716f;
        if (bVar != null) {
            bVar.c(cvVar.g());
        }
    }
}
