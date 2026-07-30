package L7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r7.C4985p;

/* loaded from: classes2.dex */
public abstract class i extends com.bumptech.glide.f {
    public static List u(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return C4985p.f40358n;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return p8.g.k(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
