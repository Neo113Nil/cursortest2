package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class o24 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9457a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9458b;

    /* renamed from: c, reason: collision with root package name */
    private final float f9459c;

    /* renamed from: d, reason: collision with root package name */
    private final float f9460d;

    /* renamed from: e, reason: collision with root package name */
    private final float f9461e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9462f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9463g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9464h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f9465i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f9466j;

    /* renamed from: k, reason: collision with root package name */
    private int f9467k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f9468l;

    /* renamed from: m, reason: collision with root package name */
    private int f9469m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f9470n;

    /* renamed from: o, reason: collision with root package name */
    private int f9471o;

    /* renamed from: p, reason: collision with root package name */
    private int f9472p;

    /* renamed from: q, reason: collision with root package name */
    private int f9473q;

    /* renamed from: r, reason: collision with root package name */
    private int f9474r;

    /* renamed from: s, reason: collision with root package name */
    private int f9475s;

    /* renamed from: t, reason: collision with root package name */
    private int f9476t;

    /* renamed from: u, reason: collision with root package name */
    private int f9477u;

    /* renamed from: v, reason: collision with root package name */
    private int f9478v;

    public o24(int i7, int i8, float f7, float f8, int i9) {
        this.f9457a = i7;
        this.f9458b = i8;
        this.f9459c = f7;
        this.f9460d = f8;
        this.f9461e = i7 / i9;
        this.f9462f = i7 / 400;
        int i10 = i7 / 65;
        this.f9463g = i10;
        int i11 = i10 + i10;
        this.f9464h = i11;
        this.f9465i = new short[i11];
        int i12 = i11 * i8;
        this.f9466j = new short[i12];
        this.f9468l = new short[i12];
        this.f9470n = new short[i12];
    }

    private final int g(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f9458b;
        int i11 = 1;
        int i12 = 255;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i8; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i8) + i16]);
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
        this.f9477u = i11 / i13;
        this.f9478v = i14 / i12;
        return i13;
    }

    private final void h(short[] sArr, int i7, int i8) {
        short[] l7 = l(this.f9468l, this.f9469m, i8);
        this.f9468l = l7;
        int i9 = this.f9458b;
        System.arraycopy(sArr, i7 * i9, l7, this.f9469m * i9, i9 * i8);
        this.f9469m += i8;
    }

    private final void i(short[] sArr, int i7, int i8) {
        int i9 = this.f9464h / i8;
        int i10 = this.f9458b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f9465i[i13] = (short) (i14 / i11);
        }
    }

    private static void j(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
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

    private final void k() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.f9469m;
        float f7 = this.f9459c;
        float f8 = this.f9460d;
        float f9 = f7 / f8;
        float f10 = this.f9461e * f8;
        double d7 = f9;
        float f11 = 1.0f;
        int i16 = 1;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            int i17 = this.f9467k;
            if (i17 >= this.f9464h) {
                int i18 = 0;
                while (true) {
                    int i19 = this.f9474r;
                    if (i19 > 0) {
                        int min = Math.min(this.f9464h, i19);
                        h(this.f9466j, i18, min);
                        this.f9474r -= min;
                        i18 += min;
                    } else {
                        short[] sArr = this.f9466j;
                        int i20 = this.f9457a;
                        int i21 = i20 > 4000 ? i20 / 4000 : 1;
                        if (this.f9458b == i16 && i21 == i16) {
                            i7 = g(sArr, i18, this.f9462f, this.f9463g);
                        } else {
                            i(sArr, i18, i21);
                            int g7 = g(this.f9465i, 0, this.f9462f / i21, this.f9463g / i21);
                            if (i21 != i16) {
                                int i22 = g7 * i21;
                                int i23 = i21 * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                int i26 = this.f9462f;
                                if (i24 < i26) {
                                    i24 = i26;
                                }
                                int i27 = this.f9463g;
                                if (i25 > i27) {
                                    i25 = i27;
                                }
                                if (this.f9458b == i16) {
                                    i7 = g(sArr, i18, i24, i25);
                                } else {
                                    i(sArr, i18, i16);
                                    i7 = g(this.f9465i, 0, i24, i25);
                                }
                            } else {
                                i7 = g7;
                            }
                        }
                        int i28 = this.f9477u;
                        int i29 = (i28 == 0 || (i10 = this.f9475s) == 0 || this.f9478v > i28 * 3 || i28 + i28 <= this.f9476t * 3) ? i7 : i10;
                        this.f9476t = i28;
                        this.f9475s = i7;
                        if (d7 > 1.0d) {
                            short[] sArr2 = this.f9466j;
                            if (f9 >= 2.0f) {
                                i9 = (int) (i29 / ((-1.0f) + f9));
                            } else {
                                this.f9474r = (int) ((i29 * (2.0f - f9)) / ((-1.0f) + f9));
                                i9 = i29;
                            }
                            short[] l7 = l(this.f9468l, this.f9469m, i9);
                            this.f9468l = l7;
                            int i30 = i9;
                            j(i9, this.f9458b, l7, this.f9469m, sArr2, i18, sArr2, i18 + i29);
                            this.f9469m += i30;
                            i18 += i29 + i30;
                        } else {
                            int i31 = i29;
                            short[] sArr3 = this.f9466j;
                            if (f9 < 0.5f) {
                                i8 = (int) ((i31 * f9) / (f11 - f9));
                            } else {
                                this.f9474r = (int) ((i31 * ((f9 + f9) - 1.0f)) / (f11 - f9));
                                i8 = i31;
                            }
                            int i32 = i31 + i8;
                            short[] l8 = l(this.f9468l, this.f9469m, i32);
                            this.f9468l = l8;
                            int i33 = this.f9458b;
                            System.arraycopy(sArr3, i18 * i33, l8, this.f9469m * i33, i33 * i31);
                            j(i8, this.f9458b, this.f9468l, this.f9469m + i31, sArr3, i18 + i31, sArr3, i18);
                            this.f9469m += i32;
                            i18 += i8;
                        }
                    }
                    if (this.f9464h + i18 > i17) {
                        break;
                    }
                    f11 = 1.0f;
                    i16 = 1;
                }
                int i34 = this.f9467k - i18;
                short[] sArr4 = this.f9466j;
                int i35 = this.f9458b;
                System.arraycopy(sArr4, i18 * i35, sArr4, 0, i35 * i34);
                this.f9467k = i34;
                f11 = 1.0f;
            }
        } else {
            h(this.f9466j, 0, this.f9467k);
            this.f9467k = 0;
        }
        if (f10 == f11 || this.f9469m == i15) {
            return;
        }
        int i36 = this.f9457a;
        int i37 = (int) (i36 / f10);
        while (true) {
            if (i37 <= 16384 && i36 <= 16384) {
                break;
            }
            i37 /= 2;
            i36 /= 2;
        }
        int i38 = this.f9469m - i15;
        short[] l9 = l(this.f9470n, this.f9471o, i38);
        this.f9470n = l9;
        short[] sArr5 = this.f9468l;
        int i39 = this.f9458b;
        System.arraycopy(sArr5, i15 * i39, l9, this.f9471o * i39, i39 * i38);
        this.f9469m = i15;
        this.f9471o += i38;
        int i40 = 0;
        while (true) {
            i11 = this.f9471o;
            i12 = i11 - 1;
            if (i40 >= i12) {
                break;
            }
            while (true) {
                i13 = this.f9472p + 1;
                i14 = this.f9473q;
                if (i13 * i37 <= i14 * i36) {
                    break;
                }
                this.f9468l = l(this.f9468l, this.f9469m, 1);
                int i41 = 0;
                while (true) {
                    int i42 = this.f9458b;
                    if (i41 < i42) {
                        short[] sArr6 = this.f9468l;
                        int i43 = this.f9469m;
                        short[] sArr7 = this.f9470n;
                        int i44 = (i40 * i42) + i41;
                        short s7 = sArr7[i44];
                        short s8 = sArr7[i44 + i42];
                        int i45 = this.f9473q;
                        int i46 = this.f9472p;
                        int i47 = (i46 + 1) * i37;
                        int i48 = i47 - (i45 * i36);
                        int i49 = i47 - (i46 * i37);
                        sArr6[(i43 * i42) + i41] = (short) (((s7 * i48) + ((i49 - i48) * s8)) / i49);
                        i41++;
                    }
                }
                this.f9473q++;
                this.f9469m++;
            }
            this.f9472p = i13;
            if (i13 == i36) {
                this.f9472p = 0;
                wu1.f(i14 == i37);
                this.f9473q = 0;
            }
            i40++;
        }
        if (i12 != 0) {
            short[] sArr8 = this.f9470n;
            int i50 = this.f9458b;
            System.arraycopy(sArr8, i12 * i50, sArr8, 0, (i11 - i12) * i50);
            this.f9471o -= i12;
        }
    }

    private final short[] l(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f9458b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    public final int a() {
        int i7 = this.f9469m * this.f9458b;
        return i7 + i7;
    }

    public final int b() {
        int i7 = this.f9467k * this.f9458b;
        return i7 + i7;
    }

    public final void c() {
        this.f9467k = 0;
        this.f9469m = 0;
        this.f9471o = 0;
        this.f9472p = 0;
        this.f9473q = 0;
        this.f9474r = 0;
        this.f9475s = 0;
        this.f9476t = 0;
        this.f9477u = 0;
        this.f9478v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f9458b, this.f9469m);
        shortBuffer.put(this.f9468l, 0, this.f9458b * min);
        int i7 = this.f9469m - min;
        this.f9469m = i7;
        short[] sArr = this.f9468l;
        int i8 = this.f9458b;
        System.arraycopy(sArr, min * i8, sArr, 0, i7 * i8);
    }

    public final void e() {
        int i7;
        int i8 = this.f9467k;
        float f7 = this.f9459c;
        float f8 = this.f9460d;
        int i9 = this.f9469m + ((int) ((((i8 / (f7 / f8)) + this.f9471o) / (this.f9461e * f8)) + 0.5f));
        short[] sArr = this.f9466j;
        int i10 = this.f9464h;
        this.f9466j = l(sArr, i8, i10 + i10 + i8);
        int i11 = 0;
        while (true) {
            int i12 = this.f9464h;
            i7 = i12 + i12;
            int i13 = this.f9458b;
            if (i11 >= i7 * i13) {
                break;
            }
            this.f9466j[(i13 * i8) + i11] = 0;
            i11++;
        }
        this.f9467k += i7;
        k();
        if (this.f9469m > i9) {
            this.f9469m = i9;
        }
        this.f9467k = 0;
        this.f9474r = 0;
        this.f9471o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i7 = this.f9458b;
        int i8 = remaining / i7;
        int i9 = i7 * i8;
        short[] l7 = l(this.f9466j, this.f9467k, i8);
        this.f9466j = l7;
        shortBuffer.get(l7, this.f9467k * this.f9458b, (i9 + i9) / 2);
        this.f9467k += i8;
        k();
    }
}
