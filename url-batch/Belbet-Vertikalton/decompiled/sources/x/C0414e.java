package x;

import android.view.ViewGroup;
import u.C0387d;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f4523A;

    /* renamed from: B, reason: collision with root package name */
    public int f4524B;

    /* renamed from: C, reason: collision with root package name */
    public int f4525C;

    /* renamed from: D, reason: collision with root package name */
    public int f4526D;

    /* renamed from: E, reason: collision with root package name */
    public float f4527E;

    /* renamed from: F, reason: collision with root package name */
    public float f4528F;

    /* renamed from: G, reason: collision with root package name */
    public String f4529G;
    public float H;

    /* renamed from: I, reason: collision with root package name */
    public float f4530I;

    /* renamed from: J, reason: collision with root package name */
    public int f4531J;

    /* renamed from: K, reason: collision with root package name */
    public int f4532K;

    /* renamed from: L, reason: collision with root package name */
    public int f4533L;

    /* renamed from: M, reason: collision with root package name */
    public int f4534M;

    /* renamed from: N, reason: collision with root package name */
    public int f4535N;

    /* renamed from: O, reason: collision with root package name */
    public int f4536O;

    /* renamed from: P, reason: collision with root package name */
    public int f4537P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4538Q;

    /* renamed from: R, reason: collision with root package name */
    public float f4539R;

    /* renamed from: S, reason: collision with root package name */
    public float f4540S;

    /* renamed from: T, reason: collision with root package name */
    public int f4541T;

    /* renamed from: U, reason: collision with root package name */
    public int f4542U;

    /* renamed from: V, reason: collision with root package name */
    public int f4543V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4544W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4545X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4546Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4547Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4548a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4549a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4550b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4551b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4552c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4553c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4554d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4555d0;
    public int e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4556e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4557f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4558f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4559g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4560g0;

    /* renamed from: h, reason: collision with root package name */
    public int f4561h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4562h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4563i0;
    public int j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4564j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4565k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4566k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4567l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4568l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4569m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4570m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4571n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4572n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4573o;
    public float o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4574p;

    /* renamed from: p0, reason: collision with root package name */
    public C0387d f4575p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4576q;

    /* renamed from: r, reason: collision with root package name */
    public float f4577r;

    /* renamed from: s, reason: collision with root package name */
    public int f4578s;

    /* renamed from: t, reason: collision with root package name */
    public int f4579t;

    /* renamed from: u, reason: collision with root package name */
    public int f4580u;

    /* renamed from: v, reason: collision with root package name */
    public int f4581v;

    /* renamed from: w, reason: collision with root package name */
    public int f4582w;

    /* renamed from: x, reason: collision with root package name */
    public int f4583x;

    /* renamed from: y, reason: collision with root package name */
    public int f4584y;

    /* renamed from: z, reason: collision with root package name */
    public int f4585z;

    public final void a() {
        this.f4555d0 = false;
        this.f4549a0 = true;
        this.f4551b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f4544W) {
            this.f4549a0 = false;
            if (this.f4533L == 0) {
                this.f4533L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f4545X) {
            this.f4551b0 = false;
            if (this.f4534M == 0) {
                this.f4534M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f4549a0 = false;
            if (i == 0 && this.f4533L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4544W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4551b0 = false;
            if (i2 == 0 && this.f4534M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4545X = true;
            }
        }
        if (this.f4552c == -1.0f && this.f4548a == -1 && this.f4550b == -1) {
            return;
        }
        this.f4555d0 = true;
        this.f4549a0 = true;
        this.f4551b0 = true;
        if (!(this.f4575p0 instanceof u.h)) {
            this.f4575p0 = new u.h();
        }
        ((u.h) this.f4575p0).S(this.f4543V);
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
        this.f4562h0 = -1;
        this.f4563i0 = -1;
        this.f4558f0 = -1;
        this.f4560g0 = -1;
        this.f4564j0 = this.f4582w;
        this.f4566k0 = this.f4584y;
        float f2 = this.f4527E;
        this.f4568l0 = f2;
        int i8 = this.f4548a;
        this.f4570m0 = i8;
        int i9 = this.f4550b;
        this.f4572n0 = i9;
        float f3 = this.f4552c;
        this.o0 = f3;
        if (z3) {
            int i10 = this.f4578s;
            if (i10 != -1) {
                this.f4562h0 = i10;
            } else {
                int i11 = this.f4579t;
                if (i11 != -1) {
                    this.f4563i0 = i11;
                }
                i2 = this.f4580u;
                if (i2 != -1) {
                    this.f4560g0 = i2;
                    z2 = true;
                }
                i3 = this.f4581v;
                if (i3 != -1) {
                    this.f4558f0 = i3;
                    z2 = true;
                }
                i4 = this.f4523A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4566k0 = i4;
                }
                i5 = this.f4524B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4564j0 = i5;
                }
                if (z2) {
                    this.f4568l0 = 1.0f - f2;
                }
                if (this.f4555d0 && this.f4543V == 1 && this.f4554d) {
                    if (f3 == -1.0f) {
                        this.o0 = 1.0f - f3;
                        this.f4570m0 = -1;
                        this.f4572n0 = -1;
                    } else if (i8 != -1) {
                        this.f4572n0 = i8;
                        this.f4570m0 = -1;
                        this.o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f4570m0 = i9;
                        this.f4572n0 = -1;
                        this.o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4580u;
            if (i2 != -1) {
            }
            i3 = this.f4581v;
            if (i3 != -1) {
            }
            i4 = this.f4523A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f4524B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4555d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4578s;
            if (i12 != -1) {
                this.f4560g0 = i12;
            }
            int i13 = this.f4579t;
            if (i13 != -1) {
                this.f4558f0 = i13;
            }
            int i14 = this.f4580u;
            if (i14 != -1) {
                this.f4562h0 = i14;
            }
            int i15 = this.f4581v;
            if (i15 != -1) {
                this.f4563i0 = i15;
            }
            int i16 = this.f4523A;
            if (i16 != Integer.MIN_VALUE) {
                this.f4564j0 = i16;
            }
            int i17 = this.f4524B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4566k0 = i17;
            }
        }
        if (this.f4580u == -1 && this.f4581v == -1 && this.f4579t == -1 && this.f4578s == -1) {
            int i18 = this.f4559g;
            if (i18 != -1) {
                this.f4562h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f4561h;
                if (i19 != -1) {
                    this.f4563i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.e;
            if (i20 != -1) {
                this.f4558f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f4557f;
            if (i21 != -1) {
                this.f4560g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
