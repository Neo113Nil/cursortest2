package v;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3844A;

    /* renamed from: B, reason: collision with root package name */
    public int f3845B;

    /* renamed from: C, reason: collision with root package name */
    public int f3846C;

    /* renamed from: D, reason: collision with root package name */
    public int f3847D;

    /* renamed from: E, reason: collision with root package name */
    public float f3848E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3849G;

    /* renamed from: H, reason: collision with root package name */
    public float f3850H;

    /* renamed from: I, reason: collision with root package name */
    public float f3851I;

    /* renamed from: J, reason: collision with root package name */
    public int f3852J;

    /* renamed from: K, reason: collision with root package name */
    public int f3853K;

    /* renamed from: L, reason: collision with root package name */
    public int f3854L;

    /* renamed from: M, reason: collision with root package name */
    public int f3855M;

    /* renamed from: N, reason: collision with root package name */
    public int f3856N;

    /* renamed from: O, reason: collision with root package name */
    public int f3857O;

    /* renamed from: P, reason: collision with root package name */
    public int f3858P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3859Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3860R;

    /* renamed from: S, reason: collision with root package name */
    public float f3861S;

    /* renamed from: T, reason: collision with root package name */
    public int f3862T;

    /* renamed from: U, reason: collision with root package name */
    public int f3863U;

    /* renamed from: V, reason: collision with root package name */
    public int f3864V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3865W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3866X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3867Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3868Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3869a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3870a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3871b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3872b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3873c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3874c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3875d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3876e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3877e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3878f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3879f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3880g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3881g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3882h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3883i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3884j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3885j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3886k;
    public int k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3887l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3888l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3889m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3890m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3891n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3892n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3893o;
    public float o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3894p;

    /* renamed from: p0, reason: collision with root package name */
    public s.d f3895p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3896q;

    /* renamed from: r, reason: collision with root package name */
    public float f3897r;

    /* renamed from: s, reason: collision with root package name */
    public int f3898s;

    /* renamed from: t, reason: collision with root package name */
    public int f3899t;

    /* renamed from: u, reason: collision with root package name */
    public int f3900u;

    /* renamed from: v, reason: collision with root package name */
    public int f3901v;

    /* renamed from: w, reason: collision with root package name */
    public int f3902w;

    /* renamed from: x, reason: collision with root package name */
    public int f3903x;

    /* renamed from: y, reason: collision with root package name */
    public int f3904y;

    /* renamed from: z, reason: collision with root package name */
    public int f3905z;

    public final void a() {
        this.f3875d0 = false;
        this.f3870a0 = true;
        this.f3872b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3865W) {
            this.f3870a0 = false;
            if (this.f3854L == 0) {
                this.f3854L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3866X) {
            this.f3872b0 = false;
            if (this.f3855M == 0) {
                this.f3855M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3870a0 = false;
            if (i == 0 && this.f3854L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3865W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3872b0 = false;
            if (i2 == 0 && this.f3855M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3866X = true;
            }
        }
        if (this.f3873c == -1.0f && this.f3869a == -1 && this.f3871b == -1) {
            return;
        }
        this.f3875d0 = true;
        this.f3870a0 = true;
        this.f3872b0 = true;
        if (!(this.f3895p0 instanceof s.h)) {
            this.f3895p0 = new s.h();
        }
        ((s.h) this.f3895p0).S(this.f3864V);
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
        this.f3882h0 = -1;
        this.f3883i0 = -1;
        this.f3879f0 = -1;
        this.f3881g0 = -1;
        this.f3885j0 = this.f3902w;
        this.k0 = this.f3904y;
        float f2 = this.f3848E;
        this.f3888l0 = f2;
        int i8 = this.f3869a;
        this.f3890m0 = i8;
        int i9 = this.f3871b;
        this.f3892n0 = i9;
        float f3 = this.f3873c;
        this.o0 = f3;
        if (z3) {
            int i10 = this.f3898s;
            if (i10 != -1) {
                this.f3882h0 = i10;
            } else {
                int i11 = this.f3899t;
                if (i11 != -1) {
                    this.f3883i0 = i11;
                }
                i2 = this.f3900u;
                if (i2 != -1) {
                    this.f3881g0 = i2;
                    z2 = true;
                }
                i3 = this.f3901v;
                if (i3 != -1) {
                    this.f3879f0 = i3;
                    z2 = true;
                }
                i4 = this.f3844A;
                if (i4 != Integer.MIN_VALUE) {
                    this.k0 = i4;
                }
                i5 = this.f3845B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f3885j0 = i5;
                }
                if (z2) {
                    this.f3888l0 = 1.0f - f2;
                }
                if (this.f3875d0 && this.f3864V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.o0 = 1.0f - f3;
                        this.f3890m0 = -1;
                        this.f3892n0 = -1;
                    } else if (i8 != -1) {
                        this.f3892n0 = i8;
                        this.f3890m0 = -1;
                        this.o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3890m0 = i9;
                        this.f3892n0 = -1;
                        this.o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3900u;
            if (i2 != -1) {
            }
            i3 = this.f3901v;
            if (i3 != -1) {
            }
            i4 = this.f3844A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3845B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3875d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3898s;
            if (i12 != -1) {
                this.f3881g0 = i12;
            }
            int i13 = this.f3899t;
            if (i13 != -1) {
                this.f3879f0 = i13;
            }
            int i14 = this.f3900u;
            if (i14 != -1) {
                this.f3882h0 = i14;
            }
            int i15 = this.f3901v;
            if (i15 != -1) {
                this.f3883i0 = i15;
            }
            int i16 = this.f3844A;
            if (i16 != Integer.MIN_VALUE) {
                this.f3885j0 = i16;
            }
            int i17 = this.f3845B;
            if (i17 != Integer.MIN_VALUE) {
                this.k0 = i17;
            }
        }
        if (this.f3900u == -1 && this.f3901v == -1 && this.f3899t == -1 && this.f3898s == -1) {
            int i18 = this.f3880g;
            if (i18 != -1) {
                this.f3882h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3883i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3876e;
            if (i20 != -1) {
                this.f3879f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3878f;
            if (i21 != -1) {
                this.f3881g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
