package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hjc extends hfv {
    public static final hjc c;
    final transient hel d;

    static {
        int i = hel.d;
        c = new hjc(his.a, hih.a);
    }

    public hjc(hel helVar, Comparator comparator) {
        super(comparator);
        this.d = helVar;
    }

    @Override // defpackage.hfv
    public final hfv B(Object obj, boolean z) {
        return G(F(obj, z), size());
    }

    @Override // defpackage.hfv, java.util.NavigableSet
    /* renamed from: D */
    public final hjr descendingIterator() {
        return this.d.a().listIterator(0);
    }

    final int E(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((hfv) this).a);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    final int F(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.d, obj, ((hfv) this).a);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    final hjc G(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return C(this.a);
        }
        hel helVar = this.d;
        return new hjc(helVar.subList(i, i2), this.a);
    }

    @Override // defpackage.heb
    public final int c(Object[] objArr, int i) {
        return this.d.c(objArr, i);
    }

    @Override // defpackage.hfv, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int F = F(obj, true);
        if (F == size()) {
            return null;
        }
        return this.d.get(F);
    }

    @Override // defpackage.heb, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof hic) {
            collection = ((hic) collection).i();
        }
        if (!hnu.g(((hfv) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        hjr it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int a = a(next2, next);
                if (a >= 0) {
                    if (a != 0) {
                        break;
                    }
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.heb
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.hfm, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!hnu.g(this.a, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            hjr it2 = iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object next2 = it.next();
                if (next2 == null || a(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.heb
    public final int f() {
        return this.d.f();
    }

    @Override // defpackage.hfv, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.hfv, java.util.NavigableSet
    public final Object floor(Object obj) {
        int E = E(obj, true) - 1;
        if (E == -1) {
            return null;
        }
        return this.d.get(E);
    }

    @Override // defpackage.hfm, defpackage.heb
    public final hel g() {
        return this.d;
    }

    @Override // defpackage.hfv, java.util.NavigableSet
    public final Object higher(Object obj) {
        int F = F(obj, false);
        if (F == size()) {
            return null;
        }
        return this.d.get(F);
    }

    @Override // defpackage.hfv, defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final hjr iterator() {
        return this.d.listIterator(0);
    }

    @Override // defpackage.heb
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.hfv, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.hfv, java.util.NavigableSet
    public final Object lower(Object obj) {
        int E = E(obj, false) - 1;
        if (E == -1) {
            return null;
        }
        return this.d.get(E);
    }

    @Override // defpackage.heb
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.hfv
    public final hfv u() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        return isEmpty() ? C(reverseOrder) : new hjc(this.d.a(), reverseOrder);
    }

    @Override // defpackage.hfv, defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.hfv
    public final hfv x(Object obj, boolean z) {
        return G(0, E(obj, z));
    }

    @Override // defpackage.hfv
    public final hfv z(Object obj, boolean z, Object obj2, boolean z2) {
        return B(obj, z).x(obj2, z2);
    }
}
