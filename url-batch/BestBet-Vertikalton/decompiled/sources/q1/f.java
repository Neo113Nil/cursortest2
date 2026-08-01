package q1;

import Y0.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends g {
    public static List w(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return s.f1516a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return H1.d.R(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
