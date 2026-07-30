package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class c90 {
    public static final c90 e = new c90(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c90(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static c90 a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new c90(i, i2, i3, i4);
    }

    public static c90 b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c90.class != obj.getClass()) {
            return false;
        }
        c90 c90Var = (c90) obj;
        return this.d == c90Var.d && this.a == c90Var.a && this.c == c90Var.c && this.b == c90Var.b;
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
        return qy0.m(sb, this.d, '}');
    }
}
