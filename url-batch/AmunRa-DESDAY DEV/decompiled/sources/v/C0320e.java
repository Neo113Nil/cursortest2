package v;

import android.view.ViewGroup;
import s.C0295d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3926A;

    /* renamed from: B, reason: collision with root package name */
    public int f3927B;

    /* renamed from: C, reason: collision with root package name */
    public int f3928C;

    /* renamed from: D, reason: collision with root package name */
    public int f3929D;

    /* renamed from: E, reason: collision with root package name */
    public float f3930E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3931G;

    /* renamed from: H, reason: collision with root package name */
    public float f3932H;

    /* renamed from: I, reason: collision with root package name */
    public float f3933I;

    /* renamed from: J, reason: collision with root package name */
    public int f3934J;

    /* renamed from: K, reason: collision with root package name */
    public int f3935K;

    /* renamed from: L, reason: collision with root package name */
    public int f3936L;

    /* renamed from: M, reason: collision with root package name */
    public int f3937M;

    /* renamed from: N, reason: collision with root package name */
    public int f3938N;

    /* renamed from: O, reason: collision with root package name */
    public int f3939O;

    /* renamed from: P, reason: collision with root package name */
    public int f3940P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3941Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3942R;

    /* renamed from: S, reason: collision with root package name */
    public float f3943S;

    /* renamed from: T, reason: collision with root package name */
    public int f3944T;

    /* renamed from: U, reason: collision with root package name */
    public int f3945U;

    /* renamed from: V, reason: collision with root package name */
    public int f3946V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3947W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3948X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3949Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3950Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3951a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3952a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3953b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3954b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3955c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3956c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3957d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3958e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3959e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3960f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3961f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3962g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3963g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3964h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3965i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3966j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3967k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3968k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3969l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3970l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3971m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3972m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3973n;
    public int n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3974o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3975o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3976p;

    /* renamed from: p0, reason: collision with root package name */
    public C0295d f3977p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3978q;

    /* renamed from: r, reason: collision with root package name */
    public float f3979r;

    /* renamed from: s, reason: collision with root package name */
    public int f3980s;

    /* renamed from: t, reason: collision with root package name */
    public int f3981t;

    /* renamed from: u, reason: collision with root package name */
    public int f3982u;

    /* renamed from: v, reason: collision with root package name */
    public int f3983v;

    /* renamed from: w, reason: collision with root package name */
    public int f3984w;

    /* renamed from: x, reason: collision with root package name */
    public int f3985x;

    /* renamed from: y, reason: collision with root package name */
    public int f3986y;

    /* renamed from: z, reason: collision with root package name */
    public int f3987z;

    public final void a() {
        this.f3957d0 = false;
        this.f3952a0 = true;
        this.f3954b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3947W) {
            this.f3952a0 = false;
            if (this.f3936L == 0) {
                this.f3936L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3948X) {
            this.f3954b0 = false;
            if (this.f3937M == 0) {
                this.f3937M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3952a0 = false;
            if (i == 0 && this.f3936L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3947W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3954b0 = false;
            if (i2 == 0 && this.f3937M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3948X = true;
            }
        }
        if (this.f3955c == -1.0f && this.f3951a == -1 && this.f3953b == -1) {
            return;
        }
        this.f3957d0 = true;
        this.f3952a0 = true;
        this.f3954b0 = true;
        if (!(this.f3977p0 instanceof s.h)) {
            this.f3977p0 = new s.h();
        }
        ((s.h) this.f3977p0).S(this.f3946V);
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
        this.f3964h0 = -1;
        this.f3965i0 = -1;
        this.f3961f0 = -1;
        this.f3963g0 = -1;
        this.j0 = this.f3984w;
        this.f3968k0 = this.f3986y;
        float f2 = this.f3930E;
        this.f3970l0 = f2;
        int i8 = this.f3951a;
        this.f3972m0 = i8;
        int i9 = this.f3953b;
        this.n0 = i9;
        float f3 = this.f3955c;
        this.f3975o0 = f3;
        if (z3) {
            int i10 = this.f3980s;
            if (i10 != -1) {
                this.f3964h0 = i10;
            } else {
                int i11 = this.f3981t;
                if (i11 != -1) {
                    this.f3965i0 = i11;
                }
                i2 = this.f3982u;
                if (i2 != -1) {
                    this.f3963g0 = i2;
                    z2 = true;
                }
                i3 = this.f3983v;
                if (i3 != -1) {
                    this.f3961f0 = i3;
                    z2 = true;
                }
                i4 = this.f3926A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3968k0 = i4;
                }
                i5 = this.f3927B;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                if (z2) {
                    this.f3970l0 = 1.0f - f2;
                }
                if (this.f3957d0 && this.f3946V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3975o0 = 1.0f - f3;
                        this.f3972m0 = -1;
                        this.n0 = -1;
                    } else if (i8 != -1) {
                        this.n0 = i8;
                        this.f3972m0 = -1;
                        this.f3975o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3972m0 = i9;
                        this.n0 = -1;
                        this.f3975o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3982u;
            if (i2 != -1) {
            }
            i3 = this.f3983v;
            if (i3 != -1) {
            }
            i4 = this.f3926A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3927B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3957d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3980s;
            if (i12 != -1) {
                this.f3963g0 = i12;
            }
            int i13 = this.f3981t;
            if (i13 != -1) {
                this.f3961f0 = i13;
            }
            int i14 = this.f3982u;
            if (i14 != -1) {
                this.f3964h0 = i14;
            }
            int i15 = this.f3983v;
            if (i15 != -1) {
                this.f3965i0 = i15;
            }
            int i16 = this.f3926A;
            if (i16 != Integer.MIN_VALUE) {
                this.j0 = i16;
            }
            int i17 = this.f3927B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3968k0 = i17;
            }
        }
        if (this.f3982u == -1 && this.f3983v == -1 && this.f3981t == -1 && this.f3980s == -1) {
            int i18 = this.f3962g;
            if (i18 != -1) {
                this.f3964h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3965i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3958e;
            if (i20 != -1) {
                this.f3961f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3960f;
            if (i21 != -1) {
                this.f3963g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
