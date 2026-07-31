package b0;

import H2.AbstractC0080b;
import android.graphics.ColorFilter;

/* renamed from: b0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281n {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f4282a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4283b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4284c;

    public C0281n(long j3, int i3, ColorFilter colorFilter) {
        this.f4282a = colorFilter;
        this.f4283b = j3;
        this.f4284c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0281n)) {
            return false;
        }
        C0281n c0281n = (C0281n) obj;
        return C0288u.c(this.f4283b, c0281n.f4283b) && AbstractC0259J.n(this.f4284c, c0281n.f4284c);
    }

    public final int hashCode() {
        int i3 = C0288u.f4297g;
        return Integer.hashCode(this.f4284c) + (Long.hashCode(this.f4283b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0080b.q(this.f4283b, sb, ", blendMode=");
        int i3 = this.f4284c;
        sb.append((Object) (AbstractC0259J.n(i3, 0) ? "Clear" : AbstractC0259J.n(i3, 1) ? "Src" : AbstractC0259J.n(i3, 2) ? "Dst" : AbstractC0259J.n(i3, 3) ? "SrcOver" : AbstractC0259J.n(i3, 4) ? "DstOver" : AbstractC0259J.n(i3, 5) ? "SrcIn" : AbstractC0259J.n(i3, 6) ? "DstIn" : AbstractC0259J.n(i3, 7) ? "SrcOut" : AbstractC0259J.n(i3, 8) ? "DstOut" : AbstractC0259J.n(i3, 9) ? "SrcAtop" : AbstractC0259J.n(i3, 10) ? "DstAtop" : AbstractC0259J.n(i3, 11) ? "Xor" : AbstractC0259J.n(i3, 12) ? "Plus" : AbstractC0259J.n(i3, 13) ? "Modulate" : AbstractC0259J.n(i3, 14) ? "Screen" : AbstractC0259J.n(i3, 15) ? "Overlay" : AbstractC0259J.n(i3, 16) ? "Darken" : AbstractC0259J.n(i3, 17) ? "Lighten" : AbstractC0259J.n(i3, 18) ? "ColorDodge" : AbstractC0259J.n(i3, 19) ? "ColorBurn" : AbstractC0259J.n(i3, 20) ? "HardLight" : AbstractC0259J.n(i3, 21) ? "Softlight" : AbstractC0259J.n(i3, 22) ? "Difference" : AbstractC0259J.n(i3, 23) ? "Exclusion" : AbstractC0259J.n(i3, 24) ? "Multiply" : AbstractC0259J.n(i3, 25) ? "Hue" : AbstractC0259J.n(i3, 26) ? "Saturation" : AbstractC0259J.n(i3, 27) ? "Color" : AbstractC0259J.n(i3, 28) ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
