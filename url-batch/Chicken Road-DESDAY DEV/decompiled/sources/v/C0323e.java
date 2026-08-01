package v;

import android.view.ViewGroup;
import s.C0296d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3920A;

    /* renamed from: B, reason: collision with root package name */
    public int f3921B;

    /* renamed from: C, reason: collision with root package name */
    public int f3922C;

    /* renamed from: D, reason: collision with root package name */
    public int f3923D;

    /* renamed from: E, reason: collision with root package name */
    public float f3924E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3925G;

    /* renamed from: H, reason: collision with root package name */
    public float f3926H;

    /* renamed from: I, reason: collision with root package name */
    public float f3927I;

    /* renamed from: J, reason: collision with root package name */
    public int f3928J;

    /* renamed from: K, reason: collision with root package name */
    public int f3929K;

    /* renamed from: L, reason: collision with root package name */
    public int f3930L;

    /* renamed from: M, reason: collision with root package name */
    public int f3931M;

    /* renamed from: N, reason: collision with root package name */
    public int f3932N;

    /* renamed from: O, reason: collision with root package name */
    public int f3933O;

    /* renamed from: P, reason: collision with root package name */
    public int f3934P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3935Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3936R;

    /* renamed from: S, reason: collision with root package name */
    public float f3937S;

    /* renamed from: T, reason: collision with root package name */
    public int f3938T;

    /* renamed from: U, reason: collision with root package name */
    public int f3939U;

    /* renamed from: V, reason: collision with root package name */
    public int f3940V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3941W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3942X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3943Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3944Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3945a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3946a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3947b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3948b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3949c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3950c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3951d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3952e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3953e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3954f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3955f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3956g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3957g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3958h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3959i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3960j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3961j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3962k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3963k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3964l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3965l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3966m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3967m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3968n;
    public int n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3969o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3970o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3971p;

    /* renamed from: p0, reason: collision with root package name */
    public C0296d f3972p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3973q;

    /* renamed from: r, reason: collision with root package name */
    public float f3974r;

    /* renamed from: s, reason: collision with root package name */
    public int f3975s;

    /* renamed from: t, reason: collision with root package name */
    public int f3976t;

    /* renamed from: u, reason: collision with root package name */
    public int f3977u;

    /* renamed from: v, reason: collision with root package name */
    public int f3978v;

    /* renamed from: w, reason: collision with root package name */
    public int f3979w;

    /* renamed from: x, reason: collision with root package name */
    public int f3980x;

    /* renamed from: y, reason: collision with root package name */
    public int f3981y;

    /* renamed from: z, reason: collision with root package name */
    public int f3982z;

    public final void a() {
        this.f3951d0 = false;
        this.f3946a0 = true;
        this.f3948b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3941W) {
            this.f3946a0 = false;
            if (this.f3930L == 0) {
                this.f3930L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3942X) {
            this.f3948b0 = false;
            if (this.f3931M == 0) {
                this.f3931M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3946a0 = false;
            if (i == 0 && this.f3930L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3941W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3948b0 = false;
            if (i2 == 0 && this.f3931M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3942X = true;
            }
        }
        if (this.f3949c == -1.0f && this.f3945a == -1 && this.f3947b == -1) {
            return;
        }
        this.f3951d0 = true;
        this.f3946a0 = true;
        this.f3948b0 = true;
        if (!(this.f3972p0 instanceof s.h)) {
            this.f3972p0 = new s.h();
        }
        ((s.h) this.f3972p0).S(this.f3940V);
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
        this.f3958h0 = -1;
        this.f3959i0 = -1;
        this.f3955f0 = -1;
        this.f3957g0 = -1;
        this.f3961j0 = this.f3979w;
        this.f3963k0 = this.f3981y;
        float f2 = this.f3924E;
        this.f3965l0 = f2;
        int i8 = this.f3945a;
        this.f3967m0 = i8;
        int i9 = this.f3947b;
        this.n0 = i9;
        float f3 = this.f3949c;
        this.f3970o0 = f3;
        if (z3) {
            int i10 = this.f3975s;
            if (i10 != -1) {
                this.f3958h0 = i10;
            } else {
                int i11 = this.f3976t;
                if (i11 != -1) {
                    this.f3959i0 = i11;
                }
                i2 = this.f3977u;
                if (i2 != -1) {
                    this.f3957g0 = i2;
                    z2 = true;
                }
                i3 = this.f3978v;
                if (i3 != -1) {
                    this.f3955f0 = i3;
                    z2 = true;
                }
                i4 = this.f3920A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3963k0 = i4;
                }
                i5 = this.f3921B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f3961j0 = i5;
                }
                if (z2) {
                    this.f3965l0 = 1.0f - f2;
                }
                if (this.f3951d0 && this.f3940V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3970o0 = 1.0f - f3;
                        this.f3967m0 = -1;
                        this.n0 = -1;
                    } else if (i8 != -1) {
                        this.n0 = i8;
                        this.f3967m0 = -1;
                        this.f3970o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3967m0 = i9;
                        this.n0 = -1;
                        this.f3970o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3977u;
            if (i2 != -1) {
            }
            i3 = this.f3978v;
            if (i3 != -1) {
            }
            i4 = this.f3920A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3921B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3951d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3975s;
            if (i12 != -1) {
                this.f3957g0 = i12;
            }
            int i13 = this.f3976t;
            if (i13 != -1) {
                this.f3955f0 = i13;
            }
            int i14 = this.f3977u;
            if (i14 != -1) {
                this.f3958h0 = i14;
            }
            int i15 = this.f3978v;
            if (i15 != -1) {
                this.f3959i0 = i15;
            }
            int i16 = this.f3920A;
            if (i16 != Integer.MIN_VALUE) {
                this.f3961j0 = i16;
            }
            int i17 = this.f3921B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3963k0 = i17;
            }
        }
        if (this.f3977u == -1 && this.f3978v == -1 && this.f3976t == -1 && this.f3975s == -1) {
            int i18 = this.f3956g;
            if (i18 != -1) {
                this.f3958h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3959i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3952e;
            if (i20 != -1) {
                this.f3955f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3954f;
            if (i21 != -1) {
                this.f3957g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
