package Q;

import G.C0192d;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1409M;

/* loaded from: classes.dex */
public final class H implements List, N2.c {

    /* renamed from: d, reason: collision with root package name */
    public final v f3814d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3815e;

    /* renamed from: i, reason: collision with root package name */
    public int f3816i;

    /* renamed from: j, reason: collision with root package name */
    public int f3817j;

    public H(v vVar, int i2, int i4) {
        this.f3814d = vVar;
        this.f3815e = i2;
        this.f3816i = vVar.B();
        this.f3817j = i4 - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        e();
        int i2 = this.f3815e + this.f3817j;
        v vVar = this.f3814d;
        vVar.add(i2, obj);
        this.f3817j++;
        this.f3816i = vVar.B();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f3817j, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i2;
        J.c cVar;
        AbstractC0274j k4;
        boolean z4;
        if (this.f3817j > 0) {
            e();
            v vVar = this.f3814d;
            int i4 = this.f3815e;
            int i5 = this.f3817j + i4;
            vVar.getClass();
            do {
                Object obj = w.f3897a;
                synchronized (obj) {
                    t tVar = vVar.f3896d;
                    Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    t tVar2 = (t) q.i(tVar);
                    i2 = tVar2.f3891d;
                    cVar = tVar2.f3890c;
                    Unit unit = Unit.f7487a;
                }
                Intrinsics.c(cVar);
                K.f a4 = cVar.a();
                a4.subList(i4, i5).clear();
                J.c s4 = a4.s();
                if (Intrinsics.a(s4, cVar)) {
                    break;
                }
                t tVar3 = vVar.f3896d;
                Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (q.f3878b) {
                    k4 = q.k();
                    t tVar4 = (t) q.w(tVar3, vVar, k4);
                    synchronized (obj) {
                        int i6 = tVar4.f3891d;
                        if (i6 == i2) {
                            tVar4.f3890c = s4;
                            tVar4.f3891d = i6 + 1;
                            tVar4.f3892e++;
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                }
                q.n(k4, vVar);
            } while (!z4);
            this.f3817j = 0;
            this.f3816i = this.f3814d.B();
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

    public final void e() {
        if (this.f3814d.B() != this.f3816i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public final Object get(int i2) {
        e();
        w.a(i2, this.f3817j);
        return this.f3814d.get(this.f3815e + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        e();
        int i2 = this.f3817j;
        int i4 = this.f3815e;
        Iterator<Integer> it = kotlin.ranges.b.h(i4, i2 + i4).iterator();
        while (it.hasNext()) {
            int b4 = ((AbstractC1409M) it).b();
            if (Intrinsics.a(obj, this.f3814d.get(b4))) {
                return b4 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3817j == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e();
        int i2 = this.f3817j;
        int i4 = this.f3815e;
        for (int i5 = (i2 + i4) - 1; i5 >= i4; i5--) {
            if (Intrinsics.a(obj, this.f3814d.get(i5))) {
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
            boolean z4 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z4) {
                    z4 = true;
                }
            }
            return z4;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i2;
        J.c cVar;
        AbstractC0274j k4;
        boolean z4;
        e();
        v vVar = this.f3814d;
        int i4 = this.f3815e;
        int i5 = this.f3817j + i4;
        int size = vVar.size();
        do {
            Object obj = w.f3897a;
            synchronized (obj) {
                t tVar = vVar.f3896d;
                Intrinsics.d(tVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                t tVar2 = (t) q.i(tVar);
                i2 = tVar2.f3891d;
                cVar = tVar2.f3890c;
                Unit unit = Unit.f7487a;
            }
            Intrinsics.c(cVar);
            K.f a4 = cVar.a();
            a4.subList(i4, i5).retainAll(collection);
            J.c s4 = a4.s();
            if (Intrinsics.a(s4, cVar)) {
                break;
            }
            t tVar3 = vVar.f3896d;
            Intrinsics.d(tVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (q.f3878b) {
                k4 = q.k();
                t tVar4 = (t) q.w(tVar3, vVar, k4);
                synchronized (obj) {
                    int i6 = tVar4.f3891d;
                    if (i6 == i2) {
                        tVar4.f3890c = s4;
                        tVar4.f3891d = i6 + 1;
                        tVar4.f3892e++;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
            }
            q.n(k4, vVar);
        } while (!z4);
        int size2 = size - vVar.size();
        if (size2 > 0) {
            this.f3816i = this.f3814d.B();
            this.f3817j -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        w.a(i2, this.f3817j);
        e();
        int i4 = i2 + this.f3815e;
        v vVar = this.f3814d;
        Object obj2 = vVar.set(i4, obj);
        this.f3816i = vVar.B();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3817j;
    }

    @Override // java.util.List
    public final List subList(int i2, int i4) {
        if (!(i2 >= 0 && i2 <= i4 && i4 <= this.f3817j)) {
            C0192d.S("fromIndex or toIndex are out of bounds");
            throw null;
        }
        e();
        int i5 = this.f3815e;
        return new H(this.f3814d, i2 + i5, i4 + i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return M2.o.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        e();
        M2.C c4 = new M2.C();
        c4.f3578d = i2 - 1;
        return new G(c4, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return M2.o.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        e();
        int i4 = i2 + this.f3815e;
        v vVar = this.f3814d;
        boolean addAll = vVar.addAll(i4, collection);
        if (addAll) {
            this.f3817j = collection.size() + this.f3817j;
            this.f3816i = vVar.B();
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        e();
        int i4 = this.f3815e + i2;
        v vVar = this.f3814d;
        Object remove = vVar.remove(i4);
        this.f3817j--;
        this.f3816i = vVar.B();
        return remove;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        e();
        int i4 = this.f3815e + i2;
        v vVar = this.f3814d;
        vVar.add(i4, obj);
        this.f3817j++;
        this.f3816i = vVar.B();
    }
}
