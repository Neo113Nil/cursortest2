package v;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3806A;

    /* renamed from: B, reason: collision with root package name */
    public int f3807B;

    /* renamed from: C, reason: collision with root package name */
    public int f3808C;

    /* renamed from: D, reason: collision with root package name */
    public int f3809D;

    /* renamed from: E, reason: collision with root package name */
    public float f3810E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3811G;

    /* renamed from: H, reason: collision with root package name */
    public float f3812H;

    /* renamed from: I, reason: collision with root package name */
    public float f3813I;

    /* renamed from: J, reason: collision with root package name */
    public int f3814J;

    /* renamed from: K, reason: collision with root package name */
    public int f3815K;

    /* renamed from: L, reason: collision with root package name */
    public int f3816L;

    /* renamed from: M, reason: collision with root package name */
    public int f3817M;

    /* renamed from: N, reason: collision with root package name */
    public int f3818N;

    /* renamed from: O, reason: collision with root package name */
    public int f3819O;

    /* renamed from: P, reason: collision with root package name */
    public int f3820P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3821Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3822R;

    /* renamed from: S, reason: collision with root package name */
    public float f3823S;

    /* renamed from: T, reason: collision with root package name */
    public int f3824T;

    /* renamed from: U, reason: collision with root package name */
    public int f3825U;

    /* renamed from: V, reason: collision with root package name */
    public int f3826V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3827W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3828X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3829Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3830Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3831a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3832a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3833b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3834b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3835c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3836c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3837d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3838e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3839e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3840f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3841f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3842g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3843g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3844h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3845i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3846j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3847j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3848k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3849k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3850l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3851l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3852m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3853m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3854n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3855n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3856o;
    public float o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3857p;

    /* renamed from: p0, reason: collision with root package name */
    public s.d f3858p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3859q;

    /* renamed from: r, reason: collision with root package name */
    public float f3860r;

    /* renamed from: s, reason: collision with root package name */
    public int f3861s;

    /* renamed from: t, reason: collision with root package name */
    public int f3862t;

    /* renamed from: u, reason: collision with root package name */
    public int f3863u;

    /* renamed from: v, reason: collision with root package name */
    public int f3864v;

    /* renamed from: w, reason: collision with root package name */
    public int f3865w;

    /* renamed from: x, reason: collision with root package name */
    public int f3866x;

    /* renamed from: y, reason: collision with root package name */
    public int f3867y;

    /* renamed from: z, reason: collision with root package name */
    public int f3868z;

    public final void a() {
        this.f3837d0 = false;
        this.f3832a0 = true;
        this.f3834b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3827W) {
            this.f3832a0 = false;
            if (this.f3816L == 0) {
                this.f3816L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3828X) {
            this.f3834b0 = false;
            if (this.f3817M == 0) {
                this.f3817M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3832a0 = false;
            if (i == 0 && this.f3816L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3827W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3834b0 = false;
            if (i2 == 0 && this.f3817M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3828X = true;
            }
        }
        if (this.f3835c == -1.0f && this.f3831a == -1 && this.f3833b == -1) {
            return;
        }
        this.f3837d0 = true;
        this.f3832a0 = true;
        this.f3834b0 = true;
        if (!(this.f3858p0 instanceof s.h)) {
            this.f3858p0 = new s.h();
        }
        ((s.h) this.f3858p0).S(this.f3826V);
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
        this.f3844h0 = -1;
        this.f3845i0 = -1;
        this.f3841f0 = -1;
        this.f3843g0 = -1;
        this.f3847j0 = this.f3865w;
        this.f3849k0 = this.f3867y;
        float f2 = this.f3810E;
        this.f3851l0 = f2;
        int i8 = this.f3831a;
        this.f3853m0 = i8;
        int i9 = this.f3833b;
        this.f3855n0 = i9;
        float f3 = this.f3835c;
        this.o0 = f3;
        if (z3) {
            int i10 = this.f3861s;
            if (i10 != -1) {
                this.f3844h0 = i10;
            } else {
                int i11 = this.f3862t;
                if (i11 != -1) {
                    this.f3845i0 = i11;
                }
                i2 = this.f3863u;
                if (i2 != -1) {
                    this.f3843g0 = i2;
                    z2 = true;
                }
                i3 = this.f3864v;
                if (i3 != -1) {
                    this.f3841f0 = i3;
                    z2 = true;
                }
                i4 = this.f3806A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3849k0 = i4;
                }
                i5 = this.f3807B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f3847j0 = i5;
                }
                if (z2) {
                    this.f3851l0 = 1.0f - f2;
                }
                if (this.f3837d0 && this.f3826V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.o0 = 1.0f - f3;
                        this.f3853m0 = -1;
                        this.f3855n0 = -1;
                    } else if (i8 != -1) {
                        this.f3855n0 = i8;
                        this.f3853m0 = -1;
                        this.o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3853m0 = i9;
                        this.f3855n0 = -1;
                        this.o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3863u;
            if (i2 != -1) {
            }
            i3 = this.f3864v;
            if (i3 != -1) {
            }
            i4 = this.f3806A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3807B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3837d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3861s;
            if (i12 != -1) {
                this.f3843g0 = i12;
            }
            int i13 = this.f3862t;
            if (i13 != -1) {
                this.f3841f0 = i13;
            }
            int i14 = this.f3863u;
            if (i14 != -1) {
                this.f3844h0 = i14;
            }
            int i15 = this.f3864v;
            if (i15 != -1) {
                this.f3845i0 = i15;
            }
            int i16 = this.f3806A;
            if (i16 != Integer.MIN_VALUE) {
                this.f3847j0 = i16;
            }
            int i17 = this.f3807B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3849k0 = i17;
            }
        }
        if (this.f3863u == -1 && this.f3864v == -1 && this.f3862t == -1 && this.f3861s == -1) {
            int i18 = this.f3842g;
            if (i18 != -1) {
                this.f3844h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3845i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3838e;
            if (i20 != -1) {
                this.f3841f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3840f;
            if (i21 != -1) {
                this.f3843g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
