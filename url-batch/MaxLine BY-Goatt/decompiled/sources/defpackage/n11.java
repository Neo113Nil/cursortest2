package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n11 implements Map, Serializable {
    public transient k82 m;
    public transient l82 n;
    public transient m82 o;

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p11 entrySet() {
        k82 k82Var = this.m;
        if (k82Var != null) {
            return k82Var;
        }
        n82 n82Var = (n82) this;
        k82 k82Var2 = new k82(n82Var, n82Var.q, n82Var.r);
        this.m = k82Var2;
        return k82Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        m82 m82Var = this.o;
        if (m82Var == null) {
            n82 n82Var = (n82) this;
            m82 m82Var2 = new m82(n82Var.q, 1, n82Var.r);
            this.o = m82Var2;
            m82Var = m82Var2;
        }
        return m82Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((n82) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        l82 l82Var = this.n;
        if (l82Var != null) {
            return l82Var;
        }
        n82 n82Var = (n82) this;
        l82 l82Var2 = new l82(n82Var, new m82(n82Var.q, 0, n82Var.r));
        this.n = l82Var2;
        return l82Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((n82) this).r;
        zm3.m(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        g23 it = ((k82) entrySet()).iterator();
        boolean z = true;
        while (true) {
            g11 g11Var = (g11) it;
            if (!g11Var.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) g11Var.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        m82 m82Var = this.o;
        if (m82Var != null) {
            return m82Var;
        }
        n82 n82Var = (n82) this;
        m82 m82Var2 = new m82(n82Var.q, 1, n82Var.r);
        this.o = m82Var2;
        return m82Var2;
    }

    public Object writeReplace() {
        return new m11(this);
    }
}
