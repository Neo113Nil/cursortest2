package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpr {
    public final gps a;
    public final long b;

    public gpr(gps gpsVar, long j) {
        if (gpsVar == null) {
            throw new NullPointerException("Null constraintType");
        }
        this.a = gpsVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpr) {
            gpr gprVar = (gpr) obj;
            if (this.a.equals(gprVar.a) && this.b == gprVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "SyncConstraint{constraintType=" + this.a.toString() + ", applicablePeriod=" + this.b + "}";
    }

    public gpr() {
        throw null;
    }
}
