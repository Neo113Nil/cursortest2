package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z3 implements ec4 {

    /* renamed from: a, reason: collision with root package name */
    private final ky2 f14916a;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f14917b = new dr2();

    /* renamed from: c, reason: collision with root package name */
    private final int f14918c;

    public z3(int i7, ky2 ky2Var, int i8) {
        this.f14918c = i7;
        this.f14916a = ky2Var;
    }

    @Override // com.google.android.gms.internal.ads.ec4
    public final void a() {
        dr2 dr2Var = this.f14917b;
        byte[] bArr = n13.f8870f;
        int length = bArr.length;
        dr2Var.d(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.ec4
    public final dc4 b(pc4 pc4Var, long j7) {
        int a7;
        int a8;
        long j8;
        long b7 = pc4Var.b();
        int min = (int) Math.min(112800L, pc4Var.c() - b7);
        this.f14917b.c(min);
        ((jc4) pc4Var).n(this.f14917b.h(), 0, min, false);
        dr2 dr2Var = this.f14917b;
        int l7 = dr2Var.l();
        long j9 = -1;
        long j10 = -1;
        long j11 = -9223372036854775807L;
        while (dr2Var.i() >= 188 && (a8 = (a7 = m4.a(dr2Var.h(), dr2Var.k(), l7)) + 188) <= l7) {
            long b8 = m4.b(dr2Var, a7, this.f14918c);
            if (b8 != -9223372036854775807L) {
                long b9 = this.f14916a.b(b8);
                if (b9 > j7) {
                    if (j11 == -9223372036854775807L) {
                        return dc4.d(b9, b7);
                    }
                    j8 = b7 + j10;
                } else if (100000 + b9 > j7) {
                    j8 = b7 + a7;
                } else {
                    j10 = a7;
                    j11 = b9;
                }
                return dc4.e(j8);
            }
            dr2Var.f(a8);
            j9 = a8;
        }
        return j11 != -9223372036854775807L ? dc4.f(j11, b7 + j9) : dc4.f4166d;
    }
}
