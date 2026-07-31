package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class e73<E> extends z63<E> implements List<E>, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final i93<Object> f4519g = new c73(t83.f12140j, 0);

    e73() {
    }

    public static <E> e73<E> B(E e7, E e8, E e9, E e10, E e11) {
        Object[] objArr = {e7, e8, e9, e10, e11};
        r83.b(objArr, 5);
        return s(objArr, 5);
    }

    public static <E> e73<E> C(E e7, E e8, E e9, E e10, E e11, E e12) {
        Object[] objArr = {e7, e8, e9, e10, e11, e12};
        r83.b(objArr, 6);
        return s(objArr, 6);
    }

    public static <E> b73<E> q() {
        return new b73<>(4);
    }

    static <E> e73<E> r(Object[] objArr) {
        return s(objArr, objArr.length);
    }

    static <E> e73<E> s(Object[] objArr, int i7) {
        return i7 == 0 ? (e73<E>) t83.f12140j : new t83(objArr, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> e73<E> t(Iterable<? extends E> iterable) {
        Objects.requireNonNull(iterable);
        return u(iterable);
    }

    public static <E> e73<E> u(Collection<? extends E> collection) {
        if (!(collection instanceof z63)) {
            Object[] array = collection.toArray();
            int length = array.length;
            r83.b(array, length);
            return s(array, length);
        }
        e73<E> l7 = ((z63) collection).l();
        if (!l7.n()) {
            return l7;
        }
        Object[] array2 = l7.toArray();
        return s(array2, array2.length);
    }

    public static <E> e73<E> v(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        r83.b(objArr, length);
        return s(objArr, length);
    }

    public static <E> e73<E> w() {
        return (e73<E>) t83.f12140j;
    }

    public static <E> e73<E> x(E e7) {
        Object[] objArr = {e7};
        r83.b(objArr, 1);
        return s(objArr, 1);
    }

    public static <E> e73<E> y(E e7, E e8) {
        Object[] objArr = {e7, e8};
        r83.b(objArr, 2);
        return s(objArr, 2);
    }

    public static <E> e73<E> z(E e7, E e8, E e9) {
        Object[] objArr = {"2011", "1009", "3010"};
        r83.b(objArr, 3);
        return s(objArr, 3);
    }

    @Override // java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final i93<E> listIterator(int i7) {
        q43.b(i7, size(), "index");
        return isEmpty() ? (i93<E>) f4519g : new c73(this, i7);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.util.List
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
                    for (int i7 = 0; i7 < size; i7++) {
                        if (m43.a(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !m43.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = (i7 * 31) + get(i8).hashCode();
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.z63
    int i(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z63
    @Deprecated
    public final e73<E> l() {
        return this;
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

    @Override // com.google.android.gms.internal.ads.z63
    /* renamed from: m */
    public final h93<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public e73<E> subList(int i7, int i8) {
        q43.f(i7, i8, size());
        int i9 = i8 - i7;
        return i9 == size() ? this : i9 == 0 ? (e73<E>) t83.f12140j : new d73(this, i7, i9);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i7, E e7) {
        throw new UnsupportedOperationException();
    }
}
