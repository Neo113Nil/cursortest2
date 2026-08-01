package g8;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4289a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4290b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4291c;

    public a(long j, long j3, long j10) {
        this.f4289a = j;
        this.f4290b = j3;
        this.f4291c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f4289a == aVar.f4289a && this.f4290b == aVar.f4290b && this.f4291c == aVar.f4291c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4289a;
        long j3 = this.f4290b;
        int i3 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f4291c;
        return i3 ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f4289a + ", elapsedRealtime=" + this.f4290b + ", uptimeMillis=" + this.f4291c + "}";
    }
}
