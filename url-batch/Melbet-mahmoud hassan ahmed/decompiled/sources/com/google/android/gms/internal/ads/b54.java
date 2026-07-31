package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class b54 implements d64, w24 {

    /* renamed from: f, reason: collision with root package name */
    private final Object f3259f;

    /* renamed from: g, reason: collision with root package name */
    private c64 f3260g;

    /* renamed from: h, reason: collision with root package name */
    private v24 f3261h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ d54 f3262i;

    public b54(d54 d54Var, Object obj) {
        this.f3262i = d54Var;
        this.f3260g = d54Var.n(null);
        this.f3261h = d54Var.l(null);
        this.f3259f = obj;
    }

    private final boolean a(int i7, s54 s54Var) {
        s54 s54Var2;
        if (s54Var != null) {
            s54Var2 = this.f3262i.w(this.f3259f, s54Var);
            if (s54Var2 == null) {
                return false;
            }
        } else {
            s54Var2 = null;
        }
        c64 c64Var = this.f3260g;
        if (c64Var.f3747a != i7 || !n13.p(c64Var.f3748b, s54Var2)) {
            this.f3260g = this.f3262i.o(i7, s54Var2, 0L);
        }
        v24 v24Var = this.f3261h;
        if (v24Var.f13098a == i7 && n13.p(v24Var.f13099b, s54Var2)) {
            return true;
        }
        this.f3261h = this.f3262i.m(i7, s54Var2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void A(int i7, s54 s54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f3260g.c(p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void D(int i7, s54 s54Var, k54 k54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f3260g.e(k54Var, p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void h(int i7, s54 s54Var, k54 k54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f3260g.g(k54Var, p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void r(int i7, s54 s54Var, k54 k54Var, p54 p54Var) {
        if (a(i7, s54Var)) {
            this.f3260g.k(k54Var, p54Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.d64
    public final void u(int i7, s54 s54Var, k54 k54Var, p54 p54Var, IOException iOException, boolean z6) {
        if (a(i7, s54Var)) {
            this.f3260g.i(k54Var, p54Var, iOException, z6);
        }
    }
}
