package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alx {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public alx(String str, boolean z, List list, List list2) {
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
        if (!(obj instanceof alx)) {
            return false;
        }
        alx alxVar = (alx) obj;
        if (this.b != alxVar.b || !ksp.b(this.c, alxVar.c) || !ksp.b(this.d, alxVar.d)) {
            return false;
        }
        String str = this.a;
        return ksp.s(str, "index_") ? ksp.s(alxVar.a, "index_") : ksp.b(str, alxVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((ksp.s(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return ksp.o(ksp.v("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + ajz.e(this.c) + "\n            |   orders = {" + ajz.d(this.d) + "\n            |}\n        "));
    }
}
