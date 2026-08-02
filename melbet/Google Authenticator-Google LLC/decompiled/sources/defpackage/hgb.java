package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hgb extends hdb {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public hgb(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
        }
        int i = this.b;
        Iterator it = iterable.iterator();
        hnu.I(it, i);
        return new hga(it);
    }
}
