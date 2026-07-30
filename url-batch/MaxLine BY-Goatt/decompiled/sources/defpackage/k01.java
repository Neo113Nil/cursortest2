package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class k01 {
    public static final vl1 a = b.h(sl1.a, 24.0f);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
    
        if ((r15 & 8) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(x01 x01Var, String str, vl1 vl1Var, long j, a00 a00Var, int i, int i2) {
        int i3;
        a00 a00Var2;
        String str2;
        vl1 vl1Var2;
        long j2;
        a00Var.Z(-126890956);
        if ((i & 6) == 0) {
            i3 = (a00Var.f(x01Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= a00Var.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= a00Var.f(vl1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && a00Var.e(j)) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
            a00Var2 = a00Var;
            j2 = j;
            vl1Var2 = vl1Var;
            str2 = str;
        } else {
            a00Var.U();
            if ((i & 1) == 0 || a00Var.z()) {
                if (i4 != 0) {
                    vl1Var = sl1.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((aw) a00Var.j(e20.a)).a;
                    i3 &= -7169;
                }
                vl1 vl1Var3 = vl1Var;
                long j3 = j;
                a00Var.r();
                a00Var2 = a00Var;
                b(hl2.k(x01Var, a00Var), str, vl1Var3, j3, a00Var2, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168));
                str2 = str;
                vl1Var2 = vl1Var3;
                j2 = j3;
            } else {
                a00Var.S();
            }
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new i01(x01Var, str2, vl1Var2, j2, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (java.lang.Float.isInfinite(defpackage.ql2.b(r11)) != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(xy1 xy1Var, String str, vl1 vl1Var, long j, a00 a00Var, int i) {
        xy1 xy1Var2;
        int i2;
        vl1 vl1Var2;
        a00Var.Z(-2142239481);
        if ((i & 6) == 0) {
            xy1Var2 = xy1Var;
            i2 = (a00Var.h(xy1Var2) ? 4 : 2) | i;
        } else {
            xy1Var2 = xy1Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= a00Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= a00Var.f(vl1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= a00Var.e(j) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            a00Var.U();
            if ((i & 1) != 0 && !a00Var.z()) {
                a00Var.S();
            }
            a00Var.r();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && a00Var.e(j)) || (i2 & 3072) == 2048;
            Object M = a00Var.M();
            nj njVar = sz.a;
            if (z || M == njVar) {
                M = aw.c(j, aw.g) ? null : new mo(j, 5);
                a00Var.i0(M);
            }
            mo moVar = (mo) M;
            a00Var.X(-2144891392);
            vl1 vl1Var3 = sl1.a;
            if (str != null) {
                boolean z2 = (i2 & 112) == 32;
                Object M2 = a00Var.M();
                if (z2 || M2 == njVar) {
                    M2 = new b6(str, 1);
                    a00Var.i0(M2);
                }
                vl1Var2 = wh2.a(vl1Var3, (Function1) M2);
            } else {
                vl1Var2 = vl1Var3;
            }
            a00Var.q(false);
            vl1 vl1Var4 = vl1Var2;
            if (!ql2.a(xy1Var2.h(), 9205357640488583168L)) {
                long h = xy1Var2.h();
                if (Float.isInfinite(ql2.d(h))) {
                }
                fp.a(a.d(vl1Var.k(vl1Var3), xy1Var2, p20.b, 0.0f, moVar, 22).k(vl1Var4), a00Var, 0);
            }
            vl1Var3 = a;
            fp.a(a.d(vl1Var.k(vl1Var3), xy1Var2, p20.b, 0.0f, moVar, 22).k(vl1Var4), a00Var, 0);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new j01(xy1Var, str, vl1Var, j, i);
        }
    }
}
