package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class eb1 {
    public static final List a(mb1 mb1Var, ub1 ub1Var, mp mpVar) {
        IntRange intRange;
        eo1 eo1Var = mpVar.a;
        if (eo1Var.o == 0 && ub1Var.m.isEmpty()) {
            return ah0.m;
        }
        ArrayList arrayList = new ArrayList();
        if (eo1Var.o != 0) {
            int i = eo1Var.o;
            if (i == 0) {
                ch2.k("MutableVector is empty.");
                return null;
            }
            Object[] objArr = eo1Var.m;
            int i2 = ((za1) objArr[0]).a;
            if (i > 0) {
                int i3 = 0;
                do {
                    int i4 = ((za1) objArr[i3]).a;
                    if (i4 < i2) {
                        i2 = i4;
                    }
                    i3++;
                } while (i3 < i);
            }
            if (i2 < 0) {
                lh.e("negative minIndex");
                return null;
            }
            int i5 = eo1Var.o;
            if (i5 == 0) {
                ch2.k("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = eo1Var.m;
            int i6 = ((za1) objArr2[0]).b;
            if (i5 > 0) {
                int i7 = 0;
                do {
                    int i8 = ((za1) objArr2[i7]).b;
                    if (i8 > i6) {
                        i6 = i8;
                    }
                    i7++;
                } while (i7 < i5);
            }
            intRange = new IntRange(i2, Math.min(i6, mb1Var.b() - 1), 1);
        } else {
            IntRange.q.getClass();
            intRange = IntRange.r;
        }
        int size = ub1Var.m.size();
        for (int i9 = 0; i9 < size; i9++) {
            tb1 tb1Var = (tb1) ub1Var.get(i9);
            int r = bd3.r(tb1Var.c.h(), mb1Var, tb1Var.a);
            int i10 = intRange.m;
            if ((r > intRange.n || i10 > r) && r >= 0 && r < mb1Var.b()) {
                arrayList.add(Integer.valueOf(r));
            }
        }
        int i11 = intRange.m;
        int i12 = intRange.n;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
