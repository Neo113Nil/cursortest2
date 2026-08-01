package k6;

import a2.r;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h6.c f5473a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f5474b;

    public k(h6.c cVar, byte[] bArr) {
        if (cVar == null) {
            r.j("encoding is null");
            throw null;
        }
        if (bArr == null) {
            r.j("bytes is null");
            throw null;
        }
        this.f5473a = cVar;
        this.f5474b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f5473a.equals(kVar.f5473a)) {
            return Arrays.equals(this.f5474b, kVar.f5474b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5473a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5474b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f5473a + ", bytes=[...]}";
    }
}
