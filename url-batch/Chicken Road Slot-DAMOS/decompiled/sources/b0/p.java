package b0;

import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final s.h0 f876a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f877b;

    static {
        c(true);
        f876a = c(false);
        f877b = o.f873b;
    }

    public static final void a(d1.l lVar, n0.i0 i0Var, int i3) {
        i0Var.X(-211209833);
        int i10 = (i0Var.f(lVar) ? 4 : 2) | i3;
        if (i0Var.O(i10 & 1, (i10 & 3) != 2)) {
            int hashCode = Long.hashCode(i0Var.T);
            d1.l C = z4.w.C(lVar, i0Var);
            x0.h l10 = i0Var.l();
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(f877b, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            i0Var.p(true);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new n(lVar, i3, 0);
        }
    }

    public static final void b(a2.n0 n0Var, a2.o0 o0Var, a2.f0 f0Var, x2.l lVar, int i3, int i10, d1.d dVar) {
        d1.d dVar2;
        Object h10 = f0Var.h();
        m mVar = h10 instanceof m ? (m) h10 : null;
        a2.n0.o(n0Var, o0Var, ((mVar == null || (dVar2 = mVar.C) == null) ? dVar : dVar2).a((o0Var.f131d << 32) | (o0Var.f132e & 4294967295L), (i3 << 32) | (i10 & 4294967295L), lVar));
    }

    public static final s.h0 c(boolean z10) {
        s.h0 h0Var = new s.h0(9);
        d1.d dVar = d1.a.f3282d;
        h0Var.m(dVar, new s(dVar, z10));
        d1.d dVar2 = d1.a.f3283e;
        h0Var.m(dVar2, new s(dVar2, z10));
        d1.d dVar3 = d1.a.f3284i;
        h0Var.m(dVar3, new s(dVar3, z10));
        d1.d dVar4 = d1.a.f3285r;
        h0Var.m(dVar4, new s(dVar4, z10));
        d1.d dVar5 = d1.a.f3286s;
        h0Var.m(dVar5, new s(dVar5, z10));
        d1.d dVar6 = d1.a.f3287t;
        h0Var.m(dVar6, new s(dVar6, z10));
        d1.d dVar7 = d1.a.f3288u;
        h0Var.m(dVar7, new s(dVar7, z10));
        d1.d dVar8 = d1.a.f3289v;
        h0Var.m(dVar8, new s(dVar8, z10));
        d1.d dVar9 = d1.a.f3290w;
        h0Var.m(dVar9, new s(dVar9, z10));
        return h0Var;
    }

    public static final a2.g0 d(d1.d dVar) {
        a2.g0 g0Var = (a2.g0) f876a.g(dVar);
        return g0Var == null ? new s(dVar, false) : g0Var;
    }
}
