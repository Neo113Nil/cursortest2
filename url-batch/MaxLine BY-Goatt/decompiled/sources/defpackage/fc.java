package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fc implements z63 {
    public final int a;
    public final String b;
    public final lz1 c = ij2.j(z21.e);
    public final lz1 d = ij2.j(Boolean.TRUE);

    public fc(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.z63
    public final int a(ca0 ca0Var) {
        return e().d;
    }

    @Override // defpackage.z63
    public final int b(ca0 ca0Var) {
        return e().b;
    }

    @Override // defpackage.z63
    public final int c(ca0 ca0Var, u81 u81Var) {
        return e().c;
    }

    @Override // defpackage.z63
    public final int d(ca0 ca0Var, u81 u81Var) {
        return e().a;
    }

    public final z21 e() {
        return (z21) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fc) {
            return this.a == ((fc) obj).a;
        }
        return false;
    }

    public final void f(c83 c83Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(c83Var.a.h(i2));
            this.d.setValue(Boolean.valueOf(c83Var.a.t(i2)));
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
        return q40.o(sb, e().d, ')');
    }
}
