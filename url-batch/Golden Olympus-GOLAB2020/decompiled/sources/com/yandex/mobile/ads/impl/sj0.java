package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qj0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class sj0<E> extends qj0<E> implements List<E>, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final y72<Object> f31763c = new b(0, fo1.f25884g);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31764d = 0;

    public static final class a<E> extends qj0.a<E> {
        public a() {
            this(0);
        }

        public final sj0<E> a() {
            this.f30806c = true;
            return sj0.b(this.f30805b, this.f30804a);
        }

        public final a b(List list) {
            a(list);
            return this;
        }

        a(int i4) {
        }
    }

    static class b<E> extends AbstractC1910f<E> {

        /* renamed from: d, reason: collision with root package name */
        private final sj0<E> f31765d;

        b(int i4, sj0 sj0Var) {
            super(sj0Var.size(), i4);
            this.f31765d = sj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC1910f
        protected final E a(int i4) {
            return this.f31765d.get(i4);
        }
    }

    static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object[] f31766b;

        c(Object[] objArr) {
            this.f31766b = objArr;
        }

        Object readResolve() {
            return sj0.b(this.f31766b);
        }
    }

    class d extends sj0<E> {

        /* renamed from: e, reason: collision with root package name */
        final transient int f31767e;

        /* renamed from: f, reason: collision with root package name */
        final transient int f31768f;

        d(int i4, int i5) {
            this.f31767e = i4;
            this.f31768f = i5;
        }

        @Override // com.yandex.mobile.ads.impl.sj0, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sj0<E> subList(int i4, int i5) {
            nj1.a(i4, i5, this.f31768f);
            sj0 sj0Var = sj0.this;
            int i6 = this.f31767e;
            return sj0Var.subList(i4 + i6, i5 + i6);
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final Object[] c() {
            return sj0.this.c();
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final int d() {
            return sj0.this.e() + this.f31767e + this.f31768f;
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final int e() {
            return sj0.this.e() + this.f31767e;
        }

        @Override // com.yandex.mobile.ads.impl.qj0
        final boolean f() {
            return true;
        }

        @Override // java.util.List
        public final E get(int i4) {
            nj1.a(i4, this.f31768f);
            return sj0.this.get(i4 + this.f31767e);
        }

        @Override // com.yandex.mobile.ads.impl.sj0, com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.yandex.mobile.ads.impl.sj0, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f31768f;
        }

        @Override // com.yandex.mobile.ads.impl.sj0, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
            return listIterator(i4);
        }
    }

    sj0() {
    }

    private static <E> sj0<E> a(Object... objArr) {
        int length = objArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(C1877de.a("at index ", i4));
            }
        }
        return b(objArr.length, objArr);
    }

    public static <E> a<E> g() {
        return new a<>();
    }

    public static <E> sj0<E> h() {
        return (sj0<E>) fo1.f25884g;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    @Deprecated
    public final sj0<E> b() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && nd1.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        if (nd1.a(get(i4), list.get(i4))) {
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

    @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final x72<E> iterator() {
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
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    Object writeReplace() {
        return new c(toArray());
    }

    static sj0 b(int i4, Object[] objArr) {
        return i4 == 0 ? fo1.f25884g : new fo1(i4, objArr);
    }

    @Override // com.yandex.mobile.ads.impl.qj0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public static <E> sj0<E> b(E[] eArr) {
        if (eArr.length == 0) {
            return (sj0<E>) fo1.f25884g;
        }
        return a((Object[]) eArr.clone());
    }

    @Override // com.yandex.mobile.ads.impl.qj0
    int a(int i4, Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i4 + i5] = get(i5);
        }
        return i4 + size;
    }

    public static <E> sj0<E> a(Collection<? extends E> collection) {
        if (collection instanceof qj0) {
            sj0<E> b4 = ((qj0) collection).b();
            if (!b4.f()) {
                return b4;
            }
            Object[] array = b4.toArray();
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    @Override // java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y72<E> listIterator(int i4) {
        nj1.b(i4, size());
        if (isEmpty()) {
            return (y72<E>) f31763c;
        }
        return new b(i4, this);
    }

    public static sj0 a(Long l4, Long l5, Long l6, Long l7, Long l8) {
        return a(l4, l5, l6, l7, l8);
    }

    public static <E> sj0<E> a(E e4) {
        return a(e4);
    }

    public static <E> sj0<E> a(E e4, E e5) {
        return a(e4, e5);
    }

    @Override // java.util.List
    /* renamed from: a */
    public sj0<E> subList(int i4, int i5) {
        nj1.a(i4, i5, size());
        int i6 = i5 - i4;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return (sj0<E>) fo1.f25884g;
        }
        return new d(i4, i6);
    }
}
