package defpackage;

import android.graphics.Insets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vb {
    public static final vb a = new vb(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public vb(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static vb b(vb vbVar, vb vbVar2) {
        return d(Math.max(vbVar.b, vbVar2.b), Math.max(vbVar.c, vbVar2.c), Math.max(vbVar.d, vbVar2.d), Math.max(vbVar.e, vbVar2.e));
    }

    public static vb c(vb vbVar, vb vbVar2) {
        int i = vbVar.e;
        int i2 = vbVar2.e;
        int i3 = vbVar.d;
        int i4 = vbVar2.d;
        return d(Math.min(vbVar.b, vbVar2.b), Math.min(vbVar.c, vbVar2.c), Math.min(i3, i4), Math.min(i, i2));
    }

    public static vb d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new vb(i, i2, i3, i4);
    }

    public static vb e(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return d(i, i2, i3, i4);
    }

    public final Insets a() {
        Insets of;
        of = Insets.of(this.b, this.c, this.d, this.e);
        return of;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vb vbVar = (vb) obj;
        return this.e == vbVar.e && this.b == vbVar.b && this.d == vbVar.d && this.c == vbVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
