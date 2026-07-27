package L;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import z2.AbstractC1429m;

/* loaded from: classes.dex */
public class e extends AbstractC1429m implements J.d {

    /* renamed from: d, reason: collision with root package name */
    public c f3465d;

    /* renamed from: e, reason: collision with root package name */
    public N.b f3466e = new N.b();

    /* renamed from: i, reason: collision with root package name */
    public m f3467i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3468j;

    /* renamed from: k, reason: collision with root package name */
    public int f3469k;

    /* renamed from: l, reason: collision with root package name */
    public int f3470l;

    public e(c cVar) {
        this.f3465d = cVar;
        this.f3467i = cVar.f3460j;
        this.f3470l = cVar.d();
    }

    @Override // z2.AbstractC1429m
    public final Set b() {
        return new g(0, this);
    }

    @Override // z2.AbstractC1429m
    public final Set c() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f3467i = m.f3483e;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f3467i.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // z2.AbstractC1429m
    public final int d() {
        return this.f3470l;
    }

    @Override // z2.AbstractC1429m
    public final Collection e() {
        return new A2.j(this);
    }

    @Override // J.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c j() {
        m mVar = this.f3467i;
        c cVar = this.f3465d;
        if (mVar != cVar.f3460j) {
            this.f3466e = new N.b();
            cVar = new c(this.f3467i, d());
        }
        this.f3465d = cVar;
        return cVar;
    }

    public final void g(int i2) {
        this.f3470l = i2;
        this.f3469k++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f3467i.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f3468j = null;
        this.f3467i = this.f3467i.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f3468j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVar = null;
        c cVar2 = map instanceof c ? (c) map : null;
        if (cVar2 == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVar = eVar.j();
            }
        } else {
            cVar = cVar2;
        }
        if (cVar == null) {
            super.putAll(map);
            return;
        }
        N.a aVar = new N.a();
        aVar.f3611a = 0;
        int i2 = this.f3470l;
        m mVar = this.f3467i;
        m mVar2 = cVar.f3460j;
        Intrinsics.d(mVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f3467i = mVar.m(mVar2, 0, aVar, this);
        int i4 = (cVar.f3461k + i2) - aVar.f3611a;
        if (i2 != i4) {
            g(i4);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int d4 = d();
        m o4 = this.f3467i.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o4 == null) {
            o4 = m.f3483e;
        }
        this.f3467i = o4;
        return d4 != d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f3468j = null;
        m n2 = this.f3467i.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n2 == null) {
            n2 = m.f3483e;
        }
        this.f3467i = n2;
        return this.f3468j;
    }
}
