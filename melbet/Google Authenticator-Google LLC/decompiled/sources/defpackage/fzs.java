package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzs {
    public final eej a;
    public final gzp b;

    public fzs(eej eejVar, gzp gzpVar) {
        this.a = eejVar;
        this.b = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fzs) {
            fzs fzsVar = (fzs) obj;
            if (this.a.equals(fzsVar.a) && this.b.equals(fzsVar.b)) {
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
        gzp gzpVar = this.b;
        return "Options{features=" + String.valueOf(this.a) + ", topViewCreator=" + String.valueOf(gzpVar) + "}";
    }

    public fzs() {
        throw null;
    }
}
