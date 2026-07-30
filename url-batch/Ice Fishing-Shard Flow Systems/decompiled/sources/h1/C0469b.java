package h1;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469b {

    /* renamed from: a, reason: collision with root package name */
    public final long f5128a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.i f5129b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.h f5130c;

    public C0469b(long j, a1.i iVar, a1.h hVar) {
        this.f5128a = j;
        this.f5129b = iVar;
        this.f5130c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0469b) {
            C0469b c0469b = (C0469b) obj;
            if (this.f5128a == c0469b.f5128a && this.f5129b.equals(c0469b.f5129b) && this.f5130c.equals(c0469b.f5130c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5128a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f5129b.hashCode()) * 1000003) ^ this.f5130c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f5128a + ", transportContext=" + this.f5129b + ", event=" + this.f5130c + "}";
    }
}
