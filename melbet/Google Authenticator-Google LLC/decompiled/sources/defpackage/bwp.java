package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwp {
    public final boolean a;
    public final hel b;

    public bwp(boolean z, hel helVar) {
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
        if (obj instanceof bwp) {
            bwp bwpVar = (bwp) obj;
            if (this.a == bwpVar.a && hnu.H(this.b, bwpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OfflineMigrationResult{otpDeletionSuccessful=" + this.a + ", localOtps=" + this.b.toString() + "}";
    }

    public bwp() {
        throw null;
    }
}
