package G0;

import O0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final i f497e;

    /* renamed from: f, reason: collision with root package name */
    public final g f498f;

    public c(i iVar, g gVar) {
        P0.h.e(iVar, "left");
        P0.h.e(gVar, "element");
        this.f497e = iVar;
        this.f498f = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f497e;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f497e;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 == i2) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f498f;
                    if (!P0.h.a(cVar.m(gVar.getKey()), gVar)) {
                        z2 = false;
                        break;
                    }
                    i iVar3 = cVar4.f497e;
                    if (!(iVar3 instanceof c)) {
                        P0.h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        z2 = P0.h.a(cVar.m(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // G0.i
    public final Object h(Object obj, p pVar) {
        return pVar.i(this.f497e.h(obj, pVar), this.f498f);
    }

    public final int hashCode() {
        return this.f498f.hashCode() + this.f497e.hashCode();
    }

    @Override // G0.i
    public final i i(h hVar) {
        P0.h.e(hVar, "key");
        g gVar = this.f498f;
        g m2 = gVar.m(hVar);
        i iVar = this.f497e;
        if (m2 != null) {
            return iVar;
        }
        i i2 = iVar.i(hVar);
        return i2 == iVar ? this : i2 == j.f500e ? gVar : new c(i2, gVar);
    }

    @Override // G0.i
    public final i j(i iVar) {
        P0.h.e(iVar, "context");
        return iVar == j.f500e ? this : (i) iVar.h(this, new b(1));
    }

    @Override // G0.i
    public final g m(h hVar) {
        P0.h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g m2 = cVar.f498f.m(hVar);
            if (m2 != null) {
                return m2;
            }
            i iVar = cVar.f497e;
            if (!(iVar instanceof c)) {
                return iVar.m(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final String toString() {
        return "[" + ((String) h("", new b(0))) + ']';
    }
}
