package com.realsil.sdk.dfu.n;

/* loaded from: classes4.dex */
public abstract class d {
    public static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            bArr2[i8] = (byte) (bArr[i8] + 1);
        }
        return bArr2;
    }
}
