package m2;

import S1.s;
import S1.u;
import e2.InterfaceC0424c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends i {
    public static InterfaceC0656f R(Iterator it) {
        f2.j.f(it, "<this>");
        return new C0651a(new s(2, it));
    }

    public static Object S(s sVar) {
        C0655e c0655e = new C0655e(sVar);
        if (c0655e.hasNext()) {
            return c0655e.next();
        }
        return null;
    }

    public static InterfaceC0656f T(Object obj, InterfaceC0424c interfaceC0424c) {
        f2.j.f(interfaceC0424c, "nextFunction");
        return obj == null ? C0654d.f6997a : new k(new A.h(24, obj), interfaceC0424c);
    }

    public static s U(InterfaceC0656f interfaceC0656f, InterfaceC0424c interfaceC0424c) {
        return new s(1, new k(interfaceC0656f, interfaceC0424c, 1));
    }

    public static List V(InterfaceC0656f interfaceC0656f) {
        Iterator it = interfaceC0656f.iterator();
        if (!it.hasNext()) {
            return u.f4320d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return O2.l.l0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
