package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gfn {
    public final gex a;
    public final gft b;

    public gfn(gex gexVar, gft gftVar) {
        if (gexVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.a = gexVar;
        this.b = gftVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfn) {
            gfn gfnVar = (gfn) obj;
            if (this.a.equals(gfnVar.a) && this.b.equals(gfnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        gft gftVar = this.b;
        return "CallbackResult{callbacks=" + this.a.toString() + ", result=" + gftVar.toString() + "}";
    }

    public gfn() {
        throw null;
    }
}
