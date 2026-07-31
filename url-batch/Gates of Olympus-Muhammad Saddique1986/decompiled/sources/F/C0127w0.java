package F;

import b0.C0352v;

/* renamed from: F.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127w0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1849a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1850b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1851c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1852d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1853e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1854f;

    public C0127w0(long j3, long j4, long j5, long j6, long j7, long j8) {
        this.f1849a = j3;
        this.f1850b = j4;
        this.f1851c = j5;
        this.f1852d = j6;
        this.f1853e = j7;
        this.f1854f = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0127w0)) {
            return false;
        }
        C0127w0 c0127w0 = (C0127w0) obj;
        return C0352v.c(this.f1849a, c0127w0.f1849a) && C0352v.c(this.f1850b, c0127w0.f1850b) && C0352v.c(this.f1851c, c0127w0.f1851c) && C0352v.c(this.f1852d, c0127w0.f1852d) && C0352v.c(this.f1853e, c0127w0.f1853e) && C0352v.c(this.f1854f, c0127w0.f1854f);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f1854f) + A.k.c(A.k.c(A.k.c(A.k.c(Long.hashCode(this.f1849a) * 31, 31, this.f1850b), 31, this.f1851c), 31, this.f1852d), 31, this.f1853e);
    }
}
