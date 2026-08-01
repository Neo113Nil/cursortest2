package a1;

import H1.l;
import i1.p;
import java.io.Serializable;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f1670a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1671b;

    public C0065c(g gVar, i iVar) {
        j1.h.e(iVar, "left");
        this.f1670a = iVar;
        this.f1671b = gVar;
    }

    @Override // a1.i
    public final i B(i iVar) {
        return l.N(this, iVar);
    }

    @Override // a1.i
    public final g d(h hVar) {
        j1.h.e(hVar, "key");
        C0065c c0065c = this;
        while (true) {
            g d2 = c0065c.f1671b.d(hVar);
            if (d2 != null) {
                return d2;
            }
            i iVar = c0065c.f1670a;
            if (!(iVar instanceof C0065c)) {
                return iVar.d(hVar);
            }
            c0065c = (C0065c) iVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof C0065c)) {
                return false;
            }
            C0065c c0065c = (C0065c) obj;
            c0065c.getClass();
            int i = 2;
            C0065c c0065c2 = c0065c;
            int i2 = 2;
            while (true) {
                i iVar = c0065c2.f1670a;
                c0065c2 = iVar instanceof C0065c ? (C0065c) iVar : null;
                if (c0065c2 == null) {
                    break;
                }
                i2++;
            }
            C0065c c0065c3 = this;
            while (true) {
                i iVar2 = c0065c3.f1670a;
                c0065c3 = iVar2 instanceof C0065c ? (C0065c) iVar2 : null;
                if (c0065c3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C0065c c0065c4 = this;
            while (true) {
                g gVar = c0065c4.f1671b;
                if (!j1.h.a(c0065c.d(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = c0065c4.f1670a;
                if (!(iVar3 instanceof C0065c)) {
                    j1.h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = j1.h.a(c0065c.d(gVar2.getKey()), gVar2);
                    break;
                }
                c0065c4 = (C0065c) iVar3;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f1671b.hashCode() + this.f1670a.hashCode();
    }

    @Override // a1.i
    public final Object q(Object obj, p pVar) {
        return pVar.d(this.f1670a.q(obj, pVar), this.f1671b);
    }

    public final String toString() {
        return "[" + ((String) q("", C0064b.f1667c)) + ']';
    }

    @Override // a1.i
    public final i z(h hVar) {
        j1.h.e(hVar, "key");
        g gVar = this.f1671b;
        g d2 = gVar.d(hVar);
        i iVar = this.f1670a;
        if (d2 != null) {
            return iVar;
        }
        i z2 = iVar.z(hVar);
        return z2 == iVar ? this : z2 == j.f1673a ? gVar : new C0065c(gVar, z2);
    }
}
