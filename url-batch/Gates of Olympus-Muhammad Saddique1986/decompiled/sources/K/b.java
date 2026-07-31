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
public final class b implements List, InterfaceC0441c {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3209d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3210e;

    /* renamed from: f, reason: collision with root package name */
    public int f3211f;

    public b(List list, int i3, int i4) {
        this.f3209d = list;
        this.f3210e = i3;
        this.f3211f = i4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i3 = this.f3211f;
        this.f3211f = i3 + 1;
        this.f3209d.add(i3, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        this.f3209d.addAll(i3 + this.f3210e, collection);
        this.f3211f = collection.size() + this.f3211f;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i3 = this.f3211f - 1;
        int i4 = this.f3210e;
        if (i4 <= i3) {
            while (true) {
                this.f3209d.remove(i3);
                if (i3 == i4) {
                    break;
                } else {
                    i3--;
                }
            }
        }
        this.f3211f = i4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i3 = this.f3211f;
        for (int i4 = this.f3210e; i4 < i3; i4++) {
            if (j.a(this.f3209d.get(i4), obj)) {
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
    public final Object get(int i3) {
        AbstractC0235a.i(i3, this);
        return this.f3209d.get(i3 + this.f3210e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i3 = this.f3211f;
        int i4 = this.f3210e;
        for (int i5 = i4; i5 < i3; i5++) {
            if (j.a(this.f3209d.get(i5), obj)) {
                return i5 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3211f == this.f3210e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i3 = this.f3211f - 1;
        int i4 = this.f3210e;
        if (i4 > i3) {
            return -1;
        }
        while (!j.a(this.f3209d.get(i3), obj)) {
            if (i3 == i4) {
                return -1;
            }
            i3--;
        }
        return i3 - i4;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i3 = this.f3211f;
        for (int i4 = this.f3210e; i4 < i3; i4++) {
            ?? r22 = this.f3209d;
            if (j.a(r22.get(i4), obj)) {
                r22.remove(i4);
                this.f3211f--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i3 = this.f3211f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i3 != this.f3211f;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i3 = this.f3211f;
        int i4 = i3 - 1;
        int i5 = this.f3210e;
        if (i5 <= i4) {
            while (true) {
                ?? r3 = this.f3209d;
                if (!collection.contains(r3.get(i4))) {
                    r3.remove(i4);
                    this.f3211f--;
                }
                if (i4 == i5) {
                    break;
                }
                i4--;
            }
        }
        return i3 != this.f3211f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        AbstractC0235a.i(i3, this);
        return this.f3209d.set(i3 + this.f3210e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3211f - this.f3210e;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i3, Object obj) {
        this.f3209d.add(i3 + this.f3210e, obj);
        this.f3211f++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new c(i3, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f3209d.addAll(this.f3211f, collection);
        this.f3211f = collection.size() + this.f3211f;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i3) {
        AbstractC0235a.i(i3, this);
        this.f3211f--;
        return this.f3209d.remove(i3 + this.f3210e);
    }
}
