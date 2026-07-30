package com.crrepa.v1;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: x, reason: collision with root package name */
    private static final int f13865x = -1;

    /* renamed from: y, reason: collision with root package name */
    private static final int f13866y = 12;

    /* renamed from: z, reason: collision with root package name */
    private static final int f13867z = 5003;

    /* renamed from: a, reason: collision with root package name */
    private int f13868a;

    /* renamed from: b, reason: collision with root package name */
    private int f13869b;

    /* renamed from: c, reason: collision with root package name */
    private int f13870c;

    /* renamed from: d, reason: collision with root package name */
    private int f13871d;

    /* renamed from: e, reason: collision with root package name */
    private int f13872e;

    /* renamed from: f, reason: collision with root package name */
    private int f13873f;

    /* renamed from: h, reason: collision with root package name */
    private int f13875h;

    /* renamed from: l, reason: collision with root package name */
    private int f13879l;

    /* renamed from: m, reason: collision with root package name */
    private int f13880m;

    /* renamed from: n, reason: collision with root package name */
    private int f13881n;

    /* renamed from: q, reason: collision with root package name */
    private int f13884q;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f13888u;

    /* renamed from: g, reason: collision with root package name */
    private int f13874g = 12;

    /* renamed from: i, reason: collision with root package name */
    private int f13876i = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f13877j = 5003;

    /* renamed from: k, reason: collision with root package name */
    private int f13878k = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f13882o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f13883p = 0;

    /* renamed from: r, reason: collision with root package name */
    private int[] f13885r = new int[5003];

    /* renamed from: s, reason: collision with root package name */
    private int[] f13886s = new int[5003];

    /* renamed from: t, reason: collision with root package name */
    private int[] f13887t = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* renamed from: v, reason: collision with root package name */
    private byte[] f13889v = new byte[256];

    /* renamed from: w, reason: collision with root package name */
    private boolean f13890w = false;

    b(int i8, int i9, byte[] bArr, int i10) {
        this.f13868a = i8;
        this.f13869b = i9;
        this.f13888u = bArr;
        this.f13870c = Math.max(2, i10);
    }

    private int a() {
        int i8 = this.f13871d;
        if (i8 == 0) {
            return -1;
        }
        this.f13871d = i8 - 1;
        byte[] bArr = this.f13888u;
        int i9 = this.f13872e;
        this.f13872e = i9 + 1;
        return bArr[i9] & 255;
    }

    void b(int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            this.f13885r[i9] = -1;
        }
    }

    void c(OutputStream outputStream) {
        int i8 = this.f13884q;
        if (i8 > 0) {
            outputStream.write(i8);
            outputStream.write(this.f13889v, 0, this.f13884q);
            this.f13884q = 0;
        }
    }

    final int a(int i8) {
        return (1 << i8) - 1;
    }

    void b(int i8, OutputStream outputStream) {
        int i9 = this.f13882o;
        int[] iArr = this.f13887t;
        int i10 = this.f13883p;
        int i11 = i9 & iArr[i10];
        this.f13882o = i11;
        if (i10 > 0) {
            this.f13882o = i11 | (i8 << i10);
        } else {
            this.f13882o = i8;
        }
        this.f13883p = i10 + this.f13873f;
        while (this.f13883p >= 8) {
            a((byte) (this.f13882o & 255), outputStream);
            this.f13882o >>= 8;
            this.f13883p -= 8;
        }
        if (this.f13878k > this.f13875h || this.f13890w) {
            if (this.f13890w) {
                int i12 = this.f13879l;
                this.f13873f = i12;
                this.f13875h = a(i12);
                this.f13890w = false;
            } else {
                int i13 = this.f13873f + 1;
                this.f13873f = i13;
                this.f13875h = i13 == this.f13874g ? this.f13876i : a(i13);
            }
        }
        if (i8 == this.f13881n) {
            while (this.f13883p > 0) {
                a((byte) (this.f13882o & 255), outputStream);
                this.f13882o >>= 8;
                this.f13883p -= 8;
            }
            c(outputStream);
        }
    }

    void a(byte b8, OutputStream outputStream) {
        byte[] bArr = this.f13889v;
        int i8 = this.f13884q;
        int i9 = i8 + 1;
        this.f13884q = i9;
        bArr[i8] = b8;
        if (i9 >= 254) {
            c(outputStream);
        }
    }

    void b(OutputStream outputStream) {
        outputStream.write(this.f13870c);
        this.f13871d = this.f13868a * this.f13869b;
        this.f13872e = 0;
        a(this.f13870c + 1, outputStream);
        outputStream.write(0);
    }

    void a(int i8, OutputStream outputStream) {
        int i9;
        this.f13879l = i8;
        int i10 = 0;
        this.f13890w = false;
        this.f13873f = i8;
        this.f13875h = a(i8);
        int i11 = 1 << (i8 - 1);
        this.f13880m = i11;
        this.f13881n = i11 + 1;
        this.f13878k = i11 + 2;
        this.f13884q = 0;
        int a8 = a();
        for (int i12 = this.f13877j; i12 < 65536; i12 *= 2) {
            i10++;
        }
        int i13 = 8 - i10;
        int i14 = this.f13877j;
        b(i14);
        b(this.f13880m, outputStream);
        while (true) {
            int a9 = a();
            if (a9 == -1) {
                b(a8, outputStream);
                b(this.f13881n, outputStream);
                return;
            }
            int i15 = (a9 << this.f13874g) + a8;
            int i16 = (a9 << i13) ^ a8;
            int i17 = this.f13885r[i16];
            if (i17 == i15) {
                a8 = this.f13886s[i16];
            } else {
                if (i17 >= 0) {
                    int i18 = i14 - i16;
                    if (i16 == 0) {
                        i18 = 1;
                    }
                    do {
                        i16 -= i18;
                        if (i16 < 0) {
                            i16 += i14;
                        }
                        i9 = this.f13885r[i16];
                        if (i9 == i15) {
                            a8 = this.f13886s[i16];
                            break;
                        }
                    } while (i9 >= 0);
                }
                b(a8, outputStream);
                int i19 = this.f13878k;
                if (i19 < this.f13876i) {
                    int[] iArr = this.f13886s;
                    this.f13878k = i19 + 1;
                    iArr[i16] = i19;
                    this.f13885r[i16] = i15;
                } else {
                    a(outputStream);
                }
                a8 = a9;
            }
        }
    }

    void a(OutputStream outputStream) {
        b(this.f13877j);
        int i8 = this.f13880m;
        this.f13878k = i8 + 2;
        this.f13890w = true;
        b(i8, outputStream);
    }
}
