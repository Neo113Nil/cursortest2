package V1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4156a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4157b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4158c;

    public a(long j4, long j5, long j6) {
        this.f4156a = j4;
        this.f4157b = j5;
        this.f4158c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4156a == aVar.f4156a && this.f4157b == aVar.f4157b && this.f4158c == aVar.f4158c;
    }

    public final int hashCode() {
        long j4 = this.f4156a;
        long j5 = this.f4157b;
        int i2 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f4158c;
        return i2 ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f4156a + ", elapsedRealtime=" + this.f4157b + ", uptimeMillis=" + this.f4158c + "}";
    }
}
