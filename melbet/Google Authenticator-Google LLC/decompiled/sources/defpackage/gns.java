package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gns {
    public final gzp a;
    public final her b;
    public final gzp c;

    public gns(gzp gzpVar, her herVar, gzp gzpVar2) {
        if (gzpVar == null) {
            throw new NullPointerException("Null accountName");
        }
        this.a = gzpVar;
        if (herVar == null) {
            throw new NullPointerException("Null psdList");
        }
        this.b = herVar;
        this.c = gzpVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gns) {
            gns gnsVar = (gns) obj;
            if (this.a.equals(gnsVar.a) && this.b.equals(gnsVar.b) && this.c.equals(gnsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        gzp gzpVar = this.c;
        her herVar = this.b;
        return "FeedbackContext{accountName=" + this.a.toString() + ", psdList=" + herVar.toString() + ", screenshot=" + gzpVar.toString() + "}";
    }

    public gns() {
        throw null;
    }
}
