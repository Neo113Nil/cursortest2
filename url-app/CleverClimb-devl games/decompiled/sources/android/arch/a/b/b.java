package android.arch.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a, reason: collision with root package name */
    private c<K, V> f1325a;

    /* renamed from: b, reason: collision with root package name */
    private c<K, V> f1326b;

    /* renamed from: c, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f1327c = new WeakHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private int f1328d = 0;

    /* compiled from: SafeIterableMap.java */
    interface f<K, V> {
        void a_(c<K, V> cVar);
    }

    protected c<K, V> a(K k) {
        c<K, V> cVar = this.f1325a;
        while (cVar != null && !cVar.f1329a.equals(k)) {
            cVar = cVar.f1331c;
        }
        return cVar;
    }

    public V a(K k, V v) {
        c<K, V> a2 = a((b<K, V>) k);
        if (a2 != null) {
            return a2.f1330b;
        }
        b(k, v);
        return null;
    }

    protected c<K, V> b(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f1328d++;
        if (this.f1326b == null) {
            this.f1325a = cVar;
            this.f1326b = this.f1325a;
            return cVar;
        }
        this.f1326b.f1331c = cVar;
        cVar.f1332d = this.f1326b;
        this.f1326b = cVar;
        return cVar;
    }

    public V b(K k) {
        c<K, V> a2 = a((b<K, V>) k);
        if (a2 == null) {
            return null;
        }
        this.f1328d--;
        if (!this.f1327c.isEmpty()) {
            Iterator<f<K, V>> it = this.f1327c.keySet().iterator();
            while (it.hasNext()) {
                it.next().a_(a2);
            }
        }
        if (a2.f1332d != null) {
            a2.f1332d.f1331c = a2.f1331c;
        } else {
            this.f1325a = a2.f1331c;
        }
        if (a2.f1331c != null) {
            a2.f1331c.f1332d = a2.f1332d;
        } else {
            this.f1326b = a2.f1332d;
        }
        a2.f1331c = null;
        a2.f1332d = null;
        return a2.f1330b;
    }

    public int a() {
        return this.f1328d;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f1325a, this.f1326b);
        this.f1327c.put(aVar, false);
        return aVar;
    }

    public Iterator<Map.Entry<K, V>> b() {
        C0000b c0000b = new C0000b(this.f1326b, this.f1325a);
        this.f1327c.put(c0000b, false);
        return c0000b;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f1327c.put(dVar, false);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f1325a;
    }

    public Map.Entry<K, V> e() {
        return this.f1326b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (a() != bVar.a()) {
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

    /* compiled from: SafeIterableMap.java */
    private static abstract class e<K, V> implements f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        c<K, V> f1336a;

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f1337b;

        abstract c<K, V> a(c<K, V> cVar);

        abstract c<K, V> b(c<K, V> cVar);

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f1336a = cVar2;
            this.f1337b = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1337b != null;
        }

        @Override // android.arch.a.b.b.f
        public void a_(c<K, V> cVar) {
            if (this.f1336a == cVar && cVar == this.f1337b) {
                this.f1337b = null;
                this.f1336a = null;
            }
            if (this.f1336a == cVar) {
                this.f1336a = b(this.f1336a);
            }
            if (this.f1337b == cVar) {
                this.f1337b = b();
            }
        }

        private c<K, V> b() {
            if (this.f1337b == this.f1336a || this.f1336a == null) {
                return null;
            }
            return a(this.f1337b);
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f1337b;
            this.f1337b = b();
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap.java */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.a.b.b.e
        c<K, V> a(c<K, V> cVar) {
            return cVar.f1331c;
        }

        @Override // android.arch.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f1332d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: android.arch.a.b.b$b, reason: collision with other inner class name */
    private static class C0000b<K, V> extends e<K, V> {
        C0000b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.a.b.b.e
        c<K, V> a(c<K, V> cVar) {
            return cVar.f1332d;
        }

        @Override // android.arch.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f1331c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    public class d implements f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private c<K, V> f1334b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1335c;

        private d() {
            this.f1335c = true;
        }

        @Override // android.arch.a.b.b.f
        public void a_(c<K, V> cVar) {
            if (cVar == this.f1334b) {
                this.f1334b = this.f1334b.f1332d;
                this.f1335c = this.f1334b == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1335c ? b.this.f1325a != null : (this.f1334b == null || this.f1334b.f1331c == null) ? false : true;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f1335c) {
                this.f1335c = false;
                this.f1334b = b.this.f1325a;
            } else {
                this.f1334b = this.f1334b != null ? this.f1334b.f1331c : null;
            }
            return this.f1334b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        final K f1329a;

        /* renamed from: b, reason: collision with root package name */
        final V f1330b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f1331c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f1332d;

        c(K k, V v) {
            this.f1329a = k;
            this.f1330b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1329a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1330b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1329a + "=" + this.f1330b;
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
            return this.f1329a.equals(cVar.f1329a) && this.f1330b.equals(cVar.f1330b);
        }
    }
}
