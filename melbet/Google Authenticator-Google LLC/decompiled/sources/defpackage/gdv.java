package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gdv {
    public final long a;

    public gdv(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof gdv) && this.a == ((gdv) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "FetchTaskIdentifier{index=" + this.a + "}";
    }

    public gdv() {
        throw null;
    }
}
