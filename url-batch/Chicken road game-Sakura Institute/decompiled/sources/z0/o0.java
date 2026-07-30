package z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f10030d = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final long f10031a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10032b;

    /* renamed from: c, reason: collision with root package name */
    public final float f10033c;

    public o0(float f9, long j8, long j9) {
        this.f10031a = j8;
        this.f10032b = j9;
        this.f10033c = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return u.c(this.f10031a, o0Var.f10031a) && y0.c.b(this.f10032b, o0Var.f10032b) && this.f10033c == o0Var.f10033c;
    }

    public final int hashCode() {
        int i7 = u.f10058h;
        return Float.hashCode(this.f10033c) + a0.m.d(Long.hashCode(this.f10031a) * 31, 31, this.f10032b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        a0.m.r(this.f10031a, sb, ", offset=");
        sb.append((Object) y0.c.j(this.f10032b));
        sb.append(", blurRadius=");
        return a0.m.k(sb, this.f10033c, ')');
    }

    public /* synthetic */ o0() {
        this(0.0f, l0.d(4278190080L), 0L);
    }
}
