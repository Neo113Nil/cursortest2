package com.anythink.basead.exoplayer.e.a;

import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7137a = 8192;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f7138a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f7139b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7140c;

        /* renamed from: d, reason: collision with root package name */
        public final long[] f7141d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f7142e;

        /* renamed from: f, reason: collision with root package name */
        public final long f7143f;

        public /* synthetic */ a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j9, byte b9) {
            this(jArr, iArr, i, jArr2, iArr2, j9);
        }

        private a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j9) {
            this.f7138a = jArr;
            this.f7139b = iArr;
            this.f7140c = i;
            this.f7141d = jArr2;
            this.f7142e = iArr2;
            this.f7143f = j9;
        }
    }

    private d() {
    }

    public static a a(int i, long[] jArr, int[] iArr, long j9) {
        int i4 = f7137a / i;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += af.a(i10, i4);
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
            long j10 = jArr[i14];
            while (i15 > 0) {
                int min = Math.min(i4, i15);
                jArr2[i12] = j10;
                int i16 = i * min;
                iArr2[i12] = i16;
                i13 = Math.max(i13, i16);
                jArr3[i12] = i11 * j9;
                iArr3[i12] = 1;
                j10 += iArr2[i12];
                i11 += min;
                i15 -= min;
                i12++;
            }
        }
        return new a(jArr2, iArr2, i13, jArr3, iArr3, j9 * i11, (byte) 0);
    }
}
