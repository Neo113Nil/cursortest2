package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class gp extends bp {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f5706c;

    @Override // com.google.android.gms.internal.ads.bp
    public final byte[] b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i7 = 4;
        if (length == 1) {
            int a7 = fp.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a7);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i8 = 0; i8 < split.length; i8++) {
                    int a8 = fp.a(split[i8]);
                    int i9 = (a8 >> 16) ^ ((char) a8);
                    byte[] bArr3 = {(byte) i9, (byte) (i9 >> 8)};
                    int i10 = i8 + i8;
                    bArr[i10] = bArr3[0];
                    bArr[i10 + 1] = bArr3[1];
                }
            } else {
                bArr = new byte[length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int a9 = fp.a(split[i11]);
                    bArr[i11] = (byte) ((a9 >> 24) ^ (((a9 & 255) ^ ((a9 >> 8) & 255)) ^ ((a9 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.f5706c = a();
        synchronized (this.f3484a) {
            MessageDigest messageDigest = this.f5706c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f5706c.update(bArr2);
            byte[] digest = this.f5706c.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i7 = length2;
            }
            byte[] bArr4 = new byte[i7];
            System.arraycopy(digest, 0, bArr4, 0, i7);
            return bArr4;
        }
    }
}
