package com.baidu.bbalbscesium.m;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f4167a = {a4.a.I0, 66, 67, a4.a.L0, a4.a.M0, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, a4.a.N0, a4.a.O0, a4.a.P0, a4.a.Q0, 85, 86, a4.a.R0, 88, a4.a.S0, a4.a.T0, a4.a.X0, a4.a.Y0, a4.a.Z0, a4.a.f15a1, a4.a.f19b1, a4.a.f23c1, a4.a.f27d1, a4.a.f31e1, a4.a.f35f1, a4.a.f39g1, a4.a.f43h1, a4.a.f47i1, a4.a.f51j1, a4.a.f55k1, a4.a.f59l1, 112, a4.a.f63m1, a4.a.f67n1, a4.a.f70o1, a4.a.f73p1, a4.a.f76q1, 118, a4.a.f79r1, a4.a.f82s1, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    private b() {
    }

    public static String a(byte[] bArr, String str) {
        int length = (bArr.length * 4) / 3;
        byte[] bArr2 = new byte[length + (length / 76) + 3];
        int length2 = bArr.length - (bArr.length % 3);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length2; i10 += 3) {
            byte[] bArr3 = f4167a;
            bArr2[i8] = bArr3[(bArr[i10] & 255) >> 2];
            int i11 = i10 + 1;
            bArr2[i8 + 1] = bArr3[((bArr[i10] & 3) << 4) | ((bArr[i11] & 255) >> 4)];
            int i12 = i10 + 2;
            bArr2[i8 + 2] = bArr3[((bArr[i11] & 15) << 2) | ((bArr[i12] & 255) >> 6)];
            int i13 = i8 + 4;
            bArr2[i8 + 3] = bArr3[bArr[i12] & 63];
            if ((i13 - i9) % 76 != 0 || i13 == 0) {
                i8 = i13;
            } else {
                i8 += 5;
                bArr2[i13] = 10;
                i9++;
            }
        }
        int length3 = bArr.length % 3;
        if (length3 == 1) {
            byte[] bArr4 = f4167a;
            bArr2[i8] = bArr4[(bArr[length2] & 255) >> 2];
            bArr2[i8 + 1] = bArr4[(bArr[length2] & 3) << 4];
            int i14 = i8 + 3;
            bArr2[i8 + 2] = 61;
            i8 += 4;
            bArr2[i14] = 61;
        } else if (length3 == 2) {
            byte[] bArr5 = f4167a;
            bArr2[i8] = bArr5[(bArr[length2] & 255) >> 2];
            int i15 = (bArr[length2] & 3) << 4;
            int i16 = length2 + 1;
            bArr2[i8 + 1] = bArr5[((bArr[i16] & 255) >> 4) | i15];
            int i17 = i8 + 3;
            bArr2[i8 + 2] = bArr5[(bArr[i16] & 15) << 2];
            i8 += 4;
            bArr2[i17] = 61;
        }
        return new String(bArr2, 0, i8, str);
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public static byte[] a(byte[] bArr, int i8) {
        byte b8;
        int i9;
        int i10 = (i8 / 4) * 3;
        if (i10 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i10];
        int i11 = i8;
        int i12 = 0;
        while (true) {
            byte b9 = bArr[i11 - 1];
            b8 = 10;
            if (b9 != 10 && b9 != 13 && b9 != 32 && b9 != 9) {
                if (b9 != 61) {
                    break;
                }
                i12++;
            }
            i11--;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < i11) {
            byte b10 = bArr[i13];
            if (b10 != b8 && b10 != 13 && b10 != 32 && b10 != 9) {
                if (b10 >= 65 && b10 <= 90) {
                    i9 = b10 - 65;
                } else if (b10 >= 97 && b10 <= 122) {
                    i9 = b10 + a4.a.f20b2;
                } else if (b10 >= 48 && b10 <= 57) {
                    i9 = b10 + 4;
                } else if (b10 == 43) {
                    i9 = 62;
                } else {
                    if (b10 != 47) {
                        return null;
                    }
                    i9 = 63;
                }
                i15 = ((byte) i9) | (i15 << 6);
                if (i16 % 4 == 3) {
                    bArr2[i14] = (byte) ((16711680 & i15) >> 16);
                    int i17 = i14 + 2;
                    bArr2[i14 + 1] = (byte) ((65280 & i15) >> 8);
                    i14 += 3;
                    bArr2[i17] = (byte) (i15 & 255);
                }
                i16++;
            }
            i13++;
            b8 = 10;
        }
        if (i12 > 0) {
            int i18 = i15 << (i12 * 6);
            int i19 = i14 + 1;
            bArr2[i14] = (byte) ((i18 & 16711680) >> 16);
            if (i12 == 1) {
                i14 += 2;
                bArr2[i19] = (byte) ((i18 & 65280) >> 8);
            } else {
                i14 = i19;
            }
        }
        byte[] bArr3 = new byte[i14];
        System.arraycopy(bArr2, 0, bArr3, 0, i14);
        return bArr3;
    }
}
