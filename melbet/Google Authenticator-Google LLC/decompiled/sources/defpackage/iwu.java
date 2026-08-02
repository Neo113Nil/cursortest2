package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iwu {
    public static jwx a(jwx jwxVar, List list) {
        jwxVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jwxVar = new jxa(jwxVar, (jwz) it.next());
        }
        return jwxVar;
    }

    public static jwx b(jwx jwxVar, jwz... jwzVarArr) {
        return a(jwxVar, Arrays.asList(jwzVarArr));
    }

    public static jwx c(jwx jwxVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return a(jwxVar, arrayList);
    }

    public static jwx d(jwx jwxVar, jwz... jwzVarArr) {
        return c(jwxVar, Arrays.asList(jwzVarArr));
    }
}
