package R1;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a2.i f2327a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2328b;

    public b(a2.i iVar, HashMap hashMap) {
        this.f2327a = iVar;
        this.f2328b = hashMap;
    }

    public final long a(I1.c cVar, long j4, int i4) {
        long q4 = j4 - this.f2327a.q();
        c cVar2 = (c) this.f2328b.get(cVar);
        long j5 = cVar2.f2329a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i4 - 1) * j5 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j5 > 1 ? j5 : 2L) * r12))), q4), cVar2.f2330b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2327a.equals(bVar.f2327a) && this.f2328b.equals(bVar.f2328b);
    }

    public final int hashCode() {
        return ((this.f2327a.hashCode() ^ 1000003) * 1000003) ^ this.f2328b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f2327a + ", values=" + this.f2328b + "}";
    }
}
