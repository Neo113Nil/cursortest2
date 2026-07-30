package com.crrepa.v1;

import com.google.android.material.internal.ViewUtils;

/* loaded from: classes3.dex */
public class c {
    protected static final int A = 6;
    protected static final int B = 64;
    protected static final int C = 2048;
    protected static final int D = 30;
    protected static final int E = 10;
    protected static final int F = 1024;
    protected static final int G = 8;
    protected static final int H = 256;
    protected static final int I = 18;
    protected static final int J = 262144;

    /* renamed from: j, reason: collision with root package name */
    protected static final int f13891j = 256;

    /* renamed from: k, reason: collision with root package name */
    protected static final int f13892k = 499;

    /* renamed from: l, reason: collision with root package name */
    protected static final int f13893l = 491;

    /* renamed from: m, reason: collision with root package name */
    protected static final int f13894m = 487;

    /* renamed from: n, reason: collision with root package name */
    protected static final int f13895n = 503;

    /* renamed from: o, reason: collision with root package name */
    protected static final int f13896o = 1509;

    /* renamed from: p, reason: collision with root package name */
    protected static final int f13897p = 255;

    /* renamed from: q, reason: collision with root package name */
    protected static final int f13898q = 4;

    /* renamed from: r, reason: collision with root package name */
    protected static final int f13899r = 100;

    /* renamed from: s, reason: collision with root package name */
    protected static final int f13900s = 16;

    /* renamed from: t, reason: collision with root package name */
    protected static final int f13901t = 65536;

    /* renamed from: u, reason: collision with root package name */
    protected static final int f13902u = 10;

    /* renamed from: v, reason: collision with root package name */
    protected static final int f13903v = 1024;

    /* renamed from: w, reason: collision with root package name */
    protected static final int f13904w = 10;

    /* renamed from: x, reason: collision with root package name */
    protected static final int f13905x = 64;

    /* renamed from: y, reason: collision with root package name */
    protected static final int f13906y = 65536;

    /* renamed from: z, reason: collision with root package name */
    protected static final int f13907z = 32;

    /* renamed from: a, reason: collision with root package name */
    protected int f13908a;

    /* renamed from: b, reason: collision with root package name */
    protected byte[] f13909b;

    /* renamed from: c, reason: collision with root package name */
    protected int f13910c;

    /* renamed from: d, reason: collision with root package name */
    protected int f13911d;

    /* renamed from: f, reason: collision with root package name */
    protected int[] f13913f = new int[256];

    /* renamed from: g, reason: collision with root package name */
    protected int[] f13914g = new int[256];

    /* renamed from: h, reason: collision with root package name */
    protected int[] f13915h = new int[256];

    /* renamed from: i, reason: collision with root package name */
    protected int[] f13916i = new int[32];

    /* renamed from: e, reason: collision with root package name */
    protected int[][] f13912e = new int[256][];

    public c(byte[] bArr, int i8, int i9) {
        this.f13909b = bArr;
        this.f13910c = i8;
        this.f13911d = i9;
        for (int i10 = 0; i10 < 256; i10++) {
            this.f13912e[i10] = new int[]{r6, r6, r6, 0};
            int i11 = (i10 << 12) / 256;
            this.f13915h[i10] = 256;
            this.f13914g[i10] = 0;
        }
    }

