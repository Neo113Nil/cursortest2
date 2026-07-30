package l5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements Iterable {

    /* renamed from: g, reason: collision with root package name */
    public static final b f6006g = new b(new o5.e(null));

    /* renamed from: f, reason: collision with root package name */
    public final o5.e f6007f;

    public b(o5.e eVar) {
        this.f6007f = eVar;
    }

    public static t5.s w(f fVar, o5.e eVar, t5.s sVar) {
        t5.c cVar;
        Object obj = eVar.f6846f;
        if (obj != null) {
            return sVar.u(fVar, (t5.s) obj);
        }
        Iterator it = eVar.f6847g.iterator();
        t5.s sVar2 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            cVar = t5.c.f8888i;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            o5.e eVar2 = (o5.e) entry.getValue();
            t5.c cVar2 = (t5.c) entry.getKey();
            if (cVar2.equals(cVar)) {
                o5.j.b("Priority writes must always be leaf nodes", eVar2.f6846f != null);
                sVar2 = (t5.s) eVar2.f6846f;
            } else {
                sVar = w(fVar.m(cVar2), eVar2, sVar);
            }
        }
        return (sVar.b(fVar).isEmpty() || sVar2 == null) ? sVar : sVar.u(fVar.m(cVar), sVar2);
    }

    public static b y(HashMap hashMap) {
        o5.e eVar = o5.e.f6845i;
        for (Map.Entry entry : hashMap.entrySet()) {
            eVar = eVar.z((f) entry.getKey(), new o5.e((t5.s) entry.getValue()));
        }
        return new b(eVar);
    }

    public final HashMap A() {
        HashMap hashMap = new HashMap();
        a aVar = new a(hashMap);
        o5.e eVar = this.f6007f;
        eVar.getClass();
        eVar.g(f.f6023i, aVar, null);
        return hashMap;
    }

    public final b a(f fVar, t5.s sVar) {
        if (fVar.isEmpty()) {
            return new b(new o5.e(sVar));
        }
        j4.i iVar = o5.h.f6851c;
        o5.e eVar = this.f6007f;
        f a3 = eVar.a(fVar, iVar);
        if (a3 == null) {
            return new b(eVar.z(fVar, new o5.e(sVar)));
        }
        f B = f.B(a3, fVar);
        t5.s sVar2 = (t5.s) eVar.m(a3);
        t5.c y4 = B.y();
        return (y4 != null && y4.equals(t5.c.f8888i) && sVar2.b(B.A()).isEmpty()) ? this : new b(eVar.y(a3, sVar2.u(B, sVar)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != b.class) {
            return false;
        }
        return ((b) obj).A().equals(A());
    }

    public final b g(f fVar, b bVar) {
        o5.e eVar = bVar.f6007f;
        l1.x xVar = new l1.x(3, fVar);
        eVar.getClass();
        return (b) eVar.g(f.f6023i, xVar, this);
    }

    public final int hashCode() {
        return A().hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6007f.iterator();
    }

    public final t5.s m(t5.s sVar) {
        return w(f.f6023i, this.f6007f, sVar);
    }

    public final String toString() {
        return "CompoundWrite{" + A().toString() + "}";
    }

    public final b x(f fVar) {
        if (fVar.isEmpty()) {
            return this;
        }
        t5.s z8 = z(fVar);
        return z8 != null ? new b(new o5.e(z8)) : new b(this.f6007f.A(fVar));
    }

    public final t5.s z(f fVar) {
        j4.i iVar = o5.h.f6851c;
        o5.e eVar = this.f6007f;
        f a3 = eVar.a(fVar, iVar);
        if (a3 != null) {
            return ((t5.s) eVar.m(a3)).b(f.B(a3, fVar));
        }
        return null;
    }
}
