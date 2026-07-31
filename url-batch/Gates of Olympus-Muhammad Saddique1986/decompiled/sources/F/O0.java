package F;

import C0.C0025a;
import G.AbstractC0136c;
import I.C0143d;
import I.C0150g0;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0164n0;
import b0.C0352v;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import m.AbstractC0620e;
import m.AbstractC0623h;
import m.InterfaceC0627l;
import r.AbstractC0856c;
import r.AbstractC0868o;
import r.C0847I;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1303a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1304b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1305c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1306d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1307e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f1308f;

    static {
        float f3 = H.n.f2429a;
        f1303a = H.n.f2431c;
        f1304b = 8;
        f1305c = 4;
        float f4 = H.n.f2430b;
        float f5 = H.n.f2432d;
        float f6 = 2;
        f1306d = (f4 - f5) / f6;
        f1307e = (H.n.f2429a - f5) / f6;
        f1308f = 12;
    }

    public static final void a(U.q qVar, long j3, long j4, float f3, r.X x3, Q.a aVar, C0167p c0167p, int i3) {
        U.q qVar2;
        long d3;
        float f4;
        r.X c0847i;
        int i4;
        long j5;
        r.X x4;
        long j6;
        long j7;
        c0167p.S(1596802123);
        int i5 = i3 | 6;
        if ((i3 & 48) == 0) {
            i5 = i3 | 22;
        }
        if ((i3 & 384) == 0) {
            i5 |= 128;
        }
        int i6 = i5 | 3072;
        if ((i3 & 24576) == 0) {
            i6 = i5 | 11264;
        }
        if ((196608 & i3) == 0) {
            i6 |= c0167p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && c0167p.x()) {
            c0167p.L();
            qVar2 = qVar;
            j6 = j3;
            j7 = j4;
            f4 = f3;
            x4 = x3;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                qVar2 = U.n.f4488a;
                float f5 = E0.f1139a;
                float f6 = H.n.f2429a;
                d3 = O.d(37, c0167p);
                long a3 = O.a((M) c0167p.k(O.f1301a), d3);
                f4 = E0.f1139a;
                c0847i = new C0847I(AbstractC0136c.b(c0167p), AbstractC0856c.f8041g | 32);
                i4 = i6 & (-58353);
                j5 = a3;
            } else {
                c0167p.L();
                int i7 = i6 & (-58353);
                d3 = j3;
                j5 = j4;
                f4 = f3;
                c0847i = x3;
                i4 = i7;
                qVar2 = qVar;
            }
            c0167p.q();
            x4 = c0847i;
            r1.a(qVar2, null, d3, j5, f4, 0.0f, null, Q.f.b(105663120, new C0087c(c0847i, 4, aVar), c0167p), c0167p, (i4 & 14) | 12582912 | ((i4 << 3) & 57344), 98);
            long j8 = j5;
            j6 = d3;
            j7 = j8;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new G0(qVar2, j6, j7, f4, x4, aVar, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a1, code lost:
    
        if (r13 == r6) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r.S s3, boolean z3, InterfaceC0422a interfaceC0422a, Q.a aVar, U.q qVar, boolean z4, InterfaceC0426e interfaceC0426e, boolean z5, F0 f02, q.k kVar, C0167p c0167p, int i3) {
        int i4;
        F0 f03;
        int i5;
        int i6;
        U.q qVar2;
        boolean z6;
        boolean z7;
        q.k kVar2;
        q.k kVar3;
        InterfaceC0627l interfaceC0627l;
        Object obj;
        boolean z8;
        F0 f04;
        boolean z9;
        U.q qVar3;
        boolean z10;
        c0167p.S(-663510974);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(s3) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.g(z3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.h(aVar) ? 2048 : 1024;
        }
        int i7 = i4 | 221184;
        if ((1572864 & i3) == 0) {
            i7 |= c0167p.h(interfaceC0426e) ? 1048576 : 524288;
        }
        int i8 = 12582912 | i7;
        if ((100663296 & i3) == 0) {
            i8 = 46137344 | i7;
        }
        int i9 = 805306368 | i8;
        if ((306783379 & i9) == 306783378 && c0167p.x()) {
            c0167p.L();
            qVar3 = qVar;
            z9 = z4;
            z10 = z5;
            f04 = f02;
            kVar2 = kVar;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                U.n nVar = U.n.f4488a;
                M m3 = (M) c0167p.k(O.f1301a);
                f03 = m3.f1236P;
                if (f03 == null) {
                    float f3 = H.n.f2429a;
                    long c2 = O.c(m3, 15);
                    long c3 = O.c(m3, 18);
                    long c4 = O.c(m3, 32);
                    int i10 = H.n.f2433e;
                    long c5 = O.c(m3, i10);
                    int i11 = H.n.f2434f;
                    f03 = new F0(c2, c3, c4, c5, O.c(m3, i11), C0352v.b(O.c(m3, i10), 0.38f), C0352v.b(O.c(m3, i11), 0.38f));
                    m3.f1236P = f03;
                    i5 = -234881025;
                } else {
                    i5 = -234881025;
                }
                i6 = i9 & i5;
                qVar2 = nVar;
                z6 = true;
                z7 = true;
                kVar2 = null;
            } else {
                c0167p.L();
                qVar2 = qVar;
                z6 = z4;
                z7 = z5;
                f03 = f02;
                kVar2 = kVar;
                i6 = i9 & (-234881025);
            }
            c0167p.q();
            c0167p.Q(-103235253);
            Object obj2 = C0159l.f2829a;
            if (kVar2 == null) {
                Object G3 = c0167p.G();
                if (G3 == obj2) {
                    G3 = new q.k();
                    c0167p.a0(G3);
                }
                kVar3 = (q.k) G3;
            } else {
                kVar3 = kVar2;
            }
            c0167p.p(false);
            q.k kVar4 = kVar3;
            Q.a b3 = Q.f.b(-1419576100, new I0(f03, z3, z6, interfaceC0426e, z7, aVar), c0167p);
            c0167p.Q(-103209106);
            Q.a b4 = interfaceC0426e == null ? null : Q.f.b(1644987592, new J0(f03, z3, z6, interfaceC0426e), c0167p);
            c0167p.p(false);
            Object G4 = c0167p.G();
            if (G4 == obj2) {
                G4 = C0143d.J(0);
                c0167p.a0(G4);
            }
            C0150g0 c0150g0 = (C0150g0) G4;
            U.q a3 = r.S.a(s3, androidx.compose.foundation.layout.c.b(androidx.compose.foundation.selection.a.a(qVar2, z3, kVar4, z6, new A0.f(4), interfaceC0422a), 0.0f, f1303a, 1));
            Object G5 = c0167p.G();
            if (G5 == obj2) {
                G5 = new A0.l(3, c0150g0);
                c0167p.a0(G5);
            }
            U.q e3 = androidx.compose.ui.layout.a.e(a3, (InterfaceC0424c) G5);
            InterfaceC0885G e4 = AbstractC0868o.e(U.b.f4465h, true);
            int i12 = c0167p.f2864P;
            InterfaceC0164n0 m4 = c0167p.m();
            U.q d3 = U.a.d(c0167p, e3);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e4);
            C0143d.R(c0167p, C0996i.f8756d, m4);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i12))) {
                A.k.o(i12, c0167p, i12, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            float f4 = z3 ? 1.0f : 0.0f;
            m.t0 j3 = AbstractC0620e.j(100, 0, null, 6);
            if (j3 == AbstractC0623h.f6803a) {
                c0167p.Q(1125598679);
                boolean c6 = c0167p.c(0.01f);
                Object G6 = c0167p.G();
                if (c6 || G6 == obj2) {
                    G6 = AbstractC0620e.i(0.0f, Float.valueOf(0.01f), 3);
                    c0167p.a0(G6);
                }
                interfaceC0627l = (m.W) G6;
                c0167p.p(false);
            } else {
                c0167p.Q(1125708605);
                c0167p.p(false);
                interfaceC0627l = j3;
            }
            F0 f05 = f03;
            InterfaceC0627l interfaceC0627l2 = interfaceC0627l;
            boolean z11 = z6;
            I.W0 a4 = AbstractC0623h.a(Float.valueOf(f4), m.v0.f6899a, interfaceC0627l2, Float.valueOf(0.01f), "FloatAnimation", null, c0167p, 0, 0);
            long e5 = l0.c.e((c0150g0.g() - r6.l(H.n.f2430b)) / 2, ((O0.b) c0167p.k(AbstractC1101g0.f9354f)).J(f1308f));
            boolean f5 = c0167p.f(kVar4) | c0167p.e(e5);
            Object G7 = c0167p.G();
            if (f5) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            G7 = new G.i(kVar4, e5);
            c0167p.a0(G7);
            Q.a b5 = Q.f.b(691730997, new C0025a(2, (G.i) G7), c0167p);
            Q.a b6 = Q.f.b(-474426875, new C0087c(a4, 5, f05), c0167p);
            boolean f6 = c0167p.f(a4);
            Object G8 = c0167p.G();
            if (f6 || G8 == obj) {
                z8 = true;
                G8 = new B.J(a4, 1);
                c0167p.a0(G8);
            } else {
                z8 = true;
            }
            c(b5, b6, b3, b4, z7, (InterfaceC0422a) G8, c0167p, ((i6 >> 9) & 57344) | 438);
            c0167p.p(z8);
            f04 = f05;
            z9 = z11;
            qVar3 = qVar2;
            z10 = z7;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new H0(s3, z3, interfaceC0422a, aVar, qVar3, z9, interfaceC0426e, z10, f04, kVar2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0105, code lost:
    
        if (f2.j.a(r26.G(), java.lang.Integer.valueOf(r15)) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Q.a aVar, Q.a aVar2, Q.a aVar3, Q.a aVar4, boolean z3, InterfaceC0422a interfaceC0422a, C0167p c0167p, int i3) {
        int i4;
        int i5;
        boolean z4;
        C1001n c1001n;
        c0167p.S(-1427075886);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.h(aVar4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.g(z3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0167p.x()) {
            c0167p.L();
        } else {
            int i6 = 458752 & i4;
            int i7 = 57344 & i4;
            boolean z5 = (i6 == 131072) | ((i4 & 7168) == 2048) | (i7 == 16384);
            Object G3 = c0167p.G();
            I.W w2 = C0159l.f2829a;
            if (z5 || G3 == w2) {
                G3 = new L0(interfaceC0422a, aVar4, z3);
                c0167p.a0(G3);
            }
            InterfaceC0885G interfaceC0885G = (InterfaceC0885G) G3;
            U.n nVar = U.n.f4488a;
            int i8 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, nVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n2 = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n2);
            } else {
                c0167p.d0();
            }
            C0995h c0995h = C0996i.f8757e;
            C0143d.R(c0167p, c0995h, interfaceC0885G);
            C0995h c0995h2 = C0996i.f8756d;
            C0143d.R(c0167p, c0995h2, m3);
            C0995h c0995h3 = C0996i.f8758f;
            if (c0167p.f2863O) {
                i5 = i6;
            } else {
                i5 = i6;
            }
            A.k.o(i8, c0167p, i8, c0995h3);
            C0995h c0995h4 = C0996i.f8755c;
            C0143d.R(c0167p, c0995h4, d3);
            aVar.h(c0167p, Integer.valueOf(i4 & 14));
            aVar2.h(c0167p, Integer.valueOf((i4 >> 3) & 14));
            U.q c2 = androidx.compose.ui.layout.a.c(nVar, "icon");
            U.i iVar = U.b.f4461d;
            InterfaceC0885G e3 = AbstractC0868o.e(iVar, false);
            int i9 = c0167p.f2864P;
            InterfaceC0164n0 m4 = c0167p.m();
            U.q d4 = U.a.d(c0167p, c2);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n2);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e3);
            C0143d.R(c0167p, c0995h2, m4);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i9))) {
                A.k.o(i9, c0167p, i9, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d4);
            aVar3.h(c0167p, Integer.valueOf((i4 >> 6) & 14));
            c0167p.p(true);
            c0167p.Q(1087198243);
            if (aVar4 != null) {
                U.q c3 = androidx.compose.ui.layout.a.c(nVar, "label");
                boolean z6 = (i7 == 16384) | (i5 == 131072);
                Object G4 = c0167p.G();
                if (z6 || G4 == w2) {
                    c1001n = c1001n2;
                    G4 = new K0(z3, interfaceC0422a, 0);
                    c0167p.a0(G4);
                } else {
                    c1001n = c1001n2;
                }
                U.q h3 = androidx.compose.foundation.layout.b.h(androidx.compose.ui.graphics.a.a(c3, (InterfaceC0424c) G4), f1304b / 2, 0.0f, 2);
                InterfaceC0885G e4 = AbstractC0868o.e(iVar, false);
                int i10 = c0167p.f2864P;
                InterfaceC0164n0 m5 = c0167p.m();
                U.q d5 = U.a.d(c0167p, h3);
                c0167p.U();
                if (c0167p.f2863O) {
                    c0167p.l(c1001n);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e4);
                C0143d.R(c0167p, c0995h2, m5);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i10))) {
                    A.k.o(i10, c0167p, i10, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d5);
                aVar4.h(c0167p, Integer.valueOf((i4 >> 9) & 14));
                z4 = true;
                c0167p.p(true);
            } else {
                z4 = true;
            }
            c0167p.p(false);
            c0167p.p(z4);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0114p0(aVar, aVar2, aVar3, aVar4, z3, interfaceC0422a, i3);
        }
    }
}
