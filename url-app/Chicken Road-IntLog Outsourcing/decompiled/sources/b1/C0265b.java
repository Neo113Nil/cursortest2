package b1;

import e1.InterfaceC0410a;
import java.util.HashMap;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0410a f4762a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4763b;

    public C0265b(InterfaceC0410a interfaceC0410a, HashMap hashMap) {
        this.f4762a = interfaceC0410a;
        this.f4763b = hashMap;
    }

    public final long a(S0.d dVar, long j2, int i2) {
        long e3 = j2 - this.f4762a.e();
        C0266c c0266c = (C0266c) this.f4763b.get(dVar);
        long j6 = c0266c.f4764a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2 - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * r12))), e3), c0266c.f4765b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0265b)) {
            return false;
        }
        C0265b c0265b = (C0265b) obj;
        return this.f4762a.equals(c0265b.f4762a) && this.f4763b.equals(c0265b.f4763b);
    }

    public final int hashCode() {
        return ((this.f4762a.hashCode() ^ 1000003) * 1000003) ^ this.f4763b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4762a + ", values=" + this.f4763b + "}";
    }
}
