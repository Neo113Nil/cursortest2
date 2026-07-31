package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class eb0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f25172a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f25173b;

        /* renamed from: c, reason: collision with root package name */
        public final int f25174c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f25175d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f25176e;

        /* renamed from: f, reason: collision with root package name */
        public final long f25177f;

        private a(long[] jArr, int[] iArr, int i4, long[] jArr2, int[] iArr2, long j4) {
            this.f25172a = jArr;
            this.f25173b = iArr;
            this.f25174c = i4;
            this.f25175d = jArr2;
            this.f25176e = iArr2;
            this.f25177f = j4;
        }
    }

    public static a a(int i4, long[] jArr, int[] iArr, long j4) {
        int i5 = 1;
        int i6 = 8192 / i4;
        int i7 = 0;
        for (int i8 : iArr) {
            int i9 = u82.f32873a;
            i7 += ((i8 + i6) - 1) / i6;
        }
        long[] jArr2 = new long[i7];
        int[] iArr2 = new int[i7];
        long[] jArr3 = new long[i7];
        int[] iArr3 = new int[i7];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13 += i5) {
            int i14 = iArr[i13];
            long j5 = jArr[i13];
            while (i14 > 0) {
                int min = Math.min(i6, i14);
                jArr2[i11] = j5;
                int i15 = i4 * min;
                iArr2[i11] = i15;
                i12 = Math.max(i12, i15);
                int i16 = i5;
                jArr3[i11] = i10 * j4;
                iArr3[i11] = i16;
                j5 += iArr2[i11];
                i10 += min;
                i14 -= min;
                i11 += i16;
                i5 = i16;
                i6 = i6;
            }
        }
        return new a(jArr2, iArr2, i12, jArr3, iArr3, j4 * i10);
    }
}
