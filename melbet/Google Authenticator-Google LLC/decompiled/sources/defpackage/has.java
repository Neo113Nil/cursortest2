package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class has extends hhr {
    final transient Map a;
    final /* synthetic */ hbg b;

    public has(hbg hbgVar, Map map) {
        this.b = hbgVar;
        this.a = map;
    }

    final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return new AbstractMap.SimpleImmutableEntry(key, this.b.b(key, (Collection) entry.getValue()));
    }

    @Override // defpackage.hhr
    public final Set b() {
        return new haq(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        hbg hbgVar = this.b;
        if (map == hbgVar.a) {
            hbgVar.k();
        } else {
            hnu.M(new har(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) hnu.z(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.b(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.hhr, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.q();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        hbg hbgVar = this.b;
        Collection a = hbgVar.a();
        a.addAll(collection);
        hbgVar.b -= collection.size();
        collection.clear();
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
