package k1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static d0 f5350a;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f5351b = new c0();

    /* renamed from: c, reason: collision with root package name */
    public static Method f5352c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f5353d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f5354e;

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f3, float f10, float f11, float f12, l1.c cVar) {
        int i3;
        int i10;
        int i11;
        float b10;
        float a9;
        int i12;
        int i13;
        int i14;
        int i15;
        float b11;
        float a10;
        int i16;
        int i17;
        int i18;
        if (cVar.c()) {
            float f13 = f12 < 0.0f ? 0.0f : f12;
            if (f13 > 1.0f) {
                f13 = 1.0f;
            }
            int i19 = ((int) ((f13 * 255.0f) + 0.5f)) << 24;
            float f14 = f3 < 0.0f ? 0.0f : f3;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i20 = i19 | (((int) ((f14 * 255.0f) + 0.5f)) << 16);
            float f15 = f10 < 0.0f ? 0.0f : f10;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i21 = i20 | (((int) ((f15 * 255.0f) + 0.5f)) << 8);
            float f16 = f11 >= 0.0f ? f11 : 0.0f;
            float f17 = f16 <= 1.0f ? f16 : 1.0f;
            hd.z zVar = hd.a0.f4495e;
            long j = (i21 | ((int) ((f17 * 255.0f) + 0.5f))) << 32;
            int i22 = p.f5341h;
            return j;
        }
        long j3 = cVar.f5756b;
        int i23 = l1.b.f5754e;
        if (((int) (j3 >> 32)) != 3) {
            x.a("Color only works with ColorSpaces with 3 components");
        }
        int i24 = cVar.f5757c;
        if (i24 == -1) {
            x.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b12 = cVar.b(0);
        float a11 = cVar.a(0);
        if (f3 >= b12) {
            b12 = f3;
        }
        if (b12 <= a11) {
            a11 = b12;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a11);
        int i25 = floatToRawIntBits >>> 31;
        int i26 = (floatToRawIntBits >>> 23) & 255;
        int i27 = floatToRawIntBits & 8388607;
        if (i26 == 255) {
            i10 = i27 != 0 ? 512 : 0;
            i3 = 31;
        } else {
            i3 = i26 - 112;
            if (i3 >= 31) {
                i10 = 0;
                i3 = 49;
            } else if (i3 > 0) {
                int i28 = i27 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i11 = (((i3 << 10) | i28) + 1) | (i25 << 15);
                    short s3 = (short) i11;
                    b10 = cVar.b(1);
                    a9 = cVar.a(1);
                    if (f10 >= b10) {
                        b10 = f10;
                    }
                    if (b10 <= a9) {
                        a9 = b10;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a9);
                    int i29 = floatToRawIntBits2 >>> 31;
                    i12 = (floatToRawIntBits2 >>> 23) & 255;
                    int i30 = floatToRawIntBits2 & 8388607;
                    if (i12 != 255) {
                        i14 = i30 != 0 ? 512 : 0;
                        i13 = 31;
                    } else {
                        i13 = i12 - 112;
                        if (i13 >= 31) {
                            i14 = 0;
                            i13 = 49;
                        } else if (i13 > 0) {
                            int i31 = i30 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i15 = (((i13 << 10) | i31) + 1) | (i29 << 15);
                                short s10 = (short) i15;
                                b11 = cVar.b(2);
                                a10 = cVar.a(2);
                                if (f11 >= b11) {
                                    b11 = f11;
                                }
                                if (b11 <= a10) {
                                    a10 = b11;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a10);
                                int i32 = floatToRawIntBits3 >>> 31;
                                i16 = (floatToRawIntBits3 >>> 23) & 255;
                                int i33 = 8388607 & floatToRawIntBits3;
                                if (i16 == 255) {
                                    i17 = i33 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i34 = i16 - 112;
                                    if (i34 >= 31) {
                                        i17 = 0;
                                        r7 = 49;
                                    } else if (i34 > 0) {
                                        int i35 = i33 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i18 = (((i34 << 10) | i35) + 1) | (i32 << 15);
                                            long j10 = (i24 & 63) | ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((65535 & ((short) i18)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            hd.z zVar2 = hd.a0.f4495e;
                                            int i36 = p.f5341h;
                                            return j10;
                                        }
                                        i17 = i35;
                                        r7 = i34;
                                    } else if (i34 >= -10) {
                                        int i37 = (i33 | 8388608) >> (1 - i34);
                                        if ((i37 & 4096) != 0) {
                                            i37 += 8192;
                                        }
                                        i17 = i37 >> 13;
                                    } else {
                                        i17 = 0;
                                    }
                                }
                                i18 = i17 | (i32 << 15) | (r7 << 10);
                                if (f12 >= 0.0f) {
                                }
                                long j102 = (i24 & 63) | ((s3 & 65535) << 48) | ((s10 & 65535) << 32) | ((65535 & ((short) i18)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                hd.z zVar22 = hd.a0.f4495e;
                                int i362 = p.f5341h;
                                return j102;
                            }
                            i14 = i31;
                        } else if (i13 >= -10) {
                            int i38 = (i30 | 8388608) >> (1 - i13);
                            if ((i38 & 4096) != 0) {
                                i38 += 8192;
                            }
                            i14 = i38 >> 13;
                            i13 = 0;
                        } else {
                            i14 = 0;
                            i13 = 0;
                        }
                    }
                    i15 = i14 | (i29 << 15) | (i13 << 10);
                    short s102 = (short) i15;
                    b11 = cVar.b(2);
                    a10 = cVar.a(2);
                    if (f11 >= b11) {
                    }
                    if (b11 <= a10) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a10);
                    int i322 = floatToRawIntBits32 >>> 31;
                    i16 = (floatToRawIntBits32 >>> 23) & 255;
                    int i332 = 8388607 & floatToRawIntBits32;
                    if (i16 == 255) {
                    }
                    i18 = i17 | (i322 << 15) | (r7 << 10);
                    if (f12 >= 0.0f) {
                    }
                    long j1022 = (i24 & 63) | ((s3 & 65535) << 48) | ((s102 & 65535) << 32) | ((65535 & ((short) i18)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    hd.z zVar222 = hd.a0.f4495e;
                    int i3622 = p.f5341h;
                    return j1022;
                }
                i10 = i28;
            } else if (i3 >= -10) {
                int i39 = (i27 | 8388608) >> (1 - i3);
                if ((i39 & 4096) != 0) {
                    i39 += 8192;
                }
                i10 = i39 >> 13;
                i3 = 0;
            } else {
                i10 = 0;
                i3 = 0;
            }
        }
        i11 = i10 | (i25 << 15) | (i3 << 10);
        short s32 = (short) i11;
        b10 = cVar.b(1);
        a9 = cVar.a(1);
        if (f10 >= b10) {
        }
        if (b10 <= a9) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a9);
        int i292 = floatToRawIntBits22 >>> 31;
        i12 = (floatToRawIntBits22 >>> 23) & 255;
        int i302 = floatToRawIntBits22 & 8388607;
        if (i12 != 255) {
        }
        i15 = i14 | (i292 << 15) | (i13 << 10);
        short s1022 = (short) i15;
        b11 = cVar.b(2);
        a10 = cVar.a(2);
        if (f11 >= b11) {
        }
        if (b11 <= a10) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a10);
        int i3222 = floatToRawIntBits322 >>> 31;
        i16 = (floatToRawIntBits322 >>> 23) & 255;
        int i3322 = 8388607 & floatToRawIntBits322;
        if (i16 == 255) {
        }
        i18 = i17 | (i3222 << 15) | (r7 << 10);
        if (f12 >= 0.0f) {
        }
        long j10222 = (i24 & 63) | ((s32 & 65535) << 48) | ((s1022 & 65535) << 32) | ((65535 & ((short) i18)) << 16) | ((((int) ((((f12 >= 0.0f ? f12 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        hd.z zVar2222 = hd.a0.f4495e;
        int i36222 = p.f5341h;
        return j10222;
    }

    public static final long b(int i3) {
        long j = i3;
        hd.z zVar = hd.a0.f4495e;
        long j3 = j << 32;
        int i10 = p.f5341h;
        return j3;
    }

    public static final long c(long j) {
        long j3 = j << 32;
        hd.z zVar = hd.a0.f4495e;
        int i3 = p.f5341h;
        return j3;
    }

    public static long d(int i3, int i10, int i11) {
        return b(((i3 & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255));
    }

    public static final y6.l e() {
        return new y6.l(new Paint(7));
    }

    public static float[] g() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static void h(Canvas canvas, boolean z10) {
        Method method;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!f5354e) {
            try {
                if (i3 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f5352c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f5353d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f5352c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f5353d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f5352c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f5353d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f5354e = true;
        }
        if (z10) {
            try {
                Method method4 = f5352c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z10 || (method = f5353d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final d1.l j(Function1 function1) {
        return new k(function1);
    }

    public static d1.l k(d1.l lVar, f0 f0Var, int i3) {
        long j = i0.f5326b;
        if ((i3 & 2048) != 0) {
            f0Var = f5351b;
        }
        long j3 = w.f5355a;
        return lVar.c(new u(j, f0Var, j3, j3));
    }

    public static final boolean l(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final long m(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f18 = 1 / (((f14 * intBitsToFloat2) + (f11 * intBitsToFloat)) + f17);
        if ((Float.floatToRawIntBits(f18) & Integer.MAX_VALUE) >= 2139095040) {
            f18 = 0.0f;
        }
        float f19 = ((f13 * intBitsToFloat2) + (f10 * intBitsToFloat) + f16) * f18;
        return (Float.floatToRawIntBits((((f12 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f15) * f18) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L);
    }

    public static final void n(float[] fArr, j1.a aVar) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[4];
        float f13 = fArr[5];
        float f14 = fArr[7];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        float f18 = aVar.f4910a;
        float f19 = aVar.f4911b;
        float f20 = aVar.f4912c;
        float f21 = aVar.f4913d;
        float f22 = f11 * f18;
        float f23 = f14 * f19;
        float f24 = 1.0f / ((f22 + f23) + f17);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f3 * f18;
        float f26 = f12 * f19;
        float f27 = (f25 + f26 + f15) * f24;
        float f28 = f18 * f10;
        float f29 = f19 * f13;
        float f30 = (f28 + f29 + f16) * f24;
        float f31 = f14 * f21;
        float f32 = 1.0f / ((f22 + f31) + f17);
        if ((Float.floatToRawIntBits(f32) & Integer.MAX_VALUE) >= 2139095040) {
            f32 = 0.0f;
        }
        float f33 = f12 * f21;
        float f34 = (f25 + f33 + f15) * f32;
        float f35 = f13 * f21;
        float f36 = (f28 + f35 + f16) * f32;
        float f37 = f11 * f20;
        float f38 = 1.0f / ((f23 + f37) + f17);
        if ((Float.floatToRawIntBits(f38) & Integer.MAX_VALUE) >= 2139095040) {
            f38 = 0.0f;
        }
        float f39 = f3 * f20;
        float f40 = (f39 + f26 + f15) * f38;
        float f41 = f20 * f10;
        float f42 = (f29 + f41 + f16) * f38;
        float f43 = 1.0f / ((f37 + f31) + f17);
        float f44 = (Float.floatToRawIntBits(f43) & Integer.MAX_VALUE) < 2139095040 ? f43 : 0.0f;
        float f45 = (f39 + f33 + f15) * f44;
        float f46 = (f41 + f35 + f16) * f44;
        aVar.f4910a = Math.min(f27, Math.min(f34, Math.min(f40, f45)));
        aVar.f4911b = Math.min(f30, Math.min(f36, Math.min(f42, f46)));
        aVar.f4912c = Math.max(f27, Math.max(f34, Math.max(f40, f45)));
        aVar.f4913d = Math.max(f30, Math.max(f36, Math.max(f42, f46)));
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
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f3;
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

    public static final BlendMode q(int i3) {
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
        if (i3 == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i3 == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i3 == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i3 == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i3 == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i3 == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i3 == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i3 == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i3 == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i3 == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i3 == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i3 == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i3 == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i3 == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i3 == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i3 == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i3 == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i3 == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i3 == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i3 == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i3 == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i3 == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i3 == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i3 == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i3 == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i3 == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i3 == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i3 == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i3 == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final int r(long j) {
        float[] fArr = l1.d.f5758a;
        long a9 = p.a(j, l1.d.f5762e) >>> 32;
        hd.z zVar = hd.a0.f4495e;
        return (int) a9;
    }

    public static final Bitmap.Config s(int i3) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (i3 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i3 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i3 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i3 == 3) {
            config2 = Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i10 < 26 || i3 != 4) {
            return Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.Config.HARDWARE;
        return config;
    }

    public static final PorterDuff.Mode t(int i3) {
        return i3 == 0 ? PorterDuff.Mode.CLEAR : i3 == 1 ? PorterDuff.Mode.SRC : i3 == 2 ? PorterDuff.Mode.DST : i3 == 3 ? PorterDuff.Mode.SRC_OVER : i3 == 4 ? PorterDuff.Mode.DST_OVER : i3 == 5 ? PorterDuff.Mode.SRC_IN : i3 == 6 ? PorterDuff.Mode.DST_IN : i3 == 7 ? PorterDuff.Mode.SRC_OUT : i3 == 8 ? PorterDuff.Mode.DST_OUT : i3 == 9 ? PorterDuff.Mode.SRC_ATOP : i3 == 10 ? PorterDuff.Mode.DST_ATOP : i3 == 11 ? PorterDuff.Mode.XOR : i3 == 12 ? PorterDuff.Mode.ADD : i3 == 14 ? PorterDuff.Mode.SCREEN : i3 == 15 ? PorterDuff.Mode.OVERLAY : i3 == 16 ? PorterDuff.Mode.DARKEN : i3 == 17 ? PorterDuff.Mode.LIGHTEN : i3 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String u(int i3) {
        return i3 == 0 ? "Clear" : i3 == 1 ? "Src" : i3 == 2 ? "Dst" : i3 == 3 ? "SrcOver" : i3 == 4 ? "DstOver" : i3 == 5 ? "SrcIn" : i3 == 6 ? "DstIn" : i3 == 7 ? "SrcOut" : i3 == 8 ? "DstOut" : i3 == 9 ? "SrcAtop" : i3 == 10 ? "DstAtop" : i3 == 11 ? "Xor" : i3 == 12 ? "Plus" : i3 == 13 ? "Modulate" : i3 == 14 ? "Screen" : i3 == 15 ? "Overlay" : i3 == 16 ? "Darken" : i3 == 17 ? "Lighten" : i3 == 18 ? "ColorDodge" : i3 == 19 ? "ColorBurn" : i3 == 20 ? "HardLight" : i3 == 21 ? "Softlight" : i3 == 22 ? "Difference" : i3 == 23 ? "Exclusion" : i3 == 24 ? "Multiply" : i3 == 25 ? "Hue" : i3 == 26 ? "Saturation" : i3 == 27 ? "Color" : i3 == 28 ? "Luminosity" : "Unknown";
    }

    public static void v(float[] fArr, float f3, float f10) {
        if (fArr.length < 16) {
            return;
        }
        float f11 = (fArr[8] * 0.0f) + (fArr[4] * f10) + (fArr[0] * f3) + fArr[12];
        float f12 = (fArr[9] * 0.0f) + (fArr[5] * f10) + (fArr[1] * f3) + fArr[13];
        float f13 = (fArr[10] * 0.0f) + (fArr[6] * f10) + (fArr[2] * f3) + fArr[14];
        float f14 = (fArr[11] * 0.0f) + (fArr[7] * f10) + (fArr[3] * f3) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    public static final int w(float f3, float[] fArr, int i3) {
        float f10 = f3 >= 0.0f ? f3 : 0.0f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (Math.abs(f10 - f3) > 1.05E-6f) {
            f10 = Float.NaN;
        }
        fArr[i3] = f10;
        return !Float.isNaN(f10) ? 1 : 0;
    }

    public abstract void f(float f3, long j, y6.l lVar);

    public abstract j1.c i();
}
