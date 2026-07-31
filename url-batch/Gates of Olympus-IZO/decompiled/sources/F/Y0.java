package F;

import H2.AbstractC0080b;
import b0.C0288u;

/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1167a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1168b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1169c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1170d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1171e;

    public Y0(long j3, long j4, long j5, long j6, long j7) {
        this.f1167a = j3;
        this.f1168b = j4;
        this.f1169c = j5;
        this.f1170d = j6;
        this.f1171e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Y0)) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        return C0288u.c(this.f1167a, y02.f1167a) && C0288u.c(this.f1168b, y02.f1168b) && C0288u.c(this.f1169c, y02.f1169c) && C0288u.c(this.f1170d, y02.f1170d) && C0288u.c(this.f1171e, y02.f1171e);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f1171e) + AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(Long.hashCode(this.f1167a) * 31, 31, this.f1168b), 31, this.f1169c), 31, this.f1170d);
    }
}
