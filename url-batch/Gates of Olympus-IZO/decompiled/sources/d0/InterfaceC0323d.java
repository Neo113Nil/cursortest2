package d0;

import D1.C0014b;
import M0.j;
import b0.AbstractC0259J;
import b0.C0265P;
import b0.C0275h;
import b0.C0278k;
import b0.C0281n;
import b0.InterfaceC0258I;
import t0.F;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0323d extends M0.b {
    static void J(F f3, C0265P c0265p, long j3, long j4, long j5, AbstractC0322c abstractC0322c, int i3) {
        long j6 = (i3 & 2) != 0 ? 0L : j3;
        f3.h(c0265p, j6, (i3 & 4) != 0 ? i0(f3.f7748d.c(), j6) : j4, j5, 1.0f, (i3 & 32) != 0 ? C0325f.f4448b : abstractC0322c, null, 3);
    }

    static /* synthetic */ void S(InterfaceC0323d interfaceC0323d, InterfaceC0258I interfaceC0258I, AbstractC0259J abstractC0259J, float f3, C0326g c0326g, int i3) {
        if ((i3 & 4) != 0) {
            f3 = 1.0f;
        }
        float f4 = f3;
        AbstractC0322c abstractC0322c = c0326g;
        if ((i3 & 8) != 0) {
            abstractC0322c = C0325f.f4448b;
        }
        interfaceC0323d.z(interfaceC0258I, abstractC0259J, f4, abstractC0322c, null, (i3 & 32) != 0 ? 3 : 0);
    }

    static long i0(long j3, long j4) {
        return I2.d.h(a0.f.d(j3) - a0.c.d(j4), a0.f.b(j3) - a0.c.e(j4));
    }

    static void o(InterfaceC0323d interfaceC0323d, C0275h c0275h, long j3, long j4, long j5, float f3, C0281n c0281n, int i3, int i4) {
        interfaceC0323d.f(c0275h, (i4 & 2) != 0 ? 0L : j3, j4, 0L, (i4 & 16) != 0 ? j4 : j5, (i4 & 32) != 0 ? 1.0f : f3, C0325f.f4448b, c0281n, 3, (i4 & 512) != 0 ? 1 : i3);
    }

    static void q(F f3, AbstractC0259J abstractC0259J, long j3, long j4, float f4, AbstractC0322c abstractC0322c, int i3) {
        long j5 = (i3 & 2) != 0 ? 0L : j3;
        f3.e(abstractC0259J, j5, (i3 & 4) != 0 ? i0(f3.f7748d.c(), j5) : j4, (i3 & 8) != 0 ? 1.0f : f4, (i3 & 16) != 0 ? C0325f.f4448b : abstractC0322c, null, 3);
    }

    static /* synthetic */ void s(InterfaceC0323d interfaceC0323d, long j3, long j4, long j5, C0326g c0326g, int i3) {
        long j6 = (i3 & 2) != 0 ? 0L : j4;
        interfaceC0323d.x(j3, j6, (i3 & 4) != 0 ? i0(interfaceC0323d.c(), j6) : j5, 1.0f, (i3 & 16) != 0 ? C0325f.f4448b : c0326g, null, (i3 & 64) != 0 ? 3 : 0);
    }

    void M(C0278k c0278k, long j3, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3);

    C0014b P();

    void V(long j3, long j4, long j5, float f3, int i3, float f4, C0281n c0281n, int i4);

    default long c() {
        return P().m();
    }

    void f(C0275h c0275h, long j3, long j4, long j5, long j6, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3, int i4);

    void g(long j3, long j4, long j5, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3);

    j getLayoutDirection();

    void h0(long j3, float f3, long j4, float f4, AbstractC0322c abstractC0322c, C0281n c0281n, int i3);

    default long w() {
        return I2.d.z(P().m());
    }

    void x(long j3, long j4, long j5, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3);

    void z(InterfaceC0258I interfaceC0258I, AbstractC0259J abstractC0259J, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3);
}
