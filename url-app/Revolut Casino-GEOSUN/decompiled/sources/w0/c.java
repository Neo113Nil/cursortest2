package w0;

import E0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final i f3079e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3080f;

    public c(i iVar, g gVar) {
        F0.i.e(iVar, "left");
        F0.i.e(gVar, "element");
        this.f3079e = iVar;
        this.f3080f = gVar;
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
                i iVar = cVar2.f3079e;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f3079e;
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
                g gVar = cVar4.f3080f;
                if (!F0.i.a(cVar.f(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f3079e;
                if (!(iVar3 instanceof c)) {
                    F0.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = F0.i.a(cVar.f(gVar2.getKey()), gVar2);
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

    @Override // w0.i
    public final g f(h hVar) {
        F0.i.e(hVar, "key");
        c cVar = this;
        while (true) {
            g f2 = cVar.f3080f.f(hVar);
            if (f2 != null) {
                return f2;
            }
            i iVar = cVar.f3079e;
            if (!(iVar instanceof c)) {
                return iVar.f(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // w0.i
    public final Object h(Object obj, p pVar) {
        return pVar.f(this.f3079e.h(obj, pVar), this.f3080f);
    }

    public final int hashCode() {
        return this.f3080f.hashCode() + this.f3079e.hashCode();
    }

    @Override // w0.i
    public final i i(h hVar) {
        F0.i.e(hVar, "key");
        g gVar = this.f3080f;
        g f2 = gVar.f(hVar);
        i iVar = this.f3079e;
        if (f2 != null) {
            return iVar;
        }
        i i2 = iVar.i(hVar);
        return i2 == iVar ? this : i2 == j.f3082e ? gVar : new c(i2, gVar);
    }

    @Override // w0.i
    public final i k(i iVar) {
        F0.i.e(iVar, "context");
        return iVar == j.f3082e ? this : (i) iVar.h(this, new b(1));
    }

    public final String toString() {
        return "[" + ((String) h("", new b(0))) + ']';
    }
}
