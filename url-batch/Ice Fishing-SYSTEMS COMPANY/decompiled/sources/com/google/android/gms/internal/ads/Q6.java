package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Q6 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f27118a;

    public Q6(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f27118a = bArr;
                break;
            default:
                this.f27118a = new byte[256];
                for (int i4 = 0; i4 < 256; i4++) {
                    this.f27118a[i4] = (byte) i4;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < 256; i10++) {
                    byte[] bArr2 = this.f27118a;
                    byte b9 = bArr2[i10];
                    i9 = (i9 + b9 + bArr[i10 % bArr.length]) & com.anythink.basead.exoplayer.k.p.f8630b;
                    bArr2[i10] = bArr2[i9];
                    bArr2[i9] = b9;
                }
                break;
        }
    }
}
