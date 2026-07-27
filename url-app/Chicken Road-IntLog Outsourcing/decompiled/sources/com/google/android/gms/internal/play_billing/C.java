package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class C extends AbstractC0382x implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final C0388z f5030b = new C0388z(S.f5100e, 0);

    public static S j(int i2, Object[] objArr) {
        return i2 == 0 ? S.f5100e : new S(i2, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C k(List list) {
        if (list instanceof AbstractC0382x) {
            C e3 = ((AbstractC0382x) list).e();
            if (!e3.f()) {
                return e3;
            }
            Object[] array = e3.toArray(AbstractC0382x.f5286a);
            return j(array.length, array);
        }
        Object[] array2 = list.toArray();
        int length = array2.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (array2[i2] == null) {
                throw new NullPointerException(AbstractC0279e.d(i2, "at index "));
            }
        }
        return j(length, array2);
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public int b(Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final C e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        int i2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (0; i2 < size; i2 + 1) {
                        Object obj2 = get(i2);
                        Object obj3 = list.get(i2);
                        i2 = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i2 + 1 : 0;
                    }
                    return true;
                }
                C0388z listIterator = listIterator(0);
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
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C subList(int i2, int i3) {
        AbstractC0325d1.F(i2, i3, size());
        int i6 = i3 - i2;
        return i6 == size() ? this : i6 == 0 ? S.f5100e : new B(this, i2, i6);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
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
    public final C0388z listIterator(int i2) {
        AbstractC0325d1.u(i2, size());
        return isEmpty() ? f5030b : new C0388z(this, i2);
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
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }
}
