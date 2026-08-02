package v2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class l0 extends k0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f15651a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f15651a.iterator();
        it.getClass();
        u2.e eVar = this.f15652b;
        eVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (eVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new l0(((SortedSet) this.f15651a).headSet(obj), this.f15652b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f15651a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f15652b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new l0(((SortedSet) this.f15651a).subSet(obj, obj2), this.f15652b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new l0(((SortedSet) this.f15651a).tailSet(obj), this.f15652b);
    }
}
