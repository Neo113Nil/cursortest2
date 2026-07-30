package z;

import android.view.ViewGroup;
import w.C5144d;

/* loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A, reason: collision with root package name */
    public int f41903A;

    /* renamed from: B, reason: collision with root package name */
    public int f41904B;

    /* renamed from: C, reason: collision with root package name */
    public int f41905C;

    /* renamed from: D, reason: collision with root package name */
    public int f41906D;

    /* renamed from: E, reason: collision with root package name */
    public float f41907E;

    /* renamed from: F, reason: collision with root package name */
    public float f41908F;

    /* renamed from: G, reason: collision with root package name */
    public String f41909G;

    /* renamed from: H, reason: collision with root package name */
    public float f41910H;

    /* renamed from: I, reason: collision with root package name */
    public float f41911I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f41912K;

    /* renamed from: L, reason: collision with root package name */
    public int f41913L;

    /* renamed from: M, reason: collision with root package name */
    public int f41914M;

    /* renamed from: N, reason: collision with root package name */
    public int f41915N;

    /* renamed from: O, reason: collision with root package name */
    public int f41916O;

    /* renamed from: P, reason: collision with root package name */
    public int f41917P;

    /* renamed from: Q, reason: collision with root package name */
    public int f41918Q;

    /* renamed from: R, reason: collision with root package name */
    public float f41919R;

    /* renamed from: S, reason: collision with root package name */
    public float f41920S;

    /* renamed from: T, reason: collision with root package name */
    public int f41921T;

    /* renamed from: U, reason: collision with root package name */
    public int f41922U;

    /* renamed from: V, reason: collision with root package name */
    public int f41923V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f41924W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f41925X;
    public String Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f41926Z;

    /* renamed from: a, reason: collision with root package name */
    public int f41927a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f41928a0;

    /* renamed from: b, reason: collision with root package name */
    public int f41929b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f41930b0;

    /* renamed from: c, reason: collision with root package name */
    public float f41931c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f41932c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41933d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f41934d0;

    /* renamed from: e, reason: collision with root package name */
    public int f41935e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f41936e0;

    /* renamed from: f, reason: collision with root package name */
    public int f41937f;

    /* renamed from: f0, reason: collision with root package name */
    public int f41938f0;

    /* renamed from: g, reason: collision with root package name */
    public int f41939g;

    /* renamed from: g0, reason: collision with root package name */
    public int f41940g0;

    /* renamed from: h, reason: collision with root package name */
    public int f41941h;

    /* renamed from: h0, reason: collision with root package name */
    public int f41942h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public int f41943i0;

    /* renamed from: j, reason: collision with root package name */
    public int f41944j;

    /* renamed from: j0, reason: collision with root package name */
    public int f41945j0;

    /* renamed from: k, reason: collision with root package name */
    public int f41946k;

    /* renamed from: k0, reason: collision with root package name */
    public int f41947k0;

    /* renamed from: l, reason: collision with root package name */
    public int f41948l;

    /* renamed from: l0, reason: collision with root package name */
    public float f41949l0;

    /* renamed from: m, reason: collision with root package name */
    public int f41950m;
    public int m0;

    /* renamed from: n, reason: collision with root package name */
    public int f41951n;

    /* renamed from: n0, reason: collision with root package name */
    public int f41952n0;

    /* renamed from: o, reason: collision with root package name */
    public int f41953o;

    /* renamed from: o0, reason: collision with root package name */
    public float f41954o0;

    /* renamed from: p, reason: collision with root package name */
    public int f41955p;

    /* renamed from: p0, reason: collision with root package name */
    public C5144d f41956p0;

    /* renamed from: q, reason: collision with root package name */
    public int f41957q;

    /* renamed from: r, reason: collision with root package name */
    public float f41958r;

    /* renamed from: s, reason: collision with root package name */
    public int f41959s;

    /* renamed from: t, reason: collision with root package name */
    public int f41960t;

    /* renamed from: u, reason: collision with root package name */
    public int f41961u;

    /* renamed from: v, reason: collision with root package name */
    public int f41962v;

    /* renamed from: w, reason: collision with root package name */
    public int f41963w;

    /* renamed from: x, reason: collision with root package name */
    public int f41964x;

    /* renamed from: y, reason: collision with root package name */
    public int f41965y;

    /* renamed from: z, reason: collision with root package name */
    public int f41966z;

    public final void a() {
        this.f41934d0 = false;
        this.f41928a0 = true;
        this.f41930b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f41924W) {
            this.f41928a0 = false;
            if (this.f41913L == 0) {
                this.f41913L = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.f41925X) {
            this.f41930b0 = false;
            if (this.f41914M == 0) {
                this.f41914M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f41928a0 = false;
            if (i == 0 && this.f41913L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f41924W = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f41930b0 = false;
            if (i4 == 0 && this.f41914M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f41925X = true;
            }
        }
        if (this.f41931c == -1.0f && this.f41927a == -1 && this.f41929b == -1) {
            return;
        }
        this.f41934d0 = true;
        this.f41928a0 = true;
        this.f41930b0 = true;
        if (!(this.f41956p0 instanceof w.h)) {
            this.f41956p0 = new w.h();
        }
        ((w.h) this.f41956p0).S(this.f41923V);
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
        int i4;
        int i9;
        int i10;
        int i11;
        int i12 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i13 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z8 = false;
        boolean z9 = 1 == getLayoutDirection();
        this.f41942h0 = -1;
        this.f41943i0 = -1;
        this.f41938f0 = -1;
        this.f41940g0 = -1;
        this.f41945j0 = this.f41963w;
        this.f41947k0 = this.f41965y;
        float f6 = this.f41907E;
        this.f41949l0 = f6;
        int i14 = this.f41927a;
        this.m0 = i14;
        int i15 = this.f41929b;
        this.f41952n0 = i15;
        float f9 = this.f41931c;
        this.f41954o0 = f9;
        if (z9) {
            int i16 = this.f41959s;
            if (i16 != -1) {
                this.f41942h0 = i16;
            } else {
                int i17 = this.f41960t;
                if (i17 != -1) {
                    this.f41943i0 = i17;
                }
                i4 = this.f41961u;
                if (i4 != -1) {
                    this.f41940g0 = i4;
                    z8 = true;
                }
                i9 = this.f41962v;
                if (i9 != -1) {
                    this.f41938f0 = i9;
                    z8 = true;
                }
                i10 = this.f41903A;
                if (i10 != Integer.MIN_VALUE) {
                    this.f41947k0 = i10;
                }
                i11 = this.f41904B;
                if (i11 != Integer.MIN_VALUE) {
                    this.f41945j0 = i11;
                }
                if (z8) {
                    this.f41949l0 = 1.0f - f6;
                }
                if (this.f41934d0 && this.f41923V == 1 && this.f41933d) {
                    if (f9 == -1.0f) {
                        this.f41954o0 = 1.0f - f9;
                        this.m0 = -1;
                        this.f41952n0 = -1;
                    } else if (i14 != -1) {
                        this.f41952n0 = i14;
                        this.m0 = -1;
                        this.f41954o0 = -1.0f;
                    } else if (i15 != -1) {
                        this.m0 = i15;
                        this.f41952n0 = -1;
                        this.f41954o0 = -1.0f;
                    }
                }
            }
            z8 = true;
            i4 = this.f41961u;
            if (i4 != -1) {
            }
            i9 = this.f41962v;
            if (i9 != -1) {
            }
            i10 = this.f41903A;
            if (i10 != Integer.MIN_VALUE) {
            }
            i11 = this.f41904B;
            if (i11 != Integer.MIN_VALUE) {
            }
            if (z8) {
            }
            if (this.f41934d0) {
                if (f9 == -1.0f) {
                }
            }
        } else {
            int i18 = this.f41959s;
            if (i18 != -1) {
                this.f41940g0 = i18;
            }
            int i19 = this.f41960t;
            if (i19 != -1) {
                this.f41938f0 = i19;
            }
            int i20 = this.f41961u;
            if (i20 != -1) {
                this.f41942h0 = i20;
            }
            int i21 = this.f41962v;
            if (i21 != -1) {
                this.f41943i0 = i21;
            }
            int i22 = this.f41903A;
            if (i22 != Integer.MIN_VALUE) {
                this.f41945j0 = i22;
            }
            int i23 = this.f41904B;
            if (i23 != Integer.MIN_VALUE) {
                this.f41947k0 = i23;
            }
        }
        if (this.f41961u == -1 && this.f41962v == -1 && this.f41960t == -1 && this.f41959s == -1) {
            int i24 = this.f41939g;
            if (i24 != -1) {
                this.f41942h0 = i24;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                }
            } else {
                int i25 = this.f41941h;
                if (i25 != -1) {
                    this.f41943i0 = i25;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i13 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i13;
                    }
                }
            }
            int i26 = this.f41935e;
            if (i26 != -1) {
                this.f41938f0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
                return;
            }
            int i27 = this.f41937f;
            if (i27 != -1) {
                this.f41940g0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i12 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i12;
            }
        }
    }
}
