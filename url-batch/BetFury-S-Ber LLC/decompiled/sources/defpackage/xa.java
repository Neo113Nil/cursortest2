package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xa {
    public static final xa c = new xa(uc.s0(new ArrayList()), null);
    public final Set a;
    public final n9 b;

    public xa(Set set, n9 n9Var) {
        this.a = set;
        this.b = n9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return xaVar.a.equals(this.a) && mv.c(xaVar.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        n9 n9Var = this.b;
        return hashCode + (n9Var != null ? n9Var.hashCode() : 0);
    }
}
