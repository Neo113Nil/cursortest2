package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ls2 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public ls2(String str, boolean z, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
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
        if (obj instanceof ls2) {
            ls2 ls2Var = (ls2) obj;
            String str = ls2Var.a;
            if (this.b == ls2Var.b && Intrinsics.b(this.c, ls2Var.c) && Intrinsics.b(this.d, ls2Var.d)) {
                String str2 = this.a;
                return tp2.o(str2, "index_", false) ? tp2.o(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((tp2.o(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        np2.b(zv.A(this.c, ",", null, null, null, 62));
        np2.b("},");
        Unit unit = Unit.a;
        sb.append(unit);
        sb.append("\n            |   orders = {");
        np2.b(zv.A(this.d, ",", null, null, null, 62));
        np2.b(" }");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return np2.b(np2.d(sb.toString()));
    }
}
