package v;

import android.view.ViewGroup;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
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
    public int f3445a;
    public boolean a0;

    /* renamed from: b, reason: collision with root package name */
    public int f3446b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3447b0;
    public float c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3448c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3449d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3450d0;

    /* renamed from: e, reason: collision with root package name */
    public int f3451e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3452e0;

    /* renamed from: f, reason: collision with root package name */
    public int f3453f;
    public int f0;
    public int g;

    /* renamed from: g0, reason: collision with root package name */
    public int f3454g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f3455h0;

    /* renamed from: i, reason: collision with root package name */
    public int f3456i;

    /* renamed from: i0, reason: collision with root package name */
    public int f3457i0;

    /* renamed from: j, reason: collision with root package name */
    public int f3458j;

    /* renamed from: j0, reason: collision with root package name */
    public int f3459j0;

    /* renamed from: k, reason: collision with root package name */
    public int f3460k;

    /* renamed from: k0, reason: collision with root package name */
    public int f3461k0;

    /* renamed from: l, reason: collision with root package name */
    public int f3462l;

    /* renamed from: l0, reason: collision with root package name */
    public float f3463l0;

    /* renamed from: m, reason: collision with root package name */
    public int f3464m;

    /* renamed from: m0, reason: collision with root package name */
    public int f3465m0;

    /* renamed from: n, reason: collision with root package name */
    public int f3466n;

    /* renamed from: n0, reason: collision with root package name */
    public int f3467n0;

    /* renamed from: o, reason: collision with root package name */
    public int f3468o;

    /* renamed from: o0, reason: collision with root package name */
    public float f3469o0;

    /* renamed from: p, reason: collision with root package name */
    public int f3470p;

    /* renamed from: p0, reason: collision with root package name */
    public s.d f3471p0;

    /* renamed from: q, reason: collision with root package name */
    public int f3472q;

    /* renamed from: r, reason: collision with root package name */
    public float f3473r;

    /* renamed from: s, reason: collision with root package name */
    public int f3474s;

    /* renamed from: t, reason: collision with root package name */
    public int f3475t;

    /* renamed from: u, reason: collision with root package name */
    public int f3476u;

    /* renamed from: v, reason: collision with root package name */
    public int f3477v;

    /* renamed from: w, reason: collision with root package name */
    public int f3478w;

    /* renamed from: x, reason: collision with root package name */
    public int f3479x;

    /* renamed from: y, reason: collision with root package name */
    public int f3480y;

    /* renamed from: z, reason: collision with root package name */
    public int f3481z;

    public final void a() {
        this.f3450d0 = false;
        this.a0 = true;
        this.f3447b0 = true;
        int i4 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i4 == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i5 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i5 == -2 && this.X) {
            this.f3447b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.a0 = false;
            if (i4 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i5 == 0 || i5 == -1) {
            this.f3447b0 = false;
            if (i5 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.c == -1.0f && this.f3445a == -1 && this.f3446b == -1) {
            return;
        }
        this.f3450d0 = true;
        this.a0 = true;
        this.f3447b0 = true;
        if (!(this.f3471p0 instanceof s.h)) {
            this.f3471p0 = new s.h();
        }
        ((s.h) this.f3471p0).S(this.V);
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
    public final void resolveLayoutDirection(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i10 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i4);
        boolean z3 = false;
        boolean z4 = 1 == getLayoutDirection();
        this.f3455h0 = -1;
        this.f3457i0 = -1;
        this.f0 = -1;
        this.f3454g0 = -1;
        this.f3459j0 = this.f3478w;
        this.f3461k0 = this.f3480y;
        float f4 = this.E;
        this.f3463l0 = f4;
        int i11 = this.f3445a;
        this.f3465m0 = i11;
        int i12 = this.f3446b;
        this.f3467n0 = i12;
        float f5 = this.c;
        this.f3469o0 = f5;
        if (z4) {
            int i13 = this.f3474s;
            if (i13 != -1) {
                this.f3455h0 = i13;
            } else {
                int i14 = this.f3475t;
                if (i14 != -1) {
                    this.f3457i0 = i14;
                }
                i5 = this.f3476u;
                if (i5 != -1) {
                    this.f3454g0 = i5;
                    z3 = true;
                }
                i6 = this.f3477v;
                if (i6 != -1) {
                    this.f0 = i6;
                    z3 = true;
                }
                i7 = this.A;
                if (i7 != Integer.MIN_VALUE) {
                    this.f3461k0 = i7;
                }
                i8 = this.B;
                if (i8 != Integer.MIN_VALUE) {
                    this.f3459j0 = i8;
                }
                if (z3) {
                    this.f3463l0 = 1.0f - f4;
                }
                if (this.f3450d0 && this.V == 1 && this.f3449d) {
                    if (f5 == -1.0f) {
                        this.f3469o0 = 1.0f - f5;
                        this.f3465m0 = -1;
                        this.f3467n0 = -1;
                    } else if (i11 != -1) {
                        this.f3467n0 = i11;
                        this.f3465m0 = -1;
                        this.f3469o0 = -1.0f;
                    } else if (i12 != -1) {
                        this.f3465m0 = i12;
                        this.f3467n0 = -1;
                        this.f3469o0 = -1.0f;
                    }
                }
            }
            z3 = true;
            i5 = this.f3476u;
            if (i5 != -1) {
            }
            i6 = this.f3477v;
            if (i6 != -1) {
            }
            i7 = this.A;
            if (i7 != Integer.MIN_VALUE) {
            }
            i8 = this.B;
            if (i8 != Integer.MIN_VALUE) {
            }
            if (z3) {
            }
            if (this.f3450d0) {
                if (f5 == -1.0f) {
                }
            }
        } else {
            int i15 = this.f3474s;
            if (i15 != -1) {
                this.f3454g0 = i15;
            }
            int i16 = this.f3475t;
            if (i16 != -1) {
                this.f0 = i16;
            }
            int i17 = this.f3476u;
            if (i17 != -1) {
                this.f3455h0 = i17;
            }
            int i18 = this.f3477v;
            if (i18 != -1) {
                this.f3457i0 = i18;
            }
            int i19 = this.A;
            if (i19 != Integer.MIN_VALUE) {
                this.f3459j0 = i19;
            }
            int i20 = this.B;
            if (i20 != Integer.MIN_VALUE) {
                this.f3461k0 = i20;
            }
        }
        if (this.f3476u == -1 && this.f3477v == -1 && this.f3475t == -1 && this.f3474s == -1) {
            int i21 = this.g;
            if (i21 != -1) {
                this.f3455h0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                }
            } else {
                int i22 = this.h;
                if (i22 != -1) {
                    this.f3457i0 = i22;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i10 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i10;
                    }
                }
            }
            int i23 = this.f3451e;
            if (i23 != -1) {
                this.f0 = i23;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
                return;
            }
            int i24 = this.f3453f;
            if (i24 != -1) {
                this.f3454g0 = i24;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i9 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i9;
            }
        }
    }
}
