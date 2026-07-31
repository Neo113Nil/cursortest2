package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h74 implements td4 {
    private c0 A;
    private boolean B;
    private boolean C;
    private c34 D;

    /* renamed from: a, reason: collision with root package name */
    private final b74 f6103a;

    /* renamed from: d, reason: collision with root package name */
    private final b34 f6106d;

    /* renamed from: e, reason: collision with root package name */
    private final v24 f6107e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f6108f;

    /* renamed from: g, reason: collision with root package name */
    private g74 f6109g;

    /* renamed from: h, reason: collision with root package name */
    private c0 f6110h;

    /* renamed from: p, reason: collision with root package name */
    private int f6118p;

    /* renamed from: q, reason: collision with root package name */
    private int f6119q;

    /* renamed from: r, reason: collision with root package name */
    private int f6120r;

    /* renamed from: s, reason: collision with root package name */
    private int f6121s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6125w;

    /* renamed from: z, reason: collision with root package name */
    private c0 f6128z;

    /* renamed from: b, reason: collision with root package name */
    private final d74 f6104b = new d74();

    /* renamed from: i, reason: collision with root package name */
    private int f6111i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int[] f6112j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f6113k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f6116n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f6115m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f6114l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private sd4[] f6117o = new sd4[1000];

    /* renamed from: c, reason: collision with root package name */
    private final n74<f74> f6105c = new n74<>(new bz1() { // from class: com.google.android.gms.internal.ads.c74
    });

    /* renamed from: t, reason: collision with root package name */
    private long f6122t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f6123u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f6124v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6127y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6126x = true;

    protected h74(g94 g94Var, Looper looper, b34 b34Var, v24 v24Var, byte[] bArr) {
        this.f6108f = looper;
        this.f6106d = b34Var;
        this.f6107e = v24Var;
        this.f6103a = new b74(g94Var, null);
    }

    static /* synthetic */ void A(f74 f74Var) {
        a34 a34Var = f74Var.f5026b;
        int i7 = z24.f14915a;
    }

    private final int L(int i7, int i8, long j7, boolean z6) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = this.f6116n[i7];
            if (j8 > j7) {
                return i9;
            }
            if (!z6 || (this.f6115m[i7] & 1) != 0) {
                if (j8 == j7) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.f6111i) {
                i7 = 0;
            }
        }
        return i9;
    }

    private final int g(int i7) {
        int i8 = this.f6120r + i7;
        int i9 = this.f6111i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    private final synchronized int h(cx3 cx3Var, z51 z51Var, boolean z6, boolean z7, d74 d74Var) {
        z51Var.f14953d = false;
        if (!p()) {
            if (!z7 && !this.f6125w) {
                c0 c0Var = this.A;
                if (c0Var == null || (!z6 && c0Var == this.f6110h)) {
                    return -3;
                }
                m(c0Var, cx3Var);
                return -5;
            }
            z51Var.c(4);
            return -4;
        }
        c0 c0Var2 = this.f6105c.a(this.f6119q + this.f6121s).f5025a;
        if (!z6 && c0Var2 == this.f6110h) {
            int g7 = g(this.f6121s);
            if (!q(g7)) {
                z51Var.f14953d = true;
                return -3;
            }
            z51Var.c(this.f6115m[g7]);
            long j7 = this.f6116n[g7];
            z51Var.f14954e = j7;
            if (j7 < this.f6122t) {
                z51Var.a(Integer.MIN_VALUE);
            }
            d74Var.f4105a = this.f6114l[g7];
            d74Var.f4106b = this.f6113k[g7];
            d74Var.f4107c = this.f6117o[g7];
            return -4;
        }
        m(c0Var2, cx3Var);
        return -5;
    }

    private final synchronized long i(long j7, boolean z6, boolean z7) {
        int i7;
        int i8 = this.f6118p;
        if (i8 != 0) {
            long[] jArr = this.f6116n;
            int i9 = this.f6120r;
            if (j7 >= jArr[i9]) {
                if (z7 && (i7 = this.f6121s) != i8) {
                    i8 = i7 + 1;
                }
                int L = L(i9, i8, j7, false);
                if (L == -1) {
                    return -1L;
                }
                return k(L);
            }
        }
        return -1L;
    }

    private final synchronized long j() {
        int i7 = this.f6118p;
        if (i7 == 0) {
            return -1L;
        }
        return k(i7);
    }

    private final long k(int i7) {
        long j7 = this.f6123u;
        long j8 = Long.MIN_VALUE;
        if (i7 != 0) {
            int g7 = g(i7 - 1);
            for (int i8 = 0; i8 < i7; i8++) {
                j8 = Math.max(j8, this.f6116n[g7]);
                if ((this.f6115m[g7] & 1) != 0) {
                    break;
                }
                g7--;
                if (g7 == -1) {
                    g7 = this.f6111i - 1;
                }
            }
        }
        this.f6123u = Math.max(j7, j8);
        this.f6118p -= i7;
        int i9 = this.f6119q + i7;
        this.f6119q = i9;
        int i10 = this.f6120r + i7;
        this.f6120r = i10;
        int i11 = this.f6111i;
        if (i10 >= i11) {
            this.f6120r = i10 - i11;
        }
        int i12 = this.f6121s - i7;
        this.f6121s = i12;
        if (i12 < 0) {
            this.f6121s = 0;
        }
        this.f6105c.e(i9);
        if (this.f6118p != 0) {
            return this.f6113k[this.f6120r];
        }
        int i13 = this.f6120r;
        if (i13 == 0) {
            i13 = this.f6111i;
        }
        return this.f6113k[i13 - 1] + this.f6114l[r12];
    }

    private final synchronized void l(long j7, int i7, long j8, int i8, sd4 sd4Var) {
        int i9 = this.f6118p;
        if (i9 > 0) {
            int g7 = g(i9 - 1);
            wu1.d(this.f6113k[g7] + ((long) this.f6114l[g7]) <= j8);
        }
        this.f6125w = (536870912 & i7) != 0;
        this.f6124v = Math.max(this.f6124v, j7);
        int g8 = g(this.f6118p);
        this.f6116n[g8] = j7;
        this.f6113k[g8] = j8;
        this.f6114l[g8] = i8;
        this.f6115m[g8] = i7;
        this.f6117o[g8] = sd4Var;
        this.f6112j[g8] = 0;
        if (this.f6105c.f() || !this.f6105c.b().f5025a.equals(this.A)) {
            a34 a34Var = a34.f2598a;
            n74<f74> n74Var = this.f6105c;
            int i10 = this.f6119q + this.f6118p;
            c0 c0Var = this.A;
            Objects.requireNonNull(c0Var);
            n74Var.c(i10, new f74(c0Var, a34Var, null));
        }
        int i11 = this.f6118p + 1;
        this.f6118p = i11;
        int i12 = this.f6111i;
        if (i11 == i12) {
            int i13 = i12 + 1000;
            int[] iArr = new int[i13];
            long[] jArr = new long[i13];
            long[] jArr2 = new long[i13];
            int[] iArr2 = new int[i13];
            int[] iArr3 = new int[i13];
            sd4[] sd4VarArr = new sd4[i13];
            int i14 = this.f6120r;
            int i15 = i12 - i14;
            System.arraycopy(this.f6113k, i14, jArr, 0, i15);
            System.arraycopy(this.f6116n, this.f6120r, jArr2, 0, i15);
            System.arraycopy(this.f6115m, this.f6120r, iArr2, 0, i15);
            System.arraycopy(this.f6114l, this.f6120r, iArr3, 0, i15);
            System.arraycopy(this.f6117o, this.f6120r, sd4VarArr, 0, i15);
            System.arraycopy(this.f6112j, this.f6120r, iArr, 0, i15);
            int i16 = this.f6120r;
            System.arraycopy(this.f6113k, 0, jArr, i15, i16);
            System.arraycopy(this.f6116n, 0, jArr2, i15, i16);
            System.arraycopy(this.f6115m, 0, iArr2, i15, i16);
            System.arraycopy(this.f6114l, 0, iArr3, i15, i16);
            System.arraycopy(this.f6117o, 0, sd4VarArr, i15, i16);
            System.arraycopy(this.f6112j, 0, iArr, i15, i16);
            this.f6113k = jArr;
            this.f6116n = jArr2;
            this.f6115m = iArr2;
            this.f6114l = iArr3;
            this.f6117o = sd4VarArr;
            this.f6112j = iArr;
            this.f6120r = 0;
            this.f6111i = i13;
        }
    }

    private final void m(c0 c0Var, cx3 cx3Var) {
        c0 c0Var2 = this.f6110h;
        u74 u74Var = c0Var2 == null ? null : c0Var2.f3663o;
        this.f6110h = c0Var;
        u74 u74Var2 = c0Var.f3663o;
        cx3Var.f3980a = c0Var.c(this.f6106d.a(c0Var));
        cx3Var.f3981b = this.D;
        if (c0Var2 == null || !n13.p(u74Var, u74Var2)) {
            c34 c34Var = c0Var.f3663o != null ? new c34(new t24(new e34(1), 6001)) : null;
            this.D = c34Var;
            cx3Var.f3981b = c34Var;
        }
    }

    private final void n() {
        if (this.D != null) {
            this.D = null;
            this.f6110h = null;
        }
    }

    private final synchronized void o() {
        this.f6121s = 0;
        this.f6103a.g();
    }

    private final boolean p() {
        return this.f6121s != this.f6118p;
    }

    private final boolean q(int i7) {
        if (this.D != null) {
            return (this.f6115m[i7] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean r(c0 c0Var) {
        this.f6127y = false;
        if (n13.p(c0Var, this.A)) {
            return false;
        }
        if (!this.f6105c.f() && this.f6105c.b().f5025a.equals(c0Var)) {
            c0Var = this.f6105c.b().f5025a;
        }
        this.A = c0Var;
        c0 c0Var2 = this.A;
        this.B = dy.f(c0Var2.f3660l, c0Var2.f3657i);
        this.C = false;
        return true;
    }

    public final void B() {
        c34 c34Var = this.D;
        if (c34Var != null) {
            throw c34Var.a();
        }
    }

    public final void C() {
        z();
        n();
    }

    public final void D() {
        E(true);
        n();
    }

    public final void E(boolean z6) {
        this.f6103a.f();
        this.f6118p = 0;
        this.f6119q = 0;
        this.f6120r = 0;
        this.f6121s = 0;
        this.f6126x = true;
        this.f6122t = Long.MIN_VALUE;
        this.f6123u = Long.MIN_VALUE;
        this.f6124v = Long.MIN_VALUE;
        this.f6125w = false;
        this.f6105c.d();
        if (z6) {
            this.f6128z = null;
            this.A = null;
            this.f6127y = true;
        }
    }

    public final void F(long j7) {
        this.f6122t = j7;
    }

    public final void G(g74 g74Var) {
        this.f6109g = g74Var;
    }

    public final synchronized void H(int i7) {
        boolean z6 = false;
        if (i7 >= 0) {
            try {
                if (this.f6121s + i7 <= this.f6118p) {
                    z6 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wu1.d(z6);
        this.f6121s += i7;
    }

    public final synchronized boolean I() {
        return this.f6125w;
    }

    public final synchronized boolean J(boolean z6) {
        boolean z7 = true;
        if (p()) {
            if (this.f6105c.a(this.f6119q + this.f6121s).f5025a != this.f6110h) {
                return true;
            }
            return q(g(this.f6121s));
        }
        if (!z6 && !this.f6125w) {
            c0 c0Var = this.A;
            if (c0Var == null) {
                z7 = false;
            } else if (c0Var == this.f6110h) {
                return false;
            }
        }
        return z7;
    }

    public final synchronized boolean K(long j7, boolean z6) {
        o();
        int g7 = g(this.f6121s);
        if (!p() || j7 < this.f6116n[g7] || (j7 > this.f6124v && !z6)) {
            return false;
        }
        int L = L(g7, this.f6118p - this.f6121s, j7, true);
        if (L == -1) {
            return false;
        }
        this.f6122t = j7;
        this.f6121s += L;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final void a(long j7, int i7, int i8, int i9, sd4 sd4Var) {
        int i10 = i7 & 1;
        if (this.f6126x) {
            if (i10 == 0) {
                return;
            } else {
                this.f6126x = false;
            }
        }
        if (this.B) {
            if (j7 < this.f6122t) {
                return;
            }
            if (i10 == 0) {
                if (!this.C) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.A)));
                    this.C = true;
                }
                i7 |= 1;
            }
        }
        l(j7, i7, (this.f6103a.b() - i8) - i9, i8, sd4Var);
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final void b(c0 c0Var) {
        this.f6128z = c0Var;
        boolean r7 = r(c0Var);
        g74 g74Var = this.f6109g;
        if (g74Var == null || !r7) {
            return;
        }
        g74Var.q(c0Var);
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final /* synthetic */ int c(fc1 fc1Var, int i7, boolean z6) {
        return rd4.a(this, fc1Var, i7, true);
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final int d(fc1 fc1Var, int i7, boolean z6, int i8) {
        return this.f6103a.a(fc1Var, i7, z6);
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final /* synthetic */ void e(dr2 dr2Var, int i7) {
        rd4.b(this, dr2Var, i7);
    }

    @Override // com.google.android.gms.internal.ads.td4
    public final void f(dr2 dr2Var, int i7, int i8) {
        this.f6103a.h(dr2Var, i7);
    }

    public final int s() {
        return this.f6119q + this.f6121s;
    }

    public final synchronized int t(long j7, boolean z6) {
        int g7 = g(this.f6121s);
        if (p() && j7 >= this.f6116n[g7]) {
            if (j7 > this.f6124v && z6) {
                return this.f6118p - this.f6121s;
            }
            int L = L(g7, this.f6118p - this.f6121s, j7, true);
            if (L == -1) {
                return 0;
            }
            return L;
        }
        return 0;
    }

    public final int u() {
        return this.f6119q + this.f6118p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int v(cx3 cx3Var, z51 z51Var, int i7, boolean z6) {
        int h7 = h(cx3Var, z51Var, (i7 & 2) != 0, z6, this.f6104b);
        if (h7 != -4) {
            return h7;
        }
        if (!z51Var.g()) {
            int i8 = i7 & 1;
            if ((i7 & 4) == 0) {
                if (i8 == 0) {
                    this.f6103a.e(z51Var, this.f6104b);
                    this.f6121s++;
                    return -4;
                }
                this.f6103a.d(z51Var, this.f6104b);
            }
        }
        return -4;
    }

    public final synchronized long w() {
        return this.f6124v;
    }

    public final synchronized c0 x() {
        if (this.f6127y) {
            return null;
        }
        return this.A;
    }

    public final void y(long j7, boolean z6, boolean z7) {
        this.f6103a.c(i(j7, false, z7));
    }

    public final void z() {
        this.f6103a.c(j());
    }
}
