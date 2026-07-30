package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v41 implements Map, fu0 {
    public h60 OPXfSBeufaJ8;
    public ib2 dgRBjINgWbAK;
    public final v81 rtx2ld2ELZv4;
    public h60 wdg6QnbFHrFF;

    public v41(v81 v81Var) {
        v81Var.getClass();
        this.rtx2ld2ELZv4 = v81Var;
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
        return this.rtx2ld2ELZv4.TSizfFm2Yiuu(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.rtx2ld2ELZv4.Y1f8riQaR6yg(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h60 h60Var = this.OPXfSBeufaJ8;
        if (h60Var != null) {
            return h60Var;
        }
        h60 h60Var2 = new h60(this.rtx2ld2ELZv4, 0);
        this.OPXfSBeufaJ8 = h60Var2;
        return h60Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v41.class != obj.getClass()) {
            return false;
        }
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, ((v41) obj).rtx2ld2ELZv4);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.rtx2ld2ELZv4.RAsUl2FVSrh6(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.rtx2ld2ELZv4.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.rtx2ld2ELZv4.OPXfSBeufaJ8();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h60 h60Var = this.wdg6QnbFHrFF;
        if (h60Var != null) {
            return h60Var;
        }
        h60 h60Var2 = new h60(this.rtx2ld2ELZv4, 1);
        this.wdg6QnbFHrFF = h60Var2;
        return h60Var2;
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
        return this.rtx2ld2ELZv4.e9gEMXR7LXtO;
    }

    public final String toString() {
        return this.rtx2ld2ELZv4.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ib2 ib2Var = this.dgRBjINgWbAK;
        if (ib2Var != null) {
            return ib2Var;
        }
        ib2 ib2Var2 = new ib2(this.rtx2ld2ELZv4);
        this.dgRBjINgWbAK = ib2Var2;
        return ib2Var2;
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
