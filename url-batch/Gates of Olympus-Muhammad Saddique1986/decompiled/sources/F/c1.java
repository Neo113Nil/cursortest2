package F;

import E.C0080h;
import b0.C0352v;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1491a = C0352v.f5439g;

    /* renamed from: b, reason: collision with root package name */
    public final C0080h f1492b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return C0352v.c(this.f1491a, c1Var.f1491a) && f2.j.a(this.f1492b, c1Var.f1492b);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        int hashCode = Long.hashCode(this.f1491a) * 31;
        C0080h c0080h = this.f1492b;
        return hashCode + (c0080h != null ? c0080h.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        A.k.p(this.f1491a, sb, ", rippleAlpha=");
        sb.append(this.f1492b);
        sb.append(')');
        return sb.toString();
    }
}
