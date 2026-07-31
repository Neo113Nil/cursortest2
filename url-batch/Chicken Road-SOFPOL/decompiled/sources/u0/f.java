package u0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m0.r1;
import m0.w2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends AbstractMap implements Map, r6.c {

    /* renamed from: d, reason: collision with root package name */
    public t0.b f7146d = new t0.b();

    /* renamed from: e, reason: collision with root package name */
    public r0.j f7147e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7148f;

    /* renamed from: g, reason: collision with root package name */
    public int f7149g;

    /* renamed from: h, reason: collision with root package name */
    public int f7150h;
    public g i;

    public f(g gVar) {
        this.f7147e = gVar.f6474d;
        this.f7150h = gVar.f6475e;
        this.i = gVar;
    }

    public final g a() {
        r0.j jVar = this.f7147e;
        g gVar = this.i;
        if (jVar != gVar.f6474d) {
            this.f7146d = new t0.b();
            gVar = new g(this.f7147e, this.f7150h);
        }
        this.i = gVar;
        return gVar;
    }

    public final boolean b(Object obj) {
        return this.f7147e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.f7147e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f7147e = r0.j.f6488e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof r1) {
            return b((r1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof w2) {
            return super.containsValue((w2) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.f7148f = null;
        r0.j n6 = this.f7147e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n6 == null) {
            n6 = r0.j.f6488e;
        }
        this.f7147e = n6;
        return this.f7148f;
    }

    public final void e(int i) {
        this.f7150h = i;
        this.f7149g++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new r0.e(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof r1) {
            return (w2) c((r1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof r1) ? obj2 : (w2) super.getOrDefault((r1) obj, (w2) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new r0.e(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f7148f = null;
        this.f7147e = this.f7147e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f7148f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [r0.b] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g gVar = null;
        g gVar2 = map instanceof r0.b ? (r0.b) map : null;
        if (gVar2 == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                gVar = fVar.a();
            }
        } else {
            gVar = gVar2;
        }
        if (gVar == null) {
            super.putAll(map);
            return;
        }
        t0.a aVar = new t0.a();
        aVar.f6893a = 0;
        int i = this.f7150h;
        r0.j jVar = this.f7147e;
        r0.j jVar2 = gVar.f6474d;
        q6.i.c(jVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f7147e = jVar.m(jVar2, 0, aVar, this);
        int i8 = (gVar.f6475e + i) - aVar.f6893a;
        if (i != i8) {
            e(i8);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f7150h;
        r0.j o2 = this.f7147e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o2 == null) {
            o2 = r0.j.f6488e;
        }
        this.f7147e = o2;
        return i != this.f7150h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f7150h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new e6.h(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof r1) {
            return (w2) d((r1) obj);
        }
        return null;
    }
}
