package d0;

import H2.AbstractC0080b;
import Z1.i;
import b0.AbstractC0259J;

/* renamed from: d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326g extends AbstractC0322c {

    /* renamed from: b, reason: collision with root package name */
    public final float f4449b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4450c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4451d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4452e;

    public C0326g(float f3, float f4, int i3, int i4, int i5) {
        f4 = (i5 & 2) != 0 ? 4.0f : f4;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        i4 = (i5 & 8) != 0 ? 0 : i4;
        this.f4449b = f3;
        this.f4450c = f4;
        this.f4451d = i3;
        this.f4452e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0326g)) {
            return false;
        }
        C0326g c0326g = (C0326g) obj;
        return this.f4449b == c0326g.f4449b && this.f4450c == c0326g.f4450c && AbstractC0259J.q(this.f4451d, c0326g.f4451d) && AbstractC0259J.r(this.f4452e, c0326g.f4452e) && i.a(null, null);
    }

    public final int hashCode() {
        return AbstractC0080b.b(this.f4452e, AbstractC0080b.b(this.f4451d, AbstractC0080b.a(this.f4450c, Float.hashCode(this.f4449b) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f4449b);
        sb.append(", miter=");
        sb.append(this.f4450c);
        sb.append(", cap=");
        int i3 = this.f4451d;
        String str = "Unknown";
        sb.append((Object) (AbstractC0259J.q(i3, 0) ? "Butt" : AbstractC0259J.q(i3, 1) ? "Round" : AbstractC0259J.q(i3, 2) ? "Square" : "Unknown"));
        sb.append(", join=");
        int i4 = this.f4452e;
        if (AbstractC0259J.r(i4, 0)) {
            str = "Miter";
        } else if (AbstractC0259J.r(i4, 1)) {
            str = "Round";
        } else if (AbstractC0259J.r(i4, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
