package Q;

import I.AbstractC0168p0;
import I.Z0;
import N.i;
import N.m;
import f2.j;
import g2.InterfaceC0442d;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c extends AbstractMap implements Map, InterfaceC0442d {

    /* renamed from: d, reason: collision with root package name */
    public P.b f3948d = new P.b();

    /* renamed from: e, reason: collision with root package name */
    public m f3949e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3950f;

    /* renamed from: g, reason: collision with root package name */
    public int f3951g;

    /* renamed from: h, reason: collision with root package name */
    public int f3952h;

    /* renamed from: i, reason: collision with root package name */
    public d f3953i;

    public c(d dVar) {
        this.f3949e = dVar.f3503d;
        this.f3952h = dVar.f3504e;
        this.f3953i = dVar;
    }

    public final d a() {
        m mVar = this.f3949e;
        d dVar = this.f3953i;
        if (mVar != dVar.f3503d) {
            this.f3948d = new P.b();
            dVar = new d(this.f3949e, this.f3952h);
        }
        this.f3953i = dVar;
        return dVar;
    }

    public final boolean b(Object obj) {
        return this.f3949e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f3949e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3949e = m.f3521e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0168p0) {
            return b((AbstractC0168p0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Z0) {
            return super.containsValue((Z0) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f3950f = null;
        m n3 = this.f3949e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n3 == null) {
            n3 = m.f3521e;
        }
        this.f3949e = n3;
        return this.f3950f;
    }

    public final void e(int i3) {
        this.f3952h = i3;
        this.f3951g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new N.f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0168p0) {
            return (Z0) c((AbstractC0168p0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0168p0) ? obj2 : (Z0) super.getOrDefault((AbstractC0168p0) obj, (Z0) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new N.f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f3950f = null;
        this.f3949e = this.f3949e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f3950f;
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
        aVar.f3912a = 0;
        int i3 = this.f3952h;
        m mVar = this.f3949e;
        m mVar2 = dVar.f3503d;
        j.d(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f3949e = mVar.m(mVar2, 0, aVar, this);
        int i4 = (dVar.f3504e + i3) - aVar.f3912a;
        if (i3 != i4) {
            e(i4);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i3 = this.f3952h;
        m o3 = this.f3949e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o3 == null) {
            o3 = m.f3521e;
        }
        this.f3949e = o3;
        return i3 != this.f3952h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f3952h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof AbstractC0168p0) {
            return (Z0) d((AbstractC0168p0) obj);
        }
        return null;
    }
}
