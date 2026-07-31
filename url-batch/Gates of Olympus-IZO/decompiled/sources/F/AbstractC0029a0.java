package F;

import I.C0105l;
import I.C0113p;
import I.C0119s0;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import b0.AbstractC0259J;
import b0.C0281n;
import b0.C0282o;
import b0.C0288u;
import h0.AbstractC0421b;
import h0.C0425f;
import r.AbstractC0818o;
import r0.C0836i;

/* renamed from: F.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0029a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final U.l f1183a = androidx.compose.foundation.layout.a.q(U.i.f3302a, H.g.f1692a);

    public static final void a(C0425f c0425f, String str, U.l lVar, long j3, C0113p c0113p, int i3, int i4) {
        int i5;
        long j4;
        long j5;
        U.l lVar2;
        U.l lVar3;
        long j6;
        int i6;
        c0113p.S(-126890956);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.f(c0425f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.f(str) ? 32 : 16;
        }
        int i7 = i5 | 384;
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                j4 = j3;
                if (c0113p.e(j4)) {
                    i6 = 2048;
                    i7 |= i6;
                }
            } else {
                j4 = j3;
            }
            i6 = 1024;
            i7 |= i6;
        } else {
            j4 = j3;
        }
        if ((i7 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
            j6 = j4;
            lVar3 = lVar;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                U.i iVar = U.i.f3302a;
                if ((i4 & 8) != 0) {
                    j4 = ((C0288u) c0113p.k(P.f1079a)).f4298a;
                    i7 &= -7169;
                }
                j5 = j4;
                lVar2 = iVar;
            } else {
                c0113p.L();
                if ((i4 & 8) != 0) {
                    i7 &= -7169;
                }
                lVar2 = lVar;
                j5 = j4;
            }
            c0113p.q();
            b(AbstractC0421b.c(c0425f, c0113p), str, lVar2, j5, c0113p, (i7 & 112) | 8 | (i7 & 896) | (i7 & 7168));
            lVar3 = lVar2;
            j6 = j5;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new X(c0425f, str, lVar3, j6, i3, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
    
        if (java.lang.Float.isInfinite(a0.f.b(r9)) != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(h0.I i3, String str, U.l lVar, long j3, C0113p c0113p, int i4) {
        int i5;
        C0281n c0281n;
        c0113p.S(-2142239481);
        if ((i4 & 6) == 0) {
            i5 = (c0113p.h(i3) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0113p.f(str) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0113p.f(lVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= c0113p.e(j3) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && c0113p.x()) {
            c0113p.L();
        } else {
            c0113p.N();
            if ((i4 & 1) != 0 && !c0113p.w()) {
                c0113p.L();
            }
            c0113p.q();
            boolean z3 = (((i5 & 7168) ^ 3072) > 2048 && c0113p.e(j3)) || (i5 & 3072) == 2048;
            Object G3 = c0113p.G();
            I.X x3 = C0105l.f2272a;
            if (z3 || G3 == x3) {
                if (C0288u.c(j3, C0288u.f4296f)) {
                    c0281n = null;
                } else {
                    c0281n = new C0281n(j3, 5, Build.VERSION.SDK_INT >= 29 ? C0282o.f4285a.a(j3, 5) : new PorterDuffColorFilter(AbstractC0259J.E(j3), AbstractC0259J.G(5)));
                }
                G3 = c0281n;
                c0113p.a0(G3);
            }
            C0281n c0281n2 = (C0281n) G3;
            c0113p.Q(-2144891392);
            U.l lVar2 = U.i.f3302a;
            boolean z4 = (i5 & 112) == 32;
            Object G4 = c0113p.G();
            if (z4 || G4 == x3) {
                G4 = new Z(str, 0);
                c0113p.a0(G4);
            }
            U.l a3 = z0.k.a(lVar2, (Y1.c) G4);
            c0113p.p(false);
            if (!a0.f.a(i3.d(), 9205357640488583168L)) {
                long d3 = i3.d();
                if (Float.isInfinite(a0.f.d(d3))) {
                }
                AbstractC0818o.a(androidx.compose.ui.draw.a.b(lVar.e(lVar2), i3, null, C0836i.f7147b, 0.0f, c0281n2, 22).e(a3), c0113p, 0);
            }
            lVar2 = f1183a;
            AbstractC0818o.a(androidx.compose.ui.draw.a.b(lVar.e(lVar2), i3, null, C0836i.f7147b, 0.0f, c0281n2, 22).e(a3), c0113p, 0);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new Y(i3, str, lVar, j3, i4);
        }
    }
}
