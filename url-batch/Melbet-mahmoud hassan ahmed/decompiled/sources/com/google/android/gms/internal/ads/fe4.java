package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fe4 extends fc4 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fe4(final dd4 dd4Var, int i7, long j7, long j8) {
        super(r1, r2, r3, 0L, r7, j7, j8, r13, Math.max(6, dd4Var.f4173c));
        long j9;
        cc4 cc4Var = new cc4() { // from class: com.google.android.gms.internal.ads.ce4
            @Override // com.google.android.gms.internal.ads.cc4
            public final long b(long j10) {
                return dd4.this.b(j10);
            }
        };
        ee4 ee4Var = new ee4(dd4Var, i7, null);
        long a7 = dd4Var.a();
        long j10 = dd4Var.f4180j;
        int i8 = dd4Var.f4174d;
        if (i8 > 0) {
            j9 = ((i8 + dd4Var.f4173c) / 2) + 1;
        } else {
            int i9 = dd4Var.f4171a;
            long j11 = 4096;
            if (i9 == dd4Var.f4172b && i9 > 0) {
                j11 = i9;
            }
            j9 = (((j11 * dd4Var.f4177g) * dd4Var.f4178h) / 8) + 64;
        }
    }
}
