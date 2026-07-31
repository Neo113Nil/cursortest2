package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ox0 implements g41 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f9854a;

    /* renamed from: b, reason: collision with root package name */
    private og1 f9855b;

    /* renamed from: c, reason: collision with root package name */
    private ha1 f9856c;

    /* renamed from: d, reason: collision with root package name */
    private kp2 f9857d;

    /* renamed from: e, reason: collision with root package name */
    private ko2 f9858e;

    /* synthetic */ ox0(b01 b01Var, nx0 nx0Var) {
        this.f9854a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final /* synthetic */ g41 a(ha1 ha1Var) {
        this.f9856c = ha1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final /* synthetic */ g41 c(og1 og1Var) {
        this.f9855b = og1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* bridge */ /* synthetic */ h41 f() {
        sv3.c(this.f9855b, og1.class);
        sv3.c(this.f9856c, ha1.class);
        return new rx0(this.f9854a, new c81(), new ht2(), new o91(), new kw1(), this.f9855b, this.f9856c, new lt2(), null, this.f9857d, this.f9858e, null);
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* synthetic */ ca1<h41> l(kp2 kp2Var) {
        this.f9857d = kp2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* synthetic */ ca1<h41> o(ko2 ko2Var) {
        this.f9858e = ko2Var;
        return this;
    }
}
