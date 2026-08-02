package t0;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426a {

    /* renamed from: a, reason: collision with root package name */
    public final long f15264a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15265b;

    public C1426a(long j4, long j5) {
        this.f15264a = j4;
        this.f15265b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1426a)) {
            return false;
        }
        C1426a c1426a = (C1426a) obj;
        return this.f15264a == c1426a.f15264a && this.f15265b == c1426a.f15265b;
    }

    public final int hashCode() {
        return (((int) this.f15264a) * 31) + ((int) this.f15265b);
    }
}
