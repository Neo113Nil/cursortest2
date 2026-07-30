package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6264a;

    /* renamed from: b, reason: collision with root package name */
    public final q.h0 f6265b;

    public u0() {
        long d8 = z0.l0.d(4284900966L);
        float f9 = 0;
        q.h0 h0Var = new q.h0(f9, f9, f9, f9);
        this.f6264a = d8;
        this.f6265b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        u0 u0Var = (u0) obj;
        return z0.u.c(this.f6264a, u0Var.f6264a) && r6.k.a(this.f6265b, u0Var.f6265b);
    }

    public final int hashCode() {
        int i7 = z0.u.f10058h;
        return this.f6265b.hashCode() + (Long.hashCode(this.f6264a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        a0.m.r(this.f6264a, sb, ", drawPadding=");
        sb.append(this.f6265b);
        sb.append(')');
        return sb.toString();
    }
}
