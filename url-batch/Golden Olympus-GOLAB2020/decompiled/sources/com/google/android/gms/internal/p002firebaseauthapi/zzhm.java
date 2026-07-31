package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class zzhm {
    int[] zza;
    private final int zzb;

    public zzhm(byte[] bArr, int i4) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhh.zza(bArr);
        this.zzb = i4;
    }

    abstract int zza();

    final ByteBuffer zza(byte[] bArr, int i4) {
        int[] zza = zza(zzhh.zza(bArr), i4);
        int[] iArr = (int[]) zza.clone();
        zzhh.zza(iArr);
        for (int i5 = 0; i5 < zza.length; i5++) {
            zza[i5] = zza[i5] + iArr[i5];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }

    abstract int[] zza(int[] iArr, int i4);

    public void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr2.length) {
            zza(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private final void zza(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i4 = remaining / 64;
            int i5 = i4 + 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ByteBuffer zza = zza(bArr, this.zzb + i6);
                if (i6 == i4) {
                    zzyc.zza(byteBuffer, byteBuffer2, zza, remaining % 64);
                } else {
                    zzyc.zza(byteBuffer, byteBuffer2, zza, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
    }

    public byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zza(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
