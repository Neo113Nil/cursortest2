package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbl {
    public final String a;
    public final Collection b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    public kbl(kuq kuqVar) {
        String str = (String) kuqVar.b;
        this.a = str;
        ?? r1 = kuqVar.a;
        HashSet hashSet = new HashSet(r1.size());
        for (kae kaeVar : r1) {
            kaeVar.getClass();
            String str2 = kaeVar.c;
            hoq.F(str.equals(str2), "service names %s != %s", str2, str);
            hoq.C(hashSet.add(kaeVar.b), "duplicate name %s", kaeVar.b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList((Collection) kuqVar.a));
    }

    public final String toString() {
        gzo T = hoq.T(this);
        T.b("name", this.a);
        T.b("schemaDescriptor", null);
        T.b("methods", this.b);
        T.d();
        return T.toString();
    }
}
