package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hfy extends hdb {
    final /* synthetic */ Iterable a;
    final /* synthetic */ gzr b;

    public hfy(Iterable iterable, gzr gzrVar) {
        this.a = iterable;
        this.b = gzrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new hge(it, this.b);
    }
}
