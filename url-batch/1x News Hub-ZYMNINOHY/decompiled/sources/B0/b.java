package B0;

import java.util.HashMap;
import s0.EnumC1186c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final K0.j f114a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f115b;

    public b(K0.j jVar, HashMap hashMap) {
        this.f114a = jVar;
        this.f115b = hashMap;
    }

    public final long a(EnumC1186c enumC1186c, long j3, int i3) {
        long d3 = j3 - this.f114a.d();
        c cVar = (c) this.f115b.get(enumC1186c);
        long j4 = cVar.f116a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i3 - 1) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j4 > 1 ? j4 : 2L) * r12))), d3), cVar.f117b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f114a.equals(bVar.f114a) && this.f115b.equals(bVar.f115b);
    }

    public final int hashCode() {
        return ((this.f114a.hashCode() ^ 1000003) * 1000003) ^ this.f115b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f114a + ", values=" + this.f115b + "}";
    }
}
