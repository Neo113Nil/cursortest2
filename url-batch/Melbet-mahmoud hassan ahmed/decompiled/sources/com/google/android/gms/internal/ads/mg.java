package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class mg {

    /* renamed from: a, reason: collision with root package name */
    private final int f8518a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8519b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8520c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8521d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8522e;

    /* renamed from: f, reason: collision with root package name */
    private final short[] f8523f;

    /* renamed from: g, reason: collision with root package name */
    private int f8524g;

    /* renamed from: h, reason: collision with root package name */
    private short[] f8525h;

    /* renamed from: i, reason: collision with root package name */
    private int f8526i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f8527j;

    /* renamed from: k, reason: collision with root package name */
    private int f8528k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f8529l;

    /* renamed from: q, reason: collision with root package name */
    private int f8534q;

    /* renamed from: r, reason: collision with root package name */
    private int f8535r;

    /* renamed from: s, reason: collision with root package name */
    private int f8536s;

    /* renamed from: t, reason: collision with root package name */
    private int f8537t;

    /* renamed from: v, reason: collision with root package name */
    private int f8539v;

    /* renamed from: w, reason: collision with root package name */
    private int f8540w;

    /* renamed from: x, reason: collision with root package name */
    private int f8541x;

    /* renamed from: m, reason: collision with root package name */
    private int f8530m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f8531n = 0;

    /* renamed from: u, reason: collision with root package name */
    private int f8538u = 0;

    /* renamed from: o, reason: collision with root package name */
    private float f8532o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    private float f8533p = 1.0f;

    public mg(int i7, int i8) {
        this.f8518a = i7;
        this.f8519b = i8;
        this.f8520c = i7 / 400;
        int i9 = i7 / 65;
        this.f8521d = i9;
        int i10 = i9 + i9;
        this.f8522e = i10;
        this.f8523f = new short[i10];
        this.f8524g = i10;
        int i11 = i8 * i10;
        this.f8525h = new short[i11];
        this.f8526i = i10;
        this.f8527j = new short[i11];
        this.f8528k = i10;
        this.f8529l = new short[i11];
    }

    private final int g(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f8519b;
        int i11 = 1;
        int i12 = 255;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i8; i16++) {
                short s7 = sArr[i10 + i16];
                short s8 = sArr[i10 + i8 + i16];
                i15 += s7 >= s8 ? s7 - s8 : s8 - s7;
            }
            int i17 = i15 * i13;
            int i18 = i11 * i8;
            if (i17 < i18) {
                i11 = i15;
            }
            if (i17 < i18) {
                i13 = i8;
            }
            int i19 = i15 * i12;
            int i20 = i14 * i8;
            if (i19 > i20) {
                i14 = i15;
            }
            if (i19 > i20) {
                i12 = i8;
            }
            i8++;
        }
        this.f8540w = i11 / i13;
        this.f8541x = i14 / i12;
        return i13;
    }

    private final void h(short[] sArr, int i7, int i8) {
        k(i8);
        int i9 = this.f8519b;
        System.arraycopy(sArr, i7 * i9, this.f8527j, this.f8535r * i9, i9 * i8);
        this.f8535r += i8;
    }

    private final void i(short[] sArr, int i7, int i8) {
        int i9 = this.f8522e / i8;
        int i10 = this.f8519b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f8523f[i13] = (short) (i14 / i11);
        }
    }

    private final void j(int i7) {
        int i8 = this.f8534q;
        int i9 = this.f8524g;
        if (i8 + i7 > i9) {
            int i10 = i9 + (i9 / 2) + i7;
            this.f8524g = i10;
            this.f8525h = Arrays.copyOf(this.f8525h, i10 * this.f8519b);
        }
    }

    private final void k(int i7) {
        int i8 = this.f8535r;
        int i9 = this.f8526i;
        if (i8 + i7 > i9) {
            int i10 = i9 + (i9 / 2) + i7;
            this.f8526i = i10;
            this.f8527j = Arrays.copyOf(this.f8527j, i10 * this.f8519b);
        }
    }

    private static void l(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i9 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i10 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i13] = (short) (((sArr2[i15] * (i7 - i16)) + (sArr3[i14] * i16)) / i7);
                i13 += i8;
                i15 += i8;
                i14 += i8;
            }
        }
    }

    private final void m() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f8535r;
        float f7 = this.f8532o / this.f8533p;
        double d7 = f7;
        int i16 = 1;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            int i17 = this.f8534q;
            if (i17 >= this.f8522e) {
                int i18 = 0;
                while (true) {
                    int i19 = this.f8537t;
                    if (i19 > 0) {
                        int min = Math.min(this.f8522e, i19);
                        h(this.f8525h, i18, min);
                        this.f8537t -= min;
                        i18 += min;
                    } else {
                        short[] sArr = this.f8525h;
                        int i20 = this.f8518a;
                        int i21 = i20 > 4000 ? i20 / 4000 : 1;
                        if (this.f8519b == i16 && i21 == i16) {
                            i7 = g(sArr, i18, this.f8520c, this.f8521d);
                        } else {
                            i(sArr, i18, i21);
                            int g7 = g(this.f8523f, 0, this.f8520c / i21, this.f8521d / i21);
                            if (i21 != i16) {
                                int i22 = g7 * i21;
                                int i23 = i21 * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                int i26 = this.f8520c;
                                if (i24 < i26) {
                                    i24 = i26;
                                }
                                int i27 = this.f8521d;
                                if (i25 > i27) {
                                    i25 = i27;
                                }
                                if (this.f8519b == i16) {
                                    i7 = g(sArr, i18, i24, i25);
                                } else {
                                    i(sArr, i18, i16);
                                    i7 = g(this.f8523f, 0, i24, i25);
                                }
                            } else {
                                i7 = g7;
                            }
                        }
                        int i28 = this.f8540w;
                        int i29 = (i28 == 0 || (i10 = this.f8538u) == 0 || this.f8541x > i28 * 3 || i28 + i28 <= this.f8539v * 3) ? i7 : i10;
                        this.f8539v = i28;
                        this.f8538u = i7;
                        if (d7 > 1.0d) {
                            short[] sArr2 = this.f8525h;
                            if (f7 >= 2.0f) {
                                i9 = (int) (i29 / ((-1.0f) + f7));
                            } else {
                                this.f8537t = (int) ((i29 * (2.0f - f7)) / ((-1.0f) + f7));
                                i9 = i29;
                            }
                            k(i9);
                            int i30 = i9;
                            l(i9, this.f8519b, this.f8527j, this.f8535r, sArr2, i18, sArr2, i18 + i29);
                            this.f8535r += i30;
                            i18 += i29 + i30;
                        } else {
                            int i31 = i29;
                            short[] sArr3 = this.f8525h;
                            if (f7 < 0.5f) {
                                i8 = (int) ((i31 * f7) / (1.0f - f7));
                            } else {
                                this.f8537t = (int) ((i31 * ((f7 + f7) - 1.0f)) / (1.0f - f7));
                                i8 = i31;
                            }
                            int i32 = i31 + i8;
                            k(i32);
                            int i33 = this.f8519b;
                            System.arraycopy(sArr3, i18 * i33, this.f8527j, this.f8535r * i33, i33 * i31);
                            l(i8, this.f8519b, this.f8527j, this.f8535r + i31, sArr3, i31 + i18, sArr3, i18);
                            this.f8535r += i32;
                            i18 += i8;
                        }
                    }
                    if (this.f8522e + i18 > i17) {
                        break;
                    } else {
                        i16 = 1;
                    }
                }
                int i34 = this.f8534q - i18;
                short[] sArr4 = this.f8525h;
                int i35 = this.f8519b;
                System.arraycopy(sArr4, i18 * i35, sArr4, 0, i35 * i34);
                this.f8534q = i34;
            }
        } else {
            h(this.f8525h, 0, this.f8534q);
            this.f8534q = 0;
        }
        float f8 = this.f8533p;
        if (f8 == 1.0f || this.f8535r == i15) {
            return;
        }
        int i36 = this.f8518a;
        int i37 = (int) (i36 / f8);
        while (true) {
            if (i37 <= 16384 && i36 <= 16384) {
                break;
            }
            i37 /= 2;
            i36 /= 2;
        }
        int i38 = this.f8535r - i15;
        int i39 = this.f8536s;
        int i40 = this.f8528k;
        if (i39 + i38 > i40) {
            int i41 = i40 + (i40 / 2) + i38;
            this.f8528k = i41;
            this.f8529l = Arrays.copyOf(this.f8529l, i41 * this.f8519b);
        }
        short[] sArr5 = this.f8527j;
        int i42 = this.f8519b;
        System.arraycopy(sArr5, i15 * i42, this.f8529l, this.f8536s * i42, i42 * i38);
        this.f8535r = i15;
        this.f8536s += i38;
        int i43 = 0;
        while (true) {
            i11 = this.f8536s;
            i12 = i11 - 1;
            if (i43 >= i12) {
                break;
            }
            while (true) {
                i13 = this.f8530m + 1;
                i14 = this.f8531n;
                if (i13 * i37 <= i14 * i36) {
                    break;
                }
                k(1);
                int i44 = 0;
                while (true) {
                    int i45 = this.f8519b;
                    if (i44 < i45) {
                        short[] sArr6 = this.f8527j;
                        int i46 = this.f8535r;
                        short[] sArr7 = this.f8529l;
                        int i47 = (i43 * i45) + i44;
                        short s7 = sArr7[i47];
                        short s8 = sArr7[i47 + i45];
                        int i48 = this.f8531n;
                        int i49 = this.f8530m;
                        int i50 = (i49 + 1) * i37;
                        int i51 = i50 - (i48 * i36);
                        int i52 = i50 - (i49 * i37);
                        sArr6[(i46 * i45) + i44] = (short) (((s7 * i51) + ((i52 - i51) * s8)) / i52);
                        i44++;
                    }
                }
                this.f8531n++;
                this.f8535r++;
            }
            this.f8530m = i13;
            if (i13 == i36) {
                this.f8530m = 0;
                jm.e(i14 == i37);
                this.f8531n = 0;
            }
            i43++;
        }
        if (i12 != 0) {
            short[] sArr8 = this.f8529l;
            int i53 = this.f8519b;
            System.arraycopy(sArr8, i12 * i53, sArr8, 0, (i11 - i12) * i53);
            this.f8536s -= i12;
        }
    }

    public final int a() {
        return this.f8535r;
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f8519b, this.f8535r);
        shortBuffer.put(this.f8527j, 0, this.f8519b * min);
        int i7 = this.f8535r - min;
        this.f8535r = i7;
        short[] sArr = this.f8527j;
        int i8 = this.f8519b;
        System.arraycopy(sArr, min * i8, sArr, 0, i7 * i8);
    }

    public final void c() {
        int i7;
        int i8 = this.f8534q;
        float f7 = this.f8532o;
        float f8 = this.f8533p;
        int i9 = this.f8535r + ((int) ((((i8 / (f7 / f8)) + this.f8536s) / f8) + 0.5f));
        int i10 = this.f8522e;
        j(i10 + i10 + i8);
        int i11 = 0;
        while (true) {
            int i12 = this.f8522e;
            i7 = i12 + i12;
            int i13 = this.f8519b;
            if (i11 >= i7 * i13) {
                break;
            }
            this.f8525h[(i13 * i8) + i11] = 0;
            i11++;
        }
        this.f8534q += i7;
        m();
        if (this.f8535r > i9) {
            this.f8535r = i9;
        }
        this.f8534q = 0;
        this.f8537t = 0;
        this.f8536s = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i7 = this.f8519b;
        int i8 = remaining / i7;
        int i9 = i7 * i8;
        j(i8);
        shortBuffer.get(this.f8525h, this.f8534q * this.f8519b, (i9 + i9) / 2);
        this.f8534q += i8;
        m();
    }

    public final void e(float f7) {
        this.f8533p = f7;
    }

    public final void f(float f7) {
        this.f8532o = f7;
    }
}
