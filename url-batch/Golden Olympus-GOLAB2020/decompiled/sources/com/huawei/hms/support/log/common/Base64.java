package com.huawei.hms.support.log.common;

import com.ironsource.cc;

/* loaded from: classes.dex */
public final class Base64 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f14400a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', cc.f15727T};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f14401b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private Base64() {
    }

    private static int a(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (charAt > 255 || f14401b[charAt] < 0) {
                length--;
            }
        }
        return length;
    }

    public static byte[] decode(String str) {
        if (str == null) {
            return new byte[0];
        }
        int a4 = a(str);
        int i4 = (a4 / 4) * 3;
        int i5 = a4 % 4;
        if (i5 == 3) {
            i4 += 2;
        }
        if (i5 == 2) {
            i4++;
        }
        byte[] bArr = new byte[i4];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            byte b4 = charAt > 255 ? (byte) -1 : f14401b[charAt];
            if (b4 >= 0) {
                int i10 = i8 + 6;
                i7 = (i7 << 6) | b4;
                if (i10 >= 8) {
                    i8 -= 2;
                    bArr[i6] = (byte) (255 & (i7 >> i8));
                    i6++;
                } else {
                    i8 = i10;
                }
            }
        }
        return i6 != i4 ? new byte[0] : bArr;
    }

    public static String encode(byte[] bArr) {
        return bArr == null ? "" : encode(bArr, bArr.length);
    }

    public static String encode(byte[] bArr, int i4) {
        boolean z4;
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[((i4 + 2) / 3) * 4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = (bArr[i5] & 255) << 8;
            int i8 = i5 + 1;
            boolean z5 = true;
            if (i8 < i4) {
                i7 |= bArr[i8] & 255;
                z4 = true;
            } else {
                z4 = false;
            }
            int i9 = i7 << 8;
            int i10 = i5 + 2;
            if (i10 < i4) {
                i9 |= bArr[i10] & 255;
            } else {
                z5 = false;
            }
            int i11 = i6 + 3;
            char[] cArr2 = f14400a;
            int i12 = 64;
            cArr[i11] = cArr2[z5 ? i9 & 63 : 64];
            int i13 = i9 >> 6;
            int i14 = i6 + 2;
            if (z4) {
                i12 = i13 & 63;
            }
            cArr[i14] = cArr2[i12];
            cArr[i6 + 1] = cArr2[(i9 >> 12) & 63];
            cArr[i6] = cArr2[(i9 >> 18) & 63];
            i5 += 3;
            i6 += 4;
        }
        return new String(cArr);
    }
}
