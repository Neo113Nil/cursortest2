package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rj1 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final yn e;
    public final zn f;
    public final u81 g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int[] k;
    public int l;
    public int m;

    public rj1(int i, int i2, List list, long j, Object obj, ww1 ww1Var, yn ynVar, zn znVar, u81 u81Var, boolean z) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = ynVar;
        this.f = znVar;
        this.g = u81Var;
        this.h = z;
        this.i = ww1Var == ww1.m;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            n12 n12Var = (n12) list.get(i4);
            i3 = Math.max(i3, !this.i ? n12Var.n : n12Var.m);
        }
        this.j = i3;
        this.k = new int[this.b.size() * 2];
        this.m = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.l += i;
        int[] iArr = this.k;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.i;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.l = i;
        boolean z = this.i;
        this.m = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            n12 n12Var = (n12) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.k;
            if (z) {
                yn ynVar = this.e;
                if (ynVar == null) {
                    lh.e("null horizontalAlignment");
                    return;
                } else {
                    iArr[i6] = ynVar.a(n12Var.m, i2, this.g);
                    iArr[i6 + 1] = i;
                    i4 = n12Var.n;
                }
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                zn znVar = this.f;
                if (znVar == null) {
                    lh.e("null verticalAlignment");
                    return;
                } else {
                    iArr[i7] = znVar.a(n12Var.n, i3);
                    i4 = n12Var.m;
                }
            }
            i += i4;
        }
    }
}
