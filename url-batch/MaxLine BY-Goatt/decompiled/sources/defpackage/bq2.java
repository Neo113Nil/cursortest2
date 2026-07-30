package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bq2 implements List, m71 {
    public final fn2 m;
    public final int n;
    public int o;
    public int p;

    public bq2(fn2 fn2Var, int i, int i2) {
        this.m = fn2Var;
        this.n = i;
        this.o = tk3.R(fn2Var);
        this.p = i2 - i;
    }

    public final void a() {
        if (tk3.R(this.m) != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.n + this.p;
        fn2 fn2Var = this.m;
        fn2Var.add(i, obj);
        this.p++;
        this.o = tk3.R(fn2Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.n;
        fn2 fn2Var = this.m;
        boolean addAll = fn2Var.addAll(i2, collection);
        if (addAll) {
            this.p = collection.size() + this.p;
            this.o = tk3.R(fn2Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.p > 0) {
            a();
            int i = this.p;
            int i2 = this.n;
            fn2 fn2Var = this.m;
            fn2Var.c(i2, i + i2);
            this.p = 0;
            this.o = tk3.R(fn2Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        tk3.v(i, this.p);
        return this.m.get(this.n + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.p;
        int i2 = this.n;
        t31 it = d.f(i2, i + i2).iterator();
        while (it.o) {
            int nextInt = it.nextInt();
            if (Intrinsics.b(obj, this.m.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.p == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.p;
        int i2 = this.n;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.b(obj, this.m.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        a82 a82Var = new a82();
        a82Var.m = i - 1;
        return new ka2(a82Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.n + i;
        fn2 fn2Var = this.m;
        Object remove = fn2Var.remove(i2);
        this.p--;
        this.o = tk3.R(fn2Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        w0 w0Var;
        nm2 k;
        boolean z;
        a();
        fn2 fn2Var = this.m;
        int i2 = this.n;
        int i3 = this.p + i2;
        int size = fn2Var.size();
        do {
            synchronized (tk3.j) {
                xo2 xo2Var = fn2Var.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            f12 e = w0Var.e();
            e.subList(i2, i3).retainAll(collection);
            w0 c = e.c();
            if (Intrinsics.b(c, w0Var)) {
                break;
            }
            xo2 xo2Var3 = fn2Var.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k = tm2.k();
                z = tk3.z((xo2) tm2.w(xo2Var3, fn2Var, k), i, c, true);
            }
            tm2.n(k, fn2Var);
        } while (!z);
        int size2 = size - fn2Var.size();
        if (size2 > 0) {
            this.o = tk3.R(this.m);
            this.p -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        tk3.v(i, this.p);
        a();
        int i2 = i + this.n;
        fn2 fn2Var = this.m;
        Object obj2 = fn2Var.set(i2, obj);
        this.o = tk3.R(fn2Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.p;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.p) {
            v32.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.n;
        return new bq2(this.m, i + i3, i2 + i3);
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
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.n + i;
        fn2 fn2Var = this.m;
        fn2Var.add(i2, obj);
        this.p++;
        this.o = tk3.R(fn2Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.p, collection);
    }
}
