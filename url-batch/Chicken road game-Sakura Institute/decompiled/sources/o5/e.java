package o5;

import i5.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements Iterable {

    /* renamed from: h, reason: collision with root package name */
    public static final i5.b f6844h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f6845i;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6846f;

    /* renamed from: g, reason: collision with root package name */
    public final i5.c f6847g;

    static {
        i5.b bVar = new i5.b(o.f4955a);
        f6844h = bVar;
        f6845i = new e(null, bVar);
    }

    public e(Object obj, i5.c cVar) {
        this.f6846f = obj;
        this.f6847g = cVar;
    }

    public final e A(l5.f fVar) {
        if (fVar.isEmpty()) {
            return this;
        }
        e eVar = (e) this.f6847g.g(fVar.z());
        return eVar != null ? eVar.A(fVar.C()) : f6845i;
    }

    public final l5.f a(l5.f fVar, h hVar) {
        l5.f a3;
        Object obj = this.f6846f;
        if (obj != null && hVar.i(obj)) {
            return l5.f.f6023i;
        }
        if (fVar.isEmpty()) {
            return null;
        }
        t5.c z8 = fVar.z();
        e eVar = (e) this.f6847g.g(z8);
        if (eVar == null || (a3 = eVar.a(fVar.C(), hVar)) == null) {
            return null;
        }
        return new l5.f(z8).g(a3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Object obj2 = eVar.f6846f;
        i5.c cVar = eVar.f6847g;
        i5.c cVar2 = this.f6847g;
        if (cVar2 == null ? cVar != null : !cVar2.equals(cVar)) {
            return false;
        }
        Object obj3 = this.f6846f;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final Object g(l5.f fVar, d dVar, Object obj) {
        for (Map.Entry entry : this.f6847g) {
            obj = ((e) entry.getValue()).g(fVar.m((t5.c) entry.getKey()), dVar, obj);
        }
        Object obj2 = this.f6846f;
        return obj2 != null ? dVar.a(fVar, obj2, obj) : obj;
    }

    public final int hashCode() {
        Object obj = this.f6846f;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        i5.c cVar = this.f6847g;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.f6846f == null && this.f6847g.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        g(l5.f.f6023i, new f1.g(arrayList), null);
        return arrayList.iterator();
    }

    public final Object m(l5.f fVar) {
        if (fVar.isEmpty()) {
            return this.f6846f;
        }
        e eVar = (e) this.f6847g.g(fVar.z());
        if (eVar != null) {
            return eVar.m(fVar.C());
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableTree { value=");
        sb.append(this.f6846f);
        sb.append(", children={");
        for (Map.Entry entry : this.f6847g) {
            sb.append(((t5.c) entry.getKey()).f8889f);
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    public final e w(t5.c cVar) {
        e eVar = (e) this.f6847g.g(cVar);
        return eVar != null ? eVar : f6845i;
    }

    public final e x(l5.f fVar) {
        boolean isEmpty = fVar.isEmpty();
        i5.c cVar = this.f6847g;
        if (!isEmpty) {
            t5.c z8 = fVar.z();
            e eVar = (e) cVar.g(z8);
            if (eVar == null) {
                return this;
            }
            e x8 = eVar.x(fVar.C());
            i5.c B = x8.isEmpty() ? cVar.B(z8) : cVar.A(x8, z8);
            Object obj = this.f6846f;
            if (obj != null || !B.isEmpty()) {
                return new e(obj, B);
            }
        } else if (!cVar.isEmpty()) {
            return new e(null, cVar);
        }
        return f6845i;
    }

    public final e y(l5.f fVar, Object obj) {
        boolean isEmpty = fVar.isEmpty();
        i5.c cVar = this.f6847g;
        if (isEmpty) {
            return new e(obj, cVar);
        }
        t5.c z8 = fVar.z();
        e eVar = (e) cVar.g(z8);
        if (eVar == null) {
            eVar = f6845i;
        }
        return new e(this.f6846f, cVar.A(eVar.y(fVar.C(), obj), z8));
    }

    public final e z(l5.f fVar, e eVar) {
        if (fVar.isEmpty()) {
            return eVar;
        }
        t5.c z8 = fVar.z();
        i5.c cVar = this.f6847g;
        e eVar2 = (e) cVar.g(z8);
        if (eVar2 == null) {
            eVar2 = f6845i;
        }
        e z9 = eVar2.z(fVar.C(), eVar);
        return new e(this.f6846f, z9.isEmpty() ? cVar.B(z8) : cVar.A(z9, z8));
    }

    public e(Comparable comparable) {
        this(comparable, f6844h);
    }
}
