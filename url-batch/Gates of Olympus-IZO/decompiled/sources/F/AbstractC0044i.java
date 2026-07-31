package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.C0132z;
import I.InterfaceC0110n0;
import b0.AbstractC0259J;
import b0.C0288u;
import c0.C0301d;
import c0.C0309l;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import m.AbstractC0595e;
import m.AbstractC0614y;
import m.C0610u;
import r.AbstractC0818o;
import r.C0794F;
import r.InterfaceC0808e;
import r.InterfaceC0809f;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u0.AbstractC0963b0;

/* renamed from: F.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0044i {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1260a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1261b;

    static {
        new C0610u(0.8f, 0.0f, 0.8f, 0.15f);
        float f3 = 4;
        f1260a = f3;
        f1261b = 16 - f3;
    }

    public static final void a(Q.a aVar, U.l lVar, Y1.e eVar, Y1.f fVar, float f3, r.U u3, Y0 y02, C0113p c0113p, int i3) {
        int i4;
        int i5;
        U.l lVar2;
        float f4;
        r.U c0794f;
        U.l lVar3;
        r.U u4;
        float f5;
        c0113p.S(1952988048);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        int i6 = i4 | 48;
        if ((i3 & 384) == 0) {
            i6 |= c0113p.h(eVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= c0113p.h(fVar) ? 2048 : 1024;
        }
        int i7 = i6 | 24576;
        if ((196608 & i3) == 0) {
            i7 = 90112 | i6;
        }
        if ((1572864 & i3) == 0) {
            i7 |= c0113p.f(y02) ? 1048576 : 524288;
        }
        int i8 = 12582912 | i7;
        if ((4793491 & i8) == 4793490 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            f5 = f3;
            u4 = u3;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                i5 = i8 & (-458753);
                lVar2 = U.i.f3302a;
                f4 = Z0.f1174a;
                c0794f = new C0794F(G.a.b(c0113p), AbstractC0382a.f4781e | 16);
            } else {
                c0113p.L();
                i5 = i8 & (-458753);
                lVar2 = lVar;
                f4 = f3;
                c0794f = u3;
            }
            c0113p.q();
            int i9 = ((i5 >> 3) & 14) | 3072 | ((i5 << 3) & 112);
            int i10 = i5 << 6;
            b(lVar2, aVar, b1.a(H.p.f1759b, c0113p), eVar, fVar, (M0.e.a(f4, Float.NaN) || M0.e.a(f4, Float.POSITIVE_INFINITY)) ? Z0.f1174a : f4, c0794f, y02, c0113p, i9 | (57344 & i10) | (458752 & i10) | (234881024 & i10) | (i10 & 1879048192));
            lVar3 = lVar2;
            u4 = c0794f;
            f5 = f4;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0028a(aVar, lVar3, eVar, fVar, f5, u4, y02, i3);
        }
    }

    public static final void b(U.l lVar, Q.a aVar, B0.C c3, Y1.e eVar, Y1.f fVar, float f3, r.U u3, Y0 y02, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-342194911);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(lVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.f(c3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.g(true) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0113p.h(eVar) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0113p.h(fVar) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= c0113p.c(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= c0113p.f(u3) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= c0113p.f(y02) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= c0113p.f(null) ? 536870912 : 268435456;
        }
        if ((306783379 & i4) == 306783378 && c0113p.x()) {
            c0113p.L();
        } else {
            if (Float.isNaN(f3) || f3 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            int i5 = i4 & 1879048192;
            boolean c4 = (i5 == 536870912) | c0113p.c(AbstractC0381e.n(((M0.b) c0113p.k(AbstractC0963b0.f8296f)).F(f3), 0.0f));
            Object G3 = c0113p.G();
            I.X x3 = C0105l.f2272a;
            if (c4 || G3 == x3) {
                G3 = new K(0, 12);
                c0113p.a0(G3);
            }
            C0089d.g((Y1.a) G3, c0113p);
            boolean z3 = i5 == 536870912;
            Object G4 = c0113p.G();
            if (z3 || G4 == x3) {
                G4 = C0089d.D(new K(0, 13));
                c0113p.a0(G4);
            }
            float floatValue = ((Number) ((I.X0) G4).getValue()).floatValue();
            y02.getClass();
            float a3 = AbstractC0614y.f5881b.a(floatValue);
            C0309l c0309l = C0301d.f4367t;
            long a4 = C0288u.a(y02.f1167a, c0309l);
            long j3 = y02.f1168b;
            long a5 = C0288u.a(j3, c0309l);
            float d3 = C0288u.d(a4);
            float h3 = C0288u.h(a4);
            float g3 = C0288u.g(a4);
            float e3 = C0288u.e(a4);
            float d4 = C0288u.d(a5);
            float h4 = C0288u.h(a5);
            float g4 = C0288u.g(a5);
            float e4 = C0288u.e(a5);
            float f4 = a3 >= 0.0f ? a3 : 0.0f;
            float f5 = f4 <= 1.0f ? f4 : 1.0f;
            I.X0 a6 = l.L.a(C0288u.a(AbstractC0259J.h(I2.l.G(h3, h4, f5), I2.l.G(g3, g4, f5), I2.l.G(e3, e4, f5), I2.l.G(d3, d4, f5), c0309l), C0288u.f(j3)), AbstractC0595e.h(400.0f, null, 5), null, c0113p, 48, 12);
            Q.a b2 = Q.f.b(1370231018, new C0036e(0, fVar), c0113p);
            c0113p.Q(-1193605157);
            U.i iVar = U.i.f3302a;
            c0113p.p(false);
            U0.a(lVar.e(iVar), null, ((C0288u) a6.getValue()).f4298a, 0L, 0.0f, 0.0f, null, Q.f.b(-1943739546, new C0032c(u3, f3, y02, aVar, c3, eVar, b2), c0113p), c0113p, 12582912, 122);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0034d(lVar, aVar, c3, eVar, fVar, f3, u3, y02, i3);
        }
    }

    public static final void c(U.l lVar, C0030b c0030b, long j3, long j4, long j5, Q.a aVar, B0.C c3, InterfaceC0809f interfaceC0809f, InterfaceC0808e interfaceC0808e, Y1.e eVar, Q.a aVar2, C0113p c0113p, int i3, int i4) {
        int i5;
        int i6;
        c0113p.S(-742442296);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.f(lVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? c0113p.f(c0030b) : c0113p.h(c0030b) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0113p.e(j3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0113p.e(j4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0113p.e(j5) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= c0113p.h(aVar) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0113p.f(c3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0113p.c(1.0f) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0113p.f(interfaceC0809f) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0113p.f(interfaceC0808e) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0113p.d(0) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= c0113p.g(false) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= c0113p.h(eVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= c0113p.h(aVar2) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((i5 & 306783379) == 306783378 && (i7 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            boolean z3 = ((i5 & 112) == 32 || ((i5 & 64) != 0 && c0113p.h(c0030b))) | ((1879048192 & i5) == 536870912) | ((234881024 & i5) == 67108864) | ((i7 & 14) == 4);
            Object G3 = c0113p.G();
            if (z3 || G3 == C0105l.f2272a) {
                G3 = new C0040g(c0030b, interfaceC0808e, interfaceC0809f);
                c0113p.a0(G3);
            }
            InterfaceC0827A interfaceC0827A = (InterfaceC0827A) G3;
            int i8 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c4 = U.m.c(c0113p, lVar);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0900h c0900h = C0901i.f7923e;
            C0089d.Q(c0113p, c0900h, interfaceC0827A);
            C0900h c0900h2 = C0901i.f7922d;
            C0089d.Q(c0113p, c0900h2, m3);
            C0900h c0900h3 = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i8))) {
                AbstractC0080b.p(i8, c0113p, i8, c0900h3);
            }
            C0900h c0900h4 = C0901i.f7921c;
            C0089d.Q(c0113p, c0900h4, c4);
            U.i iVar = U.i.f3302a;
            U.l c5 = androidx.compose.ui.layout.a.c("navigationIcon");
            float f3 = f1260a;
            U.l p = androidx.compose.foundation.layout.a.p(c5, f3, 0.0f, 0.0f, 0.0f, 14);
            U.d dVar = U.a.f3280d;
            int i9 = i5;
            InterfaceC0827A e3 = AbstractC0818o.e(dVar, false);
            int i10 = c0113p.f2306P;
            InterfaceC0110n0 m4 = c0113p.m();
            U.l c6 = U.m.c(c0113p, p);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h, e3);
            C0089d.Q(c0113p, c0900h2, m4);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i10))) {
                AbstractC0080b.p(i10, c0113p, i10, c0900h3);
            }
            C0089d.Q(c0113p, c0900h4, c6);
            C0132z c0132z = P.f1079a;
            C0089d.a(c0132z.a(new C0288u(j3)), eVar, c0113p, ((i7 >> 3) & 112) | 8);
            c0113p.p(true);
            U.l b2 = androidx.compose.ui.graphics.a.b(androidx.compose.foundation.layout.a.n(androidx.compose.ui.layout.a.c("title"), f3, 0.0f, 2).e(iVar), 1.0f, 0.0f, null, false, 131067);
            InterfaceC0827A e4 = AbstractC0818o.e(dVar, false);
            int i11 = c0113p.f2306P;
            InterfaceC0110n0 m5 = c0113p.m();
            U.l c7 = U.m.c(c0113p, b2);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h, e4);
            C0089d.Q(c0113p, c0900h2, m5);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i11))) {
                AbstractC0080b.p(i11, c0113p, i11, c0900h3);
            }
            C0089d.Q(c0113p, c0900h4, c7);
            int i12 = i9 >> 9;
            G.a.a(j4, c3, aVar, c0113p, (i12 & 14) | ((i9 >> 15) & 112) | (i12 & 896));
            c0113p.p(true);
            U.l p3 = androidx.compose.foundation.layout.a.p(androidx.compose.ui.layout.a.c("actionIcons"), 0.0f, 0.0f, f3, 0.0f, 11);
            InterfaceC0827A e5 = AbstractC0818o.e(dVar, false);
            int i13 = c0113p.f2306P;
            InterfaceC0110n0 m6 = c0113p.m();
            U.l c8 = U.m.c(c0113p, p3);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h, e5);
            C0089d.Q(c0113p, c0900h2, m6);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i13))) {
                AbstractC0080b.p(i13, c0113p, i13, c0900h3);
            }
            C0089d.Q(c0113p, c0900h4, c8);
            C0089d.a(c0132z.a(new C0288u(j5)), aVar2, c0113p, ((i7 >> 6) & 112) | 8);
            c0113p.p(true);
            c0113p.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0042h(lVar, c0030b, j3, j4, j5, aVar, c3, interfaceC0809f, interfaceC0808e, eVar, aVar2, i3, i4);
        }
    }
}
