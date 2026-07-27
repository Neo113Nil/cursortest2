package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class Z extends I {

    /* renamed from: f, reason: collision with root package name */
    public static final Z f5145f;

    /* renamed from: e, reason: collision with root package name */
    public final transient C f5146e;

    static {
        C0388z c0388z = C.f5030b;
        f5145f = new Z(S.f5100e, M.f5078a);
    }

    public Z(C c2, Comparator comparator) {
        super(comparator);
        this.f5146e = c2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int b(Object[] objArr) {
        return this.f5146e.b(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int c() {
        return this.f5146e.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int l2 = l(obj, true);
        C c2 = this.f5146e;
        if (l2 == c2.size()) {
            return null;
        }
        return c2.get(l2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f5146e, obj, this.f5061c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f5061c;
        if (!AbstractC0325d1.l(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C0388z listIterator = this.f5146e.listIterator(0);
        Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = listIterator.next();
        while (true) {
            try {
                int compare = comparator.compare(next2, next);
                if (compare >= 0) {
                    if (compare != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int d() {
        return this.f5146e.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f5146e.h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0382x
    public final C e() {
        return this.f5146e;
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C c2 = this.f5146e;
        if (c2.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.f5061c;
        if (!AbstractC0325d1.l(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            C0388z listIterator = c2.listIterator(0);
            while (listIterator.hasNext()) {
                Object next = listIterator.next();
                Object next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.I, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f5146e.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int k3 = k(obj, true) - 1;
        if (k3 == -1) {
            return null;
        }
        return this.f5146e.get(k3);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final Object[] g() {
        return this.f5146e.g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int l2 = l(obj, false);
        C c2 = this.f5146e;
        if (l2 == c2.size()) {
            return null;
        }
        return c2.get(l2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f5146e.listIterator(0);
    }

    public final int k(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f5146e, obj, this.f5061c);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int l(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f5146e, obj, this.f5061c);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    @Override // com.google.android.gms.internal.play_billing.I, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f5146e.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int k3 = k(obj, false) - 1;
        if (k3 == -1) {
            return null;
        }
        return this.f5146e.get(k3);
    }

    public final Z m(int i2, int i3) {
        C c2 = this.f5146e;
        if (i2 == 0) {
            if (i3 == c2.size()) {
                return this;
            }
            i2 = 0;
        }
        Comparator comparator = this.f5061c;
        if (i2 < i3) {
            return new Z(c2.subList(i2, i3), comparator);
        }
        if (M.f5078a.equals(comparator)) {
            return f5145f;
        }
        C0388z c0388z = C.f5030b;
        return new Z(S.f5100e, comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5146e.size();
    }
}
