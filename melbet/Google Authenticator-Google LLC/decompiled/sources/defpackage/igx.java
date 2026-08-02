package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class igx {
    public final long a;
    public final long b;

    public igx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof igx) {
            igx igxVar = (igx) obj;
            if (this.a == igxVar.a && this.b == igxVar.b) {
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
        return "LogReport{timestampMillis=" + this.a + ", size=" + this.b + "}";
    }

    public igx() {
        throw null;
    }
}
