package l;

import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f5472a = e.k(7, null);

    static {
        Object obj = g2.f5498a;
        v0.d.a(0.5f, 0.5f);
        u3.r.a(0.5f, 0.5f);
    }

    public static final m2 a(Object obj, w1 w1Var, k kVar, Float f9, String str, g0.p pVar, int i7, int i8) {
        if ((i8 & 8) != 0) {
            f9 = null;
        }
        Object G = pVar.G();
        Object obj2 = g0.l.f3784a;
        if (G == obj2) {
            G = g0.d.J(null, g0.t0.f3903k);
            pVar.a0(G);
        }
        g0.z0 z0Var = (g0.z0) G;
        Object G2 = pVar.G();
        if (G2 == obj2) {
            G2 = new d(obj, w1Var, f9);
            pVar.a0(G2);
        }
        d dVar = (d) G2;
        Object M = g0.d.M(null, pVar);
        if (f9 != null && (kVar instanceof a1)) {
            a1 a1Var = (a1) kVar;
            if (!r6.k.a(a1Var.f5403c, f9)) {
                kVar = new a1(a1Var.f5401a, a1Var.f5402b, f9);
            }
        }
        Object M2 = g0.d.M(kVar, pVar);
        Object G3 = pVar.G();
        if (G3 == obj2) {
            G3 = j1.c.C(-1, 6, null);
            pVar.a0(G3);
        }
        Object obj3 = (e7.i) G3;
        boolean h3 = pVar.h(obj3) | pVar.h(obj);
        Object G4 = pVar.G();
        if (h3 || G4 == obj2) {
            G4 = new a0.b1(obj3, 3, obj);
            pVar.a0(G4);
        }
        g0.d.g((q6.a) G4, pVar);
        boolean h8 = pVar.h(obj3) | pVar.h(dVar) | pVar.f(M2) | pVar.f(M);
        Object G5 = pVar.G();
        if (h8 || G5 == obj2) {
            Object i0Var = new androidx.lifecycle.i0(obj3, dVar, M2, M, (h6.d) null, 3);
            pVar.a0(i0Var);
            G5 = i0Var;
        }
        g0.d.e(pVar, obj3, (q6.e) G5);
        m2 m2Var = (m2) z0Var.getValue();
        return m2Var == null ? dVar.f5427c : m2Var;
    }
}
