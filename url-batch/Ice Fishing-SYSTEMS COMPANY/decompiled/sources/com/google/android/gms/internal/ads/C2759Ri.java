package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ri, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2759Ri {

    /* renamed from: a, reason: collision with root package name */
    public final int f27400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27401b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27402c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27403d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27404e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27405f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27406g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27407h;
    public final InterfaceC4291zi i;

    /* renamed from: j, reason: collision with root package name */
    public int f27408j;

    /* renamed from: k, reason: collision with root package name */
    public int f27409k;

    /* renamed from: l, reason: collision with root package name */
    public int f27410l;

    /* renamed from: m, reason: collision with root package name */
    public int f27411m;

    /* renamed from: n, reason: collision with root package name */
    public int f27412n;

    /* renamed from: o, reason: collision with root package name */
    public int f27413o;

    /* renamed from: p, reason: collision with root package name */
    public int f27414p;

    /* renamed from: q, reason: collision with root package name */
    public double f27415q;

    public C2759Ri(int i, int i4, float f6, float f9, int i9, boolean z8) {
        this.f27400a = i;
        this.f27401b = i4;
        this.f27402c = f6;
        this.f27403d = f9;
        this.f27404e = i / i9;
        this.f27405f = i / 400;
        int i10 = i / 65;
        this.f27406g = i10;
        this.f27407h = i10 + i10;
        this.i = z8 ? new C4183xi(this) : new J0.b(this);
    }

    public final void a(int i, int i4) {
        InterfaceC4291zi interfaceC4291zi = this.i;
        interfaceC4291zi.u(i4);
        Object t9 = interfaceC4291zi.t();
        Object n9 = interfaceC4291zi.n();
        int i9 = this.f27409k;
        int i10 = this.f27401b;
        System.arraycopy(t9, i * i10, n9, i9 * i10, i4 * i10);
        this.f27409k += i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i;
        float f6;
        int i4;
        double d2;
        int i9;
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        long j9;
        long j10;
        float f10 = this.f27402c;
        float f11 = this.f27403d;
        double d3 = f10 / f11;
        int i15 = this.f27409k;
        int i16 = this.f27400a;
        int i17 = this.f27401b;
        InterfaceC4291zi interfaceC4291zi = this.i;
        int i18 = 1;
        if (d3 > 1.0000100135803223d || d3 < 0.9999899864196777d) {
            int i19 = this.f27408j;
            int i20 = this.f27407h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f27413o;
                    if (i22 > 0) {
                        int min = Math.min(i20, i22);
                        a(i21, min);
                        this.f27413o -= min;
                        i21 += min;
                        f6 = f11;
                        d2 = d3;
                        i9 = i20;
                    } else {
                        int i23 = i16 > 4000 ? i16 / 4000 : i18;
                        int i24 = this.f27406g;
                        int i25 = this.f27405f;
                        if (i17 != i18) {
                            i = i17;
                        } else if (i23 == i18) {
                            i4 = interfaceC4291zi.f(i21, i25, i24);
                            f6 = f11;
                            i = i18;
                            int i26 = !interfaceC4291zi.i() ? this.f27414p : i4;
                            int i27 = i21 + i26;
                            interfaceC4291zi.l();
                            this.f27414p = i4;
                            double d9 = i26;
                            if (d3 <= 1.0d) {
                                double d10 = d3 - 1.0d;
                                if (d3 >= 2.0d) {
                                    d2 = d3;
                                    int i28 = i26;
                                    double d11 = (d9 / d10) + this.f27415q;
                                    i12 = (int) Math.round(d11);
                                    i11 = i28;
                                    this.f27415q = d11 - i12;
                                } else {
                                    i11 = i26;
                                    d2 = d3;
                                    double d12 = ((d9 * (2.0d - d2)) / d10) + this.f27415q;
                                    int round = (int) Math.round(d12);
                                    this.f27413o = round;
                                    this.f27415q = d12 - round;
                                    i12 = i11;
                                }
                                interfaceC4291zi.u(i12);
                                int i29 = i20;
                                int i30 = i12;
                                interfaceC4291zi.j(i30, i, this.f27409k, i21, i27);
                                this.f27409k += i30;
                                i9 = i29;
                                i21 = i11 + i30 + i21;
                            } else {
                                int i31 = i26;
                                d2 = d3;
                                int i32 = i20;
                                double d13 = 1.0d - d2;
                                if (d2 < 0.5d) {
                                    i9 = i32;
                                    double d14 = ((d9 * d2) / d13) + this.f27415q;
                                    int round2 = (int) Math.round(d14);
                                    this.f27415q = d14 - round2;
                                    i10 = round2;
                                } else {
                                    i9 = i32;
                                    double d15 = ((d9 * ((d2 + d2) - 1.0d)) / d13) + this.f27415q;
                                    int round3 = (int) Math.round(d15);
                                    this.f27413o = round3;
                                    this.f27415q = d15 - round3;
                                    i10 = i31;
                                }
                                int i33 = i31 + i10;
                                interfaceC4291zi.u(i33);
                                System.arraycopy(interfaceC4291zi.t(), i21 * i, interfaceC4291zi.n(), this.f27409k * i, i31 * i);
                                int i34 = i21;
                                interfaceC4291zi.j(i10, i, this.f27409k + i31, i27, i34);
                                this.f27409k += i33;
                                i21 = i34 + i10;
                            }
                        } else {
                            i = i18;
                        }
                        interfaceC4291zi.k(i21, i23);
                        f6 = f11;
                        int p6 = interfaceC4291zi.p(i25 / i23, i24 / i23);
                        if (i23 != 1) {
                            int i35 = p6 * i23;
                            int i36 = i23 * 4;
                            int i37 = i35 - i36;
                            if (i37 >= i25) {
                                i25 = i37;
                            }
                            int i38 = i35 + i36;
                            if (i38 <= i24) {
                                i24 = i38;
                            }
                            if (i == 1) {
                                i4 = interfaceC4291zi.f(i21, i25, i24);
                            } else {
                                interfaceC4291zi.k(i21, 1);
                                i4 = interfaceC4291zi.p(i25, i24);
                            }
                        } else {
                            i4 = p6;
                        }
                        if (!interfaceC4291zi.i()) {
                        }
                        int i272 = i21 + i26;
                        interfaceC4291zi.l();
                        this.f27414p = i4;
                        double d92 = i26;
                        if (d3 <= 1.0d) {
                        }
                    }
                    if (i21 + i9 > i19) {
                        break;
                    }
                    f11 = f6;
                    i20 = i9;
                    d3 = d2;
                    i18 = 1;
                }
                int i39 = this.f27408j - i21;
                System.arraycopy(interfaceC4291zi.t(), i21 * i17, interfaceC4291zi.t(), 0, i39 * i17);
                this.f27408j = i39;
                f9 = this.f27404e * f6;
                if (f9 != 1.0f || this.f27409k == i15) {
                }
                long j11 = (long) (i16 / f9);
                long j12 = i16;
                while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                    j11 /= 2;
                    j12 /= 2;
                }
                int i40 = this.f27409k - i15;
                interfaceC4291zi.h(i40);
                System.arraycopy(interfaceC4291zi.n(), i15 * i17, interfaceC4291zi.r(), this.f27410l * i17, i40 * i17);
                this.f27409k = i15;
                this.f27410l += i40;
                int i41 = 0;
                while (true) {
                    i13 = this.f27410l - 1;
                    if (i41 >= i13) {
                        break;
                    }
                    while (true) {
                        i14 = this.f27411m + 1;
                        j9 = i14;
                        long j13 = j9 * j11;
                        j10 = this.f27412n;
                        if (j13 <= j10 * j12) {
                            break;
                        }
                        interfaceC4291zi.u(1);
                        interfaceC4291zi.g(i41, j12, j11);
                        this.f27412n++;
                        this.f27409k++;
                    }
                    this.f27411m = i14;
                    if (j9 == j12) {
                        this.f27411m = 0;
                        PA.T(j10 == j11);
                        this.f27412n = 0;
                    }
                    i41++;
                }
                if (i13 != 0) {
                    System.arraycopy(interfaceC4291zi.r(), i13 * i17, interfaceC4291zi.r(), 0, (this.f27410l - i13) * i17);
                    this.f27410l -= i13;
                    return;
                }
                return;
            }
        } else {
            a(0, this.f27408j);
            this.f27408j = 0;
        }
        f6 = f11;
        f9 = this.f27404e * f6;
        if (f9 != 1.0f) {
        }
    }
}
