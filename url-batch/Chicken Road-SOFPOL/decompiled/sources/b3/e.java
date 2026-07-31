package b3;

import android.view.ViewGroup;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
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
    public int f1080a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1081a0;

    /* renamed from: b, reason: collision with root package name */
    public int f1082b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1083b0;

    /* renamed from: c, reason: collision with root package name */
    public float f1084c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1085c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1086d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f1087d0;

    /* renamed from: e, reason: collision with root package name */
    public int f1088e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1089e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1090f;

    /* renamed from: f0, reason: collision with root package name */
    public int f1091f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1092g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1093g0;

    /* renamed from: h, reason: collision with root package name */
    public int f1094h;

    /* renamed from: h0, reason: collision with root package name */
    public int f1095h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f1096i0;

    /* renamed from: j, reason: collision with root package name */
    public int f1097j;

    /* renamed from: j0, reason: collision with root package name */
    public int f1098j0;

    /* renamed from: k, reason: collision with root package name */
    public int f1099k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1100k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1101l;

    /* renamed from: l0, reason: collision with root package name */
    public float f1102l0;

    /* renamed from: m, reason: collision with root package name */
    public int f1103m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1104m0;

    /* renamed from: n, reason: collision with root package name */
    public int f1105n;

    /* renamed from: n0, reason: collision with root package name */
    public int f1106n0;

    /* renamed from: o, reason: collision with root package name */
    public int f1107o;

    /* renamed from: o0, reason: collision with root package name */
    public float f1108o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1109p;

    /* renamed from: p0, reason: collision with root package name */
    public y2.d f1110p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1111q;

    /* renamed from: r, reason: collision with root package name */
    public float f1112r;

    /* renamed from: s, reason: collision with root package name */
    public int f1113s;

    /* renamed from: t, reason: collision with root package name */
    public int f1114t;

    /* renamed from: u, reason: collision with root package name */
    public int f1115u;

    /* renamed from: v, reason: collision with root package name */
    public int f1116v;

    /* renamed from: w, reason: collision with root package name */
    public int f1117w;

    /* renamed from: x, reason: collision with root package name */
    public int f1118x;

    /* renamed from: y, reason: collision with root package name */
    public int f1119y;

    /* renamed from: z, reason: collision with root package name */
    public int f1120z;

    public final void a() {
        this.f1087d0 = false;
        this.f1081a0 = true;
        this.f1083b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.f1081a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i8 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i8 == -2 && this.X) {
            this.f1083b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f1081a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i8 == 0 || i8 == -1) {
            this.f1083b0 = false;
            if (i8 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f1084c == -1.0f && this.f1080a == -1 && this.f1082b == -1) {
            return;
        }
        this.f1087d0 = true;
        this.f1081a0 = true;
        this.f1083b0 = true;
        if (!(this.f1110p0 instanceof y2.h)) {
            this.f1110p0 = new y2.h();
        }
        ((y2.h) this.f1110p0).S(this.V);
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
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i13 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z3 = false;
        boolean z7 = 1 == getLayoutDirection();
        this.f1095h0 = -1;
        this.f1096i0 = -1;
        this.f1091f0 = -1;
        this.f1093g0 = -1;
        this.f1098j0 = this.f1117w;
        this.f1100k0 = this.f1119y;
        float f6 = this.E;
        this.f1102l0 = f6;
        int i14 = this.f1080a;
        this.f1104m0 = i14;
        int i15 = this.f1082b;
        this.f1106n0 = i15;
        float f8 = this.f1084c;
        this.f1108o0 = f8;
        if (z7) {
            int i16 = this.f1113s;
            if (i16 != -1) {
                this.f1095h0 = i16;
            } else {
                int i17 = this.f1114t;
                if (i17 != -1) {
                    this.f1096i0 = i17;
                }
                i8 = this.f1115u;
                if (i8 != -1) {
                    this.f1093g0 = i8;
                    z3 = true;
                }
                i9 = this.f1116v;
                if (i9 != -1) {
                    this.f1091f0 = i9;
                    z3 = true;
                }
                i10 = this.A;
                if (i10 != Integer.MIN_VALUE) {
                    this.f1100k0 = i10;
                }
                i11 = this.B;
                if (i11 != Integer.MIN_VALUE) {
                    this.f1098j0 = i11;
                }
                if (z3) {
                    this.f1102l0 = 1.0f - f6;
                }
                if (this.f1087d0 && this.V == 1 && this.f1086d) {
                    if (f8 == -1.0f) {
                        this.f1108o0 = 1.0f - f8;
                        this.f1104m0 = -1;
                        this.f1106n0 = -1;
                    } else if (i14 != -1) {
                        this.f1106n0 = i14;
                        this.f1104m0 = -1;
                        this.f1108o0 = -1.0f;
                    } else if (i15 != -1) {
                        this.f1104m0 = i15;
                        this.f1106n0 = -1;
                        this.f1108o0 = -1.0f;
                    }
                }
            }
            z3 = true;
            i8 = this.f1115u;
            if (i8 != -1) {
            }
            i9 = this.f1116v;
            if (i9 != -1) {
            }
            i10 = this.A;
            if (i10 != Integer.MIN_VALUE) {
            }
            i11 = this.B;
            if (i11 != Integer.MIN_VALUE) {
            }
            if (z3) {
            }
            if (this.f1087d0) {
                if (f8 == -1.0f) {
                }
            }
        } else {
            int i18 = this.f1113s;
            if (i18 != -1) {
                this.f1093g0 = i18;
            }
            int i19 = this.f1114t;
            if (i19 != -1) {
                this.f1091f0 = i19;
            }
            int i20 = this.f1115u;
            if (i20 != -1) {
                this.f1095h0 = i20;
            }
            int i21 = this.f1116v;
            if (i21 != -1) {
                this.f1096i0 = i21;
            }
            int i22 = this.A;
            if (i22 != Integer.MIN_VALUE) {
                this.f1098j0 = i22;
            }
            int i23 = this.B;
            if (i23 != Integer.MIN_VALUE) {
                this.f1100k0 = i23;
            }
        }
        if (this.f1115u == -1 && this.f1116v == -1 && this.f1114t == -1 && this.f1113s == -1) {
            int i24 = this.f1092g;
            if (i24 != -1) {
                this.f1095h0 = i24;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                }
            } else {
                int i25 = this.f1094h;
                if (i25 != -1) {
                    this.f1096i0 = i25;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                    }
                }
            }
            int i26 = this.f1088e;
            if (i26 != -1) {
                this.f1091f0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
                return;
            }
            int i27 = this.f1090f;
            if (i27 != -1) {
                this.f1093g0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
            }
        }
    }
}
