package H0;

import P0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final i f500e;

    /* renamed from: f, reason: collision with root package name */
    public final g f501f;

    public c(i iVar, g gVar) {
        Q0.h.e(iVar, "left");
        Q0.h.e(gVar, "element");
        this.f500e = iVar;
        this.f501f = gVar;
    }

    @Override // H0.i
    public final i d(h hVar) {
        Q0.h.e(hVar, "key");
        g gVar = this.f501f;
        g k2 = gVar.k(hVar);
        i iVar = this.f500e;
        if (k2 != null) {
            return iVar;
        }
        i d2 = iVar.d(hVar);
        return d2 == iVar ? this : d2 == j.f503e ? gVar : new c(d2, gVar);
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                i iVar = cVar2.f500e;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f500e;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 != i2) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f501f;
                if (!Q0.h.a(cVar.k(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f500e;
                if (!(iVar3 instanceof c)) {
                    Q0.h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = Q0.h.a(cVar.k(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f501f.hashCode() + this.f500e.hashCode();
    }

    @Override // H0.i
    public final i i(i iVar) {
        Q0.h.e(iVar, "context");
        return iVar == j.f503e ? this : (i) iVar.m(this, b.f498h);
    }

    @Override // H0.i
    public final g k(h hVar) {
        Q0.h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g k2 = cVar.f501f.k(hVar);
            if (k2 != null) {
                return k2;
            }
            i iVar = cVar.f500e;
            if (!(iVar instanceof c)) {
                return iVar.k(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // H0.i
    public final Object m(Object obj, p pVar) {
        return pVar.h(this.f500e.m(obj, pVar), this.f501f);
    }

    public final String toString() {
        return "[" + ((String) m("", b.f497g)) + ']';
    }
}
