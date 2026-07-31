package M1;

import java.util.LinkedHashSet;
import java.util.Set;
import q1.C0784h;

/* loaded from: classes.dex */
public abstract class E extends I2.d {
    public static LinkedHashSet O(Set set, C0784h c0784h) {
        Z1.i.f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(B.I(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c0784h);
        return linkedHashSet;
    }
}
