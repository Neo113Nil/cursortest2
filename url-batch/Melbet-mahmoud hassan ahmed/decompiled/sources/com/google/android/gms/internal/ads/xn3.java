package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class xn3 extends rm3 {
    xn3(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.rm3
    final int b() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.rm3
    final int[] c(int[] iArr, int i7) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        rm3.g(iArr3, this.f11261a);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        rm3.h(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        rm3.g(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i7;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
