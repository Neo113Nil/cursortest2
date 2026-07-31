package P1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final i f3070d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3071e;

    public c(g gVar, i iVar) {
        Z1.i.f(iVar, "left");
        Z1.i.f(gVar, "element");
        this.f3070d = iVar;
        this.f3071e = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i3 = 2;
            c cVar2 = cVar;
            int i4 = 2;
            while (true) {
                i iVar = cVar2.f3070d;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i4++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f3070d;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 != i3) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f3071e;
                if (!Z1.i.a(cVar.k(gVar.getKey()), gVar)) {
                    z3 = false;
                    break;
                }
                i iVar3 = cVar4.f3070d;
                if (!(iVar3 instanceof c)) {
                    Z1.i.d(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z3 = Z1.i.a(cVar.k(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f3071e.hashCode() + this.f3070d.hashCode();
    }

    @Override // P1.i
    public final g k(h hVar) {
        Z1.i.f(hVar, "key");
        c cVar = this;
        while (true) {
            g k3 = cVar.f3071e.k(hVar);
            if (k3 != null) {
                return k3;
            }
            i iVar = cVar.f3070d;
            if (!(iVar instanceof c)) {
                return iVar.k(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // P1.i
    public final i o(i iVar) {
        Z1.i.f(iVar, "context");
        return iVar == j.f3073d ? this : (i) iVar.r(this, b.f3068g);
    }

    @Override // P1.i
    public final Object r(Object obj, Y1.e eVar) {
        return eVar.g(this.f3070d.r(obj, eVar), this.f3071e);
    }

    public final String toString() {
        return "[" + ((String) r("", b.f3067f)) + ']';
    }

    @Override // P1.i
    public final i x(h hVar) {
        Z1.i.f(hVar, "key");
        g gVar = this.f3071e;
        g k3 = gVar.k(hVar);
        i iVar = this.f3070d;
        if (k3 != null) {
            return iVar;
        }
        i x3 = iVar.x(hVar);
        return x3 == iVar ? this : x3 == j.f3073d ? gVar : new c(gVar, x3);
    }
}
