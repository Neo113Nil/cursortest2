package K;

import a.AbstractC0235a;
import f2.i;
import f2.j;
import g2.InterfaceC0441c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class a implements List, InterfaceC0441c {

    /* renamed from: d, reason: collision with root package name */
    public final d f3208d;

    public a(d dVar) {
        this.f3208d = dVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f3208d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f3208d;
        return dVar.e(dVar.f3216f, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f3208d.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3208d.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        d dVar = this.f3208d;
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
        AbstractC0235a.i(i3, this);
        return this.f3208d.f3214d[i3];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f3208d.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3208d.l();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f3208d;
        int i3 = dVar.f3216f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = dVar.f3214d;
            while (!j.a(obj, objArr[i4])) {
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
        return this.f3208d.n(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        d dVar = this.f3208d;
        dVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = dVar.f3216f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dVar.n(it.next());
        }
        return i3 != dVar.f3216f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f3208d;
        int i3 = dVar.f3216f;
        for (int i4 = i3 - 1; -1 < i4; i4--) {
            if (!collection.contains(dVar.f3214d[i4])) {
                dVar.o(i4);
            }
        }
        return i3 != dVar.f3216f;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        AbstractC0235a.i(i3, this);
        Object[] objArr = this.f3208d.f3214d;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3208d.f3216f;
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        AbstractC0235a.j(this, i3, i4);
        return new b(this, i3, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        this.f3208d.a(i3, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new c(i3, this);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        AbstractC0235a.i(i3, this);
        return this.f3208d.o(i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        return this.f3208d.e(i3, collection);
    }
}
