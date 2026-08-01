package b8;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k extends i implements NavigableSet, Iterable {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f1430t = 0;

    /* renamed from: r, reason: collision with root package name */
    public final transient Comparator f1431r;

    /* renamed from: s, reason: collision with root package name */
    public transient k f1432s;

    public k(Comparator comparator) {
        this.f1431r = comparator;
    }

    public static z o(Comparator comparator) {
        return q.f1439d.equals(comparator) ? z.f1466v : new z(s.f1440s, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f1431r;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        k kVar = this.f1432s;
        if (kVar == null) {
            z zVar = (z) this;
            Comparator reverseOrder = Collections.reverseOrder(zVar.f1431r);
            kVar = zVar.isEmpty() ? o(reverseOrder) : new z(zVar.f1467u.p(), reverseOrder);
            this.f1432s = kVar;
            kVar.f1432s = this;
        }
        return kVar;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.q(0, zVar.r(obj, z10));
    }

    @Override // java.util.NavigableSet
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final z subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        i7.a.t(this.f1431r.compare(obj, obj2) <= 0);
        z zVar = (z) this;
        z q3 = zVar.q(zVar.s(obj, z10), zVar.f1467u.size());
        return q3.q(0, q3.r(obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.q(zVar.s(obj, true), zVar.f1467u.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.q(0, zVar.r(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        z zVar = (z) this;
        return zVar.q(zVar.s(obj, z10), zVar.f1467u.size());
    }
}
