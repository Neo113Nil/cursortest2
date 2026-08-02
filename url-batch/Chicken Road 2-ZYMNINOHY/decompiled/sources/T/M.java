package T;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2669a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2670b;

    /* renamed from: c, reason: collision with root package name */
    public final C0107z f2671c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2672d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2673e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2674f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2675g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2676h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2677i;

    static {
        AbstractC0005f.s(0, 1, 2, 3, 4);
        W.J.G(5);
        W.J.G(6);
    }

    public M(Object obj, int i4, C0107z c0107z, Object obj2, int i5, long j4, long j5, int i6, int i7) {
        AbstractC0124a.h(i4 >= 0);
        AbstractC0124a.h(i5 >= 0);
        this.f2669a = obj;
        this.f2670b = i4;
        this.f2671c = c0107z;
        this.f2672d = obj2;
        this.f2673e = i5;
        this.f2674f = j4;
        this.f2675g = j5;
        this.f2676h = i6;
        this.f2677i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M.class == obj.getClass()) {
            M m4 = (M) obj;
            if (this.f2670b == m4.f2670b && this.f2673e == m4.f2673e && this.f2674f == m4.f2674f && this.f2675g == m4.f2675g && this.f2676h == m4.f2676h && this.f2677i == m4.f2677i && Objects.equals(this.f2671c, m4.f2671c) && Objects.equals(this.f2669a, m4.f2669a) && Objects.equals(this.f2672d, m4.f2672d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2669a, Integer.valueOf(this.f2670b), this.f2671c, this.f2672d, Integer.valueOf(this.f2673e), Long.valueOf(this.f2674f), Long.valueOf(this.f2675g), Integer.valueOf(this.f2676h), Integer.valueOf(this.f2677i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f2670b + ", period=" + this.f2673e + ", pos=" + this.f2674f;
        int i4 = this.f2676h;
        if (i4 == -1) {
            return str;
        }
        return str + ", contentPos=" + this.f2675g + ", adGroup=" + i4 + ", ad=" + this.f2677i;
    }
}
