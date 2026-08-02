package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djx implements jwz {
    private static final djw a = new djw();
    private final dkc b;

    public djx(dkc dkcVar) {
        this.b = dkcVar;
    }

    @Override // defpackage.jwz
    public final iws a(kae kaeVar, jww jwwVar, jwx jwxVar) {
        djw djwVar = a;
        jwv jwvVar = kef.c;
        Collection collection = (Collection) jwwVar.e(jwvVar);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        dkc dkcVar = this.b;
        arrayList.add(djwVar);
        return dkcVar.a(kaeVar, jwwVar.d(jwvVar, DesugarCollections.unmodifiableList(arrayList)), jwxVar);
    }
}
