package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6828a;

    /* renamed from: b, reason: collision with root package name */
    public final x.g0 f6829b;

    public o0() {
        long c8 = f1.p.c(4284900966L);
        float f6 = 0;
        x.g0 g0Var = new x.g0(f6, f6, f6, f6);
        this.f6828a = c8;
        this.f6829b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        q6.i.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        o0 o0Var = (o0) obj;
        return f1.s.c(this.f6828a, o0Var.f6828a) && q6.i.a(this.f6829b, o0Var.f6829b);
    }

    public final int hashCode() {
        int i = f1.s.i;
        return this.f6829b.hashCode() + (Long.hashCode(this.f6828a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        a0.q.o(this.f6828a, sb, ", drawPadding=");
        sb.append(this.f6829b);
        sb.append(')');
        return sb.toString();
    }
}
