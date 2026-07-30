package e6;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g0 extends a8.m {
    public static LinkedHashSet U(Set set, t3.h hVar) {
        r6.k.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.h0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(hVar);
        return linkedHashSet;
    }

    public static Set V(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return w.f2828f;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            r6.k.e(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.h0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
