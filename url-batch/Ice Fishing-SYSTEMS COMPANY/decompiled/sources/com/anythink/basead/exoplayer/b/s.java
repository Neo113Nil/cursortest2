package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.k.C0544a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6822a = 65;

    /* renamed from: b, reason: collision with root package name */
    private static final int f6823b = 400;

    /* renamed from: c, reason: collision with root package name */
    private static final int f6824c = 4000;

    /* renamed from: d, reason: collision with root package name */
    private final int f6825d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6826e;

    /* renamed from: f, reason: collision with root package name */
    private final float f6827f;

    /* renamed from: g, reason: collision with root package name */
    private final float f6828g;

    /* renamed from: h, reason: collision with root package name */
    private final float f6829h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final int f6830j;

    /* renamed from: k, reason: collision with root package name */
    private final int f6831k;

    /* renamed from: l, reason: collision with root package name */
    private final short[] f6832l;

    /* renamed from: m, reason: collision with root package name */
    private short[] f6833m;

    /* renamed from: n, reason: collision with root package name */
    private int f6834n;

    /* renamed from: o, reason: collision with root package name */
    private short[] f6835o;

    /* renamed from: p, reason: collision with root package name */
    private int f6836p;

    /* renamed from: q, reason: collision with root package name */
    private short[] f6837q;

    /* renamed from: r, reason: collision with root package name */
    private int f6838r;

    /* renamed from: s, reason: collision with root package name */
    private int f6839s;

    /* renamed from: t, reason: collision with root package name */
    private int f6840t;

    /* renamed from: u, reason: collision with root package name */
    private int f6841u;

    /* renamed from: v, reason: collision with root package name */
    private int f6842v;

    /* renamed from: w, reason: collision with root package name */
    private int f6843w;

    /* renamed from: x, reason: collision with root package name */
    private int f6844x;

    /* renamed from: y, reason: collision with root package name */
    private int f6845y;

    public s(int i, int i4, float f6, float f9, int i9) {
        this.f6825d = i;
        this.f6826e = i4;
        this.f6827f = f6;
        this.f6828g = f9;
        this.f6829h = i / i9;
        this.i = i / f6823b;
        int i10 = i / 65;
        this.f6830j = i10;
        int i11 = i10 * 2;
        this.f6831k = i11;
        this.f6832l = new short[i11];
        this.f6833m = new short[i11 * i4];
        this.f6835o = new short[i11 * i4];
        this.f6837q = new short[i11 * i4];
    }

    private void d(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f6837q;
        int i4 = this.f6826e;
        System.arraycopy(sArr, i * i4, sArr, 0, (this.f6838r - i) * i4);
        this.f6838r -= i;
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f6826e;
        int i4 = remaining / i;
        short[] a9 = a(this.f6833m, this.f6834n, i4);
        this.f6833m = a9;
        shortBuffer.get(a9, this.f6834n * this.f6826e, ((i * i4) * 2) / 2);
        this.f6834n += i4;
        d();
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f6826e, this.f6836p);
        shortBuffer.put(this.f6835o, 0, this.f6826e * min);
        int i = this.f6836p - min;
        this.f6836p = i;
        short[] sArr = this.f6835o;
        int i4 = this.f6826e;
        System.arraycopy(sArr, min * i4, sArr, 0, i * i4);
    }

    public final int c() {
        return this.f6836p;
    }

    private void c(short[] sArr, int i, int i4) {
        int i9 = this.f6831k / i4;
        int i10 = this.f6826e;
        int i11 = i4 * i10;
        int i12 = i * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f6832l[i13] = (short) (i14 / i11);
        }
    }

    private void d() {
        int i = this.f6836p;
        float f6 = this.f6827f;
        float f9 = this.f6828g;
        float f10 = f6 / f9;
        float f11 = this.f6829h * f9;
        double d2 = f10;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            b(this.f6833m, 0, this.f6834n);
            this.f6834n = 0;
        } else {
            a(f10);
        }
        if (f11 != 1.0f) {
            a(f11, i);
        }
    }

    public final void b() {
        this.f6834n = 0;
        this.f6836p = 0;
        this.f6838r = 0;
        this.f6839s = 0;
        this.f6840t = 0;
        this.f6841u = 0;
        this.f6842v = 0;
        this.f6843w = 0;
        this.f6844x = 0;
        this.f6845y = 0;
    }

    public final void a() {
        int i;
        int i4 = this.f6834n;
        float f6 = this.f6827f;
        float f9 = this.f6828g;
        int i9 = this.f6836p + ((int) ((((i4 / (f6 / f9)) + this.f6838r) / (this.f6829h * f9)) + 0.5f));
        this.f6833m = a(this.f6833m, i4, (this.f6831k * 2) + i4);
        int i10 = 0;
        while (true) {
            i = this.f6831k;
            int i11 = this.f6826e;
            if (i10 >= i * 2 * i11) {
                break;
            }
            this.f6833m[(i11 * i4) + i10] = 0;
            i10++;
        }
        this.f6834n = (i * 2) + this.f6834n;
        d();
        if (this.f6836p > i9) {
            this.f6836p = i9;
        }
        this.f6834n = 0;
        this.f6841u = 0;
        this.f6838r = 0;
    }

    private void c(int i) {
        int i4 = this.f6836p - i;
        short[] a9 = a(this.f6837q, this.f6838r, i4);
        this.f6837q = a9;
        short[] sArr = this.f6835o;
        int i9 = this.f6826e;
        System.arraycopy(sArr, i * i9, a9, this.f6838r * i9, i9 * i4);
        this.f6836p = i;
        this.f6838r += i4;
    }

    private void b(short[] sArr, int i, int i4) {
        short[] a9 = a(this.f6835o, this.f6836p, i4);
        this.f6835o = a9;
        int i9 = this.f6826e;
        System.arraycopy(sArr, i * i9, a9, this.f6836p * i9, i9 * i4);
        this.f6836p += i4;
    }

    private int b(int i) {
        int min = Math.min(this.f6831k, this.f6841u);
        b(this.f6833m, i, min);
        this.f6841u -= min;
        return min;
    }

    private short[] a(short[] sArr, int i, int i4) {
        int length = sArr.length;
        int i9 = this.f6826e;
        int i10 = length / i9;
        return i + i4 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i4) * i9);
    }

    private short b(short[] sArr, int i, int i4, int i9) {
        short s3 = sArr[i];
        short s6 = sArr[i + this.f6826e];
        int i10 = this.f6840t * i4;
        int i11 = this.f6839s;
        int i12 = i11 * i9;
        int i13 = (i11 + 1) * i9;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) ((((i15 - i14) * s6) + (s3 * i14)) / i15);
    }

    private void a(int i) {
        int i4 = this.f6834n - i;
        short[] sArr = this.f6833m;
        int i9 = this.f6826e;
        System.arraycopy(sArr, i * i9, sArr, 0, i9 * i4);
        this.f6834n = i4;
    }

    private int b(short[] sArr, int i, float f6, int i4) {
        int i9;
        if (f6 < 0.5f) {
            i9 = (int) ((i4 * f6) / (1.0f - f6));
        } else {
            this.f6841u = (int) ((((2.0f * f6) - 1.0f) * i4) / (1.0f - f6));
            i9 = i4;
        }
        int i10 = i4 + i9;
        short[] a9 = a(this.f6835o, this.f6836p, i10);
        this.f6835o = a9;
        int i11 = this.f6826e;
        System.arraycopy(sArr, i * i11, a9, this.f6836p * i11, i11 * i4);
        a(i9, this.f6826e, this.f6835o, this.f6836p + i4, sArr, i + i4, sArr, i);
        this.f6836p += i10;
        return i9;
    }

    private int a(short[] sArr, int i, int i4, int i9) {
        int i10 = i * this.f6826e;
        int i11 = com.anythink.basead.exoplayer.k.p.f8630b;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i4 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i4; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i4) + i16]);
            }
            if (i15 * i13 < i12 * i4) {
                i13 = i4;
                i12 = i15;
            }
            if (i15 * i11 > i14 * i4) {
                i11 = i4;
                i14 = i15;
            }
            i4++;
        }
        this.f6844x = i12 / i13;
        this.f6845y = i14 / i11;
        return i13;
    }

    private boolean a(int i, int i4) {
        return i != 0 && this.f6842v != 0 && i4 <= i * 3 && i * 2 > this.f6843w * 3;
    }

    private int a(short[] sArr, int i) {
        int i4;
        int i9;
        int i10 = this.f6825d;
        int i11 = i10 > f6824c ? i10 / f6824c : 1;
        if (this.f6826e == 1 && i11 == 1) {
            i4 = a(sArr, i, this.i, this.f6830j);
        } else {
            c(sArr, i, i11);
            int a9 = a(this.f6832l, 0, this.i / i11, this.f6830j / i11);
            if (i11 != 1) {
                int i12 = a9 * i11;
                int i13 = i11 * 4;
                int i14 = i12 - i13;
                int i15 = i12 + i13;
                int i16 = this.i;
                if (i14 < i16) {
                    i14 = i16;
                }
                int i17 = this.f6830j;
                if (i15 > i17) {
                    i15 = i17;
                }
                if (this.f6826e == 1) {
                    i4 = a(sArr, i, i14, i15);
                } else {
                    c(sArr, i, 1);
                    i4 = a(this.f6832l, 0, i14, i15);
                }
            } else {
                i4 = a9;
            }
        }
        int i18 = this.f6844x;
        int i19 = this.f6845y;
        if (i18 == 0 || (i9 = this.f6842v) == 0 || i19 > i18 * 3 || i18 * 2 <= this.f6843w * 3) {
            i9 = i4;
        }
        this.f6843w = i18;
        this.f6842v = i4;
        return i9;
    }

    private void a(float f6, int i) {
        int i4;
        int i9;
        int i10;
        if (this.f6836p == i) {
            return;
        }
        int i11 = this.f6825d;
        int i12 = (int) (i11 / f6);
        while (true) {
            if (i12 <= 16384 && i11 <= 16384) {
                break;
            }
            i12 /= 2;
            i11 /= 2;
        }
        int i13 = this.f6836p - i;
        short[] a9 = a(this.f6837q, this.f6838r, i13);
        this.f6837q = a9;
        short[] sArr = this.f6835o;
        int i14 = this.f6826e;
        System.arraycopy(sArr, i * i14, a9, this.f6838r * i14, i14 * i13);
        this.f6836p = i;
        this.f6838r += i13;
        int i15 = 0;
        while (true) {
            i4 = this.f6838r;
            if (i15 >= i4 - 1) {
                break;
            }
            while (true) {
                i9 = this.f6839s;
                int i16 = (i9 + 1) * i12;
                i10 = this.f6840t;
                if (i16 <= i10 * i11) {
                    break;
                }
                this.f6835o = a(this.f6835o, this.f6836p, 1);
                int i17 = 0;
                while (true) {
                    int i18 = this.f6826e;
                    if (i17 < i18) {
                        short[] sArr2 = this.f6835o;
                        int i19 = (this.f6836p * i18) + i17;
                        short[] sArr3 = this.f6837q;
                        int i20 = (i15 * i18) + i17;
                        short s3 = sArr3[i20];
                        short s6 = sArr3[i20 + i18];
                        int i21 = this.f6840t * i11;
                        int i22 = this.f6839s;
                        int i23 = i22 * i12;
                        int i24 = (i22 + 1) * i12;
                        int i25 = i24 - i21;
                        int i26 = i24 - i23;
                        sArr2[i19] = (short) ((((i26 - i25) * s6) + (s3 * i25)) / i26);
                        i17++;
                    }
                }
                this.f6840t++;
                this.f6836p++;
            }
            int i27 = i9 + 1;
            this.f6839s = i27;
            if (i27 == i11) {
                this.f6839s = 0;
                C0544a.b(i10 == i12);
                this.f6840t = 0;
            }
            i15++;
        }
        int i28 = i4 - 1;
        if (i28 != 0) {
            short[] sArr4 = this.f6837q;
            int i29 = this.f6826e;
            System.arraycopy(sArr4, i28 * i29, sArr4, 0, (i4 - i28) * i29);
            this.f6838r -= i28;
        }
    }

    private int a(short[] sArr, int i, float f6, int i4) {
        int i9;
        if (f6 >= 2.0f) {
            i9 = (int) (i4 / (f6 - 1.0f));
        } else {
            this.f6841u = (int) (((2.0f - f6) * i4) / (f6 - 1.0f));
            i9 = i4;
        }
        short[] a9 = a(this.f6835o, this.f6836p, i9);
        this.f6835o = a9;
        a(i9, this.f6826e, a9, this.f6836p, sArr, i, sArr, i + i4);
        this.f6836p += i9;
        return i9;
    }

    private void a(float f6) {
        int i;
        int i4;
        int i9;
        int i10;
        int i11 = this.f6834n;
        if (i11 < this.f6831k) {
            return;
        }
        int i12 = 0;
        do {
            int i13 = this.f6841u;
            if (i13 > 0) {
                i4 = Math.min(this.f6831k, i13);
                b(this.f6833m, i12, i4);
                this.f6841u -= i4;
            } else {
                short[] sArr = this.f6833m;
                int i14 = this.f6825d;
                int i15 = i14 > f6824c ? i14 / f6824c : 1;
                if (this.f6826e == 1 && i15 == 1) {
                    i = a(sArr, i12, this.i, this.f6830j);
                } else {
                    c(sArr, i12, i15);
                    int a9 = a(this.f6832l, 0, this.i / i15, this.f6830j / i15);
                    if (i15 != 1) {
                        int i16 = a9 * i15;
                        int i17 = i15 * 4;
                        int i18 = i16 - i17;
                        int i19 = i16 + i17;
                        int i20 = this.i;
                        if (i18 < i20) {
                            i18 = i20;
                        }
                        int i21 = this.f6830j;
                        if (i19 > i21) {
                            i19 = i21;
                        }
                        if (this.f6826e == 1) {
                            i = a(sArr, i12, i18, i19);
                        } else {
                            c(sArr, i12, 1);
                            i = a(this.f6832l, 0, i18, i19);
                        }
                    } else {
                        i = a9;
                    }
                }
                int i22 = this.f6844x;
                int i23 = (i22 == 0 || (i10 = this.f6842v) == 0 || this.f6845y > i22 * 3 || i22 * 2 <= this.f6843w * 3) ? i : i10;
                this.f6843w = i22;
                this.f6842v = i;
                if (f6 > 1.0d) {
                    short[] sArr2 = this.f6833m;
                    if (f6 >= 2.0f) {
                        i9 = (int) (i23 / (f6 - 1.0f));
                    } else {
                        this.f6841u = (int) (((2.0f - f6) * i23) / (f6 - 1.0f));
                        i9 = i23;
                    }
                    short[] a10 = a(this.f6835o, this.f6836p, i9);
                    this.f6835o = a10;
                    a(i9, this.f6826e, a10, this.f6836p, sArr2, i12, sArr2, i12 + i23);
                    this.f6836p += i9;
                    i12 = i23 + i9 + i12;
                } else {
                    short[] sArr3 = this.f6833m;
                    if (f6 < 0.5f) {
                        i4 = (int) ((i23 * f6) / (1.0f - f6));
                    } else {
                        this.f6841u = (int) ((((2.0f * f6) - 1.0f) * i23) / (1.0f - f6));
                        i4 = i23;
                    }
                    int i24 = i23 + i4;
                    short[] a11 = a(this.f6835o, this.f6836p, i24);
                    this.f6835o = a11;
                    int i25 = this.f6826e;
                    System.arraycopy(sArr3, i12 * i25, a11, this.f6836p * i25, i25 * i23);
                    int i26 = i12;
                    a(i4, this.f6826e, this.f6835o, this.f6836p + i23, sArr3, i12 + i23, sArr3, i26);
                    i12 = i26;
                    this.f6836p += i24;
                }
            }
            i12 += i4;
        } while (this.f6831k + i12 <= i11);
        int i27 = this.f6834n - i12;
        short[] sArr4 = this.f6833m;
        int i28 = this.f6826e;
        System.arraycopy(sArr4, i12 * i28, sArr4, 0, i28 * i27);
        this.f6834n = i27;
    }

    private static void a(int i, int i4, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i4; i12++) {
            int i13 = (i9 * i4) + i12;
            int i14 = (i11 * i4) + i12;
            int i15 = (i10 * i4) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                sArr[i13] = (short) (((sArr3[i14] * i16) + ((i - i16) * sArr2[i15])) / i);
                i13 += i4;
                i15 += i4;
                i14 += i4;
            }
        }
    }
}
