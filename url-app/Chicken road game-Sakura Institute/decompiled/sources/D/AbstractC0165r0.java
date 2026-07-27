package D;

import G.C0208l;
import G.C0216p;
import G.C0222s0;
import Z.C0316m;
import Z.C0317n;
import Z.C0323u;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import f0.AbstractC0581b;
import f0.C0578I;
import f0.C0585f;
import p0.C0973i;
import q.AbstractC1035n;

/* renamed from: D.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0165r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final S.o f1993a = androidx.compose.foundation.layout.c.g(S.l.f3977a, F.m.f2442a);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C0585f c0585f, S.o oVar, long j4, C0216p c0216p, int i2, int i4) {
        int i5;
        S.o oVar2;
        long j5;
        S.o oVar3;
        long j6;
        S.o oVar4;
        long j7;
        int i6;
        c0216p.U(-126890956);
        if ((i2 & 6) == 0) {
            i5 = (c0216p.f(c0585f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= c0216p.f(null) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            oVar2 = oVar;
            i5 |= c0216p.f(oVar) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    j5 = j4;
                    if (c0216p.e(j4)) {
                        i6 = 2048;
                        i5 |= i6;
                    }
                } else {
                    j5 = j4;
                }
                i6 = 1024;
                i5 |= i6;
            } else {
                j5 = j4;
            }
            if ((i5 & 1171) == 1170 || !c0216p.z()) {
                c0216p.P();
                if ((i2 & 1) != 0 || c0216p.y()) {
                    S.o oVar5 = i7 == 0 ? S.l.f3977a : oVar2;
                    if ((i4 & 8) == 0) {
                        i5 &= -7169;
                        oVar3 = oVar5;
                        j6 = ((C0323u) c0216p.k(S.f1616a)).f4549a;
                        c0216p.r();
                        b(AbstractC0581b.c(c0585f, c0216p), oVar3, j6, c0216p, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168));
                        oVar4 = oVar3;
                        j7 = j6;
                    } else {
                        oVar3 = oVar5;
                    }
                } else {
                    c0216p.N();
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                    }
                    oVar3 = oVar2;
                }
                j6 = j5;
                c0216p.r();
                b(AbstractC0581b.c(c0585f, c0216p), oVar3, j6, c0216p, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168));
                oVar4 = oVar3;
                j7 = j6;
            } else {
                c0216p.N();
                oVar4 = oVar2;
                j7 = j5;
            }
            C0222s0 s4 = c0216p.s();
            if (s4 != null) {
                s4.f2903d = new C0160p0(c0585f, oVar4, j7, i2, i4);
                return;
            }
            return;
        }
        oVar2 = oVar;
        if ((i2 & 3072) != 0) {
        }
        if ((i5 & 1171) == 1170) {
        }
        c0216p.P();
        if ((i2 & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if ((i4 & 8) == 0) {
        }
    }

    public static final void b(C0578I c0578i, S.o oVar, long j4, C0216p c0216p, int i2) {
        int i4;
        S.o oVar2;
        c0216p.U(-2142239481);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(c0578i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        C0316m c0316m = null;
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(oVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.e(j4) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.P();
            if ((i2 & 1) != 0 && !c0216p.y()) {
                c0216p.N();
            }
            c0216p.r();
            boolean z4 = (((i4 & 7168) ^ 3072) > 2048 && c0216p.e(j4)) || (i4 & 3072) == 2048;
            Object I3 = c0216p.I();
            G.W w4 = C0208l.f2826a;
            if (z4 || I3 == w4) {
                if (!C0323u.c(j4, C0323u.f4547g)) {
                    c0316m = new C0316m(j4, 5, Build.VERSION.SDK_INT >= 29 ? C0317n.f4537a.a(j4, 5) : new PorterDuffColorFilter(Z.K.D(j4), Z.K.G(5)));
                }
                c0216p.c0(c0316m);
                I3 = c0316m;
            }
            C0316m c0316m2 = (C0316m) I3;
            c0216p.S(-2144891392);
            S.l lVar = S.l.f3977a;
            c0216p.q(false);
            if (!Y.f.a(c0578i.d(), 9205357640488583168L)) {
                long d4 = c0578i.d();
                if (!Float.isInfinite(Y.f.d(d4)) || !Float.isInfinite(Y.f.b(d4))) {
                    oVar2 = lVar;
                    AbstractC1035n.a(androidx.compose.ui.draw.a.d(oVar.h(oVar2), c0578i, null, C0973i.f9043b, 0.0f, c0316m2, 22).h(lVar), c0216p, 0);
                }
            }
            oVar2 = f1993a;
            AbstractC1035n.a(androidx.compose.ui.draw.a.d(oVar.h(oVar2), c0578i, null, C0973i.f9043b, 0.0f, c0316m2, 22).h(lVar), c0216p, 0);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0163q0(c0578i, oVar, j4, i2, 0);
        }
    }
}
