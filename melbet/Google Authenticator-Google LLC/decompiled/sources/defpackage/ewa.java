package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewa {
    public final eub a;
    public final ewb b;

    public ewa(eub eubVar, ewb ewbVar) {
        this.a = eubVar;
        this.b = ewbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ewa) {
            ewa ewaVar = (ewa) obj;
            eub eubVar = this.a;
            if (eubVar != null ? eubVar.equals(ewaVar.a) : ewaVar.a == null) {
                if (this.b.equals(ewaVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        eub eubVar = this.a;
        return this.b.hashCode() ^ (((eubVar == null ? 0 : eubVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        ewb ewbVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + ewbVar.toString() + "}";
    }

    public ewa() {
        throw null;
    }
}
