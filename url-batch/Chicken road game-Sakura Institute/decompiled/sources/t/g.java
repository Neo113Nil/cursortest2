package t;

import c7.a0;
import d6.z;
import o.i;
import p1.p;
import r1.a1;
import r1.q1;
import r1.v;
import s0.n;
import u3.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends n implements a, v, q1 {

    /* renamed from: u, reason: collision with root package name */
    public static final m4.f f8725u = new m4.f();

    /* renamed from: s, reason: collision with root package name */
    public i f8726s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8727t;

    public static final y0.d A0(g gVar, a1 a1Var, q6.a aVar) {
        y0.d dVar;
        if (gVar.f8116r && gVar.f8727t) {
            a1 s5 = r1.f.s(gVar);
            if (!a1Var.M0().f8116r) {
                a1Var = null;
            }
            if (a1Var != null && (dVar = (y0.d) aVar.a()) != null) {
                y0.d h3 = s5.h(a1Var, false);
                return dVar.h(r.a(h3.f9780a, h3.f9781b));
            }
        }
        return null;
    }

    @Override // r1.v
    public final void M(p pVar) {
        this.f8727t = true;
    }

    @Override // t.a
    public final Object f0(a1 a1Var, q6.a aVar, j6.c cVar) {
        Object d8 = a0.d(new f(this, a1Var, aVar, new m.h(this, a1Var, aVar), null), cVar);
        return d8 == i6.a.f4956f ? d8 : z.f2639a;
    }

    @Override // r1.q1
    public final Object o() {
        return f8725u;
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }
}
