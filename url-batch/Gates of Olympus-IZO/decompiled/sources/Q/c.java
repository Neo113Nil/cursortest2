package Q;

import I.AbstractC0114p0;
import I.a1;
import N.m;
import Z1.i;
import a2.InterfaceC0187d;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c extends AbstractMap implements Map, InterfaceC0187d {

    /* renamed from: d, reason: collision with root package name */
    public P.b f3082d = new P.b();

    /* renamed from: e, reason: collision with root package name */
    public m f3083e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3084f;

    /* renamed from: g, reason: collision with root package name */
    public int f3085g;

    /* renamed from: h, reason: collision with root package name */
    public int f3086h;

    /* renamed from: i, reason: collision with root package name */
    public d f3087i;

    public c(d dVar) {
        this.f3083e = dVar.f2821d;
        this.f3086h = dVar.f2822e;
        this.f3087i = dVar;
    }

    public final d a() {
        m mVar = this.f3083e;
        d dVar = this.f3087i;
        if (mVar != dVar.f2821d) {
            this.f3082d = new P.b();
            dVar = new d(this.f3083e, this.f3086h);
        }
        this.f3087i = dVar;
        return dVar;
    }

    public final boolean b(Object obj) {
        return this.f3083e.d(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final Object c(Object obj) {
        return this.f3083e.g(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3083e = m.f2839e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0114p0) {
            return b((AbstractC0114p0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof a1) {
            return super.containsValue((a1) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f3084f = null;
        m n3 = this.f3083e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n3 == null) {
            n3 = m.f2839e;
        }
        this.f3083e = n3;
        return this.f3084f;
    }

    public final void e(int i3) {
        this.f3086h = i3;
        this.f3085g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new N.f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0114p0) {
            return (a1) c((AbstractC0114p0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0114p0) ? obj2 : (a1) super.getOrDefault((AbstractC0114p0) obj, (a1) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new N.f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f3084f = null;
        this.f3083e = this.f3083e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f3084f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [N.c] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        d dVar = null;
        d dVar2 = map instanceof N.c ? (N.c) map : null;
        if (dVar2 == null) {
            c cVar = map instanceof c ? (c) map : null;
            if (cVar != null) {
                dVar = cVar.a();
            }
        } else {
            dVar = dVar2;
        }
        if (dVar == null) {
            super.putAll(map);
            return;
        }
        P.a aVar = new P.a();
        aVar.f3019a = 0;
        int i3 = this.f3086h;
        m mVar = this.f3083e;
        m mVar2 = dVar.f2821d;
        i.d(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f3083e = mVar.m(mVar2, 0, aVar, this);
        int i4 = (dVar.f2822e + i3) - aVar.f3019a;
        if (i3 != i4) {
            e(i4);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i3 = this.f3086h;
        m o3 = this.f3083e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o3 == null) {
            o3 = m.f2839e;
        }
        this.f3083e = o3;
        return i3 != this.f3086h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3086h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new N.i(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0114p0) {
            return (a1) d((AbstractC0114p0) obj);
        }
        return null;
    }
}
