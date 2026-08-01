package a3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e extends k {
    public static List Y(Set set) {
        int size = set.size();
        if (size == 0) {
            return m.f113f;
        }
        if (size != 1) {
            return new ArrayList(set);
        }
        List singletonList = Collections.singletonList(set instanceof List ? ((List) set).get(0) : set.iterator().next());
        f3.d.d(singletonList, "singletonList(...)");
        return singletonList;
    }
}
