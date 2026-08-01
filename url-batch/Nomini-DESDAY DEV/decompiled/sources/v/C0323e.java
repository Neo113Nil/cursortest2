package v;

import android.view.ViewGroup;
import s.C0298d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3828A;

    /* renamed from: B, reason: collision with root package name */
    public int f3829B;

    /* renamed from: C, reason: collision with root package name */
    public int f3830C;

    /* renamed from: D, reason: collision with root package name */
    public int f3831D;

    /* renamed from: E, reason: collision with root package name */
    public float f3832E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3833G;

    /* renamed from: H, reason: collision with root package name */
    public float f3834H;

    /* renamed from: I, reason: collision with root package name */
    public float f3835I;

    /* renamed from: J, reason: collision with root package name */
    public int f3836J;

    /* renamed from: K, reason: collision with root package name */
    public int f3837K;

    /* renamed from: L, reason: collision with root package name */
    public int f3838L;

    /* renamed from: M, reason: collision with root package name */
    public int f3839M;

    /* renamed from: N, reason: collision with root package name */
    public int f3840N;

    /* renamed from: O, reason: collision with root package name */
    public int f3841O;

    /* renamed from: P, reason: collision with root package name */
    public int f3842P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3843Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3844R;

    /* renamed from: S, reason: collision with root package name */
    public float f3845S;

    /* renamed from: T, reason: collision with root package name */
    public int f3846T;

    /* renamed from: U, reason: collision with root package name */
    public int f3847U;

    /* renamed from: V, reason: collision with root package name */
    public int f3848V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3849W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3850X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3851Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3852Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3853a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3854a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3855b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3856b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3857c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3858c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3859d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3860e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3861e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3862f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3863f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3864g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3865g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3866h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3867i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3868j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3869k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3870k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3871l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3872l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3873m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3874m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3875n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3876n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3877o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3878o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3879p;

    /* renamed from: p0, reason: collision with root package name */
    public C0298d f3880p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3881q;

    /* renamed from: r, reason: collision with root package name */
    public float f3882r;

    /* renamed from: s, reason: collision with root package name */
    public int f3883s;

    /* renamed from: t, reason: collision with root package name */
    public int f3884t;

    /* renamed from: u, reason: collision with root package name */
    public int f3885u;

    /* renamed from: v, reason: collision with root package name */
    public int f3886v;

    /* renamed from: w, reason: collision with root package name */
    public int f3887w;

    /* renamed from: x, reason: collision with root package name */
    public int f3888x;

    /* renamed from: y, reason: collision with root package name */
    public int f3889y;

    /* renamed from: z, reason: collision with root package name */
    public int f3890z;

    public final void a() {
        this.f3859d0 = false;
        this.f3854a0 = true;
        this.f3856b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3849W) {
            this.f3854a0 = false;
            if (this.f3838L == 0) {
                this.f3838L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3850X) {
            this.f3856b0 = false;
            if (this.f3839M == 0) {
                this.f3839M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3854a0 = false;
            if (i == 0 && this.f3838L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3849W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3856b0 = false;
            if (i2 == 0 && this.f3839M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3850X = true;
            }
        }
        if (this.f3857c == -1.0f && this.f3853a == -1 && this.f3855b == -1) {
            return;
        }
        this.f3859d0 = true;
        this.f3854a0 = true;
        this.f3856b0 = true;
        if (!(this.f3880p0 instanceof s.h)) {
            this.f3880p0 = new s.h();
        }
        ((s.h) this.f3880p0).S(this.f3848V);
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
        this.f3866h0 = -1;
        this.f3867i0 = -1;
        this.f3863f0 = -1;
        this.f3865g0 = -1;
        this.j0 = this.f3887w;
        this.f3870k0 = this.f3889y;
        float f2 = this.f3832E;
        this.f3872l0 = f2;
        int i8 = this.f3853a;
        this.f3874m0 = i8;
        int i9 = this.f3855b;
        this.f3876n0 = i9;
        float f3 = this.f3857c;
        this.f3878o0 = f3;
        if (z3) {
            int i10 = this.f3883s;
            if (i10 != -1) {
                this.f3866h0 = i10;
            } else {
                int i11 = this.f3884t;
                if (i11 != -1) {
                    this.f3867i0 = i11;
                }
                i2 = this.f3885u;
                if (i2 != -1) {
                    this.f3865g0 = i2;
                    z2 = true;
                }
                i3 = this.f3886v;
                if (i3 != -1) {
                    this.f3863f0 = i3;
                    z2 = true;
                }
                i4 = this.f3828A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3870k0 = i4;
                }
                i5 = this.f3829B;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                if (z2) {
                    this.f3872l0 = 1.0f - f2;
                }
                if (this.f3859d0 && this.f3848V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3878o0 = 1.0f - f3;
                        this.f3874m0 = -1;
                        this.f3876n0 = -1;
                    } else if (i8 != -1) {
                        this.f3876n0 = i8;
                        this.f3874m0 = -1;
                        this.f3878o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3874m0 = i9;
                        this.f3876n0 = -1;
                        this.f3878o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3885u;
            if (i2 != -1) {
            }
            i3 = this.f3886v;
            if (i3 != -1) {
            }
            i4 = this.f3828A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3829B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3859d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3883s;
            if (i12 != -1) {
                this.f3865g0 = i12;
            }
            int i13 = this.f3884t;
            if (i13 != -1) {
                this.f3863f0 = i13;
            }
            int i14 = this.f3885u;
            if (i14 != -1) {
                this.f3866h0 = i14;
            }
            int i15 = this.f3886v;
            if (i15 != -1) {
                this.f3867i0 = i15;
            }
            int i16 = this.f3828A;
            if (i16 != Integer.MIN_VALUE) {
                this.j0 = i16;
            }
            int i17 = this.f3829B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3870k0 = i17;
            }
        }
        if (this.f3885u == -1 && this.f3886v == -1 && this.f3884t == -1 && this.f3883s == -1) {
            int i18 = this.f3864g;
            if (i18 != -1) {
                this.f3866h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3867i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3860e;
            if (i20 != -1) {
                this.f3863f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3862f;
            if (i21 != -1) {
                this.f3865g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
