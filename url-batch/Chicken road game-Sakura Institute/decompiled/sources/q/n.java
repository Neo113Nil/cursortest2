package q;

import g0.k1;
import g0.p1;
import java.util.HashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f7310a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f7311b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final m f7312c = m.f7305b;

    public static final void a(s0.o oVar, g0.p pVar, int i7) {
        pVar.S(-211209833);
        if ((((pVar.f(oVar) ? 4 : 2) | i7) & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            int i8 = pVar.P;
            s0.o c4 = s0.a.c(pVar, oVar);
            k1 m8 = pVar.m();
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, f7312c, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            g0.d.Q(pVar, c4, r1.i.f7782c);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i8))) {
                a0.m.q(i8, pVar, i8, hVar);
            }
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a2.a(i7, 10, oVar);
        }
    }

    public static final void b(p1.m0 m0Var, p1.n0 n0Var, p1.e0 e0Var, m2.k kVar, int i7, int i8, s0.g gVar) {
        s0.g gVar2;
        Object g9 = e0Var.g();
        k kVar2 = g9 instanceof k ? (k) g9 : null;
        p1.m0.e(m0Var, n0Var, ((kVar2 == null || (gVar2 = kVar2.f7296s) == null) ? gVar : gVar2).a(j1.c.G(n0Var.f7063f, n0Var.f7064g), j1.c.G(i7, i8), kVar));
    }

    public static final HashMap c(boolean z8) {
        HashMap hashMap = new HashMap(9);
        d(hashMap, z8, s0.b.f8078f);
        d(hashMap, z8, s0.b.f8079g);
        d(hashMap, z8, s0.b.f8080h);
        d(hashMap, z8, s0.b.f8081i);
        d(hashMap, z8, s0.b.f8082j);
        d(hashMap, z8, s0.b.f8083k);
        d(hashMap, z8, s0.b.f8084l);
        d(hashMap, z8, s0.b.f8085m);
        d(hashMap, z8, s0.b.f8086n);
        return hashMap;
    }

    public static final void d(HashMap hashMap, boolean z8, s0.g gVar) {
        hashMap.put(gVar, new p(gVar, z8));
    }

    public static final p1.f0 e(s0.g gVar, boolean z8) {
        p1.f0 f0Var = (p1.f0) (z8 ? f7310a : f7311b).get(gVar);
        return f0Var == null ? new p(gVar, z8) : f0Var;
    }
}
