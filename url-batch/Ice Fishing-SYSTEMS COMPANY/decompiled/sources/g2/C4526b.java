package g2;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4526b {

    /* renamed from: a, reason: collision with root package name */
    public final long f37865a;

    /* renamed from: b, reason: collision with root package name */
    public final Z1.i f37866b;

    /* renamed from: c, reason: collision with root package name */
    public final Z1.h f37867c;

    public C4526b(long j9, Z1.i iVar, Z1.h hVar) {
        this.f37865a = j9;
        this.f37866b = iVar;
        this.f37867c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4526b) {
            C4526b c4526b = (C4526b) obj;
            if (this.f37865a == c4526b.f37865a && this.f37866b.equals(c4526b.f37866b) && this.f37867c.equals(c4526b.f37867c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f37865a;
        return ((((((int) ((j9 >>> 32) ^ j9)) ^ 1000003) * 1000003) ^ this.f37866b.hashCode()) * 1000003) ^ this.f37867c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f37865a + ", transportContext=" + this.f37866b + ", event=" + this.f37867c + "}";
    }
}
