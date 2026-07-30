package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class yb {
    public final me1 a;
    public final HashMap b;

    public yb(me1 me1Var, HashMap hashMap) {
        this.a = me1Var;
        this.b = hashMap;
    }

    public final long a(dz0 dz0Var, long j, int i) {
        long d = j - this.a.d();
        zb zbVar = (zb) this.b.get(dz0Var);
        long j2 = zbVar.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), d), zbVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yb)) {
            return false;
        }
        yb ybVar = (yb) obj;
        return this.a.equals(ybVar.a) && this.b.equals(ybVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
