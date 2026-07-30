package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class co1 implements List, m71 {
    public final List m;
    public final int n;
    public int o;

    public co1(List list, int i, int i2) {
        this.m = list;
        this.n = i;
        this.o = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.m.add(i + this.n, obj);
        this.o++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.m.addAll(i + this.n, collection);
        int size = collection.size();
        this.o += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.o - 1;
        int i2 = this.n;
        if (i2 <= i) {
            while (true) {
                this.m.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.o = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.o;
        for (int i2 = this.n; i2 < i; i2++) {
            if (Intrinsics.b(this.m.get(i2), obj)) {
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

    @Override // java.util.List
    public final Object get(int i) {
        fo1.a(i, this);
        return this.m.get(i + this.n);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.o;
        int i2 = this.n;
        for (int i3 = i2; i3 < i; i3++) {
            if (Intrinsics.b(this.m.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.o == this.n;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new do1(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.o - 1;
        int i2 = this.n;
        if (i2 > i) {
            return -1;
        }
        while (!Intrinsics.b(this.m.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new do1(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.o;
        for (int i2 = this.n; i2 < i; i2++) {
            List list = this.m;
            if (Intrinsics.b(list.get(i2), obj)) {
                list.remove(i2);
                this.o--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.o;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.o;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.o;
        int i2 = i - 1;
        int i3 = this.n;
        if (i3 <= i2) {
            while (true) {
                List list = this.m;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.o--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.o;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        fo1.a(i, this);
        return this.m.set(i + this.n, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.o - this.n;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        fo1.b(this, i, i2);
        return new co1(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return ll3.W(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ll3.X(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new do1(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.o;
        this.o = i + 1;
        this.m.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.m.addAll(this.o, collection);
        int size = collection.size();
        this.o += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        fo1.a(i, this);
        this.o--;
        return this.m.remove(i + this.n);
    }
}
