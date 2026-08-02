package v2;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: v2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1463j extends C1458e implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f15647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463j(W w4, SortedMap sortedMap) {
        super(w4, sortedMap);
        this.f15647c = w4;
    }

    public SortedMap b() {
        return (SortedMap) this.f15623a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C1463j(this.f15647c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C1463j(this.f15647c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C1463j(this.f15647c, b().tailMap(obj));
    }
}
