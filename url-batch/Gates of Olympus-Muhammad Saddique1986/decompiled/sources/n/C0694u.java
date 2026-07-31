package n;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694u {

    /* renamed from: a, reason: collision with root package name */
    public final float f7207a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.T f7208b;

    public C0694u(float f3, b0.T t3) {
        this.f7207a = f3;
        this.f7208b = t3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0694u)) {
            return false;
        }
        C0694u c0694u = (C0694u) obj;
        return O0.e.a(this.f7207a, c0694u.f7207a) && this.f7208b.equals(c0694u.f7208b);
    }

    public final int hashCode() {
        return this.f7208b.hashCode() + (Float.hashCode(this.f7207a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) O0.e.b(this.f7207a)) + ", brush=" + this.f7208b + ')';
    }
}
