package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.q62;
import com.yandex.mobile.ads.impl.sj0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class kt0 extends u52 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f28317a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f28318b;

        /* renamed from: c, reason: collision with root package name */
        private final o52[] f28319c;

        /* renamed from: d, reason: collision with root package name */
        private final int[] f28320d;

        /* renamed from: e, reason: collision with root package name */
        private final int[][][] f28321e;

        /* renamed from: f, reason: collision with root package name */
        private final o52 f28322f;

        a(int[] iArr, o52[] o52VarArr, int[] iArr2, int[][][] iArr3, o52 o52Var) {
            this.f28318b = iArr;
            this.f28319c = o52VarArr;
            this.f28321e = iArr3;
            this.f28320d = iArr2;
            this.f28322f = o52Var;
            this.f28317a = iArr.length;
        }

        public final int a(int i4, int i5) {
            int i6 = this.f28319c[i4].a(i5).f29448b;
            int[] iArr = new int[i6];
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                if (a(i4, i5, i9) == 4) {
                    iArr[i8] = i9;
                    i8++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i8);
            int i10 = 16;
            int i11 = 0;
            String str = null;
            boolean z4 = false;
            while (i7 < copyOf.length) {
                String str2 = this.f28319c[i4].a(i5).a(copyOf[i7]).f34991m;
                int i12 = i11 + 1;
                if (i11 == 0) {
                    str = str2;
                } else {
                    z4 |= !u82.a(str, str2);
                }
                i10 = Math.min(i10, this.f28321e[i4][i5][i7] & 24);
                i7++;
                i11 = i12;
            }
            return z4 ? Math.min(i10, this.f28320d[i4]) : i10;
        }

        public final o52 b(int i4) {
            return this.f28319c[i4];
        }

        public final o52 b() {
            return this.f28322f;
        }

        public final int a() {
            return this.f28317a;
        }

        public final int a(int i4) {
            return this.f28318b[i4];
        }

        public final int a(int i4, int i5, int i6) {
            return this.f28321e[i4][i5][i6] & 7;
        }
    }

    protected abstract Pair<uo1[], x60[]> a(a aVar, int[][][] iArr, int[] iArr2, dw0.b bVar, x42 x42Var);

    @Override // com.yandex.mobile.ads.impl.u52
    public final void a(Object obj) {
    }

    @Override // com.yandex.mobile.ads.impl.u52
    public final v52 a(to1[] to1VarArr, o52 o52Var, dw0.b bVar, x42 x42Var) {
        boolean z4;
        int[] iArr;
        o52 o52Var2 = o52Var;
        boolean z5 = true;
        int[] iArr2 = new int[to1VarArr.length + 1];
        int length = to1VarArr.length + 1;
        n52[][] n52VarArr = new n52[length][];
        int[][][] iArr3 = new int[to1VarArr.length + 1][][];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = o52Var2.f29912b;
            n52VarArr[i4] = new n52[i5];
            iArr3[i4] = new int[i5][];
        }
        int length2 = to1VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i6 = 0; i6 < length2; i6++) {
            iArr4[i6] = to1VarArr[i6].f();
        }
        int i7 = 0;
        while (i7 < o52Var2.f29912b) {
            n52 a4 = o52Var2.a(i7);
            boolean z6 = a4.f29450d == 5 ? z5 : false;
            int length3 = to1VarArr.length;
            boolean z7 = z5;
            int i8 = 0;
            int i9 = 0;
            while (i8 < to1VarArr.length) {
                to1 to1Var = to1VarArr[i8];
                boolean z8 = z5;
                int i10 = 0;
                for (int i11 = 0; i11 < a4.f29448b; i11++) {
                    i10 = Math.max(i10, to1Var.a(a4.a(i11)) & 7);
                }
                boolean z9 = iArr2[i8] == 0 ? z8 : false;
                if (i10 > i9 || (i10 == i9 && z6 && !z7 && z9)) {
                    z7 = z9;
                    i9 = i10;
                    length3 = i8;
                }
                i8++;
                z5 = z8;
            }
            boolean z10 = z5;
            if (length3 == to1VarArr.length) {
                iArr = new int[a4.f29448b];
            } else {
                to1 to1Var2 = to1VarArr[length3];
                int[] iArr5 = new int[a4.f29448b];
                for (int i12 = 0; i12 < a4.f29448b; i12++) {
                    iArr5[i12] = to1Var2.a(a4.a(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[length3];
            n52VarArr[length3][i13] = a4;
            iArr3[length3][i13] = iArr;
            iArr2[length3] = i13 + 1;
            i7++;
            o52Var2 = o52Var;
            z5 = z10;
        }
        boolean z11 = z5;
        o52[] o52VarArr = new o52[to1VarArr.length];
        String[] strArr = new String[to1VarArr.length];
        int[] iArr6 = new int[to1VarArr.length];
        for (int i14 = 0; i14 < to1VarArr.length; i14++) {
            int i15 = iArr2[i14];
            o52VarArr[i14] = new o52((n52[]) u82.a(i15, n52VarArr[i14]));
            iArr3[i14] = (int[][]) u82.a(i15, iArr3[i14]);
            strArr[i14] = to1VarArr[i14].getName();
            iArr6[i14] = ((AbstractC1811ak) to1VarArr[i14]).m();
        }
        a aVar = new a(iArr6, o52VarArr, iArr4, iArr3, new o52((n52[]) u82.a(iArr2[to1VarArr.length], n52VarArr[to1VarArr.length])));
        Pair<uo1[], x60[]> a5 = a(aVar, iArr3, iArr4, bVar, x42Var);
        r52[] r52VarArr = (r52[]) a5.second;
        List[] listArr = new List[r52VarArr.length];
        for (int i16 = 0; i16 < r52VarArr.length; i16++) {
            r52 r52Var = r52VarArr[i16];
            listArr[i16] = r52Var != null ? sj0.a(r52Var) : sj0.h();
        }
        sj0.a aVar2 = new sj0.a();
        for (int i17 = 0; i17 < aVar.f28317a; i17++) {
            o52 o52Var3 = aVar.f28319c[i17];
            List list = listArr[i17];
            for (int i18 = 0; i18 < o52Var3.f29912b; i18++) {
                n52 a6 = o52Var3.a(i18);
                boolean z12 = aVar.a(i17, i18) != 0 ? z11 : false;
                int i19 = a6.f29448b;
                int[] iArr7 = new int[i19];
                boolean[] zArr = new boolean[i19];
                for (int i20 = 0; i20 < a6.f29448b; i20++) {
                    iArr7[i20] = aVar.a(i17, i18, i20);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            z4 = false;
                            break;
                        }
                        r52 r52Var2 = (r52) list.get(i21);
                        if (r52Var2.a().equals(a6) && r52Var2.c(i20) != -1) {
                            z4 = z11;
                            break;
                        }
                        i21++;
                    }
                    zArr[i20] = z4;
                }
                aVar2.b(new q62.a(a6, z12, iArr7, zArr));
            }
        }
        o52 o52Var4 = aVar.f28322f;
        for (int i22 = 0; i22 < o52Var4.f29912b; i22++) {
            n52 a7 = o52Var4.a(i22);
            int[] iArr8 = new int[a7.f29448b];
            Arrays.fill(iArr8, 0);
            aVar2.b(new q62.a(a7, false, iArr8, new boolean[a7.f29448b]));
        }
        return new v52((uo1[]) a5.first, (x60[]) a5.second, new q62(aVar2.a()), aVar);
    }
}
