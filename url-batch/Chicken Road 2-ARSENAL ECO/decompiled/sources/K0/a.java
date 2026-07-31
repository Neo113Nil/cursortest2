package K0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1343f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f1344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1346c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1347d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1348e;

    public a(long j4, int i7, int i8, long j7, int i9) {
        this.f1344a = j4;
        this.f1345b = i7;
        this.f1346c = i8;
        this.f1347d = j7;
        this.f1348e = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f1344a == aVar.f1344a && this.f1345b == aVar.f1345b && this.f1346c == aVar.f1346c && this.f1347d == aVar.f1347d && this.f1348e == aVar.f1348e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f1344a;
        int i7 = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f1345b) * 1000003) ^ this.f1346c) * 1000003;
        long j7 = this.f1347d;
        return ((i7 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f1348e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f1344a + ", loadBatchSize=" + this.f1345b + ", criticalSectionEnterTimeoutMs=" + this.f1346c + ", eventCleanUpAge=" + this.f1347d + ", maxBlobByteSizePerRow=" + this.f1348e + "}";
    }
}
