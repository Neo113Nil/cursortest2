package defpackage;

import android.graphics.Point;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class wa0 {
    public final int a;
    public final int b;
    public final Point c;

    public wa0(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.a = i;
        this.b = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wa0) {
            wa0 wa0Var = (wa0) obj;
            if (this.a == wa0Var.a && this.b == wa0Var.b && this.c.equals(wa0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.b);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
