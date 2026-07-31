package m4;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m4.p0;

/* loaded from: classes.dex */
public final class y {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    class a<K, V> extends r0<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m4.r0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class b implements l4.f<Map.Entry<?, ?>, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f19216f = new a("KEY", 0);

        /* renamed from: g, reason: collision with root package name */
        public static final b f19217g = new C0104b("VALUE", 1);

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ b[] f19218h = b();

        enum a extends b {
            a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // l4.f
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: m4.y$b$b, reason: collision with other inner class name */
        enum C0104b extends b {
            C0104b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // l4.f
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i7) {
        }

        /* synthetic */ b(String str, int i7, x xVar) {
            this(str, i7);
        }

        private static /* synthetic */ b[] b() {
            return new b[]{f19216f, f19217g};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f19218h.clone();
        }
    }

    static abstract class c<K, V> extends p0.d<Map.Entry<K, V>> {
        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        abstract Map<K, V> i();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // m4.p0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) l4.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                return p0.j(this, collection.iterator());
            }
        }

        @Override // m4.p0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) l4.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g7 = p0.g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        g7.add(((Map.Entry) obj).getKey());
                    }
                }
                return i().keySet().retainAll(g7);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().size();
        }
    }

    static class d<K, V> extends p0.d<K> {

        /* renamed from: f, reason: collision with root package name */
        final Map<K, V> f19219f;

        d(Map<K, V> map) {
            this.f19219f = (Map) l4.j.i(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return i().containsKey(obj);
        }

        Map<K, V> i() {
            return this.f19219f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i().size();
        }
    }

    static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: f, reason: collision with root package name */
        final Map<K, V> f19220f;

        e(Map<K, V> map) {
            this.f19220f = (Map) l4.j.i(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            i().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return i().containsValue(obj);
        }

        final Map<K, V> i() {
            return this.f19220f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return i().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return y.k(i().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : i().entrySet()) {
                    if (l4.i.a(obj, entry.getValue())) {
                        i().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) l4.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f7 = p0.f();
                for (Map.Entry<K, V> entry : i().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f7.add(entry.getKey());
                    }
                }
                return i().keySet().removeAll(f7);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) l4.j.i(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f7 = p0.f();
                for (Map.Entry<K, V> entry : i().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f7.add(entry.getKey());
                    }
                }
                return i().keySet().retainAll(f7);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return i().size();
        }
    }

    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f19221f;

        /* renamed from: g, reason: collision with root package name */
        private transient Collection<V> f19222g;

        f() {
        }

        abstract Set<Map.Entry<K, V>> a();

        Collection<V> b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f19221f;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a7 = a();
            this.f19221f = a7;
            return a7;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f19222g;
            if (collection != null) {
                return collection;
            }
            Collection<V> b7 = b();
            this.f19222g = b7;
            return b7;
        }
    }

    static int a(int i7) {
        if (i7 < 3) {
            h.b(i7, "expectedSize");
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return u.d(k(map.entrySet().iterator()), obj);
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k7, V v6) {
        return new p(k7, v6);
    }

    public static <K, V> IdentityHashMap<K, V> e() {
        return new IdentityHashMap<>();
    }

    static boolean f(Map<?, ?> map, Object obj) {
        l4.j.i(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V g(Map<?, V> map, Object obj) {
        l4.j.i(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V h(Map<?, V> map, Object obj) {
        l4.j.i(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String i(Map<?, ?> map) {
        StringBuilder b7 = i.b(map.size());
        b7.append('{');
        boolean z6 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z6) {
                b7.append(", ");
            }
            z6 = false;
            b7.append(entry.getKey());
            b7.append('=');
            b7.append(entry.getValue());
        }
        b7.append('}');
        return b7.toString();
    }

    static <V> l4.f<Map.Entry<?, V>, V> j() {
        return b.f19217g;
    }

    static <K, V> Iterator<V> k(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