    protected int a(int i8, int i9, int i10) {
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < 256; i15++) {
            int[] iArr = this.f13912e[i15];
            int i16 = iArr[0] - i8;
            if (i16 < 0) {
                i16 = -i16;
            }
            int i17 = iArr[1] - i9;
            if (i17 < 0) {
                i17 = -i17;
            }
            int i18 = i16 + i17;
            int i19 = iArr[2] - i10;
            if (i19 < 0) {
                i19 = -i19;
            }
            int i20 = i18 + i19;
            if (i20 < i11) {
                i14 = i15;
                i11 = i20;
            }
            int[] iArr2 = this.f13914g;
            int i21 = i20 - (iArr2[i15] >> 12);
            if (i21 < i12) {
                i13 = i15;
                i12 = i21;
            }
            int[] iArr3 = this.f13915h;
            int i22 = iArr3[i15];
            int i23 = i22 >> 10;
            iArr3[i15] = i22 - i23;
            iArr2[i15] = iArr2[i15] + (i23 << 10);
        }
        int[] iArr4 = this.f13915h;
        iArr4[i14] = iArr4[i14] + 64;
        int[] iArr5 = this.f13914g;
        iArr5[i14] = iArr5[i14] - 65536;
        return i13;
    }

    public int b(int i8, int i9, int i10) {
        int i11 = this.f13913f[i9];
        int i12 = i11 - 1;
        int i13 = 1000;
        int i14 = -1;
        while (true) {
            if (i11 >= 256 && i12 < 0) {
                return i14;
            }
            if (i11 < 256) {
                int[] iArr = this.f13912e[i11];
                int i15 = iArr[1] - i9;
                if (i15 >= i13) {
                    i11 = 256;
                } else {
                    i11++;
                    if (i15 < 0) {
                        i15 = -i15;
                    }
                    int i16 = iArr[0] - i8;
                    if (i16 < 0) {
                        i16 = -i16;
                    }
                    int i17 = i15 + i16;
                    if (i17 < i13) {
                        int i18 = iArr[2] - i10;
                        if (i18 < 0) {
                            i18 = -i18;
                        }
                        int i19 = i17 + i18;
                        if (i19 < i13) {
                            i14 = iArr[3];
                            i13 = i19;
                        }
                    }
                }
            }
            if (i12 >= 0) {
                int[] iArr2 = this.f13912e[i12];
                int i20 = i9 - iArr2[1];
                if (i20 >= i13) {
                    i12 = -1;
                } else {
                    i12--;
                    if (i20 < 0) {
                        i20 = -i20;
                    }
                    int i21 = iArr2[0] - i8;
                    if (i21 < 0) {
                        i21 = -i21;
                    }
                    int i22 = i20 + i21;
                    if (i22 < i13) {
                        int i23 = iArr2[2] - i10;
                        if (i23 < 0) {
                            i23 = -i23;
                        }
                        int i24 = i23 + i22;
                        if (i24 < i13) {
                            i14 = iArr2[3];
                            i13 = i24;
                        }
                    }
                }
            }
        }
    }

    public void c() {
        int i8 = this.f13910c;
        if (i8 < f13896o) {
            this.f13911d = 1;
        }
        int i9 = this.f13911d;
        this.f13908a = ((i9 - 1) / 3) + 30;
        byte[] bArr = this.f13909b;
        int i10 = i8 / (i9 * 3);
        int i11 = i10 / 100;
        for (int i12 = 0; i12 < 32; i12++) {
            this.f13916i[i12] = 1024 * (((1024 - (i12 * i12)) * 256) / 1024);
        }
        int i13 = this.f13910c;
        int i14 = i13 < f13896o ? 3 : i13 % f13892k != 0 ? 1497 : i13 % f13893l != 0 ? 1473 : i13 % f13894m != 0 ? 1461 : f13896o;
        int i15 = i11;
        int i16 = 0;
        int i17 = 2048;
        int i18 = 1024;
        int i19 = 32;
        int i20 = 0;
        while (i16 < i10) {
            int i21 = (bArr[i20] & 255) << 4;
            int i22 = (bArr[i20 + 1] & 255) << 4;
            int i23 = (bArr[i20 + 2] & 255) << 4;
            int a8 = a(i21, i22, i23);
            int i24 = i16;
            b(i18, a8, i21, i22, i23);
            if (i19 != 0) {
                a(i19, a8, i21, i22, i23);
            }
            int i25 = i20 + i14;
            if (i25 >= i8) {
                i25 -= this.f13910c;
            }
            i20 = i25;
            i16 = i24 + 1;
            if (i15 == 0) {
                i15 = 1;
            }
            if (i16 % i15 == 0) {
                i18 -= i18 / this.f13908a;
                i17 -= i17 / 30;
                int i26 = i17 >> 6;
                if (i26 <= 1) {
                    i26 = 0;
                }
                for (int i27 = 0; i27 < i26; i27++) {
                    int i28 = i26 * i26;
                    this.f13916i[i27] = (((i28 - (i27 * i27)) * 256) / i28) * i18;
                }
                i19 = i26;
            }
        }
    }

    public byte[] d() {
        c();
        e();
        b();
        return a();
    }

    public void e() {
        for (int i8 = 0; i8 < 256; i8++) {
            int[] iArr = this.f13912e[i8];
            iArr[0] = iArr[0] >> 4;
            iArr[1] = iArr[1] >> 4;
            iArr[2] = iArr[2] >> 4;
            iArr[3] = i8;
        }
    }

    protected void a(int i8, int i9, int i10, int i11, int i12) {
        int i13 = i9 - i8;
        if (i13 < -1) {
            i13 = -1;
        }
        int i14 = i9 + i8;
        if (i14 > 256) {
            i14 = 256;
        }
        int i15 = i9 + 1;
        int i16 = i9 - 1;
        int i17 = 1;
        while (true) {
            if (i15 >= i14 && i16 <= i13) {
                return;
            }
            int i18 = i17 + 1;
            int i19 = this.f13916i[i17];
            if (i15 < i14) {
                int i20 = i15 + 1;
                int[] iArr = this.f13912e[i15];
                try {
                    int i21 = iArr[0];
                    iArr[0] = i21 - (((i21 - i10) * i19) / 262144);
                    int i22 = iArr[1];
                    iArr[1] = i22 - (((i22 - i11) * i19) / 262144);
                    int i23 = iArr[2];
                    iArr[2] = i23 - (((i23 - i12) * i19) / 262144);
                } catch (Exception unused) {
                }
                i15 = i20;
            }
            if (i16 > i13) {
                int i24 = i16 - 1;
                int[] iArr2 = this.f13912e[i16];
                try {
                    int i25 = iArr2[0];
                    iArr2[0] = i25 - (((i25 - i10) * i19) / 262144);
                    int i26 = iArr2[1];
                    iArr2[1] = i26 - (((i26 - i11) * i19) / 262144);
                    int i27 = iArr2[2];
                    iArr2[2] = i27 - ((i19 * (i27 - i12)) / 262144);
                } catch (Exception unused2) {
                }
                i17 = i18;
                i16 = i24;
            } else {
                i17 = i18;
            }
        }
    }

    public void b() {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < 256) {
            int[] iArr = this.f13912e[i8];
            int i11 = iArr[1];
            int i12 = i8 + 1;
            int i13 = i8;
            for (int i14 = i12; i14 < 256; i14++) {
                int i15 = this.f13912e[i14][1];
                if (i15 < i11) {
                    i13 = i14;
                    i11 = i15;
                }
            }
            int[] iArr2 = this.f13912e[i13];
            if (i8 != i13) {
                int i16 = iArr2[0];
                iArr2[0] = iArr[0];
                iArr[0] = i16;
                int i17 = iArr2[1];
                iArr2[1] = iArr[1];
                iArr[1] = i17;
                int i18 = iArr2[2];
                iArr2[2] = iArr[2];
                iArr[2] = i18;
                int i19 = iArr2[3];
                iArr2[3] = iArr[3];
                iArr[3] = i19;
            }
            if (i11 != i9) {
                this.f13913f[i9] = (i10 + i8) >> 1;
                while (true) {
                    i9++;
                    if (i9 >= i11) {
                        break;
                    } else {
                        this.f13913f[i9] = i8;
                    }
                }
                i10 = i8;
                i9 = i11;
            }
            i8 = i12;
        }
        this.f13913f[i9] = (i10 + 255) >> 1;
        for (int i20 = i9 + 1; i20 < 256; i20++) {
            this.f13913f[i20] = 255;
        }
    }

    public byte[] a() {
        byte[] bArr = new byte[ViewUtils.EDGE_TO_EDGE_FLAGS];
        int[] iArr = new int[256];
        for (int i8 = 0; i8 < 256; i8++) {
            iArr[this.f13912e[i8][3]] = i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int[] iArr2 = this.f13912e[iArr[i10]];
            bArr[i9] = (byte) iArr2[0];
            int i11 = i9 + 2;
            bArr[i9 + 1] = (byte) iArr2[1];
            i9 += 3;
            bArr[i11] = (byte) iArr2[2];
        }
        return bArr;
    }

    protected void b(int i8, int i9, int i10, int i11, int i12) {
        int[] iArr = this.f13912e[i9];
        int i13 = iArr[0];
        iArr[0] = i13 - (((i13 - i10) * i8) / 1024);
        int i14 = iArr[1];
        iArr[1] = i14 - (((i14 - i11) * i8) / 1024);
        int i15 = iArr[2];
        iArr[2] = i15 - ((i8 * (i15 - i12)) / 1024);
    }
}
