package v;

import android.view.ViewGroup;
import s.C0293d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3845A;

    /* renamed from: B, reason: collision with root package name */
    public int f3846B;

    /* renamed from: C, reason: collision with root package name */
    public int f3847C;

    /* renamed from: D, reason: collision with root package name */
    public int f3848D;

    /* renamed from: E, reason: collision with root package name */
    public float f3849E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3850G;

    /* renamed from: H, reason: collision with root package name */
    public float f3851H;

    /* renamed from: I, reason: collision with root package name */
    public float f3852I;

    /* renamed from: J, reason: collision with root package name */
    public int f3853J;

    /* renamed from: K, reason: collision with root package name */
    public int f3854K;

    /* renamed from: L, reason: collision with root package name */
    public int f3855L;

    /* renamed from: M, reason: collision with root package name */
    public int f3856M;

    /* renamed from: N, reason: collision with root package name */
    public int f3857N;

    /* renamed from: O, reason: collision with root package name */
    public int f3858O;

    /* renamed from: P, reason: collision with root package name */
    public int f3859P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3860Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3861R;

    /* renamed from: S, reason: collision with root package name */
    public float f3862S;

    /* renamed from: T, reason: collision with root package name */
    public int f3863T;

    /* renamed from: U, reason: collision with root package name */
    public int f3864U;

    /* renamed from: V, reason: collision with root package name */
    public int f3865V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3866W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3867X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3868Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3869Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3870a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3871a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3872b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3873b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3874c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3875c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3876d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3877e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3878e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3879f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3880f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3881g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3882g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3883h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3884i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3885j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3886j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3887k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3888k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3889l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3890l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3891m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3892m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3893n;
    public int n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3894o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3895o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3896p;

    /* renamed from: p0, reason: collision with root package name */
    public C0293d f3897p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3898q;

    /* renamed from: r, reason: collision with root package name */
    public float f3899r;

    /* renamed from: s, reason: collision with root package name */
    public int f3900s;

    /* renamed from: t, reason: collision with root package name */
    public int f3901t;

    /* renamed from: u, reason: collision with root package name */
    public int f3902u;

    /* renamed from: v, reason: collision with root package name */
    public int f3903v;

    /* renamed from: w, reason: collision with root package name */
    public int f3904w;

    /* renamed from: x, reason: collision with root package name */
    public int f3905x;

    /* renamed from: y, reason: collision with root package name */
    public int f3906y;

    /* renamed from: z, reason: collision with root package name */
    public int f3907z;

    public final void a() {
        this.f3876d0 = false;
        this.f3871a0 = true;
        this.f3873b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3866W) {
            this.f3871a0 = false;
            if (this.f3855L == 0) {
                this.f3855L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3867X) {
            this.f3873b0 = false;
            if (this.f3856M == 0) {
                this.f3856M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3871a0 = false;
            if (i == 0 && this.f3855L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3866W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3873b0 = false;
            if (i2 == 0 && this.f3856M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3867X = true;
            }
        }
        if (this.f3874c == -1.0f && this.f3870a == -1 && this.f3872b == -1) {
            return;
        }
        this.f3876d0 = true;
        this.f3871a0 = true;
        this.f3873b0 = true;
        if (!(this.f3897p0 instanceof s.h)) {
            this.f3897p0 = new s.h();
        }
        ((s.h) this.f3897p0).S(this.f3865V);
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
        this.f3883h0 = -1;
        this.f3884i0 = -1;
        this.f3880f0 = -1;
        this.f3882g0 = -1;
        this.f3886j0 = this.f3904w;
        this.f3888k0 = this.f3906y;
        float f2 = this.f3849E;
        this.f3890l0 = f2;
        int i8 = this.f3870a;
        this.f3892m0 = i8;
        int i9 = this.f3872b;
        this.n0 = i9;
        float f3 = this.f3874c;
        this.f3895o0 = f3;
        if (z3) {
            int i10 = this.f3900s;
            if (i10 != -1) {
                this.f3883h0 = i10;
            } else {
                int i11 = this.f3901t;
                if (i11 != -1) {
                    this.f3884i0 = i11;
                }
                i2 = this.f3902u;
                if (i2 != -1) {
                    this.f3882g0 = i2;
                    z2 = true;
                }
                i3 = this.f3903v;
                if (i3 != -1) {
                    this.f3880f0 = i3;
                    z2 = true;
                }
                i4 = this.f3845A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3888k0 = i4;
                }
                i5 = this.f3846B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f3886j0 = i5;
                }
                if (z2) {
                    this.f3890l0 = 1.0f - f2;
                }
                if (this.f3876d0 && this.f3865V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3895o0 = 1.0f - f3;
                        this.f3892m0 = -1;
                        this.n0 = -1;
                    } else if (i8 != -1) {
                        this.n0 = i8;
                        this.f3892m0 = -1;
                        this.f3895o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3892m0 = i9;
                        this.n0 = -1;
                        this.f3895o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3902u;
            if (i2 != -1) {
            }
            i3 = this.f3903v;
            if (i3 != -1) {
            }
            i4 = this.f3845A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3846B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3876d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3900s;
            if (i12 != -1) {
                this.f3882g0 = i12;
            }
            int i13 = this.f3901t;
            if (i13 != -1) {
                this.f3880f0 = i13;
            }
            int i14 = this.f3902u;
            if (i14 != -1) {
                this.f3883h0 = i14;
            }
            int i15 = this.f3903v;
            if (i15 != -1) {
                this.f3884i0 = i15;
            }
            int i16 = this.f3845A;
            if (i16 != Integer.MIN_VALUE) {
                this.f3886j0 = i16;
            }
            int i17 = this.f3846B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3888k0 = i17;
            }
        }
        if (this.f3902u == -1 && this.f3903v == -1 && this.f3901t == -1 && this.f3900s == -1) {
            int i18 = this.f3881g;
            if (i18 != -1) {
                this.f3883h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3884i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3877e;
            if (i20 != -1) {
                this.f3880f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3879f;
            if (i21 != -1) {
                this.f3882g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
