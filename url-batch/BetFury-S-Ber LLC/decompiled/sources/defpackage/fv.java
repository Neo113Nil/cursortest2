package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fv {
    public static final fv e = new fv(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fv(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static fv a(fv fvVar, fv fvVar2) {
        return c(Math.max(fvVar.a, fvVar2.a), Math.max(fvVar.b, fvVar2.b), Math.max(fvVar.c, fvVar2.c), Math.max(fvVar.d, fvVar2.d));
    }

    public static fv b(fv fvVar, fv fvVar2) {
        return c(Math.min(fvVar.a, fvVar2.a), Math.min(fvVar.b, fvVar2.b), Math.min(fvVar.c, fvVar2.c), Math.min(fvVar.d, fvVar2.d));
    }

    public static fv c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new fv(i, i2, i3, i4);
    }

    public static fv d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final Insets e() {
        return v6.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fv.class != obj.getClass()) {
            return false;
        }
        fv fvVar = (fv) obj;
        return this.d == fvVar.d && this.a == fvVar.a && this.c == fvVar.c && this.b == fvVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
