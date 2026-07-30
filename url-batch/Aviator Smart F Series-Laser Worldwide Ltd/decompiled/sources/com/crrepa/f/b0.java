package com.crrepa.f;

/* loaded from: classes3.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f12462a = 16;

    private b0() {
    }

    public static byte[] a(int i8) {
        byte[] bArr = new byte[6];
        bArr[0] = 16;
        bArr[1] = 1;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 2, b8.length);
        return g.a(-69, bArr);
    }
}
