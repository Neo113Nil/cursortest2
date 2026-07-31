package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class vz0 implements g3.p {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f13647a;

    /* renamed from: b, reason: collision with root package name */
    private ha1 f13648b;

    /* renamed from: c, reason: collision with root package name */
    private g3.j0 f13649c;

    /* synthetic */ vz0(b01 b01Var, uz0 uz0Var) {
        this.f13647a = b01Var;
    }

    @Override // g3.p
    public final /* synthetic */ g3.p a(g3.j0 j0Var) {
        this.f13649c = j0Var;
        return this;
    }

    @Override // g3.p
    public final /* synthetic */ g3.p b(ha1 ha1Var) {
        this.f13648b = ha1Var;
        return this;
    }

    @Override // g3.p
    public final g3.q c() {
        sv3.c(this.f13648b, ha1.class);
        sv3.c(this.f13649c, g3.j0.class);
        return new xz0(this.f13647a, this.f13649c, new c81(), new kw1(), this.f13648b, new lt2(), null, null, null);
    }
}
