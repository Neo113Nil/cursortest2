package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class m0<K, V> implements Map<K, V>, k71 {
    public static final a o = new a(null);
    public volatile b12 m;
    public volatile o0 n;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract Set a();

    public Set b() {
        if (this.m == null) {
            this.m = new b12(this, 2);
        }
        b12 b12Var = this.m;
        b12Var.getClass();
        return b12Var;
    }

    public int c() {
        return ((b0) a()).a();
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
        Set a2 = a();
        if (a2.isEmpty()) {
            return false;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.b(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public Collection d() {
        if (this.n == null) {
            this.n = new o0(0, this);
        }
        o0 o0Var = this.n;
        o0Var.getClass();
        return o0Var;
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
            if (Intrinsics.b(((Map.Entry) obj2).getKey(), obj)) {
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
        Set<Map.Entry<K, V>> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v = get(key);
                if (Intrinsics.b(value, v) && (v != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry e = e(obj);
        if (e != null) {
            return e.getValue();
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
        return zv.A(a(), ", ", "{", "}", new a0(1, this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }
}
