package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ic implements ye, Serializable {
    public final ye f;
    public final we g;

    public ic(we weVar, ye yeVar) {
        yeVar.getClass();
        this.f = yeVar;
        this.g = weVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ic) {
            ic icVar = (ic) obj;
            int i = 2;
            ic icVar2 = icVar;
            int i2 = 2;
            while (true) {
                ye yeVar = icVar2.f;
                icVar2 = yeVar instanceof ic ? (ic) yeVar : null;
                if (icVar2 == null) {
                    break;
                }
                i2++;
            }
            ic icVar3 = this;
            while (true) {
                ye yeVar2 = icVar3.f;
                icVar3 = yeVar2 instanceof ic ? (ic) yeVar2 : null;
                if (icVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    we weVar = this.g;
                    if (!kr.b(icVar.h(weVar.getKey()), weVar)) {
                        z = false;
                        break;
                    }
                    ye yeVar3 = this.f;
                    if (!(yeVar3 instanceof ic)) {
                        yeVar3.getClass();
                        we weVar2 = (we) yeVar3;
                        z = kr.b(icVar.h(weVar2.getKey()), weVar2);
                        break;
                    }
                    this = (ic) yeVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ye
    public final Object f(Object obj, ho hoVar) {
        return hoVar.f(this.f.f(obj, hoVar), this.g);
    }

    @Override // defpackage.ye
    public final ye g(ye yeVar) {
        return b9.J(this, yeVar);
    }

    @Override // defpackage.ye
    public final we h(xe xeVar) {
        xeVar.getClass();
        while (true) {
            we h = this.g.h(xeVar);
            if (h != null) {
                return h;
            }
            ye yeVar = this.f;
            if (!(yeVar instanceof ic)) {
                return yeVar.h(xeVar);
            }
            this = (ic) yeVar;
        }
    }

    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode();
    }

    @Override // defpackage.ye
    public final ye k(xe xeVar) {
        xeVar.getClass();
        we weVar = this.g;
        we h = weVar.h(xeVar);
        ye yeVar = this.f;
        if (h != null) {
            return yeVar;
        }
        ye k = yeVar.k(xeVar);
        return k == yeVar ? this : k == gk.f ? weVar : new ic(weVar, k);
    }

    public final String toString() {
        return "[" + ((String) f("", new hc(0))) + ']';
    }
}
