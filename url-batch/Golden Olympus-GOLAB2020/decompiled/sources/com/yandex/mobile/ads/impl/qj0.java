package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sj0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class qj0<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private static final Object[] f30803b = new Object[0];

    public static abstract class b<E> {
        b() {
        }
    }

    qj0() {
    }

    int a(int i4, Object[] objArr) {
        x72<E> it = iterator();
        while (it.hasNext()) {
            objArr[i4] = it.next();
            i4++;
        }
        return i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public sj0<E> b() {
        if (isEmpty()) {
            int i4 = sj0.f31764d;
            return (sj0<E>) fo1.f25884g;
        }
        Object[] array = toArray(f30803b);
        int i5 = sj0.f31764d;
        return sj0.b(array.length, array);
    }

    Object[] c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    int d() {
        throw new UnsupportedOperationException();
    }

    int e() {
        throw new UnsupportedOperationException();
    }

    abstract boolean f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract x72<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f30803b);
    }

    Object writeReplace() {
        return new sj0.c(toArray(f30803b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int size = size();
        if (tArr.length < size) {
            Object[] c4 = c();
            if (c4 != null) {
                return (T[]) ih1.a(c4, e(), d(), tArr);
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(0, tArr);
        return tArr;
    }

    static abstract class a<E> extends b<E> {

        /* renamed from: a, reason: collision with root package name */
        Object[] f30804a;

        /* renamed from: b, reason: collision with root package name */
        int f30805b;

        /* renamed from: c, reason: collision with root package name */
        boolean f30806c;

        a() {
            cq.a(4, "initialCapacity");
            this.f30804a = new Object[4];
            this.f30805b = 0;
        }

        public final void a(Object obj) {
            obj.getClass();
            int i4 = this.f30805b;
            int i5 = i4 + 1;
            Object[] objArr = this.f30804a;
            if (objArr.length < i5) {
                int length = objArr.length;
                if (i5 < 0) {
                    throw new AssertionError("cannot store more than MAX_VALUE elements");
                }
                int i6 = length + (length >> 1) + 1;
                if (i6 < i5) {
                    i6 = Integer.highestOneBit(i4) << 1;
                }
                if (i6 < 0) {
                    i6 = Integer.MAX_VALUE;
                }
                this.f30804a = Arrays.copyOf(objArr, i6);
                this.f30806c = false;
            } else if (this.f30806c) {
                this.f30804a = (Object[]) objArr.clone();
                this.f30806c = false;
            }
            Object[] objArr2 = this.f30804a;
            int i7 = this.f30805b;
            this.f30805b = i7 + 1;
            objArr2[i7] = obj;
        }

        public void b(Object obj) {
            a(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final b a(List list) {
            if (list instanceof Collection) {
                int size = list.size() + this.f30805b;
                Object[] objArr = this.f30804a;
                if (objArr.length < size) {
                    int length = objArr.length;
                    if (size >= 0) {
                        int i4 = length + (length >> 1) + 1;
                        if (i4 < size) {
                            i4 = Integer.highestOneBit(size - 1) << 1;
                        }
                        if (i4 < 0) {
                            i4 = Integer.MAX_VALUE;
                        }
                        this.f30804a = Arrays.copyOf(objArr, i4);
                        this.f30806c = false;
                    } else {
                        throw new AssertionError("cannot store more than MAX_VALUE elements");
                    }
                } else if (this.f30806c) {
                    this.f30804a = (Object[]) objArr.clone();
                    this.f30806c = false;
                }
                if (list instanceof qj0) {
                    this.f30805b = ((qj0) list).a(this.f30805b, this.f30804a);
                    return this;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sj0.a) this).a(it.next());
            }
            return this;
        }
    }
}
