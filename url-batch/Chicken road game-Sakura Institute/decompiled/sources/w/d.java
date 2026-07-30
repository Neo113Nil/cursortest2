package w;

import d0.j1;
import g0.p1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9206a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9207b;

    static {
        float f9 = 25;
        f9206a = f9;
        f9207b = (f9 * 2.0f) / 2.4142137f;
    }

    public static final void a(a0.o oVar, s0.o oVar2, long j8, g0.p pVar, int i7) {
        int i8;
        pVar.S(1776202187);
        int i9 = (pVar.f(oVar) ? 4 : 2) | i7 | (pVar.f(oVar2) ? 32 : 16) | 128;
        if ((i9 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                i8 = i9 & (-897);
                j8 = 9205357640488583168L;
            } else {
                pVar.L();
                i8 = i9 & (-897);
            }
            pVar.q();
            int i10 = i8 & 14;
            boolean z8 = i10 == 4;
            Object G = pVar.G();
            if (z8 || G == g0.l.f3784a) {
                G = new s1.l0(7, oVar);
                pVar.a0(G);
            }
            a.a.c(oVar, s0.b.f8079g, o0.f.b(-1653527038, new j1(1, j8, y1.k.a(oVar2, false, (q6.c) G)), pVar), pVar, i10 | 432);
        }
        long j9 = j8;
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new d0.c0(oVar, oVar2, j9, i7);
        }
    }

    public static final void b(s0.o oVar, g0.p pVar, int i7, int i8) {
        int i9;
        pVar.S(694251107);
        int i10 = i8 & 1;
        if (i10 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = (pVar.f(oVar) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i9 & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            if (i10 != 0) {
                oVar = s0.l.f8103a;
            }
            q.c.a(pVar, s0.a.a(androidx.compose.foundation.layout.c.i(oVar, f9207b, f9206a), c.f9201g));
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a(oVar, i7, i8);
        }
    }
}
