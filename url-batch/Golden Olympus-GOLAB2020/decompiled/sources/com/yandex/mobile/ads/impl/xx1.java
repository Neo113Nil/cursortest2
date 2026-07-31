package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes3.dex */
public interface xx1 {

    public static class a implements xx1 {

        /* renamed from: a, reason: collision with root package name */
        private final Random f34711a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f34712b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f34713c;

        public a() {
            this(new Random());
        }

        private static int[] a(Random random) {
            return new int[0];
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final a b(int i4) {
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int i5 = 0;
            int i6 = 0;
            while (i6 < i4) {
                iArr[i6] = this.f34711a.nextInt(this.f34712b.length + 1);
                int i7 = i6 + 1;
                int nextInt = this.f34711a.nextInt(i7);
                iArr2[i6] = iArr2[nextInt];
                iArr2[nextInt] = i6;
                i6 = i7;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f34712b.length + i4];
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f34712b;
                if (i5 >= iArr4.length + i4) {
                    return new a(iArr3, new Random(this.f34711a.nextLong()));
                }
                if (i8 >= i4 || i9 != iArr[i8]) {
                    int i10 = i9 + 1;
                    int i11 = iArr4[i9];
                    iArr3[i5] = i11;
                    if (i11 >= 0) {
                        iArr3[i5] = i11 + i4;
                    }
                    i9 = i10;
                } else {
                    iArr3[i5] = iArr2[i8];
                    i8++;
                }
                i5++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final a c(int i4) {
            int[] iArr = new int[this.f34712b.length - i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f34712b;
                if (i5 >= iArr2.length) {
                    return new a(iArr, new Random(this.f34711a.nextLong()));
                }
                int i7 = iArr2[i5];
                if (i7 < 0 || i7 >= i4) {
                    int i8 = i5 - i6;
                    if (i7 >= 0) {
                        i7 -= i4;
                    }
                    iArr[i8] = i7;
                } else {
                    i6++;
                }
                i5++;
            }
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int d(int i4) {
            int i5 = this.f34713c[i4] - 1;
            if (i5 >= 0) {
                return this.f34712b[i5];
            }
            return -1;
        }

        private a(Random random) {
            this(a(random), random);
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int a() {
            int[] iArr = this.f34712b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        private a(int[] iArr, Random random) {
            this.f34712b = iArr;
            this.f34711a = random;
            this.f34713c = new int[iArr.length];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                this.f34713c[iArr[i4]] = i4;
            }
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int a(int i4) {
            int i5 = this.f34713c[i4] + 1;
            int[] iArr = this.f34712b;
            if (i5 < iArr.length) {
                return iArr[i5];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final a d() {
            return new a(new int[0], new Random(this.f34711a.nextLong()));
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int c() {
            int[] iArr = this.f34712b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.xx1
        public final int b() {
            return this.f34712b.length;
        }
    }

    int a();

    int a(int i4);

    int b();

    a b(int i4);

    int c();

    a c(int i4);

    int d(int i4);

    a d();
}
