package n;

import H2.AbstractC0080b;
import b0.AbstractC0259J;
import b0.C0288u;
import r.C0797I;
import r.InterfaceC0796H;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6067a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0796H f6068b;

    public c0() {
        long c3 = AbstractC0259J.c(4284900966L);
        C0797I a3 = androidx.compose.foundation.layout.a.a(0.0f, 3);
        this.f6067a = c3;
        this.f6068b = a3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        c0 c0Var = (c0) obj;
        return C0288u.c(this.f6067a, c0Var.f6067a) && Z1.i.a(this.f6068b, c0Var.f6068b);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return this.f6068b.hashCode() + (Long.hashCode(this.f6067a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC0080b.q(this.f6067a, sb, ", drawPadding=");
        sb.append(this.f6068b);
        sb.append(')');
        return sb.toString();
    }
}
