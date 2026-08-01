package r6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f8187a;

    /* renamed from: b, reason: collision with root package name */
    public final k6.i f8188b;

    /* renamed from: c, reason: collision with root package name */
    public final k6.h f8189c;

    public b(long j, k6.i iVar, k6.h hVar) {
        this.f8187a = j;
        this.f8188b = iVar;
        this.f8189c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8187a == bVar.f8187a && this.f8188b.equals(bVar.f8188b) && this.f8189c.equals(bVar.f8189c);
    }

    public final int hashCode() {
        long j = this.f8187a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f8188b.hashCode()) * 1000003) ^ this.f8189c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f8187a + ", transportContext=" + this.f8188b + ", event=" + this.f8189c + "}";
    }
}
