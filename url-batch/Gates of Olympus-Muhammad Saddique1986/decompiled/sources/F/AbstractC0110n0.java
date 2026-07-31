package F;

import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import S.C0219c;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import l.AbstractC0574B;
import m.AbstractC0620e;
import m.C0635u;
import m.InterfaceC0640z;

/* renamed from: F.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0110n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1690a = 16;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1691b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1692c = 20;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1693d = 80;

    /* renamed from: e, reason: collision with root package name */
    public static final l.H f1694e;

    /* renamed from: f, reason: collision with root package name */
    public static final l.G f1695f;

    static {
        C0635u c0635u = H.m.f2428b;
        l.H b3 = AbstractC0574B.b(AbstractC0620e.j(100, 0, c0635u, 2), 2);
        C0635u c0635u2 = H.m.f2427a;
        InterfaceC0640z j3 = AbstractC0620e.j(500, 0, c0635u2, 2);
        U.g gVar = U.b.f4473p;
        if ((12 & 1) != 0) {
            Object obj = m.z0.f6914a;
            j3 = AbstractC0620e.i(400.0f, new O0.j(O2.d.d(1, 1)), 1);
        }
        int i3 = 12 & 2;
        U.g gVar2 = U.b.f4475r;
        U.g gVar3 = i3 != 0 ? gVar2 : gVar;
        f1694e = b3.a(new l.H(new l.P(null, new l.v(f2.j.a(gVar3, U.b.f4473p) ? U.b.f4464g : f2.j.a(gVar3, gVar2) ? U.b.f4466i : U.b.f4465h, new C0219c(2, l.q.f6527l), j3, true), null, false, null, 59)));
        l.G a3 = AbstractC0574B.a(new m.t0(200, 100, c0635u), 2);
        InterfaceC0640z j4 = AbstractC0620e.j(500, 0, c0635u2, 2);
        if ((12 & 1) != 0) {
            Object obj2 = m.z0.f6914a;
            j4 = AbstractC0620e.i(400.0f, new O0.j(O2.d.d(1, 1)), 1);
        }
        int i4 = 2 & 12;
        U.g gVar4 = U.b.f4475r;
        if (i4 != 0) {
            gVar = gVar4;
        }
        f1695f = a3.a(new l.G(new l.P(null, new l.v(f2.j.a(gVar, U.b.f4473p) ? U.b.f4464g : f2.j.a(gVar, gVar4) ? U.b.f4466i : U.b.f4465h, new C0219c(1, l.q.f6526k), j4, true), null, false, null, 59)));
    }

    public static final void a(Q.a aVar, Q.a aVar2, InterfaceC0422a interfaceC0422a, U.q qVar, boolean z3, b0.Q q3, long j3, long j4, C0094f0 c0094f0, q.k kVar, C0167p c0167p, int i3) {
        int i4;
        int i5;
        b0.Q q4;
        q.k kVar2;
        C0094f0 c0094f02;
        long j5;
        long j6;
        boolean z4;
        b0.Q q5;
        long j7;
        long j8;
        C0094f0 c0094f03;
        q.k kVar3;
        boolean z5;
        c0167p.S(-1387401842);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(qVar) ? 2048 : 1024;
        }
        int i6 = i4 | 24576;
        if ((196608 & i3) == 0) {
            i6 = 90112 | i4;
        }
        if ((1572864 & i3) == 0) {
            i6 |= 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= 4194304;
        }
        if ((100663296 & i3) == 0) {
            i6 |= 33554432;
        }
        int i7 = i6 | 805306368;
        if ((306783379 & i7) == 306783378 && c0167p.x()) {
            c0167p.L();
            z5 = z3;
            q5 = q3;
            j7 = j3;
            j8 = j4;
            c0094f03 = c0094f0;
            kVar3 = kVar;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                int i8 = AbstractC0082a0.f1462a;
                b0.Q a3 = n1.a(H.e.f2393a, c0167p);
                float f3 = H.g.f2396a;
                long d3 = O.d(27, c0167p);
                long b3 = O.b(d3, c0167p);
                i5 = (-268369921) & i7;
                q4 = a3;
                kVar2 = null;
                c0094f02 = new C0094f0(H.g.f2396a, H.g.f2401f, H.g.f2399d, H.g.f2400e);
                j5 = d3;
                j6 = b3;
                z4 = true;
            } else {
                c0167p.L();
                i5 = i7 & (-268369921);
                z4 = z3;
                q4 = q3;
                j5 = j3;
                j6 = j4;
                c0094f02 = c0094f0;
                kVar2 = kVar;
            }
            c0167p.q();
            int i9 = i5 >> 6;
            boolean z6 = z4;
            b(interfaceC0422a, qVar, q4, j5, j6, c0094f02, kVar2, Q.f.b(1172118032, new C0102j0(z4, aVar2, aVar), c0167p), c0167p, (i9 & 112) | (i9 & 14) | 12582912 | ((i5 >> 9) & 3670016));
            q5 = q4;
            j7 = j5;
            j8 = j6;
            c0094f03 = c0094f02;
            kVar3 = kVar2;
            z5 = z6;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0104k0(aVar, aVar2, interfaceC0422a, qVar, z5, q5, j7, j8, c0094f03, kVar3, i3);
        }
    }

    public static final void b(InterfaceC0422a interfaceC0422a, U.q qVar, b0.Q q3, long j3, long j4, C0094f0 c0094f0, q.k kVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        q.k kVar2;
        c0167p.S(-731723913);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(interfaceC0422a) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(q3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.e(j3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.e(j4) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.f(c0094f0) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0167p.f(kVar) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= c0167p.h(aVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i4) == 4793490 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.N();
            if ((i3 & 1) != 0 && !c0167p.w()) {
                c0167p.L();
            }
            c0167p.q();
            c0167p.Q(519755085);
            Object obj = C0159l.f2829a;
            if (kVar == null) {
                Object G3 = c0167p.G();
                if (G3 == obj) {
                    G3 = new q.k();
                    c0167p.a0(G3);
                }
                kVar2 = (q.k) G3;
            } else {
                kVar2 = kVar;
            }
            c0167p.p(false);
            U.q a3 = A0.k.a(qVar, F.f1142h);
            float f3 = c0094f0.f1533a;
            int i5 = i4 >> 12;
            int i6 = i5 & 112;
            boolean f4 = c0167p.f(kVar2);
            Object G4 = c0167p.G();
            if (f4 || G4 == obj) {
                G4 = new C0100i0(c0094f0.f1533a, c0094f0.f1534b, c0094f0.f1536d, c0094f0.f1535c);
                c0167p.a0(G4);
            }
            C0100i0 c0100i0 = (C0100i0) G4;
            boolean h3 = c0167p.h(c0100i0) | (((i6 ^ 48) > 32 && c0167p.f(c0094f0)) || (i5 & 48) == 32);
            Object G5 = c0167p.G();
            if (h3 || G5 == obj) {
                G5 = new C0085b0(c0100i0, c0094f0, null);
                c0167p.a0(G5);
            }
            C0143d.e(c0167p, (InterfaceC0426e) G5, c0094f0);
            boolean f5 = c0167p.f(kVar2) | c0167p.h(c0100i0);
            Object G6 = c0167p.G();
            if (f5 || G6 == obj) {
                G6 = new C0092e0(kVar2, c0100i0, null);
                c0167p.a0(G6);
            }
            C0143d.e(c0167p, (InterfaceC0426e) G6, kVar2);
            int i7 = i4 & 14;
            int i8 = i4 << 3;
            r1.b(interfaceC0422a, a3, false, q3, j3, j4, f3, ((O0.e) c0100i0.f1578e.f6759c.f6849e.getValue()).f3731d, null, kVar2, Q.f.b(1249316354, new C0106l0(0, j4, aVar), c0167p), c0167p, i7 | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 260);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0108m0(interfaceC0422a, qVar, q3, j3, j4, c0094f0, kVar, aVar, i3);
        }
    }
}
