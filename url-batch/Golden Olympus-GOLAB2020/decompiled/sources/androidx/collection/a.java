package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a extends g implements Map {

    /* renamed from: i, reason: collision with root package name */
    f f11012i;

    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    class C0082a extends f {
        C0082a() {
        }

        @Override // androidx.collection.f
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.f
        protected Object b(int i4, int i5) {
            return a.this.f11053c[(i4 << 1) + i5];
        }

        @Override // androidx.collection.f
        protected Map c() {
            return a.this;
        }

        @Override // androidx.collection.f
        protected int d() {
            return a.this.f11054d;
        }

        @Override // androidx.collection.f
        protected int e(Object obj) {
            return a.this.h(obj);
        }

        @Override // androidx.collection.f
        protected int f(Object obj) {
            return a.this.l(obj);
        }

        @Override // androidx.collection.f
        protected void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        @Override // androidx.collection.f
        protected void h(int i4) {
            a.this.o(i4);
        }

        @Override // androidx.collection.f
        protected Object i(int i4, Object obj) {
            return a.this.p(i4, obj);
        }
    }

    public a() {
    }

    private f r() {
        if (this.f11012i == null) {
            this.f11012i = new C0082a();
        }
        return this.f11012i;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return r().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return r().m();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        e(this.f11054d + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean s(Collection collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public Collection values() {
        return r().n();
    }

    public a(int i4) {
        super(i4);
    }

    public a(g gVar) {
        super(gVar);
    }
}
