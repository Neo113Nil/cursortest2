package b1;

import H1.l;
import j1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements j, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final j f2044a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2045b;

    public c(h hVar, j jVar) {
        k1.e.e(jVar, "left");
        this.f2044a = jVar;
        this.f2045b = hVar;
    }

    @Override // b1.j
    public final j d(i iVar) {
        k1.e.e(iVar, "key");
        h hVar = this.f2045b;
        h p2 = hVar.p(iVar);
        j jVar = this.f2044a;
        if (p2 != null) {
            return jVar;
        }
        j d = jVar.d(iVar);
        return d == jVar ? this : d == k.f2050a ? hVar : new c(hVar, d);
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                j jVar = cVar2.f2044a;
                cVar2 = jVar instanceof c ? (c) jVar : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                j jVar2 = cVar3.f2044a;
                cVar3 = jVar2 instanceof c ? (c) jVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                h hVar = cVar4.f2045b;
                if (!k1.e.a(cVar.p(hVar.getKey()), hVar)) {
                    z2 = false;
                    break;
                }
                j jVar3 = cVar4.f2044a;
                if (!(jVar3 instanceof c)) {
                    k1.e.c(jVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    h hVar2 = (h) jVar3;
                    z2 = k1.e.a(cVar.p(hVar2.getKey()), hVar2);
                    break;
                }
                cVar4 = (c) jVar3;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f2045b.hashCode() + this.f2044a.hashCode();
    }

    @Override // b1.j
    public final j j(j jVar) {
        return l.Z(this, jVar);
    }

    @Override // b1.j
    public final Object k(Object obj, p pVar) {
        return pVar.d(this.f2044a.k(obj, pVar), this.f2045b);
    }

    @Override // b1.j
    public final h p(i iVar) {
        k1.e.e(iVar, "key");
        c cVar = this;
        while (true) {
            h p2 = cVar.f2045b.p(iVar);
            if (p2 != null) {
                return p2;
            }
            j jVar = cVar.f2044a;
            if (!(jVar instanceof c)) {
                return jVar.p(iVar);
            }
            cVar = (c) jVar;
        }
    }

    public final String toString() {
        return "[" + ((String) k("", C0082b.f2042c)) + ']';
    }
}
