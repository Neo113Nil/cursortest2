package y6;

import e6.s;
import e6.u;
import i.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r1.z0;

/* loaded from: classes.dex */
public abstract class h extends i {
    public static f m(Iterator it) {
        r6.k.f(it, "<this>");
        return new a(new s(2, it));
    }

    public static Object n(s sVar) {
        z zVar = new z(sVar);
        if (zVar.hasNext()) {
            return zVar.next();
        }
        return null;
    }

    public static f o(Object obj, q6.c cVar) {
        r6.k.f(cVar, "nextFunction");
        return obj == null ? d.f9905a : new e(new z0(14, obj), cVar);
    }

    public static s p(f fVar, q6.c cVar) {
        return new s(1, new k(fVar, cVar, 1));
    }

    public static List q(f fVar) {
        Iterator it = fVar.iterator();
        if (!it.hasNext()) {
            return u.f2826f;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t6.a.F(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
