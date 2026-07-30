package n;

import a0.m;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.b0;
import d0.k0;
import d0.n0;
import g0.k1;
import g0.p;
import g0.p1;
import p2.y;
import p2.z;
import q.m0;
import q.q;
import q.s;
import q.t;
import s0.l;
import s0.o;
import w.g0;
import z0.d0;
import z0.l0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final z f6494a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f6495b;

    static {
        f6494a = new z(1, (14 & 1) == 0, true);
        long j8 = u.f10053c;
        long j9 = u.f10052b;
        f6495b = new a(j8, j9, j9, u.b(j9, 0.38f), u.b(j9, 0.38f));
    }

    public static final void a(a aVar, o0.a aVar2, p pVar, int i7) {
        pVar.S(-921259293);
        int i8 = (pVar.f(aVar) ? 4 : 2) | i7;
        o oVar = l.f8103a;
        if (((i8 | (pVar.f(oVar) ? 32 : 16)) & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            float f9 = f.f6481d;
            v.d a3 = v.e.a(f.f6482e);
            float f10 = 0;
            boolean z8 = Float.compare(f9, f10) > 0;
            long j8 = d0.f9987a;
            if (Float.compare(f9, f10) > 0 || z8) {
                oVar = new ShadowGraphicsLayerElement(a3, z8, j8, j8);
            }
            o P = a.a.P(androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.a(oVar, aVar.f6467a, l0.f10006a)), 0.0f, f.f6486i, 1), a.a.F(pVar));
            s a9 = q.a(q.j.f7293c, s0.b.f8089q, pVar, 0);
            int i9 = pVar.P;
            k1 m8 = pVar.m();
            o c4 = s0.a.c(pVar, P);
            r1.j.f7810d.getClass();
            q6.a aVar3 = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(aVar3);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, a9, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i9))) {
                m.q(i9, pVar, i9, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            aVar2.c(t.f7341a, pVar, 54);
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new b0(i7, 7, aVar, aVar2);
        }
    }

    public static final void b(String str, boolean z8, a aVar, q6.a aVar2, p pVar, int i7) {
        int i8;
        pVar.S(791018367);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.g(z8) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(aVar) ? 256 : 128;
        }
        int i9 = i7 & 3072;
        l lVar = l.f8103a;
        if (i9 == 0) {
            i8 |= pVar.f(lVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= pVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= pVar.h(aVar2) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && pVar.x()) {
            pVar.L();
        } else {
            s0.f fVar = f.f6483f;
            q.b bVar = q.j.f7291a;
            float f9 = f.f6485h;
            q.g gVar = new q.g(f9);
            boolean z9 = ((i8 & 112) == 32) | ((458752 & i8) == 131072);
            Object G = pVar.G();
            if (z9 || G == g0.l.f3784a) {
                G = new k0(aVar2, z8);
                pVar.a0(G);
            }
            o b9 = androidx.compose.foundation.layout.c.b(androidx.compose.foundation.a.d(lVar, z8, str, (q6.a) G, 4), 1.0f);
            float f10 = f.f6478a;
            float f11 = f.f6479b;
            float f12 = f.f6480c;
            o g9 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.c.j(b9, f10, f12, f11, f12), f9, 0.0f, 2);
            m0 a3 = q.l0.a(gVar, fVar, pVar, 54);
            int i10 = pVar.P;
            k1 m8 = pVar.m();
            o c4 = s0.a.c(pVar, g9);
            r1.j.f7810d.getClass();
            q6.a aVar3 = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(aVar3);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, a3, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i10))) {
                m.q(i10, pVar, i10, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            pVar.Q(554568909);
            pVar.p(false);
            a2.k0 k0Var = new a2.k0(z8 ? aVar.f6468b : aVar.f6470d, f.f6487j, f.f6488k, f.f6490m, f.f6484g, f.f6489l, 16613240);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            g0.a(str, new LayoutWeightElement(1.0f, true), k0Var, 0, false, 1, 0, pVar, (i8 & 14) | 1572864, 440);
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new n0(str, z8, aVar, aVar2, i7);
        }
    }

    public static final void c(y yVar, q6.a aVar, a0.y yVar2, p pVar, int i7) {
        int i8;
        pVar.S(712057293);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(yVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(l.f8103a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.h(yVar2) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            Context context = (Context) pVar.k(AndroidCompositionLocals_androidKt.f739b);
            boolean f9 = pVar.f((Configuration) pVar.k(AndroidCompositionLocals_androidKt.f738a)) | pVar.f(context);
            Object G = pVar.G();
            if (f9 || G == g0.l.f3784a) {
                a aVar2 = f6495b;
                long j8 = aVar2.f6467a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int w4 = l0.w(j8);
                int color = obtainStyledAttributes.getColor(0, w4);
                obtainStyledAttributes.recycle();
                if (color != w4) {
                    j8 = l0.c(color);
                }
                long j9 = j8;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j10 = aVar2.f6468b;
                int w5 = l0.w(j10);
                Integer valueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, w5)) : null;
                if (valueOf != null && valueOf.intValue() != w5) {
                    j10 = l0.c(valueOf.intValue());
                }
                long j11 = j10;
                long j12 = aVar2.f6470d;
                int w8 = l0.w(j12);
                Integer valueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, w8)) : null;
                if (valueOf2 != null && valueOf2.intValue() != w8) {
                    j12 = l0.c(valueOf2.intValue());
                }
                long j13 = j12;
                Object aVar3 = new a(j9, j11, j11, j13, j13);
                pVar.a0(aVar3);
                G = aVar3;
            }
            d(yVar, aVar, (a) G, yVar2, pVar, (i8 & 1022) | ((i8 << 3) & 57344));
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.a(yVar, aVar, yVar2, i7);
        }
    }

    public static final void d(y yVar, q6.a aVar, a aVar2, a0.y yVar2, p pVar, int i7) {
        int i8;
        q6.a aVar3;
        p pVar2;
        y yVar3;
        pVar.S(1447189339);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(yVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(l.f8103a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.f(aVar2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= pVar.h(yVar2) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && pVar.x()) {
            pVar.L();
            aVar3 = aVar;
            pVar2 = pVar;
            yVar3 = yVar;
        } else {
            aVar3 = aVar;
            pVar2 = pVar;
            p2.l.a(yVar, aVar3, f6494a, o0.f.b(795909757, new b0(aVar2, yVar2), pVar), pVar2, (i8 & 14) | 3456 | (i8 & 112), 0);
            yVar3 = yVar;
        }
        p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new d0.l(yVar3, aVar3, aVar2, yVar2, i7);
        }
    }
}
