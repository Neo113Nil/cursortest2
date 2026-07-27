package m;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847u {

    /* renamed from: a, reason: collision with root package name */
    public final float f8191a;

    /* renamed from: b, reason: collision with root package name */
    public final Z.S f8192b;

    public C0847u(float f4, Z.S s4) {
        this.f8191a = f4;
        this.f8192b = s4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0847u)) {
            return false;
        }
        C0847u c0847u = (C0847u) obj;
        return M0.e.a(this.f8191a, c0847u.f8191a) && this.f8192b.equals(c0847u.f8192b);
    }

    public final int hashCode() {
        return this.f8192b.hashCode() + (Float.hashCode(this.f8191a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) M0.e.c(this.f8191a)) + ", brush=" + this.f8192b + ')';
    }
}
