package f1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f2693a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static Method f2694b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2695c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f2696d;

    public static final int A(float f6, float[] fArr, int i) {
        float f8 = f6 >= 0.0f ? f6 : 0.0f;
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (Math.abs(f8 - f6) > 1.05E-6f) {
            f8 = Float.NaN;
        }
        fArr[i] = f8;
        return !Float.isNaN(f8) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f6, float f8, float f9, float f10, g1.c cVar) {
        int i;
        int i8;
        int i9;
        float b8;
        float a8;
        int i10;
        int i11;
        int i12;
        int i13;
        float b9;
        float a9;
        int i14;
        int i15;
        int i16;
        if (cVar.c()) {
            float f11 = f10 < 0.0f ? 0.0f : f10;
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            int i17 = ((int) ((f11 * 255.0f) + 0.5f)) << 24;
            float f12 = f6 < 0.0f ? 0.0f : f6;
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
            int i18 = i17 | (((int) ((f12 * 255.0f) + 0.5f)) << 16);
            float f13 = f8 < 0.0f ? 0.0f : f8;
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i19 = i18 | (((int) ((f13 * 255.0f) + 0.5f)) << 8);
            long j7 = (i19 | ((int) ((((f9 >= 0.0f ? f9 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i20 = s.i;
            return j7;
        }
        long j8 = cVar.f2819b;
        int i21 = g1.b.f2817e;
        if (((int) (j8 >> 32)) != 3) {
            a0.a("Color only works with ColorSpaces with 3 components");
        }
        int i22 = cVar.f2820c;
        if (i22 == -1) {
            a0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b10 = cVar.b(0);
        float a10 = cVar.a(0);
        if (f6 >= b10) {
            b10 = f6;
        }
        if (b10 <= a10) {
            a10 = b10;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a10);
        int i23 = floatToRawIntBits >>> 31;
        int i24 = (floatToRawIntBits >>> 23) & 255;
        int i25 = floatToRawIntBits & 8388607;
        if (i24 == 255) {
            i8 = i25 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i24 - 112;
            if (i >= 31) {
                i8 = 0;
                i = 49;
            } else if (i > 0) {
                int i26 = i25 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i9 = (((i << 10) | i26) + 1) | (i23 << 15);
                    short s5 = (short) i9;
                    b8 = cVar.b(1);
                    a8 = cVar.a(1);
                    if (f8 >= b8) {
                        b8 = f8;
                    }
                    if (b8 <= a8) {
                        a8 = b8;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a8);
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
                                short s7 = (short) i13;
                                b9 = cVar.b(2);
                                a9 = cVar.a(2);
                                if (f9 >= b9) {
                                    b9 = f9;
                                }
                                if (b9 <= a9) {
                                    a9 = b9;
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
                                            long j9 = (i22 & 63) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f10 >= 0.0f ? f10 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i34 = s.i;
                                            return j9;
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
                                if (f10 >= 0.0f) {
                                }
                                long j92 = (i22 & 63) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f10 >= 0.0f ? f10 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i342 = s.i;
                                return j92;
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
                    short s72 = (short) i13;
                    b9 = cVar.b(2);
                    a9 = cVar.a(2);
                    if (f9 >= b9) {
                    }
                    if (b9 <= a9) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a9);
                    int i302 = floatToRawIntBits32 >>> 31;
                    i14 = (floatToRawIntBits32 >>> 23) & 255;
                    int i312 = 8388607 & floatToRawIntBits32;
                    if (i14 == 255) {
                    }
                    i16 = i15 | (i302 << 15) | (r7 << 10);
                    if (f10 >= 0.0f) {
                    }
                    long j922 = (i22 & 63) | ((s5 & 65535) << 48) | ((s72 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f10 >= 0.0f ? f10 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i3422 = s.i;
                    return j922;
                }
                i8 = i26;
            } else if (i >= -10) {
                int i37 = (i25 | 8388608) >> (1 - i);
                if ((i37 & 4096) != 0) {
                    i37 += 8192;
                }
                i8 = i37 >> 13;
                i = 0;
            } else {
                i8 = 0;
                i = 0;
            }
        }
        i9 = i8 | (i23 << 15) | (i << 10);
        short s52 = (short) i9;
        b8 = cVar.b(1);
        a8 = cVar.a(1);
        if (f8 >= b8) {
        }
        if (b8 <= a8) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a8);
        int i272 = floatToRawIntBits22 >>> 31;
        i10 = (floatToRawIntBits22 >>> 23) & 255;
        int i282 = floatToRawIntBits22 & 8388607;
        if (i10 != 255) {
        }
        i13 = i12 | (i272 << 15) | (i11 << 10);
        short s722 = (short) i13;
        b9 = cVar.b(2);
        a9 = cVar.a(2);
        if (f9 >= b9) {
        }
        if (b9 <= a9) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a9);
        int i3022 = floatToRawIntBits322 >>> 31;
        i14 = (floatToRawIntBits322 >>> 23) & 255;
        int i3122 = 8388607 & floatToRawIntBits322;
        if (i14 == 255) {
        }
        i16 = i15 | (i3022 << 15) | (r7 << 10);
        if (f10 >= 0.0f) {
        }
        long j9222 = (i22 & 63) | ((s52 & 65535) << 48) | ((s722 & 65535) << 32) | ((65535 & ((short) i16)) << 16) | ((((int) ((((f10 >= 0.0f ? f10 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i34222 = s.i;
        return j9222;
    }

    public static final long b(int i) {
        long j7 = i << 32;
        int i8 = s.i;
        return j7;
    }

    public static final long c(long j7) {
        long j8 = j7 << 32;
        int i = s.i;
        return j8;
    }

    public static long d(int i, int i8, int i9) {
        return b(((i & 255) << 16) | (-16777216) | ((i8 & 255) << 8) | (i9 & 255));
    }

    public static g e(int i, int i8, int i9) {
        Bitmap createBitmap;
        g1.q qVar = g1.d.f2825e;
        Bitmap.Config v7 = v(i9);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i8, v(i9), true, u.a(qVar));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i8, v7);
            createBitmap.setHasAlpha(true);
        }
        return new g(createBitmap);
    }

    public static final h f() {
        return new h(new Paint(7));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(long j7, long j8) {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long a8 = s.a(j7, s.f(j8));
        float d8 = s.d(j8);
        float d9 = s.d(a8);
        float f6 = 1.0f - d9;
        float f8 = (d8 * f6) + d9;
        float h8 = f8 == 0.0f ? 0.0f : (((s.h(j8) * d8) * f6) + (s.h(a8) * d9)) / f8;
        float g3 = f8 == 0.0f ? 0.0f : (((s.g(j8) * d8) * f6) + (s.g(a8) * d9)) / f8;
        float e8 = f8 == 0.0f ? 0.0f : (((s.e(j8) * d8) * f6) + (s.e(a8) * d9)) / f8;
        if (s.f(j8).c()) {
            return (((int) ((e8 * 255.0f) + 0.5f)) | (((((int) ((f8 * 255.0f) + 0.5f)) << 24) | (((int) ((h8 * 255.0f) + 0.5f)) << 16)) | (((int) ((g3 * 255.0f) + 0.5f)) << 8))) << 32;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(h8);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        int i19 = 49;
        int i20 = 0;
        if (i17 == 255) {
            i8 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i = 49;
                i8 = 0;
            } else if (i > 0) {
                int i21 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i9 = (((i << 10) | i21) + 1) | (i16 << 15);
                    short s5 = (short) i9;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(g3);
                    int i22 = floatToRawIntBits2 >>> 31;
                    i10 = (floatToRawIntBits2 >>> 23) & 255;
                    int i23 = floatToRawIntBits2 & 8388607;
                    if (i10 != 255) {
                        i12 = i23 != 0 ? 512 : 0;
                        i11 = 31;
                    } else {
                        i11 = i10 - 112;
                        if (i11 >= 31) {
                            i11 = 49;
                            i12 = 0;
                        } else if (i11 > 0) {
                            int i24 = i23 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i13 = (((i11 << 10) | i24) + 1) | (i22 << 15);
                                short s7 = (short) i13;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(e8);
                                int i25 = floatToRawIntBits3 >>> 31;
                                i14 = (floatToRawIntBits3 >>> 23) & 255;
                                int i26 = 8388607 & floatToRawIntBits3;
                                if (i14 == 255) {
                                    i19 = 31;
                                    i20 = i26 == 0 ? 0 : 512;
                                } else {
                                    int i27 = i14 - 112;
                                    if (i27 < 31) {
                                        if (i27 > 0) {
                                            i20 = i26 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i15 = (((i27 << 10) | i20) + 1) | (i25 << 15);
                                                return ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f8, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2820c & 63);
                                            }
                                            i19 = i27;
                                        } else if (i27 >= -10) {
                                            int i28 = (i26 | 8388608) >> (1 - i27);
                                            if ((i28 & 4096) != 0) {
                                                i28 += 8192;
                                            }
                                            i19 = 0;
                                            i20 = i28 >> 13;
                                        } else {
                                            i19 = 0;
                                        }
                                    }
                                }
                                i15 = (i25 << 15) | (i19 << 10) | i20;
                                return ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s7 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f8, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2820c & 63);
                            }
                            i12 = i24;
                        } else if (i11 >= -10) {
                            int i29 = (i23 | 8388608) >> (1 - i11);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i12 = i29 >> 13;
                            i11 = 0;
                        } else {
                            i12 = 0;
                            i11 = 0;
                        }
                    }
                    i13 = i12 | (i22 << 15) | (i11 << 10);
                    short s72 = (short) i13;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(e8);
                    int i252 = floatToRawIntBits32 >>> 31;
                    i14 = (floatToRawIntBits32 >>> 23) & 255;
                    int i262 = 8388607 & floatToRawIntBits32;
                    if (i14 == 255) {
                    }
                    i15 = (i252 << 15) | (i19 << 10) | i20;
                    return ((((short) i15) & 65535) << 16) | ((s5 & 65535) << 48) | ((s72 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f8, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2820c & 63);
                }
                i8 = i21;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i8 = i30 >> 13;
                i = 0;
            } else {
                i8 = 0;
                i = 0;
            }
        }
        i9 = i8 | (i16 << 15) | (i << 10);
        short s52 = (short) i9;
        int floatToRawIntBits22 = Float.floatToRawIntBits(g3);
        int i222 = floatToRawIntBits22 >>> 31;
        i10 = (floatToRawIntBits22 >>> 23) & 255;
        int i232 = floatToRawIntBits22 & 8388607;
        if (i10 != 255) {
        }
        i13 = i12 | (i222 << 15) | (i11 << 10);
        short s722 = (short) i13;
        int floatToRawIntBits322 = Float.floatToRawIntBits(e8);
        int i2522 = floatToRawIntBits322 >>> 31;
        i14 = (floatToRawIntBits322 >>> 23) & 255;
        int i2622 = 8388607 & floatToRawIntBits322;
        if (i14 == 255) {
        }
        i15 = (i2522 << 15) | (i19 << 10) | i20;
        return ((((short) i15) & 65535) << 16) | ((s52 & 65535) << 48) | ((s722 & 65535) << 32) | ((((int) ((Math.max(0.0f, Math.min(f8, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (r0.f2820c & 63);
    }

    public static float[] i() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void j(Canvas canvas, boolean z3) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z3) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f2696d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f2694b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f2695c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f2694b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f2695c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f2694b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f2695c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f2696d = true;
        }
        if (z3) {
            try {
                Method method4 = f2694b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z3 || (method = f2695c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean l(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long m(float[] fArr, long j7) {
        if (fArr.length < 16) {
            return j7;
        }
        float f6 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[7];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float f16 = 1 / (((f12 * intBitsToFloat2) + (f9 * intBitsToFloat)) + f15);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = ((f11 * intBitsToFloat2) + (f8 * intBitsToFloat) + f14) * f16;
        return (Float.floatToRawIntBits((((f10 * intBitsToFloat2) + (f6 * intBitsToFloat)) + f13) * f16) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L);
    }

    public static final void n(float[] fArr, e1.a aVar) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[7];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[15];
        float f16 = aVar.f2451a;
        float f17 = aVar.f2452b;
        float f18 = aVar.f2453c;
        float f19 = aVar.f2454d;
        float f20 = f9 * f16;
        float f21 = f12 * f17;
        float f22 = 1.0f / ((f20 + f21) + f15);
        if ((Float.floatToRawIntBits(f22) & Integer.MAX_VALUE) >= 2139095040) {
            f22 = 0.0f;
        }
        float f23 = f6 * f16;
        float f24 = f10 * f17;
        float f25 = (f23 + f24 + f13) * f22;
        float f26 = f16 * f8;
        float f27 = f17 * f11;
        float f28 = (f26 + f27 + f14) * f22;
        float f29 = f12 * f19;
        float f30 = 1.0f / ((f20 + f29) + f15);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f10 * f19;
        float f32 = (f23 + f31 + f13) * f30;
        float f33 = f11 * f19;
        float f34 = (f26 + f33 + f14) * f30;
        float f35 = f9 * f18;
        float f36 = 1.0f / ((f21 + f35) + f15);
        if ((Float.floatToRawIntBits(f36) & Integer.MAX_VALUE) >= 2139095040) {
            f36 = 0.0f;
        }
        float f37 = f6 * f18;
        float f38 = (f37 + f24 + f13) * f36;
        float f39 = f18 * f8;
        float f40 = (f27 + f39 + f14) * f36;
        float f41 = 1.0f / ((f35 + f29) + f15);
        float f42 = (Float.floatToRawIntBits(f41) & Integer.MAX_VALUE) < 2139095040 ? f41 : 0.0f;
        float f43 = (f37 + f31 + f13) * f42;
        float f44 = (f39 + f33 + f14) * f42;
        aVar.f2451a = Math.min(f25, Math.min(f32, Math.min(f38, f43)));
        aVar.f2452b = Math.min(f28, Math.min(f34, Math.min(f40, f44)));
        aVar.f2453c = Math.max(f25, Math.max(f32, Math.max(f38, f43)));
        aVar.f2454d = Math.max(f28, Math.max(f34, Math.max(f40, f44)));
    }

    public static final void o(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void p(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f6 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2];
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        float f15 = fArr[8];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = 0.0f;
        fArr[3] = f13;
        fArr[4] = f8;
        fArr[5] = f11;
        fArr[6] = 0.0f;
        fArr[7] = f14;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f9;
        fArr[13] = f12;
        fArr[14] = 0.0f;
        fArr[15] = f15;
    }

    public static final long q(e1.c cVar) {
        float f6 = cVar.f2459c - cVar.f2457a;
        float f8 = cVar.f2460d - cVar.f2458b;
        return (Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final BlendMode r(int i) {
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
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect s(e1.c cVar) {
        return new Rect((int) cVar.f2457a, (int) cVar.f2458b, (int) cVar.f2459c, (int) cVar.f2460d);
    }

    public static final Rect t(r2.j jVar) {
        return new Rect(jVar.f6524a, jVar.f6525b, jVar.f6526c, jVar.f6527d);
    }

    public static final int u(long j7) {
        float[] fArr = g1.d.f2821a;
        return (int) (s.a(j7, g1.d.f2825e) >>> 32);
    }

    public static final Bitmap.Config v(int i) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26 && i == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i8 < 26 || i != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final e1.c w(Rect rect) {
        return new e1.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final PorterDuff.Mode x(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String y(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static void z(float[] fArr, float f6, float f8) {
        if (fArr.length < 16) {
            return;
        }
        float f9 = (fArr[8] * 0.0f) + (fArr[4] * f8) + (fArr[0] * f6) + fArr[12];
        float f10 = (fArr[9] * 0.0f) + (fArr[5] * f8) + (fArr[1] * f6) + fArr[13];
        float f11 = (fArr[10] * 0.0f) + (fArr[6] * f8) + (fArr[2] * f6) + fArr[14];
        float f12 = (fArr[11] * 0.0f) + (fArr[7] * f8) + (fArr[3] * f6) + fArr[15];
        fArr[12] = f9;
        fArr[13] = f10;
        fArr[14] = f11;
        fArr[15] = f12;
    }

    public abstract void g(float f6, long j7, h hVar);

    public abstract e1.c k();
}
