package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class I extends H implements NavigableSet, InterfaceC0318b0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Comparator f5061c;

    /* renamed from: d, reason: collision with root package name */
    public transient I f5062d;

    public I(Comparator comparator) {
        this.f5061c = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f5061c;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        I i2 = this.f5062d;
        if (i2 == null) {
            Z z = (Z) this;
            Comparator reverseOrder = Collections.reverseOrder(z.f5061c);
            if (!z.isEmpty()) {
                i2 = new Z(z.f5146e.h(), reverseOrder);
            } else if (M.f5078a.equals(reverseOrder)) {
                i2 = Z.f5145f;
            } else {
                C0388z c0388z = C.f5030b;
                i2 = new Z(S.f5100e, reverseOrder);
            }
            this.f5062d = i2;
            i2.f5062d = this;
        }
        return i2;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        Z z = (Z) this;
        return z.m(0, z.k(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z5) {
        obj.getClass();
        obj2.getClass();
        if (this.f5061c.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        Z z6 = (Z) this;
        Z m6 = z6.m(z6.l(obj, z), z6.f5146e.size());
        return m6.m(0, m6.k(obj2, z5));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        Z z = (Z) this;
        return z.m(z.l(obj, true), z.f5146e.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        Z z5 = (Z) this;
        return z5.m(0, z5.k(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        Z z5 = (Z) this;
        return z5.m(z5.l(obj, z), z5.f5146e.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f5061c.compare(obj, obj2) <= 0) {
            Z z = (Z) this;
            Z m6 = z.m(z.l(obj, true), z.f5146e.size());
            return m6.m(0, m6.k(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
