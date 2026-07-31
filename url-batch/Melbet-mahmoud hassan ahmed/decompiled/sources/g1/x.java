package g1;

import o2.m0;
import w0.a;

/* loaded from: classes.dex */
final class x extends w0.a {

    private static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final o2.i0 f16582a;

        /* renamed from: b, reason: collision with root package name */
        private final o2.a0 f16583b;

        private b(o2.i0 i0Var) {
            this.f16582a = i0Var;
            this.f16583b = new o2.a0();
        }

        private a.e c(o2.a0 a0Var, long j7, long j8) {
            int i7 = -1;
            long j9 = -9223372036854775807L;
            int i8 = -1;
            while (a0Var.a() >= 4) {
                if (x.k(a0Var.d(), a0Var.e()) != 442) {
                    a0Var.P(1);
                } else {
                    a0Var.P(4);
                    long l7 = y.l(a0Var);
                    if (l7 != -9223372036854775807L) {
                        long b7 = this.f16582a.b(l7);
                        if (b7 > j7) {
                            return j9 == -9223372036854775807L ? a.e.d(b7, j8) : a.e.e(j8 + i8);
                        }
                        if (100000 + b7 > j7) {
                            return a.e.e(j8 + a0Var.e());
                        }
                        i8 = a0Var.e();
                        j9 = b7;
                    }
                    d(a0Var);
                    i7 = a0Var.e();
                }
            }
            return j9 != -9223372036854775807L ? a.e.f(j9, j8 + i7) : a.e.f22869d;
        }

        private static void d(o2.a0 a0Var) {
            int k7;
            int f7 = a0Var.f();
            if (a0Var.a() < 10) {
                a0Var.O(f7);
                return;
            }
            a0Var.P(9);
            int C = a0Var.C() & 7;
            if (a0Var.a() < C) {
                a0Var.O(f7);
                return;
            }
            a0Var.P(C);
            if (a0Var.a() < 4) {
                a0Var.O(f7);
                return;
            }
            if (x.k(a0Var.d(), a0Var.e()) == 443) {
                a0Var.P(4);
                int I = a0Var.I();
                if (a0Var.a() < I) {
                    a0Var.O(f7);
                    return;
                }
                a0Var.P(I);
            }
            while (a0Var.a() >= 4 && (k7 = x.k(a0Var.d(), a0Var.e())) != 442 && k7 != 441 && (k7 >>> 8) == 1) {
                a0Var.P(4);
                if (a0Var.a() < 2) {
                    a0Var.O(f7);
                    return;
                }
                a0Var.O(Math.min(a0Var.f(), a0Var.e() + a0Var.I()));
            }
        }

        @Override // w0.a.f
        public a.e a(w0.m mVar, long j7) {
            long p7 = mVar.p();
            int min = (int) Math.min(20000L, mVar.a() - p7);
            this.f16583b.K(min);
            mVar.n(this.f16583b.d(), 0, min);
            return c(this.f16583b, j7, p7);
        }

        @Override // w0.a.f
        public void b() {
            this.f16583b.L(m0.f19757f);
        }
    }

    public x(o2.i0 i0Var, long j7, long j8) {
        super(new a.b(), new b(i0Var), j7, 0L, j7 + 1, 0L, j8, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }
}
