package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bo1 implements List, m71 {
    public final eo1 m;

    public bo1(eo1 eo1Var) {
        this.m = eo1Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.m.b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        eo1 eo1Var = this.m;
        return eo1Var.e(eo1Var.o, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.m.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.m.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.m.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fo1.a(i, this);
        return this.m.m[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.m.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.m.o == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new do1(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        eo1 eo1Var = this.m;
        Object[] objArr = eo1Var.m;
        for (int i = eo1Var.o - 1; i >= 0; i--) {
            if (Intrinsics.b(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new do1(0, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        fo1.a(i, this);
        return this.m.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        eo1 eo1Var = this.m;
        int i = eo1Var.o;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eo1Var.k(it.next());
        }
        return i != eo1Var.o;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        eo1 eo1Var = this.m;
        int i = eo1Var.o;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(eo1Var.m[i2])) {
                eo1Var.l(i2);
            }
        }
        return i != eo1Var.o;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        fo1.a(i, this);
        Object[] objArr = this.m.m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.m.o;
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
    public final void add(int i, Object obj) {
        this.m.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new do1(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.m.e(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.m.k(obj);
    }
}
