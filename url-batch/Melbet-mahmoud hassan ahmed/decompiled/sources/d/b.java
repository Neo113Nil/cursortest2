package d;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f, reason: collision with root package name */
    c<K, V> f15434f;

    /* renamed from: g, reason: collision with root package name */
    private c<K, V> f15435g;

    /* renamed from: h, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f15436h = new WeakHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private int f15437i = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // d.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f15441i;
        }

        @Override // d.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f15440h;
        }
    }

    /* renamed from: d.b$b, reason: collision with other inner class name */
    private static class C0050b<K, V> extends e<K, V> {
        C0050b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // d.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f15440h;
        }

        @Override // d.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f15441i;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f, reason: collision with root package name */
        final K f15438f;

        /* renamed from: g, reason: collision with root package name */
        final V f15439g;

        /* renamed from: h, reason: collision with root package name */
        c<K, V> f15440h;

        /* renamed from: i, reason: collision with root package name */
        c<K, V> f15441i;

        c(K k7, V v6) {
            this.f15438f = k7;
            this.f15439g = v6;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f15438f.equals(cVar.f15438f) && this.f15439g.equals(cVar.f15439g);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f15438f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f15439g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f15438f.hashCode() ^ this.f15439g.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v6) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f15438f + "=" + this.f15439g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private c<K, V> f15442f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f15443g = true;

        d() {
        }

        @Override // d.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f15442f;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f15441i;
                this.f15442f = cVar3;
                this.f15443g = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f15443g) {
                this.f15443g = false;
                cVar = b.this.f15434f;
            } else {
                c<K, V> cVar2 = this.f15442f;
                cVar = cVar2 != null ? cVar2.f15440h : null;
            }
            this.f15442f = cVar;
            return this.f15442f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f15443g) {
                return b.this.f15434f != null;
            }
            c<K, V> cVar = this.f15442f;
            return (cVar == null || cVar.f15440h == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: f, reason: collision with root package name */
        c<K, V> f15445f;

        /* renamed from: g, reason: collision with root package name */
        c<K, V> f15446g;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f15445f = cVar2;
            this.f15446g = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f15446g;
            c<K, V> cVar2 = this.f15445f;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // d.b.f
        public void a(c<K, V> cVar) {
            if (this.f15445f == cVar && cVar == this.f15446g) {
                this.f15446g = null;
                this.f15445f = null;
            }
            c<K, V> cVar2 = this.f15445f;
            if (cVar2 == cVar) {
                this.f15445f = b(cVar2);
            }
            if (this.f15446g == cVar) {
                this.f15446g = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f15446g;
            this.f15446g = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15446g != null;
        }
    }

    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0050b c0050b = new C0050b(this.f15435g, this.f15434f);
        this.f15436h.put(c0050b, Boolean.FALSE);
        return c0050b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += it.next().hashCode();
        }
        return i7;
    }

    public Map.Entry<K, V> i() {
        return this.f15434f;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f15434f, this.f15435g);
        this.f15436h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    protected c<K, V> j(K k7) {
        c<K, V> cVar = this.f15434f;
        while (cVar != null && !cVar.f15438f.equals(k7)) {
            cVar = cVar.f15440h;
        }
        return cVar;
    }

    public b<K, V>.d k() {
        b<K, V>.d dVar = new d();
        this.f15436h.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> l() {
        return this.f15435g;
    }

    protected c<K, V> m(K k7, V v6) {
        c<K, V> cVar = new c<>(k7, v6);
        this.f15437i++;
        c<K, V> cVar2 = this.f15435g;
        if (cVar2 == null) {
            this.f15434f = cVar;
        } else {
            cVar2.f15440h = cVar;
            cVar.f15441i = cVar2;
        }
        this.f15435g = cVar;
        return cVar;
    }

    public V n(K k7, V v6) {
        c<K, V> j7 = j(k7);
        if (j7 != null) {
            return j7.f15439g;
        }
        m(k7, v6);
        return null;
    }

    public V o(K k7) {
        c<K, V> j7 = j(k7);
        if (j7 == null) {
            return null;
        }
        this.f15437i--;
        if (!this.f15436h.isEmpty()) {
            Iterator<f<K, V>> it = this.f15436h.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(j7);
            }
        }
        c<K, V> cVar = j7.f15441i;
        c<K, V> cVar2 = j7.f15440h;
        if (cVar != null) {
            cVar.f15440h = cVar2;
        } else {
            this.f15434f = cVar2;
        }
        c<K, V> cVar3 = j7.f15440h;
        if (cVar3 != null) {
            cVar3.f15441i = cVar;
        } else {
            this.f15435g = cVar;
        }
        j7.f15440h = null;
        j7.f15441i = null;
        return j7.f15439g;
    }

    public int size() {
        return this.f15437i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
