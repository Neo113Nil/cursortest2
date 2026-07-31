package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qz0 implements ls1 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f10920a;

    /* renamed from: b, reason: collision with root package name */
    private og1 f10921b;

    /* renamed from: c, reason: collision with root package name */
    private ha1 f10922c;

    /* renamed from: d, reason: collision with root package name */
    private kp2 f10923d;

    /* renamed from: e, reason: collision with root package name */
    private ko2 f10924e;

    /* synthetic */ qz0(b01 b01Var, pz0 pz0Var) {
        this.f10920a = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.ls1
    public final /* synthetic */ ls1 a(ha1 ha1Var) {
        this.f10922c = ha1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ms1 f() {
        sv3.c(this.f10921b, og1.class);
        sv3.c(this.f10922c, ha1.class);
        return new tz0(this.f10920a, new c81(), new ht2(), new o91(), new kw1(), this.f10921b, this.f10922c, new lt2(), null, this.f10923d, this.f10924e, null);
    }

    @Override // com.google.android.gms.internal.ads.ls1
    public final /* synthetic */ ls1 c(og1 og1Var) {
        this.f10921b = og1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* synthetic */ ca1<ms1> l(kp2 kp2Var) {
        this.f10923d = kp2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final /* synthetic */ ca1<ms1> o(ko2 ko2Var) {
        this.f10924e = ko2Var;
        return this;
    }
}
