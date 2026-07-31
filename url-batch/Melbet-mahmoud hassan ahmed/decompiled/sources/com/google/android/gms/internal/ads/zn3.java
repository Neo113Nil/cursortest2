package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zn3 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f15197a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f15198b;

    /* renamed from: c, reason: collision with root package name */
    private int f15199c;

    public zn3(byte[] bArr) {
        for (int i7 = 0; i7 < 256; i7++) {
            this.f15197a[i7] = (byte) i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            byte[] bArr2 = this.f15197a;
            byte b7 = bArr2[i9];
            i8 = (i8 + b7 + bArr[i9 % bArr.length]) & 255;
            bArr2[i9] = bArr2[i8];
            bArr2[i8] = b7;
        }
        this.f15198b = 0;
        this.f15199c = 0;
    }

    public final void a(byte[] bArr) {
        int i7 = this.f15198b;
        int i8 = this.f15199c;
        for (int i9 = 0; i9 < 256; i9++) {
            i7 = (i7 + 1) & 255;
            byte[] bArr2 = this.f15197a;
            byte b7 = bArr2[i7];
            i8 = (i8 + b7) & 255;
            bArr2[i7] = bArr2[i8];
            bArr2[i8] = b7;
            bArr[i9] = (byte) (bArr2[(bArr2[i7] + b7) & 255] ^ bArr[i9]);
        }
        this.f15198b = i7;
        this.f15199c = i8;
    }
}
