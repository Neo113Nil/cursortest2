package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class w0 extends v0 {
    public static LinkedHashSet c(Set set, n4.h hVar) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(o0.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(hVar);
        return linkedHashSet;
    }
}
