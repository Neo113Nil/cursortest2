package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ks2 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public ks2(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
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
        if (!(obj instanceof ks2)) {
            return false;
        }
        ks2 ks2Var = (ks2) obj;
        if (Intrinsics.b(this.a, ks2Var.a) && Intrinsics.b(this.b, ks2Var.b) && Intrinsics.b(this.c, ks2Var.c) && this.d.equals(ks2Var.d)) {
            return this.e.equals(ks2Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + in1.j(this.c, in1.j(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        np2.b(zv.A(zv.H(this.d), ",", null, null, null, 62));
        np2.b("},");
        Unit unit = Unit.a;
        sb.append(unit);
        sb.append("\n            |   referenceColumnNames = {");
        np2.b(zv.A(zv.H(this.e), ",", null, null, null, 62));
        np2.b(" }");
        sb.append(unit);
        sb.append("\n            |}\n        ");
        return np2.b(np2.d(sb.toString()));
    }
}
