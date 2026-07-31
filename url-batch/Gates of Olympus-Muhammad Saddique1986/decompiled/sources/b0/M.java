package b0;

import a.AbstractC0235a;
import a0.AbstractC0236a;
import a0.C0239d;
import a0.C0240e;
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
import c0.AbstractC0356b;
import c0.AbstractC0357c;
import c0.C0358d;
import c0.C0366l;
import c0.C0367m;
import c0.C0371q;
import d0.C0406g;
import d0.InterfaceC0403d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final A1.i f5355a = new A1.i(21, false);

    /* renamed from: b, reason: collision with root package name */
    public static Method f5356b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f5357c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5358d;

    public static final Rect A(O0.i iVar) {
        return new Rect(iVar.f3736a, iVar.f3737b, iVar.f3738c, iVar.f3739d);
    }

    public static final Rect B(C0239d c0239d) {
        return new Rect((int) c0239d.f4724a, (int) c0239d.f4725b, (int) c0239d.f4726c, (int) c0239d.f4727d);
    }

    public static final RectF C(C0239d c0239d) {
        return new RectF(c0239d.f4724a, c0239d.f4725b, c0239d.f4726c, c0239d.f4727d);
    }

    public static final int D(long j3) {
        float[] fArr = C0358d.f5474a;
        return (int) (C0352v.a(j3, C0358d.f5476c) >>> 32);
    }

    public static final Bitmap.Config E(int i3) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (F.a(i3, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (F.a(i3, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (F.a(i3, 2)) {
            return Bitmap.Config.RGB_565;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && F.a(i3, 3)) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i4 < 26 || !F.a(i3, 4)) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final C0239d F(RectF rectF) {
        return new C0239d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode G(int i3) {
        return p(i3, 0) ? PorterDuff.Mode.CLEAR : p(i3, 1) ? PorterDuff.Mode.SRC : p(i3, 2) ? PorterDuff.Mode.DST : p(i3, 3) ? PorterDuff.Mode.SRC_OVER : p(i3, 4) ? PorterDuff.Mode.DST_OVER : p(i3, 5) ? PorterDuff.Mode.SRC_IN : p(i3, 6) ? PorterDuff.Mode.DST_IN : p(i3, 7) ? PorterDuff.Mode.SRC_OUT : p(i3, 8) ? PorterDuff.Mode.DST_OUT : p(i3, 9) ? PorterDuff.Mode.SRC_ATOP : p(i3, 10) ? PorterDuff.Mode.DST_ATOP : p(i3, 11) ? PorterDuff.Mode.XOR : p(i3, 12) ? PorterDuff.Mode.ADD : p(i3, 14) ? PorterDuff.Mode.SCREEN : p(i3, 15) ? PorterDuff.Mode.OVERLAY : p(i3, 16) ? PorterDuff.Mode.DARKEN : p(i3, 17) ? PorterDuff.Mode.LIGHTEN : p(i3, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

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
    public static final int H(float f3, float[] fArr, int i3) {
        float f4 = 0.0f;
        if (f3 >= 0.0f) {
            f4 = 1.0f;
            if (f3 > 1.0f) {
            }
        }
        fArr[i3] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    public static final C0334c a(C0338g c0338g) {
        Canvas canvas = AbstractC0335d.f5408a;
        C0334c c0334c = new C0334c();
        c0334c.f5405a = new Canvas(l(c0338g));
        return c0334c;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f3, float f4, float f5, float f6, AbstractC0357c abstractC0357c) {
        int i3;
        int i4;
        int i5;
        float b3;
        float a3;
        int i6;
        int i7;
        int i8;
        int i9;
        float b4;
        float a4;
        int i10;
        int i11;
        int i12;
        int i13 = 31;
        if (abstractC0357c.c()) {
            float f7 = f6 < 0.0f ? 0.0f : f6;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i14 = ((int) ((f7 * 255.0f) + 0.5f)) << 24;
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i15 = i14 | (((int) ((f8 * 255.0f) + 0.5f)) << 16);
            float f9 = f4 < 0.0f ? 0.0f : f4;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i16 = i15 | (((int) ((f9 * 255.0f) + 0.5f)) << 8);
            long j3 = (i16 | ((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r8 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i17 = C0352v.f5440h;
            return j3;
        }
        int i18 = AbstractC0356b.f5470e;
        if (((int) (abstractC0357c.f5472b >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i19 = abstractC0357c.f5473c;
        if (i19 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float b5 = abstractC0357c.b(0);
        float a5 = abstractC0357c.a(0);
        if (f3 >= b5) {
            b5 = f3;
        }
        if (b5 <= a5) {
            a5 = b5;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a5);
        int i20 = floatToRawIntBits >>> 31;
        int i21 = (floatToRawIntBits >>> 23) & 255;
        int i22 = floatToRawIntBits & 8388607;
        if (i21 == 255) {
            i4 = i22 != 0 ? 512 : 0;
            i3 = 31;
        } else {
            i3 = i21 - 112;
            if (i3 >= 31) {
                i3 = 49;
                i4 = 0;
            } else if (i3 <= 0) {
                if (i3 >= -10) {
                    int i23 = (i22 | 8388608) >> (1 - i3);
                    if ((i23 & 4096) != 0) {
                        i23 += 8192;
                    }
                    i4 = i23 >> 13;
                } else {
                    i4 = 0;
                }
                i3 = 0;
            } else {
                int i24 = i22 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i5 = (((i3 << 10) | i24) + 1) | (i20 << 15);
                    short s3 = (short) i5;
                    b3 = abstractC0357c.b(1);
                    a3 = abstractC0357c.a(1);
                    if (f4 >= b3) {
                        b3 = f4;
                    }
                    if (b3 <= a3) {
                        a3 = b3;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a3);
                    int i25 = floatToRawIntBits2 >>> 31;
                    i6 = (floatToRawIntBits2 >>> 23) & 255;
                    int i26 = floatToRawIntBits2 & 8388607;
                    if (i6 != 255) {
                        i8 = i26 != 0 ? 512 : 0;
                        i7 = 31;
                    } else {
                        i7 = i6 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i8 = 0;
                        } else if (i7 <= 0) {
                            if (i7 >= -10) {
                                int i27 = (i26 | 8388608) >> (1 - i7);
                                if ((i27 & 4096) != 0) {
                                    i27 += 8192;
                                }
                                i8 = i27 >> 13;
                            } else {
                                i8 = 0;
                            }
                            i7 = 0;
                        } else {
                            int i28 = i26 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i9 = (((i7 << 10) | i28) + 1) | (i25 << 15);
                                short s4 = (short) i9;
                                b4 = abstractC0357c.b(2);
                                a4 = abstractC0357c.a(2);
                                if (f5 >= b4) {
                                    b4 = f5;
                                }
                                if (b4 <= a4) {
                                    a4 = b4;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a4);
                                int i29 = floatToRawIntBits3 >>> 31;
                                i10 = (floatToRawIntBits3 >>> 23) & 255;
                                int i30 = 8388607 & floatToRawIntBits3;
                                if (i10 == 255) {
                                    if (i30 != 0) {
                                        i11 = 512;
                                        i12 = (i29 << 15) | (i13 << 10) | i11;
                                        short s5 = (short) i12;
                                        long j4 = ((((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s4 & 65535) << 32) | ((s5 & 65535) << 16) | (i19 & 63);
                                        int i31 = C0352v.f5440h;
                                        return j4;
                                    }
                                    i11 = 0;
                                    i12 = (i29 << 15) | (i13 << 10) | i11;
                                    short s52 = (short) i12;
                                    if (f6 >= 0.0f) {
                                    }
                                    long j42 = ((((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s4 & 65535) << 32) | ((s52 & 65535) << 16) | (i19 & 63);
                                    int i312 = C0352v.f5440h;
                                    return j42;
                                }
                                int i32 = i10 - 112;
                                if (i32 < 31) {
                                    if (i32 > 0) {
                                        i11 = i30 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i12 = (((i32 << 10) | i11) + 1) | (i29 << 15);
                                            short s522 = (short) i12;
                                            if (f6 >= 0.0f) {
                                            }
                                            long j422 = ((((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s4 & 65535) << 32) | ((s522 & 65535) << 16) | (i19 & 63);
                                            int i3122 = C0352v.f5440h;
                                            return j422;
                                        }
                                        i13 = i32;
                                    } else if (i32 >= -10) {
                                        int i33 = (i30 | 8388608) >> (1 - i32);
                                        if ((i33 & 4096) != 0) {
                                            i33 += 8192;
                                        }
                                        i11 = i33 >> 13;
                                        i13 = 0;
                                    } else {
                                        i13 = 0;
                                    }
                                    i12 = (i29 << 15) | (i13 << 10) | i11;
                                    short s5222 = (short) i12;
                                    if (f6 >= 0.0f) {
                                    }
                                    long j4222 = ((((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s4 & 65535) << 32) | ((s5222 & 65535) << 16) | (i19 & 63);
                                    int i31222 = C0352v.f5440h;
                                    return j4222;
                                }
                                i13 = 49;
                                i11 = 0;
                                i12 = (i29 << 15) | (i13 << 10) | i11;
                                short s52222 = (short) i12;
                                if (f6 >= 0.0f) {
                                }
                                long j42222 = ((((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s4 & 65535) << 32) | ((s52222 & 65535) << 16) | (i19 & 63);
                                int i312222 = C0352v.f5440h;
                                return j42222;
                            }
                            i8 = i28;
                        }
                    }
                    i9 = i8 | (i25 << 15) | (i7 << 10);
                    short s42 = (short) i9;
                    b4 = abstractC0357c.b(2);
                    a4 = abstractC0357c.a(2);
                    if (f5 >= b4) {
                    }
                    if (b4 <= a4) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a4);
                    int i292 = floatToRawIntBits32 >>> 31;
                    i10 = (floatToRawIntBits32 >>> 23) & 255;
                    int i302 = 8388607 & floatToRawIntBits32;
                    if (i10 == 255) {
                    }
                } else {
                    i4 = i24;
                }
            }
        }
        i5 = i4 | (i20 << 15) | (i3 << 10);
        short s32 = (short) i5;
        b3 = abstractC0357c.b(1);
        a3 = abstractC0357c.a(1);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a3);
        int i252 = floatToRawIntBits22 >>> 31;
        i6 = (floatToRawIntBits22 >>> 23) & 255;
        int i262 = floatToRawIntBits22 & 8388607;
        if (i6 != 255) {
        }
        i9 = i8 | (i252 << 15) | (i7 << 10);
        short s422 = (short) i9;
        b4 = abstractC0357c.b(2);
        a4 = abstractC0357c.a(2);
        if (f5 >= b4) {
        }
        if (b4 <= a4) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a4);
        int i2922 = floatToRawIntBits322 >>> 31;
        i10 = (floatToRawIntBits322 >>> 23) & 255;
        int i3022 = 8388607 & floatToRawIntBits322;
        if (i10 == 255) {
        }
    }

    public static final long c(int i3) {
        long j3 = i3 << 32;
        int i4 = C0352v.f5440h;
        return j3;
    }

    public static final long d(long j3) {
        long j4 = j3 << 32;
        int i3 = C0352v.f5440h;
        return j4;
    }

    public static long e(int i3, int i4, int i5) {
        return c(((i3 & 255) << 16) | (-16777216) | ((i4 & 255) << 8) | (i5 & 255));
    }

    public static C0338g f(int i3, int i4, int i5) {
        Bitmap createBitmap;
        C0371q c0371q = C0358d.f5476c;
        Bitmap.Config E3 = E(i5);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = AbstractC0343l.b(i3, i4, i5, true, c0371q);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i3, i4, E3);
            createBitmap.setHasAlpha(true);
        }
        return new C0338g(createBitmap);
    }

    public static final C0339h g() {
        return new C0339h(new Paint(7));
    }

    public static final C0341j h() {
        return new C0341j(new Path());
    }

    public static final long i(float f3, float f4) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        int i3 = U.f5401c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(float f3, float f4, float f5, float f6, AbstractC0357c abstractC0357c) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 31;
        if (abstractC0357c.c()) {
            long j3 = ((((((int) ((f6 * 255.0f) + 0.5f)) << 24) | (((int) ((f3 * 255.0f) + 0.5f)) << 16)) | (((int) ((f4 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f5) + 0.5f))) << 32;
            int i13 = C0352v.f5440h;
            return j3;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f3);
        int i14 = floatToRawIntBits >>> 31;
        int i15 = (floatToRawIntBits >>> 23) & 255;
        int i16 = floatToRawIntBits & 8388607;
        int i17 = 0;
        if (i15 == 255) {
            i4 = i16 != 0 ? 512 : 0;
            i3 = 31;
        } else {
            i3 = i15 - 112;
            if (i3 >= 31) {
                i4 = 0;
                i3 = 49;
            } else if (i3 > 0) {
                int i18 = i16 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i5 = (((i3 << 10) | i18) + 1) | (i14 << 15);
                    short s3 = (short) i5;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f4);
                    int i19 = floatToRawIntBits2 >>> 31;
                    i6 = (floatToRawIntBits2 >>> 23) & 255;
                    int i20 = floatToRawIntBits2 & 8388607;
                    if (i6 != 255) {
                        i8 = i20 != 0 ? 512 : 0;
                        i7 = 31;
                    } else {
                        i7 = i6 - 112;
                        if (i7 >= 31) {
                            i8 = 0;
                            i7 = 49;
                        } else if (i7 > 0) {
                            int i21 = i20 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i9 = (((i7 << 10) | i21) + 1) | (i19 << 15);
                                short s4 = (short) i9;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f5);
                                int i22 = floatToRawIntBits3 >>> 31;
                                i10 = (floatToRawIntBits3 >>> 23) & 255;
                                int i23 = 8388607 & floatToRawIntBits3;
                                if (i10 == 255) {
                                    i17 = i23 == 0 ? 0 : 512;
                                } else {
                                    int i24 = i10 - 112;
                                    if (i24 >= 31) {
                                        i12 = 49;
                                    } else if (i24 > 0) {
                                        i17 = i23 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i24 << 10) | i17) + 1) | (i22 << 15);
                                            long max = ((s4 & 65535) << 32) | ((s3 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0357c.f5473c & 63);
                                            int i25 = C0352v.f5440h;
                                            return max;
                                        }
                                        i12 = i24;
                                    } else if (i24 >= -10) {
                                        int i26 = (i23 | 8388608) >> (1 - i24);
                                        if ((i26 & 4096) != 0) {
                                            i26 += 8192;
                                        }
                                        i17 = i26 >> 13;
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                }
                                i11 = (i12 << 10) | (i22 << 15) | i17;
                                long max2 = ((s4 & 65535) << 32) | ((s3 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0357c.f5473c & 63);
                                int i252 = C0352v.f5440h;
                                return max2;
                            }
                            i8 = i21;
                        } else if (i7 >= -10) {
                            int i27 = (i20 | 8388608) >> (1 - i7);
                            if ((i27 & 4096) != 0) {
                                i27 += 8192;
                            }
                            i8 = i27 >> 13;
                            i7 = 0;
                        } else {
                            i8 = 0;
                            i7 = 0;
                        }
                    }
                    i9 = i8 | (i19 << 15) | (i7 << 10);
                    short s42 = (short) i9;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f5);
                    int i222 = floatToRawIntBits32 >>> 31;
                    i10 = (floatToRawIntBits32 >>> 23) & 255;
                    int i232 = 8388607 & floatToRawIntBits32;
                    if (i10 == 255) {
                    }
                    i11 = (i12 << 10) | (i222 << 15) | i17;
                    long max22 = ((s42 & 65535) << 32) | ((s3 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0357c.f5473c & 63);
                    int i2522 = C0352v.f5440h;
                    return max22;
                }
                i4 = i18;
            } else if (i3 >= -10) {
                int i28 = (i16 | 8388608) >> (1 - i3);
                if ((i28 & 4096) != 0) {
                    i28 += 8192;
                }
                i4 = i28 >> 13;
                i3 = 0;
            } else {
                i4 = 0;
                i3 = 0;
            }
        }
        i5 = i4 | (i14 << 15) | (i3 << 10);
        short s32 = (short) i5;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f4);
        int i192 = floatToRawIntBits22 >>> 31;
        i6 = (floatToRawIntBits22 >>> 23) & 255;
        int i202 = floatToRawIntBits22 & 8388607;
        if (i6 != 255) {
        }
        i9 = i8 | (i192 << 15) | (i7 << 10);
        short s422 = (short) i9;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f5);
        int i2222 = floatToRawIntBits322 >>> 31;
        i10 = (floatToRawIntBits322 >>> 23) & 255;
        int i2322 = 8388607 & floatToRawIntBits322;
        if (i10 == 255) {
        }
        i11 = (i12 << 10) | (i2222 << 15) | i17;
        long max222 = ((s422 & 65535) << 32) | ((s32 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0357c.f5473c & 63);
        int i25222 = C0352v.f5440h;
        return max222;
    }

    public static final float k(float[] fArr, int i3, float[] fArr2, int i4) {
        int i5 = i3 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    public static final Bitmap l(C0338g c0338g) {
        if (c0338g instanceof C0338g) {
            return c0338g.f5413a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long m(long j3, long j4) {
        float f3;
        float f4;
        long a3 = C0352v.a(j3, C0352v.f(j4));
        float d3 = C0352v.d(j4);
        float d4 = C0352v.d(a3);
        float f5 = 1.0f - d4;
        float f6 = (d3 * f5) + d4;
        float h3 = C0352v.h(a3);
        float h4 = C0352v.h(j4);
        float f7 = 0.0f;
        if (f6 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((h4 * d3) * f5) + (h3 * d4)) / f6;
        }
        float g3 = C0352v.g(a3);
        float g4 = C0352v.g(j4);
        if (f6 == 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = (((g4 * d3) * f5) + (g3 * d4)) / f6;
        }
        float e3 = C0352v.e(a3);
        float e4 = C0352v.e(j4);
        if (f6 != 0.0f) {
            f7 = (((e4 * d3) * f5) + (e3 * d4)) / f6;
        }
        return j(f3, f4, f7, f6, C0352v.f(j4));
    }

    public static void n(InterfaceC0403d interfaceC0403d, K k3, long j3) {
        C0341j c0341j;
        C0406g c0406g = C0406g.f5653a;
        if (k3 instanceof I) {
            C0239d c0239d = ((I) k3).f5352a;
            interfaceC0403d.F(j3, l0.c.e(c0239d.f4724a, c0239d.f4725b), AbstractC0235a.e(c0239d.c(), c0239d.b()), 1.0f, c0406g, null, 3);
            return;
        }
        if (k3 instanceof J) {
            J j4 = (J) k3;
            c0341j = j4.f5354b;
            if (c0341j == null) {
                C0240e c0240e = j4.f5353a;
                float b3 = AbstractC0236a.b(c0240e.f4735h);
                interfaceC0403d.A(j3, l0.c.e(c0240e.f4728a, c0240e.f4729b), AbstractC0235a.e(c0240e.b(), c0240e.a()), AbstractC0235a.b(b3, b3), c0406g, 1.0f, null, 3);
                return;
            }
        } else {
            if (!(k3 instanceof H)) {
                throw new C1.c();
            }
            c0341j = ((H) k3).f5351a;
        }
        interfaceC0403d.X(c0341j, j3, 1.0f, c0406g, null, 3);
    }

    public static void o(Canvas canvas, boolean z3) {
        Method method;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            C0351u.f5433a.a(canvas, z3);
            return;
        }
        if (!f5358d) {
            try {
                if (i3 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f5356b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f5357c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f5356b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f5357c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f5356b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f5357c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f5358d = true;
        }
        if (z3) {
            try {
                Method method4 = f5356b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z3 || (method = f5357c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean p(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean q(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean r(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean s(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean t(int i3, int i4) {
        return i3 == i4;
    }

    public static long u() {
        return C0352v.f5434b;
    }

    public static final long v(long j3, long j4, float f3) {
        C0366l c0366l = C0358d.f5493t;
        long a3 = C0352v.a(j3, c0366l);
        long a4 = C0352v.a(j4, c0366l);
        float d3 = C0352v.d(a3);
        float h3 = C0352v.h(a3);
        float g3 = C0352v.g(a3);
        float e3 = C0352v.e(a3);
        float d4 = C0352v.d(a4);
        float h4 = C0352v.h(a4);
        float g4 = C0352v.g(a4);
        float e4 = C0352v.e(a4);
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return C0352v.a(j(l0.c.G(h3, h4, f3), l0.c.G(g3, g4, f3), l0.c.G(e3, e4, f3), l0.c.G(d3, d4, f3), c0366l), C0352v.f(j4));
    }

    public static final float w(long j3) {
        AbstractC0357c f3 = C0352v.f(j3);
        if (!AbstractC0356b.a(f3.f5472b, AbstractC0356b.f5466a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC0356b.b(f3.f5472b)));
        }
        double h3 = C0352v.h(j3);
        C0367m c0367m = ((C0371q) f3).f5534p;
        double b3 = c0367m.b(h3);
        float b4 = (float) ((c0367m.b(C0352v.e(j3)) * 0.0722d) + (c0367m.b(C0352v.g(j3)) * 0.7152d) + (b3 * 0.2126d));
        if (b4 < 0.0f) {
            b4 = 0.0f;
        }
        if (b4 > 1.0f) {
            return 1.0f;
        }
        return b4;
    }

    public static final void x(Matrix matrix, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        float f12 = fArr[12];
        float f13 = fArr[13];
        float f14 = fArr[15];
        fArr[0] = f3;
        fArr[1] = f7;
        fArr[2] = f12;
        fArr[3] = f4;
        fArr[4] = f8;
        fArr[5] = f13;
        fArr[6] = f6;
        fArr[7] = f10;
        fArr[8] = f14;
        matrix.setValues(fArr);
        fArr[0] = f3;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[3] = f6;
        fArr[4] = f7;
        fArr[5] = f8;
        fArr[6] = f9;
        fArr[7] = f10;
        fArr[8] = f11;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        fArr[0] = f3;
        fArr[1] = f6;
        fArr[2] = 0.0f;
        fArr[3] = f9;
        fArr[4] = f4;
        fArr[5] = f7;
        fArr[6] = 0.0f;
        fArr[7] = f10;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f5;
        fArr[13] = f8;
        fArr[14] = 0.0f;
        fArr[15] = f11;
    }

    public static final BlendMode z(int i3) {
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
        if (p(i3, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (p(i3, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (p(i3, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (p(i3, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (p(i3, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (p(i3, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (p(i3, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (p(i3, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (p(i3, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (p(i3, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (p(i3, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (p(i3, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (p(i3, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (p(i3, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (p(i3, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (p(i3, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (p(i3, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (p(i3, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (p(i3, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (p(i3, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (p(i3, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (p(i3, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (p(i3, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (p(i3, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (p(i3, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (p(i3, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (p(i3, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (p(i3, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (p(i3, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }
}
