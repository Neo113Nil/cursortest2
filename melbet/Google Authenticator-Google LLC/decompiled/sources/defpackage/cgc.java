package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgc {
    public final long a;
    public final ces b;
    public final ceo c;

    public cgc(long j, ces cesVar, ceo ceoVar) {
        this.a = j;
        this.b = cesVar;
        this.c = ceoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgc) {
            cgc cgcVar = (cgc) obj;
            if (this.a == cgcVar.a && this.b.equals(cgcVar.b) && this.c.equals(cgcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        ceo ceoVar = this.c;
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b.toString() + ", event=" + ceoVar.toString() + "}";
    }

    public cgc() {
        throw null;
    }
}
