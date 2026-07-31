package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tk0 extends mk0 {

    /* renamed from: f, reason: collision with root package name */
    private final i3.d f12252f;

    /* renamed from: g, reason: collision with root package name */
    private final i3.c f12253g;

    public tk0(i3.d dVar, i3.c cVar) {
        this.f12252f = dVar;
        this.f12253g = cVar;
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void D(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void e() {
        i3.d dVar = this.f12252f;
        if (dVar != null) {
            dVar.e(this.f12253g);
        }
    }

    @Override // com.google.android.gms.internal.ads.nk0
    public final void w(cv cvVar) {
        if (this.f12252f != null) {
            this.f12252f.c(cvVar.g());
        }
    }
}
