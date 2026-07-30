package o0;

import f6.i;
import g0.m1;
import g0.p2;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import l0.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends AbstractMap implements Map, s6.e {

    /* renamed from: f, reason: collision with root package name */
    public n0.b f6816f = new n0.b();

    /* renamed from: g, reason: collision with root package name */
    public k f6817g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6818h;

    /* renamed from: i, reason: collision with root package name */
    public int f6819i;

    /* renamed from: j, reason: collision with root package name */
    public int f6820j;

    /* renamed from: k, reason: collision with root package name */
    public d f6821k;

    public c(d dVar) {
        this.f6817g = dVar.f5747f;
        this.f6820j = dVar.f5748g;
        this.f6821k = dVar;
    }

    public final d a() {
        k kVar = this.f6817g;
        d dVar = this.f6821k;
        if (kVar != dVar.f5747f) {
            this.f6816f = new n0.b();
            dVar = new d(this.f6817g, this.f6820j);
        }
        this.f6821k = dVar;
        return dVar;
    }

    public final boolean b(Object obj) {
        return this.f6817g.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f6817g.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f6817g = k.f5761e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof m1) {
            return b((m1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof p2) {
            return super.containsValue((p2) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f6818h = null;
        k n8 = this.f6817g.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n8 == null) {
            n8 = k.f5761e;
        }
        this.f6817g = n8;
        return this.f6818h;
    }

    public final void e(int i7) {
        this.f6820j = i7;
        this.f6819i++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new l0.f(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof m1) {
            return (p2) c((m1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof m1) ? obj2 : (p2) super.getOrDefault((m1) obj, (p2) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new l0.f(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f6818h = null;
        this.f6817g = this.f6817g.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f6818h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [l0.c] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        d dVar = null;
        d dVar2 = map instanceof l0.c ? (l0.c) map : null;
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
        n0.a aVar = new n0.a();
        aVar.f6496a = 0;
        int i7 = this.f6820j;
        k kVar = this.f6817g;
        k kVar2 = dVar.f5747f;
        r6.k.d(kVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f6817g = kVar.m(kVar2, 0, aVar, this);
        int i8 = (dVar.f5748g + i7) - aVar.f6496a;
        if (i7 != i8) {
            e(i8);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i7 = this.f6820j;
        k o2 = this.f6817g.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o2 == null) {
            o2 = k.f5761e;
        }
        this.f6817g = o2;
        return i7 != this.f6820j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f6820j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof m1) {
            return (p2) d((m1) obj);
        }
        return null;
    }
}
