package p2;

import java.io.Serializable;
import n.T;
import n2.AbstractC0721a;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804a implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final C0804a f7833f = new C0804a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final long f7834d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7835e;

    public C0804a(long j3, long j4) {
        this.f7834d = j3;
        this.f7835e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0804a)) {
            return false;
        }
        C0804a c0804a = (C0804a) obj;
        return this.f7834d == c0804a.f7834d && this.f7835e == c0804a.f7835e;
    }

    public final int hashCode() {
        long j3 = this.f7834d ^ this.f7835e;
        return ((int) j3) ^ ((int) (j3 >> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j3 = this.f7835e;
        T.f(24, 6, j3, bArr);
        bArr[23] = 45;
        T.f(19, 2, j3 >>> 48, bArr);
        bArr[18] = 45;
        long j4 = this.f7834d;
        T.f(14, 2, j4, bArr);
        bArr[13] = 45;
        T.f(9, 2, j4 >>> 16, bArr);
        bArr[8] = 45;
        T.f(0, 4, j4 >>> 32, bArr);
        return new String(bArr, AbstractC0721a.f7347a);
    }
}
