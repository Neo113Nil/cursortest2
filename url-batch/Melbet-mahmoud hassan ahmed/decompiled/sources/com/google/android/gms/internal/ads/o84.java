package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o84 extends q84 {

    /* renamed from: c, reason: collision with root package name */
    private n84 f9568c;

    @Override // com.google.android.gms.internal.ads.q84
    public final r84 a(yx3[] yx3VarArr, hm0 hm0Var, s54 s54Var, ei0 ei0Var) {
        char c7;
        boolean z6;
        int[] iArr;
        int[] iArr2 = new int[3];
        gk0[][] gk0VarArr = new gk0[3][];
        int[][][] iArr3 = new int[3][][];
        int i7 = 0;
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = hm0Var.f6335a;
            gk0VarArr[i8] = new gk0[i9];
            iArr3[i8] = new int[i9][];
        }
        int i10 = 2;
        int[] iArr4 = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr4[i11] = yx3VarArr[i11].b();
        }
        int i12 = 0;
        while (i12 < hm0Var.f6335a) {
            gk0 b7 = hm0Var.b(i12);
            int a7 = dy.a(b7.b(i7).f3660l);
            int i13 = 0;
            int i14 = 2;
            int i15 = 0;
            boolean z7 = true;
            while (i13 < i10) {
                yx3 yx3Var = yx3VarArr[i13];
                int i16 = 0;
                while (i7 <= 0) {
                    i16 = Math.max(i16, yx3Var.j(b7.b(i7)) & 7);
                    i7++;
                }
                boolean z8 = iArr2[i13] == 0;
                if (i16 > i15) {
                    z7 = z8;
                    i14 = i13;
                    i15 = i16;
                } else if (i16 == i15 && a7 == 5 && !z7 && z8) {
                    i14 = i13;
                    i15 = i16;
                    z7 = true;
                }
                i13++;
                i10 = 2;
                i7 = 0;
            }
            if (i14 == i10) {
                iArr = new int[1];
            } else {
                yx3 yx3Var2 = yx3VarArr[i14];
                int[] iArr5 = new int[1];
                for (int i17 = 0; i17 <= 0; i17++) {
                    iArr5[i17] = yx3Var2.j(b7.b(i17));
                }
                iArr = iArr5;
            }
            int i18 = iArr2[i14];
            gk0VarArr[i14][i18] = b7;
            iArr3[i14][i18] = iArr;
            iArr2[i14] = i18 + 1;
            i12++;
            i10 = 2;
            i7 = 0;
        }
        hm0[] hm0VarArr = new hm0[i10];
        String[] strArr = new String[i10];
        int[] iArr6 = new int[i10];
        int i19 = 0;
        while (i19 < i10) {
            int i20 = iArr2[i19];
            hm0VarArr[i19] = new hm0((gk0[]) n13.B(gk0VarArr[i19], i20));
            iArr3[i19] = (int[][]) n13.B(iArr3[i19], i20);
            strArr[i19] = yx3VarArr[i19].v();
            iArr6[i19] = yx3VarArr[i19].a();
            i19++;
            i10 = 2;
        }
        n84 n84Var = new n84(strArr, iArr6, hm0VarArr, iArr4, iArr3, new hm0((gk0[]) n13.B(gk0VarArr[2], iArr2[2])));
        Pair<zx3[], w74[]> f7 = f(n84Var, iArr3, iArr4, s54Var, ei0Var);
        w74[] w74VarArr = (w74[]) f7.second;
        b73 b73Var = new b73();
        for (int i21 = 0; i21 < 2; i21++) {
            hm0 c8 = n84Var.c(i21);
            w74 w74Var = w74VarArr[i21];
            for (int i22 = 0; i22 < c8.f6335a; i22++) {
                gk0 b8 = c8.b(i22);
                int i23 = b8.f5673a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (char c9 = 0; c9 <= 0; c9 = 1) {
                    iArr7[0] = n84Var.b(i21, i22, 0);
                    if (w74Var != null && w74Var.f13748a == b8) {
                        int i24 = 0;
                        while (true) {
                            if (i24 >= w74Var.f13749b) {
                                break;
                            }
                            if (w74Var.f13750c[i24] != 0) {
                                i24++;
                            } else if (i24 != -1) {
                                c7 = 0;
                                z6 = true;
                            }
                        }
                    }
                    c7 = 0;
                    z6 = false;
                    zArr[c7] = z6;
                }
                b73Var.f(new qv0(b8, iArr7, n84Var.a(i21), zArr));
            }
        }
        hm0 d7 = n84Var.d();
        for (int i25 = 0; i25 < d7.f6335a; i25++) {
            gk0 b9 = d7.b(i25);
            int i26 = b9.f5673a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            b73Var.f(new qv0(b9, iArr8, dy.a(b9.b(0).f3660l), new boolean[1]));
        }
        return new r84((zx3[]) f7.first, (w74[]) f7.second, new pw0(b73Var.g()), n84Var, null);
    }

    @Override // com.google.android.gms.internal.ads.q84
    public final void b(Object obj) {
        this.f9568c = (n84) obj;
    }

    protected abstract Pair<zx3[], w74[]> f(n84 n84Var, int[][][] iArr, int[] iArr2, s54 s54Var, ei0 ei0Var);
}
