package D;

import A.AbstractC0017m;
import Z.C0323u;
import y2.y;

/* renamed from: D.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2092a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2093b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2094c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2095d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2096e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2097f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2098g;

    public C0181x0(long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f2092a = j4;
        this.f2093b = j5;
        this.f2094c = j6;
        this.f2095d = j7;
        this.f2096e = j8;
        this.f2097f = j9;
        this.f2098g = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0181x0)) {
            return false;
        }
        C0181x0 c0181x0 = (C0181x0) obj;
        return C0323u.c(this.f2092a, c0181x0.f2092a) && C0323u.c(this.f2095d, c0181x0.f2095d) && C0323u.c(this.f2093b, c0181x0.f2093b) && C0323u.c(this.f2096e, c0181x0.f2096e) && C0323u.c(this.f2094c, c0181x0.f2094c) && C0323u.c(this.f2097f, c0181x0.f2097f) && C0323u.c(this.f2098g, c0181x0.f2098g);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Long.hashCode(this.f2098g) + AbstractC0017m.c(AbstractC0017m.c(AbstractC0017m.c(AbstractC0017m.c(AbstractC0017m.c(Long.hashCode(this.f2092a) * 31, 31, this.f2095d), 31, this.f2093b), 31, this.f2096e), 31, this.f2094c), 31, this.f2097f);
    }
}
