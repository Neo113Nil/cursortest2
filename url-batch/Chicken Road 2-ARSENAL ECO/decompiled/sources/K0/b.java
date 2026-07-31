package K0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f1349a;

    /* renamed from: b, reason: collision with root package name */
    public final D0.j f1350b;

    /* renamed from: c, reason: collision with root package name */
    public final D0.i f1351c;

    public b(long j4, D0.j jVar, D0.i iVar) {
        this.f1349a = j4;
        this.f1350b = jVar;
        this.f1351c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f1349a == bVar.f1349a && this.f1350b.equals(bVar.f1350b) && this.f1351c.equals(bVar.f1351c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1349a;
        return ((((((int) ((j4 >>> 32) ^ j4)) ^ 1000003) * 1000003) ^ this.f1350b.hashCode()) * 1000003) ^ this.f1351c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f1349a + ", transportContext=" + this.f1350b + ", event=" + this.f1351c + "}";
    }
}
