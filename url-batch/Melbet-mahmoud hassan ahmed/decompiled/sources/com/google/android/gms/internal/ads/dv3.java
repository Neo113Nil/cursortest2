package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dv3 {

    /* renamed from: j, reason: collision with root package name */
    public static final dv3 f4346j = new dv3(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final dv3 f4347k = new dv3(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final dv3 f4348l = new dv3(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final dv3 f4349m = new dv3(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f4350a;

    /* renamed from: b, reason: collision with root package name */
    public final double f4351b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4352c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4353d;

    /* renamed from: e, reason: collision with root package name */
    public final double f4354e;

    /* renamed from: f, reason: collision with root package name */
    public final double f4355f;

    /* renamed from: g, reason: collision with root package name */
    public final double f4356g;

    /* renamed from: h, reason: collision with root package name */
    public final double f4357h;

    /* renamed from: i, reason: collision with root package name */
    public final double f4358i;

    public dv3(double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f4350a = d11;
        this.f4351b = d12;
        this.f4352c = d13;
        this.f4353d = d7;
        this.f4354e = d8;
        this.f4355f = d9;
        this.f4356g = d10;
        this.f4357h = d14;
        this.f4358i = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dv3.class != obj.getClass()) {
            return false;
        }
        dv3 dv3Var = (dv3) obj;
        return Double.compare(dv3Var.f4353d, this.f4353d) == 0 && Double.compare(dv3Var.f4354e, this.f4354e) == 0 && Double.compare(dv3Var.f4355f, this.f4355f) == 0 && Double.compare(dv3Var.f4356g, this.f4356g) == 0 && Double.compare(dv3Var.f4357h, this.f4357h) == 0 && Double.compare(dv3Var.f4358i, this.f4358i) == 0 && Double.compare(dv3Var.f4350a, this.f4350a) == 0 && Double.compare(dv3Var.f4351b, this.f4351b) == 0 && Double.compare(dv3Var.f4352c, this.f4352c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f4350a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f4351b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f4352c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f4353d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f4354e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f4355f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f4356g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f4357h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f4358i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f4346j)) {
            return "Rotate 0°";
        }
        if (equals(f4347k)) {
            return "Rotate 90°";
        }
        if (equals(f4348l)) {
            return "Rotate 180°";
        }
        if (equals(f4349m)) {
            return "Rotate 270°";
        }
        double d7 = this.f4350a;
        double d8 = this.f4351b;
        double d9 = this.f4352c;
        double d10 = this.f4353d;
        double d11 = this.f4354e;
        double d12 = this.f4355f;
        double d13 = this.f4356g;
        double d14 = this.f4357h;
        double d15 = this.f4358i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d7);
        sb.append(", v=");
        sb.append(d8);
        sb.append(", w=");
        sb.append(d9);
        sb.append(", a=");
        sb.append(d10);
        sb.append(", b=");
        sb.append(d11);
        sb.append(", c=");
        sb.append(d12);
        sb.append(", d=");
        sb.append(d13);
        sb.append(", tx=");
        sb.append(d14);
        sb.append(", ty=");
        sb.append(d15);
        sb.append("}");
        return sb.toString();
    }
}
