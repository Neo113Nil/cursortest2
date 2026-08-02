package M1;

import E.AbstractC0005f;
import M.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1737a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1738b;

    public a(int i4, long j4) {
        if (i4 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f1737a = i4;
        this.f1738b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f1737a, aVar.f1737a) && this.f1738b == aVar.f1738b;
    }

    public final int hashCode() {
        int b4 = (j.b(this.f1737a) ^ 1000003) * 1000003;
        long j4 = this.f1738b;
        return b4 ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i4 = this.f1737a;
        sb.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return AbstractC0005f.p(sb, this.f1738b, "}");
    }
}
