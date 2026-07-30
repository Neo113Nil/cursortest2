package b1;

import S.i;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266a {

    /* renamed from: a, reason: collision with root package name */
    public final int f4135a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4136b;

    public C0266a(long j, int i2) {
        if (i2 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f4135a = i2;
        this.f4136b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0266a)) {
            return false;
        }
        C0266a c0266a = (C0266a) obj;
        return i.a(this.f4135a, c0266a.f4135a) && this.f4136b == c0266a.f4136b;
    }

    public final int hashCode() {
        int b7 = (i.b(this.f4135a) ^ 1000003) * 1000003;
        long j = this.f4136b;
        return b7 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i2 = this.f4135a;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f4136b);
        sb.append("}");
        return sb.toString();
    }
}
