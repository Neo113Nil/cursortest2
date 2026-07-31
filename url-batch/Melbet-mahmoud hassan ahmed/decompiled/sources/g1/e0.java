package g1;

import o2.m0;
import w0.a;

/* loaded from: classes.dex */
final class e0 extends w0.a {

    private static final class a implements a.f {

        /* renamed from: a, reason: collision with root package name */
        private final o2.i0 f16276a;

        /* renamed from: b, reason: collision with root package name */
        private final o2.a0 f16277b = new o2.a0();

        /* renamed from: c, reason: collision with root package name */
        private final int f16278c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16279d;

        public a(int i7, o2.i0 i0Var, int i8) {
            this.f16278c = i7;
            this.f16276a = i0Var;
            this.f16279d = i8;
        }

        private a.e c(o2.a0 a0Var, long j7, long j8) {
            int a7;
            int a8;
            int f7 = a0Var.f();
            long j9 = -1;
            long j10 = -1;
            long j11 = -9223372036854775807L;
            while (a0Var.a() >= 188 && (a8 = (a7 = j0.a(a0Var.d(), a0Var.e(), f7)) + 188) <= f7) {
                long c7 = j0.c(a0Var, a7, this.f16278c);
                if (c7 != -9223372036854775807L) {
                    long b7 = this.f16276a.b(c7);
                    if (b7 > j7) {
                        return j11 == -9223372036854775807L ? a.e.d(b7, j8) : a.e.e(j8 + j10);
                    }
                    if (100000 + b7 > j7) {
                        return a.e.e(j8 + a7);
                    }
                    j10 = a7;
                    j11 = b7;
                }
                a0Var.O(a8);
                j9 = a8;
            }
            return j11 != -9223372036854775807L ? a.e.f(j11, j8 + j9) : a.e.f22869d;
        }

        @Override // w0.a.f
        public a.e a(w0.m mVar, long j7) {
            long p7 = mVar.p();
            int min = (int) Math.min(this.f16279d, mVar.a() - p7);
            this.f16277b.K(min);
            mVar.n(this.f16277b.d(), 0, min);
            return c(this.f16277b, j7, p7);
        }

        @Override // w0.a.f
        public void b() {
            this.f16277b.L(m0.f19757f);
        }
    }

    public e0(o2.i0 i0Var, long j7, long j8, int i7, int i8) {
        super(new a.b(), new a(i7, i0Var, i8), j7, 0L, j7 + 1, 0L, j8, 188L, 940);
    }
}
