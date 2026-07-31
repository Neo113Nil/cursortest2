package e1;

import o2.m0;

/* loaded from: classes.dex */
final class d {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f15876a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f15877b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15878c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f15879d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f15880e;

        /* renamed from: f, reason: collision with root package name */
        public final long f15881f;

        private b(long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j7) {
            this.f15876a = jArr;
            this.f15877b = iArr;
            this.f15878c = i7;
            this.f15879d = jArr2;
            this.f15880e = iArr2;
            this.f15881f = j7;
        }
    }

    public static b a(int i7, long[] jArr, int[] iArr, long j7) {
        int i8 = 8192 / i7;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += m0.l(i10, i8);
        }
        long[] jArr2 = new long[i9];
        int[] iArr2 = new int[i9];
        long[] jArr3 = new long[i9];
        int[] iArr3 = new int[i9];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            long j8 = jArr[i14];
            while (i15 > 0) {
                int min = Math.min(i8, i15);
                jArr2[i12] = j8;
                iArr2[i12] = i7 * min;
                i13 = Math.max(i13, iArr2[i12]);
                jArr3[i12] = i11 * j7;
                iArr3[i12] = 1;
                j8 += iArr2[i12];
                i11 += min;
                i15 -= min;
                i12++;
            }
        }
        return new b(jArr2, iArr2, i13, jArr3, iArr3, j7 * i11);
    }
}
