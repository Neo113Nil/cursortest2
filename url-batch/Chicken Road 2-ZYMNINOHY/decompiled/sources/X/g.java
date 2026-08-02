package X;

import T.D;

/* loaded from: classes.dex */
public final class g implements D {

    /* renamed from: a, reason: collision with root package name */
    public final long f3499a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3500b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3501c;

    public g(long j4, long j5, long j6) {
        this.f3499a = j4;
        this.f3500b = j5;
        this.f3501c = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3499a == gVar.f3499a && this.f3500b == gVar.f3500b && this.f3501c == gVar.f3501c;
    }

    public final int hashCode() {
        return O3.l.r(this.f3501c) + ((O3.l.r(this.f3500b) + ((O3.l.r(this.f3499a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f3499a + ", modification time=" + this.f3500b + ", timescale=" + this.f3501c;
    }
}
