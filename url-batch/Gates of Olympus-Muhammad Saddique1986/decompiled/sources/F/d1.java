package F;

import E.C0080h;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import androidx.compose.material3.MinimumInteractiveModifier;
import b0.C0352v;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;
import n.C0694u;
import r.AbstractC0868o;
import r.C0850L;
import r.InterfaceC0849K;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0080h f1505a = new C0080h(0.16f, 0.1f, 0.08f, 0.1f);

    public static final void a(InterfaceC0422a interfaceC0422a, Q.a aVar, U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, b0.Q q3, long j3, long j4, long j5, long j6, float f3, R0.v vVar, C0167p c0167p, int i3, int i4) {
        int i5;
        int i6;
        float f4;
        b0.Q q4;
        long j7;
        R0.v vVar2;
        InterfaceC0426e interfaceC0426e5;
        long j8;
        long j9;
        long j10;
        U.q qVar2;
        int i7;
        U.q qVar3;
        InterfaceC0426e interfaceC0426e6;
        b0.Q q5;
        long j11;
        long j12;
        long j13;
        long j14;
        float f5;
        R0.v vVar3;
        c0167p.S(-2081346864);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.h(interfaceC0422a) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.h(aVar) ? 32 : 16;
        }
        int i8 = i5 | 384;
        if ((i3 & 3072) == 0) {
            i8 |= c0167p.h(interfaceC0426e) ? 2048 : 1024;
        }
        int i9 = i8 | 24576;
        if ((196608 & i3) == 0) {
            i9 |= c0167p.h(interfaceC0426e3) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i9 |= c0167p.h(interfaceC0426e4) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i9 |= 4194304;
        }
        if ((100663296 & i3) == 0) {
            i9 |= 33554432;
        }
        if ((805306368 & i3) == 0) {
            i9 |= 268435456;
        }
        int i10 = (i4 & 6) == 0 ? i4 | 2 : i4;
        if ((i4 & 48) == 0) {
            i10 |= 16;
        }
        int i11 = i10 | 3456;
        if ((306783379 & i9) == 306783378 && (i11 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
            qVar3 = qVar;
            interfaceC0426e6 = interfaceC0426e2;
            q5 = q3;
            j11 = j3;
            j12 = j4;
            j13 = j5;
            j14 = j6;
            f5 = f3;
            vVar3 = vVar;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                U.n nVar = U.n.f4488a;
                float f6 = AbstractC0081a.f1461a;
                b0.Q a3 = n1.a(H.c.f2382a, c0167p);
                long d3 = O.d(38, c0167p);
                long d4 = O.d(H.c.f2387f, c0167p);
                long d5 = O.d(H.c.f2383b, c0167p);
                long d6 = O.d(H.c.f2385d, c0167p);
                i6 = i11 & (-127);
                f4 = AbstractC0081a.f1461a;
                q4 = a3;
                j7 = d3;
                vVar2 = new R0.v();
                interfaceC0426e5 = null;
                j8 = d4;
                j9 = d5;
                j10 = d6;
                qVar2 = nVar;
                i7 = i9 & (-2143289345);
            } else {
                c0167p.L();
                i7 = i9 & (-2143289345);
                i6 = i11 & (-127);
                qVar2 = qVar;
                interfaceC0426e5 = interfaceC0426e2;
                q4 = q3;
                j7 = j3;
                j8 = j4;
                j9 = j5;
                j10 = j6;
                f4 = f3;
                vVar2 = vVar;
            }
            c0167p.q();
            AbstractC0107m.c(interfaceC0422a, aVar, qVar2, interfaceC0426e, interfaceC0426e5, interfaceC0426e3, interfaceC0426e4, q4, j7, j8, j9, j10, f4, vVar2, c0167p, i7 & 2147483646, i6 & 8190);
            qVar3 = qVar2;
            interfaceC0426e6 = interfaceC0426e5;
            q5 = q4;
            j11 = j7;
            j12 = j8;
            j13 = j9;
            j14 = j10;
            f5 = f4;
            vVar3 = vVar2;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0103k(interfaceC0422a, aVar, qVar3, interfaceC0426e, interfaceC0426e6, interfaceC0426e3, interfaceC0426e4, q5, j11, j12, j13, j14, f5, vVar3, i3, i4, 1);
        }
    }

    public static final void b(InterfaceC0422a interfaceC0422a, U.q qVar, boolean z3, b0.Q q3, A a3, d1 d1Var, C0694u c0694u, InterfaceC0849K interfaceC0849K, q.k kVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        q.k kVar2;
        c0167p.S(650121315);
        if ((i3 & 6) == 0) {
            i4 = i3 | (c0167p.h(interfaceC0422a) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.g(z3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(q3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.f(a3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.f(d1Var) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0167p.f(c0694u) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= c0167p.f(interfaceC0849K) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= c0167p.f(kVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= c0167p.h(aVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i4) == 306783378 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.N();
            if ((i3 & 1) != 0 && !c0167p.w()) {
                c0167p.L();
            }
            c0167p.q();
            c0167p.Q(-239156623);
            I.W w2 = C0159l.f2829a;
            if (kVar == null) {
                Object G3 = c0167p.G();
                if (G3 == w2) {
                    G3 = new q.k();
                    c0167p.a0(G3);
                }
                kVar2 = (q.k) G3;
            } else {
                kVar2 = kVar;
            }
            c0167p.p(false);
            long j3 = z3 ? a3.f1091a : a3.f1093c;
            long j4 = z3 ? a3.f1092b : a3.f1094d;
            c0167p.Q(-239150048);
            c0167p.p(false);
            r1.b(interfaceC0422a, A0.k.a(qVar, F.f1140f), z3, q3, j3, j4, 0.0f, 0, c0694u, kVar2, Q.f.b(956488494, new G(j4, interfaceC0849K, aVar, 0), c0167p), c0167p, (i4 & 8078) | ((i4 << 6) & 234881024), 64);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0115q(interfaceC0422a, qVar, z3, q3, a3, d1Var, c0694u, interfaceC0849K, kVar, aVar, i3);
        }
    }

    public static final void c(U.q qVar, b0.Q q3, I i3, J j3, C0694u c0694u, Q.a aVar, C0167p c0167p, int i4, int i5) {
        U.q qVar2;
        int i6;
        U.q qVar3;
        b0.Q a3;
        C0694u c0694u2;
        int i7;
        J j4;
        c0167p.S(1179621553);
        int i8 = i5 & 1;
        if (i8 != 0) {
            i6 = i4 | 6;
            qVar2 = qVar;
        } else if ((i4 & 6) == 0) {
            qVar2 = qVar;
            i6 = (c0167p.f(qVar2) ? 4 : 2) | i4;
        } else {
            qVar2 = qVar;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0167p.f(i3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= 1024;
        }
        int i9 = i6 | 24576;
        if ((196608 & i4) == 0) {
            i9 |= c0167p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i9) == 74898 && c0167p.x()) {
            c0167p.L();
            j4 = j3;
            c0694u2 = c0694u;
            qVar3 = qVar2;
            a3 = q3;
        } else {
            c0167p.N();
            if ((i4 & 1) == 0 || c0167p.w()) {
                qVar3 = i8 != 0 ? U.n.f4488a : qVar2;
                a3 = n1.a(H.i.f2404b, c0167p);
                c0694u2 = null;
                i7 = i9 & (-7281);
                j4 = new J(H.i.f2403a, H.i.f2411i, H.i.f2409g, H.i.f2410h, H.i.f2408f, H.i.f2406d);
            } else {
                c0167p.L();
                int i10 = i9 & (-7281);
                j4 = j3;
                c0694u2 = c0694u;
                i7 = i10;
                qVar3 = qVar2;
                a3 = q3;
            }
            c0167p.q();
            long j5 = i3.f1187a;
            j4.getClass();
            c0167p.Q(-1763481333);
            c0167p.Q(-734838460);
            I.W w2 = C0159l.f2829a;
            Object G3 = c0167p.G();
            if (G3 == w2) {
                G3 = C0143d.K(new O0.e(j4.f1197a), I.W.f2783i);
                c0167p.a0(G3);
            }
            c0167p.p(false);
            c0167p.p(false);
            r1.a(qVar3, a3, j5, i3.f1188b, 0.0f, ((O0.e) ((InterfaceC0142c0) G3).getValue()).f3731d, c0694u2, Q.f.b(664103990, new K(aVar, 0), c0167p), c0167p, (i7 & 14) | 12582912 | ((i7 << 6) & 3670016), 16);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new L(qVar3, a3, i3, j4, c0694u2, aVar, i4, i5);
        }
    }

    public static final void d(InterfaceC0422a interfaceC0422a, U.q qVar, boolean z3, C0112o0 c0112o0, q.k kVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        q.k kVar2;
        int i5;
        U.q qVar2;
        C0112o0 c0112o02;
        boolean z4;
        boolean z5;
        C0112o0 c0112o03;
        q.k kVar3;
        U.q qVar3;
        c0167p.S(-1142896114);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(interfaceC0422a) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i6 = i4 | 432;
        if ((i3 & 3072) == 0) {
            i6 = i4 | 1456;
        }
        int i7 = i6 | 24576;
        if ((196608 & i3) == 0) {
            i7 |= c0167p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i7) == 74898 && c0167p.x()) {
            c0167p.L();
            qVar3 = qVar;
            z5 = z3;
            c0112o03 = c0112o0;
            kVar3 = kVar;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                U.n nVar = U.n.f4488a;
                c0167p.Q(-1519621781);
                long j3 = ((C0352v) c0167p.k(V.f1382a)).f5441a;
                M m3 = (M) c0167p.k(O.f1301a);
                C0112o0 c0112o04 = m3.f1234N;
                if (c0112o04 == null) {
                    long j4 = C0352v.f5438f;
                    c0112o04 = new C0112o0(j4, j3, j4, C0352v.b(j3, 0.38f));
                    m3.f1234N = c0112o04;
                }
                long j5 = c0112o04.f1712b;
                if (C0352v.c(j5, j3)) {
                    c0167p.p(false);
                } else {
                    long b3 = C0352v.b(j3, 0.38f);
                    long j6 = j3 != 16 ? j3 : j5;
                    if (b3 == 16) {
                        b3 = c0112o04.f1714d;
                    }
                    C0112o0 c0112o05 = new C0112o0(c0112o04.f1711a, j6, c0112o04.f1713c, b3);
                    c0167p.p(false);
                    c0112o04 = c0112o05;
                }
                kVar2 = null;
                i5 = i7 & (-7169);
                qVar2 = nVar;
                c0112o02 = c0112o04;
                z4 = true;
            } else {
                c0167p.L();
                qVar2 = qVar;
                z4 = z3;
                kVar2 = kVar;
                i5 = i7 & (-7169);
                c0112o02 = c0112o0;
            }
            c0167p.q();
            I.X0 x02 = AbstractC0121t0.f1816a;
            U.q i8 = qVar2.i(MinimumInteractiveModifier.f4881a);
            float f3 = H.j.f2413b;
            U.q c2 = androidx.compose.foundation.a.c(androidx.compose.foundation.a.a(AbstractC0508a.u(androidx.compose.foundation.layout.c.h(i8, f3), n1.a(5, c0167p)), z4 ? c0112o02.f1711a : c0112o02.f1713c, b0.M.f5355a), kVar2, e1.a(false, f3 / 2, c0167p, 54, 4), z4, new A0.f(0), interfaceC0422a, 8);
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4465h, false);
            int i9 = c0167p.f2864P;
            InterfaceC0164n0 m4 = c0167p.m();
            U.q d3 = U.a.d(c0167p, c2);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m4);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i9))) {
                A.k.o(i9, c0167p, i9, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            C0143d.a(V.f1382a.a(new C0352v(z4 ? c0112o02.f1712b : c0112o02.f1714d)), aVar, c0167p, ((i5 >> 12) & 112) | 8);
            c0167p.p(true);
            z5 = z4;
            c0112o03 = c0112o02;
            kVar3 = kVar2;
            qVar3 = qVar2;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0114p0(interfaceC0422a, qVar3, z5, c0112o03, kVar3, aVar, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(InterfaceC0422a interfaceC0422a, U.q qVar, boolean z3, b0.Q q3, A a3, d1 d1Var, C0694u c0694u, InterfaceC0849K interfaceC0849K, q.k kVar, Q.a aVar, C0167p c0167p, int i3, int i4) {
        int i5;
        boolean z4;
        int i6;
        A a4;
        boolean z5;
        b0.Q q4;
        int i7;
        InterfaceC0849K interfaceC0849K2;
        U.q qVar2;
        d1 d1Var2;
        C0694u c0694u2;
        q.k kVar2;
        A a5;
        U.q qVar3;
        boolean z6;
        b0.Q q5;
        A a6;
        d1 d1Var3;
        C0694u c0694u3;
        InterfaceC0849K interfaceC0849K3;
        q.k kVar3;
        C0173s0 r3;
        c0167p.S(-2106428362);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.h(interfaceC0422a) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i8 = i5 | 48;
        int i9 = i4 & 4;
        if (i9 != 0) {
            i8 = i5 | 432;
        } else if ((i3 & 384) == 0) {
            z4 = z3;
            i8 |= c0167p.g(z4) ? 256 : 128;
            if ((i3 & 3072) == 0) {
                i8 |= 1024;
            }
            if ((i3 & 24576) == 0) {
                i8 |= 8192;
            }
            i6 = i8 | 115015680;
            if ((805306368 & i3) == 0) {
                i6 |= c0167p.h(aVar) ? 536870912 : 268435456;
            }
            if ((306783379 & i6) == 306783378 || !c0167p.x()) {
                c0167p.N();
                if ((i3 & 1) != 0 || c0167p.w()) {
                    U.n nVar = U.n.f4488a;
                    boolean z7 = i9 == 0 ? z4 : true;
                    C0850L c0850l = B.f1115a;
                    b0.Q a7 = n1.a(5, c0167p);
                    M m3 = (M) c0167p.k(O.f1301a);
                    a4 = m3.f1231K;
                    if (a4 == null) {
                        long j3 = C0352v.f5438f;
                        a4 = new A(j3, O.c(m3, 26), j3, C0352v.b(O.c(m3, 18), 0.38f));
                        m3.f1231K = a4;
                    }
                    z5 = z7;
                    q4 = a7;
                    i7 = i6 & (-64513);
                    interfaceC0849K2 = B.f1115a;
                    qVar2 = nVar;
                    d1Var2 = null;
                    c0694u2 = null;
                    kVar2 = null;
                    a5 = a4;
                } else {
                    c0167p.L();
                    i7 = i6 & (-64513);
                    qVar2 = qVar;
                    q4 = q3;
                    a5 = a3;
                    d1Var2 = d1Var;
                    c0694u2 = c0694u;
                    interfaceC0849K2 = interfaceC0849K;
                    kVar2 = kVar;
                    z5 = z4;
                }
                c0167p.q();
                b(interfaceC0422a, qVar2, z5, q4, a5, d1Var2, c0694u2, interfaceC0849K2, kVar2, aVar, c0167p, i7 & 2147483646);
                qVar3 = qVar2;
                z6 = z5;
                q5 = q4;
                a6 = a5;
                d1Var3 = d1Var2;
                c0694u3 = c0694u2;
                interfaceC0849K3 = interfaceC0849K2;
                kVar3 = kVar2;
            } else {
                c0167p.L();
                q5 = q3;
                a6 = a3;
                d1Var3 = d1Var;
                c0694u3 = c0694u;
                interfaceC0849K3 = interfaceC0849K;
                kVar3 = kVar;
                z6 = z4;
                qVar3 = qVar;
            }
            r3 = c0167p.r();
            if (r3 == null) {
                r3.f2906d = new H(interfaceC0422a, qVar3, z6, q5, a6, d1Var3, c0694u3, interfaceC0849K3, kVar3, aVar, i3, i4);
                return;
            }
            return;
        }
        z4 = z3;
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i6 = i8 | 115015680;
        if ((805306368 & i3) == 0) {
        }
        if ((306783379 & i6) == 306783378) {
        }
        c0167p.N();
        if ((i3 & 1) != 0) {
        }
        U.n nVar2 = U.n.f4488a;
        if (i9 == 0) {
        }
        C0850L c0850l2 = B.f1115a;
        b0.Q a72 = n1.a(5, c0167p);
        M m32 = (M) c0167p.k(O.f1301a);
        a4 = m32.f1231K;
        if (a4 == null) {
        }
        z5 = z7;
        q4 = a72;
        i7 = i6 & (-64513);
        interfaceC0849K2 = B.f1115a;
        qVar2 = nVar2;
        d1Var2 = null;
        c0694u2 = null;
        kVar2 = null;
        a5 = a4;
        c0167p.q();
        b(interfaceC0422a, qVar2, z5, q4, a5, d1Var2, c0694u2, interfaceC0849K2, kVar2, aVar, c0167p, i7 & 2147483646);
        qVar3 = qVar2;
        z6 = z5;
        q5 = q4;
        a6 = a5;
        d1Var3 = d1Var2;
        c0694u3 = c0694u2;
        interfaceC0849K3 = interfaceC0849K2;
        kVar3 = kVar2;
        r3 = c0167p.r();
        if (r3 == null) {
        }
    }

    public static I f(long j3, C0167p c0167p) {
        long j4;
        long b3 = O.b(j3, c0167p);
        long j5 = C0352v.f5439g;
        long b4 = C0352v.b(b3, 0.38f);
        M m3 = (M) c0167p.k(O.f1301a);
        I i3 = m3.f1232L;
        if (i3 == null) {
            float f3 = H.i.f2403a;
            j4 = b4;
            i3 = new I(O.c(m3, 39), O.a(m3, O.c(m3, 39)), b0.M.m(C0352v.b(O.c(m3, H.i.f2405c), H.i.f2407e), O.c(m3, 39)), C0352v.b(O.a(m3, O.c(m3, 39)), 0.38f));
            m3.f1232L = i3;
        } else {
            j4 = b4;
        }
        long j6 = j3 != 16 ? j3 : i3.f1187a;
        if (b3 == 16) {
            b3 = i3.f1188b;
        }
        long j7 = b3;
        if (j5 == 16) {
            j5 = i3.f1189c;
        }
        return new I(j6, j7, j5, j4 != 16 ? j4 : i3.f1190d);
    }
}
