package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwq {
    public final boolean a;
    public final hel b;

    public bwq(boolean z, hel helVar) {
        this.a = z;
        if (helVar == null) {
            throw new NullPointerException("Null localOtps");
        }
        this.b = helVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwq) {
            bwq bwqVar = (bwq) obj;
            if (this.a == bwqVar.a && hnu.H(this.b, bwqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OnlineMigrationResult{passboxSyncSuccessful=" + this.a + ", localOtps=" + this.b.toString() + "}";
    }

    public bwq() {
        throw null;
    }
}
