package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ln, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3541ln implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32589a;

    /* renamed from: b, reason: collision with root package name */
    public final C2675Mj f32590b;

    /* renamed from: c, reason: collision with root package name */
    public final C3006bs f32591c;

    /* renamed from: d, reason: collision with root package name */
    public final C3913si f32592d;

    public /* synthetic */ C3541ln(C2675Mj c2675Mj, C3006bs c3006bs, C3913si c3913si, int i) {
        this.f32589a = i;
        this.f32590b = c2675Mj;
        this.f32591c = c3006bs;
        this.f32592d = c3913si;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f32589a) {
            case 0:
                return new BinderC3487kn((String) this.f32590b.f26371b.f32776w, (C3648nm) this.f32591c.d(), this.f32592d.a());
            default:
                return new BinderC3595mn((String) this.f32590b.f26371b.f32776w, (C3648nm) this.f32591c.d(), this.f32592d.a());
        }
    }
}
