package I;

import android.graphics.Point;

/* renamed from: I.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127x {

    /* renamed from: a, reason: collision with root package name */
    public final int f1244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1245b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f1246c;

    public C0127x(int i2, int i5, Point point) {
        int i7 = point.x;
        int i8 = point.y;
        this.f1244a = i2;
        this.f1245b = i5;
        this.f1246c = new Point(i7, i8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0127x) {
            C0127x c0127x = (C0127x) obj;
            if (this.f1244a == c0127x.f1244a && this.f1245b == c0127x.f1245b && this.f1246c.equals(c0127x.f1246c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1246c.hashCode() + (((this.f1244a * 31) + this.f1245b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i2 = this.f1244a;
        sb.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f1245b);
        sb.append(", center=");
        sb.append(this.f1246c);
        sb.append('}');
        return sb.toString();
    }
}
