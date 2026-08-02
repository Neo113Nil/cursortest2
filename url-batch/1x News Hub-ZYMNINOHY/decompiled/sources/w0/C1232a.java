package w0;

import M.j;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10627a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10628b;

    public C1232a(int i3, long j3) {
        if (i3 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f10627a = i3;
        this.f10628b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1232a)) {
            return false;
        }
        C1232a c1232a = (C1232a) obj;
        return j.a(this.f10627a, c1232a.f10627a) && this.f10628b == c1232a.f10628b;
    }

    public final int hashCode() {
        int b3 = (j.b(this.f10627a) ^ 1000003) * 1000003;
        long j3 = this.f10628b;
        return b3 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i3 = this.f10627a;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f10628b);
        sb.append("}");
        return sb.toString();
    }
}
