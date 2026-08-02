package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class igz {
    private final hkq a;
    private final String b;

    public igz(hkq hkqVar, String str) {
        this.a = hkqVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof igz) {
            igz igzVar = (igz) obj;
            if (this.a.equals(igzVar.a) && ((str = this.b) != null ? str.equals(igzVar.b) : igzVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + "}";
    }

    public igz() {
        throw null;
    }
}
