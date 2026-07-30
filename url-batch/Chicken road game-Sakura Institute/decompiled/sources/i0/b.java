package i0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import r6.j;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements List, s6.c {

    /* renamed from: f, reason: collision with root package name */
    public final Object f4835f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4836g;

    /* renamed from: h, reason: collision with root package name */
    public int f4837h;

    public b(List list, int i7, int i8) {
        this.f4835f = list;
        this.f4836g = i7;
        this.f4837h = i8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7 = this.f4837h;
        this.f4837h = i7 + 1;
        this.f4835f.add(i7, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        this.f4835f.addAll(i7 + this.f4836g, collection);
        this.f4837h = collection.size() + this.f4837h;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7 = this.f4837h - 1;
        int i8 = this.f4836g;
        if (i8 <= i7) {
            while (true) {
                this.f4835f.remove(i7);
                if (i7 == i8) {
                    break;
                } else {
                    i7--;
                }
            }
        }
        this.f4837h = i8;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i7 = this.f4837h;
        for (int i8 = this.f4836g; i8 < i7; i8++) {
            if (k.a(this.f4835f.get(i8), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i7) {
        a.a.h(i7, this);
        return this.f4835f.get(i7 + this.f4836g);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i7 = this.f4837h;
        int i8 = this.f4836g;
        for (int i9 = i8; i9 < i7; i9++) {
            if (k.a(this.f4835f.get(i9), obj)) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4837h == this.f4836g;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i7 = this.f4837h - 1;
        int i8 = this.f4836g;
        if (i8 > i7) {
            return -1;
        }
        while (!k.a(this.f4835f.get(i7), obj)) {
            if (i7 == i8) {
                return -1;
            }
            i7--;
        }
        return i7 - i8;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7 = this.f4837h;
        for (int i8 = this.f4836g; i8 < i7; i8++) {
            ?? r22 = this.f4835f;
            if (k.a(r22.get(i8), obj)) {
                r22.remove(i8);
                this.f4837h--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7 = this.f4837h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i7 != this.f4837h;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7 = this.f4837h;
        int i8 = i7 - 1;
        int i9 = this.f4836g;
        if (i9 <= i8) {
            while (true) {
                ?? r32 = this.f4835f;
                if (!collection.contains(r32.get(i8))) {
                    r32.remove(i8);
                    this.f4837h--;
                }
                if (i8 == i9) {
                    break;
                }
                i8--;
            }
        }
        return i7 != this.f4837h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        a.a.h(i7, this);
        return this.f4835f.set(i7 + this.f4836g, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4837h - this.f4836g;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        a.a.i(this, i7, i8);
        return new b(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return j.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f4835f.add(i7 + this.f4836g, obj);
        this.f4837h++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new c(i7, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return j.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f4835f.addAll(this.f4837h, collection);
        this.f4837h = collection.size() + this.f4837h;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i7) {
        a.a.h(i7, this);
        this.f4837h--;
        return this.f4835f.remove(i7 + this.f4836g);
    }
}
