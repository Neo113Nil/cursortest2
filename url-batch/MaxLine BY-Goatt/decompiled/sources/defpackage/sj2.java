package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class sj2 extends rj2 {
    public static LinkedHashSet d(Set set, cp1 cp1Var) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(li1.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(cp1Var);
        return linkedHashSet;
    }
}
