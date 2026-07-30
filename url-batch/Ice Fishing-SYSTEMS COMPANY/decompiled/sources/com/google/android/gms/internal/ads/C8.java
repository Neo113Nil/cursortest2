package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class C8 extends AbstractC2982bM {

    /* renamed from: v, reason: collision with root package name */
    public MessageDigest f24144v;

    public final byte[] v1(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int c4 = AbstractC3217fl.c(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(c4);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i4 = 0; i4 < split.length; i4++) {
                    int c9 = AbstractC3217fl.c(split[i4]);
                    int i9 = (c9 >> 16) ^ ((char) c9);
                    byte b9 = (byte) i9;
                    byte b10 = (byte) (i9 >> 8);
                    int i10 = i4 + i4;
                    bArr[i10] = new byte[]{b9, b10}[0];
                    bArr[i10 + 1] = b10;
                }
            } else {
                bArr = new byte[length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int c10 = AbstractC3217fl.c(split[i11]);
                    bArr[i11] = (byte) ((c10 >> 24) ^ (((c10 & com.anythink.basead.exoplayer.k.p.f8630b) ^ ((c10 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b)) ^ ((c10 >> 16) & com.anythink.basead.exoplayer.k.p.f8630b)));
                }
            }
            bArr2 = bArr;
        }
        this.f24144v = Q();
        synchronized (this.f29483n) {
            try {
                MessageDigest messageDigest = this.f24144v;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f24144v.update(bArr2);
                byte[] digest = this.f24144v.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(digest, 0, bArr3, 0, i);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
