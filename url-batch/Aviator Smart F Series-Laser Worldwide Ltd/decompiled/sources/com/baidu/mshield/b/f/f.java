package com.baidu.mshield.b.f;

/* loaded from: classes2.dex */
public class f {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return c(bArr, bArr2);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return c(bArr, bArr2);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] a8 = a(bArr2);
        byte[] bArr3 = new byte[bArr.length];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            i8 = (i8 + 1) & 255;
            byte b8 = a8[i8];
            i9 = ((b8 & 255) + i9) & 255;
            a8[i8] = a8[i9];
            a8[i9] = b8;
            int i11 = ((a8[i8] & 255) + (b8 & 255)) & 255;
            byte b9 = (byte) (a8[i11] ^ bArr[i10]);
            bArr3[i10] = b9;
            bArr3[i10] = (byte) (b9 ^ a4.a.f66n0);
        }
        return bArr3;
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        for (int i8 = 0; i8 < 256; i8++) {
            bArr2[i8] = (byte) i8;
        }
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = bArr[i9] & 255;
            byte b8 = bArr2[i11];
            i10 = (i12 + (b8 & 255) + i10) & 255;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b8;
            i9 = (i9 + 1) % bArr.length;
        }
        return bArr2;
    }
}
