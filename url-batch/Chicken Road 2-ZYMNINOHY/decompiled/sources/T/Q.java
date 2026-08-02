package T;

import E.AbstractC0005f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public Object f2681a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2682b;

    /* renamed from: c, reason: collision with root package name */
    public int f2683c;

    /* renamed from: d, reason: collision with root package name */
    public long f2684d;

    /* renamed from: e, reason: collision with root package name */
    public long f2685e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2686f;

    /* renamed from: g, reason: collision with root package name */
    public C0085c f2687g = C0085c.f2767c;

    static {
        AbstractC0005f.s(0, 1, 2, 3, 4);
    }

    public final long a(int i4, int i5) {
        C0083a a3 = this.f2687g.a(i4);
        if (a3.f2756a != -1) {
            return a3.f2761f[i5];
        }
        return -9223372036854775807L;
    }

    public final int b(long j4) {
        C0083a a3;
        int i4;
        C0085c c0085c = this.f2687g;
        long j5 = this.f2684d;
        int i5 = c0085c.f2769a;
        if (j4 != Long.MIN_VALUE && (j5 == -9223372036854775807L || j4 < j5)) {
            int i6 = 0;
            while (i6 < i5) {
                c0085c.a(i6).getClass();
                c0085c.a(i6).getClass();
                if (0 > j4 && ((i4 = (a3 = c0085c.a(i6)).f2756a) == -1 || a3.a(-1) < i4)) {
                    break;
                }
                i6++;
            }
            if (i6 < i5) {
                if (j5 != -9223372036854775807L) {
                    c0085c.a(i6).getClass();
                    if (0 <= j5) {
                    }
                }
                return i6;
            }
        }
        return -1;
    }

    public final int c(long j4) {
        int i4;
        C0085c c0085c = this.f2687g;
        int i5 = c0085c.f2769a;
        int i6 = i5 - 1;
        if (i6 == i5 - 1) {
            c0085c.a(i6).getClass();
        }
        while (i6 >= 0 && j4 != Long.MIN_VALUE) {
            c0085c.a(i6).getClass();
            if (j4 >= 0) {
                break;
            }
            i6--;
        }
        if (i6 >= 0) {
            C0083a a3 = c0085c.a(i6);
            int i7 = a3.f2756a;
            if (i7 != -1) {
                while (i4 < i7) {
                    int i8 = a3.f2760e[i4];
                    i4 = (i8 == 0 || i8 == 1) ? 0 : i4 + 1;
                }
            }
            return i6;
        }
        return -1;
    }

    public final long d(int i4) {
        this.f2687g.a(i4).getClass();
        return 0L;
    }

    public final int e(int i4) {
        return this.f2687g.a(i4).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Q.class.equals(obj.getClass())) {
            return false;
        }
        Q q4 = (Q) obj;
        return Objects.equals(this.f2681a, q4.f2681a) && Objects.equals(this.f2682b, q4.f2682b) && this.f2683c == q4.f2683c && this.f2684d == q4.f2684d && this.f2685e == q4.f2685e && this.f2686f == q4.f2686f && Objects.equals(this.f2687g, q4.f2687g);
    }

    public final boolean f(int i4) {
        C0085c c0085c = this.f2687g;
        int i5 = c0085c.f2769a;
        if (i4 != i5 - 1 || i4 != i5 - 1) {
            return false;
        }
        c0085c.a(i4).getClass();
        return false;
    }

    public final boolean g(int i4) {
        this.f2687g.a(i4).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i4, long j4, long j5, C0085c c0085c, boolean z) {
        this.f2681a = obj;
        this.f2682b = obj2;
        this.f2683c = i4;
        this.f2684d = j4;
        this.f2685e = j5;
        this.f2687g = c0085c;
        this.f2686f = z;
    }

    public final int hashCode() {
        Object obj = this.f2681a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f2682b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f2683c) * 31;
        long j4 = this.f2684d;
        int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2685e;
        return this.f2687g.hashCode() + ((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f2686f ? 1 : 0)) * 31);
    }
}
