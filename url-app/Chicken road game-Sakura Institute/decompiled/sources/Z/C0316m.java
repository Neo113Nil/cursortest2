package Z;

import A.AbstractC0017m;
import android.graphics.ColorFilter;
import y2.y;

/* renamed from: Z.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316m {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f4534a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4535b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4536c;

    public C0316m(long j4, int i2, ColorFilter colorFilter) {
        this.f4534a = colorFilter;
        this.f4535b = j4;
        this.f4536c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0316m)) {
            return false;
        }
        C0316m c0316m = (C0316m) obj;
        return C0323u.c(this.f4535b, c0316m.f4535b) && K.o(this.f4536c, c0316m.f4536c);
    }

    public final int hashCode() {
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Integer.hashCode(this.f4536c) + (Long.hashCode(this.f4535b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC0017m.s(this.f4535b, sb, ", blendMode=");
        int i2 = this.f4536c;
        sb.append((Object) (K.o(i2, 0) ? "Clear" : K.o(i2, 1) ? "Src" : K.o(i2, 2) ? "Dst" : K.o(i2, 3) ? "SrcOver" : K.o(i2, 4) ? "DstOver" : K.o(i2, 5) ? "SrcIn" : K.o(i2, 6) ? "DstIn" : K.o(i2, 7) ? "SrcOut" : K.o(i2, 8) ? "DstOut" : K.o(i2, 9) ? "SrcAtop" : K.o(i2, 10) ? "DstAtop" : K.o(i2, 11) ? "Xor" : K.o(i2, 12) ? "Plus" : K.o(i2, 13) ? "Modulate" : K.o(i2, 14) ? "Screen" : K.o(i2, 15) ? "Overlay" : K.o(i2, 16) ? "Darken" : K.o(i2, 17) ? "Lighten" : K.o(i2, 18) ? "ColorDodge" : K.o(i2, 19) ? "ColorBurn" : K.o(i2, 20) ? "HardLight" : K.o(i2, 21) ? "Softlight" : K.o(i2, 22) ? "Difference" : K.o(i2, 23) ? "Exclusion" : K.o(i2, 24) ? "Multiply" : K.o(i2, 25) ? "Hue" : K.o(i2, 26) ? "Saturation" : K.o(i2, 27) ? "Color" : K.o(i2, 28) ? "Luminosity" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
