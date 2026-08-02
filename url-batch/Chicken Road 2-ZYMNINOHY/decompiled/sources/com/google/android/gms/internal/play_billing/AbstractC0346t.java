package com.google.android.gms.internal.play_billing;

import i2.AbstractC0457a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0346t extends AbstractC0341q implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final r f6014b = new r(C0354x.f6026e, 0);

    public static C0354x i(int i4, Object[] objArr) {
        return i4 == 0 ? C0354x.f6026e : new C0354x(i4, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC0346t j(List list) {
        if (!(list instanceof AbstractC0341q)) {
            Object[] array = list.toArray();
            int length = array.length;
            AbstractC0457a.F(length, array);
            return i(length, array);
        }
        AbstractC0346t e4 = ((AbstractC0341q) list).e();
        if (!e4.f()) {
            return e4;
        }
        Object[] array2 = e4.toArray(AbstractC0341q.f5995a);
        return i(array2.length, array2);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public int b(Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = get(i4);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final AbstractC0346t e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        int i4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (0; i4 < size; i4 + 1) {
                        Object obj2 = get(i4);
                        Object obj3 = list.get(i4);
                        i4 = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i4 + 1 : 0;
                    }
                    return true;
                }
                r listIterator = listIterator(0);
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

    @Override // java.util.List
    /* renamed from: h */
    public AbstractC0346t subList(int i4, int i5) {
        U.i.L(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? C0354x.f6026e : new C0344s(this, i4, i6);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final r listIterator(int i4) {
        U.i.I(i4, size());
        return isEmpty() ? f6014b : new r(this, i4);
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
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }
}
