package q6;

import java.util.HashMap;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f8027a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8028b;

    public a(c0 c0Var, HashMap hashMap) {
        this.f8027a = c0Var;
        this.f8028b = hashMap;
    }

    public final long a(h6.d dVar, long j, int i3) {
        long g = j - this.f8027a.g();
        b bVar = (b) this.f8028b.get(dVar);
        long j3 = bVar.f8029a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i3 - 1) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j3 > 1 ? j3 : 2L) * r12))), g), bVar.f8030b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8027a.equals(aVar.f8027a) && this.f8028b.equals(aVar.f8028b);
    }

    public final int hashCode() {
        return ((this.f8027a.hashCode() ^ 1000003) * 1000003) ^ this.f8028b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f8027a + ", values=" + this.f8028b + "}";
    }
}
