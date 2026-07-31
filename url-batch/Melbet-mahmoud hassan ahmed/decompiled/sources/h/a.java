package h;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends e<K, V> implements Map<K, V> {

    /* renamed from: m, reason: collision with root package name */
    d<K, V> f16684m;

    /* renamed from: h.a$a, reason: collision with other inner class name */
    class C0065a extends d<K, V> {
        C0065a() {
        }

        @Override // h.d
        protected void a() {
            a.this.clear();
        }

        @Override // h.d
        protected Object b(int i7, int i8) {
            return a.this.f16720g[(i7 << 1) + i8];
        }

        @Override // h.d
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // h.d
        protected int d() {
            return a.this.f16721h;
        }

        @Override // h.d
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // h.d
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // h.d
        protected void g(K k7, V v6) {
            a.this.put(k7, v6);
        }

        @Override // h.d
        protected void h(int i7) {
            a.this.k(i7);
        }

        @Override // h.d
        protected V i(int i7, V v6) {
            return a.this.l(i7, v6);
        }
    }

    public a() {
    }

    public a(int i7) {
        super(i7);
    }

    private d<K, V> n() {
        if (this.f16684m == null) {
            this.f16684m = new C0065a();
        }
        return this.f16684m;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return d.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f16721h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return n().n();
    }
}
