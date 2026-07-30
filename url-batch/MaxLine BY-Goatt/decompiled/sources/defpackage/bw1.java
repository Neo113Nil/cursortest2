package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bw1 extends pw1 {
    public static final bw1 c = new bw1(1, 0, 2);

    @Override // defpackage.pw1
    public final void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        int[] iArr;
        m6 m6Var;
        int c2;
        int f = gnVar.f(0);
        if (zl2Var.n != 0) {
            b00.c("Cannot move a group while inserting");
        }
        if (f < 0) {
            b00.c("Parameter offset is out of bounds");
        }
        if (f == 0) {
            return;
        }
        int i = zl2Var.t;
        int i2 = zl2Var.v;
        int i3 = zl2Var.u;
        int i4 = i;
        while (true) {
            iArr = zl2Var.b;
            if (f <= 0) {
                break;
            }
            i4 += iArr[(zl2Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                b00.c("Parameter offset is out of bounds");
            }
            f--;
        }
        int i5 = iArr[(zl2Var.r(i4) * 5) + 3];
        int g = zl2Var.g(zl2Var.b, zl2Var.r(zl2Var.t));
        int g2 = zl2Var.g(zl2Var.b, zl2Var.r(i4));
        int i6 = i4 + i5;
        int g3 = zl2Var.g(zl2Var.b, zl2Var.r(i6));
        int i7 = g3 - g2;
        zl2Var.w(i7, Math.max(zl2Var.t - 1, 0));
        zl2Var.v(i5);
        int[] iArr2 = zl2Var.b;
        int r = zl2Var.r(i6) * 5;
        ni.d(zl2Var.r(i) * 5, r, (i5 * 5) + r, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = zl2Var.c;
            int h = zl2Var.h(g2 + i7);
            System.arraycopy(objArr, h, objArr, g, zl2Var.h(g3 + i7) - h);
        }
        int i8 = g2 + i7;
        int i9 = i8 - g;
        int i10 = zl2Var.k;
        int i11 = zl2Var.l;
        int length = zl2Var.c.length;
        int i12 = zl2Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int r2 = zl2Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(r2 * 5) + 4] = zl2.i(zl2.i(zl2Var.g(iArr2, r2) - i15, i12 < r2 ? 0 : i10, i11, length), zl2Var.k, zl2Var.l, zl2Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int p = zl2Var.p();
        int a = yl2.a(zl2Var.d, i6, p);
        ArrayList arrayList = new ArrayList();
        if (a >= 0) {
            while (a < zl2Var.d.size() && (c2 = zl2Var.c((m6Var = (m6) zl2Var.d.get(a)))) >= i6 && c2 < i16) {
                arrayList.add(m6Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            m6 m6Var2 = (m6) arrayList.get(i18);
            int c3 = zl2Var.c(m6Var2) + i17;
            if (c3 >= zl2Var.g) {
                m6Var2.a = -(p - c3);
            } else {
                m6Var2.a = c3;
            }
            zl2Var.d.add(yl2.a(zl2Var.d, c3, p), m6Var2);
        }
        if (zl2Var.H(i6, i5)) {
            b00.c("Unexpectedly removed anchors");
        }
        zl2Var.m(i2, zl2Var.u, i);
        if (i7 > 0) {
            zl2Var.I(i8, i7, i6 - 1);
        }
    }
}
