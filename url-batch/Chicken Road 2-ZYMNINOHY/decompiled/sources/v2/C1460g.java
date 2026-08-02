package v2;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: v2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1460g extends C1463j implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f15636d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1460g(W w4, NavigableMap navigableMap) {
        super(w4, navigableMap);
        this.f15636d = w4;
    }

    @Override // v2.C1463j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f15623a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C1458e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C1460g(this.f15636d, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // v2.C1463j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C1456c c1456c = (C1456c) iterator();
        if (!c1456c.hasNext()) {
            return null;
        }
        Object next = c1456c.next();
        c1456c.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // v2.C1463j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // v2.C1463j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new C1460g(this.f15636d, b().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z4) {
        return new C1460g(this.f15636d, b().subMap(obj, z, obj2, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C1460g(this.f15636d, b().tailMap(obj, z));
    }
}
