package com.crrepa.f;

/* loaded from: classes3.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12731a = 4;

    /* renamed from: b, reason: collision with root package name */
    private static final int f12732b = 6;

    private r0() {
    }

    public static byte[] a(boolean z7) {
        return g.a(-121, new byte[]{4, z7 ? (byte) 1 : (byte) 0});
    }

    public static byte[] a(boolean z7, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 2];
        bArr2[0] = 4;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        bArr2[length + 1] = (byte) (!z7 ? 1 : 0);
        return g.a(119, bArr2);
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 1];
        bArr2[0] = 4;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        return g.a(119, bArr2);
    }

    public static byte[] a(byte[] bArr, boolean z7, int i8) {
        byte[] bArr2 = new byte[12];
        bArr2[0] = 4;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length < 6 ? bArr.length : 6);
        bArr2[7] = z7 ? (byte) 1 : (byte) 0;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr2, 8, b8.length);
        return g.a(119, bArr2);
    }
}
