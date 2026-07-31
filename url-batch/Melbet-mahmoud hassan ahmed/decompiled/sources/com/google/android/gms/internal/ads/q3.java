package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class q3 implements ec4 {

    /* renamed from: a, reason: collision with root package name */
    private final ky2 f10562a;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f10563b = new dr2();

    /* synthetic */ q3(ky2 ky2Var, p3 p3Var) {
        this.f10562a = ky2Var;
    }

    @Override // com.google.android.gms.internal.ads.ec4
    public final void a() {
        dr2 dr2Var = this.f10563b;
        byte[] bArr = n13.f8870f;
        int length = bArr.length;
        dr2Var.d(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.ec4
    public final dc4 b(pc4 pc4Var, long j7) {
        int h7;
        long j8;
        long b7 = pc4Var.b();
        int min = (int) Math.min(20000L, pc4Var.c() - b7);
        this.f10563b.c(min);
        ((jc4) pc4Var).n(this.f10563b.h(), 0, min, false);
        dr2 dr2Var = this.f10563b;
        int i7 = -1;
        long j9 = -9223372036854775807L;
        int i8 = -1;
        while (dr2Var.i() >= 4) {
            if (r3.h(dr2Var.h(), dr2Var.k()) != 442) {
                dr2Var.g(1);
            } else {
                dr2Var.g(4);
                long c7 = s3.c(dr2Var);
                if (c7 != -9223372036854775807L) {
                    long b8 = this.f10562a.b(c7);
                    if (b8 > j7) {
                        if (j9 == -9223372036854775807L) {
                            return dc4.d(b8, b7);
                        }
                        j8 = i8;
                    } else if (100000 + b8 > j7) {
                        j8 = dr2Var.k();
                    } else {
                        i8 = dr2Var.k();
                        j9 = b8;
                    }
                    return dc4.e(b7 + j8);
                }
                int l7 = dr2Var.l();
                if (dr2Var.i() >= 10) {
                    dr2Var.g(9);
                    int s7 = dr2Var.s() & 7;
                    if (dr2Var.i() >= s7) {
                        dr2Var.g(s7);
                        if (dr2Var.i() >= 4) {
                            if (r3.h(dr2Var.h(), dr2Var.k()) == 443) {
                                dr2Var.g(4);
                                int w6 = dr2Var.w();
                                if (dr2Var.i() >= w6) {
                                    dr2Var.g(w6);
                                }
                            }
                            while (dr2Var.i() >= 4 && (h7 = r3.h(dr2Var.h(), dr2Var.k())) != 442 && h7 != 441 && (h7 >>> 8) == 1) {
                                dr2Var.g(4);
                                if (dr2Var.i() >= 2) {
                                    dr2Var.f(Math.min(dr2Var.l(), dr2Var.k() + dr2Var.w()));
                                }
                            }
                            i7 = dr2Var.k();
                        }
                    }
                }
                dr2Var.f(l7);
                i7 = dr2Var.k();
            }
        }
        return j9 != -9223372036854775807L ? dc4.f(j9, b7 + i7) : dc4.f4166d;
    }
}
