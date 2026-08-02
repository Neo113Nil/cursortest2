package S1;

import E.AbstractC0005f;
import io.appmetrica.analytics.AppMetricaDefaultValues;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2569f = new a(10485760, 200, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f2570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2571b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2572c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2573d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2574e;

    public a(long j4, int i4, int i5, long j5, int i6) {
        this.f2570a = j4;
        this.f2571b = i4;
        this.f2572c = i5;
        this.f2573d = j5;
        this.f2574e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2570a == aVar.f2570a && this.f2571b == aVar.f2571b && this.f2572c == aVar.f2572c && this.f2573d == aVar.f2573d && this.f2574e == aVar.f2574e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f2570a;
        int i4 = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f2571b) * 1000003) ^ this.f2572c) * 1000003;
        long j5 = this.f2573d;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f2574e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f2570a);
        sb.append(", loadBatchSize=");
        sb.append(this.f2571b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f2572c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f2573d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC0005f.o(sb, this.f2574e, "}");
    }
}
