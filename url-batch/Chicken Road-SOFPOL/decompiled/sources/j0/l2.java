package j0;

import androidx.compose.foundation.BorderModifierNodeElement;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0.b0 f3764a = new m0.b0(new c.e(14));

    public static final void a(y0.m mVar, f1.i0 i0Var, long j7, long j8, float f6, float f8, u0.c cVar, m0.s sVar, int i, int i8) {
        if ((i8 & 2) != 0) {
            i0Var = f1.p.f2693a;
        }
        f1.i0 i0Var2 = i0Var;
        long b8 = (i8 & 8) != 0 ? c0.b(j7, sVar) : j8;
        float f9 = (i8 & 16) != 0 ? 0 : f6;
        float f10 = (i8 & 32) != 0 ? 0 : f8;
        m0.b0 b0Var = f3764a;
        float f11 = ((r2.f) sVar.j(b0Var)).f6520d + f9;
        m0.b.b(new l.q[]{g0.f3652a.a(new f1.s(b8)), b0Var.a(new r2.f(f11))}, u0.h.d(421772006, new j2(mVar, i0Var2, j7, f11, null, f10, cVar), sVar), sVar, 56);
    }

    public static final void b(p6.a aVar, y0.m mVar, boolean z3, f1.i0 i0Var, long j7, long j8, float f6, t.t tVar, v.j jVar, u0.c cVar, m0.s sVar, int i) {
        v.j jVar2;
        float f8 = 0;
        if (jVar == null) {
            sVar.V(-1701037204);
            Object K = sVar.K();
            if (K == m0.n.f5019a) {
                K = new v.j();
                sVar.f0(K);
            }
            sVar.p(false);
            jVar2 = (v.j) K;
        } else {
            sVar.V(2023337163);
            sVar.p(false);
            jVar2 = jVar;
        }
        m0.b0 b0Var = f3764a;
        float f9 = ((r2.f) sVar.j(b0Var)).f6520d + f8;
        m0.b.b(new l.q[]{g0.f3652a.a(new f1.s(j8)), b0Var.a(new r2.f(f9))}, u0.h.d(849208527, new k2(mVar, i0Var, j7, f9, tVar, jVar2, z3, aVar, f6, cVar), sVar), sVar, 56);
    }

    public static final y0.m c(y0.m mVar, f1.i0 i0Var, long j7, t.t tVar, float f6) {
        y0.m mVar2;
        y0.m mVar3 = y0.j.f8705a;
        if (f6 > 0.0f) {
            long j8 = f1.l0.f2683b;
            long j9 = f1.y.f2709a;
            mVar2 = androidx.compose.ui.graphics.a.b(mVar3, 1.0f, 1.0f, 1.0f, f6, j8, i0Var, false, j9, j9);
        } else {
            mVar2 = mVar3;
        }
        y0.m d8 = mVar.d(mVar2);
        if (tVar != null) {
            mVar3 = new BorderModifierNodeElement(tVar.f6856a, tVar.f6857b, i0Var);
        }
        return a.a.f(androidx.compose.foundation.a.b(d8.d(mVar3), j7, i0Var), i0Var);
    }

    public static final long d(long j7, float f6, m0.s sVar) {
        b0 b0Var = (b0) sVar.j(c0.f3599a);
        boolean booleanValue = ((Boolean) sVar.j(c0.f3600b)).booleanValue();
        long j8 = b0Var.f3571p;
        if (!f1.s.c(j7, j8) || !booleanValue) {
            return j7;
        }
        if (r2.f.a(f6, 0)) {
            return j8;
        }
        return f1.p.h(f1.s.b(b0Var.f3575t, ((((float) Math.log(f6 + 1)) * 4.5f) + 2.0f) / 100.0f), j8);
    }
}
