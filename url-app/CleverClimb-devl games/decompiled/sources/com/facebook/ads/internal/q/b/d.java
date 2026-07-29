package com.facebook.ads.internal.q.b;

import android.graphics.Bitmap;
import com.umeng.commonsdk.proguard.ao;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class d implements com.facebook.ads.internal.q.b.a {

    /* renamed from: a, reason: collision with root package name */
    private static final short[] f5446a = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f5447b = {9, 11, 12, ao.k, ao.k, ao.l, ao.l, ao.m, ao.m, ao.m, ao.m, ao.n, ao.n, ao.n, ao.n, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

    private static class a implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f5448a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5449b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5450c;

        /* renamed from: d, reason: collision with root package name */
        private final int f5451d;
        private final int e;
        private final int f;
        private final int g;

        public a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f5448a = iArr;
            this.f5449b = i;
            this.f5450c = i2;
            this.f5451d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            d.b(this.f5448a, this.f5449b, this.f5450c, this.f5451d, this.e, this.f, this.g);
            return null;
        }
    }

    d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i;
        int i8 = i2;
        int i9 = i7 - 1;
        int i10 = i8 - 1;
        int i11 = (i3 * 2) + 1;
        short s = f5446a[i3];
        byte b2 = f5447b[i3];
        int[] iArr2 = new int[i11];
        if (i6 == 1) {
            int i12 = (i5 * i8) / i4;
            int i13 = ((i5 + 1) * i8) / i4;
            while (i12 < i13) {
                int i14 = i7 * i12;
                int i15 = 0;
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                long j6 = 0;
                while (i15 <= i3) {
                    iArr2[i15] = iArr[i14];
                    i15++;
                    j += ((iArr[i14] >>> 16) & 255) * i15;
                    j2 += ((iArr[i14] >>> 8) & 255) * i15;
                    j3 += (iArr[i14] & 255) * i15;
                    j4 += (iArr[i14] >>> 16) & 255;
                    j5 += (iArr[i14] >>> 8) & 255;
                    j6 += iArr[i14] & 255;
                    s = s;
                }
                short s2 = s;
                int i16 = i14;
                long j7 = 0;
                long j8 = 0;
                long j9 = 0;
                for (int i17 = 1; i17 <= i3; i17++) {
                    if (i17 <= i9) {
                        i16++;
                    }
                    iArr2[i17 + i3] = iArr[i16];
                    int i18 = (i3 + 1) - i17;
                    j += ((iArr[i16] >>> 16) & 255) * i18;
                    j2 += ((iArr[i16] >>> 8) & 255) * i18;
                    j3 += (iArr[i16] & 255) * i18;
                    j7 += (iArr[i16] >>> 16) & 255;
                    j8 += (iArr[i16] >>> 8) & 255;
                    j9 += iArr[i16] & 255;
                }
                int i19 = i3 > i9 ? i9 : i3;
                long j10 = j7;
                int i20 = i19;
                int i21 = i19 + i14;
                int i22 = i14;
                int i23 = i3;
                int i24 = 0;
                while (i24 < i7) {
                    int i25 = i13;
                    int i26 = i12;
                    long j11 = j10;
                    short s3 = s2;
                    long j12 = s3;
                    iArr[i22] = (int) ((iArr[i22] & (-16777216)) | ((((j * j12) >>> b2) & 255) << 16) | ((((j2 * j12) >>> b2) & 255) << 8) | (((j12 * j3) >>> b2) & 255));
                    i22++;
                    long j13 = j - j4;
                    long j14 = j2 - j5;
                    long j15 = j3 - j6;
                    int i27 = (i23 + i11) - i3;
                    if (i27 >= i11) {
                        i27 -= i11;
                    }
                    long j16 = j4 - ((iArr2[i27] >>> 16) & 255);
                    long j17 = j5 - ((iArr2[i27] >>> 8) & 255);
                    long j18 = j6 - (iArr2[i27] & 255);
                    if (i20 < i9) {
                        i21++;
                        i20++;
                    }
                    iArr2[i27] = iArr[i21];
                    long j19 = j11 + ((iArr[i21] >>> 16) & 255);
                    long j20 = j8 + ((iArr[i21] >>> 8) & 255);
                    long j21 = j9 + (iArr[i21] & 255);
                    j = j13 + j19;
                    j2 = j14 + j20;
                    j3 = j15 + j21;
                    i23++;
                    if (i23 >= i11) {
                        i23 = 0;
                    }
                    j4 = j16 + ((iArr2[i23] >>> 16) & 255);
                    j5 = j17 + ((iArr2[i23] >>> 8) & 255);
                    j6 = j18 + (iArr2[i23] & 255);
                    j10 = j19 - ((iArr2[i23] >>> 16) & 255);
                    j8 = j20 - ((iArr2[i23] >>> 8) & 255);
                    j9 = j21 - (iArr2[i23] & 255);
                    i24++;
                    s2 = s3;
                    i13 = i25;
                    i12 = i26;
                    i7 = i;
                }
                i12++;
                s = s2;
                i7 = i;
            }
            return;
        }
        if (i6 == 2) {
            int i28 = (i5 * i) / i4;
            int i29 = ((i5 + 1) * i) / i4;
            while (i28 < i29) {
                int i30 = 0;
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                long j26 = 0;
                long j27 = 0;
                while (i30 <= i3) {
                    iArr2[i30] = iArr[i28];
                    i30++;
                    j22 += ((iArr[i28] >>> 16) & 255) * i30;
                    j23 += ((iArr[i28] >>> 8) & 255) * i30;
                    j24 += (iArr[i28] & 255) * i30;
                    j25 += (iArr[i28] >>> 16) & 255;
                    j26 += (iArr[i28] >>> 8) & 255;
                    j27 += iArr[i28] & 255;
                }
                int i31 = i28;
                int i32 = 1;
                long j28 = 0;
                long j29 = 0;
                long j30 = 0;
                while (i32 <= i3) {
                    if (i32 <= i10) {
                        i31 += i;
                    }
                    iArr2[i32 + i3] = iArr[i31];
                    int i33 = (i3 + 1) - i32;
                    j22 += ((iArr[i31] >>> 16) & 255) * i33;
                    j23 += ((iArr[i31] >>> 8) & 255) * i33;
                    j24 += (iArr[i31] & 255) * i33;
                    j28 += (iArr[i31] >>> 16) & 255;
                    j29 += (iArr[i31] >>> 8) & 255;
                    j30 += iArr[i31] & 255;
                    i32++;
                    b2 = b2;
                }
                byte b3 = b2;
                int i34 = i3 > i10 ? i10 : i3;
                int i35 = i3;
                int i36 = i34;
                int i37 = (i34 * i) + i28;
                int i38 = 0;
                int i39 = i28;
                while (i38 < i8) {
                    int i40 = i38;
                    int i41 = i29;
                    int i42 = i28;
                    int i43 = i10;
                    long j31 = s;
                    iArr[i39] = (int) ((iArr[i39] & (-16777216)) | ((((j22 * j31) >>> b3) & 255) << 16) | ((((j23 * j31) >>> b3) & 255) << 8) | (((j31 * j24) >>> b3) & 255));
                    i39 += i;
                    long j32 = j22 - j25;
                    long j33 = j23 - j26;
                    long j34 = j24 - j27;
                    int i44 = (i35 + i11) - i3;
                    if (i44 >= i11) {
                        i44 -= i11;
                    }
                    long j35 = j25 - ((iArr2[i44] >>> 16) & 255);
                    long j36 = j26 - ((iArr2[i44] >>> 8) & 255);
                    long j37 = j27 - (iArr2[i44] & 255);
                    if (i36 < i43) {
                        i37 += i;
                        i36++;
                    }
                    iArr2[i44] = iArr[i37];
                    long j38 = j28 + ((iArr[i37] >>> 16) & 255);
                    long j39 = j29 + ((iArr[i37] >>> 8) & 255);
                    long j40 = j30 + (iArr[i37] & 255);
                    j22 = j32 + j38;
                    j23 = j33 + j39;
                    j24 = j34 + j40;
                    i35++;
                    if (i35 >= i11) {
                        i35 = 0;
                    }
                    j25 = j35 + ((iArr2[i35] >>> 16) & 255);
                    j26 = j36 + ((iArr2[i35] >>> 8) & 255);
                    j27 = j37 + (iArr2[i35] & 255);
                    j28 = j38 - ((iArr2[i35] >>> 16) & 255);
                    j29 = j39 - ((iArr2[i35] >>> 8) & 255);
                    j30 = j40 - (iArr2[i35] & 255);
                    i10 = i43;
                    i29 = i41;
                    i28 = i42;
                    i38 = i40 + 1;
                    i8 = i2;
                }
                i28++;
                b2 = b3;
                i8 = i2;
            }
        }
    }

    @Override // com.facebook.ads.internal.q.b.a
    public Bitmap a(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i = e.f5452a;
            ArrayList arrayList = new ArrayList(i);
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = (int) f;
                int i4 = i2;
                arrayList.add(new a(iArr, width, height, i3, i, i4, 1));
                arrayList2.add(new a(iArr, width, height, i3, i, i4, 2));
            }
            try {
                e.f5453b.invokeAll(arrayList);
                try {
                    e.f5453b.invokeAll(arrayList2);
                    try {
                        return Bitmap.createBitmap(iArr, width, height, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
