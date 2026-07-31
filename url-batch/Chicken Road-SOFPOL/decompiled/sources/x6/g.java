package x6;

import androidx.lifecycle.m0;
import d6.s;
import d6.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends h {
    public static e a0(Iterator it) {
        q6.i.e(it, "<this>");
        return new a(new s(1, it));
    }

    public static e b0(Object obj, p6.c cVar) {
        return obj == null ? b.f8663a : new d(new m0(19, obj), cVar, 1);
    }

    public static List c0(e eVar) {
        Iterator it = eVar.iterator();
        if (!it.hasNext()) {
            return u.f2326d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return s6.a.x(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
