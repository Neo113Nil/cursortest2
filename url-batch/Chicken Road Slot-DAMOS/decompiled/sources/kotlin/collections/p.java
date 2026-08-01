package kotlin.collections;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class p extends a implements Set {

    /* renamed from: d, reason: collision with root package name */
    public static final o f5577d = new o(null);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        f5577d.getClass();
        if (size() != set.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        f5577d.getClass();
        Iterator<E> it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 += next != null ? next.hashCode() : 0;
        }
        return i3;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
