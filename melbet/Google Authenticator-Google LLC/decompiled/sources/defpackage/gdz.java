package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gdz {
    public final long a;

    public gdz(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof gdz) && this.a == ((gdz) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "LoadTaskIdentifier{index=" + this.a + "}";
    }

    public gdz() {
        throw null;
    }
}
