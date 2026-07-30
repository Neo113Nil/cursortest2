package com.crrepa.f;

/* loaded from: classes3.dex */
public class o0 {
    private o0() {
    }

    public static int a(byte[] bArr) {
        byte b8;
        if (!com.crrepa.g1.c.h(bArr) && bArr.length >= 2) {
            return bArr.length == 2 ? ((bArr[1] << 8) & 65280) | (bArr[0] & 255) : (bArr.length == 4 && ((b8 = bArr[2]) == 0 || bArr[3] == 0)) ? ((bArr[1] << 8) & 65280) | (bArr[0] & 255) | ((b8 << 24) >>> 8) : ((bArr[1] << 24) >>> 8) | (bArr[3] & 255) | ((bArr[2] << 8) & 65280);
        }
        return 0;
    }

    public static byte[] a() {
        return g.a(38, null);
    }

    public static byte[] a(int i8) {
        return g.a(22, com.crrepa.g1.c.c(i8));
    }
}
