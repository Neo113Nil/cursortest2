package n;

import b0.C0352v;
import r.C0850L;
import r.InterfaceC0849K;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0849K f7156b;

    public j0() {
        long d3 = b0.M.d(4284900966L);
        float f3 = 0;
        C0850L c0850l = new C0850L(f3, f3, f3, f3);
        this.f7155a = d3;
        this.f7156b = c0850l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        j0 j0Var = (j0) obj;
        return C0352v.c(this.f7155a, j0Var.f7155a) && f2.j.a(this.f7156b, j0Var.f7156b);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return this.f7156b.hashCode() + (Long.hashCode(this.f7155a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        A.k.p(this.f7155a, sb, ", drawPadding=");
        sb.append(this.f7156b);
        sb.append(')');
        return sb.toString();
    }
}
