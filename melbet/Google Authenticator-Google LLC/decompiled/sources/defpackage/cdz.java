package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdz {
    public final long a;

    public cdz(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cdz) && this.a == ((cdz) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }

    public cdz() {
        throw null;
    }
}
