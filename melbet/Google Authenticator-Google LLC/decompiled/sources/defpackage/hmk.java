package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hmk {
    private static final hmg a = new hmi();
    private static final hmf b = new hmj();

    public static hmh a(Set set) {
        hmd hmdVar = new hmd(a);
        hmdVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hky hkyVar = (hky) it.next();
            hkyVar.getClass();
            if (hkyVar.b) {
                Map map = hmdVar.c;
                hmf hmfVar = hmd.b;
                map.remove(hkyVar);
                hmdVar.d.put(hkyVar, hmfVar);
            } else {
                Map map2 = hmdVar.d;
                hmg hmgVar = hmd.a;
                map2.remove(hkyVar);
                hmdVar.c.put(hkyVar, hmgVar);
            }
        }
        return new hme(hmdVar);
    }
}
