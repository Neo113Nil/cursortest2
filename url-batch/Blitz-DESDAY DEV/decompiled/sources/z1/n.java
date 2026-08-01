package z1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r1.p;

/* loaded from: classes.dex */
public final class n {
    public static ArrayList a(List list) {
        g1.d.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p) obj) != p.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(X0.l.z0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p) it.next()).f3534a);
        }
        return arrayList2;
    }

    public static byte[] b(List list) {
        g1.d.e(list, "protocols");
        E1.f fVar = new E1.f();
        Iterator it = a(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            fVar.u(str.length());
            fVar.x(str);
        }
        return fVar.j(fVar.f202b);
    }

    public static boolean c() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }
}
