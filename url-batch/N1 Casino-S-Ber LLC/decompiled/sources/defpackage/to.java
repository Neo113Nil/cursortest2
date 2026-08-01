package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class to {
    public static final to e = new to(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public to(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static to a(to toVar, to toVar2) {
        return c(Math.max(toVar.a, toVar2.a), Math.max(toVar.b, toVar2.b), Math.max(toVar.c, toVar2.c), Math.max(toVar.d, toVar2.d));
    }

    public static to b(to toVar, to toVar2) {
        return c(Math.min(toVar.a, toVar2.a), Math.min(toVar.b, toVar2.b), Math.min(toVar.c, toVar2.c), Math.min(toVar.d, toVar2.d));
    }

    public static to c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new to(i, i2, i3, i4);
    }

    public static to d(Insets insets) {
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
        return d6.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || to.class != obj.getClass()) {
            return false;
        }
        to toVar = (to) obj;
        return this.d == toVar.d && this.a == toVar.a && this.c == toVar.c && this.b == toVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
