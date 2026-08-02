package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hga implements Iterator {
    boolean a = true;
    final /* synthetic */ Iterator b;

    public hga(Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        hoq.I(!this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
    }
}
