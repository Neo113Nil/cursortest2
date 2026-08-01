package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fh0 {
    public final Map a;
    public final Set b;
    public final Set c;

    public fh0(Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = map;
        this.b = abstractSet;
        this.c = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh0)) {
            return false;
        }
        fh0 fh0Var = (fh0) obj;
        if (!this.a.equals(fh0Var.a) || !mv.c(this.b, fh0Var.b)) {
            return false;
        }
        Set set2 = this.c;
        if (set2 == null || (set = fh0Var.c) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() - 1039693473) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = 'notes',\n            |    columns = {");
        sb.append(bd0.e(uc.n0(this.a.values(), new yb(7))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(bd0.e(this.b));
        sb.append("\n            |    indices = {");
        Set set = this.c;
        sb.append(bd0.e(set != null ? uc.n0(set, new yb(8)) : wm.f));
        sb.append("\n            |}\n        ");
        return nf0.n(sb.toString());
    }
}
