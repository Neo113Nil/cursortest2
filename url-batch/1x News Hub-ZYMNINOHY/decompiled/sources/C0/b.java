package C0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f197a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.i f198b;

    /* renamed from: c, reason: collision with root package name */
    public final v0.h f199c;

    public b(long j3, v0.i iVar, v0.h hVar) {
        this.f197a = j3;
        this.f198b = iVar;
        this.f199c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f197a == bVar.f197a && this.f198b.equals(bVar.f198b) && this.f199c.equals(bVar.f199c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f197a;
        return ((((((int) ((j3 >>> 32) ^ j3)) ^ 1000003) * 1000003) ^ this.f198b.hashCode()) * 1000003) ^ this.f199c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f197a + ", transportContext=" + this.f198b + ", event=" + this.f199c + "}";
    }
}
