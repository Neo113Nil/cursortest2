package Z1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final W1.c f4230a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4231b;

    public k(W1.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f4230a = cVar;
        this.f4231b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f4230a.equals(kVar.f4230a)) {
            return Arrays.equals(this.f4231b, kVar.f4231b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4230a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f4231b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f4230a + ", bytes=[...]}";
    }
}
