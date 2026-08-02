package W0;

import G0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static List S(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.f490e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return i1.a.u(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
