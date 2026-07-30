package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gi1 implements Map, k71 {
    public final tn1 m;
    public ci0 n;
    public ci0 o;
    public iq2 p;

    public gi1(tn1 tn1Var) {
        tn1Var.getClass();
        this.m = tn1Var;
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
        return this.m.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.m.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ci0 ci0Var = this.n;
        if (ci0Var != null) {
            return ci0Var;
        }
        ci0 ci0Var2 = new ci0(this.m, 0);
        this.n = ci0Var2;
        return ci0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gi1.class != obj.getClass()) {
            return false;
        }
        return Intrinsics.b(this.m, ((gi1) obj).m);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.m.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.m.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        ci0 ci0Var = this.o;
        if (ci0Var != null) {
            return ci0Var;
        }
        ci0 ci0Var2 = new ci0(this.m, 1);
        this.o = ci0Var2;
        return ci0Var2;
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
        return this.m.e;
    }

    public final String toString() {
        return this.m.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        iq2 iq2Var = this.p;
        if (iq2Var != null) {
            return iq2Var;
        }
        iq2 iq2Var2 = new iq2(this.m);
        this.p = iq2Var2;
        return iq2Var2;
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
