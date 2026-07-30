package com.baidu.bbalbscesium.k.a;

import java.lang.reflect.Array;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: h, reason: collision with root package name */
    private static int[] f4064h;

    /* renamed from: i, reason: collision with root package name */
    private static int[] f4065i;

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f4066j = new byte[256];

    /* renamed from: k, reason: collision with root package name */
    private static final byte[] f4067k = new byte[256];

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f4068l = new int[256];

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f4069m = new int[256];

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f4070n = new int[256];

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f4071o = new int[256];

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f4072p = new int[256];

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f4073q = new int[256];

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f4074r = new int[256];

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f4075s = new int[256];

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f4076t = new int[256];

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f4077u = new int[256];

    /* renamed from: v, reason: collision with root package name */
    private static final int[] f4078v = new int[256];

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f4079w = new int[256];

    /* renamed from: x, reason: collision with root package name */
    private static final byte[] f4080x = new byte[30];

    /* renamed from: c, reason: collision with root package name */
    private boolean f4081c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4082d = false;

    /* renamed from: e, reason: collision with root package name */
    private Object[] f4083e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f4084f = null;

    /* renamed from: g, reason: collision with root package name */
    private int f4085g = 0;

    static {
        int[] iArr = new int[256];
        f4064h = iArr;
        f4065i = new int[256];
        iArr[0] = 1;
        for (int i8 = 1; i8 < 256; i8++) {
            int[] iArr2 = f4064h;
            int i9 = iArr2[i8 - 1];
            int i10 = i9 ^ (i9 << 1);
            if ((i10 & 256) != 0) {
                i10 ^= 283;
            }
            iArr2[i8] = i10;
        }
        for (int i11 = 1; i11 < 255; i11++) {
            f4065i[f4064h[i11]] = i11;
        }
        byte[][] bArr = {new byte[]{1, 1, 1, 1, 1, 0, 0, 0}, new byte[]{0, 1, 1, 1, 1, 1, 0, 0}, new byte[]{0, 0, 1, 1, 1, 1, 1, 0}, new byte[]{0, 0, 0, 1, 1, 1, 1, 1}, new byte[]{1, 0, 0, 0, 1, 1, 1, 1}, new byte[]{1, 1, 0, 0, 0, 1, 1, 1}, new byte[]{1, 1, 1, 0, 0, 0, 1, 1}, new byte[]{1, 1, 1, 1, 0, 0, 0, 1}};
        byte[] bArr2 = {0, 1, 1, 0, 0, 0, 1, 1};
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 8);
        bArr3[1][7] = 1;
        for (int i12 = 2; i12 < 256; i12++) {
            int i13 = f4064h[255 - f4065i[i12]];
            for (int i14 = 0; i14 < 8; i14++) {
                bArr3[i12][i14] = (byte) ((i13 >>> (7 - i14)) & 1);
            }
        }
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 8);
        for (int i15 = 0; i15 < 256; i15++) {
            for (int i16 = 0; i16 < 8; i16++) {
                bArr4[i15][i16] = bArr2[i16];
                for (int i17 = 0; i17 < 8; i17++) {
                    byte[] bArr5 = bArr4[i15];
                    bArr5[i16] = (byte) (bArr5[i16] ^ (bArr[i16][i17] * bArr3[i15][i17]));
                }
            }
        }
        for (int i18 = 0; i18 < 256; i18++) {
            f4066j[i18] = (byte) (bArr4[i18][0] << 7);
            for (int i19 = 1; i19 < 8; i19++) {
                byte[] bArr6 = f4066j;
                bArr6[i18] = (byte) (bArr6[i18] ^ (bArr4[i18][i19] << (7 - i19)));
            }
            f4067k[f4066j[i18] & 255] = (byte) i18;
        }
        byte[][] bArr7 = {new byte[]{2, 1, 1, 3}, new byte[]{3, 2, 1, 1}, new byte[]{1, 3, 2, 1}, new byte[]{1, 1, 3, 2}};
        byte[][] bArr8 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 8);
        for (int i20 = 0; i20 < 4; i20++) {
            for (int i21 = 0; i21 < 4; i21++) {
                bArr8[i20][i21] = bArr7[i20][i21];
            }
            bArr8[i20][i20 + 4] = 1;
        }
        byte[][] bArr9 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 4);
        for (int i22 = 0; i22 < 4; i22++) {
            byte b8 = bArr8[i22][i22];
            if (b8 == 0) {
                int i23 = i22 + 1;
                while (bArr8[i23][i22] == 0 && i23 < 4) {
                    i23++;
                }
                if (i23 == 4) {
                    throw new RuntimeException("G matrix is not invertible");
                }
                for (int i24 = 0; i24 < 8; i24++) {
                    byte[] bArr10 = bArr8[i22];
                    byte b9 = bArr10[i24];
                    byte[] bArr11 = bArr8[i23];
                    bArr10[i24] = bArr11[i24];
                    bArr11[i24] = b9;
                }
                b8 = bArr8[i22][i22];
            }
            for (int i25 = 0; i25 < 8; i25++) {
                byte[] bArr12 = bArr8[i22];
                byte b10 = bArr12[i25];
                if (b10 != 0) {
                    int[] iArr3 = f4064h;
                    int[] iArr4 = f4065i;
                    bArr12[i25] = (byte) iArr3[((iArr4[b10 & 255] + 255) - iArr4[b8 & 255]) % 255];
                }
            }
            for (int i26 = 0; i26 < 4; i26++) {
                if (i22 != i26) {
                    for (int i27 = i22 + 1; i27 < 8; i27++) {
                        byte[] bArr13 = bArr8[i26];
                        bArr13[i27] = (byte) (bArr13[i27] ^ a(bArr8[i22][i27], bArr13[i22]));
                    }
                    bArr8[i26][i22] = 0;
                }
            }
        }
        for (int i28 = 0; i28 < 4; i28++) {
            for (int i29 = 0; i29 < 4; i29++) {
                bArr9[i28][i29] = bArr8[i28][i29 + 4];
            }
        }
        for (int i30 = 0; i30 < 256; i30++) {
            byte b11 = f4066j[i30];
            f4068l[i30] = a(b11, bArr7[0]);
            f4069m[i30] = a(b11, bArr7[1]);
            f4070n[i30] = a(b11, bArr7[2]);
            f4071o[i30] = a(b11, bArr7[3]);
            byte b12 = f4067k[i30];
            f4072p[i30] = a(b12, bArr9[0]);
            f4073q[i30] = a(b12, bArr9[1]);
            f4074r[i30] = a(b12, bArr9[2]);
            f4075s[i30] = a(b12, bArr9[3]);
            f4076t[i30] = a(i30, bArr9[0]);
            f4077u[i30] = a(i30, bArr9[1]);
            f4078v[i30] = a(i30, bArr9[2]);
            f4079w[i30] = a(i30, bArr9[3]);
        }
        f4080x[0] = 1;
        int i31 = 1;
        for (int i32 = 1; i32 < 30; i32++) {
            i31 = a(2, i31);
            f4080x[i32] = (byte) i31;
        }
        f4065i = null;
        f4064h = null;
    }

    int a() {
        return 16;
    }

    void b(byte[] bArr, int i8, byte[] bArr2, int i9) {
        int i10 = ((bArr[i8 + 1] & 255) << 16) | (bArr[i8] << 24) | ((bArr[i8 + 2] & 255) << 8) | (bArr[i8 + 3] & 255);
        int[] iArr = this.f4084f;
        int i11 = i10 ^ iArr[0];
        int i12 = ((((bArr[i8 + 4] << 24) | ((bArr[i8 + 5] & 255) << 16)) | ((bArr[i8 + 6] & 255) << 8)) | (bArr[i8 + 7] & 255)) ^ iArr[1];
        int i13 = (((((bArr[i8 + 9] & 255) << 16) | (bArr[i8 + 8] << 24)) | ((bArr[i8 + 10] & 255) << 8)) | (bArr[i8 + 11] & 255)) ^ iArr[2];
        int i14 = iArr[3] ^ (((((bArr[i8 + 13] & 255) << 16) | (bArr[i8 + 12] << 24)) | ((bArr[i8 + 14] & 255) << 8)) | (bArr[i8 + 15] & 255));
        int i15 = 4;
        while (i15 < this.f4085g) {
            int[] iArr2 = f4068l;
            int i16 = iArr2[i11 >>> 24];
            int[] iArr3 = f4069m;
            int i17 = i16 ^ iArr3[(i12 >>> 16) & 255];
            int[] iArr4 = f4070n;
            int i18 = i17 ^ iArr4[(i13 >>> 8) & 255];
            int[] iArr5 = f4071o;
            int i19 = i18 ^ iArr5[i14 & 255];
            int[] iArr6 = this.f4084f;
            int i20 = i19 ^ iArr6[i15];
            int i21 = iArr6[i15 + 1] ^ (((iArr2[i12 >>> 24] ^ iArr3[(i13 >>> 16) & 255]) ^ iArr4[(i14 >>> 8) & 255]) ^ iArr5[i11 & 255]);
            int i22 = ((iArr3[(i14 >>> 16) & 255] ^ iArr2[i13 >>> 24]) ^ iArr4[(i11 >>> 8) & 255]) ^ iArr5[i12 & 255];
            int i23 = i15 + 3;
            int i24 = i22 ^ iArr6[i15 + 2];
            i15 += 4;
            i14 = iArr6[i23] ^ (((iArr3[(i11 >>> 16) & 255] ^ iArr2[i14 >>> 24]) ^ iArr4[(i12 >>> 8) & 255]) ^ iArr5[i13 & 255]);
            i13 = i24;
            i11 = i20;
            i12 = i21;
        }
        int[] iArr7 = this.f4084f;
        int i25 = iArr7[i15];
        byte[] bArr3 = f4066j;
        bArr2[i9] = (byte) (bArr3[i11 >>> 24] ^ (i25 >>> 24));
        bArr2[i9 + 1] = (byte) (bArr3[(i12 >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[i9 + 2] = (byte) (bArr3[(i13 >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[i9 + 3] = (byte) (i25 ^ bArr3[i14 & 255]);
        int i26 = iArr7[i15 + 1];
        bArr2[i9 + 4] = (byte) (bArr3[i12 >>> 24] ^ (i26 >>> 24));
        bArr2[i9 + 5] = (byte) (bArr3[(i13 >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[i9 + 6] = (byte) (bArr3[(i14 >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[i9 + 7] = (byte) (i26 ^ bArr3[i11 & 255]);
        int i27 = iArr7[i15 + 2];
        bArr2[i9 + 8] = (byte) (bArr3[i13 >>> 24] ^ (i27 >>> 24));
        bArr2[i9 + 9] = (byte) (bArr3[(i14 >>> 16) & 255] ^ (i27 >>> 16));
        bArr2[i9 + 10] = (byte) (bArr3[(i11 >>> 8) & 255] ^ (i27 >>> 8));
        bArr2[i9 + 11] = (byte) (i27 ^ bArr3[i12 & 255]);
        int i28 = iArr7[i15 + 3];
        bArr2[i9 + 12] = (byte) (bArr3[i14 >>> 24] ^ (i28 >>> 24));
        bArr2[i9 + 13] = (byte) (bArr3[(i11 >>> 16) & 255] ^ (i28 >>> 16));
        bArr2[i9 + 14] = (byte) (bArr3[(i12 >>> 8) & 255] ^ (i28 >>> 8));
        bArr2[i9 + 15] = (byte) (bArr3[i13 & 255] ^ i28);
    }

    private static int a(int i8) {
        return (i8 >> 2) + 6;
    }

    static final boolean b(int i8) {
        int i9 = 0;
        while (true) {
            int[] iArr = a.f4063b;
            if (i9 >= iArr.length) {
                return false;
            }
            if (i8 == iArr[i9]) {
                return true;
            }
            i9++;
        }
    }

    private static final int a(int i8, int i9) {
        if (i8 == 0 || i9 == 0) {
            return 0;
        }
        int[] iArr = f4064h;
        int[] iArr2 = f4065i;
        return iArr[(iArr2[i8 & 255] + iArr2[i9 & 255]) % 255];
    }

    private static final int a(int i8, byte[] bArr) {
        if (i8 == 0) {
            return 0;
        }
        int[] iArr = f4065i;
        int i9 = iArr[i8 & 255];
        byte b8 = bArr[0];
        int i10 = b8 != 0 ? f4064h[(iArr[b8 & 255] + i9) % 255] & 255 : 0;
        byte b9 = bArr[1];
        int i11 = b9 != 0 ? f4064h[(iArr[b9 & 255] + i9) % 255] & 255 : 0;
        byte b10 = bArr[2];
        int i12 = b10 != 0 ? f4064h[(iArr[b10 & 255] + i9) % 255] & 255 : 0;
        byte b11 = bArr[3];
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | (b11 != 0 ? f4064h[(i9 + iArr[b11 & 255]) % 255] & 255 : 0);
    }

    private void a(boolean z7) {
        int[][] iArr = (int[][]) this.f4083e[z7 ? 1 : 0];
        int length = iArr.length;
        this.f4084f = new int[length * 4];
        for (int i8 = 0; i8 < length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                this.f4084f[(i8 * 4) + i9] = iArr[i8][i9];
            }
        }
        if (z7) {
            int[] iArr2 = this.f4084f;
            int i10 = iArr2[iArr2.length - 4];
            int i11 = iArr2[iArr2.length - 3];
            int i12 = iArr2[iArr2.length - 2];
            int i13 = iArr2[iArr2.length - 1];
            for (int length2 = iArr2.length - 1; length2 > 3; length2--) {
                int[] iArr3 = this.f4084f;
                iArr3[length2] = iArr3[length2 - 4];
            }
            int[] iArr4 = this.f4084f;
            iArr4[0] = i10;
            iArr4[1] = i11;
            iArr4[2] = i12;
            iArr4[3] = i13;
        }
        this.f4081c = length >= 13;
        this.f4082d = length == 15;
        this.f4085g = (length - 1) * 4;
    }

    void a(boolean z7, String str, byte[] bArr) {
        if (b(bArr.length)) {
            this.f4083e = a(bArr);
            a(z7);
        } else {
            throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
        }
    }

    void a(byte[] bArr, int i8, byte[] bArr2, int i9) {
        int i10;
        int i11 = ((bArr[i8 + 1] & 255) << 16) | (bArr[i8] << 24) | ((bArr[i8 + 2] & 255) << 8) | (bArr[i8 + 3] & 255);
        int[] iArr = this.f4084f;
        int i12 = i11 ^ iArr[4];
        int i13 = ((((bArr[i8 + 4] << 24) | ((bArr[i8 + 5] & 255) << 16)) | ((bArr[i8 + 6] & 255) << 8)) | (bArr[i8 + 7] & 255)) ^ iArr[5];
        int i14 = (((((bArr[i8 + 9] & 255) << 16) | (bArr[i8 + 8] << 24)) | ((bArr[i8 + 10] & 255) << 8)) | (bArr[i8 + 11] & 255)) ^ iArr[6];
        int i15 = (((((bArr[i8 + 13] & 255) << 16) | (bArr[i8 + 12] << 24)) | ((bArr[i8 + 14] & 255) << 8)) | (bArr[i8 + 15] & 255)) ^ iArr[7];
        if (this.f4081c) {
            int[] iArr2 = f4072p;
            int i16 = iArr2[i12 >>> 24];
            int[] iArr3 = f4073q;
            int i17 = i16 ^ iArr3[(i15 >>> 16) & 255];
            int[] iArr4 = f4074r;
            int i18 = i17 ^ iArr4[(i14 >>> 8) & 255];
            int[] iArr5 = f4075s;
            int i19 = (i18 ^ iArr5[i13 & 255]) ^ iArr[8];
            int i20 = (((iArr3[(i12 >>> 16) & 255] ^ iArr2[i13 >>> 24]) ^ iArr4[(i15 >>> 8) & 255]) ^ iArr5[i14 & 255]) ^ iArr[9];
            int i21 = (((iArr3[(i13 >>> 16) & 255] ^ iArr2[i14 >>> 24]) ^ iArr4[(i12 >>> 8) & 255]) ^ iArr5[i15 & 255]) ^ iArr[10];
            int i22 = (iArr5[i12 & 255] ^ (iArr4[(i13 >>> 8) & 255] ^ (iArr3[(i14 >>> 16) & 255] ^ iArr2[i15 >>> 24]))) ^ iArr[11];
            int i23 = (((iArr2[i19 >>> 24] ^ iArr3[(i22 >>> 16) & 255]) ^ iArr4[(i21 >>> 8) & 255]) ^ iArr5[i20 & 255]) ^ iArr[12];
            int i24 = (((iArr2[i20 >>> 24] ^ iArr3[(i19 >>> 16) & 255]) ^ iArr4[(i22 >>> 8) & 255]) ^ iArr5[i21 & 255]) ^ iArr[13];
            int i25 = (((iArr2[i21 >>> 24] ^ iArr3[(i20 >>> 16) & 255]) ^ iArr4[(i19 >>> 8) & 255]) ^ iArr5[i22 & 255]) ^ iArr[14];
            int i26 = (((iArr2[i22 >>> 24] ^ iArr3[(i21 >>> 16) & 255]) ^ iArr4[(i20 >>> 8) & 255]) ^ iArr5[i19 & 255]) ^ iArr[15];
            if (this.f4082d) {
                int i27 = (((iArr2[i23 >>> 24] ^ iArr3[(i26 >>> 16) & 255]) ^ iArr4[(i25 >>> 8) & 255]) ^ iArr5[i24 & 255]) ^ iArr[16];
                int i28 = (((iArr2[i24 >>> 24] ^ iArr3[(i23 >>> 16) & 255]) ^ iArr4[(i26 >>> 8) & 255]) ^ iArr5[i25 & 255]) ^ iArr[17];
                int i29 = (((iArr2[i25 >>> 24] ^ iArr3[(i24 >>> 16) & 255]) ^ iArr4[(i23 >>> 8) & 255]) ^ iArr5[i26 & 255]) ^ iArr[18];
                int i30 = (((iArr2[i26 >>> 24] ^ iArr3[(i25 >>> 16) & 255]) ^ iArr4[(i24 >>> 8) & 255]) ^ iArr5[i23 & 255]) ^ iArr[19];
                i23 = (((iArr2[i27 >>> 24] ^ iArr3[(i30 >>> 16) & 255]) ^ iArr4[(i29 >>> 8) & 255]) ^ iArr5[i28 & 255]) ^ iArr[20];
                i24 = (((iArr2[i28 >>> 24] ^ iArr3[(i27 >>> 16) & 255]) ^ iArr4[(i30 >>> 8) & 255]) ^ iArr5[i29 & 255]) ^ iArr[21];
                i25 = (((iArr2[i29 >>> 24] ^ iArr3[(i28 >>> 16) & 255]) ^ iArr4[(i27 >>> 8) & 255]) ^ iArr5[i30 & 255]) ^ iArr[22];
                i26 = (((iArr2[i30 >>> 24] ^ iArr3[(i29 >>> 16) & 255]) ^ iArr4[(i28 >>> 8) & 255]) ^ iArr5[i27 & 255]) ^ iArr[23];
                i10 = 24;
            } else {
                i10 = 16;
            }
            int i31 = i25;
            i15 = i26;
            i12 = i23;
            i13 = i24;
            i14 = i31;
        } else {
            i10 = 8;
        }
        int[] iArr6 = f4072p;
        int i32 = iArr6[i12 >>> 24];
        int[] iArr7 = f4073q;
        int i33 = i32 ^ iArr7[(i15 >>> 16) & 255];
        int[] iArr8 = f4074r;
        int i34 = i33 ^ iArr8[(i14 >>> 8) & 255];
        int[] iArr9 = f4075s;
        int i35 = (i34 ^ iArr9[i13 & 255]) ^ iArr[i10];
        int i36 = (((iArr7[(i12 >>> 16) & 255] ^ iArr6[i13 >>> 24]) ^ iArr8[(i15 >>> 8) & 255]) ^ iArr9[i14 & 255]) ^ iArr[i10 + 1];
        int i37 = (((iArr7[(i13 >>> 16) & 255] ^ iArr6[i14 >>> 24]) ^ iArr8[(i12 >>> 8) & 255]) ^ iArr9[i15 & 255]) ^ iArr[i10 + 2];
        int i38 = (iArr9[i12 & 255] ^ (iArr8[(i13 >>> 8) & 255] ^ (iArr7[(i14 >>> 16) & 255] ^ iArr6[i15 >>> 24]))) ^ iArr[i10 + 3];
        int i39 = iArr[i10 + 4] ^ (((iArr6[i35 >>> 24] ^ iArr7[(i38 >>> 16) & 255]) ^ iArr8[(i37 >>> 8) & 255]) ^ iArr9[i36 & 255]);
        int i40 = (((iArr6[i36 >>> 24] ^ iArr7[(i35 >>> 16) & 255]) ^ iArr8[(i38 >>> 8) & 255]) ^ iArr9[i37 & 255]) ^ iArr[i10 + 5];
        int i41 = (((iArr6[i37 >>> 24] ^ iArr7[(i36 >>> 16) & 255]) ^ iArr8[(i35 >>> 8) & 255]) ^ iArr9[i38 & 255]) ^ iArr[i10 + 6];
        int i42 = (((iArr6[i38 >>> 24] ^ iArr7[(i37 >>> 16) & 255]) ^ iArr8[(i36 >>> 8) & 255]) ^ iArr9[i35 & 255]) ^ iArr[i10 + 7];
        int i43 = iArr[i10 + 8] ^ (((iArr6[i39 >>> 24] ^ iArr7[(i42 >>> 16) & 255]) ^ iArr8[(i41 >>> 8) & 255]) ^ iArr9[i40 & 255]);
        int i44 = (((iArr6[i40 >>> 24] ^ iArr7[(i39 >>> 16) & 255]) ^ iArr8[(i42 >>> 8) & 255]) ^ iArr9[i41 & 255]) ^ iArr[i10 + 9];
        int i45 = (((iArr6[i41 >>> 24] ^ iArr7[(i40 >>> 16) & 255]) ^ iArr8[(i39 >>> 8) & 255]) ^ iArr9[i42 & 255]) ^ iArr[i10 + 10];
        int i46 = (((iArr6[i42 >>> 24] ^ iArr7[(i41 >>> 16) & 255]) ^ iArr8[(i40 >>> 8) & 255]) ^ iArr9[i39 & 255]) ^ iArr[i10 + 11];
        int i47 = iArr[i10 + 12] ^ (((iArr6[i43 >>> 24] ^ iArr7[(i46 >>> 16) & 255]) ^ iArr8[(i45 >>> 8) & 255]) ^ iArr9[i44 & 255]);
        int i48 = (((iArr6[i44 >>> 24] ^ iArr7[(i43 >>> 16) & 255]) ^ iArr8[(i46 >>> 8) & 255]) ^ iArr9[i45 & 255]) ^ iArr[i10 + 13];
        int i49 = (((iArr6[i45 >>> 24] ^ iArr7[(i44 >>> 16) & 255]) ^ iArr8[(i43 >>> 8) & 255]) ^ iArr9[i46 & 255]) ^ iArr[i10 + 14];
        int i50 = (((iArr6[i46 >>> 24] ^ iArr7[(i45 >>> 16) & 255]) ^ iArr8[(i44 >>> 8) & 255]) ^ iArr9[i43 & 255]) ^ iArr[i10 + 15];
        int i51 = iArr[i10 + 16] ^ (((iArr6[i47 >>> 24] ^ iArr7[(i50 >>> 16) & 255]) ^ iArr8[(i49 >>> 8) & 255]) ^ iArr9[i48 & 255]);
        int i52 = (((iArr6[i48 >>> 24] ^ iArr7[(i47 >>> 16) & 255]) ^ iArr8[(i50 >>> 8) & 255]) ^ iArr9[i49 & 255]) ^ iArr[i10 + 17];
        int i53 = (((iArr6[i49 >>> 24] ^ iArr7[(i48 >>> 16) & 255]) ^ iArr8[(i47 >>> 8) & 255]) ^ iArr9[i50 & 255]) ^ iArr[i10 + 18];
        int i54 = (((iArr6[i50 >>> 24] ^ iArr7[(i49 >>> 16) & 255]) ^ iArr8[(i48 >>> 8) & 255]) ^ iArr9[i47 & 255]) ^ iArr[i10 + 19];
        int i55 = iArr[i10 + 20] ^ (((iArr6[i51 >>> 24] ^ iArr7[(i54 >>> 16) & 255]) ^ iArr8[(i53 >>> 8) & 255]) ^ iArr9[i52 & 255]);
        int i56 = (((iArr6[i52 >>> 24] ^ iArr7[(i51 >>> 16) & 255]) ^ iArr8[(i54 >>> 8) & 255]) ^ iArr9[i53 & 255]) ^ iArr[i10 + 21];
        int i57 = (((iArr6[i53 >>> 24] ^ iArr7[(i52 >>> 16) & 255]) ^ iArr8[(i51 >>> 8) & 255]) ^ iArr9[i54 & 255]) ^ iArr[i10 + 22];
        int i58 = (((iArr6[i54 >>> 24] ^ iArr7[(i53 >>> 16) & 255]) ^ iArr8[(i52 >>> 8) & 255]) ^ iArr9[i51 & 255]) ^ iArr[i10 + 23];
        int i59 = iArr[i10 + 24] ^ (((iArr6[i55 >>> 24] ^ iArr7[(i58 >>> 16) & 255]) ^ iArr8[(i57 >>> 8) & 255]) ^ iArr9[i56 & 255]);
        int i60 = (((iArr6[i56 >>> 24] ^ iArr7[(i55 >>> 16) & 255]) ^ iArr8[(i58 >>> 8) & 255]) ^ iArr9[i57 & 255]) ^ iArr[i10 + 25];
        int i61 = (((iArr6[i57 >>> 24] ^ iArr7[(i56 >>> 16) & 255]) ^ iArr8[(i55 >>> 8) & 255]) ^ iArr9[i58 & 255]) ^ iArr[i10 + 26];
        int i62 = (((iArr6[i58 >>> 24] ^ iArr7[(i57 >>> 16) & 255]) ^ iArr8[(i56 >>> 8) & 255]) ^ iArr9[i55 & 255]) ^ iArr[i10 + 27];
        int i63 = iArr[i10 + 28] ^ (((iArr6[i59 >>> 24] ^ iArr7[(i62 >>> 16) & 255]) ^ iArr8[(i61 >>> 8) & 255]) ^ iArr9[i60 & 255]);
        int i64 = (((iArr6[i60 >>> 24] ^ iArr7[(i59 >>> 16) & 255]) ^ iArr8[(i62 >>> 8) & 255]) ^ iArr9[i61 & 255]) ^ iArr[i10 + 29];
        int i65 = (((iArr6[i61 >>> 24] ^ iArr7[(i60 >>> 16) & 255]) ^ iArr8[(i59 >>> 8) & 255]) ^ iArr9[i62 & 255]) ^ iArr[i10 + 30];
        int i66 = (((iArr6[i62 >>> 24] ^ iArr7[(i61 >>> 16) & 255]) ^ iArr8[(i60 >>> 8) & 255]) ^ iArr9[i59 & 255]) ^ iArr[i10 + 31];
        int i67 = iArr[i10 + 32] ^ (((iArr6[i63 >>> 24] ^ iArr7[(i66 >>> 16) & 255]) ^ iArr8[(i65 >>> 8) & 255]) ^ iArr9[i64 & 255]);
        int i68 = (((iArr6[i64 >>> 24] ^ iArr7[(i63 >>> 16) & 255]) ^ iArr8[(i66 >>> 8) & 255]) ^ iArr9[i65 & 255]) ^ iArr[i10 + 33];
        int i69 = (((iArr6[i65 >>> 24] ^ iArr7[(i64 >>> 16) & 255]) ^ iArr8[(i63 >>> 8) & 255]) ^ iArr9[i66 & 255]) ^ iArr[i10 + 34];
        int i70 = (((iArr6[i66 >>> 24] ^ iArr7[(i65 >>> 16) & 255]) ^ iArr8[(i64 >>> 8) & 255]) ^ iArr9[i63 & 255]) ^ iArr[i10 + 35];
        int i71 = iArr[0];
        byte[] bArr3 = f4067k;
        bArr2[i9] = (byte) (bArr3[i67 >>> 24] ^ (i71 >>> 24));
        bArr2[i9 + 1] = (byte) (bArr3[(i70 >>> 16) & 255] ^ (i71 >>> 16));
        bArr2[i9 + 2] = (byte) (bArr3[(i69 >>> 8) & 255] ^ (i71 >>> 8));
        bArr2[i9 + 3] = (byte) (i71 ^ bArr3[i68 & 255]);
        int i72 = iArr[1];
        bArr2[i9 + 4] = (byte) (bArr3[i68 >>> 24] ^ (i72 >>> 24));
        bArr2[i9 + 5] = (byte) (bArr3[(i67 >>> 16) & 255] ^ (i72 >>> 16));
        bArr2[i9 + 6] = (byte) (bArr3[(i70 >>> 8) & 255] ^ (i72 >>> 8));
        bArr2[i9 + 7] = (byte) (i72 ^ bArr3[i69 & 255]);
        int i73 = iArr[2];
        bArr2[i9 + 8] = (byte) (bArr3[i69 >>> 24] ^ (i73 >>> 24));
        bArr2[i9 + 9] = (byte) (bArr3[(i68 >>> 16) & 255] ^ (i73 >>> 16));
        bArr2[i9 + 10] = (byte) (bArr3[(i67 >>> 8) & 255] ^ (i73 >>> 8));
        bArr2[i9 + 11] = (byte) (i73 ^ bArr3[i70 & 255]);
        int i74 = iArr[3];
        bArr2[i9 + 12] = (byte) (bArr3[i70 >>> 24] ^ (i74 >>> 24));
        bArr2[i9 + 13] = (byte) (bArr3[(i69 >>> 16) & 255] ^ (i74 >>> 16));
        bArr2[i9 + 14] = (byte) (bArr3[(i68 >>> 8) & 255] ^ (i74 >>> 8));
        bArr2[i9 + 15] = (byte) (bArr3[i67 & 255] ^ i74);
    }

    private static Object[] a(byte[] bArr) {
        int i8;
        if (bArr == null) {
            throw new InvalidKeyException("Empty key");
        }
        if (b(bArr.length)) {
            int a8 = a(bArr.length);
            int i9 = a8 + 1;
            int i10 = i9 * 4;
            Class cls = Integer.TYPE;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, i9, 4);
            int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, i9, 4);
            int length = bArr.length / 4;
            int[] iArr3 = new int[length];
            char c8 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                iArr3[i11] = ((bArr[i12 + 2] & 255) << 8) | (bArr[i12] << 24) | ((bArr[i12 + 1] & 255) << 16) | (bArr[i12 + 3] & 255);
                i11++;
                i12 += 4;
            }
            int i13 = 0;
            int i14 = 0;
            while (i13 < length && i14 < i10) {
                int i15 = i14 / 4;
                int i16 = i14 % 4;
                iArr[i15][i16] = iArr3[i13];
                iArr2[a8 - i15][i16] = iArr3[i13];
                i13++;
                i14++;
            }
            int i17 = 0;
            while (i14 < i10) {
                int i18 = iArr3[length - 1];
                int i19 = iArr3[c8];
                byte[] bArr2 = f4066j;
                int i20 = ((((bArr2[(i18 >>> 8) & 255] & 255) << 16) ^ (bArr2[(i18 >>> 16) & 255] << 24)) ^ ((bArr2[i18 & 255] & 255) << 8)) ^ (bArr2[i18 >>> 24] & 255);
                int i21 = i17 + 1;
                iArr3[c8] = ((f4080x[i17] << 24) ^ i20) ^ i19;
                int i22 = 1;
                int i23 = 0;
                if (length != 8) {
                    while (i22 < length) {
                        iArr3[i22] = iArr3[i22] ^ iArr3[i23];
                        i22++;
                        i23++;
                    }
                } else {
                    while (true) {
                        i8 = length / 2;
                        if (i22 >= i8) {
                            break;
                        }
                        iArr3[i22] = iArr3[i22] ^ iArr3[i23];
                        i22++;
                        i23++;
                    }
                    int i24 = iArr3[i8 - 1];
                    int i25 = iArr3[i8];
                    byte[] bArr3 = f4066j;
                    iArr3[i8] = ((bArr3[i24 >>> 24] << 24) ^ ((((bArr3[(i24 >>> 8) & 255] & 255) << 8) ^ (bArr3[i24 & 255] & 255)) ^ ((bArr3[(i24 >>> 16) & 255] & 255) << 16))) ^ i25;
                    int i26 = i8 + 1;
                    while (i26 < length) {
                        iArr3[i26] = iArr3[i26] ^ iArr3[i8];
                        i26++;
                        i8++;
                    }
                }
                int i27 = 0;
                while (i27 < length && i14 < i10) {
                    int i28 = i14 / 4;
                    int i29 = i14 % 4;
                    iArr[i28][i29] = iArr3[i27];
                    iArr2[a8 - i28][i29] = iArr3[i27];
                    i27++;
                    i14++;
                }
                i17 = i21;
                c8 = 0;
            }
            for (int i30 = 1; i30 < a8; i30++) {
                for (int i31 = 0; i31 < 4; i31++) {
                    int[] iArr4 = iArr2[i30];
                    int i32 = iArr4[i31];
                    iArr4[i31] = f4079w[i32 & 255] ^ ((f4076t[(i32 >>> 24) & 255] ^ f4077u[(i32 >>> 16) & 255]) ^ f4078v[(i32 >>> 8) & 255]);
                }
            }
            return new Object[]{iArr, iArr2};
        }
        throw new InvalidKeyException("Invalid AES key length: " + bArr.length + " bytes");
    }
}
