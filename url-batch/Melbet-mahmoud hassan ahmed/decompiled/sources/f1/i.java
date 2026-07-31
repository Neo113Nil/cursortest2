package f1;

import o2.m0;
import r0.s1;
import w0.a0;
import w0.b0;
import w0.e0;
import w0.m;
import w0.n;

/* loaded from: classes.dex */
abstract class i {

    /* renamed from: b, reason: collision with root package name */
    private e0 f16141b;

    /* renamed from: c, reason: collision with root package name */
    private n f16142c;

    /* renamed from: d, reason: collision with root package name */
    private g f16143d;

    /* renamed from: e, reason: collision with root package name */
    private long f16144e;

    /* renamed from: f, reason: collision with root package name */
    private long f16145f;

    /* renamed from: g, reason: collision with root package name */
    private long f16146g;

    /* renamed from: h, reason: collision with root package name */
    private int f16147h;

    /* renamed from: i, reason: collision with root package name */
    private int f16148i;

    /* renamed from: k, reason: collision with root package name */
    private long f16150k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16151l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16152m;

    /* renamed from: a, reason: collision with root package name */
    private final e f16140a = new e();

    /* renamed from: j, reason: collision with root package name */
    private b f16149j = new b();

    static class b {

        /* renamed from: a, reason: collision with root package name */
        s1 f16153a;

        /* renamed from: b, reason: collision with root package name */
        g f16154b;

        b() {
        }
    }

    private static final class c implements g {
        private c() {
        }

        @Override // f1.g
        public b0 a() {
            return new b0.b(-9223372036854775807L);
        }

        @Override // f1.g
        public long b(m mVar) {
            return -1L;
        }

        @Override // f1.g
        public void c(long j7) {
        }
    }

    private void a() {
        o2.a.h(this.f16141b);
        m0.j(this.f16142c);
    }

    private boolean i(m mVar) {
        while (this.f16140a.d(mVar)) {
            this.f16150k = mVar.p() - this.f16145f;
            if (!h(this.f16140a.c(), this.f16145f, this.f16149j)) {
                return true;
            }
            this.f16145f = mVar.p();
        }
        this.f16147h = 3;
        return false;
    }

    private int j(m mVar) {
        if (!i(mVar)) {
            return -1;
        }
        s1 s1Var = this.f16149j.f16153a;
        this.f16148i = s1Var.E;
        if (!this.f16152m) {
            this.f16141b.e(s1Var);
            this.f16152m = true;
        }
        g gVar = this.f16149j.f16154b;
        if (gVar == null) {
            if (mVar.a() != -1) {
                f b7 = this.f16140a.b();
                this.f16143d = new f1.a(this, this.f16145f, mVar.a(), b7.f16133h + b7.f16134i, b7.f16128c, (b7.f16127b & 4) != 0);
                this.f16147h = 2;
                this.f16140a.f();
                return 0;
            }
            gVar = new c();
        }
        this.f16143d = gVar;
        this.f16147h = 2;
        this.f16140a.f();
        return 0;
    }

    private int k(m mVar, a0 a0Var) {
        long b7 = this.f16143d.b(mVar);
        if (b7 >= 0) {
            a0Var.f22873a = b7;
            return 1;
        }
        if (b7 < -1) {
            e(-(b7 + 2));
        }
        if (!this.f16151l) {
            this.f16142c.i((b0) o2.a.h(this.f16143d.a()));
            this.f16151l = true;
        }
        if (this.f16150k <= 0 && !this.f16140a.d(mVar)) {
            this.f16147h = 3;
            return -1;
        }
        this.f16150k = 0L;
        o2.a0 c7 = this.f16140a.c();
        long f7 = f(c7);
        if (f7 >= 0) {
            long j7 = this.f16146g;
            if (j7 + f7 >= this.f16144e) {
                long b8 = b(j7);
                this.f16141b.d(c7, c7.f());
                this.f16141b.b(b8, 1, c7.f(), 0, null);
                this.f16144e = -1L;
            }
        }
        this.f16146g += f7;
        return 0;
    }

    protected long b(long j7) {
        return (j7 * 1000000) / this.f16148i;
    }

    protected long c(long j7) {
        return (this.f16148i * j7) / 1000000;
    }

    void d(n nVar, e0 e0Var) {
        this.f16142c = nVar;
        this.f16141b = e0Var;
        l(true);
    }

    protected void e(long j7) {
        this.f16146g = j7;
    }

    protected abstract long f(o2.a0 a0Var);

    final int g(m mVar, a0 a0Var) {
        a();
        int i7 = this.f16147h;
        if (i7 == 0) {
            return j(mVar);
        }
        if (i7 == 1) {
            mVar.i((int) this.f16145f);
            this.f16147h = 2;
            return 0;
        }
        if (i7 == 2) {
            m0.j(this.f16143d);
            return k(mVar, a0Var);
        }
        if (i7 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    protected abstract boolean h(o2.a0 a0Var, long j7, b bVar);

    protected void l(boolean z6) {
        int i7;
        if (z6) {
            this.f16149j = new b();
            this.f16145f = 0L;
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.f16147h = i7;
        this.f16144e = -1L;
        this.f16146g = 0L;
    }

    final void m(long j7, long j8) {
        this.f16140a.e();
        if (j7 == 0) {
            l(!this.f16151l);
        } else if (this.f16147h != 0) {
            this.f16144e = c(j8);
            ((g) m0.j(this.f16143d)).c(this.f16144e);
            this.f16147h = 2;
        }
    }
}
