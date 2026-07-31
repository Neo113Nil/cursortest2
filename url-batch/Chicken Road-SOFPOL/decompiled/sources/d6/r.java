package d6;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class r extends q {
    public static void O(AbstractList abstractList, Iterable iterable) {
        q6.i.e(abstractList, "<this>");
        q6.i.e(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }

    public static Object P(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(0);
    }
}
