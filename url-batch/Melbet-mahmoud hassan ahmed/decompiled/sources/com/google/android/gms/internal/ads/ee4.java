package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ee4 implements ec4 {

    /* renamed from: a, reason: collision with root package name */
    private final dd4 f4586a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4587b;

    /* renamed from: c, reason: collision with root package name */
    private final wc4 f4588c = new wc4();

    /* synthetic */ ee4(dd4 dd4Var, int i7, de4 de4Var) {
        this.f4586a = dd4Var;
        this.f4587b = i7;
    }

    private final long c(pc4 pc4Var) {
        while (pc4Var.g() < pc4Var.c() - 6) {
            dd4 dd4Var = this.f4586a;
            int i7 = this.f4587b;
            wc4 wc4Var = this.f4588c;
            long g7 = pc4Var.g();
            byte[] bArr = new byte[2];
            jc4 jc4Var = (jc4) pc4Var;
            jc4Var.n(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i7) {
                pc4Var.i();
                jc4Var.o((int) (g7 - pc4Var.b()), false);
            } else {
                dr2 dr2Var = new dr2(16);
                System.arraycopy(bArr, 0, dr2Var.h(), 0, 2);
                dr2Var.e(sc4.a(pc4Var, dr2Var.h(), 2, 14));
                pc4Var.i();
                jc4Var.o((int) (g7 - pc4Var.b()), false);
                if (xc4.c(dr2Var, dd4Var, i7, wc4Var)) {
                    break;
                }
            }
            jc4Var.o(1, false);
        }
        if (pc4Var.g() < pc4Var.c() - 6) {
            return this.f4588c.f13793a;
        }
        ((jc4) pc4Var).o((int) (pc4Var.c() - pc4Var.g()), false);
        return this.f4586a.f4180j;
    }

    @Override // com.google.android.gms.internal.ads.ec4
    public final /* synthetic */ void a() {
    }

    @Override // com.google.android.gms.internal.ads.ec4
    public final dc4 b(pc4 pc4Var, long j7) {
        long b7 = pc4Var.b();
        long c7 = c(pc4Var);
        long g7 = pc4Var.g();
        ((jc4) pc4Var).o(Math.max(6, this.f4586a.f4173c), false);
        long c8 = c(pc4Var);
        return (c7 > j7 || c8 <= j7) ? c8 <= j7 ? dc4.f(c8, pc4Var.g()) : dc4.d(c7, b7) : dc4.e(g7);
    }
}
