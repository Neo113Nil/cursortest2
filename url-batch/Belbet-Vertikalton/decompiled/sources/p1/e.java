package p1;

import H1.l;
import X0.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e extends f {
    public static List h0(d dVar) {
        Iterator it = dVar.iterator();
        if (!it.hasNext()) {
            return t.f1385a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return l.I(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
