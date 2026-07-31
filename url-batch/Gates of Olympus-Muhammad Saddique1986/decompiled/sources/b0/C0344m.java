package b0;

import android.graphics.ColorFilter;

/* renamed from: b0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f5424a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5426c;

    public C0344m(long j3, int i3, ColorFilter colorFilter) {
        this.f5424a = colorFilter;
        this.f5425b = j3;
        this.f5426c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0344m)) {
            return false;
        }
        C0344m c0344m = (C0344m) obj;
        return C0352v.c(this.f5425b, c0344m.f5425b) && M.p(this.f5426c, c0344m.f5426c);
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Integer.hashCode(this.f5426c) + (Long.hashCode(this.f5425b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        A.k.p(this.f5425b, sb, ", blendMode=");
        int i3 = this.f5426c;
        sb.append((Object) (M.p(i3, 0) ? "Clear" : M.p(i3, 1) ? "Src" : M.p(i3, 2) ? "Dst" : M.p(i3, 3) ? "SrcOver" : M.p(i3, 4) ? "DstOver" : M.p(i3, 5) ? "SrcIn" : M.p(i3, 6) ? "DstIn" : M.p(i3, 7) ? "SrcOut" : M.p(i3, 8) ? "DstOut" : M.p(i3, 9) ? "SrcAtop" : M.p(i3, 10) ? "DstAtop" : M.p(i3, 11) ? "Xor" : M.p(i3, 12) ? "Plus" : M.p(i3, 13) ? "Modulate" : M.p(i3, 14) ? "Screen" : M.p(i3, 15) ? "Overlay" : M.p(i3, 16) ? "Darken" : M.p(i3, 17) ? "Lighten" : M.p(i3, 18) ? "ColorDodge" : M.p(i3, 19) ? "ColorBurn" : M.p(i3, 20) ? "HardLight" : M.p(i3, 21) ? "Softlight" : M.p(i3, 22) ? "Difference" : M.p(i3, 23) ? "Exclusion" : M.p(i3, 24) ? "Multiply" : M.p(i3, 25) ? "Hue" : M.p(i3, 26) ? "Saturation" : M.p(i3, 27) ? "Color" : M.p(i3, 28) ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
