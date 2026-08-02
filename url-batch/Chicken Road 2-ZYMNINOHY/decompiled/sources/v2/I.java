package v2;

import a.AbstractC0124a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class I extends D implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final G f15571b = new G(a0.f15605e, 0);

    public static a0 i(int i4, Object[] objArr) {
        return i4 == 0 ? a0.f15605e : new a0(i4, objArr);
    }

    public static F j() {
        return new F(4);
    }

    public static I k(Collection collection) {
        if (!(collection instanceof D)) {
            Object[] array = collection.toArray();
            r.b(array.length, array);
            return i(array.length, array);
        }
        I b4 = ((D) collection).b();
        if (!b4.g()) {
            return b4;
        }
        Object[] array2 = b4.toArray(D.f15562a);
        return i(array2.length, array2);
    }

    public static a0 l(Object[] objArr) {
        if (objArr.length == 0) {
            return a0.f15605e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        r.b(objArr2.length, objArr2);
        return i(objArr2.length, objArr2);
    }

    public static a0 n(Long l4, Long l5, Long l6, Long l7, Long l8) {
        Object[] objArr = {l4, l5, l6, l7, l8};
        r.b(5, objArr);
        return i(5, objArr);
    }

    public static a0 o(Object obj) {
        Object[] objArr = {obj};
        r.b(1, objArr);
        return i(1, objArr);
    }

    public static a0 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        r.b(2, objArr);
        return i(2, objArr);
    }

    public static a0 q(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        r.b(array.length, array);
        Arrays.sort(array, comparator);
        return i(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // v2.D
    public int c(int i4, Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i4 + i5] = get(i5);
        }
        return i4 + size;
    }

    @Override // v2.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
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
                            if (it2.hasNext() && V3.b.n(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        if (V3.b.n(get(i4), list.get(i4))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // v2.D
    /* renamed from: h */
    public final p0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = ~(~(get(i5).hashCode() + (i4 * 31)));
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // v2.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    @Override // java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final G listIterator(int i4) {
        AbstractC0124a.q(i4, size());
        return isEmpty() ? f15571b : new G(this, i4);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public I subList(int i4, int i5) {
        AbstractC0124a.r(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? a0.f15605e : new H(this, i4, i6);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // v2.D
    public final I b() {
        return this;
    }
}
