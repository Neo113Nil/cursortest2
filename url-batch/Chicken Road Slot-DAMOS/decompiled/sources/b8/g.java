package b8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g extends b implements List, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final d f1423e = new d(s.f1440s, 0);

    public static s k(int i3, Object[] objArr) {
        return i3 == 0 ? s.f1440s : new s(i3, objArr);
    }

    public static g m(Iterable iterable) {
        if (iterable instanceof Collection) {
            return n((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return s.f1440s;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            Object[] objArr = {next};
            z4.w.j(1, objArr);
            return k(1, objArr);
        }
        c cVar = new c(4);
        cVar.a(next);
        while (it.hasNext()) {
            cVar.a(it.next());
        }
        return cVar.c();
    }

    public static g n(Collection collection) {
        if (!(collection instanceof b)) {
            Object[] array = collection.toArray();
            z4.w.j(array.length, array);
            return k(array.length, array);
        }
        g b10 = ((b) collection).b();
        if (!b10.h()) {
            return b10;
        }
        Object[] array2 = b10.toArray(b.f1414d);
        return k(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // b8.b
    public int c(Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // b8.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && g8.b.x(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        if (g8.b.x(get(i3), list.get(i3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i3 = ~(~(get(i10).hashCode() + (i3 * 31)));
        }
        return i3;
    }

    @Override // b8.b
    /* renamed from: i */
    public final b0 iterator() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // b8.b, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final d listIterator(int i3) {
        i7.a.B(i3, size());
        return isEmpty() ? f1423e : new d(this, i3);
    }

    public g p() {
        return size() <= 1 ? this : new e(this);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g subList(int i3, int i10) {
        i7.a.D(i3, i10, size());
        int i11 = i10 - i3;
        return i11 == size() ? this : i11 == 0 ? s.f1440s : new f(this, i3, i11);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // b8.b
    public final g b() {
        return this;
    }
}
