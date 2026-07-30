package d0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0.o f2326a = androidx.compose.foundation.layout.c.h(s0.l.f8103a, f0.j.f2954a);

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
    
        if (java.lang.Float.isInfinite(y0.f.b(r9)) != false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(e1.b bVar, String str, s0.o oVar, long j8, g0.p pVar, int i7) {
        e1.b bVar2;
        int i8;
        z0.m mVar;
        s0.o oVar2;
        pVar.S(-2142239481);
        if ((i7 & 6) == 0) {
            bVar2 = bVar;
            i8 = (pVar.h(bVar2) ? 4 : 2) | i7;
        } else {
            bVar2 = bVar;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.f(oVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= pVar.e(j8) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            pVar.N();
            if ((i7 & 1) != 0 && !pVar.w()) {
                pVar.L();
            }
            pVar.q();
            boolean z8 = (((i8 & 7168) ^ 3072) > 2048 && pVar.e(j8)) || (i8 & 3072) == 2048;
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (z8 || G == t0Var) {
                if (z0.u.c(j8, z0.u.f10057g)) {
                    mVar = null;
                } else {
                    mVar = new z0.m(j8, 5, Build.VERSION.SDK_INT >= 29 ? z0.n.f10013a.a(j8, 5) : new PorterDuffColorFilter(z0.l0.w(j8), z0.l0.z(5)));
                }
                G = mVar;
                pVar.a0(G);
            }
            z0.m mVar2 = (z0.m) G;
            pVar.Q(-2144891392);
            s0.o oVar3 = s0.l.f8103a;
            if (str != null) {
                boolean z9 = (i8 & 112) == 32;
                Object G2 = pVar.G();
                if (z9 || G2 == t0Var) {
                    G2 = new k(str, 1);
                    pVar.a0(G2);
                }
                oVar2 = y1.k.a(oVar3, false, (q6.c) G2);
            } else {
                oVar2 = oVar3;
            }
            pVar.p(false);
            s0.o oVar4 = oVar2;
            if (!y0.f.a(bVar2.d(), 9205357640488583168L)) {
                long d8 = bVar2.d();
                if (Float.isInfinite(y0.f.d(d8))) {
                }
                q.n.a(androidx.compose.ui.draw.a.d(oVar.j(oVar3), bVar2, p1.i.f7046b, 0.0f, mVar2, 22).j(oVar4), pVar, 0);
            }
            oVar3 = f2326a;
            q.n.a(androidx.compose.ui.draw.a.d(oVar.j(oVar3), bVar2, p1.i.f7046b, 0.0f, mVar2, 22).j(oVar4), pVar, 0);
        }
        g0.p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new p1(bVar, str, oVar, j8, i7);
        }
    }

    public static final void b(f1.f fVar, String str, s0.o oVar, long j8, g0.p pVar, int i7) {
        int i8;
        g0.p pVar2;
        String str2;
        s0.o oVar2;
        long j9;
        pVar.S(-126890956);
        int i9 = (pVar.f(fVar) ? 4 : 2) | i7 | (pVar.f(str) ? 32 : 16) | 1408;
        if ((i9 & 1171) == 1170 && pVar.x()) {
            pVar.L();
            pVar2 = pVar;
            j9 = j8;
            oVar2 = oVar;
            str2 = str;
        } else {
            pVar.N();
            if ((i7 & 1) == 0 || pVar.w()) {
                j8 = ((z0.u) pVar.k(y0.f2529a)).f10059a;
                i8 = i9 & (-7169);
                oVar = s0.l.f8103a;
            } else {
                pVar.L();
                i8 = i9 & (-7169);
            }
            s0.o oVar3 = oVar;
            long j10 = j8;
            pVar.q();
            pVar2 = pVar;
            a(f1.b.c(fVar, pVar), str, oVar3, j10, pVar2, (i8 & 112) | 392);
            str2 = str;
            oVar2 = oVar3;
            j9 = j10;
        }
        g0.p1 r8 = pVar2.r();
        if (r8 != null) {
            r8.f3853d = new o1(fVar, str2, oVar2, j9, i7);
        }
    }
}
