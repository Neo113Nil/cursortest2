package v2;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m0 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        collection.getClass();
        if (collection instanceof X) {
            collection = ((g0) ((X) collection)).i();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
