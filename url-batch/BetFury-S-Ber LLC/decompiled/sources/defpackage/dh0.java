package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class dh0 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public dh0(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh0)) {
            return false;
        }
        dh0 dh0Var = (dh0) obj;
        if (mv.c(this.a, dh0Var.a) && mv.c(this.b, dh0Var.b) && mv.c(this.c, dh0Var.c) && this.d.equals(dh0Var.d)) {
            return this.e.equals(dh0Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        nf0.m(uc.k0(uc.m0(this.d), ",", null, null, null, 62));
        nf0.m("},");
        sk0 sk0Var = sk0.a;
        sb.append(sk0Var);
        sb.append("\n            |   referenceColumnNames = {");
        nf0.m(uc.k0(uc.m0(this.e), ",", null, null, null, 62));
        nf0.m(" }");
        sb.append(sk0Var);
        sb.append("\n            |}\n        ");
        return nf0.m(nf0.n(sb.toString()));
    }
}
