package E5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l5.C0512p;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class g extends i6.g {
    public static List C(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return C0512p.f5303f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0676f.n(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
