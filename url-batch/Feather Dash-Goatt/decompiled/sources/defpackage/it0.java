package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class it0 extends ka0 {
    public final l41 a;
    public final c6 b;

    public it0(l41 l41Var) {
        c6 c6Var;
        this.a = l41Var;
        long j = l41Var.e;
        if ((j >>> 32) == (4294967295L & j) && j == l41Var.f && j == l41Var.g && j == l41Var.h) {
            c6Var = null;
        } else {
            c6Var = e6.a();
            c6.b(c6Var, l41Var);
        }
        this.b = c6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof it0) {
            return this.a.equals(((it0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ka0
    public final s11 p() {
        l41 l41Var = this.a;
        return new s11(l41Var.a, l41Var.b, l41Var.c, l41Var.d);
    }
}
