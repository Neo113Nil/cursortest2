package v2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: v2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1462i extends C1457d implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f15644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f15645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1462i(W w4, SortedMap sortedMap) {
        super(w4, sortedMap);
        this.f15645f = w4;
    }

    public SortedSet b() {
        return new C1463j(this.f15645f, d());
    }

    @Override // v2.C1457d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f15644e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b4 = b();
        this.f15644e = b4;
        return b4;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f15619c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C1462i(this.f15645f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C1462i(this.f15645f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C1462i(this.f15645f, d().tailMap(obj));
    }
}
