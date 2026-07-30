package a5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f490a;

    /* renamed from: b, reason: collision with root package name */
    public final long f491b;

    /* renamed from: c, reason: collision with root package name */
    public final long f492c;

    public a(long j8, long j9, long j10) {
        this.f490a = j8;
        this.f491b = j9;
        this.f492c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f490a == aVar.f490a && this.f491b == aVar.f491b && this.f492c == aVar.f492c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f490a;
        long j9 = this.f491b;
        int i7 = (((((int) (j8 ^ (j8 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f492c;
        return i7 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f490a + ", elapsedRealtime=" + this.f491b + ", uptimeMillis=" + this.f492c + "}";
    }
}
