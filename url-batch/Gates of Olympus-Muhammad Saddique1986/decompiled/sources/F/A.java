package F;

import b0.C0352v;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final long f1091a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1092b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1093c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1094d;

    public A(long j3, long j4, long j5, long j6) {
        this.f1091a = j3;
        this.f1092b = j4;
        this.f1093c = j5;
        this.f1094d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        return C0352v.c(this.f1091a, a3.f1091a) && C0352v.c(this.f1092b, a3.f1092b) && C0352v.c(this.f1093c, a3.f1093c) && C0352v.c(this.f1094d, a3.f1094d);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f1094d) + A.k.c(A.k.c(Long.hashCode(this.f1091a) * 31, 31, this.f1092b), 31, this.f1093c);
    }
}
