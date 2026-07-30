package com.google.android.gms.internal.ads;

import android.content.Context;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final class Qu implements InterfaceC4024ul, InterfaceC2472Ak, InterfaceC4132wl {

    /* renamed from: n, reason: collision with root package name */
    public final Yu f27265n;

    /* renamed from: u, reason: collision with root package name */
    public final Vu f27266u;

    public Qu(Context context, Yu yu) {
        this.f27265n = yu;
        this.f27266u = Vu.f(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4132wl
    public final void a() {
        if (((Boolean) AbstractC2547Fa.f24967d.r()).booleanValue()) {
            Vu vu = this.f27266u;
            vu.b(true);
            this.f27265n.a(vu);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2472Ak
    public final void b(C4927z0 c4927z0) {
        if (((Boolean) AbstractC2547Fa.f24967d.r()).booleanValue()) {
            String c4630a = c4927z0.a().toString();
            Vu vu = this.f27266u;
            vu.h(c4630a);
            vu.b(false);
            this.f27265n.a(vu);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024ul
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4024ul
    public final void g() {
        if (((Boolean) AbstractC2547Fa.f24967d.r()).booleanValue()) {
            this.f27266u.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4132wl
    public final void z() {
    }
}
