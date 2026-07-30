package k0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c extends e6.d implements List, Collection, s6.a {
    public abstract c A(int i7, Object obj);

    @Override // e6.a, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // e6.a, java.util.Collection
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

    public abstract c g(int i7, Object obj);

    @Override // e6.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // e6.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c m(Object obj);

    @Override // e6.d, java.util.List
    public final List subList(int i7, int i8) {
        return new j0.a(this, i7, i8);
    }

    public c w(Collection collection) {
        f x8 = x();
        x8.addAll(collection);
        return x8.m();
    }

    public abstract f x();

    public abstract c y(b bVar);

    public abstract c z(int i7);
}
