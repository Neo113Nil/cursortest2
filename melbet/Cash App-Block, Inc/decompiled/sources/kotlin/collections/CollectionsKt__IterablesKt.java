package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CollectionsKt__IterablesKt extends CollectionsKt__CollectionsKt {
    public static int collectionSizeOrDefault(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList flatten(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
