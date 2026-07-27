package z2;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import s1.C1193i;

/* renamed from: z2.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1416U extends C1415T {
    public static LinkedHashSet a(Set set, C1193i c1193i) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C1411O.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c1193i);
        return linkedHashSet;
    }
}
