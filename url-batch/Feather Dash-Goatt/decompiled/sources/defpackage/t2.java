package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class t2 implements a40, Serializable {
    public final Object d;
    public final Class e;
    public final String g;
    public final String h;
    public final boolean i = false;
    public final int j;
    public final int k;

    public t2(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.d = obj;
        this.e = cls;
        this.g = str;
        this.h = str2;
        this.j = i;
        this.k = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.i == t2Var.i && this.j == t2Var.j && this.k == t2Var.k && this.d.equals(t2Var.d) && this.e.equals(t2Var.e) && this.g.equals(t2Var.g) && this.h.equals(t2Var.h);
    }

    @Override // defpackage.a40
    public final int getArity() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((this.h.hashCode() + ((this.g.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31)) * 31) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        a21.a.getClass();
        return b21.a(this);
    }
}
