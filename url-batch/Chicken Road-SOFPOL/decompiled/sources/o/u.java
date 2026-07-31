package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u implements Map, r6.a {

    /* renamed from: d, reason: collision with root package name */
    public final j0 f5543d;

    /* renamed from: e, reason: collision with root package name */
    public h f5544e;

    /* renamed from: f, reason: collision with root package name */
    public h f5545f;

    /* renamed from: g, reason: collision with root package name */
    public w0 f5546g;

    public u(j0 j0Var) {
        q6.i.e(j0Var, "parent");
        this.f5543d = j0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f5543d.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f5543d.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f5544e;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f5543d, 0);
        this.f5544e = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return q6.i.a(this.f5543d, ((u) obj).f5543d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f5543d.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f5543d.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5543d.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f5545f;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f5543d, 1);
        this.f5545f = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5543d.f5486e;
    }

    public final String toString() {
        return this.f5543d.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        w0 w0Var = this.f5546g;
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(this.f5543d);
        this.f5546g = w0Var2;
        return w0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
