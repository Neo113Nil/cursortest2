package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
final class e3 {

    /* renamed from: a, reason: collision with root package name */
    private final td4 f4463a;

    /* renamed from: d, reason: collision with root package name */
    private final es2 f4466d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f4467e;

    /* renamed from: f, reason: collision with root package name */
    private int f4468f;

    /* renamed from: g, reason: collision with root package name */
    private long f4469g;

    /* renamed from: h, reason: collision with root package name */
    private long f4470h;

    /* renamed from: l, reason: collision with root package name */
    private long f4474l;

    /* renamed from: m, reason: collision with root package name */
    private long f4475m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4476n;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<sg2> f4464b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<rf2> f4465c = new SparseArray<>();

    /* renamed from: i, reason: collision with root package name */
    private final d3 f4471i = new d3(null);

    /* renamed from: j, reason: collision with root package name */
    private final d3 f4472j = new d3(null);

    /* renamed from: k, reason: collision with root package name */
    private boolean f4473k = false;

    public e3(td4 td4Var, boolean z6, boolean z7) {
        this.f4463a = td4Var;
        byte[] bArr = new byte[128];
        this.f4467e = bArr;
        this.f4466d = new es2(bArr, 0, 0);
    }

    public final void a(rf2 rf2Var) {
        this.f4465c.append(rf2Var.f11138a, rf2Var);
    }

    public final void b(sg2 sg2Var) {
        this.f4464b.append(sg2Var.f11819d, sg2Var);
    }

    public final void c() {
        this.f4473k = false;
    }

    public final void d(long j7, int i7, long j8) {
        this.f4468f = i7;
        this.f4470h = j8;
        this.f4469g = j7;
    }

    public final boolean e(long j7, int i7, boolean z6, boolean z7) {
        boolean z8 = false;
        if (this.f4468f == 9) {
            if (z6 && this.f4473k) {
                long j8 = this.f4469g;
                int i8 = i7 + ((int) (j7 - j8));
                long j9 = this.f4475m;
                if (j9 != -9223372036854775807L) {
                    boolean z9 = this.f4476n;
                    long j10 = this.f4474l;
                    this.f4463a.a(j9, z9 ? 1 : 0, (int) (j8 - j10), i8, null);
                }
            }
            this.f4474l = this.f4469g;
            this.f4475m = this.f4470h;
            this.f4476n = false;
            this.f4473k = true;
        }
        boolean z10 = this.f4476n;
        int i9 = this.f4468f;
        if (i9 == 5 || (z7 && i9 == 1)) {
            z8 = true;
        }
        boolean z11 = z10 | z8;
        this.f4476n = z11;
        return z11;
    }
}
