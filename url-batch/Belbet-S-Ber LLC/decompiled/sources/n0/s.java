package n0;

import android.graphics.Point;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f2827a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2828b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f2829c;

    public s(int i, int i4, Point point) {
        int i5 = point.x;
        int i6 = point.y;
        this.f2827a = i;
        this.f2828b = i4;
        this.f2829c = new Point(i5, i6);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f2827a == sVar.f2827a && this.f2828b == sVar.f2828b && this.f2829c.equals(sVar.f2829c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2829c.hashCode() + (((this.f2827a * 31) + this.f2828b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f2827a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.f2828b);
        sb.append(", center=");
        sb.append(this.f2829c);
        sb.append('}');
        return sb.toString();
    }
}
