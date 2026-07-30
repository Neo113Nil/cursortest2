package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i7 implements ro1 {
    public final int a;
    public final String b;
    public final av0 c = gb0.F(c90.e);
    public final av0 d = gb0.F(Boolean.TRUE);

    public i7(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.ro1
    public final int a(nr nrVar) {
        return e().d;
    }

    @Override // defpackage.ro1
    public final int b(nr nrVar) {
        return e().b;
    }

    @Override // defpackage.ro1
    public final int c(nr nrVar, vc0 vc0Var) {
        return e().c;
    }

    @Override // defpackage.ro1
    public final int d(nr nrVar, vc0 vc0Var) {
        return e().a;
    }

    public final c90 e() {
        return (c90) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i7) {
            return this.a == ((i7) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(ip1 ip1Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(ip1Var.a.g(i2));
            f(ip1Var.a.q(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return qy0.m(sb, e().d, ')');
    }
}
