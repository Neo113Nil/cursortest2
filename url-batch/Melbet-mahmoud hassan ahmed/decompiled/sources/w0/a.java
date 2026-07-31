package w0;

import o2.m0;
import w0.b0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected final C0148a f22850a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f22851b;

    /* renamed from: c, reason: collision with root package name */
    protected c f22852c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22853d;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    public static class C0148a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final d f22854a;

        /* renamed from: b, reason: collision with root package name */
        private final long f22855b;

        /* renamed from: c, reason: collision with root package name */
        private final long f22856c;

        /* renamed from: d, reason: collision with root package name */
        private final long f22857d;

        /* renamed from: e, reason: collision with root package name */
        private final long f22858e;

        /* renamed from: f, reason: collision with root package name */
        private final long f22859f;

        /* renamed from: g, reason: collision with root package name */
        private final long f22860g;

        public C0148a(d dVar, long j7, long j8, long j9, long j10, long j11, long j12) {
            this.f22854a = dVar;
            this.f22855b = j7;
            this.f22856c = j8;
            this.f22857d = j9;
            this.f22858e = j10;
            this.f22859f = j11;
            this.f22860g = j12;
        }

        @Override // w0.b0
        public boolean g() {
            return true;
        }

        @Override // w0.b0
        public b0.a i(long j7) {
            return new b0.a(new c0(j7, c.h(this.f22854a.a(j7), this.f22856c, this.f22857d, this.f22858e, this.f22859f, this.f22860g)));
        }

        @Override // w0.b0
        public long j() {
            return this.f22855b;
        }

        public long k(long j7) {
            return this.f22854a.a(j7);
        }
    }

    public static final class b implements d {
        @Override // w0.a.d
        public long a(long j7) {
            return j7;
        }
    }

    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f22861a;

        /* renamed from: b, reason: collision with root package name */
        private final long f22862b;

        /* renamed from: c, reason: collision with root package name */
        private final long f22863c;

        /* renamed from: d, reason: collision with root package name */
        private long f22864d;

        /* renamed from: e, reason: collision with root package name */
        private long f22865e;

        /* renamed from: f, reason: collision with root package name */
        private long f22866f;

        /* renamed from: g, reason: collision with root package name */
        private long f22867g;

        /* renamed from: h, reason: collision with root package name */
        private long f22868h;

        protected c(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
            this.f22861a = j7;
            this.f22862b = j8;
            this.f22864d = j9;
            this.f22865e = j10;
            this.f22866f = j11;
            this.f22867g = j12;
            this.f22863c = j13;
            this.f22868h = h(j8, j9, j10, j11, j12, j13);
        }

        protected static long h(long j7, long j8, long j9, long j10, long j11, long j12) {
            if (j10 + 1 >= j11 || j8 + 1 >= j9) {
                return j10;
            }
            long j13 = (long) ((j7 - j8) * ((j11 - j10) / (j9 - j8)));
            return m0.r(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f22867g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f22866f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f22868h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f22861a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f22862b;
        }

        private void n() {
            this.f22868h = h(this.f22862b, this.f22864d, this.f22865e, this.f22866f, this.f22867g, this.f22863c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j7, long j8) {
            this.f22865e = j7;
            this.f22867g = j8;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j7, long j8) {
            this.f22864d = j7;
            this.f22866f = j8;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface d {
        long a(long j7);
    }

    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f22869d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f22870a;

        /* renamed from: b, reason: collision with root package name */
        private final long f22871b;

        /* renamed from: c, reason: collision with root package name */
        private final long f22872c;

        private e(int i7, long j7, long j8) {
            this.f22870a = i7;
            this.f22871b = j7;
            this.f22872c = j8;
        }

        public static e d(long j7, long j8) {
            return new e(-1, j7, j8);
        }

        public static e e(long j7) {
            return new e(0, -9223372036854775807L, j7);
        }

        public static e f(long j7, long j8) {
            return new e(-2, j7, j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface f {
        e a(m mVar, long j7);

        void b();
    }

    protected a(d dVar, f fVar, long j7, long j8, long j9, long j10, long j11, long j12, int i7) {
        this.f22851b = fVar;
        this.f22853d = i7;
        this.f22850a = new C0148a(dVar, j7, j8, j9, j10, j11, j12);
    }

    protected c a(long j7) {
        return new c(j7, this.f22850a.k(j7), this.f22850a.f22856c, this.f22850a.f22857d, this.f22850a.f22858e, this.f22850a.f22859f, this.f22850a.f22860g);
    }

    public final b0 b() {
        return this.f22850a;
    }

    public int c(m mVar, a0 a0Var) {
        while (true) {
            c cVar = (c) o2.a.h(this.f22852c);
            long j7 = cVar.j();
            long i7 = cVar.i();
            long k7 = cVar.k();
            if (i7 - j7 <= this.f22853d) {
                e(false, j7);
                return g(mVar, j7, a0Var);
            }
            if (!i(mVar, k7)) {
                return g(mVar, k7, a0Var);
            }
            mVar.h();
            e a7 = this.f22851b.a(mVar, cVar.m());
            int i8 = a7.f22870a;
            if (i8 == -3) {
                e(false, k7);
                return g(mVar, k7, a0Var);
            }
            if (i8 == -2) {
                cVar.p(a7.f22871b, a7.f22872c);
            } else {
                if (i8 != -1) {
                    if (i8 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(mVar, a7.f22872c);
                    e(true, a7.f22872c);
                    return g(mVar, a7.f22872c, a0Var);
                }
                cVar.o(a7.f22871b, a7.f22872c);
            }
        }
    }

    public final boolean d() {
        return this.f22852c != null;
    }

    protected final void e(boolean z6, long j7) {
        this.f22852c = null;
        this.f22851b.b();
        f(z6, j7);
    }

    protected void f(boolean z6, long j7) {
    }

    protected final int g(m mVar, long j7, a0 a0Var) {
        if (j7 == mVar.p()) {
            return 0;
        }
        a0Var.f22873a = j7;
        return 1;
    }

    public final void h(long j7) {
        c cVar = this.f22852c;
        if (cVar == null || cVar.l() != j7) {
            this.f22852c = a(j7);
        }
    }

    protected final boolean i(m mVar, long j7) {
        long p7 = j7 - mVar.p();
        if (p7 < 0 || p7 > 262144) {
            return false;
        }
        mVar.i((int) p7);
        return true;
    }
}
