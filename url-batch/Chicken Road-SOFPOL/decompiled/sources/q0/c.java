package q0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c extends d6.e implements List, Collection, r6.a {
    public abstract c b(int i, Object obj);

    public abstract c c(Object obj);

    @Override // d6.a, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // d6.a, java.util.Collection
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

    public c e(Collection collection) {
        g f6 = f();
        f6.addAll(collection);
        return f6.c();
    }

    public abstract g f();

    public abstract c g(b bVar);

    public abstract c h(int i);

    public abstract c i(int i, Object obj);

    @Override // d6.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // d6.e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // d6.e, java.util.List
    public final List subList(int i, int i8) {
        return new p0.a(this, i, i8);
    }
}
