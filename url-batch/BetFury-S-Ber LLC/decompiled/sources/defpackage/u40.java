package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class u40 {
    public final dq a;
    public final lx b;

    public u40(dq dqVar, lx lxVar) {
        dqVar.getClass();
        this.a = dqVar;
        this.b = lxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u40)) {
            return false;
        }
        u40 u40Var = (u40) obj;
        return mv.c(this.a, u40Var.a) && this.b.equals(u40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
