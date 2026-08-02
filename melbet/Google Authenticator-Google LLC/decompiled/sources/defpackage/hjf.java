package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hjf extends ham {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ Set c;
    final /* synthetic */ Set d;

    public hjf(Set set, Set set2) {
        this.c = set;
        this.d = set2;
        this.a = set.iterator();
        this.b = ((hjn) set2).iterator();
    }

    @Override // defpackage.ham
    protected final Object a() {
        Set set;
        Object next;
        Iterator it = this.a;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.b;
            if (!it2.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it2.next();
        } while (set.contains(next));
        return next;
    }
}
