package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class gw0 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final en0 e;
    public final cg1 f;

    public gw0(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            cy0.a("Invalid start index");
        }
        this.d = new ArrayList();
        en0 en0Var = new en0();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            gc0 gc0Var = (gc0) this.a.get(i3);
            int i4 = gc0Var.c;
            int i5 = gc0Var.d;
            en0Var.h(i4, new r50(i3, i2, i5));
            i2 += i5;
        }
        this.e = en0Var;
        this.f = ee0.b(new fw0(this));
    }

    public final boolean a(int i, int i2) {
        r50 r50Var;
        int i3;
        int i4;
        en0 en0Var = this.e;
        r50 r50Var2 = (r50) en0Var.b(i);
        if (r50Var2 == null) {
            return false;
        }
        int i5 = r50Var2.b;
        int i6 = i2 - r50Var2.c;
        r50Var2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = en0Var.c;
        long[] jArr = en0Var.a;
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
                    if ((255 & j) < 128 && (i3 = (r50Var = (r50) objArr[(i7 << 3) + i9]).b) >= i5 && r50Var != r50Var2 && (i4 = i3 + i6) >= 0) {
                        r50Var.b = i4;
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
