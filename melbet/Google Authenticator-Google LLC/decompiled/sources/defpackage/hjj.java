package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hjj extends ham {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Set b;
    final /* synthetic */ Iterator c;
    final /* synthetic */ Set d;

    public hjj(Iterator it, Set set, Iterator it2, Set set2) {
        this.a = it;
        this.b = set;
        this.c = it2;
        this.d = set2;
    }

    @Override // defpackage.ham
    protected final Object a() {
        Set set;
        Object next;
        Set set2;
        Object next2;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                do {
                    Iterator it2 = this.c;
                    if (!it2.hasNext()) {
                        b();
                        return null;
                    }
                    set = this.d;
                    next = it2.next();
                } while (set.contains(next));
                return next;
            }
            set2 = this.b;
            next2 = it.next();
        } while (set2.contains(next2));
        return next2;
    }
}
