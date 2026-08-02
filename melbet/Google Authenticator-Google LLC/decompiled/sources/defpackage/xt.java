package defpackage;

import android.graphics.Point;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xt {
    public final int a;
    private final int b;
    private final Point c;

    public xt(int i, int i2, int i3, int i4) {
        this.b = i;
        this.a = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xt) {
            xt xtVar = (xt) obj;
            if (this.b == xtVar.b && this.a == xtVar.a && this.c.equals(xtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.a) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.b;
        sb.append(i != 0 ? i != 1 ? i != 2 ? "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.a);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
