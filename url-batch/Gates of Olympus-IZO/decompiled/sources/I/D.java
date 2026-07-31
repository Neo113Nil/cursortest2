package I;

import F.C0047j0;
import android.view.Choreographer;
import k2.AbstractC0552y;
import k2.C0536h;

/* loaded from: classes.dex */
public final class D implements Y {

    /* renamed from: d, reason: collision with root package name */
    public static final D f2085d = new D();

    /* renamed from: e, reason: collision with root package name */
    public static final Choreographer f2086e;

    static {
        r2.e eVar = k2.E.f5312a;
        f2086e = (Choreographer) AbstractC0552y.t(p2.n.f6799a.f5551i, new B(2, null));
    }

    @Override // I.Y
    public final Object j(Y1.c cVar, R1.c cVar2) {
        C0536h c0536h = new C0536h(1, M1.B.G(cVar2));
        c0536h.q();
        C c3 = new C(cVar, c0536h);
        f2086e.postFrameCallback(c3);
        c0536h.s(new C0047j0(4, c3));
        Object p = c0536h.p();
        Q1.a aVar = Q1.a.f3113d;
        return p;
    }

    @Override // P1.i
    public final P1.g k(P1.h hVar) {
        return I2.l.A(this, hVar);
    }

    @Override // P1.i
    public final P1.i o(P1.i iVar) {
        return I2.l.M(this, iVar);
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // P1.i
    public final P1.i x(P1.h hVar) {
        return I2.l.H(this, hVar);
    }
}
