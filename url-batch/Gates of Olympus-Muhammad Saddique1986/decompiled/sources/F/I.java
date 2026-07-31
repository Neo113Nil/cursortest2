package F;

import b0.C0352v;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final long f1187a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1188b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1189c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1190d;

    public I(long j3, long j4, long j5, long j6) {
        this.f1187a = j3;
        this.f1188b = j4;
        this.f1189c = j5;
        this.f1190d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return C0352v.c(this.f1187a, i3.f1187a) && C0352v.c(this.f1188b, i3.f1188b) && C0352v.c(this.f1189c, i3.f1189c) && C0352v.c(this.f1190d, i3.f1190d);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Long.hashCode(this.f1190d) + A.k.c(A.k.c(Long.hashCode(this.f1187a) * 31, 31, this.f1188b), 31, this.f1189c);
    }
}
