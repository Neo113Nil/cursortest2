package com.crrepa.f;

/* loaded from: classes3.dex */
public class j1 {
    private j1() {
    }

    public static byte[] a() {
        return g.a(-91, new byte[]{1});
    }

    public static byte[] b(int i8) {
        return g.a(-107, new byte[]{1, (byte) i8});
    }

    public static byte[] a(int i8) {
        return g.a(-107, new byte[]{2, (byte) i8});
    }

    public static byte[] a(int i8, int i9) {
        byte[] b8 = com.crrepa.g1.c.b(i9);
        return g.a(-107, new byte[]{2, (byte) i8, b8[1], b8[0]});
    }

    public static byte[] a(boolean z7) {
        byte[] bArr = new byte[2];
        bArr[0] = 4;
        bArr[1] = (byte) (z7 ? 0 : 255);
        return g.a(-107, bArr);
    }
}
