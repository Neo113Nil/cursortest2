package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fv<AdT> extends bx {

    /* renamed from: f, reason: collision with root package name */
    private final r2.e<AdT> f5245f;

    /* renamed from: g, reason: collision with root package name */
    private final AdT f5246g;

    public fv(r2.e<AdT> eVar, AdT adt) {
        this.f5245f = eVar;
        this.f5246g = adt;
    }

    @Override // com.google.android.gms.internal.ads.dx
    public final void c() {
        AdT adt;
        r2.e<AdT> eVar = this.f5245f;
        if (eVar == null || (adt = this.f5246g) == null) {
            return;
        }
        eVar.e(adt);
    }

    @Override // com.google.android.gms.internal.ads.dx
    public final void o0(cv cvVar) {
        r2.e<AdT> eVar = this.f5245f;
        if (eVar != null) {
            eVar.c(cvVar.g());
        }
    }
}
