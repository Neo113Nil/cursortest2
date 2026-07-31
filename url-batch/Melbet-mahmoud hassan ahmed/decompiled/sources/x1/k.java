package x1;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    final i f23154a;

    /* renamed from: b, reason: collision with root package name */
    final long f23155b;

    /* renamed from: c, reason: collision with root package name */
    final long f23156c;

    public static abstract class a extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f23157d;

        /* renamed from: e, reason: collision with root package name */
        final long f23158e;

        /* renamed from: f, reason: collision with root package name */
        final List<d> f23159f;

        /* renamed from: g, reason: collision with root package name */
        private final long f23160g;

        /* renamed from: h, reason: collision with root package name */
        private final long f23161h;

        /* renamed from: i, reason: collision with root package name */
        final long f23162i;

        public a(i iVar, long j7, long j8, long j9, long j10, List<d> list, long j11, long j12, long j13) {
            super(iVar, j7, j8);
            this.f23157d = j9;
            this.f23158e = j10;
            this.f23159f = list;
            this.f23162i = j11;
            this.f23160g = j12;
            this.f23161h = j13;
        }

        public long c(long j7, long j8) {
            long g7 = g(j7);
            return g7 != -1 ? g7 : (int) (i((j8 - this.f23161h) + this.f23162i, j7) - d(j7, j8));
        }

        public long d(long j7, long j8) {
            if (g(j7) == -1) {
                long j9 = this.f23160g;
                if (j9 != -9223372036854775807L) {
                    return Math.max(e(), i((j8 - this.f23161h) - j9, j7));
                }
            }
            return e();
        }

        public long e() {
            return this.f23157d;
        }

        public long f(long j7, long j8) {
            if (this.f23159f != null) {
                return -9223372036854775807L;
            }
            long d7 = d(j7, j8) + c(j7, j8);
            return (j(d7) + h(d7, j7)) - this.f23162i;
        }

        public abstract long g(long j7);

        public final long h(long j7, long j8) {
            List<d> list = this.f23159f;
            if (list != null) {
                return (list.get((int) (j7 - this.f23157d)).f23168b * 1000000) / this.f23155b;
            }
            long g7 = g(j8);
            return (g7 == -1 || j7 != (e() + g7) - 1) ? (this.f23158e * 1000000) / this.f23155b : j8 - j(j7);
        }

        public long i(long j7, long j8) {
            long e7 = e();
            long g7 = g(j8);
            if (g7 == 0) {
                return e7;
            }
            if (this.f23159f == null) {
                long j9 = this.f23157d + (j7 / ((this.f23158e * 1000000) / this.f23155b));
                return j9 < e7 ? e7 : g7 == -1 ? j9 : Math.min(j9, (e7 + g7) - 1);
            }
            long j10 = (g7 + e7) - 1;
            long j11 = e7;
            while (j11 <= j10) {
                long j12 = ((j10 - j11) / 2) + j11;
                long j13 = j(j12);
                if (j13 < j7) {
                    j11 = j12 + 1;
                } else {
                    if (j13 <= j7) {
                        return j12;
                    }
                    j10 = j12 - 1;
                }
            }
            return j11 == e7 ? j11 : j10;
        }

        public final long j(long j7) {
            List<d> list = this.f23159f;
            return m0.N0(list != null ? list.get((int) (j7 - this.f23157d)).f23167a - this.f23156c : (j7 - this.f23157d) * this.f23158e, 1000000L, this.f23155b);
        }

        public abstract i k(j jVar, long j7);

        public boolean l() {
            return this.f23159f != null;
        }
    }

    public static final class b extends a {

        /* renamed from: j, reason: collision with root package name */
        final List<i> f23163j;

        public b(i iVar, long j7, long j8, long j9, long j10, List<d> list, long j11, List<i> list2, long j12, long j13) {
            super(iVar, j7, j8, j9, j10, list, j11, j12, j13);
            this.f23163j = list2;
        }

        @Override // x1.k.a
        public long g(long j7) {
            return this.f23163j.size();
        }

        @Override // x1.k.a
        public i k(j jVar, long j7) {
            return this.f23163j.get((int) (j7 - this.f23157d));
        }

        @Override // x1.k.a
        public boolean l() {
            return true;
        }
    }

    public static final class c extends a {

        /* renamed from: j, reason: collision with root package name */
        final n f23164j;

        /* renamed from: k, reason: collision with root package name */
        final n f23165k;

        /* renamed from: l, reason: collision with root package name */
        final long f23166l;

        public c(i iVar, long j7, long j8, long j9, long j10, long j11, List<d> list, long j12, n nVar, n nVar2, long j13, long j14) {
            super(iVar, j7, j8, j9, j11, list, j12, j13, j14);
            this.f23164j = nVar;
            this.f23165k = nVar2;
            this.f23166l = j10;
        }

        @Override // x1.k
        public i a(j jVar) {
            n nVar = this.f23164j;
            if (nVar == null) {
                return super.a(jVar);
            }
            s1 s1Var = jVar.f23141b;
            return new i(nVar.a(s1Var.f20945f, 0L, s1Var.f20952m, 0L), 0L, -1L);
        }

        @Override // x1.k.a
        public long g(long j7) {
            if (this.f23159f != null) {
                return r0.size();
            }
            long j8 = this.f23166l;
            if (j8 != -1) {
                return (j8 - this.f23157d) + 1;
            }
            if (j7 != -9223372036854775807L) {
                return n4.a.a(BigInteger.valueOf(j7).multiply(BigInteger.valueOf(this.f23155b)), BigInteger.valueOf(this.f23158e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // x1.k.a
        public i k(j jVar, long j7) {
            List<d> list = this.f23159f;
            long j8 = list != null ? list.get((int) (j7 - this.f23157d)).f23167a : (j7 - this.f23157d) * this.f23158e;
            n nVar = this.f23165k;
            s1 s1Var = jVar.f23141b;
            return new i(nVar.a(s1Var.f20945f, j7, s1Var.f20952m, j8), 0L, -1L);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final long f23167a;

        /* renamed from: b, reason: collision with root package name */
        final long f23168b;

        public d(long j7, long j8) {
            this.f23167a = j7;
            this.f23168b = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f23167a == dVar.f23167a && this.f23168b == dVar.f23168b;
        }

        public int hashCode() {
            return (((int) this.f23167a) * 31) + ((int) this.f23168b);
        }
    }

    public static class e extends k {

        /* renamed from: d, reason: collision with root package name */
        final long f23169d;

        /* renamed from: e, reason: collision with root package name */
        final long f23170e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(i iVar, long j7, long j8, long j9, long j10) {
            super(iVar, j7, j8);
            this.f23169d = j9;
            this.f23170e = j10;
        }

        public i c() {
            long j7 = this.f23170e;
            if (j7 <= 0) {
                return null;
            }
            return new i(null, this.f23169d, j7);
        }
    }

    public k(i iVar, long j7, long j8) {
        this.f23154a = iVar;
        this.f23155b = j7;
        this.f23156c = j8;
    }

    public i a(j jVar) {
        return this.f23154a;
    }

    public long b() {
        return m0.N0(this.f23156c, 1000000L, this.f23155b);
    }
}
