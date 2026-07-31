package J0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final M0.a f1239a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1240b;

    public b(M0.a aVar, HashMap hashMap) {
        this.f1239a = aVar;
        this.f1240b = hashMap;
    }

    public final long a(A0.d dVar, long j4, int i7) {
        long c7 = j4 - this.f1239a.c();
        c cVar = (c) this.f1240b.get(dVar);
        long j7 = cVar.f1241a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i7 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * r12))), c7), cVar.f1242b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1239a.equals(bVar.f1239a) && this.f1240b.equals(bVar.f1240b);
    }

    public final int hashCode() {
        return ((this.f1239a.hashCode() ^ 1000003) * 1000003) ^ this.f1240b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f1239a + ", values=" + this.f1240b + "}";
    }
}
