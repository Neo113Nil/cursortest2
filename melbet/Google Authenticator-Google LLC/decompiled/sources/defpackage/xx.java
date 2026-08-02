package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xx implements Iterator {
    private final krt a;
    private final List b = new ArrayList();
    private Iterator c;

    public xx(Iterator it, krt krtVar) {
        this.a = krtVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        ?? a = this.a.a(next);
        if (a != 0 && a.hasNext()) {
            this.b.add(this.c);
            this.c = a;
            return next;
        }
        while (!this.c.hasNext()) {
            List list = this.b;
            if (list.isEmpty()) {
                break;
            }
            this.c = (Iterator) ixc.h(list);
            ixc.e(list);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.c();
    }
}
