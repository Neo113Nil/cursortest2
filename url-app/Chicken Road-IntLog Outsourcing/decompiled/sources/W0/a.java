package W0;

import O.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3378a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3379b;

    public a(int i2, long j2) {
        if (i2 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f3378a = i2;
        this.f3379b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f3378a, aVar.f3378a) && this.f3379b == aVar.f3379b;
    }

    public final int hashCode() {
        int b6 = (j.b(this.f3378a) ^ 1000003) * 1000003;
        long j2 = this.f3379b;
        return b6 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i2 = this.f3378a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f3379b);
        sb.append("}");
        return sb.toString();
    }
}
