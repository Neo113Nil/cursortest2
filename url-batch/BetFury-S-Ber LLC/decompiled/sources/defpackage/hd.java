package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hd implements qg, Serializable {
    public final qg f;
    public final og g;

    public hd(og ogVar, qg qgVar) {
        qgVar.getClass();
        ogVar.getClass();
        this.f = qgVar;
        this.g = ogVar;
    }

    @Override // defpackage.qg
    public final qg D(pg pgVar) {
        pgVar.getClass();
        og ogVar = this.g;
        og w = ogVar.w(pgVar);
        qg qgVar = this.f;
        if (w != null) {
            return qgVar;
        }
        qg D = qgVar.D(pgVar);
        return D == qgVar ? this : D == um.f ? ogVar : new hd(ogVar, D);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof hd) {
            hd hdVar = (hd) obj;
            int i = 2;
            hd hdVar2 = hdVar;
            int i2 = 2;
            while (true) {
                qg qgVar = hdVar2.f;
                hdVar2 = qgVar instanceof hd ? (hd) qgVar : null;
                if (hdVar2 == null) {
                    break;
                }
                i2++;
            }
            hd hdVar3 = this;
            while (true) {
                qg qgVar2 = hdVar3.f;
                hdVar3 = qgVar2 instanceof hd ? (hd) qgVar2 : null;
                if (hdVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    og ogVar = this.g;
                    if (!mv.c(hdVar.w(ogVar.getKey()), ogVar)) {
                        z = false;
                        break;
                    }
                    qg qgVar3 = this.f;
                    if (!(qgVar3 instanceof hd)) {
                        qgVar3.getClass();
                        og ogVar2 = (og) qgVar3;
                        z = mv.c(hdVar.w(ogVar2.getKey()), ogVar2);
                        break;
                    }
                    this = (hd) qgVar3;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode();
    }

    @Override // defpackage.qg
    public final Object n(Object obj, xr xrVar) {
        return xrVar.g(this.f.n(obj, xrVar), this.g);
    }

    @Override // defpackage.qg
    public final qg r(qg qgVar) {
        return bi.U(this, qgVar);
    }

    public final String toString() {
        return "[" + ((String) n("", new gd(0))) + ']';
    }

    @Override // defpackage.qg
    public final og w(pg pgVar) {
        pgVar.getClass();
        while (true) {
            og w = this.g.w(pgVar);
            if (w != null) {
                return w;
            }
            qg qgVar = this.f;
            if (!(qgVar instanceof hd)) {
                return qgVar.w(pgVar);
            }
            this = (hd) qgVar;
        }
    }
}
