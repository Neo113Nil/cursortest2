package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ms2 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public ms2(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms2)) {
            return false;
        }
        ms2 ms2Var = (ms2) obj;
        if (!this.a.equals(ms2Var.a) || !this.b.equals(ms2Var.b) || !Intrinsics.b(this.c, ms2Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = ms2Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(th2.j(zv.I(this.b.values(), new zo0(15))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(th2.j(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set == null || (collection = zv.I(set, new zo0(16))) == null) {
            collection = ah0.m;
        }
        sb.append(th2.j(collection));
        sb.append("\n            |}\n        ");
        return np2.d(sb.toString());
    }
}
