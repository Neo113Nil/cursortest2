package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class co0 implements List, zb0 {
    public final List d;
    public final int e;
    public int g;

    public co0(List list, int i, int i2) {
        this.d = list;
        this.e = i;
        this.g = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.d.add(i + this.e, obj);
        this.g++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.d.addAll(i + this.e, collection);
        int size = collection.size();
        this.g += size;
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.g - 1;
        int i2 = this.e;
        if (i2 <= i) {
            while (true) {
                this.d.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.g = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.g;
        for (int i2 = this.e; i2 < i; i2++) {
            if (Intrinsics.a(this.d.get(i2), obj)) {
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
        fo0.a(i, this);
        return this.d.get(i + this.e);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.g;
        int i2 = this.e;
        for (int i3 = i2; i3 < i; i3++) {
            if (Intrinsics.a(this.d.get(i3), obj)) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.g == this.e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new do0(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.g - 1;
        int i2 = this.e;
        if (i2 > i) {
            return -1;
        }
        while (!Intrinsics.a(this.d.get(i), obj)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new do0(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.g;
        for (int i2 = this.e; i2 < i; i2++) {
            List list = this.d;
            if (Intrinsics.a(list.get(i2), obj)) {
                list.remove(i2);
                this.g--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.g;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.g;
        int i2 = i - 1;
        int i3 = this.e;
        if (i3 <= i2) {
            while (true) {
                List list = this.d;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.g--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return i != this.g;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        fo0.a(i, this);
        return this.d.set(i + this.e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.g - this.e;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        fo0.b(this, i, i2);
        return new co0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return mo.F(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return mo.G(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new do0(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.g;
        this.g = i + 1;
        this.d.add(i, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.d.addAll(this.g, collection);
        int size = collection.size();
        this.g += size;
        return size > 0;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        fo0.a(i, this);
        this.g--;
        return this.d.remove(i + this.e);
    }
}
