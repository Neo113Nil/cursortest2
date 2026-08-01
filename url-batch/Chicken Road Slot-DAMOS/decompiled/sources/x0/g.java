package x0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.m;
import n0.p1;
import n0.p2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: d, reason: collision with root package name */
    public w0.b f10228d = new w0.b();

    /* renamed from: e, reason: collision with root package name */
    public u0.i f10229e;

    /* renamed from: i, reason: collision with root package name */
    public Object f10230i;

    /* renamed from: r, reason: collision with root package name */
    public int f10231r;

    /* renamed from: s, reason: collision with root package name */
    public int f10232s;

    /* renamed from: t, reason: collision with root package name */
    public h f10233t;

    public g(h hVar) {
        this.f10229e = hVar.f9577r;
        this.f10232s = hVar.f9578s;
        this.f10233t = hVar;
    }

    @Override // kotlin.collections.m
    public final Set a() {
        return new u0.e(0, this);
    }

    @Override // kotlin.collections.m
    public final Set b() {
        return new u0.e(1, this);
    }

    @Override // kotlin.collections.m
    public final int c() {
        return this.f10232s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f10229e = u0.i.f9590e;
        i(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof p1) {
            return f((p1) obj);
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

    @Override // kotlin.collections.m
    public final Collection d() {
        return new id.j(1, this);
    }

    public final h e() {
        u0.i iVar = this.f10229e;
        h hVar = this.f10233t;
        if (iVar != hVar.f9577r) {
            this.f10228d = new w0.b();
            hVar = new h(this.f10229e, c());
        }
        this.f10233t = hVar;
        return hVar;
    }

    public final boolean f(Object obj) {
        return this.f10229e.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object g(Object obj) {
        return this.f10229e.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof p1) {
            return (p2) g((p1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof p1) ? obj2 : (p2) super.getOrDefault((p1) obj, (p2) obj2);
    }

    public final Object h(Object obj) {
        this.f10230i = null;
        u0.i n10 = this.f10229e.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n10 == null) {
            n10 = u0.i.f9590e;
        }
        this.f10229e = n10;
        return this.f10230i;
    }

    public final void i(int i3) {
        this.f10232s = i3;
        this.f10231r++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f10230i = null;
        this.f10229e = this.f10229e.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f10230i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [u0.b] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        h hVar = null;
        h hVar2 = map instanceof u0.b ? (u0.b) map : null;
        if (hVar2 == null) {
            g gVar = map instanceof g ? (g) map : null;
            if (gVar != null) {
                hVar = gVar.e();
            }
        } else {
            hVar = hVar2;
        }
        if (hVar == null) {
            super.putAll(map);
            return;
        }
        w0.a aVar = new w0.a();
        aVar.f10001a = 0;
        int i3 = this.f10232s;
        u0.i iVar = this.f10229e;
        u0.i iVar2 = hVar.f9577r;
        iVar2.getClass();
        this.f10229e = iVar.m(iVar2, 0, aVar, this);
        int i10 = (hVar.f9578s + i3) - aVar.f10001a;
        if (i3 != i10) {
            i(i10);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int c10 = c();
        u0.i o6 = this.f10229e.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o6 == null) {
            o6 = u0.i.f9590e;
        }
        this.f10229e = o6;
        return c10 != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof p1) {
            return (p2) h((p1) obj);
        }
        return null;
    }
}
