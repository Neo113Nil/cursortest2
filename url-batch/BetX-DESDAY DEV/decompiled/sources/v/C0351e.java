package v;

import android.view.ViewGroup;
import s.C0327d;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f4256A;

    /* renamed from: B, reason: collision with root package name */
    public int f4257B;

    /* renamed from: C, reason: collision with root package name */
    public int f4258C;

    /* renamed from: D, reason: collision with root package name */
    public int f4259D;

    /* renamed from: E, reason: collision with root package name */
    public float f4260E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public String f4261G;

    /* renamed from: H, reason: collision with root package name */
    public float f4262H;

    /* renamed from: I, reason: collision with root package name */
    public float f4263I;

    /* renamed from: J, reason: collision with root package name */
    public int f4264J;

    /* renamed from: K, reason: collision with root package name */
    public int f4265K;

    /* renamed from: L, reason: collision with root package name */
    public int f4266L;

    /* renamed from: M, reason: collision with root package name */
    public int f4267M;

    /* renamed from: N, reason: collision with root package name */
    public int f4268N;

    /* renamed from: O, reason: collision with root package name */
    public int f4269O;

    /* renamed from: P, reason: collision with root package name */
    public int f4270P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4271Q;

    /* renamed from: R, reason: collision with root package name */
    public float f4272R;

    /* renamed from: S, reason: collision with root package name */
    public float f4273S;

    /* renamed from: T, reason: collision with root package name */
    public int f4274T;

    /* renamed from: U, reason: collision with root package name */
    public int f4275U;

    /* renamed from: V, reason: collision with root package name */
    public int f4276V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4277W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f4278X;

    /* renamed from: Y, reason: collision with root package name */
    public String f4279Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f4280Z;

    /* renamed from: a, reason: collision with root package name */
    public int f4281a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4282a0;

    /* renamed from: b, reason: collision with root package name */
    public int f4283b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4284b0;

    /* renamed from: c, reason: collision with root package name */
    public float f4285c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4286c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4287d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4288d0;

    /* renamed from: e, reason: collision with root package name */
    public int f4289e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4290e0;

    /* renamed from: f, reason: collision with root package name */
    public int f4291f;

    /* renamed from: f0, reason: collision with root package name */
    public int f4292f0;

    /* renamed from: g, reason: collision with root package name */
    public int f4293g;

    /* renamed from: g0, reason: collision with root package name */
    public int f4294g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public int f4295h0;
    public int i;
    public int i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4296j;

    /* renamed from: j0, reason: collision with root package name */
    public int f4297j0;

    /* renamed from: k, reason: collision with root package name */
    public int f4298k;

    /* renamed from: k0, reason: collision with root package name */
    public int f4299k0;

    /* renamed from: l, reason: collision with root package name */
    public int f4300l;

    /* renamed from: l0, reason: collision with root package name */
    public float f4301l0;

    /* renamed from: m, reason: collision with root package name */
    public int f4302m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public int f4303n;

    /* renamed from: n0, reason: collision with root package name */
    public int f4304n0;

    /* renamed from: o, reason: collision with root package name */
    public int f4305o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4306o0;

    /* renamed from: p, reason: collision with root package name */
    public int f4307p;

    /* renamed from: p0, reason: collision with root package name */
    public C0327d f4308p0;

    /* renamed from: q, reason: collision with root package name */
    public int f4309q;

    /* renamed from: r, reason: collision with root package name */
    public float f4310r;

    /* renamed from: s, reason: collision with root package name */
    public int f4311s;

    /* renamed from: t, reason: collision with root package name */
    public int f4312t;

    /* renamed from: u, reason: collision with root package name */
    public int f4313u;

    /* renamed from: v, reason: collision with root package name */
    public int f4314v;

    /* renamed from: w, reason: collision with root package name */
    public int f4315w;

    /* renamed from: x, reason: collision with root package name */
    public int f4316x;

    /* renamed from: y, reason: collision with root package name */
    public int f4317y;

    /* renamed from: z, reason: collision with root package name */
    public int f4318z;

    public final void a() {
        this.f4288d0 = false;
        this.f4282a0 = true;
        this.f4284b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f4277W) {
            this.f4282a0 = false;
            if (this.f4266L == 0) {
                this.f4266L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f4278X) {
            this.f4284b0 = false;
            if (this.f4267M == 0) {
                this.f4267M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f4282a0 = false;
            if (i == 0 && this.f4266L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f4277W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f4284b0 = false;
            if (i2 == 0 && this.f4267M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f4278X = true;
            }
        }
        if (this.f4285c == -1.0f && this.f4281a == -1 && this.f4283b == -1) {
            return;
        }
        this.f4288d0 = true;
        this.f4282a0 = true;
        this.f4284b0 = true;
        if (!(this.f4308p0 instanceof s.h)) {
            this.f4308p0 = new s.h();
        }
        ((s.h) this.f4308p0).S(this.f4276V);
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
        this.f4295h0 = -1;
        this.i0 = -1;
        this.f4292f0 = -1;
        this.f4294g0 = -1;
        this.f4297j0 = this.f4315w;
        this.f4299k0 = this.f4317y;
        float f2 = this.f4260E;
        this.f4301l0 = f2;
        int i8 = this.f4281a;
        this.m0 = i8;
        int i9 = this.f4283b;
        this.f4304n0 = i9;
        float f3 = this.f4285c;
        this.f4306o0 = f3;
        if (z3) {
            int i10 = this.f4311s;
            if (i10 != -1) {
                this.f4295h0 = i10;
            } else {
                int i11 = this.f4312t;
                if (i11 != -1) {
                    this.i0 = i11;
                }
                i2 = this.f4313u;
                if (i2 != -1) {
                    this.f4294g0 = i2;
                    z2 = true;
                }
                i3 = this.f4314v;
                if (i3 != -1) {
                    this.f4292f0 = i3;
                    z2 = true;
                }
                i4 = this.f4256A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f4299k0 = i4;
                }
                i5 = this.f4257B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f4297j0 = i5;
                }
                if (z2) {
                    this.f4301l0 = 1.0f - f2;
                }
                if (this.f4288d0 && this.f4276V == 1 && this.f4287d) {
                    if (f3 == -1.0f) {
                        this.f4306o0 = 1.0f - f3;
                        this.m0 = -1;
                        this.f4304n0 = -1;
                    } else if (i8 != -1) {
                        this.f4304n0 = i8;
                        this.m0 = -1;
                        this.f4306o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.m0 = i9;
                        this.f4304n0 = -1;
                        this.f4306o0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i2 = this.f4313u;
            if (i2 != -1) {
            }
            i3 = this.f4314v;
            if (i3 != -1) {
            }
            i4 = this.f4256A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f4257B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z2) {
            }
            if (this.f4288d0) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f4311s;
            if (i12 != -1) {
                this.f4294g0 = i12;
            }
            int i13 = this.f4312t;
            if (i13 != -1) {
                this.f4292f0 = i13;
            }
            int i14 = this.f4313u;
            if (i14 != -1) {
                this.f4295h0 = i14;
            }
            int i15 = this.f4314v;
            if (i15 != -1) {
                this.i0 = i15;
            }
            int i16 = this.f4256A;
            if (i16 != Integer.MIN_VALUE) {
                this.f4297j0 = i16;
            }
            int i17 = this.f4257B;
            if (i17 != Integer.MIN_VALUE) {
                this.f4299k0 = i17;
            }
        }
        if (this.f4313u == -1 && this.f4314v == -1 && this.f4312t == -1 && this.f4311s == -1) {
            int i18 = this.f4293g;
            if (i18 != -1) {
                this.f4295h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.h;
                if (i19 != -1) {
                    this.i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f4289e;
            if (i20 != -1) {
                this.f4292f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f4291f;
            if (i21 != -1) {
                this.f4294g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
