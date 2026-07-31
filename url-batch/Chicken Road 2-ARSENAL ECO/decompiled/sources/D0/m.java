package D0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final A0.c f346a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f347b;

    public m(A0.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f346a = cVar;
        this.f347b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f346a.equals(mVar.f346a)) {
            return Arrays.equals(this.f347b, mVar.f347b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f346a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f347b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f346a + ", bytes=[...]}";
    }
}
