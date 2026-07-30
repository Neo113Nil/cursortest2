package h1;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0468a f5122f = new C0468a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f5123a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5125c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5126d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5127e;

    public C0468a(long j, int i2, int i5, long j7, int i7) {
        this.f5123a = j;
        this.f5124b = i2;
        this.f5125c = i5;
        this.f5126d = j7;
        this.f5127e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0468a) {
            C0468a c0468a = (C0468a) obj;
            if (this.f5123a == c0468a.f5123a && this.f5124b == c0468a.f5124b && this.f5125c == c0468a.f5125c && this.f5126d == c0468a.f5126d && this.f5127e == c0468a.f5127e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5123a;
        int i2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5124b) * 1000003) ^ this.f5125c) * 1000003;
        long j7 = this.f5126d;
        return ((i2 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f5127e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f5123a + ", loadBatchSize=" + this.f5124b + ", criticalSectionEnterTimeoutMs=" + this.f5125c + ", eventCleanUpAge=" + this.f5126d + ", maxBlobByteSizePerRow=" + this.f5127e + "}";
    }
}
