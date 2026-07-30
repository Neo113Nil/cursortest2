package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rl {
    public final int a;
    public final long b;

    public rl(long j, int i) {
        if (i == 0) {
            ch2.l("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rl)) {
            return false;
        }
        rl rlVar = (rl) obj;
        return q40.c(this.a, rlVar.a) && this.b == rlVar.b;
    }

    public final int hashCode() {
        int u = (q40.u(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ u;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
