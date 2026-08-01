package b1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.m0;
import kotlin.jvm.internal.Intrinsics;
import n0.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 implements List, xd.c {

    /* renamed from: d, reason: collision with root package name */
    public final w f991d;

    /* renamed from: e, reason: collision with root package name */
    public final int f992e;

    /* renamed from: i, reason: collision with root package name */
    public int f993i;

    /* renamed from: r, reason: collision with root package name */
    public int f994r;

    public j0(w wVar, int i3, int i10) {
        this.f991d = wVar;
        this.f992e = i3;
        this.f993i = x.g(wVar);
        this.f994r = i10 - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i3 = this.f992e + this.f994r;
        w wVar = this.f991d;
        wVar.add(i3, obj);
        this.f994r++;
        this.f993i = x.g(wVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        b();
        int i10 = i3 + this.f992e;
        w wVar = this.f991d;
        boolean addAll = wVar.addAll(i10, collection);
        if (addAll) {
            this.f994r = collection.size() + this.f994r;
            this.f993i = x.g(wVar);
        }
        return addAll;
    }

    public final void b() {
        if (x.g(this.f991d) != this.f993i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f994r > 0) {
            b();
            int i3 = this.f994r;
            int i10 = this.f992e;
            w wVar = this.f991d;
            wVar.f(i10, i3 + i10);
            this.f994r = 0;
            this.f993i = x.g(wVar);
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
    public final Object get(int i3) {
        b();
        x.a(i3, this.f994r);
        return this.f991d.get(this.f992e + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i3 = this.f994r;
        int i10 = this.f992e;
        Iterator it = be.f.f(i10, i3 + i10).iterator();
        while (((be.c) it).f1471i) {
            int nextInt = ((m0) it).nextInt();
            if (Intrinsics.a(obj, this.f991d.get(nextInt))) {
                return nextInt - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f994r == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i3 = this.f994r;
        int i10 = this.f992e;
        for (int i11 = (i3 + i10) - 1; i11 >= i10; i11--) {
            if (Intrinsics.a(obj, this.f991d.get(i11))) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        b();
        wd.a0 a0Var = new wd.a0();
        a0Var.f10139d = i3 - 1;
        return new i0(a0Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        b();
        int i10 = this.f992e + i3;
        w wVar = this.f991d;
        Object remove = wVar.remove(i10);
        this.f994r--;
        this.f993i = x.g(wVar);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i3;
        t0.b bVar;
        i j;
        boolean b10;
        b();
        w wVar = this.f991d;
        int i10 = this.f992e;
        int i11 = this.f994r + i10;
        int size = wVar.size();
        do {
            synchronized (x.f1043a) {
                e0 e0Var = wVar.f1042d;
                e0Var.getClass();
                e0 e0Var2 = (e0) r.h(e0Var);
                i3 = e0Var2.f972d;
                bVar = e0Var2.f971c;
            }
            bVar.getClass();
            t0.e g = bVar.g();
            g.subList(i10, i11).retainAll(collection);
            t0.b e2 = g.e();
            if (Intrinsics.a(e2, bVar)) {
                break;
            }
            e0 e0Var3 = wVar.f1042d;
            e0Var3.getClass();
            synchronized (r.f1030c) {
                j = r.j();
                b10 = x.b((e0) r.w(e0Var3, wVar, j), i3, e2, true);
            }
            r.n(j, wVar);
        } while (!b10);
        int size2 = size - wVar.size();
        if (size2 > 0) {
            this.f993i = x.g(this.f991d);
            this.f994r -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        x.a(i3, this.f994r);
        b();
        int i10 = i3 + this.f992e;
        w wVar = this.f991d;
        Object obj2 = wVar.set(i10, obj);
        this.f993i = x.g(wVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f994r;
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        if (i3 < 0 || i3 > i10 || i10 > this.f994r) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i11 = this.f992e;
        return new j0(this.f991d, i3 + i11, i10 + i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wd.i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wd.i.b(this, objArr);
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
    public final void add(int i3, Object obj) {
        b();
        int i10 = this.f992e + i3;
        w wVar = this.f991d;
        wVar.add(i10, obj);
        this.f994r++;
        this.f993i = x.g(wVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f994r, collection);
    }
}
