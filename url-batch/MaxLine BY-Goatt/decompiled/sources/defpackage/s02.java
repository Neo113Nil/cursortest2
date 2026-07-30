package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s02 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final zm1 e;
    public final y91 f;

    public s02(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            v32.a("Invalid start index");
        }
        this.d = new ArrayList();
        zm1 zm1Var = new zm1();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            a81 a81Var = (a81) this.a.get(i3);
            int i4 = a81Var.c;
            int i5 = a81Var.d;
            zm1Var.h(i4, new pw0(i3, i2, i5));
            i2 += i5;
        }
        this.e = zm1Var;
        this.f = ya1.b(new r02(this));
    }

    public final boolean a(int i, int i2) {
        pw0 pw0Var;
        int i3;
        int i4;
        zm1 zm1Var = this.e;
        pw0 pw0Var2 = (pw0) zm1Var.b(i);
        if (pw0Var2 == null) {
            return false;
        }
        int i5 = pw0Var2.b;
        int i6 = i2 - pw0Var2.c;
        pw0Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = zm1Var.c;
        long[] jArr = zm1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (pw0Var = (pw0) objArr[(i7 << 3) + i9]).b) >= i5 && pw0Var != pw0Var2 && (i4 = i3 + i6) >= 0) {
                        pw0Var.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
