package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f73a;

    /* renamed from: b, reason: collision with root package name */
    public final long f74b;

    public g1(long j8, long j9) {
        this.f73a = j8;
        this.f74b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return z0.u.c(this.f73a, g1Var.f73a) && z0.u.c(this.f74b, g1Var.f74b);
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return Long.hashCode(this.f74b) + (Long.hashCode(this.f73a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        m.r(this.f73a, sb, ", selectionBackgroundColor=");
        sb.append((Object) z0.u.i(this.f74b));
        sb.append(')');
        return sb.toString();
    }
}
