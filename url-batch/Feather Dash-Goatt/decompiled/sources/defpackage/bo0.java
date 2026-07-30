package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bo0 implements List, zb0 {
    public final eo0 d;

    public bo0(eo0 eo0Var) {
        this.d = eo0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.d.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        eo0 eo0Var = this.d;
        return eo0Var.e(eo0Var.g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.d.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.d.h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fo0.a(i, this);
        return this.d.d[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.d.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.d.g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new do0(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        eo0 eo0Var = this.d;
        Object[] objArr = eo0Var.d;
        for (int i = eo0Var.g - 1; i >= 0; i--) {
            if (Intrinsics.a(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new do0(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        fo0.a(i, this);
        return this.d.k(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        eo0 eo0Var = this.d;
        int i = eo0Var.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eo0Var.j(it.next());
        }
        return i != eo0Var.g;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        eo0 eo0Var = this.d;
        int i = eo0Var.g;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(eo0Var.d[i2])) {
                eo0Var.k(i2);
            }
        }
        return i != eo0Var.g;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        fo0.a(i, this);
        Object[] objArr = this.d.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.d.g;
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
    public final void add(int i, Object obj) {
        this.d.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new do0(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.d.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.d.j(obj);
    }
}
