package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ks0 extends zs0 {
    public static final ks0 c = new ks0(1, 0, 2);

    @Override // defpackage.zs0
    public final void a(uh uhVar, b9 b9Var, db1 db1Var, i21 i21Var, at0 at0Var) {
        int[] iArr;
        d3 d3Var;
        int c2;
        int b = uhVar.b(0);
        if (db1Var.n != 0) {
            kl.a("Cannot move a group while inserting");
        }
        if (b < 0) {
            kl.a("Parameter offset is out of bounds");
        }
        if (b == 0) {
            return;
        }
        int i = db1Var.t;
        int i2 = db1Var.v;
        int i3 = db1Var.u;
        int i4 = i;
        while (true) {
            iArr = db1Var.b;
            if (b <= 0) {
                break;
            }
            i4 += iArr[(db1Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                kl.a("Parameter offset is out of bounds");
            }
            b--;
        }
        int i5 = iArr[(db1Var.r(i4) * 5) + 3];
        int g = db1Var.g(db1Var.b, db1Var.r(db1Var.t));
        int g2 = db1Var.g(db1Var.b, db1Var.r(i4));
        int i6 = i4 + i5;
        int g3 = db1Var.g(db1Var.b, db1Var.r(i6));
        int i7 = g3 - g2;
        db1Var.x(i7, Math.max(db1Var.t - 1, 0));
        db1Var.w(i5);
        int[] iArr2 = db1Var.b;
        int r = db1Var.r(i6) * 5;
        w9.a(iArr2, iArr2, db1Var.r(i) * 5, r, (i5 * 5) + r);
        if (i7 > 0) {
            Object[] objArr = db1Var.c;
            int h = db1Var.h(g2 + i7);
            System.arraycopy(objArr, h, objArr, g, db1Var.h(g3 + i7) - h);
        }
        int i8 = g2 + i7;
        int i9 = i8 - g;
        int i10 = db1Var.k;
        int i11 = db1Var.l;
        int length = db1Var.c.length;
        int i12 = db1Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int r2 = db1Var.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(r2 * 5) + 4] = db1.i(db1.i(db1Var.g(iArr2, r2) - i15, i12 < r2 ? 0 : i10, i11, length), db1Var.k, db1Var.l, db1Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int p = db1Var.p();
        int a = cb1.a(db1Var.d, i6, p);
        ArrayList arrayList = new ArrayList();
        if (a >= 0) {
            while (a < db1Var.d.size() && (c2 = db1Var.c((d3Var = (d3) db1Var.d.get(a)))) >= i6 && c2 < i16) {
                arrayList.add(d3Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            d3 d3Var2 = (d3) arrayList.get(i18);
            int c3 = db1Var.c(d3Var2) + i17;
            if (c3 >= db1Var.g) {
                d3Var2.a = -(p - c3);
            } else {
                d3Var2.a = c3;
            }
            db1Var.d.add(cb1.a(db1Var.d, c3, p), d3Var2);
        }
        if (db1Var.I(i6, i5)) {
            kl.a("Unexpectedly removed anchors");
        }
        db1Var.m(i2, db1Var.u, i);
        if (i7 > 0) {
            db1Var.J(i8, i7, i6 - 1);
        }
    }
}
