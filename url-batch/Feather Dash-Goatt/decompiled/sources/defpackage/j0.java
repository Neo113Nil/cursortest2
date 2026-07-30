package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class j0 extends w {
    public abstract j0 b(int i, Object obj);

    @Override // defpackage.m, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.m, java.util.Collection, java.util.List
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

    public abstract j0 d(Object obj);

    public j0 e(Collection collection) {
        uw0 f = f();
        f.addAll(collection);
        return f.d();
    }

    public abstract uw0 f();

    public abstract j0 g(i0 i0Var);

    public abstract j0 h(int i);

    public abstract j0 i(int i, Object obj);

    @Override // defpackage.w, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.w, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.w, java.util.List
    public final List subList(int i, int i2) {
        return new l70(this, i, i2);
    }
}
