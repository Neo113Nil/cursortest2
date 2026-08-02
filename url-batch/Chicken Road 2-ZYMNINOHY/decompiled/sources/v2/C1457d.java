package v2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: v2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1457d extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient C1455b f15617a;

    /* renamed from: b, reason: collision with root package name */
    public transient C1467n f15618b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f15619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f15620d;

    public C1457d(W w4, Map map) {
        this.f15620d = w4;
        this.f15619c = map;
    }

    public final E a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        W w4 = this.f15620d;
        return new E(key, z ? new C1461h(w4, key, list, null) : new C1465l(w4, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        W w4 = this.f15620d;
        if (this.f15619c == w4.f15594d) {
            w4.f();
            return;
        }
        C1456c c1456c = new C1456c(this);
        while (c1456c.hasNext()) {
            c1456c.next();
            c1456c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f15619c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1455b c1455b = this.f15617a;
        if (c1455b != null) {
            return c1455b;
        }
        C1455b c1455b2 = new C1455b(this);
        this.f15617a = c1455b2;
        return c1455b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f15619c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f15619c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        W w4 = this.f15620d;
        return z ? new C1461h(w4, obj, list, null) : new C1465l(w4, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f15619c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.f15620d.e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f15619c.remove(obj);
        if (collection == null) {
            return null;
        }
        W w4 = this.f15620d;
        Collection g4 = w4.g();
        g4.addAll(collection);
        w4.f15595e -= collection.size();
        collection.clear();
        return g4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f15619c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f15619c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C1467n c1467n = this.f15618b;
        if (c1467n != null) {
            return c1467n;
        }
        C1467n c1467n2 = new C1467n(this);
        this.f15618b = c1467n2;
        return c1467n2;
    }
}
