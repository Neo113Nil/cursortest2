package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ic1 implements ol, Iterable, yb0 {
    public final ab1 d;
    public final int e;
    public final e21 g;

    public ic1(ab1 ab1Var, int i, t50 t50Var, e21 e21Var) {
        this.d = ab1Var;
        this.e = i;
        this.g = e21Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ic1)) {
            return false;
        }
        ic1 ic1Var = (ic1) obj;
        return ic1Var.e == this.e && ic1Var.d == this.d && ic1Var.g.equals(this.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.d.hashCode() + (this.e * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hc1(this.d, this.e, null, this.g);
    }
}
