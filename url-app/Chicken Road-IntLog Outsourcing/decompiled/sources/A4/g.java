package A4;

import g4.C0471p;
import g4.C0473r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n2.AbstractC1341c;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public abstract class g extends AbstractC1341c {
    public static f N(Iterator it) {
        kotlin.jvm.internal.i.e(it, "<this>");
        return new a(new h(0, it));
    }

    public static e O(f fVar, InterfaceC1441l predicate) {
        kotlin.jvm.internal.i.e(predicate, "predicate");
        return new e(fVar, predicate, 0);
    }

    public static List P(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return C0471p.f5750a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return K1.b.W(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set Q(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return C0473r.f5752a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Set singleton = Collections.singleton(next);
            kotlin.jvm.internal.i.d(singleton, "singleton(...)");
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
