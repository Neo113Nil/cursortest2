package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gxk {
    public final long a;
    public final gzp b;

    public gxk(long j, gzp gzpVar) {
        this.a = j;
        this.b = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxk) {
            gxk gxkVar = (gxk) obj;
            if (this.a == gxkVar.a && this.b.equals(gxkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ParentInfo{ancestorRegionId=" + this.a + ", asyncInfo=" + this.b.toString() + "}";
    }

    public gxk() {
        throw null;
    }
}
