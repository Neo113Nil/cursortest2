package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7265a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7267c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7268d;

    public c0(int i7, int i8, int i9, int i10) {
        this.f7265a = i7;
        this.f7266b = i8;
        this.f7267c = i9;
        this.f7268d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f7265a == c0Var.f7265a && this.f7266b == c0Var.f7266b && this.f7267c == c0Var.f7267c && this.f7268d == c0Var.f7268d;
    }

    public final int hashCode() {
        return (((((this.f7265a * 31) + this.f7266b) * 31) + this.f7267c) * 31) + this.f7268d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f7265a);
        sb.append(", top=");
        sb.append(this.f7266b);
        sb.append(", right=");
        sb.append(this.f7267c);
        sb.append(", bottom=");
        return a0.m.l(sb, this.f7268d, ')');
    }
}
