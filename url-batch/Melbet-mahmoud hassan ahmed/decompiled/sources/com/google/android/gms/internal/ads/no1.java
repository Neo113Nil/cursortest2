package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class no1 implements qb1 {

    /* renamed from: f, reason: collision with root package name */
    private final rm1 f9196f;

    /* renamed from: g, reason: collision with root package name */
    private final wm1 f9197g;

    public no1(rm1 rm1Var, wm1 wm1Var) {
        this.f9196f = rm1Var;
        this.f9197g = wm1Var;
    }

    @Override // com.google.android.gms.internal.ads.qb1
    public final void k() {
        if (this.f9196f.c0() == null) {
            return;
        }
        eu0 Y = this.f9196f.Y();
        eu0 Z = this.f9196f.Z();
        if (Y == null) {
            Y = Z != null ? Z : null;
        }
        if (!this.f9197g.c() || Y == null) {
            return;
        }
        Y.t("onSdkImpression", new h.a());
    }
}
