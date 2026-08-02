package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
class haz extends has implements SortedMap {
    SortedSet d;
    final /* synthetic */ hbg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haz(hbg hbgVar, SortedMap sortedMap) {
        super(hbgVar, sortedMap);
        this.e = hbgVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new haz(this.e, h().headMap(obj));
    }

    @Override // defpackage.hhr
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public SortedSet g() {
        return new hba(this.e, h());
    }

    @Override // defpackage.has, defpackage.hhr, java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet g = g();
        this.d = g;
        return g;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new haz(this.e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new haz(this.e, h().tailMap(obj));
    }
}
