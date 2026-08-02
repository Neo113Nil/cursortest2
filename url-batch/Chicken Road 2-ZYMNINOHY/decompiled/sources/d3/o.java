package d3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o extends n {
    public static void Z(ArrayList arrayList, Iterable elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements instanceof Collection) {
            arrayList.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static void a0(Collection collection, Object[] elements) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        collection.addAll(g.N(elements));
    }
}
