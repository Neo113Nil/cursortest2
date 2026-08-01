package O0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n extends m {
    public static void e0(ArrayList arrayList, Iterable iterable) {
        X0.f.e(iterable, "elements");
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
