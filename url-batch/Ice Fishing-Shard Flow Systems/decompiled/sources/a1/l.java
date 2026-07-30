package a1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final X0.c f3071a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3072b;

    public l(X0.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f3071a = cVar;
        this.f3072b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f3071a.equals(lVar.f3071a)) {
            return Arrays.equals(this.f3072b, lVar.f3072b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3071a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3072b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f3071a + ", bytes=[...]}";
    }
}
