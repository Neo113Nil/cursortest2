package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z21 {
    public static final z21 e = new z21(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public z21(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static z21 a(z21 z21Var, z21 z21Var2) {
        return b(Math.max(z21Var.a, z21Var2.a), Math.max(z21Var.b, z21Var2.b), Math.max(z21Var.c, z21Var2.c), Math.max(z21Var.d, z21Var2.d));
    }

    public static z21 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new z21(i, i2, i3, i4);
    }

    public static z21 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return x6.o(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z21.class != obj.getClass()) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return this.d == z21Var.d && this.a == z21Var.a && this.c == z21Var.c && this.b == z21Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return q40.o(sb, this.d, '}');
    }
}
