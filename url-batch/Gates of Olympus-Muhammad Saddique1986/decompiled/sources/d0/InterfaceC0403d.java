package d0;

import G1.m;
import O0.k;
import a.AbstractC0235a;
import a0.C0238c;
import a0.C0241f;
import b0.AbstractC0347p;
import b0.C0338g;
import b0.C0341j;
import b0.C0344m;
import b0.L;
import b0.T;
import t0.G;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0403d extends O0.b {
    static void h0(G g3, T t3, long j3, long j4, long j5, AbstractC0404e abstractC0404e, int i3) {
        long j6 = (i3 & 2) != 0 ? 0L : j3;
        g3.f(t3, j6, (i3 & 4) != 0 ? j0(g3.f8573d.d(), j6) : j4, j5, 1.0f, (i3 & 32) != 0 ? C0406g.f5653a : abstractC0404e, null, 3);
    }

    static long j0(long j3, long j4) {
        return AbstractC0235a.e(C0241f.d(j3) - C0238c.d(j4), C0241f.b(j3) - C0238c.e(j4));
    }

    static void p(InterfaceC0403d interfaceC0403d, C0338g c0338g, long j3, long j4, long j5, float f3, C0344m c0344m, int i3, int i4) {
        interfaceC0403d.k0(c0338g, (i4 & 2) != 0 ? 0L : j3, j4, 0L, (i4 & 16) != 0 ? j4 : j5, (i4 & 32) != 0 ? 1.0f : f3, C0406g.f5653a, c0344m, 3, (i4 & 512) != 0 ? 1 : i3);
    }

    static void s(G g3, AbstractC0347p abstractC0347p, long j3, long j4, float f3, AbstractC0404e abstractC0404e, int i3) {
        long j5 = (i3 & 2) != 0 ? 0L : j3;
        g3.e(abstractC0347p, j5, (i3 & 4) != 0 ? j0(g3.f8573d.d(), j5) : j4, (i3 & 8) != 0 ? 1.0f : f3, (i3 & 16) != 0 ? C0406g.f5653a : abstractC0404e, null, 3);
    }

    static void x(G g3, C0338g c0338g, C0344m c0344m) {
        C0406g c0406g = C0406g.f5653a;
        C0401b c0401b = g3.f8573d;
        c0401b.f5648d.f5646c.p(c0338g, 0L, c0401b.c(null, c0406g, 1.0f, c0344m, 3, 1));
    }

    static /* synthetic */ void z(InterfaceC0403d interfaceC0403d, L l3, AbstractC0347p abstractC0347p, float f3, C0407h c0407h, int i3) {
        if ((i3 & 4) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        AbstractC0404e abstractC0404e = c0407h;
        if ((i3 & 8) != 0) {
            abstractC0404e = C0406g.f5653a;
        }
        interfaceC0403d.a0(l3, abstractC0347p, f4, abstractC0404e, null, (i3 & 32) != 0 ? 3 : 0);
    }

    void A(long j3, long j4, long j5, long j6, AbstractC0404e abstractC0404e, float f3, C0344m c0344m, int i3);

    void F(long j3, long j4, long j5, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3);

    void M(long j3, float f3, long j4, float f4, AbstractC0404e abstractC0404e, C0344m c0344m, int i3);

    m S();

    void X(C0341j c0341j, long j3, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3);

    void a0(L l3, AbstractC0347p abstractC0347p, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3);

    default long d() {
        return S().n();
    }

    k getLayoutDirection();

    void k0(C0338g c0338g, long j3, long j4, long j5, long j6, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3, int i4);

    default long y() {
        return AbstractC0235a.w(S().n());
    }
}
