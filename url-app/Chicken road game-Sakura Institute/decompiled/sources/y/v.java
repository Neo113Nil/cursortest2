package y;

import A.a0;
import G.C0192d;
import G.C0205j0;
import G.W;
import r0.InterfaceC1071l;
import r0.InterfaceC1072m;
import r0.InterfaceC1075p;
import w.P;

/* loaded from: classes.dex */
public final class v extends S.n implements InterfaceC1071l, InterfaceC1075p, InterfaceC1072m {

    /* renamed from: t, reason: collision with root package name */
    public C1316f f11499t;

    /* renamed from: u, reason: collision with root package name */
    public P f11500u;

    /* renamed from: v, reason: collision with root package name */
    public a0 f11501v;

    /* renamed from: w, reason: collision with root package name */
    public final C0205j0 f11502w = C0192d.K(null, W.f2779l);

    public v(C1316f c1316f, P p4, a0 a0Var) {
        this.f11499t = c1316f;
        this.f11500u = p4;
        this.f11501v = a0Var;
    }

    @Override // r0.InterfaceC1075p
    public final void H(r0.a0 a0Var) {
        this.f11502w.setValue(a0Var);
    }

    @Override // S.n
    public final void t0() {
        C1316f c1316f = this.f11499t;
        if (c1316f.f11475a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        c1316f.f11475a = this;
    }

    @Override // S.n
    public final void u0() {
        this.f11499t.k(this);
    }
}
