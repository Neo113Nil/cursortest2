package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gxj {
    public final long a;
    public final long b;

    public gxj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxj) {
            gxj gxjVar = (gxj) obj;
            if (this.a == gxjVar.a && this.b == gxjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "AsyncInfo{dispatchMarkId=" + this.a + ", dispatchMarkTimeNanos=" + this.b + "}";
    }

    public gxj() {
        throw null;
    }
}
