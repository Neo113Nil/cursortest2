package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class I extends H implements NavigableSet, InterfaceC0206a0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Comparator f2744c;

    /* renamed from: d, reason: collision with root package name */
    public transient I f2745d;

    public I(Comparator comparator) {
        this.f2744c = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f2744c;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        I i3 = this.f2745d;
        if (i3 == null) {
            Y y3 = (Y) this;
            Comparator reverseOrder = Collections.reverseOrder(y3.f2744c);
            if (!y3.isEmpty()) {
                i3 = new Y(y3.f2821e.h(), reverseOrder);
            } else if (M.f2761b.equals(reverseOrder)) {
                i3 = Y.f;
            } else {
                C0279z c0279z = C.f2714b;
                i3 = new Y(Q.f2774e, reverseOrder);
            }
            this.f2745d = i3;
            i3.f2745d = this;
        }
        return i3;
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
        Y y3 = (Y) this;
        return y3.m(0, y3.k(obj, false));
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
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.f2744c.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        Y y3 = (Y) this;
        Y m3 = y3.m(y3.l(obj, z), y3.f2821e.size());
        return m3.m(0, m3.k(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        Y y3 = (Y) this;
        return y3.m(y3.l(obj, true), y3.f2821e.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        Y y3 = (Y) this;
        return y3.m(0, y3.k(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        Y y3 = (Y) this;
        return y3.m(y3.l(obj, z), y3.f2821e.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f2744c.compare(obj, obj2) <= 0) {
            Y y3 = (Y) this;
            Y m3 = y3.m(y3.l(obj, true), y3.f2821e.size());
            return m3.m(0, m3.k(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
