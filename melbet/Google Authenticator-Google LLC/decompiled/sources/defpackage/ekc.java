package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ekc {
    public final lgl a;
    public final hel b;

    public ekc(lgl lglVar, hel helVar) {
        if (lglVar == null) {
            throw new NullPointerException("Null debugLogs");
        }
        this.a = lglVar;
        if (helVar == null) {
            throw new NullPointerException("Null nativeDebugLogs");
        }
        this.b = helVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekc) {
            ekc ekcVar = (ekc) obj;
            if (this.a.equals(ekcVar.a) && hnu.H(this.b, ekcVar.b)) {
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
        hel helVar = this.b;
        return "Snapshot{debugLogs=" + this.a.toString() + ", nativeDebugLogs=" + helVar.toString() + "}";
    }

    public ekc() {
        throw null;
    }
}
