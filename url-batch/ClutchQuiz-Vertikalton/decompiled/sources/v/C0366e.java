package v;

import android.view.ViewGroup;
import s.C0340d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3797A;

    /* renamed from: B, reason: collision with root package name */
    public int f3798B;

    /* renamed from: C, reason: collision with root package name */
    public int f3799C;

    /* renamed from: D, reason: collision with root package name */
    public int f3800D;

    /* renamed from: E, reason: collision with root package name */
    public float f3801E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3802G;

    /* renamed from: H, reason: collision with root package name */
    public float f3803H;

    /* renamed from: I, reason: collision with root package name */
    public float f3804I;

    /* renamed from: J, reason: collision with root package name */
    public int f3805J;

    /* renamed from: K, reason: collision with root package name */
    public int f3806K;

    /* renamed from: L, reason: collision with root package name */
    public int f3807L;

    /* renamed from: M, reason: collision with root package name */
    public int f3808M;

    /* renamed from: N, reason: collision with root package name */
    public int f3809N;

    /* renamed from: O, reason: collision with root package name */
    public int f3810O;

    /* renamed from: P, reason: collision with root package name */
    public int f3811P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3812Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3813R;

    /* renamed from: S, reason: collision with root package name */
    public float f3814S;

    /* renamed from: T, reason: collision with root package name */
    public int f3815T;

    /* renamed from: U, reason: collision with root package name */
    public int f3816U;

    /* renamed from: V, reason: collision with root package name */
    public int f3817V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3818W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3819X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3820Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3821Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3822a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3823a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3824b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3825b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3826c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3827c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3828d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3829e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3830e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3831f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3832f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3833g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3834g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3835h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3836i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3837j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3838j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3839k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3840k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3841l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3842l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3843m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3844n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3845n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3846o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3847o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3848p;

    /* renamed from: p0, reason: collision with root package name */
    public C0340d f3849p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3850q;

    /* renamed from: r, reason: collision with root package name */
    public float f3851r;

    /* renamed from: s, reason: collision with root package name */
    public int f3852s;

    /* renamed from: t, reason: collision with root package name */
    public int f3853t;

    /* renamed from: u, reason: collision with root package name */
    public int f3854u;

    /* renamed from: v, reason: collision with root package name */
    public int f3855v;

    /* renamed from: w, reason: collision with root package name */
    public int f3856w;

    /* renamed from: x, reason: collision with root package name */
    public int f3857x;

    /* renamed from: y, reason: collision with root package name */
    public int f3858y;

    /* renamed from: z, reason: collision with root package name */
    public int f3859z;

    public final void a() {
        this.f3828d0 = false;
        this.f3823a0 = true;
        this.f3825b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3818W) {
            this.f3823a0 = false;
            if (this.f3807L == 0) {
                this.f3807L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3819X) {
            this.f3825b0 = false;
            if (this.f3808M == 0) {
                this.f3808M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3823a0 = false;
            if (i == 0 && this.f3807L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3818W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3825b0 = false;
            if (i2 == 0 && this.f3808M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3819X = true;
            }
        }
        if (this.f3826c == -1.0f && this.f3822a == -1 && this.f3824b == -1) {
            return;
        }
        this.f3828d0 = true;
        this.f3823a0 = true;
        this.f3825b0 = true;
        if (!(this.f3849p0 instanceof s.h)) {
            this.f3849p0 = new s.h();
        }
        ((s.h) this.f3849p0).S(this.f3817V);
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
        this.f3835h0 = -1;
        this.f3836i0 = -1;
        this.f3832f0 = -1;
        this.f3834g0 = -1;
        this.f3838j0 = this.f3856w;
        this.f3840k0 = this.f3858y;
        float f2 = this.f3801E;
        this.f3842l0 = f2;
        int i8 = this.f3822a;
        this.m0 = i8;
        int i9 = this.f3824b;
        this.f3845n0 = i9;
        float f3 = this.f3826c;
        this.f3847o0 = f3;
        if (z3) {
            int i10 = this.f3852s;
            if (i10 != -1) {
                this.f3835h0 = i10;
            } else {
                int i11 = this.f3853t;
                if (i11 != -1) {
                    this.f3836i0 = i11;
                }
                i2 = this.f3854u;
                if (i2 != -1) {
                    this.f3834g0 = i2;
                    z2 = true;
                }
                i3 = this.f3855v;
                if (i3 != -1) {
                    this.f3832f0 = i3;
                    z2 = true;
                }
                i4 = this.f3797A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3840k0 = i4;
                }
                i5 = this.f3798B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f3838j0 = i5;
                }
                if (z2) {
                    this.f3842l0 = 1.0f - f2;
                }
                if (this.f3828d0 && this.f3817V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3847o0 = 1.0f - f3;
                        this.m0 = -1;
                        this.f3845n0 = -1;
                    } else if (i8 != -1) {
                        this.f3845n0 = i8;
                        this.m0 = -1;
                        this.f3847o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.m0 = i9;
                        this.f3845n0 = -1;
                        this.f3847o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3854u;
            if (i2 != -1) {
            }
            i3 = this.f3855v;
            if (i3 != -1) {
            }
            i4 = this.f3797A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3798B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3828d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3852s;
            if (i12 != -1) {
                this.f3834g0 = i12;
            }
            int i13 = this.f3853t;
            if (i13 != -1) {
                this.f3832f0 = i13;
            }
            int i14 = this.f3854u;
            if (i14 != -1) {
                this.f3835h0 = i14;
            }
            int i15 = this.f3855v;
            if (i15 != -1) {
                this.f3836i0 = i15;
            }
            int i16 = this.f3797A;
            if (i16 != Integer.MIN_VALUE) {
                this.f3838j0 = i16;
            }
            int i17 = this.f3798B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3840k0 = i17;
            }
        }
        if (this.f3854u == -1 && this.f3855v == -1 && this.f3853t == -1 && this.f3852s == -1) {
            int i18 = this.f3833g;
            if (i18 != -1) {
                this.f3835h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3836i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3829e;
            if (i20 != -1) {
                this.f3832f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3831f;
            if (i21 != -1) {
                this.f3834g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
