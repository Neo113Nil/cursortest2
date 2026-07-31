package F;

import H2.AbstractC0080b;
import I.C0089d;
import I.C0096g0;
import I.C0105l;
import I.C0113p;
import I.C0119s0;
import I.InterfaceC0110n0;
import f.AbstractC0382a;
import m.AbstractC0595e;
import m.AbstractC0598h;
import m.C0590b0;
import m.InterfaceC0615z;
import r.AbstractC0818o;
import r.C0794F;
import r.C0803O;
import r0.InterfaceC0827A;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.InterfaceC0902j;
import u0.AbstractC0963b0;

/* renamed from: F.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0062r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1356a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1357b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f1358c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f1359d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f1360e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f1361f;

    static {
        float f3 = H.h.f1694a;
        f1356a = H.h.f1696c;
        f1357b = 8;
        f1358c = 4;
        float f4 = H.h.f1695b;
        float f5 = H.h.f1697d;
        float f6 = 2;
        f1359d = (f4 - f5) / f6;
        f1360e = (H.h.f1694a - f5) / f6;
        f1361f = 12;
    }

    public static final void a(U.l lVar, long j3, long j4, float f3, r.U u3, Q.a aVar, C0113p c0113p, int i3) {
        U.l lVar2;
        int i4;
        long a3;
        float f4;
        r.U c0794f;
        U.l lVar3;
        long j5;
        float f5;
        r.U u4;
        c0113p.S(1596802123);
        int i5 = i3 | 6;
        if ((i3 & 48) == 0) {
            i5 |= c0113p.e(j3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= 128;
        }
        int i6 = i5 | 3072;
        if ((i3 & 24576) == 0) {
            i6 = i5 | 11264;
        }
        if ((196608 & i3) == 0) {
            i6 |= c0113p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i6) == 74898 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            j5 = j4;
            f5 = f3;
            u4 = u3;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                U.i iVar = U.i.f3302a;
                lVar2 = iVar;
                i4 = i6 & (-58241);
                a3 = L.a((J) c0113p.k(L.f1045a), j3);
                f4 = AbstractC0041g0.f1240a;
                c0794f = new C0794F(G.a.b(c0113p), 32 | AbstractC0382a.f4781e);
            } else {
                c0113p.L();
                i4 = i6 & (-58241);
                lVar2 = lVar;
                a3 = j4;
                f4 = f3;
                c0794f = u3;
            }
            c0113p.q();
            int i7 = (i4 & 14) | 12582912;
            int i8 = i4 << 3;
            U0.a(lVar2, null, j3, a3, f4, 0.0f, null, Q.f.b(105663120, new C0060q(c0794f, 2, aVar), c0113p), c0113p, i7 | (i8 & 896) | (i8 & 57344), 98);
            lVar3 = lVar2;
            j5 = a3;
            f5 = f4;
            u4 = c0794f;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0045i0(lVar3, j3, j5, f5, u4, aVar, i3);
        }
    }

    public static final void b(C0803O c0803o, boolean z3, Y1.a aVar, Q.a aVar2, U.l lVar, boolean z4, Y1.e eVar, boolean z5, C0043h0 c0043h0, q.j jVar, C0113p c0113p, int i3) {
        int i4;
        U.l lVar2;
        q.j jVar2;
        boolean z6;
        boolean z7;
        q.j jVar3;
        boolean z8;
        Q.a b2;
        boolean z9;
        U.l lVar3;
        boolean z10;
        q.j jVar4;
        c0113p.S(-663510974);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.f(c0803o) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.g(z3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.h(aVar2) ? 2048 : 1024;
        }
        int i5 = i4 | 221184;
        if ((1572864 & i3) == 0) {
            i5 |= c0113p.h(eVar) ? 1048576 : 524288;
        }
        int i6 = i5 | 12582912;
        if ((100663296 & i3) == 0) {
            i6 |= c0113p.f(c0043h0) ? 67108864 : 33554432;
        }
        int i7 = i6 | 805306368;
        if ((i7 & 306783379) == 306783378 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            z9 = z4;
            z10 = z5;
            jVar4 = jVar;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                lVar2 = U.i.f3302a;
                jVar2 = null;
                z6 = true;
                z7 = true;
            } else {
                c0113p.L();
                lVar2 = lVar;
                z6 = z4;
                z7 = z5;
                jVar2 = jVar;
            }
            c0113p.q();
            c0113p.Q(-103235253);
            I.X x3 = C0105l.f2272a;
            if (jVar2 == null) {
                Object G3 = c0113p.G();
                if (G3 == x3) {
                    G3 = new q.j();
                    c0113p.a0(G3);
                }
                jVar3 = (q.j) G3;
            } else {
                jVar3 = jVar2;
            }
            c0113p.p(false);
            q.j jVar5 = jVar3;
            boolean z11 = z6;
            Q.a b3 = Q.f.b(-1419576100, new C0051l0(c0043h0, z3, z11, eVar, z7, aVar2), c0113p);
            c0113p.Q(-103209106);
            if (eVar == null) {
                z8 = z11;
                b2 = null;
            } else {
                z8 = z11;
                b2 = Q.f.b(1644987592, new C0053m0(c0043h0, z3, z8, eVar), c0113p);
            }
            c0113p.p(false);
            Object G4 = c0113p.G();
            if (G4 == x3) {
                G4 = C0089d.I(0);
                c0113p.a0(G4);
            }
            C0096g0 c0096g0 = (C0096g0) G4;
            U.l a3 = C0803O.a(c0803o, androidx.compose.foundation.layout.a.f(androidx.compose.foundation.selection.b.a(lVar2, z3, jVar5, null, z8, new z0.f(4), aVar), Float.NaN, f1356a));
            Object G5 = c0113p.G();
            if (G5 == x3) {
                G5 = new C0047j0(0, c0096g0);
                c0113p.a0(G5);
            }
            U.l d3 = androidx.compose.ui.layout.a.d(a3, (Y1.c) G5);
            InterfaceC0827A e3 = AbstractC0818o.e(U.a.f3284h, true);
            int i8 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, d3);
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, C0901i.f7923e, e3);
            C0089d.Q(c0113p, C0901i.f7922d, m3);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i8))) {
                AbstractC0080b.p(i8, c0113p, i8, c0900h);
            }
            C0089d.Q(c0113p, C0901i.f7921c, c3);
            float f3 = z3 ? 1.0f : 0.0f;
            InterfaceC0615z i9 = AbstractC0595e.i(100, 0, null, 6);
            if (i9 == AbstractC0598h.f5749a) {
                c0113p.Q(1125598679);
                boolean c4 = c0113p.c(0.01f);
                Object G6 = c0113p.G();
                if (c4 || G6 == x3) {
                    G6 = AbstractC0595e.h(0.0f, Float.valueOf(0.01f), 3);
                    c0113p.a0(G6);
                }
                c0113p.p(false);
                i9 = (C0590b0) G6;
            } else {
                c0113p.Q(1125708605);
                c0113p.p(false);
            }
            boolean z12 = z8;
            I.X0 a4 = AbstractC0598h.a(Float.valueOf(f3), m.z0.f5885a, i9, Float.valueOf(0.01f), "FloatAnimation", null, c0113p, 0, 0);
            long f4 = I2.l.f((c0096g0.g() - r6.k(H.h.f1695b)) / 2, ((M0.b) c0113p.k(AbstractC0963b0.f8296f)).F(f1361f));
            boolean f5 = c0113p.f(jVar5) | c0113p.e(f4);
            Object G7 = c0113p.G();
            if (f5 || G7 == x3) {
                G7 = new G.e(jVar5, f4);
                c0113p.a0(G7);
            }
            Q.a b4 = Q.f.b(691730997, new C0036e(1, (G.e) G7), c0113p);
            Q.a b5 = Q.f.b(-474426875, new C0060q(a4, 3, c0043h0), c0113p);
            boolean f6 = c0113p.f(a4);
            Object G8 = c0113p.G();
            if (f6 || G8 == x3) {
                G8 = new A2.l(4, a4);
                c0113p.a0(G8);
            }
            c(b4, b5, b3, b2, z7, (Y1.a) G8, c0113p, ((i7 >> 9) & 57344) | 438);
            c0113p.p(true);
            z9 = z12;
            lVar3 = lVar2;
            z10 = z7;
            jVar4 = jVar2;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0049k0(c0803o, z3, aVar, aVar2, lVar3, z9, eVar, z10, c0043h0, jVar4, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (Z1.i.a(r25.G(), java.lang.Integer.valueOf(r15)) == false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Q.a aVar, Q.a aVar2, Q.a aVar3, Q.a aVar4, boolean z3, Y1.a aVar5, C0113p c0113p, int i3) {
        int i4;
        I.X x3;
        boolean z4;
        c0113p.S(-1427075886);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(aVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0113p.h(aVar4) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0113p.g(z3) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0113p.h(aVar5) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0113p.x()) {
            c0113p.L();
        } else {
            int i5 = 458752 & i4;
            int i6 = 57344 & i4;
            boolean z5 = (i5 == 131072) | ((i4 & 7168) == 2048) | (i6 == 16384);
            Object G3 = c0113p.G();
            I.X x4 = C0105l.f2272a;
            if (z5 || G3 == x4) {
                G3 = new C0057o0(aVar5, aVar4, z3);
                c0113p.a0(G3);
            }
            InterfaceC0827A interfaceC0827A = (InterfaceC0827A) G3;
            U.i iVar = U.i.f3302a;
            int i7 = c0113p.f2306P;
            InterfaceC0110n0 m3 = c0113p.m();
            U.l c3 = U.m.c(c0113p, iVar);
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
            if (c0113p.f2305O) {
                x3 = x4;
            } else {
                x3 = x4;
            }
            AbstractC0080b.p(i7, c0113p, i7, c0900h3);
            C0900h c0900h4 = C0901i.f7921c;
            C0089d.Q(c0113p, c0900h4, c3);
            aVar.g(c0113p, Integer.valueOf(i4 & 14));
            aVar2.g(c0113p, Integer.valueOf((i4 >> 3) & 14));
            U.l c4 = androidx.compose.ui.layout.a.c("icon");
            U.d dVar = U.a.f3280d;
            InterfaceC0827A e3 = AbstractC0818o.e(dVar, false);
            int i8 = c0113p.f2306P;
            InterfaceC0110n0 m4 = c0113p.m();
            U.l c5 = U.m.c(c0113p, c4);
            c0113p.U();
            if (c0113p.f2305O) {
                c0113p.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p, c0900h, e3);
            C0089d.Q(c0113p, c0900h2, m4);
            if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i8))) {
                AbstractC0080b.p(i8, c0113p, i8, c0900h3);
            }
            C0089d.Q(c0113p, c0900h4, c5);
            aVar3.g(c0113p, Integer.valueOf((i4 >> 6) & 14));
            c0113p.p(true);
            c0113p.Q(1087198243);
            if (aVar4 != null) {
                U.l c6 = androidx.compose.ui.layout.a.c("label");
                boolean z6 = (i6 == 16384) | (i5 == 131072);
                Object G4 = c0113p.G();
                if (z6 || G4 == x3) {
                    G4 = new C0055n0(z3, aVar5, 0);
                    c0113p.a0(G4);
                }
                U.l n3 = androidx.compose.foundation.layout.a.n(androidx.compose.ui.graphics.a.a(c6, (Y1.c) G4), f1357b / 2, 0.0f, 2);
                InterfaceC0827A e4 = AbstractC0818o.e(dVar, false);
                int i9 = c0113p.f2306P;
                InterfaceC0110n0 m5 = c0113p.m();
                U.l c7 = U.m.c(c0113p, n3);
                c0113p.U();
                if (c0113p.f2305O) {
                    c0113p.l(c0906n);
                } else {
                    c0113p.d0();
                }
                C0089d.Q(c0113p, c0900h, e4);
                C0089d.Q(c0113p, c0900h2, m5);
                if (c0113p.f2305O || !Z1.i.a(c0113p.G(), Integer.valueOf(i9))) {
                    AbstractC0080b.p(i9, c0113p, i9, c0900h3);
                }
                C0089d.Q(c0113p, c0900h4, c7);
                aVar4.g(c0113p, Integer.valueOf((i4 >> 9) & 14));
                z4 = true;
                c0113p.p(true);
            } else {
                z4 = true;
            }
            c0113p.p(false);
            c0113p.p(z4);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new W(aVar, aVar2, aVar3, aVar4, z3, aVar5, i3);
        }
    }
}
