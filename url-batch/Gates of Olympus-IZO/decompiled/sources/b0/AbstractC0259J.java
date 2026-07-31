package b0;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import c0.AbstractC0299b;
import c0.AbstractC0300c;
import c0.C0301d;
import c0.C0310m;
import c0.C0314q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0259J {

    /* renamed from: a, reason: collision with root package name */
    public static final F0.a f4215a = new F0.a(20);

    /* renamed from: b, reason: collision with root package name */
    public static Method f4216b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f4217c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4218d;

    public static final void A(float[] fArr, float[] fArr2) {
        float i3 = i(fArr, 0, fArr2, 0);
        float i4 = i(fArr, 0, fArr2, 1);
        float i5 = i(fArr, 0, fArr2, 2);
        float i6 = i(fArr, 0, fArr2, 3);
        float i7 = i(fArr, 1, fArr2, 0);
        float i8 = i(fArr, 1, fArr2, 1);
        float i9 = i(fArr, 1, fArr2, 2);
        float i10 = i(fArr, 1, fArr2, 3);
        float i11 = i(fArr, 2, fArr2, 0);
        float i12 = i(fArr, 2, fArr2, 1);
        float i13 = i(fArr, 2, fArr2, 2);
        float i14 = i(fArr, 2, fArr2, 3);
        float i15 = i(fArr, 3, fArr2, 0);
        float i16 = i(fArr, 3, fArr2, 1);
        float i17 = i(fArr, 3, fArr2, 2);
        float i18 = i(fArr, 3, fArr2, 3);
        fArr[0] = i3;
        fArr[1] = i4;
        fArr[2] = i5;
        fArr[3] = i6;
        fArr[4] = i7;
        fArr[5] = i8;
        fArr[6] = i9;
        fArr[7] = i10;
        fArr[8] = i11;
        fArr[9] = i12;
        fArr[10] = i13;
        fArr[11] = i14;
        fArr[12] = i15;
        fArr[13] = i16;
        fArr[14] = i17;
        fArr[15] = i18;
    }

    public static final BlendMode B(int i3) {
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
        if (n(i3, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (n(i3, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (n(i3, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (n(i3, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (n(i3, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (n(i3, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (n(i3, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (n(i3, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (n(i3, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (n(i3, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (n(i3, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (n(i3, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (n(i3, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (n(i3, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (n(i3, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (n(i3, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (n(i3, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (n(i3, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (n(i3, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (n(i3, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (n(i3, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (n(i3, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (n(i3, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (n(i3, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (n(i3, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (n(i3, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (n(i3, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (n(i3, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (n(i3, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect C(M0.h hVar) {
        return new Rect(hVar.f2770a, hVar.f2771b, hVar.f2772c, hVar.f2773d);
    }

    public static final Rect D(a0.d dVar) {
        return new Rect((int) dVar.f3491a, (int) dVar.f3492b, (int) dVar.f3493c, (int) dVar.f3494d);
    }

    public static final int E(long j3) {
        float[] fArr = C0301d.f4349a;
        return (int) (C0288u.a(j3, C0301d.f4351c) >>> 32);
    }

    public static final Bitmap.Config F(int i3) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (C0253D.a(i3, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (C0253D.a(i3, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (C0253D.a(i3, 2)) {
            return Bitmap.Config.RGB_565;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && C0253D.a(i3, 3)) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i4 < 26 || !C0253D.a(i3, 4)) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final PorterDuff.Mode G(int i3) {
        return n(i3, 0) ? PorterDuff.Mode.CLEAR : n(i3, 1) ? PorterDuff.Mode.SRC : n(i3, 2) ? PorterDuff.Mode.DST : n(i3, 3) ? PorterDuff.Mode.SRC_OVER : n(i3, 4) ? PorterDuff.Mode.DST_OVER : n(i3, 5) ? PorterDuff.Mode.SRC_IN : n(i3, 6) ? PorterDuff.Mode.DST_IN : n(i3, 7) ? PorterDuff.Mode.SRC_OUT : n(i3, 8) ? PorterDuff.Mode.DST_OUT : n(i3, 9) ? PorterDuff.Mode.SRC_ATOP : n(i3, 10) ? PorterDuff.Mode.DST_ATOP : n(i3, 11) ? PorterDuff.Mode.XOR : n(i3, 12) ? PorterDuff.Mode.ADD : n(i3, 14) ? PorterDuff.Mode.SCREEN : n(i3, 15) ? PorterDuff.Mode.OVERLAY : n(i3, 16) ? PorterDuff.Mode.DARKEN : n(i3, 17) ? PorterDuff.Mode.LIGHTEN : n(i3, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static void H(float[] fArr, float f3, float f4) {
        float f5 = (fArr[8] * 0.0f) + (fArr[4] * f4) + (fArr[0] * f3) + fArr[12];
        float f6 = (fArr[9] * 0.0f) + (fArr[5] * f4) + (fArr[1] * f3) + fArr[13];
        float f7 = (fArr[10] * 0.0f) + (fArr[6] * f4) + (fArr[2] * f3) + fArr[14];
        float f8 = (fArr[11] * 0.0f) + (fArr[7] * f4) + (fArr[3] * f3) + fArr[15];
        fArr[12] = f5;
        fArr[13] = f6;
        fArr[14] = f7;
        fArr[15] = f8;
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
    public static final int I(float f3, float[] fArr, int i3) {
        float f4 = 0.0f;
        if (f3 >= 0.0f) {
            f4 = 1.0f;
            if (f3 > 1.0f) {
            }
        }
        fArr[i3] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
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
    public static final long a(float f3, float f4, float f5, float f6, AbstractC0300c abstractC0300c) {
        int i3;
        int i4;
        int i5;
        float b2;
        float a3;
        int i6;
        int i7;
        int i8;
        int i9;
        float b3;
        float a4;
        int i10;
        int i11;
        int i12;
        int i13 = 31;
        if (abstractC0300c.c()) {
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
            int i17 = C0288u.f4297g;
            return j3;
        }
        int i18 = AbstractC0299b.f4345e;
        if (((int) (abstractC0300c.f4347b >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i19 = abstractC0300c.f4348c;
        if (i19 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = abstractC0300c.b(0);
        float a5 = abstractC0300c.a(0);
        if (f3 >= b4) {
            b4 = f3;
        }
        if (b4 <= a5) {
            a5 = b4;
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
                    b2 = abstractC0300c.b(1);
                    a3 = abstractC0300c.a(1);
                    if (f4 >= b2) {
                        b2 = f4;
                    }
                    if (b2 <= a3) {
                        a3 = b2;
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
                                b3 = abstractC0300c.b(2);
                                a4 = abstractC0300c.a(2);
                                if (f5 >= b3) {
                                    b3 = f5;
                                }
                                if (b3 <= a4) {
                                    a4 = b3;
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
                                        int i31 = C0288u.f4297g;
                                        return j4;
                                    }
                                    i11 = 0;
                                    i12 = (i29 << 15) | (i13 << 10) | i11;
                                    short s52 = (short) i12;
                                    if (f6 >= 0.0f) {
                                    }
                                    long j42 = ((((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s4 & 65535) << 32) | ((s52 & 65535) << 16) | (i19 & 63);
                                    int i312 = C0288u.f4297g;
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
                                            int i3122 = C0288u.f4297g;
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
                                    int i31222 = C0288u.f4297g;
                                    return j4222;
                                }
                                i13 = 49;
                                i11 = 0;
                                i12 = (i29 << 15) | (i13 << 10) | i11;
                                short s52222 = (short) i12;
                                if (f6 >= 0.0f) {
                                }
                                long j42222 = ((((int) ((((f6 >= 0.0f ? f6 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s3 & 65535) << 48) | ((s4 & 65535) << 32) | ((s52222 & 65535) << 16) | (i19 & 63);
                                int i312222 = C0288u.f4297g;
                                return j42222;
                            }
                            i8 = i28;
                        }
                    }
                    i9 = i8 | (i25 << 15) | (i7 << 10);
                    short s42 = (short) i9;
                    b3 = abstractC0300c.b(2);
                    a4 = abstractC0300c.a(2);
                    if (f5 >= b3) {
                    }
                    if (b3 <= a4) {
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
        b2 = abstractC0300c.b(1);
        a3 = abstractC0300c.a(1);
        if (f4 >= b2) {
        }
        if (b2 <= a3) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a3);
        int i252 = floatToRawIntBits22 >>> 31;
        i6 = (floatToRawIntBits22 >>> 23) & 255;
        int i262 = floatToRawIntBits22 & 8388607;
        if (i6 != 255) {
        }
        i9 = i8 | (i252 << 15) | (i7 << 10);
        short s422 = (short) i9;
        b3 = abstractC0300c.b(2);
        a4 = abstractC0300c.a(2);
        if (f5 >= b3) {
        }
        if (b3 <= a4) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a4);
        int i2922 = floatToRawIntBits322 >>> 31;
        i10 = (floatToRawIntBits322 >>> 23) & 255;
        int i3022 = 8388607 & floatToRawIntBits322;
        if (i10 == 255) {
        }
    }

    public static final long b(int i3) {
        long j3 = i3 << 32;
        int i4 = C0288u.f4297g;
        return j3;
    }

    public static final long c(long j3) {
        long j4 = j3 << 32;
        int i3 = C0288u.f4297g;
        return j4;
    }

    public static long d(int i3, int i4, int i5) {
        return b(((i3 & 255) << 16) | (-16777216) | ((i4 & 255) << 8) | (i5 & 255));
    }

    public static C0275h e(int i3, int i4, int i5) {
        Bitmap createBitmap;
        C0314q c0314q = C0301d.f4351c;
        Bitmap.Config F3 = F(i5);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = AbstractC0280m.b(i3, i4, i5, true, c0314q);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i3, i4, F3);
            createBitmap.setHasAlpha(true);
        }
        return new C0275h(createBitmap);
    }

    public static final C0276i f() {
        return new C0276i(new Paint(7));
    }

    public static final C0278k g() {
        return new C0278k(new Path());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(float f3, float f4, float f5, float f6, AbstractC0300c abstractC0300c) {
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
        if (abstractC0300c.c()) {
            long j3 = ((((((int) ((f6 * 255.0f) + 0.5f)) << 24) | (((int) ((f3 * 255.0f) + 0.5f)) << 16)) | (((int) ((f4 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f5) + 0.5f))) << 32;
            int i13 = C0288u.f4297g;
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
                                            long max = ((s4 & 65535) << 32) | ((s3 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0300c.f4348c & 63);
                                            int i25 = C0288u.f4297g;
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
                                long max2 = ((s4 & 65535) << 32) | ((s3 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0300c.f4348c & 63);
                                int i252 = C0288u.f4297g;
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
                    long max22 = ((s42 & 65535) << 32) | ((s3 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0300c.f4348c & 63);
                    int i2522 = C0288u.f4297g;
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
        long max222 = ((s422 & 65535) << 32) | ((s32 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f6, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0300c.f4348c & 63);
        int i25222 = C0288u.f4297g;
        return max222;
    }

    public static final float i(float[] fArr, int i3, float[] fArr2, int i4) {
        int i5 = i3 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    public static final long k(long j3, long j4) {
        float f3;
        float f4;
        long a3 = C0288u.a(j3, C0288u.f(j4));
        float d3 = C0288u.d(j4);
        float d4 = C0288u.d(a3);
        float f5 = 1.0f - d4;
        float f6 = (d3 * f5) + d4;
        float h3 = C0288u.h(a3);
        float h4 = C0288u.h(j4);
        float f7 = 0.0f;
        if (f6 == 0.0f) {
            f3 = 0.0f;
        } else {
            f3 = (((h4 * d3) * f5) + (h3 * d4)) / f6;
        }
        float g3 = C0288u.g(a3);
        float g4 = C0288u.g(j4);
        if (f6 == 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = (((g4 * d3) * f5) + (g3 * d4)) / f6;
        }
        float e3 = C0288u.e(a3);
        float e4 = C0288u.e(j4);
        if (f6 != 0.0f) {
            f7 = (((e4 * d3) * f5) + (e3 * d4)) / f6;
        }
        return h(f3, f4, f7, f6, C0288u.f(j4));
    }

    public static float[] l() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void m(Canvas canvas, boolean z3) {
        Method method;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            C0287t.f4291a.a(canvas, z3);
            return;
        }
        if (!f4218d) {
            try {
                if (i3 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f4216b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f4217c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f4216b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f4217c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f4216b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f4217c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f4218d = true;
        }
        if (z3) {
            try {
                Method method4 = f4216b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z3 || (method = f4217c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean n(int i3, int i4) {
        return i3 == i4;
    }

    public static final boolean o(int i3, int i4) {
        return i3 == i4;
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

    public static long s() {
        return C0288u.f4292b;
    }

    public static final float t(long j3) {
        AbstractC0300c f3 = C0288u.f(j3);
        if (!AbstractC0299b.a(f3.f4347b, AbstractC0299b.f4341a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC0299b.b(f3.f4347b)));
        }
        double h3 = C0288u.h(j3);
        C0310m c0310m = ((C0314q) f3).p;
        double b2 = c0310m.b(h3);
        float b3 = (float) ((c0310m.b(C0288u.e(j3)) * 0.0722d) + (c0310m.b(C0288u.g(j3)) * 0.7152d) + (b2 * 0.2126d));
        if (b3 < 0.0f) {
            b3 = 0.0f;
        }
        if (b3 > 1.0f) {
            return 1.0f;
        }
        return b3;
    }

    public static final long u(float[] fArr, long j3) {
        float d3 = a0.c.d(j3);
        float e3 = a0.c.e(j3);
        float f3 = 1 / (((fArr[7] * e3) + (fArr[3] * d3)) + fArr[15]);
        if (Float.isInfinite(f3) || Float.isNaN(f3)) {
            f3 = 0.0f;
        }
        return I2.l.f(((fArr[4] * e3) + (fArr[0] * d3) + fArr[12]) * f3, ((fArr[5] * e3) + (fArr[1] * d3) + fArr[13]) * f3);
    }

    public static final void v(float[] fArr, a0.b bVar) {
        long u3 = u(fArr, I2.l.f(bVar.f3485a, bVar.f3486b));
        long u4 = u(fArr, I2.l.f(bVar.f3485a, bVar.f3488d));
        long u5 = u(fArr, I2.l.f(bVar.f3487c, bVar.f3486b));
        long u6 = u(fArr, I2.l.f(bVar.f3487c, bVar.f3488d));
        bVar.f3485a = Math.min(Math.min(a0.c.d(u3), a0.c.d(u4)), Math.min(a0.c.d(u5), a0.c.d(u6)));
        bVar.f3486b = Math.min(Math.min(a0.c.e(u3), a0.c.e(u4)), Math.min(a0.c.e(u5), a0.c.e(u6)));
        bVar.f3487c = Math.max(Math.max(a0.c.d(u3), a0.c.d(u4)), Math.max(a0.c.d(u5), a0.c.d(u6)));
        bVar.f3488d = Math.max(Math.max(a0.c.e(u3), a0.c.e(u4)), Math.max(a0.c.e(u5), a0.c.e(u6)));
    }

    public static final void w(float[] fArr) {
        int i3 = 0;
        while (i3 < 4) {
            int i4 = 0;
            while (i4 < 4) {
                fArr[(i4 * 4) + i3] = i3 == i4 ? 1.0f : 0.0f;
                i4++;
            }
            i3++;
        }
    }

    public static final void x(float[] fArr, float f3) {
        double d3 = (f3 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d3);
        float sin = (float) Math.sin(d3);
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = (sin * f5) + (cos * f4);
        float f7 = -sin;
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = (sin * f9) + (cos * f8);
        float f11 = fArr[2];
        float f12 = fArr[6];
        float f13 = (sin * f12) + (cos * f11);
        float f14 = fArr[3];
        float f15 = fArr[7];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f13;
        fArr[3] = (sin * f15) + (cos * f14);
        fArr[4] = (f5 * cos) + (f4 * f7);
        fArr[5] = (f9 * cos) + (f8 * f7);
        fArr[6] = (f12 * cos) + (f11 * f7);
        fArr[7] = (cos * f15) + (f7 * f14);
    }

    public static final void y(float[] fArr, float f3, float f4, float f5) {
        fArr[0] = fArr[0] * f3;
        fArr[1] = fArr[1] * f3;
        fArr[2] = fArr[2] * f3;
        fArr[3] = fArr[3] * f3;
        fArr[4] = fArr[4] * f4;
        fArr[5] = fArr[5] * f4;
        fArr[6] = fArr[6] * f4;
        fArr[7] = fArr[7] * f4;
        fArr[8] = fArr[8] * f5;
        fArr[9] = fArr[9] * f5;
        fArr[10] = fArr[10] * f5;
        fArr[11] = fArr[11] * f5;
    }

    public static final void z(float[] fArr, Matrix matrix) {
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

    public abstract void j(float f3, long j3, C0276i c0276i);
}
