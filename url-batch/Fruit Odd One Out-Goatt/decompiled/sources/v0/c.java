package v0;

import c1.p;
import java.io.Serializable;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c implements h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final h f1193b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1194c;

    public c(f fVar, h hVar) {
        hVar.getClass();
        this.f1193b = hVar;
        this.f1194c = fVar;
    }

    @Override // v0.h
    public final Object a(Object obj, p pVar) {
        return pVar.g(this.f1193b.a(obj, pVar), this.f1194c);
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i2 = 2;
            c cVar2 = cVar;
            int i3 = 2;
            while (true) {
                h hVar = cVar2.f1193b;
                cVar2 = hVar instanceof c ? (c) hVar : null;
                if (cVar2 == null) {
                    break;
                }
                i3++;
            }
            c cVar3 = this;
            while (true) {
                h hVar2 = cVar3.f1193b;
                cVar3 = hVar2 instanceof c ? (c) hVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i2++;
            }
            if (i3 == i2) {
                c cVar4 = this;
                while (true) {
                    f fVar = cVar4.f1194c;
                    if (!d1.h.a(cVar.j(fVar.getKey()), fVar)) {
                        z2 = false;
                        break;
                    }
                    h hVar3 = cVar4.f1193b;
                    if (!(hVar3 instanceof c)) {
                        hVar3.getClass();
                        f fVar2 = (f) hVar3;
                        z2 = d1.h.a(cVar.j(fVar2.getKey()), fVar2);
                        break;
                    }
                    cVar4 = (c) hVar3;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // v0.h
    public final h h(h hVar) {
        return a.a.s(this, hVar);
    }

    public final int hashCode() {
        return this.f1194c.hashCode() + this.f1193b.hashCode();
    }

    @Override // v0.h
    public final h i(g gVar) {
        gVar.getClass();
        f fVar = this.f1194c;
        f j2 = fVar.j(gVar);
        h hVar = this.f1193b;
        if (j2 != null) {
            return hVar;
        }
        h i2 = hVar.i(gVar);
        return i2 == hVar ? this : i2 == i.f1196b ? fVar : new c(fVar, i2);
    }

    @Override // v0.h
    public final f j(g gVar) {
        gVar.getClass();
        c cVar = this;
        while (true) {
            f j2 = cVar.f1194c.j(gVar);
            if (j2 != null) {
                return j2;
            }
            h hVar = cVar.f1193b;
            if (!(hVar instanceof c)) {
                return hVar.j(gVar);
            }
            cVar = (c) hVar;
        }
    }

    public final String toString() {
        return "[" + ((String) a("", b.f1190d)) + ']';
    }
}
