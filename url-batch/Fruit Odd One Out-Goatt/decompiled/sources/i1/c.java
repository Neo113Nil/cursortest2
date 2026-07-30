package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u0.l;

/* loaded from: classes.dex */
public abstract class c extends d {
    public static List G(b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int size = arrayList.size();
        if (size == 0) {
            return l.f1186b;
        }
        if (size != 1) {
            return arrayList;
        }
        List singletonList = Collections.singletonList(arrayList.get(0));
        singletonList.getClass();
        return singletonList;
    }
}
