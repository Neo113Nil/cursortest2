package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class s4 implements fu0, Serializable {
    public final Object m;
    public final Class n;
    public final String o;
    public final String p;
    public final boolean q = false;
    public final int r;
    public final int s;

    public s4(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.m = obj;
        this.n = cls;
        this.o = str;
        this.p = str2;
        this.r = i;
        this.s = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return this.q == s4Var.q && this.r == s4Var.r && this.s == s4Var.s && this.m.equals(s4Var.m) && this.n.equals(s4Var.n) && this.o.equals(s4Var.o) && this.p.equals(s4Var.p);
    }

    @Override // defpackage.fu0
    public final int getArity() {
        return this.r;
    }

    public final int hashCode() {
        return ((((in1.j(this.p, in1.j(this.o, (this.n.hashCode() + (this.m.hashCode() * 31)) * 31, 31), 31) + (this.q ? 1231 : 1237)) * 31) + this.r) * 31) + this.s;
    }

    public final String toString() {
        d82.a.getClass();
        return f82.a(this);
    }
}
