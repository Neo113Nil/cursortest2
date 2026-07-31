package E0;

import N.p;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f586a;

    /* renamed from: b, reason: collision with root package name */
    public final long f587b;

    public a(long j4, int i7) {
        if (i7 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f586a = i7;
        this.f587b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p.a(this.f586a, aVar.f586a) && this.f587b == aVar.f587b;
    }

    public final int hashCode() {
        int c7 = (p.c(this.f586a) ^ 1000003) * 1000003;
        long j4 = this.f587b;
        return c7 ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i7 = this.f586a;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f587b);
        sb.append("}");
        return sb.toString();
    }
}
