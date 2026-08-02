package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class C extends AbstractC0273x implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final C0279z f2714b = new C0279z(Q.f2774e, 0);

    public static Q j(int i3, Object[] objArr) {
        return i3 == 0 ? Q.f2774e : new Q(i3, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C k(List list) {
        if (list instanceof AbstractC0273x) {
            C e3 = ((AbstractC0273x) list).e();
            if (!e3.f()) {
                return e3;
            }
            Object[] array = e3.toArray(AbstractC0273x.f2957a);
            return j(array.length, array);
        }
        Object[] array2 = list.toArray();
        int length = array2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (array2[i3] == null) {
                throw new NullPointerException(AbstractC0033i.h(i3, "at index "));
            }
        }
        return j(length, array2);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public int b(Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final C e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        int i3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (0; i3 < size; i3 + 1) {
                        Object obj2 = get(i3);
                        Object obj3 = list.get(i3);
                        i3 = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i3 + 1 : 0;
                    }
                    return true;
                }
                C0279z listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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

    public C h() {
        return size() <= 1 ? this : new A(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 = (i3 * 31) + get(i4).hashCode();
        }
        return i3;
    }

    @Override // java.util.List
    /* renamed from: i */
    public C subList(int i3, int i4) {
        AbstractC0216d1.x(i3, i4, size());
        int i5 = i4 - i3;
        return i5 == size() ? this : i5 == 0 ? Q.f2774e : new B(this, i3, i5);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C0279z listIterator(int i3) {
        AbstractC0216d1.q(i3, size());
        return isEmpty() ? f2714b : new C0279z(this, i3);
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }
}
