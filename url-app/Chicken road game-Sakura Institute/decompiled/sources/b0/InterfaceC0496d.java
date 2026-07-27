package b0;

import B1.C0097d;
import M0.k;
import Z.AbstractC0319p;
import Z.C0310g;
import Z.C0313j;
import Z.C0316m;
import Z.J;
import Z.S;
import r0.G;
import u3.l;

/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0496d extends M0.b {
    static void C(G g4, C0310g c0310g, C0316m c0316m) {
        C0499g c0499g = C0499g.f5607a;
        C0494b c0494b = g4.f9624d;
        c0494b.f5602d.f5600c.t(c0310g, 0L, c0494b.b(null, c0499g, 1.0f, c0316m, 3, 1));
    }

    static void F(G g4, S s4, long j4, long j5, long j6, AbstractC0497e abstractC0497e, int i2) {
        long j7 = (i2 & 2) != 0 ? 0L : j4;
        g4.d(s4, j7, (i2 & 4) != 0 ? o0(g4.f9624d.h(), j7) : j5, j6, 1.0f, (i2 & 32) != 0 ? C0499g.f5607a : abstractC0497e, null, 3);
    }

    static void R(G g4, AbstractC0319p abstractC0319p, long j4, long j5, float f4, AbstractC0497e abstractC0497e, int i2) {
        long j6 = (i2 & 2) != 0 ? 0L : j4;
        g4.c(abstractC0319p, j6, (i2 & 4) != 0 ? o0(g4.f9624d.h(), j6) : j5, (i2 & 8) != 0 ? 1.0f : f4, (i2 & 16) != 0 ? C0499g.f5607a : abstractC0497e, null, 3);
    }

    static /* synthetic */ void U(InterfaceC0496d interfaceC0496d, J j4, AbstractC0319p abstractC0319p, float f4, C0500h c0500h, int i2) {
        if ((i2 & 4) != 0) {
            f4 = 1.0f;
        }
        float f5 = f4;
        AbstractC0497e abstractC0497e = c0500h;
        if ((i2 & 8) != 0) {
            abstractC0497e = C0499g.f5607a;
        }
        interfaceC0496d.m0(j4, abstractC0319p, f5, abstractC0497e, null, (i2 & 32) != 0 ? 3 : 0);
    }

    static long o0(long j4, long j5) {
        return l.N(Y.f.d(j4) - Y.c.d(j5), Y.f.b(j4) - Y.c.e(j5));
    }

    static void s(InterfaceC0496d interfaceC0496d, C0310g c0310g, long j4, long j5, long j6, float f4, C0316m c0316m, int i2, int i4) {
        interfaceC0496d.c0(c0310g, (i4 & 2) != 0 ? 0L : j4, j5, 0L, (i4 & 16) != 0 ? j5 : j6, (i4 & 32) != 0 ? 1.0f : f4, C0499g.f5607a, c0316m, 3, (i4 & 512) != 0 ? 1 : i2);
    }

    void B(long j4, long j5, long j6, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2);

    void D(C0313j c0313j, long j4, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2);

    void O(long j4, long j5, long j6, long j7, AbstractC0497e abstractC0497e, float f4, C0316m c0316m, int i2);

    void V(long j4, float f4, long j5, float f5, AbstractC0497e abstractC0497e, C0316m c0316m, int i2);

    C0097d Y();

    void c0(C0310g c0310g, long j4, long j5, long j6, long j7, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2, int i4);

    k getLayoutDirection();

    default long h() {
        return Y().s();
    }

    void m0(J j4, AbstractC0319p abstractC0319p, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2);

    void o(long j4, long j5, long j6, float f4, int i2, float f5, C0316m c0316m, int i4);

    default long w() {
        return l.e0(Y().s());
    }
}
