package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbx {
    public final gby a;
    public final gzp b;

    public gbx(gby gbyVar, gzp gzpVar) {
        this.a = gbyVar;
        this.b = gzpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gbx) {
            gbx gbxVar = (gbx) obj;
            if (this.a.equals(gbxVar.a) && this.b.equals(gbxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "PeriodicWorkSpec{repeatInterval=" + this.a.toString() + ", flexInterval=Optional.absent()}";
    }

    public gbx() {
        throw null;
    }
}
