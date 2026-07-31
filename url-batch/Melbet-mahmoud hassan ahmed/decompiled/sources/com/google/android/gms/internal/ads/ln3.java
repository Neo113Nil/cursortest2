package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ln3 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8032a;

    private ln3(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8];
        this.f8032a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i8);
    }

    public static ln3 a(byte[] bArr, int i7, int i8) {
        return new ln3(bArr, 0, i8);
    }

    public final byte[] b() {
        byte[] bArr = this.f8032a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
