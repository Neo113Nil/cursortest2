package D;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import Q.C0267c;
import k.AbstractC0725A;
import k.C0730F;
import k.C0731G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0779e;
import l.C0795v;
import p.C0935k;

/* renamed from: D.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0151m0 {
    static {
        C0795v c0795v = F.n.f2445b;
        C0731G b4 = AbstractC0725A.b(AbstractC0779e.j(100, 0, c0795v, 2));
        C0795v c0795v2 = F.n.f2444a;
        l.u0 j4 = AbstractC0779e.j(500, 0, c0795v2, 2);
        S.e eVar = S.b.f3963r;
        k.u uVar = k.u.f7331m;
        boolean a4 = Intrinsics.a(eVar, eVar);
        S.g gVar = S.b.f3956k;
        S.g gVar2 = S.b.f3957l;
        S.e eVar2 = S.b.f3965t;
        S.g gVar3 = S.b.f3955j;
        b4.a(new C0731G(new k.O(null, new k.t(a4 ? gVar3 : Intrinsics.a(eVar, eVar2) ? gVar2 : gVar, new C0267c(2, uVar), j4, true), null, false, null, 59)));
        C0730F a5 = AbstractC0725A.a(new l.u0(200, 100, c0795v));
        l.u0 j5 = AbstractC0779e.j(500, 0, c0795v2, 2);
        k.u uVar2 = k.u.f7330l;
        if (Intrinsics.a(eVar, eVar)) {
            gVar = gVar3;
        } else if (Intrinsics.a(eVar, eVar2)) {
            gVar = gVar2;
        }
        a5.a(new C0730F(new k.O(null, new k.t(gVar, new C0267c(1, uVar2), j5, true), null, false, null, 59)));
    }

    public static final void a(Function0 function0, S.o oVar, Z.P p4, long j4, long j5, C0133g0 c0133g0, C0935k c0935k, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        int i5;
        S.o oVar2;
        C0133g0 c0133g02;
        Z.P p5;
        C0935k c0935k2;
        C0935k c0935k3;
        S.o oVar3;
        Z.P p6;
        C0935k c0935k4;
        S.o oVar4;
        C0133g0 c0133g03;
        c0216p.U(-731723913);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i4 | 48;
        if ((i2 & 384) == 0) {
            i6 = i4 | 176;
        }
        if ((i2 & 3072) == 0) {
            i6 |= c0216p.e(j4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= c0216p.e(j5) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= 65536;
        }
        int i7 = 1572864 | i6;
        if ((12582912 & i2) == 0) {
            i7 |= c0216p.h(aVar) ? 8388608 : 4194304;
        }
        if ((4793491 & i7) == 4793490 && c0216p.z()) {
            c0216p.N();
            oVar4 = oVar;
            p6 = p4;
            c0133g03 = c0133g0;
            c0935k4 = c0935k;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                S.l lVar = S.l.f3977a;
                int i8 = AbstractC0118b0.f1716a;
                Z.P a4 = AbstractC0146k1.a(F.h.f2391c, c0216p);
                i5 = i7 & (-459649);
                oVar2 = lVar;
                c0133g02 = new C0133g0(F.h.f2389a, F.h.f2395g, F.h.f2393e, F.h.f2394f);
                p5 = a4;
                c0935k2 = null;
            } else {
                c0216p.N();
                i5 = i7 & (-459649);
                oVar2 = oVar;
                p5 = p4;
                c0133g02 = c0133g0;
                c0935k2 = c0935k;
            }
            c0216p.r();
            c0216p.S(519755085);
            Object obj = C0208l.f2826a;
            if (c0935k2 == null) {
                Object I3 = c0216p.I();
                if (I3 == obj) {
                    I3 = new C0935k();
                    c0216p.c0(I3);
                }
                c0935k3 = (C0935k) I3;
            } else {
                c0935k3 = c0935k2;
            }
            c0216p.q(false);
            S.o a5 = y0.k.a(oVar2, C0173u.f2034j);
            float f4 = c0133g02.f1795a;
            boolean f5 = c0216p.f(c0935k3);
            Object I4 = c0216p.I();
            if (f5 || I4 == obj) {
                oVar3 = oVar2;
                I4 = new C0142j0(c0133g02.f1795a, c0133g02.f1796b, c0133g02.f1798d, c0133g02.f1797c);
                c0216p.c0(I4);
            } else {
                oVar3 = oVar2;
            }
            C0142j0 c0142j0 = (C0142j0) I4;
            boolean h4 = c0216p.h(c0142j0) | c0216p.f(c0133g02);
            Object I5 = c0216p.I();
            if (h4 || I5 == obj) {
                I5 = new C0121c0(c0142j0, c0133g02, null);
                c0216p.c0(I5);
            }
            C0192d.e(c0216p, c0133g02, (Function2) I5);
            boolean f6 = c0216p.f(c0935k3) | c0216p.h(c0142j0);
            Object I6 = c0216p.I();
            if (f6 || I6 == obj) {
                I6 = new C0130f0(c0935k3, c0142j0, null);
                c0216p.c0(I6);
            }
            C0192d.e(c0216p, c0935k3, (Function2) I6);
            int i9 = i5 & 14;
            int i10 = i5 << 3;
            AbstractC0161p1.b(function0, a5, false, p5, j4, j5, f4, ((M0.e) c0142j0.f1859e.f7700c.f7813e.getValue()).f3545d, null, c0935k3, O.f.b(1249316354, new C0145k0(0, j5, aVar), c0216p), c0216p, i9 | (57344 & i10) | (i10 & 458752), 260);
            p6 = p5;
            c0935k4 = c0935k2;
            oVar4 = oVar3;
            c0133g03 = c0133g02;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0148l0(function0, oVar4, p6, j4, j5, c0133g03, c0935k4, aVar, i2);
        }
    }
}
