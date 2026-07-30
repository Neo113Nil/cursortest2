package z0;

import android.graphics.ColorFilter;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f10010a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10011b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10012c;

    public m(long j8, int i7, ColorFilter colorFilter) {
        this.f10010a = colorFilter;
        this.f10011b = j8;
        this.f10012c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return u.c(this.f10011b, mVar.f10011b) && this.f10012c == mVar.f10012c;
    }

    public final int hashCode() {
        int i7 = u.f10058h;
        return Integer.hashCode(this.f10012c) + (Long.hashCode(this.f10011b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        a0.m.r(this.f10011b, sb, ", blendMode=");
        int i7 = this.f10012c;
        sb.append((Object) (i7 == 0 ? "Clear" : i7 == 1 ? "Src" : i7 == 2 ? "Dst" : i7 == 3 ? "SrcOver" : i7 == 4 ? "DstOver" : i7 == 5 ? "SrcIn" : i7 == 6 ? "DstIn" : i7 == 7 ? "SrcOut" : i7 == 8 ? "DstOut" : i7 == 9 ? "SrcAtop" : i7 == 10 ? "DstAtop" : i7 == 11 ? "Xor" : i7 == 12 ? "Plus" : i7 == 13 ? "Modulate" : i7 == 14 ? "Screen" : i7 == 15 ? "Overlay" : i7 == 16 ? "Darken" : i7 == 17 ? "Lighten" : i7 == 18 ? "ColorDodge" : i7 == 19 ? "ColorBurn" : i7 == 20 ? "HardLight" : i7 == 21 ? "Softlight" : i7 == 22 ? "Difference" : i7 == 23 ? "Exclusion" : i7 == 24 ? "Multiply" : i7 == 25 ? "Hue" : i7 == 26 ? "Saturation" : i7 == 27 ? "Color" : i7 == 28 ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
