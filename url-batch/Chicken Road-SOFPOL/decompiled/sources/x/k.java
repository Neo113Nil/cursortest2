package x;

import m0.o1;
import m0.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final o.j0 f8232a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final o.j0 f8233b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final j f8234c = j.f8226b;

    public static final void a(y0.m mVar, m0.s sVar, int i) {
        sVar.W(-211209833);
        int i8 = (sVar.f(mVar) ? 4 : 2) | i;
        if (sVar.N(i8 & 1, (i8 & 3) != 2)) {
            int hashCode = Long.hashCode(sVar.T);
            y0.m a02 = r2.o.a0(sVar, mVar);
            o1 l3 = sVar.l();
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(f8234c, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            m0.b.u(a02, sVar, w1.h.f7676c);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            sVar.p(true);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new b6.y(mVar, i, 1);
        }
    }

    public static final void b(u1.k0 k0Var, u1.l0 l0Var, u1.d0 d0Var, r2.l lVar, int i, int i8, y0.e eVar) {
        d0Var.g();
        u1.k0.h(k0Var, l0Var, eVar.a((l0Var.f7230d << 32) | (l0Var.f7231e & 4294967295L), (i << 32) | (i8 & 4294967295L), lVar));
    }

    public static final o.j0 c(boolean z3) {
        o.j0 j0Var = new o.j0(9);
        y0.e eVar = y0.b.f8681d;
        j0Var.m(eVar, new n(eVar, z3));
        y0.e eVar2 = y0.b.f8682e;
        j0Var.m(eVar2, new n(eVar2, z3));
        y0.e eVar3 = y0.b.f8683f;
        j0Var.m(eVar3, new n(eVar3, z3));
        y0.e eVar4 = y0.b.f8684g;
        j0Var.m(eVar4, new n(eVar4, z3));
        y0.e eVar5 = y0.b.f8685h;
        j0Var.m(eVar5, new n(eVar5, z3));
        y0.e eVar6 = y0.b.i;
        j0Var.m(eVar6, new n(eVar6, z3));
        y0.e eVar7 = y0.b.f8686j;
        j0Var.m(eVar7, new n(eVar7, z3));
        y0.e eVar8 = y0.b.f8687k;
        j0Var.m(eVar8, new n(eVar8, z3));
        y0.e eVar9 = y0.b.f8688l;
        j0Var.m(eVar9, new n(eVar9, z3));
        return j0Var;
    }

    public static final u1.e0 d(y0.e eVar, boolean z3) {
        u1.e0 e0Var = (u1.e0) (z3 ? f8232a : f8233b).g(eVar);
        return e0Var == null ? new n(eVar, z3) : e0Var;
    }
}
