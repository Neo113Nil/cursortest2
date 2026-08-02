package S1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f2575a;

    /* renamed from: b, reason: collision with root package name */
    public final L1.j f2576b;

    /* renamed from: c, reason: collision with root package name */
    public final L1.i f2577c;

    public b(long j4, L1.j jVar, L1.i iVar) {
        this.f2575a = j4;
        this.f2576b = jVar;
        this.f2577c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2575a == bVar.f2575a && this.f2576b.equals(bVar.f2576b) && this.f2577c.equals(bVar.f2577c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f2575a;
        return ((((((int) ((j4 >>> 32) ^ j4)) ^ 1000003) * 1000003) ^ this.f2576b.hashCode()) * 1000003) ^ this.f2577c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f2575a + ", transportContext=" + this.f2576b + ", event=" + this.f2577c + "}";
    }
}
