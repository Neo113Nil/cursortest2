package com.yandex.mobile.ads.impl;

import java.nio.ShortBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class b12 {

    /* renamed from: a, reason: collision with root package name */
    private final int f23552a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23553b;

    /* renamed from: c, reason: collision with root package name */
    private final float f23554c;

    /* renamed from: d, reason: collision with root package name */
    private final float f23555d;

    /* renamed from: e, reason: collision with root package name */
    private final float f23556e;

    /* renamed from: f, reason: collision with root package name */
    private final int f23557f;

    /* renamed from: g, reason: collision with root package name */
    private final int f23558g;

    /* renamed from: h, reason: collision with root package name */
    private final int f23559h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f23560i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f23561j;

    /* renamed from: k, reason: collision with root package name */
    private int f23562k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f23563l;

    /* renamed from: m, reason: collision with root package name */
    private int f23564m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f23565n;

    /* renamed from: o, reason: collision with root package name */
    private int f23566o;

    /* renamed from: p, reason: collision with root package name */
    private int f23567p;

    /* renamed from: q, reason: collision with root package name */
    private int f23568q;

    /* renamed from: r, reason: collision with root package name */
    private int f23569r;

    /* renamed from: s, reason: collision with root package name */
    private int f23570s;

    /* renamed from: t, reason: collision with root package name */
    private int f23571t;

    /* renamed from: u, reason: collision with root package name */
    private int f23572u;

    /* renamed from: v, reason: collision with root package name */
    private int f23573v;

    public b12(int i4, int i5, float f4, float f5, int i6) {
        this.f23552a = i4;
        this.f23553b = i5;
        this.f23554c = f4;
        this.f23555d = f5;
        this.f23556e = i4 / i6;
        this.f23557f = i4 / 400;
        int i7 = i4 / 65;
        this.f23558g = i7;
        int i8 = i7 * 2;
        this.f23559h = i8;
        this.f23560i = new short[i8];
        int i9 = i8 * i5;
        this.f23561j = new short[i9];
        this.f23563l = new short[i9];
        this.f23565n = new short[i9];
    }

    private void a(short[] sArr, int i4, int i5) {
        int i6 = this.f23559h / i5;
        int i7 = this.f23553b;
        int i8 = i5 * i7;
        int i9 = i4 * i7;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.f23560i[i10] = (short) (i11 / i8);
        }
    }

    private short[] b(short[] sArr, int i4, int i5) {
        int length = sArr.length;
        int i6 = this.f23553b;
        int i7 = length / i6;
        return i4 + i5 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i5) * i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0262 A[LOOP:4: B:53:0x004c->B:59:0x0262, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f A[EDGE_INSN: B:60:0x018f->B:61:0x018f BREAK  A[LOOP:4: B:53:0x004c->B:59:0x0262], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void d() {
        float f4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f23564m;
        float f5 = this.f23554c;
        float f6 = this.f23555d;
        float f7 = f5 / f6;
        float f8 = this.f23556e * f6;
        double d4 = f7;
        int i13 = 1;
        if (d4 > 1.00001d || d4 < 0.99999d) {
            int i14 = this.f23562k;
            if (i14 >= this.f23559h) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f23569r;
                    if (i16 > 0) {
                        i5 = Math.min(this.f23559h, i16);
                        short[] sArr = this.f23561j;
                        short[] b4 = b(this.f23563l, this.f23564m, i5);
                        this.f23563l = b4;
                        int i17 = this.f23553b;
                        f4 = 1.0f;
                        System.arraycopy(sArr, i15 * i17, b4, this.f23564m * i17, i17 * i5);
                        this.f23564m += i5;
                        this.f23569r -= i5;
                        i6 = i13;
                        i7 = i15;
                    } else {
                        f4 = 1.0f;
                        short[] sArr2 = this.f23561j;
                        int i18 = this.f23552a;
                        int i19 = i18 > 4000 ? i18 / 4000 : i13;
                        if (this.f23553b == i13 && i19 == i13) {
                            i4 = a(sArr2, i15, this.f23557f, this.f23558g);
                        } else {
                            a(sArr2, i15, i19);
                            int a4 = a(this.f23560i, 0, this.f23557f / i19, this.f23558g / i19);
                            if (i19 != i13) {
                                int i20 = a4 * i19;
                                int i21 = i19 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                int i24 = this.f23557f;
                                if (i22 < i24) {
                                    i22 = i24;
                                }
                                int i25 = this.f23558g;
                                if (i23 > i25) {
                                    i23 = i25;
                                }
                                if (this.f23553b == i13) {
                                    i4 = a(sArr2, i15, i22, i23);
                                } else {
                                    a(sArr2, i15, i13);
                                    i4 = a(this.f23560i, 0, i22, i23);
                                }
                            } else {
                                i4 = a4;
                            }
                        }
                        int i26 = this.f23572u;
                        int i27 = (i26 == 0 || (i9 = this.f23570s) == 0 || this.f23573v > i26 * 3 || i26 * 2 <= this.f23571t * 3) ? i4 : i9;
                        this.f23571t = i26;
                        this.f23570s = i4;
                        if (d4 > 1.0d) {
                            short[] sArr3 = this.f23561j;
                            if (f7 >= 2.0f) {
                                i8 = (int) (i27 / (f7 - 1.0f));
                            } else {
                                this.f23569r = (int) (((2.0f - f7) * i27) / (f7 - 1.0f));
                                i8 = i27;
                            }
                            short[] b5 = b(this.f23563l, this.f23564m, i8);
                            this.f23563l = b5;
                            int i28 = i27;
                            int i29 = i15;
                            a(i8, this.f23553b, b5, this.f23564m, sArr3, i29, sArr3, i15 + i28);
                            this.f23564m += i8;
                            i6 = i13;
                            i15 = i28 + i8 + i29;
                            if (this.f23559h + i15 <= i14) {
                                break;
                            } else {
                                i13 = i6;
                            }
                        } else {
                            int i30 = i15;
                            int i31 = i27;
                            short[] sArr4 = this.f23561j;
                            if (f7 < 0.5f) {
                                i5 = (int) ((i31 * f7) / (1.0f - f7));
                            } else {
                                this.f23569r = (int) ((((2.0f * f7) - 1.0f) * i31) / (1.0f - f7));
                                i5 = i31;
                            }
                            int i32 = i31 + i5;
                            short[] b6 = b(this.f23563l, this.f23564m, i32);
                            this.f23563l = b6;
                            int i33 = this.f23553b;
                            i6 = i13;
                            System.arraycopy(sArr4, i30 * i33, b6, this.f23564m * i33, i33 * i31);
                            a(i5, this.f23553b, this.f23563l, this.f23564m + i31, sArr4, i30 + i31, sArr4, i30);
                            i7 = i30;
                            this.f23564m += i32;
                        }
                    }
                    i15 = i7 + i5;
                    if (this.f23559h + i15 <= i14) {
                    }
                }
                int i34 = this.f23562k - i15;
                short[] sArr5 = this.f23561j;
                int i35 = this.f23553b;
                System.arraycopy(sArr5, i15 * i35, sArr5, 0, i35 * i34);
                this.f23562k = i34;
                if (f8 != f4 || this.f23564m == i12) {
                }
                int i36 = this.f23552a;
                int i37 = (int) (i36 / f8);
                while (true) {
                    if (i37 <= 16384 && i36 <= 16384) {
                        break;
                    }
                    i37 /= 2;
                    i36 /= 2;
                }
                int i38 = this.f23564m - i12;
                short[] b7 = b(this.f23565n, this.f23566o, i38);
                this.f23565n = b7;
                short[] sArr6 = this.f23563l;
                int i39 = this.f23553b;
                System.arraycopy(sArr6, i12 * i39, b7, this.f23566o * i39, i39 * i38);
                this.f23564m = i12;
                this.f23566o += i38;
                int i40 = 0;
                while (true) {
                    int i41 = this.f23566o;
                    int i42 = i41 - 1;
                    if (i40 >= i42) {
                        if (i42 == 0) {
                            return;
                        }
                        short[] sArr7 = this.f23565n;
                        int i43 = this.f23553b;
                        System.arraycopy(sArr7, i42 * i43, sArr7, 0, (i41 - i42) * i43);
                        this.f23566o -= i42;
                        return;
                    }
                    while (true) {
                        i10 = this.f23567p + 1;
                        int i44 = i10 * i37;
                        i11 = this.f23568q;
                        if (i44 <= i11 * i36) {
                            break;
                        }
                        this.f23563l = b(this.f23563l, this.f23564m, i6);
                        int i45 = 0;
                        while (true) {
                            int i46 = this.f23553b;
                            if (i45 < i46) {
                                short[] sArr8 = this.f23563l;
                                int i47 = (this.f23564m * i46) + i45;
                                short[] sArr9 = this.f23565n;
                                int i48 = (i40 * i46) + i45;
                                short s4 = sArr9[i48];
                                short s5 = sArr9[i48 + i46];
                                int i49 = this.f23568q * i36;
                                int i50 = this.f23567p;
                                int i51 = i50 * i37;
                                int i52 = (i50 + 1) * i37;
                                int i53 = i52 - i49;
                                int i54 = i52 - i51;
                                sArr8[i47] = (short) ((((i54 - i53) * s5) + (s4 * i53)) / i54);
                                i45++;
                            }
                        }
                        i6 = 1;
                        this.f23568q++;
                        this.f23564m++;
                    }
                    this.f23567p = i10;
                    if (i10 == i36) {
                        this.f23567p = 0;
                        if (i11 != i37) {
                            throw new IllegalStateException();
                        }
                        this.f23568q = 0;
                    }
                    i40++;
                }
            }
        } else {
            short[] sArr10 = this.f23561j;
            int i55 = this.f23562k;
            short[] b8 = b(this.f23563l, i12, i55);
            this.f23563l = b8;
            int i56 = this.f23553b;
            System.arraycopy(sArr10, 0, b8, this.f23564m * i56, i56 * i55);
            this.f23564m += i55;
            this.f23562k = 0;
        }
        i6 = 1;
        f4 = 1.0f;
        if (f8 != f4) {
        }
    }

    public final int c() {
        return this.f23562k * this.f23553b * 2;
    }

    public final void e() {
        int i4;
        int i5 = this.f23562k;
        float f4 = this.f23554c;
        float f5 = this.f23555d;
        int i6 = this.f23564m + ((int) ((((i5 / (f4 / f5)) + this.f23566o) / (this.f23556e * f5)) + 0.5f));
        this.f23561j = b(this.f23561j, i5, (this.f23559h * 2) + i5);
        int i7 = 0;
        while (true) {
            i4 = this.f23559h * 2;
            int i8 = this.f23553b;
            if (i7 >= i4 * i8) {
                break;
            }
            this.f23561j[(i8 * i5) + i7] = 0;
            i7++;
        }
        this.f23562k = i4 + this.f23562k;
        d();
        if (this.f23564m > i6) {
            this.f23564m = i6;
        }
        this.f23562k = 0;
        this.f23569r = 0;
        this.f23566o = 0;
    }

    public final int b() {
        return this.f23564m * this.f23553b * 2;
    }

    public final void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i4 = this.f23553b;
        int i5 = remaining / i4;
        short[] b4 = b(this.f23561j, this.f23562k, i5);
        this.f23561j = b4;
        shortBuffer.get(b4, this.f23562k * this.f23553b, ((i4 * i5) * 2) / 2);
        this.f23562k += i5;
        d();
    }

    private int a(short[] sArr, int i4, int i5, int i6) {
        int i7 = i4 * this.f23553b;
        int i8 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i5 <= i6) {
            int i12 = 0;
            for (int i13 = 0; i13 < i5; i13++) {
                i12 += Math.abs(sArr[i7 + i13] - sArr[(i7 + i5) + i13]);
            }
            if (i12 * i10 < i9 * i5) {
                i10 = i5;
                i9 = i12;
            }
            if (i12 * i8 > i11 * i5) {
                i8 = i5;
                i11 = i12;
            }
            i5++;
        }
        this.f23572u = i9 / i10;
        this.f23573v = i11 / i8;
        return i10;
    }

    public final void a() {
        this.f23562k = 0;
        this.f23564m = 0;
        this.f23566o = 0;
        this.f23567p = 0;
        this.f23568q = 0;
        this.f23569r = 0;
        this.f23570s = 0;
        this.f23571t = 0;
        this.f23572u = 0;
        this.f23573v = 0;
    }

    public final void a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f23553b, this.f23564m);
        shortBuffer.put(this.f23563l, 0, this.f23553b * min);
        int i4 = this.f23564m - min;
        this.f23564m = i4;
        short[] sArr = this.f23563l;
        int i5 = this.f23553b;
        System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
    }

    private static void a(int i4, int i5, short[] sArr, int i6, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i6 * i5) + i9;
            int i11 = (i8 * i5) + i9;
            int i12 = (i7 * i5) + i9;
            for (int i13 = 0; i13 < i4; i13++) {
                sArr[i10] = (short) (((sArr3[i11] * i13) + ((i4 - i13) * sArr2[i12])) / i4);
                i10 += i5;
                i12 += i5;
                i11 += i5;
            }
        }
    }
}
