package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
final class o53 extends r53 implements NavigableMap {

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ x53 f9521l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o53(x53 x53Var, NavigableMap navigableMap) {
        super(x53Var, navigableMap);
        this.f9521l = x53Var;
    }

    @Override // com.google.android.gms.internal.ads.r53
    final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.f6980h);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f6980h)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return b(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6980h)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new o53(this.f9521l, ((NavigableMap) ((SortedMap) this.f6980h)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.r53
    /* renamed from: e */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    final Map.Entry f(Iterator<Map.Entry> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry next = it.next();
        Collection i7 = this.f9521l.i();
        i7.addAll((Collection) next.getValue());
        it.remove();
        return new a73(next.getKey(), this.f9521l.j(i7));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f6980h)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return b(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f6980h)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return b(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6980h)).floorKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.r53
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableSet d() {
        return new p53(this.f9521l, (NavigableMap) ((SortedMap) this.f6980h));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z6) {
        return new o53(this.f9521l, ((NavigableMap) ((SortedMap) this.f6980h)).headMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.r53, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f6980h)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return b(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6980h)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.r53, com.google.android.gms.internal.ads.j53, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f6980h)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return b(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f6980h)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return b(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f6980h)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return f(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return f(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z6, Object obj2, boolean z7) {
        return new o53(this.f9521l, ((NavigableMap) ((SortedMap) this.f6980h)).subMap(obj, z6, obj2, z7));
    }

    @Override // com.google.android.gms.internal.ads.r53, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z6) {
        return new o53(this.f9521l, ((NavigableMap) ((SortedMap) this.f6980h)).tailMap(obj, z6));
    }

    @Override // com.google.android.gms.internal.ads.r53, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
