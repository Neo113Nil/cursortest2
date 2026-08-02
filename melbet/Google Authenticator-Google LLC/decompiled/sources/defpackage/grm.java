package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grm {
    public final grn a;
    public final hvi b;

    public grm(grn grnVar, hvi hviVar) {
        this.a = grnVar;
        this.b = hviVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof grm) {
            grm grmVar = (grm) obj;
            if (this.a.equals(grmVar.a) && this.b.equals(grmVar.b)) {
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
        hvi hviVar = this.b;
        return "MonitorReport{monitor=" + this.a.toString() + ", startReport=" + hviVar.toString() + "}";
    }

    public grm() {
        throw null;
    }
}
