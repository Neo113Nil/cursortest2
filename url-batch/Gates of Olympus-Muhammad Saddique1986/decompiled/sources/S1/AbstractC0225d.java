package S1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: S1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0225d extends AbstractC0222a implements List {
    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        f2.j.f(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!f2.j.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int i3 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = (i3 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i3;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (f2.j.a(it.next(), obj)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new R1.p(4, this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (f2.j.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0223b(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i3, int i4) {
        return new C0224c(this, i3, i4);
    }

    public ListIterator listIterator(int i3) {
        return new C0223b(this, i3);
    }
}
