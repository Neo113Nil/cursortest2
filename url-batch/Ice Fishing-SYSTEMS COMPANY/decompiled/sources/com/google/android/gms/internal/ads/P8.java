package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class P8 implements InterfaceC4156x8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26848n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f26849u;

    public P8(Q8 q82) {
        Objects.requireNonNull(q82);
        this.f26849u = q82;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4156x8
    public final void i0(boolean z8) {
        switch (this.f26848n) {
            case 0:
                Q8 q82 = (Q8) this.f26849u;
                if (!z8) {
                    q82.p();
                    break;
                } else {
                    q82.w();
                    break;
                }
            case 1:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31416D)).booleanValue()) {
                    ((Gv) this.f26849u).a(z8);
                    break;
                }
                break;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31416D)).booleanValue()) {
                    ((Mv) this.f26849u).c(z8);
                    break;
                }
                break;
        }
    }

    public P8(Gv gv) {
        Objects.requireNonNull(gv);
        this.f26849u = gv;
    }

    public P8(Mv mv) {
        Objects.requireNonNull(mv);
        this.f26849u = mv;
    }
}
