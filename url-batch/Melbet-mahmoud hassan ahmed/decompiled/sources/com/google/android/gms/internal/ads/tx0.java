package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class tx0 implements u31 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f12399a;

    /* renamed from: b, reason: collision with root package name */
    private og1 f12400b;

    /* renamed from: c, reason: collision with root package name */
    private ha1 f12401c;

    /* renamed from: d, reason: collision with root package name */
    private kp2 f12402d;

    /* renamed from: e, reason: collision with root package name */
    private ko2 f12403e;

    /* synthetic */ tx0(b01 b01Var, sx0 sx0Var) {
        this.f12399a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.u31
    public final /* synthetic */ u31 a(ha1 ha1Var) {
        this.f12401c = ha1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.u31
    public final /* synthetic */ u31 c(og1 og1Var) {
        this.f12400b = og1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* bridge */ /* synthetic */ v31 f() {
        sv3.c(this.f12400b, og1.class);
        sv3.c(this.f12401c, ha1.class);
        return new vx0(this.f12399a, new c81(), new ht2(), new o91(), new kw1(), this.f12400b, this.f12401c, new lt2(), null, this.f12402d, this.f12403e, null);
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* synthetic */ ca1<v31> l(kp2 kp2Var) {
        this.f12402d = kp2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* synthetic */ ca1<v31> o(ko2 ko2Var) {
        this.f12403e = ko2Var;
        return this;
    }
}
