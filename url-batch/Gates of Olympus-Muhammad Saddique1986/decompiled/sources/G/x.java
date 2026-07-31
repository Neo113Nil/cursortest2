package G;

import I.C0167p;
import e2.InterfaceC0427f;
import m.AbstractC0620e;
import m.AbstractC0639y;
import m.g0;
import m.t0;

/* loaded from: classes.dex */
public final class x extends f2.k implements InterfaceC0427f {

    /* renamed from: e, reason: collision with root package name */
    public static final x f2061e = new x(3);

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        g0 g0Var = (g0) obj;
        C0167p c0167p = (C0167p) obj2;
        ((Number) obj3).intValue();
        c0167p.Q(-1154662212);
        f fVar = f.f1993d;
        f fVar2 = f.f1994e;
        Object j3 = g0Var.a(fVar, fVar2) ? AbstractC0620e.j(67, 0, AbstractC0639y.f6912d, 2) : (g0Var.a(fVar2, fVar) || g0Var.a(f.f1995f, fVar2)) ? new t0(83, 67, AbstractC0639y.f6912d) : AbstractC0620e.i(0.0f, null, 7);
        c0167p.p(false);
        return j3;
    }
}
