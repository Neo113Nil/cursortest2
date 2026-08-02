package v2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: v2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1465l extends AbstractCollection implements List {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15653a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f15654b;

    /* renamed from: c, reason: collision with root package name */
    public final C1465l f15655c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f15656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f15657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f15658f;

    public C1465l(W w4, Object obj, List list, C1465l c1465l) {
        this.f15658f = w4;
        this.f15657e = w4;
        this.f15653a = obj;
        this.f15654b = list;
        this.f15655c = c1465l;
        this.f15656d = c1465l == null ? null : c1465l.f15654b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean isEmpty = this.f15654b.isEmpty();
        boolean add = this.f15654b.add(obj);
        if (add) {
            this.f15657e.f15595e++;
            if (isEmpty) {
                b();
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f15654b.addAll(collection);
        if (addAll) {
            this.f15657e.f15595e += this.f15654b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    public final void b() {
        C1465l c1465l = this.f15655c;
        if (c1465l != null) {
            c1465l.b();
        } else {
            this.f15657e.f15594d.put(this.f15653a, this.f15654b);
        }
    }

    public final void c() {
        Collection collection;
        C1465l c1465l = this.f15655c;
        if (c1465l != null) {
            c1465l.c();
            if (c1465l.f15654b != this.f15656d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f15654b.isEmpty() || (collection = (Collection) this.f15657e.f15594d.get(this.f15653a)) == null) {
                return;
            }
            this.f15654b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f15654b.clear();
        this.f15657e.f15595e -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.f15654b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.f15654b.containsAll(collection);
    }

    public final void d() {
        C1465l c1465l = this.f15655c;
        if (c1465l != null) {
            c1465l.d();
        } else if (this.f15654b.isEmpty()) {
            this.f15657e.f15594d.remove(this.f15653a);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f15654b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i4) {
        c();
        return ((List) this.f15654b).get(i4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.f15654b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f15654b).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new C1456c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f15654b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new C1464k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean remove = this.f15654b.remove(obj);
        if (remove) {
            W w4 = this.f15657e;
            w4.f15595e--;
            d();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f15654b.removeAll(collection);
        if (removeAll) {
            this.f15657e.f15595e += this.f15654b.size() - size;
            d();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f15654b.retainAll(collection);
        if (retainAll) {
            this.f15657e.f15595e += this.f15654b.size() - size;
            d();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        c();
        return ((List) this.f15654b).set(i4, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.f15654b.size();
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        c();
        List subList = ((List) this.f15654b).subList(i4, i5);
        C1465l c1465l = this.f15655c;
        if (c1465l == null) {
            c1465l = this;
        }
        boolean z = subList instanceof RandomAccess;
        W w4 = this.f15658f;
        Object obj = this.f15653a;
        return z ? new C1461h(w4, obj, subList, c1465l) : new C1465l(w4, obj, subList, c1465l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f15654b.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        c();
        return new C1464k(this, i4);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        c();
        Object remove = ((List) this.f15654b).remove(i4);
        W w4 = this.f15658f;
        w4.f15595e--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        c();
        boolean isEmpty = this.f15654b.isEmpty();
        ((List) this.f15654b).add(i4, obj);
        this.f15658f.f15595e++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f15654b).addAll(i4, collection);
        if (addAll) {
            this.f15658f.f15595e += this.f15654b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }
}
