package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class E8 extends AbstractC2982bM {

    /* renamed from: v, reason: collision with root package name */
    public MessageDigest f24663v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24664w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24665x;

    public E8(int i) {
        super(2);
        int i4 = i >> 3;
        this.f24664w = (i & 7) > 0 ? i4 + 1 : i4;
        this.f24665x = i;
    }

    public final byte[] v1(String str) {
        synchronized (this.f29483n) {
            try {
                MessageDigest Q3 = Q();
                this.f24663v = Q3;
                if (Q3 == null) {
                    return new byte[0];
                }
                Q3.reset();
                this.f24663v.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.f24663v.digest();
                int length = digest.length;
                int i = this.f24664w;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i4 = this.f24665x & 7;
                if (i4 > 0) {
                    long j9 = 0;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 > 0) {
                            j9 <<= 8;
                        }
                        j9 += bArr[i9] & 255;
                    }
                    long j10 = j9 >>> (8 - i4);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j10);
                        j10 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
