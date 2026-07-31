package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class l74 {

    /* renamed from: a, reason: collision with root package name */
    private final Random f7859a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f7860b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f7861c;

    public l74(int i7) {
        this(0, new Random());
    }

    private l74(int i7, Random random) {
        this(new int[0], random);
    }

    private l74(int[] iArr, Random random) {
        this.f7860b = iArr;
        this.f7859a = random;
        this.f7861c = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.f7861c[iArr[i7]] = i7;
        }
    }

    public final int a() {
        int[] iArr = this.f7860b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final int b() {
        int[] iArr = this.f7860b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int c() {
        return this.f7860b.length;
    }

    public final int d(int i7) {
        int i8 = this.f7861c[i7] + 1;
        int[] iArr = this.f7860b;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    public final int e(int i7) {
        int i8 = this.f7861c[i7] - 1;
        if (i8 >= 0) {
            return this.f7860b[i8];
        }
        return -1;
    }

    public final l74 f() {
        return new l74(0, new Random(this.f7859a.nextLong()));
    }

    public final l74 g(int i7, int i8) {
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        int i9 = 0;
        int i10 = 0;
        while (i10 < i8) {
            iArr[i10] = this.f7859a.nextInt(this.f7860b.length + 1);
            int i11 = i10 + 1;
            int nextInt = this.f7859a.nextInt(i11);
            iArr2[i10] = iArr2[nextInt];
            iArr2[nextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr);
        int[] iArr3 = new int[this.f7860b.length + i8];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr4 = this.f7860b;
            if (i9 >= iArr4.length + i8) {
                return new l74(iArr3, new Random(this.f7859a.nextLong()));
            }
            if (i12 >= i8 || i13 != iArr[i12]) {
                int i14 = i13 + 1;
                int i15 = iArr4[i13];
                iArr3[i9] = i15;
                if (i15 >= 0) {
                    iArr3[i9] = i15 + i8;
                }
                i13 = i14;
            } else {
                iArr3[i9] = iArr2[i12];
                i12++;
            }
            i9++;
        }
    }

    public final l74 h(int i7, int i8) {
        int[] iArr = new int[this.f7860b.length - i8];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f7860b;
            if (i9 >= iArr2.length) {
                return new l74(iArr, new Random(this.f7859a.nextLong()));
            }
            int i11 = iArr2[i9];
            if (i11 < 0 || i11 >= i8) {
                int i12 = i9 - i10;
                if (i11 >= 0) {
                    i11 -= i8;
                }
                iArr[i12] = i11;
            } else {
                i10++;
            }
            i9++;
        }
    }
}
