package W;

import d0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final i f391b;

    /* renamed from: c, reason: collision with root package name */
    public final g f392c;

    public c(g gVar, i iVar) {
        e0.h.e(iVar, "left");
        this.f391b = iVar;
        this.f392c = gVar;
    }

    @Override // W.i
    public final i c(i iVar) {
        return a.a.t(this, iVar);
    }

    @Override // W.i
    public final i e(h hVar) {
        e0.h.e(hVar, "key");
        g gVar = this.f392c;
        g k2 = gVar.k(hVar);
        i iVar = this.f391b;
        if (k2 != null) {
            return iVar;
        }
        i e2 = iVar.e(hVar);
        return e2 == iVar ? this : e2 == j.f394b ? gVar : new c(gVar, e2);
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
                i iVar = cVar2.f391b;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f391b;
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
                g gVar = cVar4.f392c;
                if (!e0.h.a(cVar.k(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f391b;
                if (!(iVar3 instanceof c)) {
                    e0.h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = e0.h.a(cVar.k(gVar2.getKey()), gVar2);
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

    @Override // W.i
    public final Object f(Object obj, p pVar) {
        return pVar.e(this.f391b.f(obj, pVar), this.f392c);
    }

    public final int hashCode() {
        return this.f392c.hashCode() + this.f391b.hashCode();
    }

    @Override // W.i
    public final g k(h hVar) {
        e0.h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g k2 = cVar.f392c.k(hVar);
            if (k2 != null) {
                return k2;
            }
            i iVar = cVar.f391b;
            if (!(iVar instanceof c)) {
                return iVar.k(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final String toString() {
        return "[" + ((String) f("", new b(0))) + ']';
    }
}
