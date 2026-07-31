package g6;

import g2.v;
import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements h, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final h f3043d;

    /* renamed from: e, reason: collision with root package name */
    public final f f3044e;

    public b(f fVar, h hVar) {
        q6.i.e(hVar, "left");
        q6.i.e(fVar, "element");
        this.f3043d = hVar;
        this.f3044e = fVar;
    }

    @Override // g6.h
    public final h c(h hVar) {
        q6.i.e(hVar, "context");
        return hVar == i.f3046d ? this : (h) hVar.g(this, new v(9));
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i = 2;
            b bVar2 = bVar;
            int i8 = 2;
            while (true) {
                h hVar = bVar2.f3043d;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i8++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f3043d;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i++;
            }
            if (i8 == i) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f3044e;
                    if (!q6.i.a(bVar.l(fVar.getKey()), fVar)) {
                        z3 = false;
                        break;
                    }
                    h hVar3 = bVar4.f3043d;
                    if (!(hVar3 instanceof b)) {
                        q6.i.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        z3 = q6.i.a(bVar.l(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        return eVar.g(this.f3043d.g(obj, eVar), this.f3044e);
    }

    public final int hashCode() {
        return this.f3044e.hashCode() + this.f3043d.hashCode();
    }

    @Override // g6.h
    public final f l(g gVar) {
        q6.i.e(gVar, "key");
        b bVar = this;
        while (true) {
            f l3 = bVar.f3044e.l(gVar);
            if (l3 != null) {
                return l3;
            }
            h hVar = bVar.f3043d;
            if (!(hVar instanceof b)) {
                return hVar.l(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final String toString() {
        return "[" + ((String) g("", new v(8))) + ']';
    }

    @Override // g6.h
    public final h v(g gVar) {
        q6.i.e(gVar, "key");
        f fVar = this.f3044e;
        f l3 = fVar.l(gVar);
        h hVar = this.f3043d;
        if (l3 != null) {
            return hVar;
        }
        h v7 = hVar.v(gVar);
        return v7 == hVar ? this : v7 == i.f3046d ? fVar : new b(fVar, v7);
    }
}
