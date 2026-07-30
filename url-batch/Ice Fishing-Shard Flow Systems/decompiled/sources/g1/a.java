package g1;

import j1.InterfaceC0568a;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0568a f4973a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4974b;

    public a(InterfaceC0568a interfaceC0568a, HashMap hashMap) {
        this.f4973a = interfaceC0568a;
        this.f4974b = hashMap;
    }

    public final long a(X0.d dVar, long j, int i2) {
        long d7 = j - this.f4973a.d();
        b bVar = (b) this.f4974b.get(dVar);
        long j7 = bVar.f4975a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * r12))), d7), bVar.f4976b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4973a.equals(aVar.f4973a) && this.f4974b.equals(aVar.f4974b);
    }

    public final int hashCode() {
        return ((this.f4973a.hashCode() ^ 1000003) * 1000003) ^ this.f4974b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4973a + ", values=" + this.f4974b + "}";
    }
}
