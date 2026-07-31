package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class kp extends bp {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f7566c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7567d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7568e;

    public kp(int i7) {
        int i8 = i7 >> 3;
        this.f7567d = (i7 & 7) > 0 ? i8 + 1 : i8;
        this.f7568e = i7;
    }

    @Override // com.google.android.gms.internal.ads.bp
    public final byte[] b(String str) {
        synchronized (this.f3484a) {
            MessageDigest a7 = a();
            this.f7566c = a7;
            if (a7 == null) {
                return new byte[0];
            }
            a7.reset();
            this.f7566c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.f7566c.digest();
            int length = digest.length;
            int i7 = this.f7567d;
            if (length > i7) {
                length = i7;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if ((this.f7568e & 7) > 0) {
                long j7 = 0;
                for (int i8 = 0; i8 < length; i8++) {
                    if (i8 > 0) {
                        j7 <<= 8;
                    }
                    j7 += bArr[i8] & 255;
                }
                long j8 = j7 >>> (8 - (this.f7568e & 7));
                int i9 = this.f7567d;
                while (true) {
                    i9--;
                    if (i9 < 0) {
                        break;
                    }
                    bArr[i9] = (byte) (255 & j8);
                    j8 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
