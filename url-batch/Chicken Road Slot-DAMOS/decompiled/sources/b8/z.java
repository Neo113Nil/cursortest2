package b8;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class z extends k {

    /* renamed from: v, reason: collision with root package name */
    public static final z f1466v;

    /* renamed from: u, reason: collision with root package name */
    public final transient g f1467u;

    static {
        d dVar = g.f1423e;
        f1466v = new z(s.f1440s, q.f1439d);
    }

    public z(g gVar, Comparator comparator) {
        super(comparator);
        this.f1467u = gVar;
    }

    @Override // b8.i, b8.b
    public final g b() {
        return this.f1467u;
    }

    @Override // b8.b
    public final int c(Object[] objArr) {
        return this.f1467u.c(objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int s3 = s(obj, true);
        g gVar = this.f1467u;
        if (s3 == gVar.size()) {
            return null;
        }
        return gVar.get(s3);
    }

    @Override // b8.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f1467u, obj, this.f1431r) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof p) {
            collection = ((p) collection).d();
        }
        Comparator comparator = this.f1431r;
        if (!c6.f.M(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        b0 it = iterator();
        Iterator it2 = collection.iterator();
        d dVar = (d) it;
        if (!dVar.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = dVar.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare < 0) {
                    if (!dVar.hasNext()) {
                        return false;
                    }
                    next2 = dVar.next();
                } else if (compare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (compare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f1467u.p().listIterator(0);
    }

    @Override // b8.b
    public final Object[] e() {
        return this.f1467u.e();
    }

    @Override // b8.i, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f1467u.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f1431r;
        if (!c6.f.M(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            b0 it2 = iterator();
            do {
                d dVar = (d) it2;
                if (!dVar.hasNext()) {
                    return true;
                }
                next = dVar.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // b8.b
    public final int f() {
        return this.f1467u.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.f1467u.get(0);
        }
        i0.c();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int r9 = r(obj, true) - 1;
        if (r9 == -1) {
            return null;
        }
        return this.f1467u.get(r9);
    }

    @Override // b8.b
    public final int g() {
        return this.f1467u.g();
    }

    @Override // b8.b
    public final boolean h() {
        return this.f1467u.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int s3 = s(obj, false);
        g gVar = this.f1467u;
        if (s3 == gVar.size()) {
            return null;
        }
        return gVar.get(s3);
    }

    @Override // b8.b
    /* renamed from: i */
    public final b0 iterator() {
        return this.f1467u.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            i0.c();
            return null;
        }
        return this.f1467u.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int r9 = r(obj, false) - 1;
        if (r9 == -1) {
            return null;
        }
        return this.f1467u.get(r9);
    }

    public final z q(int i3, int i10) {
        g gVar = this.f1467u;
        if (i3 == 0 && i10 == gVar.size()) {
            return this;
        }
        Comparator comparator = this.f1431r;
        return i3 < i10 ? new z(gVar.subList(i3, i10), comparator) : k.o(comparator);
    }

    public final int r(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f1467u, obj, this.f1431r);
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int s(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f1467u, obj, this.f1431r);
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1467u.size();
    }
}
