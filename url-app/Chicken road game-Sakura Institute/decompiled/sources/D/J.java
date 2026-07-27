package D;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0219q0;
import G.C0222s0;
import G.C0235z;
import G.InterfaceC0191c0;
import Z.C0323u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l.C0778d;
import l.C0788n;
import m.C0847u;
import p.C0926b;
import p.C0928d;
import p.C0931g;
import p.C0935k;
import p.C0937m;
import p.InterfaceC0933i;
import z2.C1403G;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1339a;

    /* renamed from: b, reason: collision with root package name */
    public static final q.a0 f1340b;

    static {
        float f4 = 8;
        f1339a = f4;
        androidx.compose.foundation.layout.b.a(f4, 2);
        f1340b = androidx.compose.foundation.layout.b.a(f4, 2);
        androidx.compose.foundation.layout.b.a(f4, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z4, Function0 function0, O.a aVar, S.o oVar, boolean z5, Function2 function2, Function2 function22, Z.P p4, C0128e1 c0128e1, C0137h1 c0137h1, C0847u c0847u, C0935k c0935k, C0216p c0216p, int i2, int i4, int i5) {
        int i6;
        S.o oVar2;
        int i7;
        C0128e1 c0128e12;
        int i8;
        int i9;
        C0216p c0216p2;
        int i10;
        S.o oVar3;
        Z.P p5;
        Function2 function23;
        Function2 function24;
        C0935k c0935k2;
        C0847u c0847u2;
        C0128e1 c0128e13;
        C0137h1 c0137h12;
        boolean z6;
        boolean z7;
        Function2 function25;
        Function2 function26;
        Z.P p6;
        C0128e1 c0128e14;
        C0137h1 c0137h13;
        C0847u c0847u3;
        C0935k c0935k3;
        C0222s0 s4;
        c0216p.U(-1711985619);
        if ((i2 & 6) == 0) {
            i6 = (c0216p.g(z4) ? 4 : 2) | i2;
        } else {
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            i6 |= c0216p.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= c0216p.h(aVar) ? 256 : 128;
        }
        int i11 = i5 & 8;
        if (i11 != 0) {
            i6 |= 3072;
        } else if ((i2 & 3072) == 0) {
            oVar2 = oVar;
            i6 |= c0216p.f(oVar2) ? 2048 : 1024;
            i7 = 1794048 | i6;
            if ((i2 & 12582912) == 0) {
                i7 = 5988352 | i6;
            }
            if ((100663296 & i2) == 0) {
                i7 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                i7 |= 268435456;
            }
            int i12 = ((i4 & 6) != 0 ? i4 | 2 : i4) | 48;
            if ((306783379 & i7) != 306783378 && (i12 & 19) == 18 && c0216p.z()) {
                c0216p.N();
                z7 = z5;
                function25 = function2;
                function26 = function22;
                p6 = p4;
                c0128e14 = c0128e1;
                c0137h13 = c0137h1;
                c0847u3 = c0847u;
                c0935k3 = c0935k;
            } else {
                c0216p.P();
                if ((i2 & 1) != 0 || c0216p.y()) {
                    S.o oVar4 = i11 == 0 ? S.l.f3977a : oVar2;
                    float f4 = AbstractC0115a0.f1699a;
                    float f5 = F.l.f2421a;
                    Z.P a4 = AbstractC0146k1.a(11, c0216p);
                    K k4 = (K) c0216p.k(M.f1481a);
                    c0128e12 = k4.f1370P;
                    if (c0128e12 != null) {
                        long j4 = C0323u.f4546f;
                        long c4 = M.c(k4, F.l.f2438r);
                        int i13 = F.l.f2441u;
                        long c5 = M.c(k4, i13);
                        long c6 = M.c(k4, i13);
                        i8 = i12;
                        long b4 = C0323u.b(0.38f, M.c(k4, 18));
                        int i14 = F.l.f2439s;
                        long c7 = M.c(k4, i14);
                        float f6 = F.l.f2431k;
                        long b5 = C0323u.b(f6, c7);
                        long b6 = C0323u.b(f6, M.c(k4, i14));
                        long c8 = M.c(k4, F.l.f2434n);
                        long b7 = C0323u.b(F.l.f2424d, M.c(k4, F.l.f2432l));
                        long c9 = M.c(k4, F.l.f2437q);
                        int i15 = F.l.f2440t;
                        c0128e12 = new C0128e1(j4, c4, c5, c6, j4, b4, b5, b6, c8, b7, c9, M.c(k4, i15), M.c(k4, i15));
                        k4.f1370P = c0128e12;
                    } else {
                        i8 = i12;
                    }
                    float f7 = F.l.f2423c;
                    C0137h1 c0137h14 = new C0137h1(f7, F.l.f2429i, F.l.f2426f, F.l.f2427g, F.l.f2422b, f7);
                    i9 = i7 & (-2143289345);
                    c0216p2 = c0216p;
                    long d4 = M.d(F.l.f2435o, c0216p2);
                    long j5 = C0323u.f4546f;
                    C0323u.b(F.l.f2425e, M.d(F.l.f2433m, c0216p2));
                    float f8 = F.l.f2430j;
                    float f9 = F.l.f2428h;
                    if (z4) {
                        d4 = j5;
                    }
                    if (z4) {
                        f8 = f9;
                    }
                    C0847u c0847u4 = new C0847u(f8, new Z.S(d4));
                    i10 = i8 & (-15);
                    oVar3 = oVar4;
                    p5 = a4;
                    function23 = null;
                    function24 = null;
                    c0935k2 = null;
                    c0847u2 = c0847u4;
                    c0128e13 = c0128e12;
                    c0137h12 = c0137h14;
                    z6 = true;
                } else {
                    c0216p.N();
                    i9 = i7 & (-2143289345);
                    i10 = i12 & (-15);
                    z6 = z5;
                    function23 = function2;
                    function24 = function22;
                    p5 = p4;
                    c0128e13 = c0128e1;
                    c0137h12 = c0137h1;
                    c0847u2 = c0847u;
                    c0935k2 = c0935k;
                    oVar3 = oVar2;
                    c0216p2 = c0216p;
                }
                c0216p.r();
                int i16 = i9 << 3;
                int i17 = (i9 & 14) | 12582912 | ((i9 >> 6) & 112) | (i16 & 896) | ((i9 >> 3) & 7168);
                int i18 = i9 << 6;
                b(z4, oVar3, function0, z6, aVar, U1.a(F.l.f2436p, c0216p2), function23, function24, p5, c0128e13, c0137h12, c0847u2, AbstractC0115a0.f1699a, f1340b, c0935k2, c0216p, i17 | (57344 & i18) | (i16 & 3670016) | (i18 & 234881024), 27648 | ((i10 << 12) & 458752));
                oVar2 = oVar3;
                z7 = z6;
                function25 = function23;
                function26 = function24;
                p6 = p5;
                c0128e14 = c0128e13;
                c0137h13 = c0137h12;
                c0847u3 = c0847u2;
                c0935k3 = c0935k2;
            }
            s4 = c0216p.s();
            if (s4 == null) {
                s4.f2903d = new G(z4, function0, aVar, oVar2, z7, function25, function26, p6, c0128e14, c0137h13, c0847u3, c0935k3, i2, i4, i5);
                return;
            }
            return;
        }
        oVar2 = oVar;
        i7 = 1794048 | i6;
        if ((i2 & 12582912) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        int i122 = ((i4 & 6) != 0 ? i4 | 2 : i4) | 48;
        if ((306783379 & i7) != 306783378) {
        }
        c0216p.P();
        if ((i2 & 1) != 0) {
        }
        if (i11 == 0) {
        }
        float f42 = AbstractC0115a0.f1699a;
        float f52 = F.l.f2421a;
        Z.P a42 = AbstractC0146k1.a(11, c0216p);
        K k42 = (K) c0216p.k(M.f1481a);
        c0128e12 = k42.f1370P;
        if (c0128e12 != null) {
        }
        float f72 = F.l.f2423c;
        C0137h1 c0137h142 = new C0137h1(f72, F.l.f2429i, F.l.f2426f, F.l.f2427g, F.l.f2422b, f72);
        i9 = i7 & (-2143289345);
        c0216p2 = c0216p;
        long d42 = M.d(F.l.f2435o, c0216p2);
        long j52 = C0323u.f4546f;
        C0323u.b(F.l.f2425e, M.d(F.l.f2433m, c0216p2));
        float f82 = F.l.f2430j;
        float f92 = F.l.f2428h;
        if (z4) {
        }
        if (z4) {
        }
        C0847u c0847u42 = new C0847u(f82, new Z.S(d42));
        i10 = i8 & (-15);
        oVar3 = oVar4;
        p5 = a42;
        function23 = null;
        function24 = null;
        c0935k2 = null;
        c0847u2 = c0847u42;
        c0128e13 = c0128e12;
        c0137h12 = c0137h142;
        z6 = true;
        c0216p.r();
        int i162 = i9 << 3;
        int i172 = (i9 & 14) | 12582912 | ((i9 >> 6) & 112) | (i162 & 896) | ((i9 >> 3) & 7168);
        int i182 = i9 << 6;
        b(z4, oVar3, function0, z6, aVar, U1.a(F.l.f2436p, c0216p2), function23, function24, p5, c0128e13, c0137h12, c0847u2, AbstractC0115a0.f1699a, f1340b, c0935k2, c0216p, i172 | (57344 & i182) | (i162 & 3670016) | (i182 & 234881024), 27648 | ((i10 << 12) & 458752));
        oVar2 = oVar3;
        z7 = z6;
        function25 = function23;
        function26 = function24;
        p6 = p5;
        c0128e14 = c0128e13;
        c0137h13 = c0137h12;
        c0847u3 = c0847u2;
        c0935k3 = c0935k2;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    public static final void b(boolean z4, S.o oVar, Function0 function0, boolean z5, O.a aVar, A0.L l4, Function2 function2, Function2 function22, Z.P p4, C0128e1 c0128e1, C0137h1 c0137h1, C0847u c0847u, float f4, q.a0 a0Var, C0935k c0935k, C0216p c0216p, int i2, int i4) {
        int i5;
        int i6;
        C0935k c0935k2;
        C0935k c0935k3;
        C0935k c0935k4;
        long j4;
        C0788n c0788n;
        ?? r02;
        c0216p.U(402951308);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.g(z4) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= c0216p.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= c0216p.g(z5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= c0216p.h(aVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= c0216p.f(l4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= c0216p.h(function2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= c0216p.h(null) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= c0216p.h(function22) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= c0216p.f(p4) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0216p.f(c0128e1) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0216p.f(c0137h1) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0216p.f(c0847u) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0216p.c(f4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= c0216p.f(a0Var) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= c0216p.f(c0935k) ? 131072 : 65536;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 74899) == 74898 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(2072749057);
            Object obj = C0208l.f2826a;
            if (c0935k == null) {
                Object I3 = c0216p.I();
                if (I3 == obj) {
                    I3 = new C0935k();
                    c0216p.c0(I3);
                }
                c0935k2 = (C0935k) I3;
            } else {
                c0935k2 = c0935k;
            }
            c0216p.q(false);
            S.o a4 = y0.k.a(oVar, C0173u.f2033i);
            long j5 = !z5 ? z4 ? c0128e1.f1776j : c0128e1.f1771e : !z4 ? c0128e1.f1767a : c0128e1.f1775i;
            c0216p.S(2072762384);
            if (c0137h1 == null) {
                c0935k4 = c0935k2;
                j4 = j5;
                r02 = 0;
                c0788n = null;
            } else {
                int i7 = ((i5 >> 9) & 14) | ((i6 << 3) & 896);
                Object I4 = c0216p.I();
                if (I4 == obj) {
                    I4 = new Q.v();
                    c0216p.c0(I4);
                }
                Q.v vVar = (Q.v) I4;
                long j6 = j5;
                Object I5 = c0216p.I();
                if (I5 == obj) {
                    I5 = C0192d.K(null, G.W.f2779l);
                    c0216p.c0(I5);
                }
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I5;
                boolean f5 = c0216p.f(c0935k2);
                Object I6 = c0216p.I();
                if (f5 || I6 == obj) {
                    I6 = new C0131f1(c0935k2, vVar, null);
                    c0216p.c0(I6);
                }
                C0192d.e(c0216p, c0935k2, (Function2) I6);
                InterfaceC0933i interfaceC0933i = (InterfaceC0933i) C1403G.y(vVar);
                float f6 = !z5 ? c0137h1.f1818f : interfaceC0933i instanceof C0937m ? c0137h1.f1814b : interfaceC0933i instanceof C0931g ? c0137h1.f1816d : interfaceC0933i instanceof C0928d ? c0137h1.f1815c : interfaceC0933i instanceof C0926b ? c0137h1.f1817e : c0137h1.f1813a;
                Object I7 = c0216p.I();
                if (I7 == obj) {
                    c0935k3 = c0935k2;
                    I7 = new C0778d(new M0.e(f6), l.w0.f7858c, null, 12);
                    c0216p.c0(I7);
                } else {
                    c0935k3 = c0935k2;
                }
                C0778d c0778d = (C0778d) I7;
                M0.e eVar = new M0.e(f6);
                boolean h4 = ((((i7 & 14) ^ 6) > 4 && c0216p.g(z5)) || (i7 & 6) == 4) | c0216p.h(c0778d) | c0216p.c(f6) | c0216p.h(interfaceC0933i);
                Object I8 = c0216p.I();
                if (h4 || I8 == obj) {
                    c0935k4 = c0935k3;
                    j4 = j6;
                    C0134g1 c0134g1 = new C0134g1(c0778d, f6, z5, interfaceC0933i, interfaceC0191c0, null);
                    c0216p.c0(c0134g1);
                    I8 = c0134g1;
                } else {
                    j4 = j6;
                    c0935k4 = c0935k3;
                }
                C0192d.e(c0216p, eVar, (Function2) I8);
                c0788n = c0778d.f7700c;
                r02 = 0;
            }
            c0216p.q(r02);
            float f7 = c0788n != null ? ((M0.e) c0788n.f7813e.getValue()).f3545d : (float) r02;
            O.a b4 = O.f.b(-577614814, new H(c0128e1, z5, z4, aVar, l4, function2, function22, f4, a0Var), c0216p);
            C0235z c0235z = AbstractC0161p1.f1966a;
            long j7 = j4;
            long b5 = M.b(j7, c0216p);
            C0235z c0235z2 = AbstractC0161p1.f1966a;
            float f8 = ((M0.e) c0216p.k(c0235z2)).f3545d + 0;
            C0192d.b(new C0219q0[]{S.f1616a.a(new C0323u(b5)), c0235z2.a(new M0.e(f8))}, O.f.b(-1164547968, new C0158o1(a4, p4, j7, f8, c0847u, z4, c0935k4, z5, function0, f7, b4), c0216p), c0216p, 56);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new I(z4, oVar, function0, z5, aVar, l4, function2, function22, p4, c0128e1, c0137h1, c0847u, f4, a0Var, c0935k, i2, i4);
        }
    }

    public static final void c(O.a aVar, A0.L l4, long j4, Function2 function2, Function2 function22, long j5, long j6, float f4, q.a0 a0Var, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-782878228);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(l4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.e(j4) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.h(null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.h(function22) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= c0216p.e(j5) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= c0216p.e(j6) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= c0216p.c(f4) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= c0216p.f(a0Var) ? 536870912 : 268435456;
        }
        if ((i4 & 306783379) == 306783378 && c0216p.z()) {
            c0216p.N();
        } else {
            C0192d.b(new C0219q0[]{S.f1616a.a(new C0323u(j4)), N1.f1524a.a(l4)}, O.f.b(1748799148, new E(f4, a0Var, function2, function22, j5, aVar, j6), c0216p), c0216p, 56);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new F(aVar, l4, j4, function2, function22, j5, j6, f4, a0Var, i2);
        }
    }
}
