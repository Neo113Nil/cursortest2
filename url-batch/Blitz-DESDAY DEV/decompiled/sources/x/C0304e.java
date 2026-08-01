package x;

import android.view.ViewGroup;
import u.C0275d;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3962A;

    /* renamed from: B, reason: collision with root package name */
    public int f3963B;

    /* renamed from: C, reason: collision with root package name */
    public int f3964C;

    /* renamed from: D, reason: collision with root package name */
    public int f3965D;

    /* renamed from: E, reason: collision with root package name */
    public float f3966E;

    /* renamed from: F, reason: collision with root package name */
    public float f3967F;

    /* renamed from: G, reason: collision with root package name */
    public String f3968G;
    public float H;

    /* renamed from: I, reason: collision with root package name */
    public float f3969I;

    /* renamed from: J, reason: collision with root package name */
    public int f3970J;

    /* renamed from: K, reason: collision with root package name */
    public int f3971K;

    /* renamed from: L, reason: collision with root package name */
    public int f3972L;

    /* renamed from: M, reason: collision with root package name */
    public int f3973M;

    /* renamed from: N, reason: collision with root package name */
    public int f3974N;

    /* renamed from: O, reason: collision with root package name */
    public int f3975O;

    /* renamed from: P, reason: collision with root package name */
    public int f3976P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3977Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3978R;

    /* renamed from: S, reason: collision with root package name */
    public float f3979S;

    /* renamed from: T, reason: collision with root package name */
    public int f3980T;

    /* renamed from: U, reason: collision with root package name */
    public int f3981U;

    /* renamed from: V, reason: collision with root package name */
    public int f3982V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3983W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3984X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3985Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3986Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3987a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3988a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3989b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3990b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3991c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3992c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3993d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3994e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3995e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3996f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3997f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3998g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3999g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4000h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4001i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4002j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4003j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4004k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4005k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4006l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4007l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4008m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4009m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4010n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4011n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4012o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4013o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4014p;
    public C0275d p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4015q;

    /* renamed from: r, reason: collision with root package name */
    public float f4016r;

    /* renamed from: s, reason: collision with root package name */
    public int f4017s;

    /* renamed from: t, reason: collision with root package name */
    public int f4018t;

    /* renamed from: u, reason: collision with root package name */
    public int f4019u;

    /* renamed from: v, reason: collision with root package name */
    public int f4020v;

    /* renamed from: w, reason: collision with root package name */
    public int f4021w;

    /* renamed from: x, reason: collision with root package name */
    public int f4022x;

    /* renamed from: y, reason: collision with root package name */
    public int f4023y;

    /* renamed from: z, reason: collision with root package name */
    public int f4024z;

    public final void a() {
        this.f3993d0 = false;
        this.f3988a0 = true;
        this.f3990b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3983W) {
            this.f3988a0 = false;
            if (this.f3972L == 0) {
                this.f3972L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3984X) {
            this.f3990b0 = false;
            if (this.f3973M == 0) {
                this.f3973M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3988a0 = false;
            if (i == 0 && this.f3972L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3983W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3990b0 = false;
            if (i2 == 0 && this.f3973M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3984X = true;
            }
        }
        if (this.f3991c == -1.0f && this.f3987a == -1 && this.f3989b == -1) {
            return;
        }
        this.f3993d0 = true;
        this.f3988a0 = true;
        this.f3990b0 = true;
        if (!(this.p0 instanceof u.h)) {
            this.p0 = new u.h();
        }
        ((u.h) this.p0).S(this.f3982V);
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
        this.f4000h0 = -1;
        this.f4001i0 = -1;
        this.f3997f0 = -1;
        this.f3999g0 = -1;
        this.f4003j0 = this.f4021w;
        this.f4005k0 = this.f4023y;
        float f2 = this.f3966E;
        this.f4007l0 = f2;
        int i8 = this.f3987a;
        this.f4009m0 = i8;
        int i9 = this.f3989b;
        this.f4011n0 = i9;
        float f3 = this.f3991c;
        this.f4013o0 = f3;
        if (z3) {
            int i10 = this.f4017s;
            if (i10 != -1) {
                this.f4000h0 = i10;
            } else {
                int i11 = this.f4018t;
                if (i11 != -1) {
                    this.f4001i0 = i11;
                }
                i2 = this.f4019u;
                if (i2 != -1) {
                    this.f3999g0 = i2;
                    z2 = true;
                }
                i3 = this.f4020v;
                if (i3 != -1) {
                    this.f3997f0 = i3;
                    z2 = true;
                }
                i4 = this.f3962A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4005k0 = i4;
                }
                i5 = this.f3963B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4003j0 = i5;
                }
                if (z2) {
                    this.f4007l0 = 1.0f - f2;
                }
                if (this.f3993d0 && this.f3982V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f4013o0 = 1.0f - f3;
                        this.f4009m0 = -1;
                        this.f4011n0 = -1;
                    } else if (i8 != -1) {
                        this.f4011n0 = i8;
                        this.f4009m0 = -1;
                        this.f4013o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f4009m0 = i9;
                        this.f4011n0 = -1;
                        this.f4013o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4019u;
            if (i2 != -1) {
            }
            i3 = this.f4020v;
            if (i3 != -1) {
            }
            i4 = this.f3962A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3963B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3993d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4017s;
            if (i12 != -1) {
                this.f3999g0 = i12;
            }
            int i13 = this.f4018t;
            if (i13 != -1) {
                this.f3997f0 = i13;
            }
            int i14 = this.f4019u;
            if (i14 != -1) {
                this.f4000h0 = i14;
            }
            int i15 = this.f4020v;
            if (i15 != -1) {
                this.f4001i0 = i15;
            }
            int i16 = this.f3962A;
            if (i16 != Integer.MIN_VALUE) {
                this.f4003j0 = i16;
            }
            int i17 = this.f3963B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4005k0 = i17;
            }
        }
        if (this.f4019u == -1 && this.f4020v == -1 && this.f4018t == -1 && this.f4017s == -1) {
            int i18 = this.f3998g;
            if (i18 != -1) {
                this.f4000h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f4001i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3994e;
            if (i20 != -1) {
                this.f3997f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3996f;
            if (i21 != -1) {
                this.f3999g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
