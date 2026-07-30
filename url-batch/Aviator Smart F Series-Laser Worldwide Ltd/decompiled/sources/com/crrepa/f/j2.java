package com.crrepa.f;

/* loaded from: classes3.dex */
public class j2 {
    private j2() {
    }

    public static byte a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return (byte) -1;
        }
        return bArr[0];
    }

    public static byte[] a() {
        return g.a(46, null);
    }

    public static byte[] a(int i8) {
        return g.a(30, new byte[]{(byte) i8});
    }
}
