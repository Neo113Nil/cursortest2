package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3382ip implements InterfaceC2944al, InterfaceC2592Hl, InterfaceC2608Ik, InterfaceC2506Ck {

    /* renamed from: n, reason: collision with root package name */
    public final Context f32006n;

    /* renamed from: u, reason: collision with root package name */
    public final C3165eo f32007u;

    public C3382ip(Context context, C3165eo c3165eo) {
        this.f32006n = context;
        this.f32007u = c3165eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    public final void C(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31406B5)).booleanValue()) {
            b(this.f32006n);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    public final void a(B2.u uVar) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31414C5)).booleanValue()) {
            b(this.f32006n);
        }
    }

    public final void b(Context context) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31848z5)).booleanValue()) {
            AbstractC3212fg.f30738a.execute(new RunnableC3329hp(0, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31422D5)).booleanValue()) {
            b(this.f32006n);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31430E5)).booleanValue()) {
            b(this.f32006n);
        }
    }
}
