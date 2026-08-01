package v;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f4255A;

    /* renamed from: B, reason: collision with root package name */
    public int f4256B;

    /* renamed from: C, reason: collision with root package name */
    public int f4257C;

    /* renamed from: D, reason: collision with root package name */
    public int f4258D;

    /* renamed from: E, reason: collision with root package name */
    public float f4259E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f4260G;

    /* renamed from: H, reason: collision with root package name */
    public float f4261H;

    /* renamed from: I, reason: collision with root package name */
    public float f4262I;

    /* renamed from: J, reason: collision with root package name */
    public int f4263J;

    /* renamed from: K, reason: collision with root package name */
    public int f4264K;

    /* renamed from: L, reason: collision with root package name */
    public int f4265L;

    /* renamed from: M, reason: collision with root package name */
    public int f4266M;

    /* renamed from: N, reason: collision with root package name */
    public int f4267N;

    /* renamed from: O, reason: collision with root package name */
    public int f4268O;

    /* renamed from: P, reason: collision with root package name */
    public int f4269P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4270Q;

    /* renamed from: R, reason: collision with root package name */
    public float f4271R;

    /* renamed from: S, reason: collision with root package name */
    public float f4272S;

    /* renamed from: T, reason: collision with root package name */
    public int f4273T;

    /* renamed from: U, reason: collision with root package name */
    public int f4274U;

    /* renamed from: V, reason: collision with root package name */
    public int f4275V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4276W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4277X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4278Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4279Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4280a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4281a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4282b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4283b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4284c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4285c0;
    public boolean d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4286d0;

    /* renamed from: e, reason: collision with root package name */
    public int f4287e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4288e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4289f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4290f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4291g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4292g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4293h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f4294i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4295j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4296j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4297k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4298k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4299l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4300l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4301m;

    /* renamed from: m0, reason: collision with root package name */
    public int f4302m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4303n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4304n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4305o;
    public float o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4306p;

    /* renamed from: p0, reason: collision with root package name */
    public s.d f4307p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4308q;

    /* renamed from: r, reason: collision with root package name */
    public float f4309r;

    /* renamed from: s, reason: collision with root package name */
    public int f4310s;

    /* renamed from: t, reason: collision with root package name */
    public int f4311t;

    /* renamed from: u, reason: collision with root package name */
    public int f4312u;

    /* renamed from: v, reason: collision with root package name */
    public int f4313v;

    /* renamed from: w, reason: collision with root package name */
    public int f4314w;

    /* renamed from: x, reason: collision with root package name */
    public int f4315x;

    /* renamed from: y, reason: collision with root package name */
    public int f4316y;

    /* renamed from: z, reason: collision with root package name */
    public int f4317z;

    public final void a() {
        this.f4286d0 = false;
        this.f4281a0 = true;
        this.f4283b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f4276W) {
            this.f4281a0 = false;
            if (this.f4265L == 0) {
                this.f4265L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f4277X) {
            this.f4283b0 = false;
            if (this.f4266M == 0) {
                this.f4266M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f4281a0 = false;
            if (i == 0 && this.f4265L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4276W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4283b0 = false;
            if (i2 == 0 && this.f4266M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4277X = true;
            }
        }
        if (this.f4284c == -1.0f && this.f4280a == -1 && this.f4282b == -1) {
            return;
        }
        this.f4286d0 = true;
        this.f4281a0 = true;
        this.f4283b0 = true;
        if (!(this.f4307p0 instanceof s.h)) {
            this.f4307p0 = new s.h();
        }
        ((s.h) this.f4307p0).S(this.f4275V);
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
        this.f4293h0 = -1;
        this.f4294i0 = -1;
        this.f4290f0 = -1;
        this.f4292g0 = -1;
        this.f4296j0 = this.f4314w;
        this.f4298k0 = this.f4316y;
        float f2 = this.f4259E;
        this.f4300l0 = f2;
        int i8 = this.f4280a;
        this.f4302m0 = i8;
        int i9 = this.f4282b;
        this.f4304n0 = i9;
        float f3 = this.f4284c;
        this.o0 = f3;
        if (z3) {
            int i10 = this.f4310s;
            if (i10 != -1) {
                this.f4293h0 = i10;
            } else {
                int i11 = this.f4311t;
                if (i11 != -1) {
                    this.f4294i0 = i11;
                }
                i2 = this.f4312u;
                if (i2 != -1) {
                    this.f4292g0 = i2;
                    z2 = true;
                }
                i3 = this.f4313v;
                if (i3 != -1) {
                    this.f4290f0 = i3;
                    z2 = true;
                }
                i4 = this.f4255A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4298k0 = i4;
                }
                i5 = this.f4256B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4296j0 = i5;
                }
                if (z2) {
                    this.f4300l0 = 1.0f - f2;
                }
                if (this.f4286d0 && this.f4275V == 1 && this.d) {
                    if (f3 == -1.0f) {
                        this.o0 = 1.0f - f3;
                        this.f4302m0 = -1;
                        this.f4304n0 = -1;
                    } else if (i8 != -1) {
                        this.f4304n0 = i8;
                        this.f4302m0 = -1;
                        this.o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f4302m0 = i9;
                        this.f4304n0 = -1;
                        this.o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4312u;
            if (i2 != -1) {
            }
            i3 = this.f4313v;
            if (i3 != -1) {
            }
            i4 = this.f4255A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f4256B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4286d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4310s;
            if (i12 != -1) {
                this.f4292g0 = i12;
            }
            int i13 = this.f4311t;
            if (i13 != -1) {
                this.f4290f0 = i13;
            }
            int i14 = this.f4312u;
            if (i14 != -1) {
                this.f4293h0 = i14;
            }
            int i15 = this.f4313v;
            if (i15 != -1) {
                this.f4294i0 = i15;
            }
            int i16 = this.f4255A;
            if (i16 != Integer.MIN_VALUE) {
                this.f4296j0 = i16;
            }
            int i17 = this.f4256B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4298k0 = i17;
            }
        }
        if (this.f4312u == -1 && this.f4313v == -1 && this.f4311t == -1 && this.f4310s == -1) {
            int i18 = this.f4291g;
            if (i18 != -1) {
                this.f4293h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.f4294i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f4287e;
            if (i20 != -1) {
                this.f4290f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f4289f;
            if (i21 != -1) {
                this.f4292g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
