package z2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* renamed from: z2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1423g<K, V> implements Map<K, V>, N2.a {

    /* renamed from: i, reason: collision with root package name */
    public static final a f11944i = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public volatile C1425i f11945d;

    /* renamed from: e, reason: collision with root package name */
    public volatile L.l f11946e;

    @Metadata
    /* renamed from: z2.g$a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract Set b();

    public Set c() {
        if (this.f11945d == null) {
            this.f11945d = new C1425i(this);
        }
        C1425i c1425i = this.f11945d;
        Intrinsics.c(c1425i);
        return c1425i;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set b4 = b();
        if (b4.isEmpty()) {
            return false;
        }
        Iterator it = b4.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public int d() {
        return ((AbstractC1418b) b()).e();
    }

    public Collection e() {
        if (this.f11946e == null) {
            this.f11946e = new L.l(this, 1);
        }
        L.l lVar = this.f11946e;
        Intrinsics.c(lVar);
        return lVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return b();
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
        if (d() != map.size()) {
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
                V v4 = get(key);
                if (Intrinsics.a(value, v4) && (v4 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    public final Map.Entry f(Object obj) {
        Object obj2;
        Iterator it = b().iterator();
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
    public Object get(Object obj) {
        Map.Entry f4 = f(obj);
        if (f4 != null) {
            return f4.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return d() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
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
        return d();
    }

    public final String toString() {
        return C1403G.w(b(), ", ", "{", "}", new C1426j(this), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return e();
    }
}
