package defpackage;

import android.graphics.Point;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nx1 {
    public final int PxuCJdSBwIXG;
    public final Point TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public nx1(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nx1) {
            nx1 nx1Var = (nx1) obj;
            if (this.PxuCJdSBwIXG == nx1Var.PxuCJdSBwIXG && this.lS5Rgt96tfkO == nx1Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu.equals(nx1Var.TSizfFm2Yiuu)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + (((this.PxuCJdSBwIXG * 31) + this.lS5Rgt96tfkO) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.PxuCJdSBwIXG;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(", center=");
        sb.append(this.TSizfFm2Yiuu);
        sb.append('}');
        return sb.toString();
    }
}
