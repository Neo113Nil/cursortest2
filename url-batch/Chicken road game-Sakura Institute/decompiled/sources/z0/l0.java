package z0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j4.i f10006a = new j4.i(26);

    /* renamed from: b, reason: collision with root package name */
    public static Method f10007b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f10008c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f10009d;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 <= 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        r3 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int A(float f9, float[] fArr, int i7) {
        float f10 = 0.0f;
        if (f9 >= 0.0f) {
            f10 = 1.0f;
            if (f9 > 1.0f) {
            }
        }
        fArr[i7] = f9;
        return !Float.isNaN(f9) ? 1 : 0;
    }

    public static final d a(h hVar) {
        Canvas canvas = e.f9988a;
        d dVar = new d();
        dVar.f9984a = new Canvas(k(hVar));
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f9, float f10, float f11, float f12, a1.c cVar) {
        int i7;
        int i8;
        int i9;
        float b9;
        float a3;
        int i10;
        int i11;
        int i12;
        int i13;
        float b10;
        float a9;
        int i14;
        int i15;
        int i16;
        if (cVar.c()) {
            float f13 = f12 < 0.0f ? 0.0f : f12;
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i17 = ((int) ((f13 * 255.0f) + 0.5f)) << 24;
            float f14 = f9 < 0.0f ? 0.0f : f9;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i18 = i17 | (((int) ((f14 * 255.0f) + 0.5f)) << 16);
            float f15 = f10 < 0.0f ? 0.0f : f10;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i19 = i18 | (((int) ((f15 * 255.0f) + 0.5f)) << 8);
            long j8 = (i19 | ((int) ((((f11 >= 0.0f ? f11 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i20 = u.f10058h;
            return j8;
        }
        long j9 = cVar.f216b;
        int i21 = a1.b.f214e;
        if (((int) (j9 >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i22 = cVar.f217c;
        if (i22 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float b11 = cVar.b(0);
        float a10 = cVar.a(0);
        if (f9 >= b11) {
            b11 = f9;
        }
        if (b11 <= a10) {
            a10 = b11;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a10);
        int i23 = floatToRawIntBits >>> 31;
        int i24 = (floatToRawIntBits >>> 23) & 255;
        int i25 = floatToRawIntBits & 8388607;
        if (i24 == 255) {
            i8 = i25 != 0 ? 512 : 0;
            i7 = 31;
        } else {
            i7 = i24 - 112;
            if (i7 >= 31) {
                i8 = 0;
                i7 = 49;
            } else if (i7 > 0) {
                int i26 = i25 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i9 = (((i7 << 10) | i26) + 1) | (i23 << 15);
                    short s5 = (short) i9;
                    b9 = cVar.b(1);
                    a3 = cVar.a(1);
                    if (f10 >= b9) {
                        b9 = f10;
                    }
                    if (b9 <= a3) {
                        a3 = b9;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a3);
                    int i27 = floatToRawIntBits2 >>> 31;
                    i10 = (floatToRawIntBits2 >>> 23) & 255;
                    int i28 = floatToRawIntBits2 & 8388607;
                    if (i10 != 255) {
                        i12 = i28 != 0 ? 512 : 0;
                        i11 = 31;
                    } else {
                        i11 = i10 - 112;
                        if (i11 >= 31) {
                            i12 = 0;
                            i11 = 49;
                        } else if (i11 > 0) {
                            int i29 = i28 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i13 = (((i11 << 10) | i29) + 1) | (i27 << 15);
                                short s8 = (short) i13;
                                b10 = cVar.b(2);
                                a9 = cVar.a(2);
                                if (f11 >= b10) {
                                    b10 = f11;
                                }
                                if (b10 <= a9) {
                                    a9 = b10;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a9);
                                int i30 = floatToRawIntBits3 >>> 31;
                                i14 = (floatToRawIntBits3 >>> 23) & 255;
                                int i31 = 8388607 & floatToRawIntBits3;
                                if (i14 == 255) {
                                    i15 = i31 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i32 = i14 - 112;
                                    if (i32 >= 31) {
                                        i15 = 0;
                                        r7 = 49;
                                    } else if (i32 > 0) {
                                        int i33 = i31 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i16 = (((i32 << 10) | i33) + 1) | (i30 << 15);
                                            long j10 = (i22 & 63) | ((s5 & 65535) << 48) | ((s8 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i34 = u.f10058h;
                                            return j10;
                                        }
                                        i15 = i33;
                                        r7 = i32;
                                    } else if (i32 >= -10) {
                                        int i35 = (i31 | 8388608) >> (1 - i32);
                                        if ((i35 & 4096) != 0) {
                                            i35 += 8192;
                                        }
                                        i15 = i35 >> 13;
                                    } else {
                                        i15 = 0;
                                    }
                                }
                                i16 = i15 | (i30 << 15) | (r7 << 10);
                                if (f12 >= 0.0f) {
                                }
                                long j102 = (i22 & 63) | ((s5 & 65535) << 48) | ((s8 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i342 = u.f10058h;
                                return j102;
                            }
                            i12 = i29;
                        } else if (i11 >= -10) {
                            int i36 = (i28 | 8388608) >> (1 - i11);
                            if ((i36 & 4096) != 0) {
                                i36 += 8192;
                            }
                            i12 = i36 >> 13;
                            i11 = 0;
                        } else {
                            i12 = 0;
                            i11 = 0;
                        }
                    }
                    i13 = i12 | (i27 << 15) | (i11 << 10);
                    short s82 = (short) i13;
                    b10 = cVar.b(2);
                    a9 = cVar.a(2);
                    if (f11 >= b10) {
                    }
                    if (b10 <= a9) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a9);
                    int i302 = floatToRawIntBits32 >>> 31;
                    i14 = (floatToRawIntBits32 >>> 23) & 255;
                    int i312 = 8388607 & floatToRawIntBits32;
                    if (i14 == 255) {
                    }
                    i16 = i15 | (i302 << 15) | (r7 << 10);
                    if (f12 >= 0.0f) {
                    }
                    long j1022 = (i22 & 63) | ((s5 & 65535) << 48) | ((s82 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i3422 = u.f10058h;
                    return j1022;
                }
                i8 = i26;
            } else if (i7 >= -10) {
                int i37 = (i25 | 8388608) >> (1 - i7);
                if ((i37 & 4096) != 0) {
                    i37 += 8192;
                }
                i8 = i37 >> 13;
                i7 = 0;
            } else {
                i8 = 0;
                i7 = 0;
            }
        }
        i9 = i8 | (i23 << 15) | (i7 << 10);
        short s52 = (short) i9;
        b9 = cVar.b(1);
        a3 = cVar.a(1);
        if (f10 >= b9) {
        }
        if (b9 <= a3) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a3);
        int i272 = floatToRawIntBits22 >>> 31;
        i10 = (floatToRawIntBits22 >>> 23) & 255;
        int i282 = floatToRawIntBits22 & 8388607;
        if (i10 != 255) {
        }
        i13 = i12 | (i272 << 15) | (i11 << 10);
        short s822 = (short) i13;
        b10 = cVar.b(2);
        a9 = cVar.a(2);
        if (f11 >= b10) {
        }
        if (b10 <= a9) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a9);
        int i3022 = floatToRawIntBits322 >>> 31;
        i14 = (floatToRawIntBits322 >>> 23) & 255;
        int i3122 = 8388607 & floatToRawIntBits322;
        if (i14 == 255) {
        }
        i16 = i15 | (i3022 << 15) | (r7 << 10);
        if (f12 >= 0.0f) {
        }
        long j10222 = (i22 & 63) | ((s52 & 65535) << 48) | ((s822 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i34222 = u.f10058h;
        return j10222;
    }

    public static final long c(int i7) {
        long j8 = i7 << 32;
        int i8 = u.f10058h;
        return j8;
    }

    public static final long d(long j8) {
        long j9 = j8 << 32;
        int i7 = u.f10058h;
        return j9;
    }

    public static long e(int i7, int i8, int i9) {
        return c(((i7 & 255) << 16) | (-16777216) | ((i8 & 255) << 8) | (i9 & 255));
    }

    public static h f(int i7, int i8, int i9) {
        Bitmap createBitmap;
        a1.q qVar = a1.d.f220c;
        Bitmap.Config x8 = x(i9);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = l.b(i7, i8, i9, true, qVar);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i8, x8);
            createBitmap.setHasAlpha(true);
        }
        return new h(createBitmap);
    }

    public static final f7.i0 g() {
        return new f7.i0(new Paint(7));
    }

    public static final j h() {
        return new j(new Path());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(float f9, float f10, float f11, float f12, a1.c cVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (cVar.c()) {
            long j8 = ((((((int) ((f12 * 255.0f) + 0.5f)) << 24) | (((int) ((f9 * 255.0f) + 0.5f)) << 16)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f11) + 0.5f))) << 32;
            int i16 = u.f10058h;
            return j8;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f9);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        int i20 = 49;
        int i21 = 0;
        if (i18 == 255) {
            i8 = i19 != 0 ? 512 : 0;
            i7 = 31;
        } else {
            i7 = i18 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i8 = 0;
            } else if (i7 > 0) {
                int i22 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i9 = (((i7 << 10) | i22) + 1) | (i17 << 15);
                    short s5 = (short) i9;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f10);
                    int i23 = floatToRawIntBits2 >>> 31;
                    i10 = (floatToRawIntBits2 >>> 23) & 255;
                    int i24 = floatToRawIntBits2 & 8388607;
                    if (i10 != 255) {
                        i12 = i24 != 0 ? 512 : 0;
                        i11 = 31;
                    } else {
                        i11 = i10 - 112;
                        if (i11 >= 31) {
                            i11 = 49;
                            i12 = 0;
                        } else if (i11 > 0) {
                            int i25 = i24 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i13 = (((i11 << 10) | i25) + 1) | (i23 << 15);
                                short s8 = (short) i13;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f11);
                                int i26 = floatToRawIntBits3 >>> 31;
                                i14 = (floatToRawIntBits3 >>> 23) & 255;
                                int i27 = 8388607 & floatToRawIntBits3;
                                if (i14 == 255) {
                                    i21 = i27 == 0 ? 0 : 512;
                                    i20 = 31;
                                } else {
                                    int i28 = i14 - 112;
                                    if (i28 < 31) {
                                        if (i28 > 0) {
                                            i21 = i27 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i15 = (((i28 << 10) | i21) + 1) | (i26 << 15);
                                                long max = ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s8 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f217c & 63);
                                                int i29 = u.f10058h;
                                                return max;
                                            }
                                            i20 = i28;
                                        } else if (i28 >= -10) {
                                            int i30 = (i27 | 8388608) >> (1 - i28);
                                            if ((i30 & 4096) != 0) {
                                                i30 += 8192;
                                            }
                                            i20 = 0;
                                            i21 = i30 >> 13;
                                        } else {
                                            i20 = 0;
                                        }
                                    }
                                }
                                i15 = (i26 << 15) | (i20 << 10) | i21;
                                long max2 = ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s8 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f217c & 63);
                                int i292 = u.f10058h;
                                return max2;
                            }
                            i12 = i25;
                        } else if (i11 >= -10) {
                            int i31 = (i24 | 8388608) >> (1 - i11);
                            if ((i31 & 4096) != 0) {
                                i31 += 8192;
                            }
                            i12 = i31 >> 13;
                            i11 = 0;
                        } else {
                            i12 = 0;
                            i11 = 0;
                        }
                    }
                    i13 = i12 | (i23 << 15) | (i11 << 10);
                    short s82 = (short) i13;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f11);
                    int i262 = floatToRawIntBits32 >>> 31;
                    i14 = (floatToRawIntBits32 >>> 23) & 255;
                    int i272 = 8388607 & floatToRawIntBits32;
                    if (i14 == 255) {
                    }
                    i15 = (i262 << 15) | (i20 << 10) | i21;
                    long max22 = ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s82 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f217c & 63);
                    int i2922 = u.f10058h;
                    return max22;
                }
                i8 = i22;
            } else if (i7 >= -10) {
                int i32 = (i19 | 8388608) >> (1 - i7);
                if ((i32 & 4096) != 0) {
                    i32 += 8192;
                }
                i8 = i32 >> 13;
                i7 = 0;
            } else {
                i8 = 0;
                i7 = 0;
            }
        }
        i9 = i8 | (i17 << 15) | (i7 << 10);
        short s52 = (short) i9;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f10);
        int i232 = floatToRawIntBits22 >>> 31;
        i10 = (floatToRawIntBits22 >>> 23) & 255;
        int i242 = floatToRawIntBits22 & 8388607;
        if (i10 != 255) {
        }
        i13 = i12 | (i232 << 15) | (i11 << 10);
        short s822 = (short) i13;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f11);
        int i2622 = floatToRawIntBits322 >>> 31;
        i14 = (floatToRawIntBits322 >>> 23) & 255;
        int i2722 = 8388607 & floatToRawIntBits322;
        if (i14 == 255) {
        }
        i15 = (i2622 << 15) | (i20 << 10) | i21;
        long max222 = ((((short) i15) & 65535) << 16) | ((s52 & 65535) << 48) | ((s822 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f12, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (cVar.f217c & 63);
        int i29222 = u.f10058h;
        return max222;
    }

    public static final float j(float[] fArr, int i7, float[] fArr2, int i8) {
        int i9 = i7 * 4;
        return (fArr[i9 + 3] * fArr2[12 + i8]) + (fArr[i9 + 2] * fArr2[8 + i8]) + (fArr[i9 + 1] * fArr2[4 + i8]) + (fArr[i9] * fArr2[i8]);
    }

    public static final Bitmap k(h hVar) {
        if (hVar instanceof h) {
            return hVar.f9996a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long l(long j8, long j9) {
        float f9;
        float f10;
        long a3 = u.a(j8, u.f(j9));
        float d8 = u.d(j9);
        float d9 = u.d(a3);
        float f11 = 1.0f - d9;
        float f12 = (d8 * f11) + d9;
        float h3 = u.h(a3);
        float h8 = u.h(j9);
        float f13 = 0.0f;
        if (f12 == 0.0f) {
            f9 = 0.0f;
        } else {
            f9 = (((h8 * d8) * f11) + (h3 * d9)) / f12;
        }
        float g9 = u.g(a3);
        float g10 = u.g(j9);
        if (f12 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((g10 * d8) * f11) + (g9 * d9)) / f12;
        }
        float e9 = u.e(a3);
        float e10 = u.e(j9);
        if (f12 != 0.0f) {
            f13 = (((e10 * d8) * f11) + (e9 * d9)) / f12;
        }
        return i(f9, f10, f13, f12, u.f(j9));
    }

    public static void m(b1.e eVar, j0 j0Var, long j8) {
        if (j0Var instanceof h0) {
            y0.d dVar = ((h0) j0Var).f9997a;
            eVar.J(j8, u3.r.a(dVar.f9780a, dVar.f9781b), v0.d.a(dVar.c(), dVar.b()), 3);
            return;
        }
        boolean z8 = j0Var instanceof i0;
        b1.h hVar = b1.h.f1238a;
        if (!z8) {
            if (!(j0Var instanceof g0)) {
                throw new b4.c();
            }
            eVar.Y(((g0) j0Var).f9995a, j8, hVar);
            return;
        }
        i0 i0Var = (i0) j0Var;
        j jVar = i0Var.f10001b;
        if (jVar != null) {
            eVar.Y(jVar, j8, hVar);
            return;
        }
        y0.e eVar2 = i0Var.f10000a;
        float b9 = y0.a.b(eVar2.f9791h);
        eVar.H(j8, u3.r.a(eVar2.f9784a, eVar2.f9785b), v0.d.a(eVar2.b(), eVar2.a()), v1.g.a(b9, b9), hVar);
    }

    public static void n(Canvas canvas, boolean z8) {
        Method method;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            t.f10050a.a(canvas, z8);
            return;
        }
        if (!f10009d) {
            try {
                if (i7 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f10007b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f10008c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f10007b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f10008c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f10007b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f10008c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f10009d = true;
        }
        if (z8) {
            try {
                Method method4 = f10007b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z8 || (method = f10008c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final long o(float f9, long j8, long j9) {
        a1.l lVar = a1.d.f237t;
        long a3 = u.a(j8, lVar);
        long a9 = u.a(j9, lVar);
        float d8 = u.d(a3);
        float h3 = u.h(a3);
        float g9 = u.g(a3);
        float e9 = u.e(a3);
        float d9 = u.d(a9);
        float h8 = u.h(a9);
        float g10 = u.g(a9);
        float e10 = u.e(a9);
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        return u.a(i(a8.m.D(h3, h8, f9), a8.m.D(g9, g10, f9), a8.m.D(e9, e10, f9), a8.m.D(d8, d9, f9), lVar), u.f(j9));
    }

    public static final float p(long j8) {
        a1.c f9 = u.f(j8);
        if (!a1.b.a(f9.f216b, a1.b.f210a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) a1.b.b(f9.f216b)));
        }
        a1.m mVar = ((a1.q) f9).f278p;
        double d8 = mVar.d(u.h(j8));
        float d9 = (float) ((mVar.d(u.e(j8)) * 0.0722d) + (mVar.d(u.g(j8)) * 0.7152d) + (d8 * 0.2126d));
        if (d9 < 0.0f) {
            d9 = 0.0f;
        }
        if (d9 > 1.0f) {
            return 1.0f;
        }
        return d9;
    }

    public static final void q(Matrix matrix, float[] fArr) {
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[15];
        fArr[0] = f9;
        fArr[1] = f13;
        fArr[2] = f18;
        fArr[3] = f10;
        fArr[4] = f14;
        fArr[5] = f19;
        fArr[6] = f12;
        fArr[7] = f16;
        fArr[8] = f20;
        matrix.setValues(fArr);
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f12;
        fArr[4] = f13;
        fArr[5] = f14;
        fArr[6] = f15;
        fArr[7] = f16;
        fArr[8] = f17;
    }

    public static final void r(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f9;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }

    public static final BlendMode s(int i7) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i7 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i7 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i7 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i7 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i7 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i7 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i7 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i7 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i7 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i7 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i7 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i7 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i7 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i7 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i7 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i7 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i7 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i7 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i7 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i7 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i7 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i7 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i7 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i7 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i7 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i7 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i7 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i7 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i7 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect t(m2.i iVar) {
        return new Rect(iVar.f6317a, iVar.f6318b, iVar.f6319c, iVar.f6320d);
    }

    public static final Rect u(y0.d dVar) {
        return new Rect((int) dVar.f9780a, (int) dVar.f9781b, (int) dVar.f9782c, (int) dVar.f9783d);
    }

    public static final RectF v(y0.d dVar) {
        return new RectF(dVar.f9780a, dVar.f9781b, dVar.f9782c, dVar.f9783d);
    }

    public static final int w(long j8) {
        float[] fArr = a1.d.f218a;
        return (int) (u.a(j8, a1.d.f220c) >>> 32);
    }

    public static final Bitmap.Config x(int i7) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i7 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i7 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i7 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 && i7 == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i8 < 26 || i7 != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final y0.d y(RectF rectF) {
        return new y0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode z(int i7) {
        return i7 == 0 ? PorterDuff.Mode.CLEAR : i7 == 1 ? PorterDuff.Mode.SRC : i7 == 2 ? PorterDuff.Mode.DST : i7 == 3 ? PorterDuff.Mode.SRC_OVER : i7 == 4 ? PorterDuff.Mode.DST_OVER : i7 == 5 ? PorterDuff.Mode.SRC_IN : i7 == 6 ? PorterDuff.Mode.DST_IN : i7 == 7 ? PorterDuff.Mode.SRC_OUT : i7 == 8 ? PorterDuff.Mode.DST_OUT : i7 == 9 ? PorterDuff.Mode.SRC_ATOP : i7 == 10 ? PorterDuff.Mode.DST_ATOP : i7 == 11 ? PorterDuff.Mode.XOR : i7 == 12 ? PorterDuff.Mode.ADD : i7 == 14 ? PorterDuff.Mode.SCREEN : i7 == 15 ? PorterDuff.Mode.OVERLAY : i7 == 16 ? PorterDuff.Mode.DARKEN : i7 == 17 ? PorterDuff.Mode.LIGHTEN : i7 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
