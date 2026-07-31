package F;

import b0.C0352v;

/* renamed from: F.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1711a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1712b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1713c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1714d;

    public C0112o0(long j3, long j4, long j5, long j6) {
        this.f1711a = j3;
        this.f1712b = j4;
        this.f1713c = j5;
        this.f1714d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0112o0)) {
            return false;
        }
        C0112o0 c0112o0 = (C0112o0) obj;
        return C0352v.c(this.f1711a, c0112o0.f1711a) && C0352v.c(this.f1712b, c0112o0.f1712b) && C0352v.c(this.f1713c, c0112o0.f1713c) && C0352v.c(this.f1714d, c0112o0.f1714d);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f1714d) + A.k.c(A.k.c(Long.hashCode(this.f1711a) * 31, 31, this.f1712b), 31, this.f1713c);
    }
}
