package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfr {
    public final Map a;
    private final cgw b;

    public cfr(cgw cgwVar, Map map) {
        this.b = cgwVar;
        this.a = map;
    }

    public final long a(ccn ccnVar, long j, int i, boolean z) {
        long currentTimeMillis = j - System.currentTimeMillis();
        cfp cfpVar = (cfp) this.a.get(ccnVar);
        long j2 = z ? 1L : cfpVar.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), currentTimeMillis), cfpVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfr) {
            cfr cfrVar = (cfr) obj;
            if (this.b.equals(cfrVar.b) && this.a.equals(cfrVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ 1000003;
        return this.a.hashCode() ^ (hashCode * 1000003);
    }

    public final String toString() {
        Map map = this.a;
        return "SchedulerConfig{clock=" + this.b.toString() + ", values=" + map.toString() + "}";
    }

    public cfr() {
        throw null;
    }
}
