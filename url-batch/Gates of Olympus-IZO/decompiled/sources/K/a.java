package K;

import Z1.h;
import Z1.i;
import a2.InterfaceC0186c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class a implements List, InterfaceC0186c {

    /* renamed from: d, reason: collision with root package name */
    public final d f2634d;

    public a(d dVar) {
        this.f2634d = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f2634d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f2634d;
        return dVar.e(dVar.f2642f, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f2634d.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2634d.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f2634d;
        dVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!dVar.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        I2.d.k(i3, this);
        return this.f2634d.f2640d[i3];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f2634d.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f2634d.l();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f2634d;
        int i3 = dVar.f2642f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = dVar.f2640d;
            while (!i.a(obj, objArr[i4])) {
                i4--;
                if (i4 < 0) {
                }
            }
            return i4;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f2634d.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f2634d;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = dVar.f2642f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.n(it.next());
        }
        return i3 != dVar.f2642f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f2634d;
        int i3 = dVar.f2642f;
        for (int i4 = i3 - 1; -1 < i4; i4--) {
            if (!collection.contains(dVar.f2640d[i4])) {
                dVar.o(i4);
            }
        }
        return i3 != dVar.f2642f;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        I2.d.k(i3, this);
        Object[] objArr = this.f2634d.f2640d;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f2634d.f2642f;
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        I2.d.l(this, i3, i4);
        return new b(this, i3, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return h.a(this);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        this.f2634d.a(i3, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new c(i3, this);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        I2.d.k(i3, this);
        return this.f2634d.o(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return h.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        return this.f2634d.e(i3, collection);
    }
}
