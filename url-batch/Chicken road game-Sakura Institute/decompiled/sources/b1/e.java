package b1;

import m2.k;
import r1.f0;
import z0.k0;
import z0.m;
import z0.p;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface e extends m2.b {
    static void N(f0 f0Var, p pVar, long j8, long j9, long j10, f fVar, int i7) {
        long j11 = (i7 & 2) != 0 ? 0L : j8;
        long n02 = (i7 & 4) != 0 ? n0(f0Var.f7767f.d(), j11) : j9;
        f fVar2 = (i7 & 32) != 0 ? h.f1238a : fVar;
        c cVar = f0Var.f7767f;
        cVar.f1233f.f1227c.b(y0.c.d(j11), y0.c.e(j11), y0.f.d(n02) + y0.c.d(j11), y0.f.b(n02) + y0.c.e(j11), y0.a.b(j10), y0.a.c(j10), cVar.c(pVar, fVar2, 1.0f, null, 3, 1));
    }

    static void c0(e eVar, z0.h hVar, long j8, long j9, float f9, m mVar, int i7, int i8) {
        eVar.L(hVar, 0L, j8, (i8 & 16) != 0 ? j8 : j9, (i8 & 32) != 0 ? 1.0f : f9, mVar, (i8 & 512) != 0 ? 1 : i7);
    }

    static /* synthetic */ void n(e eVar, k0 k0Var, p pVar, float f9, i iVar, int i7) {
        if ((i7 & 4) != 0) {
            f9 = 1.0f;
        }
        float f10 = f9;
        f fVar = iVar;
        if ((i7 & 8) != 0) {
            fVar = h.f1238a;
        }
        eVar.Z(k0Var, pVar, f10, fVar, (i7 & 32) != 0 ? 3 : 0);
    }

    static long n0(long j8, long j9) {
        return v0.d.a(y0.f.d(j8) - y0.c.d(j9), y0.f.b(j8) - y0.c.e(j9));
    }

    static /* synthetic */ void p(e eVar, long j8, float f9, long j9, int i7) {
        if ((i7 & 4) != 0) {
            j9 = eVar.Q();
        }
        eVar.r(f9, j8, j9);
    }

    static void s(e eVar, long j8, long j9, long j10, long j11, f fVar, int i7) {
        eVar.H(j8, (i7 & 2) != 0 ? 0L : j9, j10, j11, fVar);
    }

    static /* synthetic */ void t(e eVar, long j8, long j9, long j10, int i7) {
        if ((i7 & 2) != 0) {
            j9 = 0;
        }
        long j11 = j9;
        if ((i7 & 4) != 0) {
            j10 = n0(eVar.d(), j11);
        }
        eVar.J(j8, j11, j10, (i7 & 64) != 0 ? 3 : 0);
    }

    b B();

    void H(long j8, long j9, long j10, long j11, f fVar);

    void J(long j8, long j9, long j10, int i7);

    void L(z0.h hVar, long j8, long j9, long j10, float f9, m mVar, int i7);

    void P(long j8, long j9, long j10, float f9, int i7);

    default long Q() {
        return v0.d.f(B().p());
    }

    void T(long j8, float f9, float f10, long j9, long j10, f fVar);

    void Y(k0 k0Var, long j8, f fVar);

    void Z(k0 k0Var, p pVar, float f9, f fVar, int i7);

    default long d() {
        return B().p();
    }

    k getLayoutDirection();

    void r(float f9, long j8, long j9);
}
