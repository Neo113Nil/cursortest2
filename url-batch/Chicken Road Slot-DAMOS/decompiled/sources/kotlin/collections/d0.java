package kotlin.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d0 extends c0 {
    public static void l(AbstractList abstractList, Iterable iterable) {
        abstractList.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            abstractList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }

    public static Object m(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }

    public static Object n(List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(list.size() - 1);
    }
}
