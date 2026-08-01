package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ck0 implements Serializable {
    public final Integer f;
    public final Integer g;
    public final Integer h;

    public ck0(Integer num, Integer num2, Integer num3) {
        this.f = num;
        this.g = num2;
        this.h = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return this.f.equals(ck0Var.f) && this.g.equals(ck0Var.g) && this.h.equals(ck0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + (this.f.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ", " + this.h + ')';
    }
}
