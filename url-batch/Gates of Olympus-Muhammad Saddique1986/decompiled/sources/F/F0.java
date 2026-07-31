package F;

import b0.C0352v;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1147a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1148b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1149c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1150d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1151e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1152f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1153g;

    public F0(long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.f1147a = j3;
        this.f1148b = j4;
        this.f1149c = j5;
        this.f1150d = j6;
        this.f1151e = j7;
        this.f1152f = j8;
        this.f1153g = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return C0352v.c(this.f1147a, f02.f1147a) && C0352v.c(this.f1150d, f02.f1150d) && C0352v.c(this.f1148b, f02.f1148b) && C0352v.c(this.f1151e, f02.f1151e) && C0352v.c(this.f1149c, f02.f1149c) && C0352v.c(this.f1152f, f02.f1152f) && C0352v.c(this.f1153g, f02.f1153g);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f1153g) + A.k.c(A.k.c(A.k.c(A.k.c(A.k.c(Long.hashCode(this.f1147a) * 31, 31, this.f1150d), 31, this.f1148b), 31, this.f1151e), 31, this.f1149c), 31, this.f1152f);
    }
}
