package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ue4 implements rc4 {

    /* renamed from: f, reason: collision with root package name */
    private final long f12768f;

    /* renamed from: g, reason: collision with root package name */
    private final rc4 f12769g;

    public ue4(long j7, rc4 rc4Var) {
        this.f12768f = j7;
        this.f12769g = rc4Var;
    }

    @Override // com.google.android.gms.internal.ads.rc4
    public final void H() {
        this.f12769g.H();
    }

    @Override // com.google.android.gms.internal.ads.rc4
    public final void p(pd4 pd4Var) {
        this.f12769g.p(new te4(this, pd4Var));
    }

    @Override // com.google.android.gms.internal.ads.rc4
    public final td4 r(int i7, int i8) {
        return this.f12769g.r(i7, i8);
    }
}
