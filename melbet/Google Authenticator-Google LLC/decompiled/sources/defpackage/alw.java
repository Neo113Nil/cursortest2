package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alw {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public alw(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alw)) {
            return false;
        }
        alw alwVar = (alw) obj;
        if (ksp.b(this.a, alwVar.a) && ksp.b(this.b, alwVar.b) && ksp.b(this.c, alwVar.c) && ksp.b(this.d, alwVar.d)) {
            return ksp.b(this.e, alwVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return ksp.o(ksp.v("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + ajz.e(ixc.n(this.d)) + "\n            |   referenceColumnNames = {" + ajz.d(ixc.n(this.e)) + "\n            |}\n        "));
    }
}
