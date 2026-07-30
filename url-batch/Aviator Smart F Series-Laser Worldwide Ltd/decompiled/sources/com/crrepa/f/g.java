package com.crrepa.f;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final int f12540a = 255;

    private g() {
    }

    public static int a() {
        return com.crrepa.l.a.b().c();
    }

    public static byte[] a(int i8, byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int a8 = a();
        int i9 = length + 5;
        byte[] bArr2 = new byte[i9];
        bArr2[0] = -2;
        bArr2[1] = a4.a.G;
        bArr2[3] = (byte) i9;
        if (a8 == 20) {
            bArr2[2] = 16;
        } else if (255 < i9) {
            bArr2[2] = (byte) ((i9 >> 8) + 32);
        } else {
            bArr2[2] = 32;
        }
        bArr2[4] = (byte) i8;
        if (length > 0) {
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
        }
        return bArr2;
    }
}
