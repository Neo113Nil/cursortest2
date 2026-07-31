package g2;

import M1.s;
import M1.u;
import a.AbstractC0157a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends j {
    public static InterfaceC0410f a0(Iterator it) {
        Z1.i.f(it, "<this>");
        return new C0405a(new s(2, it));
    }

    public static Object b0(s sVar) {
        C0409e c0409e = new C0409e(sVar);
        if (c0409e.hasNext()) {
            return c0409e.next();
        }
        return null;
    }

    public static InterfaceC0410f c0(Object obj, Y1.c cVar) {
        Z1.i.f(cVar, "nextFunction");
        return obj == null ? C0408d.f4842a : new l(new A2.l(18, obj), cVar);
    }

    public static s d0(InterfaceC0410f interfaceC0410f, Y1.c cVar) {
        return new s(1, new l(interfaceC0410f, cVar, 1));
    }

    public static List e0(InterfaceC0410f interfaceC0410f) {
        Iterator it = interfaceC0410f.iterator();
        if (!it.hasNext()) {
            return u.f2803d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0157a.M(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
