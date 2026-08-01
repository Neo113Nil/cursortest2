package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k50 implements Serializable {
    public final Object f;
    public final Object g;

    public k50(Object obj, Object obj2) {
        this.f = obj;
        this.g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k50)) {
            return false;
        }
        k50 k50Var = (k50) obj;
        return mv.c(this.f, k50Var.f) && mv.c(this.g, k50Var.g);
    }

    public final int hashCode() {
        Object obj = this.f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ')';
    }
}
