package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3847rN {

    /* renamed from: j, reason: collision with root package name */
    public static final C3847rN f34010j = new C3847rN(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C3847rN f34011k = new C3847rN(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C3847rN f34012l = new C3847rN(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C3847rN f34013m = new C3847rN(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f34014a;

    /* renamed from: b, reason: collision with root package name */
    public final double f34015b;

    /* renamed from: c, reason: collision with root package name */
    public final double f34016c;

    /* renamed from: d, reason: collision with root package name */
    public final double f34017d;

    /* renamed from: e, reason: collision with root package name */
    public final double f34018e;

    /* renamed from: f, reason: collision with root package name */
    public final double f34019f;

    /* renamed from: g, reason: collision with root package name */
    public final double f34020g;

    /* renamed from: h, reason: collision with root package name */
    public final double f34021h;
    public final double i;

    public C3847rN(double d2, double d3, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f34014a = d11;
        this.f34015b = d12;
        this.f34016c = d13;
        this.f34017d = d2;
        this.f34018e = d3;
        this.f34019f = d9;
        this.f34020g = d10;
        this.f34021h = d14;
        this.i = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3847rN.class != obj.getClass()) {
            return false;
        }
        C3847rN c3847rN = (C3847rN) obj;
        return Double.compare(c3847rN.f34017d, this.f34017d) == 0 && Double.compare(c3847rN.f34018e, this.f34018e) == 0 && Double.compare(c3847rN.f34019f, this.f34019f) == 0 && Double.compare(c3847rN.f34020g, this.f34020g) == 0 && Double.compare(c3847rN.f34021h, this.f34021h) == 0 && Double.compare(c3847rN.i, this.i) == 0 && Double.compare(c3847rN.f34014a, this.f34014a) == 0 && Double.compare(c3847rN.f34015b, this.f34015b) == 0 && Double.compare(c3847rN.f34016c, this.f34016c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f34014a);
        long j9 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f34015b);
        long j10 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f34016c);
        long j11 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f34017d);
        long j12 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f34018e);
        long j13 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f34019f);
        long j14 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f34020g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f34021h);
        long j15 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j9) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j15)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f34010j)) {
            return "Rotate 0°";
        }
        if (equals(f34011k)) {
            return "Rotate 90°";
        }
        if (equals(f34012l)) {
            return "Rotate 180°";
        }
        if (equals(f34013m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f34014a);
        sb.append(", v=");
        sb.append(this.f34015b);
        sb.append(", w=");
        sb.append(this.f34016c);
        sb.append(", a=");
        sb.append(this.f34017d);
        sb.append(", b=");
        sb.append(this.f34018e);
        sb.append(", c=");
        sb.append(this.f34019f);
        sb.append(", d=");
        sb.append(this.f34020g);
        sb.append(", tx=");
        sb.append(this.f34021h);
        sb.append(", ty=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
