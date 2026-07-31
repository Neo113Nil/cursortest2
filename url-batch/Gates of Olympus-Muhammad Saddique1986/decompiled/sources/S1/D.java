package S1;

import h2.AbstractC0508a;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import t1.C1028h;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0508a {
    public static LinkedHashSet b0(Set set, C1028h c1028h) {
        f2.j.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(B.J(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c1028h);
        return linkedHashSet;
    }

    public static Set c0(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return w.f4322d;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            f2.j.e(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(B.J(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }
}
