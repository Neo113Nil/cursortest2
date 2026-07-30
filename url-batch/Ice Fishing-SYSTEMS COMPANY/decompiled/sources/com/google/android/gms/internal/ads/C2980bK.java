package com.google.android.gms.internal.ads;

import java.util.Arrays;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.bK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2980bK {

    /* renamed from: h, reason: collision with root package name */
    public static final C2980bK f29469h;

    /* renamed from: a, reason: collision with root package name */
    public final int f29470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29472c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f29473d;

    /* renamed from: e, reason: collision with root package name */
    public final int f29474e;

    /* renamed from: f, reason: collision with root package name */
    public final int f29475f;

    /* renamed from: g, reason: collision with root package name */
    public int f29476g;

    static {
        int i = -1;
        f29469h = new C2980bK(1, 2, 3, null, i, i);
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ C2980bK(int i, int i4, int i9, byte[] bArr, int i10, int i11) {
        this.f29470a = i;
        this.f29471b = i4;
        this.f29472c = i9;
        this.f29473d = bArr;
        this.f29474e = i10;
        this.f29475f = i11;
    }

    public static boolean a(C2980bK c2980bK) {
        if (c2980bK == null) {
            return true;
        }
        int i = c2980bK.f29470a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i4 = c2980bK.f29471b;
        if (i4 != -1 && i4 != 2) {
            return false;
        }
        int i9 = c2980bK.f29472c;
        if ((i9 != -1 && i9 != 3) || c2980bK.f29473d != null) {
            return false;
        }
        int i10 = c2980bK.f29475f;
        if (i10 != -1 && i10 != 8) {
            return false;
        }
        int i11 = c2980bK.f29474e;
        return i11 == -1 || i11 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? D.y.j(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? D.y.j(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? D.y.j(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.f29470a == -1 || this.f29471b == -1 || this.f29472c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2980bK.class == obj.getClass()) {
            C2980bK c2980bK = (C2980bK) obj;
            if (this.f29470a == c2980bK.f29470a && this.f29471b == c2980bK.f29471b && this.f29472c == c2980bK.f29472c && Arrays.equals(this.f29473d, c2980bK.f29473d) && this.f29474e == c2980bK.f29474e && this.f29475f == c2980bK.f29475f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f29476g;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((Arrays.hashCode(this.f29473d) + ((((((this.f29470a + 527) * 31) + this.f29471b) * 31) + this.f29472c) * 31)) * 31) + this.f29474e) * 31) + this.f29475f;
        this.f29476g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String e6 = e(this.f29470a);
        String g9 = g(this.f29471b);
        String f6 = f(this.f29472c);
        int i = this.f29474e;
        String e9 = i != -1 ? AbstractC5051n.e(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i4 = this.f29475f;
        String e10 = i4 != -1 ? AbstractC5051n.e(i4, "bit Chroma", new StringBuilder(String.valueOf(i4).length() + 10)) : "NA";
        boolean z8 = this.f29473d != null;
        StringBuilder sb = new StringBuilder(AbstractC5051n.a(AbstractC5051n.a(AbstractC5051n.a(AbstractC5051n.a(e6.length() + 12, 2, g9) + f6.length() + 2, 2, String.valueOf(z8)), 2, e9), 1, e10));
        sb.append("ColorInfo(");
        sb.append(e6);
        sb.append(", ");
        sb.append(g9);
        sb.append(", ");
        sb.append(f6);
        sb.append(", ");
        sb.append(z8);
        AbstractC5051n.j(sb, ", ", e9, ", ", e10);
        sb.append(")");
        return sb.toString();
    }
}
