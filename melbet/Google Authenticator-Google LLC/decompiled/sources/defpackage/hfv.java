package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class hfv extends hfm implements NavigableSet, SortedSet, hjo {
    private static final long serialVersionUID = 912559;
    final transient Comparator a;
    transient hfv b;

    public hfv(Comparator comparator) {
        this.a = comparator;
    }

    static hjc C(Comparator comparator) {
        if (hih.a.equals(comparator)) {
            return hjc.c;
        }
        int i = hel.d;
        return new hjc(his.a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final hfv tailSet(Object obj, boolean z) {
        obj.getClass();
        return B(obj, z);
    }

    public abstract hfv B(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public abstract hjr descendingIterator();

    final int a(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return hnu.ab(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.hjo
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return hnu.Q(headSet(obj, true).descendingIterator());
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return hnu.ab(tailSet(obj, false));
    }

    @Override // defpackage.hfm, defpackage.heb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract hjr iterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return hnu.Q(headSet(obj, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public abstract hfv u();

    @Override // java.util.NavigableSet
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final hfv descendingSet() {
        hfv hfvVar = this.b;
        if (hfvVar != null) {
            return hfvVar;
        }
        hfv u = u();
        this.b = u;
        u.b = this;
        return u;
    }

    @Override // java.util.NavigableSet
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final hfv headSet(Object obj, boolean z) {
        obj.getClass();
        return x(obj, z);
    }

    @Override // defpackage.hfm, defpackage.heb
    public Object writeReplace() {
        return new hfu(this.a, toArray());
    }

    public abstract hfv x(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final hfv subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        hoq.x(this.a.compare(obj, obj2) <= 0);
        return z(obj, z, obj2, z2);
    }

    public abstract hfv z(Object obj, boolean z, Object obj2, boolean z2);
}
