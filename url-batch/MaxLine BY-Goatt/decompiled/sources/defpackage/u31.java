package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u31 {
    public static final u31 e = new u31(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public u31(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u31)) {
            return false;
        }
        u31 u31Var = (u31) obj;
        return this.a == u31Var.a && this.b == u31Var.b && this.c == u31Var.c && this.d == u31Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + q40.e(this.c, q40.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return q40.o(sb, this.d, ')');
    }
}
