package t0;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f21762a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21763b;

    /* renamed from: c, reason: collision with root package name */
    private final float f21764c;

    /* renamed from: d, reason: collision with root package name */
    private final float f21765d;

    /* renamed from: e, reason: collision with root package name */
    private final float f21766e;

    /* renamed from: f, reason: collision with root package name */
    private final int f21767f;

    /* renamed from: g, reason: collision with root package name */
    private final int f21768g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21769h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f21770i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f21771j;

    /* renamed from: k, reason: collision with root package name */
    private int f21772k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f21773l;

    /* renamed from: m, reason: collision with root package name */
    private int f21774m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f21775n;

    /* renamed from: o, reason: collision with root package name */
    private int f21776o;

    /* renamed from: p, reason: collision with root package name */
    private int f21777p;

    /* renamed from: q, reason: collision with root package name */
    private int f21778q;

    /* renamed from: r, reason: collision with root package name */
    private int f21779r;

    /* renamed from: s, reason: collision with root package name */
    private int f21780s;

    /* renamed from: t, reason: collision with root package name */
    private int f21781t;

    /* renamed from: u, reason: collision with root package name */
    private int f21782u;

    /* renamed from: v, reason: collision with root package name */
    private int f21783v;

    public i0(int i7, int i8, float f7, float f8, int i9) {
        this.f21762a = i7;
        this.f21763b = i8;
        this.f21764c = f7;
        this.f21765d = f8;
        this.f21766e = i7 / i9;
        this.f21767f = i7 / 400;
        int i10 = i7 / 65;
        this.f21768g = i10;
        int i11 = i10 * 2;
        this.f21769h = i11;
        this.f21770i = new short[i11];
        this.f21771j = new short[i11 * i8];
        this.f21773l = new short[i11 * i8];
        this.f21775n = new short[i11 * i8];
    }

    private void a(float f7, int i7) {
        int i8;
        int i9;
        if (this.f21774m == i7) {
            return;
        }
        int i10 = this.f21762a;
        int i11 = (int) (i10 / f7);
        while (true) {
            if (i11 <= 16384 && i10 <= 16384) {
                break;
            }
            i11 /= 2;
            i10 /= 2;
        }
        o(i7);
        int i12 = 0;
        while (true) {
            int i13 = this.f21776o;
            if (i12 >= i13 - 1) {
                u(i13 - 1);
                return;
            }
            while (true) {
                i8 = this.f21777p;
                int i14 = (i8 + 1) * i11;
                i9 = this.f21778q;
                if (i14 <= i9 * i10) {
                    break;
                }
                this.f21773l = f(this.f21773l, this.f21774m, 1);
                int i15 = 0;
                while (true) {
                    int i16 = this.f21763b;
                    if (i15 < i16) {
                        this.f21773l[(this.f21774m * i16) + i15] = n(this.f21775n, (i16 * i12) + i15, i10, i11);
                        i15++;
                    }
                }
                this.f21778q++;
                this.f21774m++;
            }
            int i17 = i8 + 1;
            this.f21777p = i17;
            if (i17 == i10) {
                this.f21777p = 0;
                o2.a.f(i9 == i11);
                this.f21778q = 0;
            }
            i12++;
        }
    }

    private void b(float f7) {
        int w6;
        int i7 = this.f21772k;
        if (i7 < this.f21769h) {
            return;
        }
        int i8 = 0;
        do {
            if (this.f21779r > 0) {
                w6 = c(i8);
            } else {
                int g7 = g(this.f21771j, i8);
                double d7 = f7;
                short[] sArr = this.f21771j;
                w6 = d7 > 1.0d ? g7 + w(sArr, i8, f7, g7) : m(sArr, i8, f7, g7);
            }
            i8 += w6;
        } while (this.f21769h + i8 <= i7);
        v(i8);
    }

    private int c(int i7) {
        int min = Math.min(this.f21769h, this.f21779r);
        d(this.f21771j, i7, min);
        this.f21779r -= min;
        return min;
    }

    private void d(short[] sArr, int i7, int i8) {
        short[] f7 = f(this.f21773l, this.f21774m, i8);
        this.f21773l = f7;
        int i9 = this.f21763b;
        System.arraycopy(sArr, i7 * i9, f7, this.f21774m * i9, i9 * i8);
        this.f21774m += i8;
    }

    private void e(short[] sArr, int i7, int i8) {
        int i9 = this.f21769h / i8;
        int i10 = this.f21763b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f21770i[i13] = (short) (i14 / i11);
        }
    }

    private short[] f(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f21763b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    private int g(short[] sArr, int i7) {
        int i8;
        int i9 = this.f21762a;
        int i10 = i9 > 4000 ? i9 / 4000 : 1;
        if (this.f21763b == 1 && i10 == 1) {
            i8 = h(sArr, i7, this.f21767f, this.f21768g);
        } else {
            e(sArr, i7, i10);
            int h7 = h(this.f21770i, 0, this.f21767f / i10, this.f21768g / i10);
            if (i10 != 1) {
                int i11 = h7 * i10;
                int i12 = i10 * 4;
                int i13 = i11 - i12;
                int i14 = i11 + i12;
                int i15 = this.f21767f;
                if (i13 < i15) {
                    i13 = i15;
                }
                int i16 = this.f21768g;
                if (i14 > i16) {
                    i14 = i16;
                }
                if (this.f21763b == 1) {
                    i8 = h(sArr, i7, i13, i14);
                } else {
                    e(sArr, i7, 1);
                    i8 = h(this.f21770i, 0, i13, i14);
                }
            } else {
                i8 = h7;
            }
        }
        int i17 = q(this.f21782u, this.f21783v) ? this.f21780s : i8;
        this.f21781t = this.f21782u;
        this.f21780s = i8;
        return i17;
    }

    private int h(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f21763b;
        int i11 = 1;
        int i12 = 255;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i8; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i8) + i16]);
            }
            if (i15 * i13 < i11 * i8) {
                i13 = i8;
                i11 = i15;
            }
            if (i15 * i12 > i14 * i8) {
                i12 = i8;
                i14 = i15;
            }
            i8++;
        }
        this.f21782u = i11 / i13;
        this.f21783v = i14 / i12;
        return i13;
    }

    private int m(short[] sArr, int i7, float f7, int i8) {
        int i9;
        if (f7 < 0.5f) {
            i9 = (int) ((i8 * f7) / (1.0f - f7));
        } else {
            this.f21779r = (int) ((i8 * ((2.0f * f7) - 1.0f)) / (1.0f - f7));
            i9 = i8;
        }
        int i10 = i8 + i9;
        short[] f8 = f(this.f21773l, this.f21774m, i10);
        this.f21773l = f8;
        int i11 = this.f21763b;
        System.arraycopy(sArr, i7 * i11, f8, this.f21774m * i11, i11 * i8);
        p(i9, this.f21763b, this.f21773l, this.f21774m + i8, sArr, i7 + i8, sArr, i7);
        this.f21774m += i10;
        return i9;
    }

    private short n(short[] sArr, int i7, int i8, int i9) {
        short s7 = sArr[i7];
        short s8 = sArr[i7 + this.f21763b];
        int i10 = this.f21778q * i8;
        int i11 = this.f21777p;
        int i12 = i11 * i9;
        int i13 = (i11 + 1) * i9;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) (((s7 * i14) + ((i15 - i14) * s8)) / i15);
    }

    private void o(int i7) {
        int i8 = this.f21774m - i7;
        short[] f7 = f(this.f21775n, this.f21776o, i8);
        this.f21775n = f7;
        short[] sArr = this.f21773l;
        int i9 = this.f21763b;
        System.arraycopy(sArr, i7 * i9, f7, this.f21776o * i9, i9 * i8);
        this.f21774m = i7;
        this.f21776o += i8;
    }

    private static void p(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
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

    private boolean q(int i7, int i8) {
        return i7 != 0 && this.f21780s != 0 && i8 <= i7 * 3 && i7 * 2 > this.f21781t * 3;
    }

    private void r() {
        int i7 = this.f21774m;
        float f7 = this.f21764c;
        float f8 = this.f21765d;
        float f9 = f7 / f8;
        float f10 = this.f21766e * f8;
        double d7 = f9;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            b(f9);
        } else {
            d(this.f21771j, 0, this.f21772k);
            this.f21772k = 0;
        }
        if (f10 != 1.0f) {
            a(f10, i7);
        }
    }

    private void u(int i7) {
        if (i7 == 0) {
            return;
        }
        short[] sArr = this.f21775n;
        int i8 = this.f21763b;
        System.arraycopy(sArr, i7 * i8, sArr, 0, (this.f21776o - i7) * i8);
        this.f21776o -= i7;
    }

    private void v(int i7) {
        int i8 = this.f21772k - i7;
        short[] sArr = this.f21771j;
        int i9 = this.f21763b;
        System.arraycopy(sArr, i7 * i9, sArr, 0, i9 * i8);
        this.f21772k = i8;
    }

    private int w(short[] sArr, int i7, float f7, int i8) {
        int i9;
        if (f7 >= 2.0f) {
            i9 = (int) (i8 / (f7 - 1.0f));
        } else {
            this.f21779r = (int) ((i8 * (2.0f - f7)) / (f7 - 1.0f));
            i9 = i8;
        }
        short[] f8 = f(this.f21773l, this.f21774m, i9);
        this.f21773l = f8;
        p(i9, this.f21763b, f8, this.f21774m, sArr, i7, sArr, i7 + i8);
        this.f21774m += i9;
        return i9;
    }

    public void i() {
        this.f21772k = 0;
        this.f21774m = 0;
        this.f21776o = 0;
        this.f21777p = 0;
        this.f21778q = 0;
        this.f21779r = 0;
        this.f21780s = 0;
        this.f21781t = 0;
        this.f21782u = 0;
        this.f21783v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f21763b, this.f21774m);
        shortBuffer.put(this.f21773l, 0, this.f21763b * min);
        int i7 = this.f21774m - min;
        this.f21774m = i7;
        short[] sArr = this.f21773l;
        int i8 = this.f21763b;
        System.arraycopy(sArr, min * i8, sArr, 0, i7 * i8);
    }

    public int k() {
        return this.f21774m * this.f21763b * 2;
    }

    public int l() {
        return this.f21772k * this.f21763b * 2;
    }

    public void s() {
        int i7;
        int i8 = this.f21772k;
        float f7 = this.f21764c;
        float f8 = this.f21765d;
        int i9 = this.f21774m + ((int) ((((i8 / (f7 / f8)) + this.f21776o) / (this.f21766e * f8)) + 0.5f));
        this.f21771j = f(this.f21771j, i8, (this.f21769h * 2) + i8);
        int i10 = 0;
        while (true) {
            i7 = this.f21769h;
            int i11 = this.f21763b;
            if (i10 >= i7 * 2 * i11) {
                break;
            }
            this.f21771j[(i11 * i8) + i10] = 0;
            i10++;
        }
        this.f21772k += i7 * 2;
        r();
        if (this.f21774m > i9) {
            this.f21774m = i9;
        }
        this.f21772k = 0;
        this.f21779r = 0;
        this.f21776o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i7 = this.f21763b;
        int i8 = remaining / i7;
        short[] f7 = f(this.f21771j, this.f21772k, i8);
        this.f21771j = f7;
        shortBuffer.get(f7, this.f21772k * this.f21763b, ((i7 * i8) * 2) / 2);
        this.f21772k += i8;
        r();
    }
}
