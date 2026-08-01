package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class eh0 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public eh0(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eh0) {
            eh0 eh0Var = (eh0) obj;
            String str = eh0Var.a;
            if (this.b == eh0Var.b && this.c.equals(eh0Var.c) && mv.c(this.d, eh0Var.d)) {
                String str2 = this.a;
                return uf0.r(str2, "index_", false) ? uf0.r(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((uf0.r(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        nf0.m(uc.k0(this.c, ",", null, null, null, 62));
        nf0.m("},");
        sk0 sk0Var = sk0.a;
        sb.append(sk0Var);
        sb.append("\n            |   orders = {");
        nf0.m(uc.k0(this.d, ",", null, null, null, 62));
        nf0.m(" }");
        sb.append(sk0Var);
        sb.append("\n            |}\n        ");
        return nf0.m(nf0.n(sb.toString()));
    }
}
