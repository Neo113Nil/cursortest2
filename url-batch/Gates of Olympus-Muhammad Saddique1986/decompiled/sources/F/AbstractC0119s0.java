package F;

import I.C0159l;
import I.C0167p;
import I.C0173s0;
import a0.C0241f;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import b0.C0344m;
import b0.C0345n;
import b0.C0352v;
import e2.InterfaceC0424c;
import h0.AbstractC0459b;
import h0.C0456I;
import h0.C0463f;
import r.AbstractC0868o;
import r0.C0912i;

/* renamed from: F.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0119s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final U.q f1774a = androidx.compose.foundation.layout.c.h(U.n.f4488a, H.j.f2412a);

    public static final void a(C0463f c0463f, String str, U.q qVar, long j3, C0167p c0167p, int i3, int i4) {
        int i5;
        long j4;
        long j5;
        U.q qVar2;
        U.q qVar3;
        long j6;
        int i6;
        c0167p.S(-126890956);
        if ((i3 & 6) == 0) {
            i5 = (c0167p.f(c0463f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0167p.f(str) ? 32 : 16;
        }
        int i7 = i5 | 384;
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                j4 = j3;
                if (c0167p.e(j4)) {
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
        if ((i7 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
            j6 = j4;
            qVar3 = qVar;
        } else {
            c0167p.N();
            if ((i3 & 1) == 0 || c0167p.w()) {
                U.n nVar = U.n.f4488a;
                if ((i4 & 8) != 0) {
                    j4 = ((C0352v) c0167p.k(V.f1382a)).f5441a;
                    i7 &= -7169;
                }
                j5 = j4;
                qVar2 = nVar;
            } else {
                c0167p.L();
                if ((i4 & 8) != 0) {
                    i7 &= -7169;
                }
                qVar2 = qVar;
                j5 = j4;
            }
            c0167p.q();
            b(AbstractC0459b.c(c0463f, c0167p), str, qVar2, j5, c0167p, (i7 & 112) | 8 | (i7 & 896) | (i7 & 7168));
            qVar3 = qVar2;
            j6 = j5;
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0116q0(c0463f, str, qVar3, j6, i3, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        if (java.lang.Float.isInfinite(a0.C0241f.b(r9)) != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0456I c0456i, String str, U.q qVar, long j3, C0167p c0167p, int i3) {
        int i4;
        C0344m c0344m;
        U.q qVar2;
        c0167p.S(-2142239481);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(c0456i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0167p.f(qVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c0167p.e(j3) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.N();
            if ((i3 & 1) != 0 && !c0167p.w()) {
                c0167p.L();
            }
            c0167p.q();
            boolean z3 = (((i4 & 7168) ^ 3072) > 2048 && c0167p.e(j3)) || (i4 & 3072) == 2048;
            Object G3 = c0167p.G();
            I.W w2 = C0159l.f2829a;
            if (z3 || G3 == w2) {
                if (C0352v.c(j3, C0352v.f5439g)) {
                    c0344m = null;
                } else {
                    c0344m = new C0344m(j3, 5, Build.VERSION.SDK_INT >= 29 ? C0345n.f5427a.a(j3, 5) : new PorterDuffColorFilter(b0.M.D(j3), b0.M.G(5)));
                }
                G3 = c0344m;
                c0167p.a0(G3);
            }
            C0344m c0344m2 = (C0344m) G3;
            c0167p.Q(-2144891392);
            U.q qVar3 = U.n.f4488a;
            if (str != null) {
                boolean z4 = (i4 & 112) == 32;
                Object G4 = c0167p.G();
                if (z4 || G4 == w2) {
                    G4 = new A0.m(str, 2);
                    c0167p.a0(G4);
                }
                qVar2 = A0.k.a(qVar3, (InterfaceC0424c) G4);
            } else {
                qVar2 = qVar3;
            }
            c0167p.p(false);
            if (!C0241f.a(c0456i.d(), 9205357640488583168L)) {
                long d3 = c0456i.d();
                if (Float.isInfinite(C0241f.d(d3))) {
                }
                AbstractC0868o.a(androidx.compose.ui.draw.a.d(0.0f, 22, null, qVar.i(qVar3), c0344m2, c0456i, C0912i.f8159b).i(qVar2), c0167p, 0);
            }
            qVar3 = f1774a;
            AbstractC0868o.a(androidx.compose.ui.draw.a.d(0.0f, 22, null, qVar.i(qVar3), c0344m2, c0456i, C0912i.f8159b).i(qVar2), c0167p, 0);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new C0117r0(c0456i, str, qVar, j3, i3);
        }
    }
}
