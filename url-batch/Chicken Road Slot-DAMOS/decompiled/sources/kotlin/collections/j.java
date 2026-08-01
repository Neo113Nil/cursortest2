package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j implements Map, xd.a {

    /* renamed from: i, reason: collision with root package name */
    public static final g f5571i = new g(null);

    /* renamed from: d, reason: collision with root package name */
    public volatile u0.g f5572d;

    /* renamed from: e, reason: collision with root package name */
    public volatile i f5573e;

    public abstract Set a();

    public Set b() {
        if (this.f5572d == null) {
            this.f5572d = new u0.g(this, 2);
        }
        u0.g gVar = this.f5572d;
        gVar.getClass();
        return gVar;
    }

    public int c() {
        return ((a) a()).b();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set a9 = a();
        if (a9.isEmpty()) {
            return false;
        }
        Iterator it = a9.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection d() {
        if (this.f5573e == null) {
            this.f5573e = new i(0, this);
        }
        i iVar = this.f5573e;
        iVar.getClass();
        return iVar;
    }

    public final Map.Entry e(Object obj) {
        Object obj2;
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.a(((Map.Entry) obj2).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (c() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (Intrinsics.a(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry e2 = e(obj);
        if (e2 != null) {
            return e2.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    public final String toString() {
        return CollectionsKt.B(a(), ", ", "{", "}", new a1.d(6, this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
