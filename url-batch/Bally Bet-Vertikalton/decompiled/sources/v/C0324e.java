package v;

import android.view.ViewGroup;
import s.C0299d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3834A;

    /* renamed from: B, reason: collision with root package name */
    public int f3835B;

    /* renamed from: C, reason: collision with root package name */
    public int f3836C;

    /* renamed from: D, reason: collision with root package name */
    public int f3837D;

    /* renamed from: E, reason: collision with root package name */
    public float f3838E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3839G;

    /* renamed from: H, reason: collision with root package name */
    public float f3840H;

    /* renamed from: I, reason: collision with root package name */
    public float f3841I;

    /* renamed from: J, reason: collision with root package name */
    public int f3842J;

    /* renamed from: K, reason: collision with root package name */
    public int f3843K;

    /* renamed from: L, reason: collision with root package name */
    public int f3844L;

    /* renamed from: M, reason: collision with root package name */
    public int f3845M;

    /* renamed from: N, reason: collision with root package name */
    public int f3846N;

    /* renamed from: O, reason: collision with root package name */
    public int f3847O;

    /* renamed from: P, reason: collision with root package name */
    public int f3848P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3849Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3850R;

    /* renamed from: S, reason: collision with root package name */
    public float f3851S;

    /* renamed from: T, reason: collision with root package name */
    public int f3852T;

    /* renamed from: U, reason: collision with root package name */
    public int f3853U;

    /* renamed from: V, reason: collision with root package name */
    public int f3854V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3855W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3856X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3857Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3858Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3859a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3860a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3861b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3862b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3863c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3864c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3865d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3866e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3867e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3868f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3869f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3870g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3871g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3872h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3873i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3874j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3875k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3876k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3877l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3878l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3879m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3880m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3881n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3882n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3883o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3884o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3885p;

    /* renamed from: p0, reason: collision with root package name */
    public C0299d f3886p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3887q;

    /* renamed from: r, reason: collision with root package name */
    public float f3888r;

    /* renamed from: s, reason: collision with root package name */
    public int f3889s;

    /* renamed from: t, reason: collision with root package name */
    public int f3890t;

    /* renamed from: u, reason: collision with root package name */
    public int f3891u;

    /* renamed from: v, reason: collision with root package name */
    public int f3892v;

    /* renamed from: w, reason: collision with root package name */
    public int f3893w;

    /* renamed from: x, reason: collision with root package name */
    public int f3894x;

    /* renamed from: y, reason: collision with root package name */
    public int f3895y;

    /* renamed from: z, reason: collision with root package name */
    public int f3896z;

    public final void a() {
        this.f3865d0 = false;
        this.f3860a0 = true;
        this.f3862b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3855W) {
            this.f3860a0 = false;
            if (this.f3844L == 0) {
                this.f3844L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3856X) {
            this.f3862b0 = false;
            if (this.f3845M == 0) {
                this.f3845M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3860a0 = false;
            if (i == 0 && this.f3844L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3855W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3862b0 = false;
            if (i2 == 0 && this.f3845M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3856X = true;
            }
        }
        if (this.f3863c == -1.0f && this.f3859a == -1 && this.f3861b == -1) {
            return;
        }
        this.f3865d0 = true;
        this.f3860a0 = true;
        this.f3862b0 = true;
        if (!(this.f3886p0 instanceof s.h)) {
            this.f3886p0 = new s.h();
        }
        ((s.h) this.f3886p0).S(this.f3854V);
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
        this.f3872h0 = -1;
        this.f3873i0 = -1;
        this.f3869f0 = -1;
        this.f3871g0 = -1;
        this.j0 = this.f3893w;
        this.f3876k0 = this.f3895y;
        float f2 = this.f3838E;
        this.f3878l0 = f2;
        int i8 = this.f3859a;
        this.f3880m0 = i8;
        int i9 = this.f3861b;
        this.f3882n0 = i9;
        float f3 = this.f3863c;
        this.f3884o0 = f3;
        if (z3) {
            int i10 = this.f3889s;
            if (i10 != -1) {
                this.f3872h0 = i10;
            } else {
                int i11 = this.f3890t;
                if (i11 != -1) {
                    this.f3873i0 = i11;
                }
                i2 = this.f3891u;
                if (i2 != -1) {
                    this.f3871g0 = i2;
                    z2 = true;
                }
                i3 = this.f3892v;
                if (i3 != -1) {
                    this.f3869f0 = i3;
                    z2 = true;
                }
                i4 = this.f3834A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3876k0 = i4;
                }
                i5 = this.f3835B;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                if (z2) {
                    this.f3878l0 = 1.0f - f2;
                }
                if (this.f3865d0 && this.f3854V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3884o0 = 1.0f - f3;
                        this.f3880m0 = -1;
                        this.f3882n0 = -1;
                    } else if (i8 != -1) {
                        this.f3882n0 = i8;
                        this.f3880m0 = -1;
                        this.f3884o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3880m0 = i9;
                        this.f3882n0 = -1;
                        this.f3884o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3891u;
            if (i2 != -1) {
            }
            i3 = this.f3892v;
            if (i3 != -1) {
            }
            i4 = this.f3834A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3835B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3865d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3889s;
            if (i12 != -1) {
                this.f3871g0 = i12;
            }
            int i13 = this.f3890t;
            if (i13 != -1) {
                this.f3869f0 = i13;
            }
            int i14 = this.f3891u;
            if (i14 != -1) {
                this.f3872h0 = i14;
            }
            int i15 = this.f3892v;
            if (i15 != -1) {
                this.f3873i0 = i15;
            }
            int i16 = this.f3834A;
            if (i16 != Integer.MIN_VALUE) {
                this.j0 = i16;
            }
            int i17 = this.f3835B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3876k0 = i17;
            }
        }
        if (this.f3891u == -1 && this.f3892v == -1 && this.f3890t == -1 && this.f3889s == -1) {
            int i18 = this.f3870g;
            if (i18 != -1) {
                this.f3872h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3873i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3866e;
            if (i20 != -1) {
                this.f3869f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3868f;
            if (i21 != -1) {
                this.f3871g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
