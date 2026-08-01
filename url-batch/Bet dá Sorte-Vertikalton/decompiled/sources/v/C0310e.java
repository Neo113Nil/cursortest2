package v;

import android.view.ViewGroup;
import s.C0281d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3982A;

    /* renamed from: B, reason: collision with root package name */
    public int f3983B;

    /* renamed from: C, reason: collision with root package name */
    public int f3984C;

    /* renamed from: D, reason: collision with root package name */
    public int f3985D;

    /* renamed from: E, reason: collision with root package name */
    public float f3986E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3987G;

    /* renamed from: H, reason: collision with root package name */
    public float f3988H;

    /* renamed from: I, reason: collision with root package name */
    public float f3989I;

    /* renamed from: J, reason: collision with root package name */
    public int f3990J;

    /* renamed from: K, reason: collision with root package name */
    public int f3991K;

    /* renamed from: L, reason: collision with root package name */
    public int f3992L;

    /* renamed from: M, reason: collision with root package name */
    public int f3993M;

    /* renamed from: N, reason: collision with root package name */
    public int f3994N;

    /* renamed from: O, reason: collision with root package name */
    public int f3995O;

    /* renamed from: P, reason: collision with root package name */
    public int f3996P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3997Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3998R;

    /* renamed from: S, reason: collision with root package name */
    public float f3999S;

    /* renamed from: T, reason: collision with root package name */
    public int f4000T;

    /* renamed from: U, reason: collision with root package name */
    public int f4001U;

    /* renamed from: V, reason: collision with root package name */
    public int f4002V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4003W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4004X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4005Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4006Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4007a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4008a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4009b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4010b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4011c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4012c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4013d0;

    /* renamed from: e, reason: collision with root package name */
    public int f4014e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4015e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4016f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4017f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4018g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4019g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4020h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4021i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4022j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4023k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4024k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4025l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4026l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4027m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4028m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4029n;
    public int n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4030o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4031o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4032p;

    /* renamed from: p0, reason: collision with root package name */
    public C0281d f4033p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4034q;

    /* renamed from: r, reason: collision with root package name */
    public float f4035r;

    /* renamed from: s, reason: collision with root package name */
    public int f4036s;

    /* renamed from: t, reason: collision with root package name */
    public int f4037t;

    /* renamed from: u, reason: collision with root package name */
    public int f4038u;

    /* renamed from: v, reason: collision with root package name */
    public int f4039v;

    /* renamed from: w, reason: collision with root package name */
    public int f4040w;

    /* renamed from: x, reason: collision with root package name */
    public int f4041x;

    /* renamed from: y, reason: collision with root package name */
    public int f4042y;

    /* renamed from: z, reason: collision with root package name */
    public int f4043z;

    public final void a() {
        this.f4013d0 = false;
        this.f4008a0 = true;
        this.f4010b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f4003W) {
            this.f4008a0 = false;
            if (this.f3992L == 0) {
                this.f3992L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f4004X) {
            this.f4010b0 = false;
            if (this.f3993M == 0) {
                this.f3993M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f4008a0 = false;
            if (i == 0 && this.f3992L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4003W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4010b0 = false;
            if (i2 == 0 && this.f3993M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4004X = true;
            }
        }
        if (this.f4011c == -1.0f && this.f4007a == -1 && this.f4009b == -1) {
            return;
        }
        this.f4013d0 = true;
        this.f4008a0 = true;
        this.f4010b0 = true;
        if (!(this.f4033p0 instanceof s.h)) {
            this.f4033p0 = new s.h();
        }
        ((s.h) this.f4033p0).S(this.f4002V);
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
        this.f4020h0 = -1;
        this.f4021i0 = -1;
        this.f4017f0 = -1;
        this.f4019g0 = -1;
        this.j0 = this.f4040w;
        this.f4024k0 = this.f4042y;
        float f2 = this.f3986E;
        this.f4026l0 = f2;
        int i8 = this.f4007a;
        this.f4028m0 = i8;
        int i9 = this.f4009b;
        this.n0 = i9;
        float f3 = this.f4011c;
        this.f4031o0 = f3;
        if (z3) {
            int i10 = this.f4036s;
            if (i10 != -1) {
                this.f4020h0 = i10;
            } else {
                int i11 = this.f4037t;
                if (i11 != -1) {
                    this.f4021i0 = i11;
                }
                i2 = this.f4038u;
                if (i2 != -1) {
                    this.f4019g0 = i2;
                    z2 = true;
                }
                i3 = this.f4039v;
                if (i3 != -1) {
                    this.f4017f0 = i3;
                    z2 = true;
                }
                i4 = this.f3982A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4024k0 = i4;
                }
                i5 = this.f3983B;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                if (z2) {
                    this.f4026l0 = 1.0f - f2;
                }
                if (this.f4013d0 && this.f4002V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f4031o0 = 1.0f - f3;
                        this.f4028m0 = -1;
                        this.n0 = -1;
                    } else if (i8 != -1) {
                        this.n0 = i8;
                        this.f4028m0 = -1;
                        this.f4031o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f4028m0 = i9;
                        this.n0 = -1;
                        this.f4031o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4038u;
            if (i2 != -1) {
            }
            i3 = this.f4039v;
            if (i3 != -1) {
            }
            i4 = this.f3982A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3983B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4013d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4036s;
            if (i12 != -1) {
                this.f4019g0 = i12;
            }
            int i13 = this.f4037t;
            if (i13 != -1) {
                this.f4017f0 = i13;
            }
            int i14 = this.f4038u;
            if (i14 != -1) {
                this.f4020h0 = i14;
            }
            int i15 = this.f4039v;
            if (i15 != -1) {
                this.f4021i0 = i15;
            }
            int i16 = this.f3982A;
            if (i16 != Integer.MIN_VALUE) {
                this.j0 = i16;
            }
            int i17 = this.f3983B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4024k0 = i17;
            }
        }
        if (this.f4038u == -1 && this.f4039v == -1 && this.f4037t == -1 && this.f4036s == -1) {
            int i18 = this.f4018g;
            if (i18 != -1) {
                this.f4020h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f4021i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f4014e;
            if (i20 != -1) {
                this.f4017f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f4016f;
            if (i21 != -1) {
                this.f4019g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
