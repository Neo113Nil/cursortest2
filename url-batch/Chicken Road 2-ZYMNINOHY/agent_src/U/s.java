package U;

import a.AbstractC0124a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3086b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3087c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3088d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3089e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3090f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3091g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3092h;

    /* renamed from: i, reason: collision with root package name */
    public final q f3093i;

    /* renamed from: j, reason: collision with root package name */
    public int f3094j;

    /* renamed from: k, reason: collision with root package name */
    public int f3095k;

    /* renamed from: l, reason: collision with root package name */
    public int f3096l;

    /* renamed from: m, reason: collision with root package name */
    public int f3097m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public int f3098p;

    /* renamed from: q, reason: collision with root package name */
    public double f3099q;

    public s(int i4, int i5, float f4, float f5, int i6, boolean z) {
        this.f3085a = i4;
        this.f3086b = i5;
        this.f3087c = f4;
        this.f3088d = f5;
        this.f3089e = i4 / i6;
        this.f3090f = i4 / 400;
        int i7 = i4 / 65;
        this.f3091g = i7;
        this.f3092h = i7 * 2;
        this.f3093i = z ? new p(this) : new r(this);
    }

    public final void a(int i4, int i5) {
        q qVar = this.f3093i;
        qVar.j(i5);
        Object h2 = qVar.h();
        int i6 = this.f3086b;
        System.arraycopy(h2, i4 * i6, qVar.i(), this.f3095k * i6, i6 * i5);
        this.f3095k += i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f4;
        int i4;
        double d4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j4;
        long j5;
        int i12 = this.f3095k;
        float f5 = this.f3087c;
        float f6 = this.f3088d;
        double d5 = f5 / f6;
        float f7 = this.f3089e * f6;
        int i13 = this.f3085a;
        int i14 = 1;
        q qVar = this.f3093i;
        int i15 = this.f3086b;
        if (d5 > 1.0000100135803223d || d5 < 0.9999899864196777d) {
            int i16 = this.f3094j;
            int i17 = this.f3092h;
            if (i16 >= i17) {
                int i18 = 0;
                while (true) {
                    int i19 = this.o;
                    if (i19 > 0) {
                        int min = Math.min(i17, i19);
                        a(i18, min);
                        this.o -= min;
                        i18 += min;
                        f4 = f7;
                        d4 = d5;
                        i7 = i14;
                        i5 = i17;
                    } else {
                        int i20 = i13 > 4000 ? i13 / 4000 : i14;
                        int i21 = this.f3091g;
                        int i22 = this.f3090f;
                        if (i15 == i14 && i20 == i14) {
                            i4 = qVar.f(i18, i22, i21);
                            f4 = f7;
                        } else {
                            qVar.e(i18, i20);
                            f4 = f7;
                            int q4 = qVar.q(i22 / i20, i21 / i20);
                            if (i20 != i14) {
                                int i23 = q4 * i20;
                                int i24 = i20 * 4;
                                int i25 = i23 - i24;
                                int i26 = i23 + i24;
                                if (i25 >= i22) {
                                    i22 = i25;
                                }
                                if (i26 <= i21) {
                                    i21 = i26;
                                }
                                if (i15 == i14) {
                                    i4 = qVar.f(i18, i22, i21);
                                } else {
                                    qVar.e(i18, i14);
                                    i4 = qVar.q(i22, i21);
                                }
                            } else {
                                i4 = q4;
                            }
                        }
                        int i27 = qVar.k() ? this.f3098p : i4;
                        qVar.g();
                        this.f3098p = i4;
                        if (d5 > 1.0d) {
                            if (d5 >= 2.0d) {
                                i8 = i14;
                                double d6 = (i27 / (d5 - 1.0d)) + this.f3099q;
                                i9 = (int) Math.round(d6);
                                d4 = d5;
                                this.f3099q = d6 - i9;
                                qVar = qVar;
                            } else {
                                d4 = d5;
                                i8 = i14;
                                double d7 = (((2.0d - d4) * i27) / (d4 - 1.0d)) + this.f3099q;
                                int round = (int) Math.round(d7);
                                this.o = round;
                                this.f3099q = d7 - round;
                                i9 = i27;
                            }
                            qVar.j(i9);
                            int i28 = i17;
                            int i29 = i9;
                            qVar.m(i29, this.f3086b, this.f3095k, i18, i18 + i27);
                            this.f3095k += i29;
                            i18 = i27 + i29 + i18;
                            i5 = i28;
                            i7 = i8;
                        } else {
                            d4 = d5;
                            int i30 = i14;
                            int i31 = i17;
                            if (d4 < 0.5d) {
                                i5 = i31;
                                double d8 = ((i27 * d4) / (1.0d - d4)) + this.f3099q;
                                int round2 = (int) Math.round(d8);
                                this.f3099q = d8 - round2;
                                i6 = round2;
                            } else {
                                i5 = i31;
                                double d9 = ((((d4 * 2.0d) - 1.0d) * i27) / (1.0d - d4)) + this.f3099q;
                                int round3 = (int) Math.round(d9);
                                this.o = round3;
                                this.f3099q = d9 - round3;
                                i6 = i27;
                            }
                            int i32 = i27 + i6;
                            qVar.j(i32);
                            i7 = i30;
                            System.arraycopy(qVar.h(), i18 * i15, qVar.i(), this.f3095k * i15, i27 * i15);
                            int i33 = i18;
                            qVar.m(i6, this.f3086b, this.f3095k + i27, i27 + i18, i33);
                            this.f3095k += i32;
                            i18 = i33 + i6;
                        }
                    }
                    if (i18 + i5 > i16) {
                        break;
                    }
                    i17 = i5;
                    f7 = f4;
                    i14 = i7;
                    d5 = d4;
                }
                int i34 = this.f3094j - i18;
                System.arraycopy(qVar.h(), i18 * i15, qVar.h(), 0, i34 * i15);
                this.f3094j = i34;
                if (f4 != 1.0f || this.f3095k == i12) {
                }
                long j6 = (long) (i13 / f4);
                long j7 = i13;
                while (j6 != 0 && j7 != 0 && j6 % 2 == 0 && j7 % 2 == 0) {
                    j6 /= 2;
                    j7 /= 2;
                }
                int i35 = this.f3095k - i12;
                qVar.n(i35);
                System.arraycopy(qVar.i(), i12 * i15, qVar.l(), this.f3096l * i15, i35 * i15);
                this.f3095k = i12;
                this.f3096l += i35;
                int i36 = 0;
                while (true) {
                    i10 = this.f3096l - 1;
                    if (i36 >= i10) {
                        break;
                    }
                    while (true) {
                        i11 = this.f3097m + 1;
                        j4 = i11;
                        long j8 = j4 * j6;
                        j5 = this.n;
                        if (j8 <= j5 * j7) {
                            break;
                        }
                        int i37 = i7;
                        qVar.j(i37);
                        qVar.c(i36, j7, j6);
                        this.n += i37;
                        this.f3095k += i37;
                    }
                    int i38 = i7;
                    this.f3097m = i11;
                    if (j4 == j7) {
                        this.f3097m = 0;
                        AbstractC0124a.t(j5 == j6 ? i38 : 0);
                        this.n = 0;
                    }
                    i36++;
                    i7 = i38;
                }
                if (i10 == 0) {
                    return;
                }
                System.arraycopy(qVar.l(), i10 * i15, qVar.l(), 0, (this.f3096l - i10) * i15);
                this.f3096l -= i10;
                return;
            }
        } else {
            a(0, this.f3094j);
            this.f3094j = 0;
        }
        f4 = f7;
        i7 = 1;
        if (f4 != 1.0f) {
        }
    }
}
