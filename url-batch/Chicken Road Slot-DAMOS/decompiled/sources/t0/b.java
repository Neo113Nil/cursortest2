package t0;

import b1.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b extends kotlin.collections.f {
    public abstract b c(int i3, Object obj);

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.a, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract b e(Object obj);

    public b f(Collection collection) {
        e g = g();
        g.addAll(collection);
        return g.e();
    }

    public abstract e g();

    public abstract b h(t tVar);

    public abstract b i(int i3);

    @Override // kotlin.collections.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract b k(int i3, Object obj);

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.f, java.util.List
    public final List subList(int i3, int i10) {
        return new s0.a(this, i3, i10);
    }
}
