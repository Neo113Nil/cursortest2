package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x90 {
    public static final x90 e = new x90(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public x90(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return this.a == x90Var.a && this.b == x90Var.b && this.c == x90Var.c && this.d == x90Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qy0.c(this.c, qy0.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return qy0.m(sb, this.d, ')');
    }
}
