package P1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f2253a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2254b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2255c;

    public a(long j, long j7, long j8) {
        this.f2253a = j;
        this.f2254b = j7;
        this.f2255c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2253a == aVar.f2253a && this.f2254b == aVar.f2254b && this.f2255c == aVar.f2255c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2253a;
        long j7 = this.f2254b;
        int i2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f2255c;
        return i2 ^ ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f2253a + ", elapsedRealtime=" + this.f2254b + ", uptimeMillis=" + this.f2255c + "}";
    }
}
