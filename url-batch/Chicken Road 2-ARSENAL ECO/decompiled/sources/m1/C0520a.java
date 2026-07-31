package m1;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520a {

    /* renamed from: a, reason: collision with root package name */
    public final long f5411a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5412b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5413c;

    public C0520a(long j4, long j7, long j8) {
        this.f5411a = j4;
        this.f5412b = j7;
        this.f5413c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0520a) {
            C0520a c0520a = (C0520a) obj;
            if (this.f5411a == c0520a.f5411a && this.f5412b == c0520a.f5412b && this.f5413c == c0520a.f5413c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f5411a;
        long j7 = this.f5412b;
        int i7 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f5413c;
        return i7 ^ ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f5411a + ", elapsedRealtime=" + this.f5412b + ", uptimeMillis=" + this.f5413c + "}";
    }
}
