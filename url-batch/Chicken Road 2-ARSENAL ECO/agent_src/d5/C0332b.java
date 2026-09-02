package d5;

import b5.C0266a;
import f5.C0387a;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332b {

    /* renamed from: a, reason: collision with root package name */
    public final C0387a f3960a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3961b;

    /* renamed from: c, reason: collision with root package name */
    public final C0266a f3962c;

    public C0332b(C0387a c0387a, long j4, C0266a c0266a) {
        if (c0387a == null) {
            throw new NullPointerException("Null resource");
        }
        this.f3960a = c0387a;
        this.f3961b = j4;
        if (c0266a == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.f3962c = c0266a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0332b)) {
            return false;
        }
        C0332b c0332b = (C0332b) obj;
        c0332b.getClass();
        Object obj2 = O4.d.f1793a;
        return obj2.equals(obj2) && this.f3960a.equals(c0332b.f3960a) && this.f3961b == c0332b.f3961b && this.f3962c.equals(c0332b.f3962c);
    }

    public final int hashCode() {
        int hashCode = (((O4.d.f1793a.hashCode() ^ 1000003) * 1000003) ^ this.f3960a.hashCode()) * 1000003;
        long j4 = this.f3961b;
        return ((hashCode ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f3962c.hashCode();
    }

    public final String toString() {
        return "MeterProviderSharedState{clock=" + O4.d.f1793a + ", resource=" + this.f3960a + ", startEpochNanos=" + this.f3961b + ", exemplarFilter=" + this.f3962c + "}";
    }
}
