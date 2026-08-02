package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fcl extends fcs {
    public final fcf a;

    public fcl(fcf fcfVar) {
        this.a = fcfVar;
    }

    @Override // defpackage.fcs
    public final String a() {
        return "signal";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fcl) {
            return this.a.equals(((fcl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SignallingConfig{service=" + this.a.toString() + "}";
    }

    public fcl() {
        throw null;
    }
}
