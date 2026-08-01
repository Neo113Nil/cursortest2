package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y40 extends z40 {
    public static List V(x40 x40Var) {
        Iterator it = x40Var.iterator();
        if (!it.hasNext()) {
            return ik.f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kr.J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
