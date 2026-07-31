package F;

import B.C0022x;
import G.AbstractC0136c;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import r0.AbstractC0898U;
import s0.C0962h;

/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1609a = 16;

    public static final void a(U.q qVar, InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, InterfaceC0426e interfaceC0426e4, int i3, long j3, long j4, r.X x3, Q.a aVar, C0167p c0167p, int i4) {
        U.q qVar2;
        InterfaceC0426e interfaceC0426e5;
        InterfaceC0426e interfaceC0426e6;
        long j5;
        long b3;
        r.X b4;
        int i5;
        InterfaceC0426e interfaceC0426e7;
        InterfaceC0426e interfaceC0426e8;
        int i6;
        long j6;
        long j7;
        U.q qVar3;
        r.X x4;
        c0167p.S(-1219521777);
        int i7 = i4 | 6;
        if ((i4 & 48) == 0) {
            i7 |= c0167p.h(interfaceC0426e) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= c0167p.h(interfaceC0426e2) ? 256 : 128;
        }
        int i8 = 224256 | i7;
        if ((1572864 & i4) == 0) {
            i8 = 748544 | i7;
        }
        if ((12582912 & i4) == 0) {
            i8 |= 4194304;
        }
        if ((100663296 & i4) == 0) {
            i8 |= 33554432;
        }
        if ((805306368 & i4) == 0) {
            i8 |= c0167p.h(aVar) ? 536870912 : 268435456;
        }
        if ((306783379 & i8) == 306783378 && c0167p.x()) {
            c0167p.L();
            qVar3 = qVar;
            interfaceC0426e7 = interfaceC0426e3;
            interfaceC0426e8 = interfaceC0426e4;
            i6 = i3;
            j6 = j3;
            j7 = j4;
            x4 = x3;
        } else {
            c0167p.N();
            if ((i4 & 1) == 0 || c0167p.w()) {
                U.n nVar = U.n.f4488a;
                Q.a aVar2 = U.f1365a;
                Q.a aVar3 = U.f1366b;
                long j8 = ((M) c0167p.k(O.f1301a)).f1251n;
                qVar2 = nVar;
                interfaceC0426e5 = aVar2;
                interfaceC0426e6 = aVar3;
                j5 = j8;
                b3 = O.b(j8, c0167p);
                b4 = AbstractC0136c.b(c0167p);
                i5 = 2;
            } else {
                c0167p.L();
                qVar2 = qVar;
                interfaceC0426e5 = interfaceC0426e3;
                interfaceC0426e6 = interfaceC0426e4;
                i5 = i3;
                j5 = j3;
                b3 = j4;
                b4 = x3;
            }
            c0167p.q();
            boolean f3 = c0167p.f(b4);
            Object G3 = c0167p.G();
            Object obj = C0159l.f2829a;
            if (f3 || G3 == obj) {
                G3 = new G.l(b4);
                c0167p.a0(G3);
            }
            G.l lVar = (G.l) G3;
            boolean f4 = c0167p.f(lVar) | c0167p.f(b4);
            Object G4 = c0167p.G();
            if (f4 || G4 == obj) {
                G4 = new C0022x(lVar, 3, b4);
                c0167p.a0(G4);
            }
            C0962h c0962h = r.a0.f8028a;
            r.X x5 = b4;
            r1.a(U.a.b(qVar2, new B.h0(5, (InterfaceC0424c) G4)), null, j5, b3, 0.0f, 0.0f, null, Q.f.b(-1979205334, new g1(i5, interfaceC0426e, aVar, interfaceC0426e5, interfaceC0426e6, lVar, interfaceC0426e2), c0167p), c0167p, 12582912, 114);
            interfaceC0426e7 = interfaceC0426e5;
            interfaceC0426e8 = interfaceC0426e6;
            i6 = i5;
            j6 = j5;
            j7 = b3;
            qVar3 = qVar2;
            x4 = x5;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new h1(qVar3, interfaceC0426e, interfaceC0426e2, interfaceC0426e7, interfaceC0426e8, i6, j6, j7, x4, aVar, i4);
        }
    }

    public static final void b(int i3, InterfaceC0426e interfaceC0426e, Q.a aVar, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, r.X x3, InterfaceC0426e interfaceC0426e4, C0167p c0167p, int i4) {
        int i5;
        c0167p.S(-975511942);
        if ((i4 & 6) == 0) {
            i5 = (c0167p.d(i3) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0167p.h(interfaceC0426e) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0167p.h(interfaceC0426e2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0167p.h(interfaceC0426e3) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0167p.f(x3) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0167p.h(interfaceC0426e4) ? 1048576 : 524288;
        }
        if ((i5 & 599187) == 599186 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z3 = ((i5 & 112) == 32) | ((i5 & 7168) == 2048) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384) | ((i5 & 14) == 4) | ((3670016 & i5) == 1048576) | ((i5 & 896) == 256);
            Object G3 = c0167p.G();
            if (z3 || G3 == C0159l.f2829a) {
                G3 = new g1(interfaceC0426e, interfaceC0426e2, interfaceC0426e3, i3, x3, interfaceC0426e4, aVar);
                c0167p.a0(G3);
            }
            AbstractC0898U.b(null, (InterfaceC0426e) G3, c0167p, 0);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new L(i3, interfaceC0426e, aVar, interfaceC0426e2, interfaceC0426e3, x3, interfaceC0426e4, i4);
        }
    }
}
