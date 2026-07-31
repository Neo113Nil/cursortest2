package V1;

import e2.InterfaceC0426e;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final i f4555d;

    /* renamed from: e, reason: collision with root package name */
    public final g f4556e;

    public c(g gVar, i iVar) {
        f2.j.f(iVar, "left");
        f2.j.f(gVar, "element");
        this.f4555d = iVar;
        this.f4556e = gVar;
    }

    @Override // V1.i
    public final i d(i iVar) {
        f2.j.f(iVar, "context");
        return iVar == j.f4558d ? this : (i) iVar.e(this, b.f4553g);
    }

    @Override // V1.i
    public final Object e(Object obj, InterfaceC0426e interfaceC0426e) {
        return interfaceC0426e.h(this.f4555d.e(obj, interfaceC0426e), this.f4556e);
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
                i iVar = cVar2.f4555d;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i4++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f4555d;
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
                g gVar = cVar4.f4556e;
                if (!f2.j.a(cVar.v(gVar.getKey()), gVar)) {
                    z3 = false;
                    break;
                }
                i iVar3 = cVar4.f4555d;
                if (!(iVar3 instanceof c)) {
                    f2.j.d(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z3 = f2.j.a(cVar.v(gVar2.getKey()), gVar2);
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
        return this.f4556e.hashCode() + this.f4555d.hashCode();
    }

    @Override // V1.i
    public final i l(h hVar) {
        f2.j.f(hVar, "key");
        g gVar = this.f4556e;
        g v3 = gVar.v(hVar);
        i iVar = this.f4555d;
        if (v3 != null) {
            return iVar;
        }
        i l3 = iVar.l(hVar);
        return l3 == iVar ? this : l3 == j.f4558d ? gVar : new c(gVar, l3);
    }

    public final String toString() {
        return "[" + ((String) e("", b.f4552f)) + ']';
    }

    @Override // V1.i
    public final g v(h hVar) {
        f2.j.f(hVar, "key");
        c cVar = this;
        while (true) {
            g v3 = cVar.f4556e.v(hVar);
            if (v3 != null) {
                return v3;
            }
            i iVar = cVar.f4555d;
            if (!(iVar instanceof c)) {
                return iVar.v(hVar);
            }
            cVar = (c) iVar;
        }
    }
}
