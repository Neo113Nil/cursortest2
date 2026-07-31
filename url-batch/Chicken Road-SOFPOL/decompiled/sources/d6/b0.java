package d6;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class b0 extends s6.a {
    public static LinkedHashSet M(Set set, o4.d dVar) {
        q6.i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(y.F(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(dVar);
        return linkedHashSet;
    }
}
