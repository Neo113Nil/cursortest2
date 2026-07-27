package D;

import A.AbstractC0017m;
import Z.C0323u;
import y2.y;

/* renamed from: D.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154n0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1920a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1921b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1922c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1923d;

    public C0154n0(long j4, long j5, long j6, long j7) {
        this.f1920a = j4;
        this.f1921b = j5;
        this.f1922c = j6;
        this.f1923d = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0154n0)) {
            return false;
        }
        C0154n0 c0154n0 = (C0154n0) obj;
        return C0323u.c(this.f1920a, c0154n0.f1920a) && C0323u.c(this.f1921b, c0154n0.f1921b) && C0323u.c(this.f1922c, c0154n0.f1922c) && C0323u.c(this.f1923d, c0154n0.f1923d);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f1923d) + AbstractC0017m.c(AbstractC0017m.c(Long.hashCode(this.f1920a) * 31, 31, this.f1921b), 31, this.f1922c);
    }
}
