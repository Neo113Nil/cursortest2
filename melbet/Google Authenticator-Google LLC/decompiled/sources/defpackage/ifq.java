package defpackage;

import java.util.Collections;
import java.util.Random;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifq {
    public static final Random a = new Random();

    public static hfm a(Set set, qy qyVar, ifp ifpVar) {
        if (!qyVar.containsKey(ifpVar)) {
            return hjb.a;
        }
        hfk hfkVar = new hfk();
        for (ifp ifpVar2 : (Set) qyVar.get(ifpVar)) {
            if (set.contains(ifpVar2)) {
                hfkVar.c(ifpVar2);
            } else {
                hfkVar.j(a(set, qyVar, ifpVar2));
            }
        }
        return hfkVar.g();
    }

    public static void b(qy qyVar, ifp ifpVar, ifp ifpVar2) {
        Set set = (Set) qyVar.get(ifpVar);
        if (set == null) {
            set = Collections.newSetFromMap(new qi());
            qyVar.put(ifpVar, set);
        }
        set.add(ifpVar2);
    }
}
