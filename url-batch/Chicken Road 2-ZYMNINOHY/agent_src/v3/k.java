package v3;

import a.AbstractC0124a;
import com.startapp.sdk.internal.A;
import d3.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public abstract class k extends l {
    public static j H(Iterator it) {
        kotlin.jvm.internal.i.e(it, "<this>");
        return new C1479a(new d3.h(3, it));
    }

    public static final h I(j jVar, InterfaceC1339l interfaceC1339l) {
        if (!(jVar instanceof q)) {
            return new h(jVar, new A(7), interfaceC1339l);
        }
        q qVar = (q) jVar;
        return new h(qVar.f15723a, qVar.f15724b, interfaceC1339l);
    }

    public static List J(j jVar) {
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return d3.q.f8333a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0124a.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set K(j jVar) {
        kotlin.jvm.internal.i.e(jVar, "<this>");
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return s.f8335a;
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
