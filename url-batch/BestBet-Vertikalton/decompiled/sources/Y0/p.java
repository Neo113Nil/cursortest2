package Y0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class p extends o {
    public static void A0(ArrayList arrayList, Iterable iterable) {
        k1.e.e(iterable, "elements");
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }
}
