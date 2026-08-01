package o3;

import android.graphics.Point;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f7409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7410b;

    /* renamed from: c, reason: collision with root package name */
    public final Point f7411c;

    public k(int i3, int i10, Point point) {
        int i11 = point.x;
        int i12 = point.y;
        this.f7409a = i3;
        this.f7410b = i10;
        this.f7411c = new Point(i11, i12);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f7409a == kVar.f7409a && this.f7410b == kVar.f7410b && this.f7411c.equals(kVar.f7411c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7411c.hashCode() + (((this.f7409a * 31) + this.f7410b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RoundedCornerCompat{position=");
        int i3 = this.f7409a;
        sb2.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb2.append(", radius=");
        sb2.append(this.f7410b);
        sb2.append(", center=");
        sb2.append(this.f7411c);
        sb2.append('}');
        return sb2.toString();
    }
}
