package n;

import A.AbstractC0017m;
import A.C0005a;
import A.C0028y;
import A0.L;
import D.C0147l;
import D.C0157o0;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0213n0;
import P0.F;
import Z.B;
import Z.C0323u;
import Z.K;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p0.InterfaceC0945F;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1023b;
import q.C1028g;
import q.C1041t;
import q.C1042u;
import q.e0;
import q.f0;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;
import v.AbstractC1234e;
import v.C1233d;
import w.M;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final F f8550a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f8551b;

    static {
        f8550a = new F((14 & 1) == 0, true, true, 1, true, true);
        long j4 = C0323u.f4543c;
        long j5 = C0323u.f4542b;
        f8551b = new c(j4, j5, j5, C0323u.b(0.38f, j5), C0323u.b(0.38f, j5));
    }

    public static final void a(c cVar, S.o oVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-921259293);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(cVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(oVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            float f4 = k.f8527d;
            C1233d a4 = AbstractC1234e.a(k.f8528e);
            float f5 = 0;
            boolean z4 = Float.compare(f4, f5) > 0;
            long j4 = B.f4449a;
            S.o T3 = j0.c.T(androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.b.l(androidx.compose.foundation.a.b((Float.compare(f4, f5) > 0 || z4) ? oVar.h(new ShadowGraphicsLayerElement(a4, z4, j4, j4)) : oVar, cVar.f8501a, K.f4461a)), 0.0f, k.f8532i, 1), j0.c.J(c0216p));
            int i5 = (i4 << 3) & 7168;
            C1041t a5 = AbstractC1039r.a(AbstractC1031j.f9267c, S.b.f3963r, c0216p, 0);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, T3);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a5, C1069j.f9820f);
            C0192d.R(c0216p, m4, C1069j.f9819e);
            C1067h c1067h = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                AbstractC0017m.r(i6, c0216p, i6, c1067h);
            }
            C0192d.R(c0216p, d4, C1069j.f9818d);
            aVar.g(C1042u.f9344a, c0216p, Integer.valueOf(((i5 >> 6) & 112) | 6));
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(cVar, oVar, aVar, i2, 4);
        }
    }

    public static final void b(String str, boolean z4, c cVar, S.o oVar, L2.c cVar2, Function0 function0, C0216p c0216p, int i2) {
        int i4;
        boolean z5;
        c0216p.U(791018367);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.g(z4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(cVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.f(oVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.h(cVar2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.h(function0) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0216p.z()) {
            c0216p.N();
        } else {
            S.f fVar = k.f8529f;
            C1023b c1023b = AbstractC1031j.f9265a;
            float f4 = k.f8531h;
            C1028g c1028g = new C1028g(f4);
            boolean z6 = ((i4 & 112) == 32) | ((458752 & i4) == 131072);
            Object I3 = c0216p.I();
            if (z6 || I3 == C0208l.f2826a) {
                I3 = new p(function0, z4);
                c0216p.c0(I3);
            }
            S.o h4 = androidx.compose.foundation.a.e(oVar, z4, str, (Function0) I3, 4).h(androidx.compose.foundation.layout.c.f5081a);
            float f5 = k.f8524a;
            float f6 = k.f8525b;
            float f7 = k.f8526c;
            S.o j4 = androidx.compose.foundation.layout.b.j(androidx.compose.foundation.layout.c.i(h4, f5, f7, f6, f7), f4, 0.0f, 2);
            f0 b4 = e0.b(c1028g, fVar, c0216p, 54);
            int i5 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, j4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, b4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                AbstractC0017m.r(i5, c0216p, i5, c1067h3);
            }
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            if (cVar2 == null) {
                c0216p.S(554568909);
                z5 = false;
            } else {
                c0216p.S(554568910);
                S.l lVar = S.l.f3977a;
                float f8 = k.f8533j;
                S.o f9 = androidx.compose.foundation.layout.c.f(lVar, f8, 0.0f, f8, f8, 2);
                InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
                int i6 = c0216p.f2861P;
                InterfaceC0213n0 m5 = c0216p.m();
                S.o d5 = S.a.d(c0216p, f9);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, e4, c1067h);
                C0192d.R(c0216p, m5, c1067h2);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i6))) {
                    AbstractC0017m.r(i6, c0216p, i6, c1067h3);
                }
                C0192d.R(c0216p, d5, c1067h4);
                z5 = false;
                cVar2.g(new C0323u(z4 ? cVar.f8503c : cVar.f8505e), c0216p, 0);
                c0216p.q(true);
            }
            c0216p.q(z5);
            L l4 = new L(z4 ? cVar.f8502b : cVar.f8504d, k.f8534k, k.f8535l, null, k.f8537n, k.f8530g, k.f8536m, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            M.a(str, new LayoutWeightElement(kotlin.ranges.b.b(1.0f, Float.MAX_VALUE), true), l4, null, 0, false, 1, 0, null, c0216p, (i4 & 14) | 1572864, 440);
            c0216p.q(true);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0157o0(str, z4, cVar, oVar, cVar2, function0, i2);
        }
    }

    public static final void c(h hVar, Function0 function0, S.o oVar, C0028y c0028y, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(712057293);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(hVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.h(c0028y) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            Context context = (Context) c0216p.k(AndroidCompositionLocals_androidKt.f5213b);
            boolean f4 = c0216p.f((Configuration) c0216p.k(AndroidCompositionLocals_androidKt.f5212a)) | c0216p.f(context);
            Object I3 = c0216p.I();
            if (f4 || I3 == C0208l.f2826a) {
                c cVar = f8551b;
                long j4 = cVar.f8501a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int D3 = K.D(j4);
                int color = obtainStyledAttributes.getColor(0, D3);
                obtainStyledAttributes.recycle();
                if (color != D3) {
                    j4 = K.c(color);
                }
                long j5 = j4;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j6 = cVar.f8502b;
                int D4 = K.D(j6);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, D4)) : null;
                if (valueOf != null && valueOf.intValue() != D4) {
                    j6 = K.c(valueOf.intValue());
                }
                long j7 = j6;
                long j8 = cVar.f8504d;
                int D5 = K.D(j8);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, D5)) : null;
                if (valueOf2 != null && valueOf2.intValue() != D5) {
                    j8 = K.c(valueOf2.intValue());
                }
                long j9 = j8;
                I3 = new c(j5, j7, j7, j9, j9);
                c0216p.c0(I3);
            }
            d(hVar, function0, oVar, (c) I3, c0028y, c0216p, (i4 & 1022) | ((i4 << 3) & 57344));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0147l(hVar, function0, oVar, c0028y, i2);
        }
    }

    public static final void d(h hVar, Function0 function0, S.o oVar, c cVar, C0028y c0028y, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(1447189339);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(hVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.f(cVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c0216p.h(c0028y) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && c0216p.z()) {
            c0216p.N();
        } else {
            P0.o.a(hVar, function0, f8550a, O.f.b(795909757, new E.k(cVar, oVar, c0028y, 1), c0216p), c0216p, (i4 & 14) | 3456 | (i4 & 112), 0);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new q(hVar, function0, oVar, cVar, c0028y, i2);
        }
    }
}
