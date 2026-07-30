package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class af1 implements List, zb0 {
    public final ac1 d;
    public final int e;
    public int g;
    public int h;

    public af1(ac1 ac1Var, int i, int i2) {
        this.d = ac1Var;
        this.e = i;
        this.g = yr1.N(ac1Var);
        this.h = i2 - i;
    }

    public final void a() {
        if (yr1.N(this.d) != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.e + this.h;
        ac1 ac1Var = this.d;
        ac1Var.add(i, obj);
        this.h++;
        this.g = yr1.N(ac1Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.e;
        ac1 ac1Var = this.d;
        boolean addAll = ac1Var.addAll(i2, collection);
        if (addAll) {
            this.h = collection.size() + this.h;
            this.g = yr1.N(ac1Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.h > 0) {
            a();
            int i = this.h;
            int i2 = this.e;
            ac1 ac1Var = this.d;
            ac1Var.e(i2, i + i2);
            this.h = 0;
            this.g = yr1.N(ac1Var);
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
        yr1.A(i, this.h);
        return this.d.get(this.e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.e;
        Iterator it = b11.g(i2, i + i2).iterator();
        while (((v90) it).g) {
            int nextInt = ((o90) it).nextInt();
            if (Intrinsics.a(obj, this.d.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.a(obj, this.d.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        x11 x11Var = new x11();
        x11Var.d = i - 1;
        return new q31(x11Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.e + i;
        ac1 ac1Var = this.d;
        Object remove = ac1Var.remove(i2);
        this.h--;
        this.g = yr1.N(ac1Var);
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
        j0 j0Var;
        ib1 j;
        boolean C;
        a();
        ac1 ac1Var = this.d;
        int i2 = this.e;
        int i3 = this.h + i2;
        int size = ac1Var.size();
        do {
            synchronized (yr1.r) {
                ee1 ee1Var = ac1Var.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            uw0 f = j0Var.f();
            f.subList(i2, i3).retainAll(collection);
            j0 d = f.d();
            if (Intrinsics.a(d, j0Var)) {
                break;
            }
            ee1 ee1Var3 = ac1Var.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j = pb1.j();
                C = yr1.C((ee1) pb1.w(ee1Var3, ac1Var, j), i, d, true);
            }
            pb1.n(j, ac1Var);
        } while (!C);
        int size2 = size - ac1Var.size();
        if (size2 > 0) {
            this.g = yr1.N(this.d);
            this.h -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        yr1.A(i, this.h);
        a();
        int i2 = i + this.e;
        ac1 ac1Var = this.d;
        Object obj2 = ac1Var.set(i2, obj);
        this.g = yr1.N(ac1Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.h) {
            cy0.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.e;
        return new af1(this.d, i + i3, i2 + i3);
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
        int i2 = this.e + i;
        ac1 ac1Var = this.d;
        ac1Var.add(i2, obj);
        this.h++;
        this.g = yr1.N(ac1Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.h, collection);
    }
}
