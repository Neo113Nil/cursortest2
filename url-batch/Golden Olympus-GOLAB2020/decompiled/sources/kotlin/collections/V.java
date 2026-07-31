package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class V extends U {
    public static Set e() {
        return A.f41034b;
    }

    public static Set f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) C3223m.y0(elements, new LinkedHashSet(J.mapCapacity(elements.length)));
    }

    public static final Set g(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : U.c(set.iterator().next()) : e();
    }

    public static Set h(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C3223m.P0(elements) : e();
    }
}
