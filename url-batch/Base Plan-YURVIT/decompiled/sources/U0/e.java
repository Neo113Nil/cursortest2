package U0;

import E0.o;
import a.AbstractC0086a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends f {
    public static List O(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return o.f219e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0086a.x(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
