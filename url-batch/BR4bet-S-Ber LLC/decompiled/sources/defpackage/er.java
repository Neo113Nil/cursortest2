package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class er {
    public static final er e = new er(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public er(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static er a(er erVar, er erVar2) {
        return c(Math.max(erVar.a, erVar2.a), Math.max(erVar.b, erVar2.b), Math.max(erVar.c, erVar2.c), Math.max(erVar.d, erVar2.d));
    }

    public static er b(er erVar, er erVar2) {
        return c(Math.min(erVar.a, erVar2.a), Math.min(erVar.b, erVar2.b), Math.min(erVar.c, erVar2.c), Math.min(erVar.d, erVar2.d));
    }

    public static er c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new er(i, i2, i3, i4);
    }

    public static er d(Insets insets) {
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
        return n6.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er.class != obj.getClass()) {
            return false;
        }
        er erVar = (er) obj;
        return this.d == erVar.d && this.a == erVar.a && this.c == erVar.c && this.b == erVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
