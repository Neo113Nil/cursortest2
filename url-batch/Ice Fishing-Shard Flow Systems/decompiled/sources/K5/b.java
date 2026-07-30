package K5;

import v5.C0978d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f1464a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1465b;

    /* renamed from: c, reason: collision with root package name */
    public final I5.a f1466c;

    public b(M5.a aVar, long j, I5.a aVar2) {
        if (aVar == null) {
            throw new NullPointerException("Null resource");
        }
        this.f1464a = aVar;
        this.f1465b = j;
        if (aVar2 == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.f1466c = aVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        Object obj2 = C0978d.f8235a;
        return obj2.equals(obj2) && this.f1464a.equals(bVar.f1464a) && this.f1465b == bVar.f1465b && this.f1466c.equals(bVar.f1466c);
    }

    public final int hashCode() {
        int hashCode = (((C0978d.f8235a.hashCode() ^ 1000003) * 1000003) ^ this.f1464a.hashCode()) * 1000003;
        long j = this.f1465b;
        return ((hashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f1466c.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + C0978d.f8235a + ", resource=" + this.f1464a + ", startEpochNanos=" + this.f1465b + ", exemplarFilter=" + this.f1466c + "}";
    }
}
