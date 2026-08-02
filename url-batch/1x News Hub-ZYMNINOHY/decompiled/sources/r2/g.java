package r2;

import Y1.C0120q;
import a.AbstractC0129a;
import c2.m;
import c2.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g extends h {
    public static f V(Iterator it) {
        kotlin.jvm.internal.j.e(it, "<this>");
        return new a(new c2.d(3, it));
    }

    public static final d W(f fVar, l2.l lVar) {
        if (!(fVar instanceof l)) {
            return new d(fVar, new C0120q(11), lVar);
        }
        l lVar2 = (l) fVar;
        return new d(lVar2.f10283a, lVar2.f10284b, lVar);
    }

    public static List X(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return m.f2637a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0129a.r(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set Y(f fVar) {
        kotlin.jvm.internal.j.e(fVar, "<this>");
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return o.f2639a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            kotlin.jvm.internal.j.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
