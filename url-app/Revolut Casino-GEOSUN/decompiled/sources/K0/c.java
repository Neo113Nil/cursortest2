package K0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.g;
import v0.l;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static List P(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.f3013e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return g.s(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
