package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bbz {
    private static final bbv a = new bbx();
    private final Map b = new HashMap();

    public final synchronized bbw a(Object obj) {
        bbv bbvVar;
        a.v(obj, "Argument must not be null");
        Map map = this.b;
        bbvVar = (bbv) map.get(obj.getClass());
        if (bbvVar == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                bbv bbvVar2 = (bbv) it.next();
                if (bbvVar2.b().isAssignableFrom(obj.getClass())) {
                    bbvVar = bbvVar2;
                    break;
                }
            }
        }
        if (bbvVar == null) {
            bbvVar = a;
        }
        return bbvVar.a(obj);
    }

    public final synchronized void b(bbv bbvVar) {
        this.b.put(bbvVar.b(), bbvVar);
    }
}
