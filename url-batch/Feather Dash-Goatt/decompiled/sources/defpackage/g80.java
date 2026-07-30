package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g80 implements p7 {
    public final lu d;
    public final q21 e;

    public g80(lu luVar, q21 q21Var) {
        this.d = luVar;
        this.e = q21Var;
    }

    @Override // defpackage.p7
    public final qm1 a(c51 c51Var) {
        return new um1(this.d.a(c51Var), this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return g80Var.d.equals(this.d) && g80Var.e == this.e;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }
}
