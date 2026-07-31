package m4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
abstract class f<K, V> implements z<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private transient Set<K> f19145f;

    /* renamed from: g, reason: collision with root package name */
    private transient Collection<V> f19146g;

    /* renamed from: h, reason: collision with root package name */
    private transient Map<K, Collection<V>> f19147h;

    class a extends AbstractCollection<V> {
        a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    f() {
    }

    @Override // m4.z
    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f19147h;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c7 = c();
        this.f19147h = c7;
        return c7;
    }

    public boolean b(Object obj) {
        Iterator<Collection<V>> it = a().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> c();

    abstract Set<K> d();

    abstract Collection<V> e();

    public boolean equals(Object obj) {
        return c0.a(this, obj);
    }

    public Set<K> f() {
        Set<K> set = this.f19145f;
        if (set != null) {
            return set;
        }
        Set<K> d7 = d();
        this.f19145f = d7;
        return d7;
    }

    abstract Iterator<V> g();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override // m4.z
    public Collection<V> values() {
        Collection<V> collection = this.f19146g;
        if (collection != null) {
            return collection;
        }
        Collection<V> e7 = e();
        this.f19146g = e7;
        return e7;
    }
}
