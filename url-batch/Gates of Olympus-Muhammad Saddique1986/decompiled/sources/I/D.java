package I;

import android.view.Choreographer;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import q2.AbstractC0837y;
import q2.C0821h;

/* loaded from: classes.dex */
public final class D implements X {

    /* renamed from: d, reason: collision with root package name */
    public static final D f2646d = new D();

    /* renamed from: e, reason: collision with root package name */
    public static final Choreographer f2647e;

    static {
        x2.e eVar = q2.E.f7851a;
        f2647e = (Choreographer) AbstractC0837y.u(v2.m.f9819a.f8207i, new B(2, null));
    }

    @Override // V1.i
    public final V1.i d(V1.i iVar) {
        return AbstractC0508a.L(this, iVar);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(obj, this);
    }

    @Override // V1.i
    public final V1.i l(V1.h hVar) {
        return AbstractC0508a.K(this, hVar);
    }

    @Override // I.X
    public final Object n(InterfaceC0424c interfaceC0424c, V1.d dVar) {
        C0821h c0821h = new C0821h(1, l0.c.B(dVar));
        c0821h.r();
        C c2 = new C(interfaceC0424c, c0821h);
        f2647e.postFrameCallback(c2);
        c0821h.v(new A0.l(6, c2));
        return c0821h.q();
    }

    @Override // V1.i
    public final V1.g v(V1.h hVar) {
        return AbstractC0508a.C(this, hVar);
    }
}
