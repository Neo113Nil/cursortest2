package F;

import H2.AbstractC0080b;
import b0.C0288u;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final long f1120a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1121b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1122c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1123d;

    public V(long j3, long j4, long j5, long j6) {
        this.f1120a = j3;
        this.f1121b = j4;
        this.f1122c = j5;
        this.f1123d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof V)) {
            return false;
        }
        V v3 = (V) obj;
        return C0288u.c(this.f1120a, v3.f1120a) && C0288u.c(this.f1121b, v3.f1121b) && C0288u.c(this.f1122c, v3.f1122c) && C0288u.c(this.f1123d, v3.f1123d);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Long.hashCode(this.f1123d) + AbstractC0080b.d(AbstractC0080b.d(Long.hashCode(this.f1120a) * 31, 31, this.f1121b), 31, this.f1122c);
    }
}
