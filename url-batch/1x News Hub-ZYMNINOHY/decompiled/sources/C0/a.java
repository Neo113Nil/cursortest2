package C0;

import io.appmetrica.analytics.AppMetricaDefaultValues;

/* loaded from: classes.dex */
public final class a {
    public static final a f = new a(10485760, 200, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f194c;

    /* renamed from: d, reason: collision with root package name */
    public final long f195d;

    /* renamed from: e, reason: collision with root package name */
    public final int f196e;

    public a(long j3, int i3, int i4, long j4, int i5) {
        this.f192a = j3;
        this.f193b = i3;
        this.f194c = i4;
        this.f195d = j4;
        this.f196e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f192a == aVar.f192a && this.f193b == aVar.f193b && this.f194c == aVar.f194c && this.f195d == aVar.f195d && this.f196e == aVar.f196e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f192a;
        int i3 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f193b) * 1000003) ^ this.f194c) * 1000003;
        long j4 = this.f195d;
        return ((i3 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f196e;
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f192a + ", loadBatchSize=" + this.f193b + ", criticalSectionEnterTimeoutMs=" + this.f194c + ", eventCleanUpAge=" + this.f195d + ", maxBlobByteSizePerRow=" + this.f196e + "}";
    }
}
