package K;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import z2.AbstractC1420d;

/* loaded from: classes.dex */
public abstract class c extends AbstractC1420d implements J.c {
    @Override // java.util.Collection, java.util.List, J.c
    public J.c addAll(Collection collection) {
        f a4 = a();
        a4.addAll(collection);
        return a4.s();
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // z2.AbstractC1418b, java.util.Collection, java.util.List
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

    @Override // z2.AbstractC1420d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final List subList(int i2, int i4) {
        return new J.a(this, i2, i4);
    }
}
