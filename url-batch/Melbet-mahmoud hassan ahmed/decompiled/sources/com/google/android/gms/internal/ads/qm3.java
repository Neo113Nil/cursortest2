package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qm3 extends rm3 {
    qm3(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.rm3
    final int b() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.rm3
    final int[] c(int[] iArr, int i7) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        rm3.g(iArr2, this.f11261a);
        iArr2[12] = i7;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
