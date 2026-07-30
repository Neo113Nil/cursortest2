package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class UB extends QB implements List, RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public static final SB f27942u = new SB(C3675oC.f33115x, 0);

    public static C3675oC j(Object obj) {
        Object[] objArr = {obj};
        PA.o(objArr, 1);
        return p(objArr, 1);
    }

    public static C3675oC k(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        PA.o(objArr, 2);
        return p(objArr, 2);
    }

    public static C3675oC l(Long l9, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l9, l10, l11, l12, l13};
        PA.o(objArr, 5);
        return p(objArr, 5);
    }

    public static C3675oC m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        PA.o(objArr2, i);
        return p(objArr2, i);
    }

    public static UB n(Collection collection) {
        if (!(collection instanceof QB)) {
            Object[] array = collection.toArray();
            int length = array.length;
            PA.o(array, length);
            return p(array, length);
        }
        UB f6 = ((QB) collection).f();
        if (!f6.g()) {
            return f6;
        }
        Object[] array2 = f6.toArray(QB.f27126n);
        return p(array2, array2.length);
    }

    public static C3675oC o(Object[] objArr) {
        if (objArr.length == 0) {
            return C3675oC.f33115x;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        PA.o(objArr2, length);
        return p(objArr2, length);
    }

    public static C3675oC p(Object[] objArr, int i) {
        return i == 0 ? C3675oC.f33115x : new C3675oC(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final CC a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.QB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                SB listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(listIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final UB f() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public int h(Object[] objArr, int i) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i + i4] = get(i4);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i = (i * 31) + get(i4).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public UB subList(int i, int i4) {
        PA.c0(i, i4, size());
        int i9 = i4 - i;
        return i9 == size() ? this : i9 == 0 ? C3675oC.f33115x : new TB(this, i, i9);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final SB listIterator(int i) {
        PA.b0(i, size());
        return isEmpty() ? f27942u : new SB(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
