package v;

import android.view.ViewGroup;
import s.C0298d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3829A;

    /* renamed from: B, reason: collision with root package name */
    public int f3830B;

    /* renamed from: C, reason: collision with root package name */
    public int f3831C;

    /* renamed from: D, reason: collision with root package name */
    public int f3832D;

    /* renamed from: E, reason: collision with root package name */
    public float f3833E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3834G;

    /* renamed from: H, reason: collision with root package name */
    public float f3835H;

    /* renamed from: I, reason: collision with root package name */
    public float f3836I;

    /* renamed from: J, reason: collision with root package name */
    public int f3837J;

    /* renamed from: K, reason: collision with root package name */
    public int f3838K;

    /* renamed from: L, reason: collision with root package name */
    public int f3839L;

    /* renamed from: M, reason: collision with root package name */
    public int f3840M;

    /* renamed from: N, reason: collision with root package name */
    public int f3841N;

    /* renamed from: O, reason: collision with root package name */
    public int f3842O;

    /* renamed from: P, reason: collision with root package name */
    public int f3843P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3844Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3845R;

    /* renamed from: S, reason: collision with root package name */
    public float f3846S;

    /* renamed from: T, reason: collision with root package name */
    public int f3847T;

    /* renamed from: U, reason: collision with root package name */
    public int f3848U;

    /* renamed from: V, reason: collision with root package name */
    public int f3849V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3850W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3851X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3852Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3853Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3854a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3855a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3856b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3857b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3858c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3859c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3860d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3861e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3862e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3863f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3864f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3865g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3866g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3867h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3868i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3869j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3870k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3871k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3872l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3873l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3874m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3875m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3876n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3877n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3878o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3879o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3880p;

    /* renamed from: p0, reason: collision with root package name */
    public C0298d f3881p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3882q;

    /* renamed from: r, reason: collision with root package name */
    public float f3883r;

    /* renamed from: s, reason: collision with root package name */
    public int f3884s;

    /* renamed from: t, reason: collision with root package name */
    public int f3885t;

    /* renamed from: u, reason: collision with root package name */
    public int f3886u;

    /* renamed from: v, reason: collision with root package name */
    public int f3887v;

    /* renamed from: w, reason: collision with root package name */
    public int f3888w;

    /* renamed from: x, reason: collision with root package name */
    public int f3889x;

    /* renamed from: y, reason: collision with root package name */
    public int f3890y;

    /* renamed from: z, reason: collision with root package name */
    public int f3891z;

    public final void a() {
        this.f3860d0 = false;
        this.f3855a0 = true;
        this.f3857b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3850W) {
            this.f3855a0 = false;
            if (this.f3839L == 0) {
                this.f3839L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3851X) {
            this.f3857b0 = false;
            if (this.f3840M == 0) {
                this.f3840M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3855a0 = false;
            if (i == 0 && this.f3839L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3850W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3857b0 = false;
            if (i2 == 0 && this.f3840M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3851X = true;
            }
        }
        if (this.f3858c == -1.0f && this.f3854a == -1 && this.f3856b == -1) {
            return;
        }
        this.f3860d0 = true;
        this.f3855a0 = true;
        this.f3857b0 = true;
        if (!(this.f3881p0 instanceof s.h)) {
            this.f3881p0 = new s.h();
        }
        ((s.h) this.f3881p0).S(this.f3849V);
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
        this.f3867h0 = -1;
        this.f3868i0 = -1;
        this.f3864f0 = -1;
        this.f3866g0 = -1;
        this.j0 = this.f3888w;
        this.f3871k0 = this.f3890y;
        float f2 = this.f3833E;
        this.f3873l0 = f2;
        int i8 = this.f3854a;
        this.f3875m0 = i8;
        int i9 = this.f3856b;
        this.f3877n0 = i9;
        float f3 = this.f3858c;
        this.f3879o0 = f3;
        if (z3) {
            int i10 = this.f3884s;
            if (i10 != -1) {
                this.f3867h0 = i10;
            } else {
                int i11 = this.f3885t;
                if (i11 != -1) {
                    this.f3868i0 = i11;
                }
                i2 = this.f3886u;
                if (i2 != -1) {
                    this.f3866g0 = i2;
                    z2 = true;
                }
                i3 = this.f3887v;
                if (i3 != -1) {
                    this.f3864f0 = i3;
                    z2 = true;
                }
                i4 = this.f3829A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3871k0 = i4;
                }
                i5 = this.f3830B;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                if (z2) {
                    this.f3873l0 = 1.0f - f2;
                }
                if (this.f3860d0 && this.f3849V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3879o0 = 1.0f - f3;
                        this.f3875m0 = -1;
                        this.f3877n0 = -1;
                    } else if (i8 != -1) {
                        this.f3877n0 = i8;
                        this.f3875m0 = -1;
                        this.f3879o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3875m0 = i9;
                        this.f3877n0 = -1;
                        this.f3879o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3886u;
            if (i2 != -1) {
            }
            i3 = this.f3887v;
            if (i3 != -1) {
            }
            i4 = this.f3829A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3830B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3860d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3884s;
            if (i12 != -1) {
                this.f3866g0 = i12;
            }
            int i13 = this.f3885t;
            if (i13 != -1) {
                this.f3864f0 = i13;
            }
            int i14 = this.f3886u;
            if (i14 != -1) {
                this.f3867h0 = i14;
            }
            int i15 = this.f3887v;
            if (i15 != -1) {
                this.f3868i0 = i15;
            }
            int i16 = this.f3829A;
            if (i16 != Integer.MIN_VALUE) {
                this.j0 = i16;
            }
            int i17 = this.f3830B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3871k0 = i17;
            }
        }
        if (this.f3886u == -1 && this.f3887v == -1 && this.f3885t == -1 && this.f3884s == -1) {
            int i18 = this.f3865g;
            if (i18 != -1) {
                this.f3867h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3868i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3861e;
            if (i20 != -1) {
                this.f3864f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3863f;
            if (i21 != -1) {
                this.f3866g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
