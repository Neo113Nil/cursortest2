package h6;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final i f4658f;

    /* renamed from: g, reason: collision with root package name */
    public final g f4659g;

    public c(g gVar, i iVar) {
        r6.k.f(iVar, "left");
        r6.k.f(gVar, "element");
        this.f4658f = iVar;
        this.f4659g = gVar;
    }

    @Override // h6.i
    public final Object D(Object obj, q6.e eVar) {
        return eVar.d(this.f4658f.D(obj, eVar), this.f4659g);
    }

    @Override // h6.i
    public final i F(h hVar) {
        r6.k.f(hVar, "key");
        g gVar = this.f4659g;
        g u8 = gVar.u(hVar);
        i iVar = this.f4658f;
        if (u8 != null) {
            return iVar;
        }
        i F = iVar.F(hVar);
        return F == iVar ? this : F == j.f4661f ? gVar : new c(gVar, F);
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i7 = 2;
            c cVar2 = cVar;
            int i8 = 2;
            while (true) {
                i iVar = cVar2.f4658f;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i8++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f4658f;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i8 == i7) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f4659g;
                    if (!r6.k.a(cVar.u(gVar.getKey()), gVar)) {
                        z8 = false;
                        break;
                    }
                    i iVar3 = cVar4.f4658f;
                    if (!(iVar3 instanceof c)) {
                        r6.k.d(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        z8 = r6.k.a(cVar.u(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (z8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4659g.hashCode() + this.f4658f.hashCode();
    }

    public final String toString() {
        return "[" + ((String) D("", b.f4655h)) + ']';
    }

    @Override // h6.i
    public final g u(h hVar) {
        r6.k.f(hVar, "key");
        c cVar = this;
        while (true) {
            g u8 = cVar.f4659g.u(hVar);
            if (u8 != null) {
                return u8;
            }
            i iVar = cVar.f4658f;
            if (!(iVar instanceof c)) {
                return iVar.u(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // h6.i
    public final i z(i iVar) {
        r6.k.f(iVar, "context");
        return iVar == j.f4661f ? this : (i) iVar.D(this, b.f4656i);
    }
}
