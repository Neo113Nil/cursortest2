package F;

import b0.C0352v;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1902a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1903b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1904c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1905d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1906e;

    public y1(long j3, long j4, long j5, long j6, long j7) {
        this.f1902a = j3;
        this.f1903b = j4;
        this.f1904c = j5;
        this.f1905d = j6;
        this.f1906e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return C0352v.c(this.f1902a, y1Var.f1902a) && C0352v.c(this.f1903b, y1Var.f1903b) && C0352v.c(this.f1904c, y1Var.f1904c) && C0352v.c(this.f1905d, y1Var.f1905d) && C0352v.c(this.f1906e, y1Var.f1906e);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f1906e) + A.k.c(A.k.c(A.k.c(Long.hashCode(this.f1902a) * 31, 31, this.f1903b), 31, this.f1904c), 31, this.f1905d);
    }
}
