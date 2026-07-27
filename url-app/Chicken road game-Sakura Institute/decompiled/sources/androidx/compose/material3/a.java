package androidx.compose.material3;

import A.AbstractC0017m;
import D.AbstractC0146k1;
import D.AbstractC0168s0;
import D.C0164q1;
import D.C0166r1;
import D.X0;
import F.t;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import G.Y0;
import S.l;
import S.o;
import Z.C0323u;
import Z.P;
import Z.S;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.selection.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.InterfaceC0797x;
import l.V;
import l.u0;
import p.C0935k;
import p0.InterfaceC0945F;
import q.AbstractC1035n;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import y0.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f5150a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5151b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5152c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5153d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5154e;

    /* renamed from: f, reason: collision with root package name */
    public static final V f5155f;

    /* renamed from: g, reason: collision with root package name */
    public static final u0 f5156g;

    static {
        float f4 = t.f2507b;
        f5150a = f4;
        f5151b = t.f2512g;
        f5152c = t.f2511f;
        float f5 = t.f2509d;
        f5153d = f5;
        f5154e = (f5 - f4) / 2;
        f5155f = new V();
        f5156g = new u0(100, (InterfaceC0797x) null, 6);
    }

    public static final void a(boolean z4, Function1 function1, o oVar, Function2 function2, boolean z5, C0164q1 c0164q1, C0935k c0935k, C0216p c0216p, int i2) {
        int i4;
        boolean z6;
        Function2 function22;
        C0935k c0935k2;
        o oVar2;
        C0935k c0935k3;
        o oVar3;
        Function2 function23;
        boolean z7;
        C0935k c0935k4;
        c0216p.U(1580463220);
        if ((i2 & 6) == 0) {
            i4 = i2 | (c0216p.g(z4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function1) ? 32 : 16;
        }
        int i5 = i4 | 28032;
        if ((i2 & 196608) == 0) {
            i5 |= c0216p.f(c0164q1) ? 131072 : 65536;
        }
        int i6 = i5 | 1572864;
        if ((599187 & i6) == 599186 && c0216p.z()) {
            c0216p.N();
            oVar3 = oVar;
            function23 = function2;
            z7 = z5;
            c0935k4 = c0935k;
        } else {
            c0216p.P();
            int i7 = i2 & 1;
            o oVar4 = l.f3977a;
            if (i7 == 0 || c0216p.y()) {
                z6 = true;
                function22 = null;
                c0935k2 = null;
                oVar2 = oVar4;
            } else {
                c0216p.N();
                oVar2 = oVar;
                function22 = function2;
                z6 = z5;
                c0935k2 = c0935k;
            }
            c0216p.r();
            c0216p.S(783532531);
            if (c0935k2 == null) {
                Object I3 = c0216p.I();
                if (I3 == C0208l.f2826a) {
                    I3 = new C0935k();
                    c0216p.c0(I3);
                }
                c0935k3 = (C0935k) I3;
            } else {
                c0935k3 = c0935k2;
            }
            c0216p.q(false);
            if (function1 != null) {
                Y0 y02 = AbstractC0168s0.f2009a;
                oVar4 = b.b(MinimumInteractiveModifier.f5147a, z4, c0935k3, z6, new f(2), function1);
            }
            o e4 = c.e(c.l(oVar2.h(oVar4), S.b.f3956k), f5152c, f5153d);
            float f4 = t.f2506a;
            int i8 = i6 << 3;
            int i9 = i6 >> 6;
            oVar3 = oVar2;
            b(e4, z4, z6, c0164q1, function22, c0935k3, AbstractC0146k1.a(5, c0216p), c0216p, (i8 & 57344) | (i8 & 112) | (i9 & 896) | (i9 & 7168));
            function23 = function22;
            z7 = z6;
            c0935k4 = c0935k2;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0166r1(z4, function1, oVar3, function23, z7, c0164q1, c0935k4, i2);
        }
    }

    public static final void b(o oVar, boolean z4, boolean z5, C0164q1 c0164q1, Function2 function2, C0935k c0935k, P p4, C0216p c0216p, int i2) {
        int i4;
        long j4;
        long j5;
        c0216p.U(-1594099146);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.g(z4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.g(z5) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.f(c0164q1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.h(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.f(c0935k) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= c0216p.f(p4) ? 1048576 : 524288;
        }
        int i5 = i4;
        if ((i5 & 599187) == 599186 && c0216p.z()) {
            c0216p.N();
        } else {
            long j6 = z5 ? z4 ? c0164q1.f1975b : c0164q1.f1979f : z4 ? c0164q1.f1983j : c0164q1.f1987n;
            long j7 = z5 ? z4 ? c0164q1.f1974a : c0164q1.f1978e : z4 ? c0164q1.f1982i : c0164q1.f1986m;
            float f4 = t.f2506a;
            P a4 = AbstractC0146k1.a(5, c0216p);
            float f5 = t.f2510e;
            if (z5) {
                j4 = j6;
                j5 = z4 ? c0164q1.f1976c : c0164q1.f1980g;
            } else {
                j4 = j6;
                j5 = z4 ? c0164q1.f1984k : c0164q1.f1988o;
            }
            o b4 = androidx.compose.foundation.a.b(oVar.h(new BorderModifierNodeElement(f5, new S(j5), a4)), j4, a4);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, e4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            o b5 = androidx.compose.foundation.a.b(d.a(androidx.compose.foundation.layout.a.f5080a.a(S.b.f3955j).h(new ThumbElement(c0935k, z4)), c0935k, X0.a(false, t.f2508c / 2, 0L, c0216p, 54, 4)), j7, p4);
            InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3956k, false);
            int i7 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            o d5 = S.a.d(c0216p, b5);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e5, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i7))) {
                AbstractC0017m.r(i7, c0216p, i7, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            c0216p.S(1163457794);
            if (function2 != null) {
                C0192d.a(D.S.f1616a.a(new C0323u(z5 ? z4 ? c0164q1.f1977d : c0164q1.f1981h : z4 ? c0164q1.f1985l : c0164q1.f1989p)), function2, c0216p, ((i5 >> 9) & 112) | 8);
            }
            c0216p.q(false);
            c0216p.q(true);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0166r1(oVar, z4, z5, c0164q1, function2, c0935k, p4, i2);
        }
    }
}
