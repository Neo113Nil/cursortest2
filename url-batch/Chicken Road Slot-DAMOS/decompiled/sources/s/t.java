package s;

import a2.b1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t implements Map, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final h0 f8377d;

    /* renamed from: e, reason: collision with root package name */
    public g f8378e;

    /* renamed from: i, reason: collision with root package name */
    public g f8379i;

    /* renamed from: r, reason: collision with root package name */
    public b1 f8380r;

    public t(h0 h0Var) {
        h0Var.getClass();
        this.f8377d = h0Var;
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
        return this.f8377d.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f8377d.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f8378e;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f8377d, 0);
        this.f8378e = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.a(this.f8377d, ((t) obj).f8377d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f8377d.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f8377d.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8377d.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f8379i;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this.f8377d, 1);
        this.f8379i = gVar2;
        return gVar2;
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
        return this.f8377d.f8316e;
    }

    public final String toString() {
        return this.f8377d.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        b1 b1Var = this.f8380r;
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1(this.f8377d);
        this.f8380r = b1Var2;
        return b1Var2;
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
