package g0;

import android.view.Choreographer;
import d0.p3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 implements u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f3696f = new c0();

    /* renamed from: g, reason: collision with root package name */
    public static final Choreographer f3697g;

    static {
        j7.e eVar = c7.g0.f1696a;
        f3697g = (Choreographer) c7.a0.s(h7.m.f4700a.f2648k, new p3(2, null, 1));
    }

    @Override // h6.i
    public final Object D(Object obj, q6.e eVar) {
        return eVar.d(obj, this);
    }

    @Override // h6.i
    public final h6.i F(h6.h hVar) {
        return t6.a.G(this, hVar);
    }

    @Override // g0.u0
    public final Object t(q6.c cVar, h6.d dVar) {
        c7.h hVar = new c7.h(1, a8.m.A(dVar));
        hVar.r();
        b0 b0Var = new b0(hVar, cVar);
        f3697g.postFrameCallback(b0Var);
        hVar.t(new c1.a(6, b0Var));
        return hVar.q();
    }

    @Override // h6.i
    public final h6.g u(h6.h hVar) {
        return t6.a.B(this, hVar);
    }

    @Override // h6.i
    public final h6.i z(h6.i iVar) {
        return t6.a.I(this, iVar);
    }
}
