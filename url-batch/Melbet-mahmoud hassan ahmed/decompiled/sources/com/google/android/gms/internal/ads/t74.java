package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class t74 extends w74 {

    /* renamed from: f, reason: collision with root package name */
    private final a94 f12133f;

    /* renamed from: g, reason: collision with root package name */
    private final e73<r74> f12134g;

    /* renamed from: h, reason: collision with root package name */
    private final xv1 f12135h;

    protected t74(gk0 gk0Var, int[] iArr, int i7, a94 a94Var, long j7, long j8, long j9, int i8, int i9, float f7, float f8, List<r74> list, xv1 xv1Var) {
        super(gk0Var, iArr, 0);
        this.f12133f = a94Var;
        this.f12134g = e73.u(list);
        this.f12135h = xv1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ e73 e(l84[] l84VarArr) {
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        char c7 = 0;
        int i9 = 0;
        while (true) {
            i7 = 2;
            i8 = 1;
            if (i9 >= 2) {
                break;
            }
            l84 l84Var = l84VarArr[i9];
            if (l84Var == null || l84Var.f7873b.length <= 1) {
                arrayList.add(null);
            } else {
                b73 q7 = e73.q();
                q7.f(new r74(0L, 0L));
                arrayList.add(q7);
            }
            i9++;
        }
        long[][] jArr = new long[2][];
        for (int i10 = 0; i10 < 2; i10++) {
            l84 l84Var2 = l84VarArr[i10];
            if (l84Var2 == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[l84Var2.f7873b.length];
                int i11 = 0;
                while (true) {
                    if (i11 >= l84Var2.f7873b.length) {
                        break;
                    }
                    jArr[i10][i11] = l84Var2.f7872a.b(r10[i11]).f3656h;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        int[] iArr = new int[2];
        long[] jArr2 = new long[2];
        for (int i12 = 0; i12 < 2; i12++) {
            long[] jArr3 = jArr[i12];
            jArr2[i12] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        f(arrayList, jArr2);
        u73 c8 = n83.b(s83.c()).b(2).c();
        int i13 = 0;
        while (i13 < i7) {
            int length = jArr[i13].length;
            if (length > i8) {
                double[] dArr = new double[length];
                int i14 = 0;
                while (true) {
                    long[] jArr4 = jArr[i13];
                    double d7 = 0.0d;
                    if (i14 >= jArr4.length) {
                        break;
                    }
                    long j7 = jArr4[i14];
                    if (j7 != -1) {
                        d7 = Math.log(j7);
                    }
                    dArr[i14] = d7;
                    i14++;
                }
                int i15 = length - 1;
                double d8 = dArr[i15] - dArr[c7];
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i16 + 1;
                    c8.a(Double.valueOf(d8 == 0.0d ? 1.0d : (((dArr[i16] + dArr[i17]) * 0.5d) - dArr[c7]) / d8), Integer.valueOf(i13));
                    i16 = i17;
                    c7 = 0;
                }
            }
            i13++;
            c7 = 0;
            i7 = 2;
            i8 = 1;
        }
        e73 u6 = e73.u(c8.t());
        for (int i18 = 0; i18 < u6.size(); i18++) {
            int intValue = ((Integer) u6.get(i18)).intValue();
            int i19 = iArr[intValue] + 1;
            iArr[intValue] = i19;
            jArr2[intValue] = jArr[intValue][i19];
            f(arrayList, jArr2);
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (arrayList.get(i20) != null) {
                long j8 = jArr2[i20];
                jArr2[i20] = j8 + j8;
            }
        }
        f(arrayList, jArr2);
        b73 q8 = e73.q();
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            b73 b73Var = (b73) arrayList.get(i21);
            q8.f(b73Var == null ? e73.w() : b73Var.g());
        }
        return q8.g();
    }

    private static void f(List<b73<r74>> list, long[] jArr) {
        long j7 = 0;
        for (int i7 = 0; i7 < 2; i7++) {
            j7 += jArr[i7];
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            b73<r74> b73Var = list.get(i8);
            if (b73Var != null) {
                b73Var.f(new r74(j7, jArr[i8]));
            }
        }
    }
}
