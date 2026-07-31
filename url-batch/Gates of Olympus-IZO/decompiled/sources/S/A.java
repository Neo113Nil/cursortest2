package S;

import I.C0089d;
import a2.InterfaceC0186c;
import e2.AbstractC0381e;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class A implements List, InterfaceC0186c {

    /* renamed from: d, reason: collision with root package name */
    public final t f3173d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3174e;

    /* renamed from: f, reason: collision with root package name */
    public int f3175f;

    /* renamed from: g, reason: collision with root package name */
    public int f3176g;

    public A(t tVar, int i3, int i4) {
        this.f3173d = tVar;
        this.f3174e = i3;
        this.f3175f = tVar.j();
        this.f3176g = i4 - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i3 = this.f3174e + this.f3176g;
        t tVar = this.f3173d;
        tVar.add(i3, obj);
        this.f3176g++;
        this.f3175f = tVar.j();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f3176g, collection);
    }

    public final void b() {
        if (this.f3173d.j() != this.f3175f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i3;
        M.c cVar;
        i k3;
        boolean z3;
        if (this.f3176g > 0) {
            b();
            t tVar = this.f3173d;
            int i4 = this.f3174e;
            int i5 = this.f3176g + i4;
            tVar.getClass();
            do {
                Object obj = u.f3249a;
                synchronized (obj) {
                    s sVar = tVar.f3248d;
                    Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    s sVar2 = (s) q.i(sVar);
                    i3 = sVar2.f3246d;
                    cVar = sVar2.f3245c;
                }
                Z1.i.c(cVar);
                M.g j3 = cVar.j();
                j3.subList(i4, i5).clear();
                M.c d3 = j3.d();
                if (Z1.i.a(d3, cVar)) {
                    break;
                }
                s sVar3 = tVar.f3248d;
                Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (q.f3235b) {
                    k3 = q.k();
                    s sVar4 = (s) q.w(sVar3, tVar, k3);
                    synchronized (obj) {
                        int i6 = sVar4.f3246d;
                        if (i6 == i3) {
                            sVar4.f3245c = d3;
                            sVar4.f3246d = i6 + 1;
                            z3 = true;
                            sVar4.f3247e++;
                        } else {
                            z3 = false;
                        }
                    }
                }
                q.n(k3, tVar);
            } while (!z3);
            this.f3176g = 0;
            this.f3175f = this.f3173d.j();
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
        u.a(i3, this.f3176g);
        return this.f3173d.get(this.f3174e + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i3 = this.f3176g;
        int i4 = this.f3174e;
        Iterator it = AbstractC0381e.Q(i4, i3 + i4).iterator();
        while (it.hasNext()) {
            int a3 = ((M1.A) it).a();
            if (Z1.i.a(obj, this.f3173d.get(a3))) {
                return a3 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3176g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i3 = this.f3176g;
        int i4 = this.f3174e;
        for (int i5 = (i3 + i4) - 1; i5 >= i4; i5--) {
            if (Z1.i.a(obj, this.f3173d.get(i5))) {
                return i5 - i4;
            }
        }
        return -1;
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

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z3) {
                    z3 = true;
                }
            }
            return z3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i3;
        M.c cVar;
        i k3;
        boolean z3;
        b();
        t tVar = this.f3173d;
        int i4 = this.f3174e;
        int i5 = this.f3176g + i4;
        int size = tVar.size();
        do {
            Object obj = u.f3249a;
            synchronized (obj) {
                s sVar = tVar.f3248d;
                Z1.i.d(sVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                s sVar2 = (s) q.i(sVar);
                i3 = sVar2.f3246d;
                cVar = sVar2.f3245c;
            }
            Z1.i.c(cVar);
            M.g j3 = cVar.j();
            j3.subList(i4, i5).retainAll(collection);
            M.c d3 = j3.d();
            if (Z1.i.a(d3, cVar)) {
                break;
            }
            s sVar3 = tVar.f3248d;
            Z1.i.d(sVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3235b) {
                k3 = q.k();
                s sVar4 = (s) q.w(sVar3, tVar, k3);
                synchronized (obj) {
                    int i6 = sVar4.f3246d;
                    if (i6 == i3) {
                        sVar4.f3245c = d3;
                        sVar4.f3246d = i6 + 1;
                        sVar4.f3247e++;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            q.n(k3, tVar);
        } while (!z3);
        int size2 = size - tVar.size();
        if (size2 > 0) {
            this.f3175f = this.f3173d.j();
            this.f3176g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        u.a(i3, this.f3176g);
        b();
        int i4 = i3 + this.f3174e;
        t tVar = this.f3173d;
        Object obj2 = tVar.set(i4, obj);
        this.f3175f = tVar.j();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3176g;
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        if (!(i3 >= 0 && i3 <= i4 && i4 <= this.f3176g)) {
            C0089d.R("fromIndex or toIndex are out of bounds");
            throw null;
        }
        b();
        int i5 = this.f3174e;
        return new A(this.f3173d, i3 + i5, i4 + i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return Z1.h.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        b();
        Z1.r rVar = new Z1.r();
        rVar.f3478d = i3 - 1;
        return new M1.C(rVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return Z1.h.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        b();
        int i4 = i3 + this.f3174e;
        t tVar = this.f3173d;
        boolean addAll = tVar.addAll(i4, collection);
        if (addAll) {
            this.f3176g = collection.size() + this.f3176g;
            this.f3175f = tVar.j();
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        b();
        int i4 = this.f3174e + i3;
        t tVar = this.f3173d;
        Object remove = tVar.remove(i4);
        this.f3176g--;
        this.f3175f = tVar.j();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        b();
        int i4 = this.f3174e + i3;
        t tVar = this.f3173d;
        tVar.add(i4, obj);
        this.f3176g++;
        this.f3175f = tVar.j();
    }
}
