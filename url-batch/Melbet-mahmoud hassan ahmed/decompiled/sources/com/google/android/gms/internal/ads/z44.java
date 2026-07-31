package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class z44 implements r54, q54 {

    /* renamed from: f, reason: collision with root package name */
    public final r54 f14946f;

    /* renamed from: g, reason: collision with root package name */
    private q54 f14947g;

    /* renamed from: h, reason: collision with root package name */
    private y44[] f14948h = new y44[0];

    /* renamed from: i, reason: collision with root package name */
    private long f14949i = 0;

    /* renamed from: j, reason: collision with root package name */
    long f14950j;

    public z44(r54 r54Var, boolean z6, long j7, long j8) {
        this.f14946f = r54Var;
        this.f14950j = j8;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long a() {
        long a7 = this.f14946f.a();
        if (a7 != Long.MIN_VALUE) {
            long j7 = this.f14950j;
            if (j7 == Long.MIN_VALUE || a7 < j7) {
                return a7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean b(long j7) {
        return this.f14946f.b(j7);
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final long c() {
        long c7 = this.f14946f.c();
        if (c7 != Long.MIN_VALUE) {
            long j7 = this.f14950j;
            if (j7 == Long.MIN_VALUE || c7 < j7) {
                return c7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final hm0 d() {
        return this.f14946f.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r8) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.r54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(long j7) {
        this.f14949i = -9223372036854775807L;
        boolean z6 = false;
        for (y44 y44Var : this.f14948h) {
            if (y44Var != null) {
                y44Var.d();
            }
        }
        long e7 = this.f14946f.e(j7);
        if (e7 != j7) {
            if (e7 >= 0) {
                long j8 = this.f14950j;
                if (j8 != Long.MIN_VALUE) {
                }
            }
            wu1.f(z6);
            return e7;
        }
        z6 = true;
        wu1.f(z6);
        return e7;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final void f(long j7) {
        this.f14946f.f(j7);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long g() {
        if (p()) {
            long j7 = this.f14949i;
            this.f14949i = -9223372036854775807L;
            long g7 = g();
            return g7 != -9223372036854775807L ? g7 : j7;
        }
        long g8 = this.f14946f.g();
        if (g8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        wu1.f(g8 >= 0);
        long j8 = this.f14950j;
        wu1.f(j8 == Long.MIN_VALUE || g8 <= j8);
        return g8;
    }

    @Override // com.google.android.gms.internal.ads.q54
    public final void h(r54 r54Var) {
        q54 q54Var = this.f14947g;
        Objects.requireNonNull(q54Var);
        q54Var.h(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void i() {
        this.f14946f.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r4 > r7) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.r54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(w74[] w74VarArr, boolean[] zArr, i74[] i74VarArr, boolean[] zArr2, long j7) {
        int length = i74VarArr.length;
        this.f14948h = new y44[length];
        i74[] i74VarArr2 = new i74[length];
        int i7 = 0;
        while (true) {
            i74 i74Var = null;
            if (i7 >= i74VarArr.length) {
                break;
            }
            y44[] y44VarArr = this.f14948h;
            y44 y44Var = (y44) i74VarArr[i7];
            y44VarArr[i7] = y44Var;
            if (y44Var != null) {
                i74Var = y44Var.f14547a;
            }
            i74VarArr2[i7] = i74Var;
            i7++;
        }
        long j8 = this.f14946f.j(w74VarArr, zArr, i74VarArr2, zArr2, j7);
        this.f14949i = -9223372036854775807L;
        boolean z6 = true;
        if (j8 != j7) {
            if (j8 >= 0) {
                long j9 = this.f14950j;
                if (j9 != Long.MIN_VALUE) {
                }
            }
            z6 = false;
        }
        wu1.f(z6);
        for (int i8 = 0; i8 < i74VarArr.length; i8++) {
            i74 i74Var2 = i74VarArr2[i8];
            if (i74Var2 == null) {
                this.f14948h[i8] = null;
            } else {
                y44[] y44VarArr2 = this.f14948h;
                y44 y44Var2 = y44VarArr2[i8];
                if (y44Var2 == null || y44Var2.f14547a != i74Var2) {
                    y44VarArr2[i8] = new y44(this, i74Var2);
                }
            }
            i74VarArr[i8] = this.f14948h[i8];
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.j74
    public final /* bridge */ /* synthetic */ void k(r54 r54Var) {
        q54 q54Var = this.f14947g;
        Objects.requireNonNull(q54Var);
        q54Var.k(this);
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final long l(long j7, ay3 ay3Var) {
        if (j7 == 0) {
            return 0L;
        }
        long U = n13.U(ay3Var.f3033a, 0L, j7);
        long j8 = ay3Var.f3034b;
        long j9 = this.f14950j;
        long U2 = n13.U(j8, 0L, j9 == Long.MIN_VALUE ? Long.MAX_VALUE : j9 - j7);
        if (U != ay3Var.f3033a || U2 != ay3Var.f3034b) {
            ay3Var = new ay3(U, U2);
        }
        return this.f14946f.l(j7, ay3Var);
    }

    public final void m(long j7, long j8) {
        this.f14950j = j8;
    }

    @Override // com.google.android.gms.internal.ads.r54, com.google.android.gms.internal.ads.k74
    public final boolean n() {
        return this.f14946f.n();
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void o(q54 q54Var, long j7) {
        this.f14947g = q54Var;
        this.f14946f.o(this, j7);
    }

    final boolean p() {
        return this.f14949i != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.r54
    public final void s(long j7, boolean z6) {
        this.f14946f.s(j7, false);
    }
}
