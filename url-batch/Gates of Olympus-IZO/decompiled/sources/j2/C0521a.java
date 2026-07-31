package j2;

import g2.i;
import h2.AbstractC0439a;
import java.io.Serializable;

/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0521a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final C0521a f5299f = new C0521a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final long f5300d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5301e;

    public C0521a(long j3, long j4) {
        this.f5300d = j3;
        this.f5301e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0521a)) {
            return false;
        }
        C0521a c0521a = (C0521a) obj;
        return this.f5300d == c0521a.f5300d && this.f5301e == c0521a.f5301e;
    }

    public final int hashCode() {
        long j3 = this.f5300d ^ this.f5301e;
        return ((int) j3) ^ ((int) (j3 >> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j3 = this.f5301e;
        i.G(24, 6, j3, bArr);
        bArr[23] = 45;
        i.G(19, 2, j3 >>> 48, bArr);
        bArr[18] = 45;
        long j4 = this.f5300d;
        i.G(14, 2, j4, bArr);
        bArr[13] = 45;
        i.G(9, 2, j4 >>> 16, bArr);
        bArr[8] = 45;
        i.G(0, 4, j4 >>> 32, bArr);
        return new String(bArr, AbstractC0439a.f5056a);
    }
}
