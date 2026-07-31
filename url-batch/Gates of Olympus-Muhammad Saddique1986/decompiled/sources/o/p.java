package o;

import B.C0000a;
import B.C0022x;
import C0.K;
import F.C0105l;
import F.C0114p0;
import F.C0131y0;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0164n0;
import R0.E;
import U.q;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.C0352v;
import b0.M;
import e2.InterfaceC0422a;
import e2.InterfaceC0427f;
import l.r;
import n.t0;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.AbstractC0871s;
import r.C0855b;
import r.C0861h;
import r.C0873u;
import r.C0874v;
import r.P;
import r.Q;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import x.N;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final E f7422a = new E(14, true);

    /* renamed from: b, reason: collision with root package name */
    public static final C0740b f7423b;

    static {
        long j3 = C0352v.f5435c;
        long j4 = C0352v.f5434b;
        f7423b = new C0740b(j3, j4, j4, C0352v.b(j4, 0.38f), C0352v.b(j4, 0.38f));
    }

    public static final void a(C0740b c0740b, q qVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-921259293);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(c0740b) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(qVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0167p.x()) {
            c0167p.L();
        } else {
            float f3 = j.f7406d;
            w.d a3 = w.e.a(j.f7407e);
            float f4 = 0;
            boolean z3 = Float.compare(f3, f4) > 0;
            long j3 = b0.E.f5348a;
            q w2 = t0.w(androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.b.j(androidx.compose.foundation.a.a((Float.compare(f3, f4) > 0 || z3) ? qVar.i(new ShadowGraphicsLayerElement(a3, z3, j3, j3)) : qVar, c0740b.f7380a, M.f5355a)), 0.0f, j.f7411i, 1), t0.t(c0167p));
            int i5 = (i4 << 3) & 7168;
            C0873u a4 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p, 0);
            int i6 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, w2);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, a4);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            aVar.g(C0874v.f8090a, c0167p, Integer.valueOf(((i5 >> 6) & 112) | 6));
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0000a(c0740b, qVar, aVar, i3, 4);
        }
    }

    public static final void b(String str, boolean z3, C0740b c0740b, q qVar, InterfaceC0427f interfaceC0427f, InterfaceC0422a interfaceC0422a, C0167p c0167p, int i3) {
        int i4;
        boolean z4;
        c0167p.S(791018367);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.g(z3) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(c0740b) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(qVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.h(interfaceC0427f) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0167p.x()) {
            c0167p.L();
        } else {
            U.h hVar = j.f7408f;
            C0855b c0855b = AbstractC0864k.f8051a;
            float f3 = j.f7410h;
            C0861h c0861h = new C0861h(f3);
            boolean z5 = ((i4 & 112) == 32) | ((458752 & i4) == 131072);
            Object G3 = c0167p.G();
            if (z5 || G3 == C0159l.f2829a) {
                G3 = new o(interfaceC0422a, z3);
                c0167p.a0(G3);
            }
            q c2 = androidx.compose.foundation.layout.c.c(androidx.compose.foundation.a.d(qVar, z3, str, (InterfaceC0422a) G3, 4), 1.0f);
            float f4 = j.f7403a;
            float f5 = j.f7404b;
            float f6 = j.f7405c;
            q h3 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.j(c2, f4, f6, f5, f6), f3, 0.0f, 2);
            Q a3 = P.a(c0861h, hVar, c0167p, 54);
            int i5 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, h3);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0995h c0995h = C0996i.f8757e;
            C0143d.R(c0167p, c0995h, a3);
            C0995h c0995h2 = C0996i.f8756d;
            C0143d.R(c0167p, c0995h2, m3);
            C0995h c0995h3 = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h3);
            }
            C0995h c0995h4 = C0996i.f8755c;
            C0143d.R(c0167p, c0995h4, d3);
            if (interfaceC0427f == null) {
                c0167p.Q(554568909);
                z4 = false;
            } else {
                c0167p.Q(554568910);
                U.n nVar = U.n.f4488a;
                float f7 = j.f7412j;
                q g3 = androidx.compose.foundation.layout.c.g(nVar, f7, 0.0f, f7, f7, 2);
                InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
                int i6 = c0167p.f2864P;
                InterfaceC0164n0 m4 = c0167p.m();
                q d4 = U.a.d(c0167p, g3);
                c0167p.U();
                if (c0167p.f2863O) {
                    c0167p.l(c1001n);
                } else {
                    c0167p.d0();
                }
                C0143d.R(c0167p, c0995h, e3);
                C0143d.R(c0167p, c0995h2, m4);
                if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i6))) {
                    A.k.o(i6, c0167p, i6, c0995h3);
                }
                C0143d.R(c0167p, c0995h4, d4);
                z4 = false;
                interfaceC0427f.g(new C0352v(z3 ? c0740b.f7382c : c0740b.f7384e), c0167p, 0);
                c0167p.p(true);
            }
            c0167p.p(z4);
            K k3 = new K(z3 ? c0740b.f7381b : c0740b.f7383d, j.f7413k, j.f7414l, j.f7416n, j.f7409g, j.f7415m, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            N.a(str, new LayoutWeightElement(O2.d.v(1.0f, Float.MAX_VALUE), true), k3, null, 0, false, 1, 0, null, c0167p, (i4 & 14) | 1572864, 440);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0114p0(str, z3, c0740b, qVar, interfaceC0427f, interfaceC0422a, i3);
        }
    }

    public static final void c(g gVar, InterfaceC0422a interfaceC0422a, q qVar, C0022x c0022x, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(712057293);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(gVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.h(c0022x) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            Context context = (Context) c0167p.k(AndroidCompositionLocals_androidKt.f4938b);
            boolean f3 = c0167p.f((Configuration) c0167p.k(AndroidCompositionLocals_androidKt.f4937a)) | c0167p.f(context);
            Object G3 = c0167p.G();
            if (f3 || G3 == C0159l.f2829a) {
                C0740b c0740b = f7423b;
                long j3 = c0740b.f7380a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int D = M.D(j3);
                int color = obtainStyledAttributes.getColor(0, D);
                obtainStyledAttributes.recycle();
                if (color != D) {
                    j3 = M.c(color);
                }
                long j4 = j3;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j5 = c0740b.f7381b;
                int D3 = M.D(j5);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, D3)) : null;
                if (valueOf != null && valueOf.intValue() != D3) {
                    j5 = M.c(valueOf.intValue());
                }
                long j6 = j5;
                long j7 = c0740b.f7383d;
                int D4 = M.D(j7);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, D4)) : null;
                if (valueOf2 != null && valueOf2.intValue() != D4) {
                    j7 = M.c(valueOf2.intValue());
                }
                long j8 = j7;
                G3 = new C0740b(j4, j6, j6, j8, j8);
                c0167p.a0(G3);
            }
            d(gVar, interfaceC0422a, qVar, (C0740b) G3, c0022x, c0167p, (i4 & 1022) | ((i4 << 3) & 57344));
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0105l(gVar, interfaceC0422a, qVar, c0022x, i3);
        }
    }

    public static final void d(g gVar, InterfaceC0422a interfaceC0422a, q qVar, C0740b c0740b, C0022x c0022x, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(1447189339);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(gVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(interfaceC0422a) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.f(c0740b) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c0167p.h(c0022x) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && c0167p.x()) {
            c0167p.L();
        } else {
            R0.n.a(gVar, interfaceC0422a, f7422a, Q.f.b(795909757, new C0131y0(c0740b, qVar, c0022x), c0167p), c0167p, (i4 & 14) | 3456 | (i4 & 112), 0);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new r(gVar, interfaceC0422a, qVar, c0740b, c0022x, i3);
        }
    }
}
