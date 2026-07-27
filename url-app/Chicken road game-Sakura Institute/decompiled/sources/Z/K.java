package Z;

import a.AbstractC0345a;
import a0.AbstractC0347b;
import a0.AbstractC0348c;
import a0.C0349d;
import a0.C0357l;
import a0.C0358m;
import a0.C0362q;
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
import b0.C0499g;
import b0.InterfaceC0496d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y2.C1338m;
import y2.y;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final E1.i f4461a = new E1.i(7);

    /* renamed from: b, reason: collision with root package name */
    public static Method f4462b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f4463c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4464d;

    public static final Rect A(M0.i iVar) {
        return new Rect(iVar.f3550a, iVar.f3551b, iVar.f3552c, iVar.f3553d);
    }

    public static final Rect B(Y.d dVar) {
        return new Rect((int) dVar.f4374a, (int) dVar.f4375b, (int) dVar.f4376c, (int) dVar.f4377d);
    }

    public static final RectF C(Y.d dVar) {
        return new RectF(dVar.f4374a, dVar.f4375b, dVar.f4376c, dVar.f4377d);
    }

    public static final int D(long j4) {
        float[] fArr = C0349d.f4761a;
        long a4 = C0323u.a(j4, C0349d.f4763c) >>> 32;
        y.a aVar = y2.y.f11688e;
        return (int) a4;
    }

    public static final Bitmap.Config E(int i2) {
        return C.a(i2, 0) ? Bitmap.Config.ARGB_8888 : C.a(i2, 1) ? Bitmap.Config.ALPHA_8 : C.a(i2, 2) ? Bitmap.Config.RGB_565 : C.a(i2, 3) ? Bitmap.Config.RGBA_F16 : C.a(i2, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final Y.d F(RectF rectF) {
        return new Y.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode G(int i2) {
        return o(i2, 0) ? PorterDuff.Mode.CLEAR : o(i2, 1) ? PorterDuff.Mode.SRC : o(i2, 2) ? PorterDuff.Mode.DST : o(i2, 3) ? PorterDuff.Mode.SRC_OVER : o(i2, 4) ? PorterDuff.Mode.DST_OVER : o(i2, 5) ? PorterDuff.Mode.SRC_IN : o(i2, 6) ? PorterDuff.Mode.DST_IN : o(i2, 7) ? PorterDuff.Mode.SRC_OUT : o(i2, 8) ? PorterDuff.Mode.DST_OUT : o(i2, 9) ? PorterDuff.Mode.SRC_ATOP : o(i2, 10) ? PorterDuff.Mode.DST_ATOP : o(i2, 11) ? PorterDuff.Mode.XOR : o(i2, 12) ? PorterDuff.Mode.ADD : o(i2, 14) ? PorterDuff.Mode.SCREEN : o(i2, 15) ? PorterDuff.Mode.OVERLAY : o(i2, 16) ? PorterDuff.Mode.DARKEN : o(i2, 17) ? PorterDuff.Mode.LIGHTEN : o(i2, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
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
    public static final int H(float f4, float[] fArr, int i2) {
        float f5 = 0.0f;
        if (f4 >= 0.0f) {
            f5 = 1.0f;
            if (f4 > 1.0f) {
            }
        }
        fArr[i2] = f4;
        return !Float.isNaN(f4) ? 1 : 0;
    }

    public static final C0306c a(C0310g c0310g) {
        Canvas canvas = AbstractC0307d.f4518a;
        C0306c c0306c = new C0306c();
        c0306c.f4515a = new Canvas(k(c0310g));
        return c0306c;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f4, float f5, float f6, float f7, AbstractC0348c abstractC0348c) {
        int i2;
        int i4;
        int i5;
        float b4;
        float a4;
        int i6;
        int i7;
        int i8;
        int i9;
        float b5;
        float a5;
        int i10;
        int i11;
        int i12;
        int i13 = 31;
        if (abstractC0348c.c()) {
            float f8 = f7 < 0.0f ? 0.0f : f7;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = ((int) ((f8 * 255.0f) + 0.5f)) << 24;
            float f9 = f4 < 0.0f ? 0.0f : f4;
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            int i15 = i14 | (((int) ((f9 * 255.0f) + 0.5f)) << 16);
            float f10 = f5 < 0.0f ? 0.0f : f5;
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            int i16 = i15 | (((int) ((f10 * 255.0f) + 0.5f)) << 8);
            float f11 = f6 >= 0.0f ? f6 : 0.0f;
            float f12 = f11 <= 1.0f ? f11 : 1.0f;
            y.a aVar = y2.y.f11688e;
            long j4 = (i16 | ((int) ((f12 * 255.0f) + 0.5f))) << 32;
            int i17 = C0323u.f4548h;
            return j4;
        }
        int i18 = AbstractC0347b.f4757e;
        if (((int) (abstractC0348c.f4759b >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i19 = abstractC0348c.f4760c;
        if (i19 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float b6 = abstractC0348c.b(0);
        float a6 = abstractC0348c.a(0);
        if (f4 >= b6) {
            b6 = f4;
        }
        if (b6 <= a6) {
            a6 = b6;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a6);
        int i20 = floatToRawIntBits >>> 31;
        int i21 = (floatToRawIntBits >>> 23) & 255;
        int i22 = floatToRawIntBits & 8388607;
        if (i21 == 255) {
            i4 = i22 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i21 - 112;
            if (i2 >= 31) {
                i2 = 49;
                i4 = 0;
            } else if (i2 <= 0) {
                if (i2 >= -10) {
                    int i23 = (i22 | 8388608) >> (1 - i2);
                    if ((i23 & 4096) != 0) {
                        i23 += 8192;
                    }
                    i4 = i23 >> 13;
                } else {
                    i4 = 0;
                }
                i2 = 0;
            } else {
                int i24 = i22 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i5 = (((i2 << 10) | i24) + 1) | (i20 << 15);
                    short s4 = (short) i5;
                    b4 = abstractC0348c.b(1);
                    a4 = abstractC0348c.a(1);
                    if (f5 >= b4) {
                        b4 = f5;
                    }
                    if (b4 <= a4) {
                        a4 = b4;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a4);
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
                                short s5 = (short) i9;
                                b5 = abstractC0348c.b(2);
                                a5 = abstractC0348c.a(2);
                                if (f6 >= b5) {
                                    b5 = f6;
                                }
                                if (b5 <= a5) {
                                    a5 = b5;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a5);
                                int i29 = floatToRawIntBits3 >>> 31;
                                i10 = (floatToRawIntBits3 >>> 23) & 255;
                                int i30 = 8388607 & floatToRawIntBits3;
                                if (i10 == 255) {
                                    if (i30 != 0) {
                                        i11 = 512;
                                        i12 = (i29 << 15) | (i13 << 10) | i11;
                                        short s6 = (short) i12;
                                        long j5 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s4 & 65535) << 48) | ((s5 & 65535) << 32) | ((s6 & 65535) << 16) | (i19 & 63);
                                        y.a aVar2 = y2.y.f11688e;
                                        int i31 = C0323u.f4548h;
                                        return j5;
                                    }
                                    i11 = 0;
                                    i12 = (i29 << 15) | (i13 << 10) | i11;
                                    short s62 = (short) i12;
                                    if (f7 >= 0.0f) {
                                    }
                                    long j52 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s4 & 65535) << 48) | ((s5 & 65535) << 32) | ((s62 & 65535) << 16) | (i19 & 63);
                                    y.a aVar22 = y2.y.f11688e;
                                    int i312 = C0323u.f4548h;
                                    return j52;
                                }
                                int i32 = i10 - 112;
                                if (i32 < 31) {
                                    if (i32 > 0) {
                                        i11 = i30 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i12 = (((i32 << 10) | i11) + 1) | (i29 << 15);
                                            short s622 = (short) i12;
                                            if (f7 >= 0.0f) {
                                            }
                                            long j522 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s4 & 65535) << 48) | ((s5 & 65535) << 32) | ((s622 & 65535) << 16) | (i19 & 63);
                                            y.a aVar222 = y2.y.f11688e;
                                            int i3122 = C0323u.f4548h;
                                            return j522;
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
                                    short s6222 = (short) i12;
                                    if (f7 >= 0.0f) {
                                    }
                                    long j5222 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s4 & 65535) << 48) | ((s5 & 65535) << 32) | ((s6222 & 65535) << 16) | (i19 & 63);
                                    y.a aVar2222 = y2.y.f11688e;
                                    int i31222 = C0323u.f4548h;
                                    return j5222;
                                }
                                i13 = 49;
                                i11 = 0;
                                i12 = (i29 << 15) | (i13 << 10) | i11;
                                short s62222 = (short) i12;
                                if (f7 >= 0.0f) {
                                }
                                long j52222 = ((((int) ((((f7 >= 0.0f ? f7 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((s4 & 65535) << 48) | ((s5 & 65535) << 32) | ((s62222 & 65535) << 16) | (i19 & 63);
                                y.a aVar22222 = y2.y.f11688e;
                                int i312222 = C0323u.f4548h;
                                return j52222;
                            }
                            i8 = i28;
                        }
                    }
                    i9 = i8 | (i25 << 15) | (i7 << 10);
                    short s52 = (short) i9;
                    b5 = abstractC0348c.b(2);
                    a5 = abstractC0348c.a(2);
                    if (f6 >= b5) {
                    }
                    if (b5 <= a5) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a5);
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
        i5 = i4 | (i20 << 15) | (i2 << 10);
        short s42 = (short) i5;
        b4 = abstractC0348c.b(1);
        a4 = abstractC0348c.a(1);
        if (f5 >= b4) {
        }
        if (b4 <= a4) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a4);
        int i252 = floatToRawIntBits22 >>> 31;
        i6 = (floatToRawIntBits22 >>> 23) & 255;
        int i262 = floatToRawIntBits22 & 8388607;
        if (i6 != 255) {
        }
        i9 = i8 | (i252 << 15) | (i7 << 10);
        short s522 = (short) i9;
        b5 = abstractC0348c.b(2);
        a5 = abstractC0348c.a(2);
        if (f6 >= b5) {
        }
        if (b5 <= a5) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a5);
        int i2922 = floatToRawIntBits322 >>> 31;
        i10 = (floatToRawIntBits322 >>> 23) & 255;
        int i3022 = 8388607 & floatToRawIntBits322;
        if (i10 == 255) {
        }
    }

    public static final long c(int i2) {
        long j4 = i2;
        y.a aVar = y2.y.f11688e;
        long j5 = j4 << 32;
        int i4 = C0323u.f4548h;
        return j5;
    }

    public static final long d(long j4) {
        long j5 = j4 << 32;
        y.a aVar = y2.y.f11688e;
        int i2 = C0323u.f4548h;
        return j5;
    }

    public static long e(int i2, int i4, int i5) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i4 & 255) << 8) | (i5 & 255));
    }

    public static C0310g f(int i2, int i4, int i5) {
        C0362q c0362q = C0349d.f4763c;
        E(i5);
        return new C0310g(AbstractC0315l.b(i2, i4, i5, true, c0362q));
    }

    public static final C0311h g() {
        return new C0311h(new Paint(7));
    }

    public static final C0313j h() {
        return new C0313j(new Path());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(float f4, float f5, float f6, float f7, AbstractC0348c abstractC0348c) {
        int i2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = 31;
        if (abstractC0348c.c()) {
            y.a aVar = y2.y.f11688e;
            long j4 = ((((((int) ((f7 * 255.0f) + 0.5f)) << 24) | (((int) ((f4 * 255.0f) + 0.5f)) << 16)) | (((int) ((f5 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f6) + 0.5f))) << 32;
            int i13 = C0323u.f4548h;
            return j4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f4);
        int i14 = floatToRawIntBits >>> 31;
        int i15 = (floatToRawIntBits >>> 23) & 255;
        int i16 = floatToRawIntBits & 8388607;
        int i17 = 0;
        if (i15 == 255) {
            i4 = i16 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i15 - 112;
            if (i2 >= 31) {
                i4 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i18 = i16 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i5 = (((i2 << 10) | i18) + 1) | (i14 << 15);
                    short s4 = (short) i5;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f5);
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
                                short s5 = (short) i9;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f6);
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
                                            long max = ((s5 & 65535) << 32) | ((s4 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f7, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0348c.f4760c & 63);
                                            y.a aVar2 = y2.y.f11688e;
                                            int i25 = C0323u.f4548h;
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
                                long max2 = ((s5 & 65535) << 32) | ((s4 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f7, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0348c.f4760c & 63);
                                y.a aVar22 = y2.y.f11688e;
                                int i252 = C0323u.f4548h;
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
                    short s52 = (short) i9;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f6);
                    int i222 = floatToRawIntBits32 >>> 31;
                    i10 = (floatToRawIntBits32 >>> 23) & 255;
                    int i232 = 8388607 & floatToRawIntBits32;
                    if (i10 == 255) {
                    }
                    i11 = (i12 << 10) | (i222 << 15) | i17;
                    long max22 = ((s52 & 65535) << 32) | ((s4 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f7, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0348c.f4760c & 63);
                    y.a aVar222 = y2.y.f11688e;
                    int i2522 = C0323u.f4548h;
                    return max22;
                }
                i4 = i18;
            } else if (i2 >= -10) {
                int i28 = (i16 | 8388608) >> (1 - i2);
                if ((i28 & 4096) != 0) {
                    i28 += 8192;
                }
                i4 = i28 >> 13;
                i2 = 0;
            } else {
                i4 = 0;
                i2 = 0;
            }
        }
        i5 = i4 | (i14 << 15) | (i2 << 10);
        short s42 = (short) i5;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f5);
        int i192 = floatToRawIntBits22 >>> 31;
        i6 = (floatToRawIntBits22 >>> 23) & 255;
        int i202 = floatToRawIntBits22 & 8388607;
        if (i6 != 255) {
        }
        i9 = i8 | (i192 << 15) | (i7 << 10);
        short s522 = (short) i9;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f6);
        int i2222 = floatToRawIntBits322 >>> 31;
        i10 = (floatToRawIntBits322 >>> 23) & 255;
        int i2322 = 8388607 & floatToRawIntBits322;
        if (i10 == 255) {
        }
        i11 = (i12 << 10) | (i2222 << 15) | i17;
        long max222 = ((s522 & 65535) << 32) | ((s42 & 65535) << 48) | ((((short) i11) & 65535) << 16) | ((((int) ((Math.max(0.0f, Math.min(f7, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC0348c.f4760c & 63);
        y.a aVar2222 = y2.y.f11688e;
        int i25222 = C0323u.f4548h;
        return max222;
    }

    public static final float j(float[] fArr, int i2, float[] fArr2, int i4) {
        int i5 = i2 * 4;
        return (fArr[i5 + 3] * fArr2[12 + i4]) + (fArr[i5 + 2] * fArr2[8 + i4]) + (fArr[i5 + 1] * fArr2[4 + i4]) + (fArr[i5] * fArr2[i4]);
    }

    public static final Bitmap k(C0310g c0310g) {
        if (c0310g instanceof C0310g) {
            return c0310g.f4523a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long l(long j4, long j5) {
        float f4;
        float f5;
        long a4 = C0323u.a(j4, C0323u.f(j5));
        float d4 = C0323u.d(j5);
        float d5 = C0323u.d(a4);
        float f6 = 1.0f - d5;
        float f7 = (d4 * f6) + d5;
        float h4 = C0323u.h(a4);
        float h5 = C0323u.h(j5);
        float f8 = 0.0f;
        if (f7 == 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = (((h5 * d4) * f6) + (h4 * d5)) / f7;
        }
        float g4 = C0323u.g(a4);
        float g5 = C0323u.g(j5);
        if (f7 == 0.0f) {
            f5 = 0.0f;
        } else {
            f5 = (((g5 * d4) * f6) + (g4 * d5)) / f7;
        }
        float e4 = C0323u.e(a4);
        float e5 = C0323u.e(j5);
        if (f7 != 0.0f) {
            f8 = (((e5 * d4) * f6) + (e4 * d5)) / f7;
        }
        return i(f4, f5, f8, f7, C0323u.f(j5));
    }

    public static void m(InterfaceC0496d interfaceC0496d, I i2, long j4) {
        C0313j c0313j;
        C0499g c0499g = C0499g.f5607a;
        if (i2 instanceof G) {
            Y.d dVar = ((G) i2).f4458a;
            interfaceC0496d.B(j4, AbstractC0345a.c(dVar.f4374a, dVar.f4375b), u3.l.N(dVar.c(), dVar.b()), 1.0f, c0499g, null, 3);
            return;
        }
        if (i2 instanceof H) {
            H h4 = (H) i2;
            c0313j = h4.f4460b;
            if (c0313j == null) {
                Y.e eVar = h4.f4459a;
                float b4 = Y.a.b(eVar.f4385h);
                interfaceC0496d.O(j4, AbstractC0345a.c(eVar.f4378a, eVar.f4379b), u3.l.N(eVar.b(), eVar.a()), u3.l.I(b4, b4), c0499g, 1.0f, null, 3);
                return;
            }
        } else {
            if (!(i2 instanceof F)) {
                throw new C1338m();
            }
            c0313j = ((F) i2).f4457a;
        }
        interfaceC0496d.D(c0313j, j4, 1.0f, c0499g, null, 3);
    }

    public static void n(Canvas canvas, boolean z4) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            C0322t.f4541a.a(canvas, z4);
            return;
        }
        if (!f4464d) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f4462b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f4463c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f4462b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f4463c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f4462b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f4463c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f4464d = true;
        }
        if (z4) {
            try {
                Method method4 = f4462b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z4 || (method = f4463c) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final boolean o(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean p(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean q(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean r(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean s(int i2, int i4) {
        return i2 == i4;
    }

    public static final boolean t(int i2, int i4) {
        return i2 == i4;
    }

    public static long u() {
        return C0323u.f4542b;
    }

    public static final long v(long j4, long j5, float f4) {
        C0357l c0357l = C0349d.f4780t;
        long a4 = C0323u.a(j4, c0357l);
        long a5 = C0323u.a(j5, c0357l);
        float d4 = C0323u.d(a4);
        float h4 = C0323u.h(a4);
        float g4 = C0323u.g(a4);
        float e4 = C0323u.e(a4);
        float d5 = C0323u.d(a5);
        float h5 = C0323u.h(a5);
        float g5 = C0323u.g(a5);
        float e5 = C0323u.e(a5);
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        return C0323u.a(i(u3.d.N(h4, h5, f4), u3.d.N(g4, g5, f4), u3.d.N(e4, e5, f4), u3.d.N(d4, d5, f4), c0357l), C0323u.f(j5));
    }

    public static final float w(long j4) {
        AbstractC0348c f4 = C0323u.f(j4);
        if (!AbstractC0347b.a(f4.f4759b, AbstractC0347b.f4753a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC0347b.b(f4.f4759b)));
        }
        double h4 = C0323u.h(j4);
        C0358m c0358m = ((C0362q) f4).f4821p;
        double c4 = c0358m.c(h4);
        float c5 = (float) ((c0358m.c(C0323u.e(j4)) * 0.0722d) + (c0358m.c(C0323u.g(j4)) * 0.7152d) + (c4 * 0.2126d));
        if (c5 < 0.0f) {
            c5 = 0.0f;
        }
        if (c5 > 1.0f) {
            return 1.0f;
        }
        return c5;
    }

    public static final void x(Matrix matrix, float[] fArr) {
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[15];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f13;
        fArr[3] = f5;
        fArr[4] = f9;
        fArr[5] = f14;
        fArr[6] = f7;
        fArr[7] = f11;
        fArr[8] = f15;
        matrix.setValues(fArr);
        fArr[0] = f4;
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[3] = f7;
        fArr[4] = f8;
        fArr[5] = f9;
        fArr[6] = f10;
        fArr[7] = f11;
        fArr[8] = f12;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        fArr[0] = f4;
        fArr[1] = f7;
        fArr[2] = 0.0f;
        fArr[3] = f10;
        fArr[4] = f5;
        fArr[5] = f8;
        fArr[6] = 0.0f;
        fArr[7] = f11;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f6;
        fArr[13] = f9;
        fArr[14] = 0.0f;
        fArr[15] = f12;
    }

    public static final BlendMode z(int i2) {
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
        if (o(i2, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (o(i2, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (o(i2, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (o(i2, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (o(i2, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (o(i2, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (o(i2, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (o(i2, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (o(i2, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (o(i2, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (o(i2, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (o(i2, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (o(i2, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (o(i2, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (o(i2, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (o(i2, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (o(i2, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (o(i2, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (o(i2, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (o(i2, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (o(i2, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (o(i2, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (o(i2, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (o(i2, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (o(i2, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (o(i2, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (o(i2, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (o(i2, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (o(i2, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }
}
