package F;

import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0116q0;
import I.C0119s0;
import I.C0132z;
import I.InterfaceC0088c0;
import b0.C0265P;
import b0.C0288u;
import b0.InterfaceC0263N;
import m.C0593d;
import m.C0603m;
import n.C0665u;
import q.C0767b;
import q.C0769d;
import q.C0771f;
import r.C0797I;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final float f970a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0797I f971b;

    static {
        float f3 = 8;
        f970a = f3;
        androidx.compose.foundation.layout.a.a(f3, 2);
        f971b = androidx.compose.foundation.layout.a.a(f3, 2);
        androidx.compose.foundation.layout.a.a(f3, 2);
    }

    public static final void a(boolean z3, Y1.a aVar, Q.a aVar2, U.l lVar, boolean z4, Y1.e eVar, Y1.e eVar2, InterfaceC0263N interfaceC0263N, J0 j02, M0 m02, C0665u c0665u, q.j jVar, C0113p c0113p, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        C0113p c0113p2;
        int i8;
        U.l lVar2;
        C0665u c0665u2;
        Y1.e eVar3;
        Y1.e eVar4;
        q.j jVar2;
        InterfaceC0263N interfaceC0263N2;
        J0 j03;
        M0 m03;
        boolean z5;
        U.l lVar3;
        boolean z6;
        Y1.e eVar5;
        Y1.e eVar6;
        InterfaceC0263N interfaceC0263N3;
        J0 j04;
        M0 m04;
        C0665u c0665u3;
        q.j jVar3;
        c0113p.S(-1711985619);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.g(z3) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0113p.h(aVar2) ? 256 : 128;
        }
        int i9 = 1797120 | i5;
        if ((i3 & 12582912) == 0) {
            i9 = 5991424 | i5;
        }
        if ((100663296 & i3) == 0) {
            i9 |= 33554432;
        }
        if ((805306368 & i3) == 0) {
            i9 |= 268435456;
        }
        int i10 = ((i4 & 6) == 0 ? i4 | 2 : i4) | 48;
        if ((306783379 & i9) == 306783378 && (i10 & 19) == 18 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            z6 = z4;
            eVar5 = eVar;
            eVar6 = eVar2;
            interfaceC0263N3 = interfaceC0263N;
            j04 = j02;
            m04 = m02;
            c0665u3 = c0665u;
            jVar3 = jVar;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                U.i iVar = U.i.f3302a;
                float f3 = U.f1118a;
                float f4 = H.f.f1672a;
                InterfaceC0263N a3 = P0.a(11, c0113p);
                J j3 = (J) c0113p.k(L.f1045a);
                J0 j05 = j3.f988N;
                if (j05 == null) {
                    long j4 = C0288u.f4295e;
                    long c3 = L.c(j3, H.f.f1688r);
                    int i11 = H.f.f1691u;
                    long c4 = L.c(j3, i11);
                    long c5 = L.c(j3, i11);
                    i6 = i10;
                    long b2 = C0288u.b(L.c(j3, 18), 0.38f);
                    int i12 = H.f.f1689s;
                    long c6 = L.c(j3, i12);
                    float f5 = H.f.f1682k;
                    long b3 = C0288u.b(c6, f5);
                    long b4 = C0288u.b(L.c(j3, i12), f5);
                    long c7 = L.c(j3, H.f.f1685n);
                    long b5 = C0288u.b(L.c(j3, H.f.f1683l), H.f.f1675d);
                    long c8 = L.c(j3, H.f.f1687q);
                    int i13 = H.f.f1690t;
                    j05 = new J0(j4, c3, c4, c5, j4, b2, b3, b4, c7, b5, c8, L.c(j3, i13), L.c(j3, i13));
                    j3.f988N = j05;
                } else {
                    i6 = i10;
                }
                float f6 = H.f.f1674c;
                M0 m05 = new M0(f6, H.f.f1680i, H.f.f1677f, H.f.f1678g, H.f.f1673b, f6);
                i7 = i9 & (-2143289345);
                c0113p2 = c0113p;
                long d3 = L.d(H.f.f1686o, c0113p2);
                long j5 = C0288u.f4295e;
                C0288u.b(L.d(H.f.f1684m, c0113p2), H.f.f1676e);
                float f7 = H.f.f1681j;
                float f8 = H.f.f1679h;
                long j6 = z3 ? j5 : d3;
                if (z3) {
                    f7 = f8;
                }
                C0665u c0665u4 = new C0665u(f7, new C0265P(j6));
                i8 = i6 & (-15);
                lVar2 = iVar;
                c0665u2 = c0665u4;
                eVar3 = null;
                eVar4 = null;
                jVar2 = null;
                interfaceC0263N2 = a3;
                j03 = j05;
                m03 = m05;
                z5 = true;
            } else {
                c0113p.L();
                i7 = i9 & (-2143289345);
                i8 = i10 & (-15);
                lVar2 = lVar;
                z5 = z4;
                eVar3 = eVar;
                eVar4 = eVar2;
                interfaceC0263N2 = interfaceC0263N;
                j03 = j02;
                m03 = m02;
                c0665u2 = c0665u;
                jVar2 = jVar;
                c0113p2 = c0113p;
            }
            c0113p.q();
            int i14 = i7 << 3;
            int i15 = (i7 & 14) | 12582912 | ((i7 >> 6) & 112) | (i14 & 896) | ((i7 >> 3) & 7168);
            int i16 = i7 << 6;
            b(z3, lVar2, aVar, z5, aVar2, b1.a(H.f.p, c0113p2), eVar3, eVar4, interfaceC0263N2, j03, m03, c0665u2, U.f1118a, f971b, jVar2, c0113p, i15 | (57344 & i16) | (i14 & 3670016) | (i16 & 234881024), 27648 | ((i8 << 12) & 458752));
            lVar3 = lVar2;
            z6 = z5;
            eVar5 = eVar3;
            eVar6 = eVar4;
            interfaceC0263N3 = interfaceC0263N2;
            j04 = j03;
            m04 = m03;
            c0665u3 = c0665u2;
            jVar3 = jVar2;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new F(z3, aVar, aVar2, lVar3, z6, eVar5, eVar6, interfaceC0263N3, j04, m04, c0665u3, jVar3, i3, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    public static final void b(boolean z3, U.l lVar, Y1.a aVar, boolean z4, Q.a aVar2, B0.C c3, Y1.e eVar, Y1.e eVar2, InterfaceC0263N interfaceC0263N, J0 j02, M0 m02, C0665u c0665u, float f3, C0797I c0797i, q.j jVar, C0113p c0113p, int i3, int i4) {
        int i5;
        int i6;
        q.j jVar2;
        q.j jVar3;
        q.j jVar4;
        long j3;
        C0603m c0603m;
        ?? r02;
        c0113p.S(402951308);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.g(z3) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.f(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0113p.h(aVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0113p.g(z4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0113p.h(aVar2) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= c0113p.f(c3) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0113p.h(eVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0113p.h(null) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0113p.h(eVar2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0113p.f(interfaceC0263N) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0113p.f(j02) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0113p.f(m02) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0113p.f(c0665u) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0113p.c(f3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0113p.f(c0797i) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= c0113p.f(jVar) ? 131072 : 65536;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 74899) == 74898 && c0113p.x()) {
            c0113p.L();
        } else {
            c0113p.Q(2072749057);
            Object obj = C0105l.f2272a;
            if (jVar == null) {
                Object G3 = c0113p.G();
                if (G3 == obj) {
                    G3 = new q.j();
                    c0113p.a0(G3);
                }
                jVar2 = (q.j) G3;
            } else {
                jVar2 = jVar;
            }
            c0113p.p(false);
            U.l a3 = z0.k.a(lVar, C0058p.f1322g);
            long j4 = !z4 ? z3 ? j02.f1026j : j02.f1021e : !z3 ? j02.f1017a : j02.f1025i;
            c0113p.Q(2072762384);
            if (m02 == null) {
                jVar4 = jVar2;
                j3 = j4;
                r02 = 0;
                c0603m = null;
            } else {
                int i7 = ((i5 >> 9) & 14) | ((i6 << 3) & 896);
                Object G4 = c0113p.G();
                if (G4 == obj) {
                    G4 = new S.t();
                    c0113p.a0(G4);
                }
                S.t tVar = (S.t) G4;
                long j5 = j4;
                Object G5 = c0113p.G();
                if (G5 == obj) {
                    G5 = C0089d.J(null, I.X.f2228i);
                    c0113p.a0(G5);
                }
                InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G5;
                boolean f4 = c0113p.f(jVar2);
                Object G6 = c0113p.G();
                if (f4 || G6 == obj) {
                    G6 = new K0(jVar2, tVar, null);
                    c0113p.a0(G6);
                }
                C0089d.e(c0113p, (Y1.e) G6, jVar2);
                q.h hVar = (q.h) M1.l.t0(tVar);
                float f5 = !z4 ? m02.f1059f : hVar instanceof q.l ? m02.f1055b : hVar instanceof C0771f ? m02.f1057d : hVar instanceof C0769d ? m02.f1056c : hVar instanceof C0767b ? m02.f1058e : m02.f1054a;
                Object G7 = c0113p.G();
                if (G7 == obj) {
                    jVar3 = jVar2;
                    G7 = new C0593d(new M0.e(f5), m.z0.f5887c, null, 12);
                    c0113p.a0(G7);
                } else {
                    jVar3 = jVar2;
                }
                C0593d c0593d = (C0593d) G7;
                M0.e eVar3 = new M0.e(f5);
                boolean h3 = ((((i7 & 14) ^ 6) > 4 && c0113p.g(z4)) || (i7 & 6) == 4) | c0113p.h(c0593d) | c0113p.c(f5) | c0113p.h(hVar);
                Object G8 = c0113p.G();
                if (h3 || G8 == obj) {
                    jVar4 = jVar3;
                    j3 = j5;
                    L0 l02 = new L0(c0593d, f5, z4, hVar, interfaceC0088c0, null);
                    c0113p.a0(l02);
                    G8 = l02;
                } else {
                    j3 = j5;
                    jVar4 = jVar3;
                }
                C0089d.e(c0113p, (Y1.e) G8, eVar3);
                c0603m = c0593d.f5704c;
                r02 = 0;
            }
            c0113p.p(r02);
            float f6 = c0603m != null ? ((M0.e) c0603m.f5803e.getValue()).f2766d : (float) r02;
            Q.a b2 = Q.f.b(-577614814, new G(j02, z4, z3, aVar2, c3, eVar, eVar2, f3, c0797i), c0113p);
            C0132z c0132z = U0.f1119a;
            long j6 = j3;
            long b3 = L.b(j6, c0113p);
            C0132z c0132z2 = U0.f1119a;
            float f7 = ((M0.e) c0113p.k(c0132z2)).f2766d + 0;
            C0089d.b(new C0116q0[]{P.f1079a.a(new C0288u(b3)), c0132z2.a(new M0.e(f7))}, Q.f.b(-1164547968, new T0(a3, interfaceC0263N, j6, f7, c0665u, z3, jVar4, z4, aVar, f6, b2), c0113p), c0113p, 56);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new H(z3, lVar, aVar, z4, aVar2, c3, eVar, eVar2, interfaceC0263N, j02, m02, c0665u, f3, c0797i, jVar, i3, i4);
        }
    }

    public static final void c(Q.a aVar, B0.C c3, long j3, Y1.e eVar, Y1.e eVar2, long j4, long j5, float f3, C0797I c0797i, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-782878228);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.f(c3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.e(j3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.h(eVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0113p.h(null) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0113p.h(eVar2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0113p.e(j4) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= c0113p.e(j5) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= c0113p.c(f3) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= c0113p.f(c0797i) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) == 306783378 && c0113p.x()) {
            c0113p.L();
        } else {
            C0089d.b(new C0116q0[]{P.f1079a.a(new C0288u(j3)), X0.f1161a.a(c3)}, Q.f.b(1748799148, new D(f3, c0797i, eVar, eVar2, j4, aVar, j5), c0113p), c0113p, 56);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new E(aVar, c3, j3, eVar, eVar2, j4, j5, f3, c0797i, i3);
        }
    }
}
