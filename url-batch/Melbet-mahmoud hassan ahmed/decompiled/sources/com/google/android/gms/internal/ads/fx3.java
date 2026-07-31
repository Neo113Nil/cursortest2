package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fx3 {

    /* renamed from: a, reason: collision with root package name */
    public final r54 f5267a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5268b;

    /* renamed from: c, reason: collision with root package name */
    public final i74[] f5269c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5270d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5271e;

    /* renamed from: f, reason: collision with root package name */
    public gx3 f5272f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5273g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f5274h;

    /* renamed from: i, reason: collision with root package name */
    private final yx3[] f5275i;

    /* renamed from: j, reason: collision with root package name */
    private final q84 f5276j;

    /* renamed from: k, reason: collision with root package name */
    private final qx3 f5277k;

    /* renamed from: l, reason: collision with root package name */
    private fx3 f5278l;

    /* renamed from: m, reason: collision with root package name */
    private hm0 f5279m;

    /* renamed from: n, reason: collision with root package name */
    private r84 f5280n;

    /* renamed from: o, reason: collision with root package name */
    private long f5281o;

    public fx3(yx3[] yx3VarArr, long j7, q84 q84Var, g94 g94Var, qx3 qx3Var, gx3 gx3Var, r84 r84Var, byte[] bArr) {
        this.f5275i = yx3VarArr;
        this.f5281o = j7;
        this.f5276j = q84Var;
        this.f5277k = qx3Var;
        s54 s54Var = gx3Var.f5926a;
        this.f5268b = s54Var.f5772a;
        this.f5272f = gx3Var;
        this.f5279m = hm0.f6333d;
        this.f5280n = r84Var;
        this.f5269c = new i74[2];
        this.f5274h = new boolean[2];
        long j8 = gx3Var.f5927b;
        long j9 = gx3Var.f5929d;
        r54 o7 = qx3Var.o(s54Var, g94Var, j8);
        this.f5267a = j9 != -9223372036854775807L ? new z44(o7, true, 0L, j9) : o7;
    }

    private final void s() {
        if (!u()) {
            return;
        }
        int i7 = 0;
        while (true) {
            r84 r84Var = this.f5280n;
            if (i7 >= r84Var.f11058a) {
                return;
            }
            r84Var.b(i7);
            w74 w74Var = this.f5280n.f11062e[i7];
            i7++;
        }
    }

    private final void t() {
        if (!u()) {
            return;
        }
        int i7 = 0;
        while (true) {
            r84 r84Var = this.f5280n;
            if (i7 >= r84Var.f11058a) {
                return;
            }
            r84Var.b(i7);
            w74 w74Var = this.f5280n.f11062e[i7];
            i7++;
        }
    }

    private final boolean u() {
        return this.f5278l == null;
    }

    public final long a(r84 r84Var, long j7, boolean z6) {
        return b(r84Var, j7, false, new boolean[2]);
    }

    public final long b(r84 r84Var, long j7, boolean z6, boolean[] zArr) {
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= r84Var.f11058a) {
                break;
            }
            boolean[] zArr2 = this.f5274h;
            if (z6 || !r84Var.a(this.f5280n, i7)) {
                z7 = false;
            }
            zArr2[i7] = z7;
            i7++;
        }
        int i8 = 0;
        while (true) {
            yx3[] yx3VarArr = this.f5275i;
            if (i8 >= 2) {
                break;
            }
            yx3VarArr[i8].a();
            i8++;
        }
        s();
        this.f5280n = r84Var;
        t();
        long j8 = this.f5267a.j(r84Var.f11062e, this.f5274h, this.f5269c, zArr, j7);
        int i9 = 0;
        while (true) {
            yx3[] yx3VarArr2 = this.f5275i;
            if (i9 >= 2) {
                break;
            }
            yx3VarArr2[i9].a();
            i9++;
        }
        this.f5271e = false;
        int i10 = 0;
        while (true) {
            i74[] i74VarArr = this.f5269c;
            if (i10 >= 2) {
                return j8;
            }
            if (i74VarArr[i10] != null) {
                wu1.f(r84Var.b(i10));
                this.f5275i[i10].a();
                this.f5271e = true;
            } else {
                wu1.f(r84Var.f11062e[i10] == null);
            }
            i10++;
        }
    }

    public final long c() {
        if (!this.f5270d) {
            return this.f5272f.f5927b;
        }
        long a7 = this.f5271e ? this.f5267a.a() : Long.MIN_VALUE;
        return a7 == Long.MIN_VALUE ? this.f5272f.f5930e : a7;
    }

    public final long d() {
        if (this.f5270d) {
            return this.f5267a.c();
        }
        return 0L;
    }

    public final long e() {
        return this.f5281o;
    }

    public final long f() {
        return this.f5272f.f5927b + this.f5281o;
    }

    public final hm0 g() {
        return this.f5279m;
    }

    public final fx3 h() {
        return this.f5278l;
    }

    public final r84 i() {
        return this.f5280n;
    }

    public final r84 j(float f7, ei0 ei0Var) {
        r84 a7 = this.f5276j.a(this.f5275i, this.f5279m, this.f5272f.f5926a, ei0Var);
        for (w74 w74Var : a7.f11062e) {
        }
        return a7;
    }

    public final void k(long j7) {
        wu1.f(u());
        this.f5267a.b(j7 - this.f5281o);
    }

    public final void l(float f7, ei0 ei0Var) {
        this.f5270d = true;
        this.f5279m = this.f5267a.d();
        r84 j7 = j(f7, ei0Var);
        gx3 gx3Var = this.f5272f;
        long j8 = gx3Var.f5927b;
        long j9 = gx3Var.f5930e;
        if (j9 != -9223372036854775807L && j8 >= j9) {
            j8 = Math.max(0L, j9 - 1);
        }
        long a7 = a(j7, j8, false);
        long j10 = this.f5281o;
        gx3 gx3Var2 = this.f5272f;
        this.f5281o = j10 + (gx3Var2.f5927b - a7);
        this.f5272f = gx3Var2.b(a7);
    }

    public final void m(long j7) {
        wu1.f(u());
        if (this.f5270d) {
            this.f5267a.f(j7 - this.f5281o);
        }
    }

    public final void n() {
        s();
        qx3 qx3Var = this.f5277k;
        r54 r54Var = this.f5267a;
        try {
            if (r54Var instanceof z44) {
                qx3Var.h(((z44) r54Var).f14946f);
            } else {
                qx3Var.h(r54Var);
            }
        } catch (RuntimeException e7) {
            oc2.a("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    public final void o(fx3 fx3Var) {
        if (fx3Var == this.f5278l) {
            return;
        }
        s();
        this.f5278l = fx3Var;
        t();
    }

    public final void p(long j7) {
        this.f5281o = 0L;
    }

    public final void q() {
        r54 r54Var = this.f5267a;
        if (r54Var instanceof z44) {
            long j7 = this.f5272f.f5929d;
            if (j7 == -9223372036854775807L) {
                j7 = Long.MIN_VALUE;
            }
            ((z44) r54Var).m(0L, j7);
        }
    }

    public final boolean r() {
        return this.f5270d && (!this.f5271e || this.f5267a.a() == Long.MIN_VALUE);
    }
}
