package z;

import B.a0;
import I.C0143d;
import I.C0156j0;
import I.W;
import t0.InterfaceC0998k;
import t0.InterfaceC0999l;
import t0.InterfaceC1003p;
import t0.b0;
import x.Q;

/* renamed from: z.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258v extends U.p implements InterfaceC0998k, InterfaceC1003p, InterfaceC0999l {

    /* renamed from: q, reason: collision with root package name */
    public C1242f f10471q;

    /* renamed from: r, reason: collision with root package name */
    public Q f10472r;

    /* renamed from: s, reason: collision with root package name */
    public a0 f10473s;

    /* renamed from: t, reason: collision with root package name */
    public final C0156j0 f10474t = C0143d.K(null, W.f2783i);

    public C1258v(C1242f c1242f, Q q3, a0 a0Var) {
        this.f10471q = c1242f;
        this.f10472r = q3;
        this.f10473s = a0Var;
    }

    @Override // t0.InterfaceC1003p
    public final void c0(b0 b0Var) {
        this.f10474t.setValue(b0Var);
    }

    @Override // U.p
    public final void q0() {
        C1242f c1242f = this.f10471q;
        if (c1242f.f10447a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        c1242f.f10447a = this;
    }

    @Override // U.p
    public final void r0() {
        this.f10471q.k(this);
    }
}
