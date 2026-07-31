package h1;

import a0.g1;
import f1.j;
import f1.m;
import f1.p;
import r2.l;
import w1.h0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface d extends r2.c {
    static void B(h0 h0Var, p pVar, long j7, long j8, long j9, c cVar, int i) {
        if ((i & 2) != 0) {
            j7 = 0;
        }
        long j10 = j7;
        h0Var.g(pVar, j10, (i & 4) != 0 ? d0(h0Var.f7680d.c(), j10) : j8, j9, 1.0f, (i & 32) != 0 ? f.f3080b : cVar);
    }

    static long d0(long j7, long j8) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j8 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j8 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void j(h0 h0Var, p pVar, long j7, long j8, float f6, c cVar, int i) {
        if ((i & 2) != 0) {
            j7 = 0;
        }
        long j9 = j7;
        if ((i & 4) != 0) {
            j8 = d0(h0Var.f7680d.c(), j9);
        }
        h0Var.f(pVar, j9, j8, (i & 8) != 0 ? 1.0f : f6, (i & 16) != 0 ? f.f3080b : cVar);
    }

    static /* synthetic */ void l(d dVar, j jVar, p pVar, float f6, g gVar, int i) {
        if ((i & 4) != 0) {
            f6 = 1.0f;
        }
        float f8 = f6;
        c cVar = gVar;
        if ((i & 8) != 0) {
            cVar = f.f3080b;
        }
        dVar.I(jVar, pVar, f8, cVar, (i & 32) != 0 ? 3 : 0);
    }

    static /* synthetic */ void r(d dVar, long j7, long j8, long j9, int i) {
        if ((i & 2) != 0) {
            j8 = 0;
        }
        long j10 = j8;
        dVar.Y(j7, j10, (i & 4) != 0 ? d0(dVar.c(), j10) : j9, f.f3080b, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void w(d dVar, long j7, float f6, long j8, int i) {
        if ((i & 4) != 0) {
            j8 = dVar.M();
        }
        dVar.n(f6, j7, j8);
    }

    static void x(d dVar, f1.g gVar, long j7, float f6, m mVar, int i) {
        if ((i & 32) != 0) {
            f6 = 1.0f;
        }
        dVar.D(gVar, j7, j7, f6, mVar);
    }

    void D(f1.g gVar, long j7, long j8, float f6, m mVar);

    void I(j jVar, p pVar, float f6, c cVar, int i);

    void L(long j7, long j8, long j9, float f6, int i);

    default long M() {
        return a.a.k(y().u());
    }

    void Y(long j7, long j8, long j9, c cVar, int i);

    default long c() {
        return y().u();
    }

    l getLayoutDirection();

    void n(float f6, long j7, long j8);

    g1 y();
}
