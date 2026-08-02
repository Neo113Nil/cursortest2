package L1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final I1.b f1655a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1656b;

    public n(I1.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f1655a = bVar;
        this.f1656b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f1655a.equals(nVar.f1655a)) {
            return Arrays.equals(this.f1656b, nVar.f1656b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1655a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1656b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f1655a + ", bytes=[...]}";
    }
}
