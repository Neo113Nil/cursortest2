package v2;

import a.AbstractC0124a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class k0 extends AbstractCollection implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final Set f15651a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.e f15652b;

    public k0(Set set, u2.e eVar) {
        this.f15651a = set;
        this.f15652b = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        AbstractC0124a.h(this.f15652b.apply(obj));
        return this.f15651a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC0124a.h(this.f15652b.apply(it.next()));
        }
        return this.f15651a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f15651a;
        boolean z = set instanceof RandomAccess;
        u2.e eVar = this.f15652b;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            eVar.getClass();
            while (it.hasNext()) {
                if (eVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        eVar.getClass();
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            if (!eVar.apply(obj)) {
                if (i5 > i4) {
                    try {
                        list.set(i4, obj);
                    } catch (IllegalArgumentException unused) {
                        r.p(list, eVar, i4, i5);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        r.p(list, eVar, i4, i5);
                        return;
                    }
                }
                i4++;
            }
        }
        list.subList(i4, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        Set set = this.f15651a;
        set.getClass();
        try {
            z = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.f15652b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return r.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f15651a.iterator();
        u2.e eVar = this.f15652b;
        AbstractC0124a.o(eVar, "predicate");
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (eVar.apply(it.next())) {
                break;
            }
            i4++;
        }
        return true ^ (i4 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f15651a.iterator();
        it.getClass();
        u2.e eVar = this.f15652b;
        eVar.getClass();
        return new N(it, eVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f15651a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f15651a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f15652b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f15651a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f15652b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f15651a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (this.f15652b.apply(it.next())) {
                i4++;
            }
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n = (N) it;
            if (!n.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(n.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n = (N) it;
            if (n.hasNext()) {
                arrayList.add(n.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
