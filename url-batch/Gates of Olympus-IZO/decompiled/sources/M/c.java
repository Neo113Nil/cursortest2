package M;

import M1.AbstractC0143d;
import a2.InterfaceC0184a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0143d implements List, Collection, InterfaceC0184a {
    public abstract c c(int i3, Object obj);

    @Override // M1.AbstractC0140a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // M1.AbstractC0140a, java.util.Collection, java.util.List
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

    public abstract c d(Object obj);

    public c i(Collection collection) {
        g j3 = j();
        j3.addAll(collection);
        return j3.d();
    }

    @Override // M1.AbstractC0143d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract g j();

    public abstract c k(b bVar);

    public abstract c l(int i3);

    @Override // M1.AbstractC0143d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract c m(int i3, Object obj);

    @Override // M1.AbstractC0143d, java.util.List
    public final List subList(int i3, int i4) {
        return new L.a(this, i3, i4);
    }
}
