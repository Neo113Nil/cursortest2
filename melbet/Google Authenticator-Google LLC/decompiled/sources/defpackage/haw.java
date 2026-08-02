package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class haw extends haz implements NavigableMap {
    final /* synthetic */ hbg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haw(hbg hbgVar, NavigableMap navigableMap) {
        super(hbgVar, navigableMap);
        this.c = hbgVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection, java.util.List] */
    final Map.Entry c(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ?? a = this.c.a();
        a.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), DesugarCollections.unmodifiableList(a));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = h().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return h().ceilingKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.haz
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableMap h() {
        return (NavigableMap) super.h();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((haw) descendingMap()).keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new haw(this.c, h().descendingMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.haz
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final NavigableSet g() {
        return new hax(this.c, h());
    }

    @Override // defpackage.haz, defpackage.has, defpackage.hhr, java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = h().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = h().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return h().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new haw(this.c, h().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = h().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return h().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = h().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = h().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return h().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return c(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return c(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new haw(this.c, h().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new haw(this.c, h().tailMap(obj, z));
    }

    @Override // defpackage.haz, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // defpackage.haz, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.haz, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
