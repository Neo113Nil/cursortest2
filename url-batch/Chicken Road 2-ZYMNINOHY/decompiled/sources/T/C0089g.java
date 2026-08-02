package T;

import E.AbstractC0005f;
import java.util.Arrays;

/* renamed from: T.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089g {

    /* renamed from: h, reason: collision with root package name */
    public static final C0089g f2784h = new C0089g(1, 2, 3, null, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2785a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2786b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2787c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2788d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2789e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2790f;

    /* renamed from: g, reason: collision with root package name */
    public int f2791g;

    static {
        AbstractC0005f.s(0, 1, 2, 3, 4);
        W.J.G(5);
    }

    public C0089g(int i4, int i5, int i6, byte[] bArr, int i7, int i8) {
        this.f2785a = i4;
        this.f2786b = i5;
        this.f2787c = i6;
        this.f2788d = bArr;
        this.f2789e = i7;
        this.f2790f = i8;
    }

    public static String a(int i4) {
        return i4 != -1 ? i4 != 1 ? i4 != 2 ? AbstractC0005f.j(i4, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i4) {
        return i4 != -1 ? i4 != 6 ? i4 != 1 ? i4 != 2 ? AbstractC0005f.j(i4, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i4) {
        return i4 != -1 ? i4 != 10 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 6 ? i4 != 7 ? AbstractC0005f.j(i4, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(C0089g c0089g) {
        if (c0089g == null) {
            return true;
        }
        int i4 = c0089g.f2785a;
        if (i4 != -1 && i4 != 1 && i4 != 2) {
            return false;
        }
        int i5 = c0089g.f2786b;
        if (i5 != -1 && i5 != 2) {
            return false;
        }
        int i6 = c0089g.f2787c;
        if ((i6 != -1 && i6 != 3) || c0089g.f2788d != null) {
            return false;
        }
        int i7 = c0089g.f2790f;
        if (i7 != -1 && i7 != 8) {
            return false;
        }
        int i8 = c0089g.f2789e;
        return i8 == -1 || i8 == 8;
    }

    public static int f(int i4) {
        if (i4 == 1) {
            return 1;
        }
        if (i4 != 9) {
            return (i4 == 4 || i4 == 5 || i4 == 6 || i4 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i4) {
        if (i4 == 1) {
            return 3;
        }
        if (i4 == 4) {
            return 10;
        }
        if (i4 == 13) {
            return 2;
        }
        if (i4 == 16) {
            return 6;
        }
        if (i4 != 18) {
            return (i4 == 6 || i4 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f2785a == -1 || this.f2786b == -1 || this.f2787c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0089g.class == obj.getClass()) {
            C0089g c0089g = (C0089g) obj;
            if (this.f2785a == c0089g.f2785a && this.f2786b == c0089g.f2786b && this.f2787c == c0089g.f2787c && Arrays.equals(this.f2788d, c0089g.f2788d) && this.f2789e == c0089g.f2789e && this.f2790f == c0089g.f2790f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2791g == 0) {
            this.f2791g = ((((Arrays.hashCode(this.f2788d) + ((((((527 + this.f2785a) * 31) + this.f2786b) * 31) + this.f2787c) * 31)) * 31) + this.f2789e) * 31) + this.f2790f;
        }
        return this.f2791g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f2785a));
        sb.append(", ");
        sb.append(a(this.f2786b));
        sb.append(", ");
        sb.append(c(this.f2787c));
        sb.append(", ");
        sb.append(this.f2788d != null);
        sb.append(", ");
        String str2 = "NA";
        int i4 = this.f2789e;
        if (i4 != -1) {
            str = i4 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i5 = this.f2790f;
        if (i5 != -1) {
            str2 = i5 + "bit Chroma";
        }
        return AbstractC0005f.q(sb, str2, ")");
    }
}
