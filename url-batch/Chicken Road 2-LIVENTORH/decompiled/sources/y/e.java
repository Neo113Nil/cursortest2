package y;

import android.view.ViewGroup;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3636a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3637a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3638b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3639b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3640c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3641c0;
    public boolean d;
    public boolean d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3642e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3643e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3644f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3645f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3646g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3647g0;

    /* renamed from: h, reason: collision with root package name */
    public int f3648h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3649h0;
    public int i;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3650j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3651j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3652k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3653k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3654l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3655l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3656m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3657m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3658n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3659n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3660o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3661o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3662p;

    /* renamed from: p0, reason: collision with root package name */
    public v.d f3663p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3664q;

    /* renamed from: r, reason: collision with root package name */
    public float f3665r;

    /* renamed from: s, reason: collision with root package name */
    public int f3666s;

    /* renamed from: t, reason: collision with root package name */
    public int f3667t;

    /* renamed from: u, reason: collision with root package name */
    public int f3668u;

    /* renamed from: v, reason: collision with root package name */
    public int f3669v;

    /* renamed from: w, reason: collision with root package name */
    public int f3670w;

    /* renamed from: x, reason: collision with root package name */
    public int f3671x;

    /* renamed from: y, reason: collision with root package name */
    public int f3672y;

    /* renamed from: z, reason: collision with root package name */
    public int f3673z;

    public final void a() {
        this.d0 = false;
        this.f3637a0 = true;
        this.f3639b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.f3637a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.X) {
            this.f3639b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3637a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f3639b0 = false;
            if (i4 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f3640c == -1.0f && this.f3636a == -1 && this.f3638b == -1) {
            return;
        }
        this.d0 = true;
        this.f3637a0 = true;
        this.f3639b0 = true;
        if (!(this.f3663p0 instanceof v.h)) {
            this.f3663p0 = new v.h();
        }
        ((v.h) this.f3663p0).S(this.V);
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
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i9 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z3 = false;
        boolean z4 = 1 == getLayoutDirection();
        this.f3649h0 = -1;
        this.i0 = -1;
        this.f3645f0 = -1;
        this.f3647g0 = -1;
        this.f3651j0 = this.f3670w;
        this.f3653k0 = this.f3672y;
        float f2 = this.E;
        this.f3655l0 = f2;
        int i10 = this.f3636a;
        this.f3657m0 = i10;
        int i11 = this.f3638b;
        this.f3659n0 = i11;
        float f4 = this.f3640c;
        this.f3661o0 = f4;
        if (z4) {
            int i12 = this.f3666s;
            if (i12 != -1) {
                this.f3649h0 = i12;
            } else {
                int i13 = this.f3667t;
                if (i13 != -1) {
                    this.i0 = i13;
                }
                i4 = this.f3668u;
                if (i4 != -1) {
                    this.f3647g0 = i4;
                    z3 = true;
                }
                i5 = this.f3669v;
                if (i5 != -1) {
                    this.f3645f0 = i5;
                    z3 = true;
                }
                i6 = this.A;
                if (i6 != Integer.MIN_VALUE) {
                    this.f3653k0 = i6;
                }
                i7 = this.B;
                if (i7 != Integer.MIN_VALUE) {
                    this.f3651j0 = i7;
                }
                if (z3) {
                    this.f3655l0 = 1.0f - f2;
                }
                if (this.d0 && this.V == 1 && this.d) {
                    if (f4 == -1.0f) {
                        this.f3661o0 = 1.0f - f4;
                        this.f3657m0 = -1;
                        this.f3659n0 = -1;
                    } else if (i10 != -1) {
                        this.f3659n0 = i10;
                        this.f3657m0 = -1;
                        this.f3661o0 = -1.0f;
                    } else if (i11 != -1) {
                        this.f3657m0 = i11;
                        this.f3659n0 = -1;
                        this.f3661o0 = -1.0f;
                    }
                }
            }
            z3 = true;
            i4 = this.f3668u;
            if (i4 != -1) {
            }
            i5 = this.f3669v;
            if (i5 != -1) {
            }
            i6 = this.A;
            if (i6 != Integer.MIN_VALUE) {
            }
            i7 = this.B;
            if (i7 != Integer.MIN_VALUE) {
            }
            if (z3) {
            }
            if (this.d0) {
                if (f4 == -1.0f) {
                }
            }
        } else {
            int i14 = this.f3666s;
            if (i14 != -1) {
                this.f3647g0 = i14;
            }
            int i15 = this.f3667t;
            if (i15 != -1) {
                this.f3645f0 = i15;
            }
            int i16 = this.f3668u;
            if (i16 != -1) {
                this.f3649h0 = i16;
            }
            int i17 = this.f3669v;
            if (i17 != -1) {
                this.i0 = i17;
            }
            int i18 = this.A;
            if (i18 != Integer.MIN_VALUE) {
                this.f3651j0 = i18;
            }
            int i19 = this.B;
            if (i19 != Integer.MIN_VALUE) {
                this.f3653k0 = i19;
            }
        }
        if (this.f3668u == -1 && this.f3669v == -1 && this.f3667t == -1 && this.f3666s == -1) {
            int i20 = this.f3646g;
            if (i20 != -1) {
                this.f3649h0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                }
            } else {
                int i21 = this.f3648h;
                if (i21 != -1) {
                    this.i0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i9 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i9;
                    }
                }
            }
            int i22 = this.f3642e;
            if (i22 != -1) {
                this.f3645f0 = i22;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
                return;
            }
            int i23 = this.f3644f;
            if (i23 != -1) {
                this.f3647g0 = i23;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i8 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i8;
            }
        }
    }
}
