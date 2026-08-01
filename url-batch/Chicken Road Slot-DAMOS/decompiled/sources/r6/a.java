package r6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8181f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f8182a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8183b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8184c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8185d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8186e;

    public a(long j, int i3, int i10, long j3, int i11) {
        this.f8182a = j;
        this.f8183b = i3;
        this.f8184c = i10;
        this.f8185d = j3;
        this.f8186e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f8182a == aVar.f8182a && this.f8183b == aVar.f8183b && this.f8184c == aVar.f8184c && this.f8185d == aVar.f8185d && this.f8186e == aVar.f8186e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8182a;
        int i3 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f8183b) * 1000003) ^ this.f8184c) * 1000003;
        long j3 = this.f8185d;
        return ((i3 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f8186e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f8182a + ", loadBatchSize=" + this.f8183b + ", criticalSectionEnterTimeoutMs=" + this.f8184c + ", eventCleanUpAge=" + this.f8185d + ", maxBlobByteSizePerRow=" + this.f8186e + "}";
    }
}
