package v;

import android.view.ViewGroup;
import s.C0298d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f3850A;

    /* renamed from: B, reason: collision with root package name */
    public int f3851B;

    /* renamed from: C, reason: collision with root package name */
    public int f3852C;

    /* renamed from: D, reason: collision with root package name */
    public int f3853D;

    /* renamed from: E, reason: collision with root package name */
    public float f3854E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f3855G;

    /* renamed from: H, reason: collision with root package name */
    public float f3856H;

    /* renamed from: I, reason: collision with root package name */
    public float f3857I;

    /* renamed from: J, reason: collision with root package name */
    public int f3858J;

    /* renamed from: K, reason: collision with root package name */
    public int f3859K;

    /* renamed from: L, reason: collision with root package name */
    public int f3860L;

    /* renamed from: M, reason: collision with root package name */
    public int f3861M;

    /* renamed from: N, reason: collision with root package name */
    public int f3862N;

    /* renamed from: O, reason: collision with root package name */
    public int f3863O;

    /* renamed from: P, reason: collision with root package name */
    public int f3864P;

    /* renamed from: Q, reason: collision with root package name */
    public int f3865Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3866R;

    /* renamed from: S, reason: collision with root package name */
    public float f3867S;

    /* renamed from: T, reason: collision with root package name */
    public int f3868T;

    /* renamed from: U, reason: collision with root package name */
    public int f3869U;

    /* renamed from: V, reason: collision with root package name */
    public int f3870V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3871W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3872X;

    /* renamed from: Y, reason: collision with root package name */
    public String f3873Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3874Z;

    /* renamed from: a, reason: collision with root package name */
    public int f3875a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3876a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3877b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3878b0;

    /* renamed from: c, reason: collision with root package name */
    public float f3879c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3880c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3881d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3882e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3883e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3884f;

    /* renamed from: f0, reason: collision with root package name */
    public int f3885f0;

    /* renamed from: g, reason: collision with root package name */
    public int f3886g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3887g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3888h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3889i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3890j;
    public int j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3891k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3892k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3893l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3894l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3895m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3896m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3897n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3898n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3899o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3900o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3901p;

    /* renamed from: p0, reason: collision with root package name */
    public C0298d f3902p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3903q;

    /* renamed from: r, reason: collision with root package name */
    public float f3904r;

    /* renamed from: s, reason: collision with root package name */
    public int f3905s;

    /* renamed from: t, reason: collision with root package name */
    public int f3906t;

    /* renamed from: u, reason: collision with root package name */
    public int f3907u;

    /* renamed from: v, reason: collision with root package name */
    public int f3908v;

    /* renamed from: w, reason: collision with root package name */
    public int f3909w;

    /* renamed from: x, reason: collision with root package name */
    public int f3910x;

    /* renamed from: y, reason: collision with root package name */
    public int f3911y;

    /* renamed from: z, reason: collision with root package name */
    public int f3912z;

    public final void a() {
        this.f3881d0 = false;
        this.f3876a0 = true;
        this.f3878b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3871W) {
            this.f3876a0 = false;
            if (this.f3860L == 0) {
                this.f3860L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3872X) {
            this.f3878b0 = false;
            if (this.f3861M == 0) {
                this.f3861M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3876a0 = false;
            if (i == 0 && this.f3860L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3871W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3878b0 = false;
            if (i2 == 0 && this.f3861M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3872X = true;
            }
        }
        if (this.f3879c == -1.0f && this.f3875a == -1 && this.f3877b == -1) {
            return;
        }
        this.f3881d0 = true;
        this.f3876a0 = true;
        this.f3878b0 = true;
        if (!(this.f3902p0 instanceof s.h)) {
            this.f3902p0 = new s.h();
        }
        ((s.h) this.f3902p0).S(this.f3870V);
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
        this.f3888h0 = -1;
        this.f3889i0 = -1;
        this.f3885f0 = -1;
        this.f3887g0 = -1;
        this.j0 = this.f3909w;
        this.f3892k0 = this.f3911y;
        float f2 = this.f3854E;
        this.f3894l0 = f2;
        int i8 = this.f3875a;
        this.f3896m0 = i8;
        int i9 = this.f3877b;
        this.f3898n0 = i9;
        float f3 = this.f3879c;
        this.f3900o0 = f3;
        if (z3) {
            int i10 = this.f3905s;
            if (i10 != -1) {
                this.f3888h0 = i10;
            } else {
                int i11 = this.f3906t;
                if (i11 != -1) {
                    this.f3889i0 = i11;
                }
                i2 = this.f3907u;
                if (i2 != -1) {
                    this.f3887g0 = i2;
                    z2 = true;
                }
                i3 = this.f3908v;
                if (i3 != -1) {
                    this.f3885f0 = i3;
                    z2 = true;
                }
                i4 = this.f3850A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f3892k0 = i4;
                }
                i5 = this.f3851B;
                if (i5 != Integer.MIN_VALUE) {
                    this.j0 = i5;
                }
                if (z2) {
                    this.f3894l0 = 1.0f - f2;
                }
                if (this.f3881d0 && this.f3870V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.f3900o0 = 1.0f - f3;
                        this.f3896m0 = -1;
                        this.f3898n0 = -1;
                    } else if (i8 != -1) {
                        this.f3898n0 = i8;
                        this.f3896m0 = -1;
                        this.f3900o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f3896m0 = i9;
                        this.f3898n0 = -1;
                        this.f3900o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f3907u;
            if (i2 != -1) {
            }
            i3 = this.f3908v;
            if (i3 != -1) {
            }
            i4 = this.f3850A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f3851B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f3881d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f3905s;
            if (i12 != -1) {
                this.f3887g0 = i12;
            }
            int i13 = this.f3906t;
            if (i13 != -1) {
                this.f3885f0 = i13;
            }
            int i14 = this.f3907u;
            if (i14 != -1) {
                this.f3888h0 = i14;
            }
            int i15 = this.f3908v;
            if (i15 != -1) {
                this.f3889i0 = i15;
            }
            int i16 = this.f3850A;
            if (i16 != Integer.MIN_VALUE) {
                this.j0 = i16;
            }
            int i17 = this.f3851B;
            if (i17 != Integer.MIN_VALUE) {
                this.f3892k0 = i17;
            }
        }
        if (this.f3907u == -1 && this.f3908v == -1 && this.f3906t == -1 && this.f3905s == -1) {
            int i18 = this.f3886g;
            if (i18 != -1) {
                this.f3888h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f3889i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f3882e;
            if (i20 != -1) {
                this.f3885f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f3884f;
            if (i21 != -1) {
                this.f3887g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
