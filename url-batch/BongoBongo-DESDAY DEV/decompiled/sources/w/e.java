package w;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3989A;

    /* renamed from: B, reason: collision with root package name */
    public int f3990B;

    /* renamed from: C, reason: collision with root package name */
    public int f3991C;

    /* renamed from: D, reason: collision with root package name */
    public int f3992D;

    /* renamed from: E, reason: collision with root package name */
    public float f3993E;

    /* renamed from: F, reason: collision with root package name */
    public float f3994F;
    public String G;

    /* renamed from: H, reason: collision with root package name */
    public float f3995H;

    /* renamed from: I, reason: collision with root package name */
    public float f3996I;

    /* renamed from: J, reason: collision with root package name */
    public int f3997J;

    /* renamed from: K, reason: collision with root package name */
    public int f3998K;

    /* renamed from: L, reason: collision with root package name */
    public int f3999L;

    /* renamed from: M, reason: collision with root package name */
    public int f4000M;

    /* renamed from: N, reason: collision with root package name */
    public int f4001N;

    /* renamed from: O, reason: collision with root package name */
    public int f4002O;

    /* renamed from: P, reason: collision with root package name */
    public int f4003P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4004Q;

    /* renamed from: R, reason: collision with root package name */
    public float f4005R;

    /* renamed from: S, reason: collision with root package name */
    public float f4006S;

    /* renamed from: T, reason: collision with root package name */
    public int f4007T;

    /* renamed from: U, reason: collision with root package name */
    public int f4008U;

    /* renamed from: V, reason: collision with root package name */
    public int f4009V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4010W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4011X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4012Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4013Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4014a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4015a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4016b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4017b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4018c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4019c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4020d0;

    /* renamed from: e, reason: collision with root package name */
    public int f4021e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4022e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4023f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4024f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4025g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4026g0;

    /* renamed from: h, reason: collision with root package name */
    public int f4027h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4028h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4029i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4030j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4031j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4032k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4033k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4034l;
    public float l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4035m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4036m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4037n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4038n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4039o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4040o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4041p;
    public t.d p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4042q;

    /* renamed from: r, reason: collision with root package name */
    public float f4043r;

    /* renamed from: s, reason: collision with root package name */
    public int f4044s;

    /* renamed from: t, reason: collision with root package name */
    public int f4045t;

    /* renamed from: u, reason: collision with root package name */
    public int f4046u;

    /* renamed from: v, reason: collision with root package name */
    public int f4047v;

    /* renamed from: w, reason: collision with root package name */
    public int f4048w;

    /* renamed from: x, reason: collision with root package name */
    public int f4049x;

    /* renamed from: y, reason: collision with root package name */
    public int f4050y;

    /* renamed from: z, reason: collision with root package name */
    public int f4051z;

    public final void a() {
        this.f4020d0 = false;
        this.f4015a0 = true;
        this.f4017b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f4010W) {
            this.f4015a0 = false;
            if (this.f3999L == 0) {
                this.f3999L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f4011X) {
            this.f4017b0 = false;
            if (this.f4000M == 0) {
                this.f4000M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f4015a0 = false;
            if (i == 0 && this.f3999L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4010W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4017b0 = false;
            if (i2 == 0 && this.f4000M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4011X = true;
            }
        }
        if (this.f4018c == -1.0f && this.f4014a == -1 && this.f4016b == -1) {
            return;
        }
        this.f4020d0 = true;
        this.f4015a0 = true;
        this.f4017b0 = true;
        if (!(this.p0 instanceof t.h)) {
            this.p0 = new t.h();
        }
        ((t.h) this.p0).S(this.f4009V);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z2 = false;
        boolean z3 = 1 == getLayoutDirection();
        this.f4028h0 = -1;
        this.f4029i0 = -1;
        this.f4024f0 = -1;
        this.f4026g0 = -1;
        this.f4031j0 = this.f4048w;
        this.f4033k0 = this.f4050y;
        float f2 = this.f3993E;
        this.l0 = f2;
        int i8 = this.f4014a;
        this.f4036m0 = i8;
        int i9 = this.f4016b;
        this.f4038n0 = i9;
        float f3 = this.f4018c;
        this.f4040o0 = f3;
        if (z3) {
            int i10 = this.f4044s;
            if (i10 != -1) {
                this.f4028h0 = i10;
            } else {
                int i11 = this.f4045t;
                if (i11 != -1) {
                    this.f4029i0 = i11;
                }
                i2 = this.f4046u;
                if (i2 != -1) {
                    this.f4026g0 = i2;
                    z2 = true;
                }
                i3 = this.f4047v;
                if (i3 != -1) {
                    this.f4024f0 = i3;
                    z2 = true;
                }
                i4 = this.f3989A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4033k0 = i4;
                }
                i5 = this.f3990B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4031j0 = i5;
                }
                if (z2) {
                    this.l0 = 1.0f - f2;
                }
                if (this.f4020d0 && this.f4009V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f4040o0 = 1.0f - f3;
                        this.f4036m0 = -1;
                        this.f4038n0 = -1;
                    } else if (i8 != -1) {
                        this.f4038n0 = i8;
                        this.f4036m0 = -1;
                        this.f4040o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f4036m0 = i9;
                        this.f4038n0 = -1;
                        this.f4040o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4046u;
            if (i2 != -1) {
            }
            i3 = this.f4047v;
            if (i3 != -1) {
            }
            i4 = this.f3989A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3990B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4020d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4044s;
            if (i12 != -1) {
                this.f4026g0 = i12;
            }
            int i13 = this.f4045t;
            if (i13 != -1) {
                this.f4024f0 = i13;
            }
            int i14 = this.f4046u;
            if (i14 != -1) {
                this.f4028h0 = i14;
            }
            int i15 = this.f4047v;
            if (i15 != -1) {
                this.f4029i0 = i15;
            }
            int i16 = this.f3989A;
            if (i16 != Integer.MIN_VALUE) {
                this.f4031j0 = i16;
            }
            int i17 = this.f3990B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4033k0 = i17;
            }
        }
        if (this.f4046u == -1 && this.f4047v == -1 && this.f4045t == -1 && this.f4044s == -1) {
            int i18 = this.f4025g;
            if (i18 != -1) {
                this.f4028h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f4027h;
                if (i19 != -1) {
                    this.f4029i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f4021e;
            if (i20 != -1) {
                this.f4024f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f4023f;
            if (i21 != -1) {
                this.f4026g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
