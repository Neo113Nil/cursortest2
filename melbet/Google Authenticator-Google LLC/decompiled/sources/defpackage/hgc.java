package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hgc extends hdb {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public hgc(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        int i = this.b;
        hoq.y(i >= 0, "limit is negative");
        return new hgg(i, it);
    }
}
