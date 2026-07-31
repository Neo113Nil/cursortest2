package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u32 implements ow2 {

    /* renamed from: f, reason: collision with root package name */
    private final r32 f12617f;

    u32(r32 r32Var) {
        this.f12617f = r32Var;
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void a(gw2 gw2Var, String str) {
        if (((Boolean) sw.c().b(m10.E4)).booleanValue() && gw2.RENDERER == gw2Var && this.f12617f.c() != 0) {
            this.f12617f.e(y2.t.a().a() - this.f12617f.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void b(gw2 gw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void s(gw2 gw2Var, String str) {
        if (((Boolean) sw.c().b(m10.E4)).booleanValue() && gw2.RENDERER == gw2Var) {
            this.f12617f.f(y2.t.a().a());
        }
    }

    @Override // com.google.android.gms.internal.ads.ow2
    public final void z(gw2 gw2Var, String str, Throwable th) {
        if (((Boolean) sw.c().b(m10.E4)).booleanValue() && gw2.RENDERER == gw2Var && this.f12617f.c() != 0) {
            this.f12617f.e(y2.t.a().a() - this.f12617f.c());
        }
    }
}
