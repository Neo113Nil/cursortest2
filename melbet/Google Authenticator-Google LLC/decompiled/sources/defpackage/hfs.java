package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hfs extends her implements NavigableMap, Map {
    public static final Comparator b;
    private static final hfs e;
    private static final long serialVersionUID = 0;
    public final transient hjc c;
    public final transient hel d;
    private final transient hfs f;

    static {
        hih hihVar = hih.a;
        b = hihVar;
        hjc C = hfv.C(hihVar);
        int i = hel.d;
        e = new hfs(C, his.a, null);
    }

    public hfs(hjc hjcVar, hel helVar, hfs hfsVar) {
        this.c = hjcVar;
        this.d = helVar;
        this.f = hfsVar;
    }

    public static hfs a(Comparator comparator) {
        if (hih.a.equals(comparator)) {
            return e;
        }
        hjc C = hfv.C(comparator);
        int i = hel.d;
        return new hfs(C, his.a, null);
    }

    public static hfs o(Comparator comparator, Object obj, Object obj2) {
        return new hfs(new hjc(hel.q(obj), comparator), hel.q(obj2), null);
    }

    private final hfs r(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return a(comparator());
        }
        return new hfs(this.c.G(i, i2), this.d.subList(i, i2), null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.her
    public final heb b() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.her
    /* renamed from: c */
    public final heb values() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return hnu.y(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((hfv) this.c).a;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableSet descendingKeySet() {
        return this.c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        hfs hfsVar = this.f;
        return hfsVar == null ? isEmpty() ? a(hin.d(comparator()).c()) : new hfs((hjc) this.c.descendingSet(), this.d.a(), this) : hfsVar;
    }

    @Override // defpackage.her
    public final boolean e() {
        return this.c.l() || this.d.l();
    }

    @Override // defpackage.her, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // defpackage.her
    public final hfm f() {
        return isEmpty() ? hjb.a : new hfp(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return hnu.y(floorEntry(obj));
    }

    @Override // defpackage.her
    public final hfm g() {
        throw new AssertionError("should never be called");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // defpackage.her, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        int binarySearch;
        hjc hjcVar = this.c;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(hjcVar.d, obj, hjcVar.a);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.d.get(binarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return hnu.y(higherEntry(obj));
    }

    @Override // defpackage.her, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.c;
    }

    @Override // defpackage.her
    /* renamed from: l */
    public final /* synthetic */ hfm keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().g().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return hnu.y(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final hfs headMap(Object obj, boolean z) {
        obj.getClass();
        return r(0, this.c.E(obj, z));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final hfs subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        hoq.F(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final hfs tailMap(Object obj, boolean z) {
        obj.getClass();
        return r(this.c.F(obj, z), size());
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // defpackage.her, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.d;
    }

    @Override // defpackage.her
    public Object writeReplace() {
        return new hfr(this);
    }
}
