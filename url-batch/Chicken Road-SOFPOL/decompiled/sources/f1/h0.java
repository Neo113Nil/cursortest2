package f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f2663d = new h0(0.0f, p.c(4278190080L), 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f2664a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2665b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2666c;

    public h0(float f6, long j7, long j8) {
        this.f2664a = j7;
        this.f2665b = j8;
        this.f2666c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return s.c(this.f2664a, h0Var.f2664a) && e1.b.b(this.f2665b, h0Var.f2665b) && this.f2666c == h0Var.f2666c;
    }

    public final int hashCode() {
        int i = s.i;
        return Float.hashCode(this.f2666c) + a0.q.c(Long.hashCode(this.f2664a) * 31, 31, this.f2665b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        a0.q.o(this.f2664a, sb, ", offset=");
        sb.append((Object) e1.b.g(this.f2665b));
        sb.append(", blurRadius=");
        return a0.q.j(sb, this.f2666c, ')');
    }
}
