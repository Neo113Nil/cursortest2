package b1;

import e1.k;
import j1.a;
import o2.a0;
import r0.s1;
import w0.b0;
import w0.l;
import w0.m;
import w0.n;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: b, reason: collision with root package name */
    private n f1606b;

    /* renamed from: c, reason: collision with root package name */
    private int f1607c;

    /* renamed from: d, reason: collision with root package name */
    private int f1608d;

    /* renamed from: e, reason: collision with root package name */
    private int f1609e;

    /* renamed from: g, reason: collision with root package name */
    private p1.b f1611g;

    /* renamed from: h, reason: collision with root package name */
    private m f1612h;

    /* renamed from: i, reason: collision with root package name */
    private c f1613i;

    /* renamed from: j, reason: collision with root package name */
    private k f1614j;

    /* renamed from: a, reason: collision with root package name */
    private final a0 f1605a = new a0(6);

    /* renamed from: f, reason: collision with root package name */
    private long f1610f = -1;

    private void c(m mVar) {
        this.f1605a.K(2);
        mVar.n(this.f1605a.d(), 0, 2);
        mVar.o(this.f1605a.I() - 2);
    }

    private void f() {
        i(new a.b[0]);
        ((n) o2.a.e(this.f1606b)).j();
        this.f1606b.i(new b0.b(-9223372036854775807L));
        this.f1607c = 6;
    }

    private static p1.b g(String str, long j7) {
        b a7;
        if (j7 == -1 || (a7 = e.a(str)) == null) {
            return null;
        }
        return a7.a(j7);
    }

    private void i(a.b... bVarArr) {
        ((n) o2.a.e(this.f1606b)).d(1024, 4).e(new s1.b().K("image/jpeg").X(new j1.a(bVarArr)).E());
    }

    private int j(m mVar) {
        this.f1605a.K(2);
        mVar.n(this.f1605a.d(), 0, 2);
        return this.f1605a.I();
    }

    private void k(m mVar) {
        int i7;
        this.f1605a.K(2);
        mVar.readFully(this.f1605a.d(), 0, 2);
        int I = this.f1605a.I();
        this.f1608d = I;
        if (I == 65498) {
            if (this.f1610f == -1) {
                f();
                return;
            }
            i7 = 4;
        } else if ((I >= 65488 && I <= 65497) || I == 65281) {
            return;
        } else {
            i7 = 1;
        }
        this.f1607c = i7;
    }

    private void l(m mVar) {
        String w6;
        if (this.f1608d == 65505) {
            a0 a0Var = new a0(this.f1609e);
            mVar.readFully(a0Var.d(), 0, this.f1609e);
            if (this.f1611g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.w()) && (w6 = a0Var.w()) != null) {
                p1.b g7 = g(w6, mVar.a());
                this.f1611g = g7;
                if (g7 != null) {
                    this.f1610f = g7.f19962i;
                }
            }
        } else {
            mVar.i(this.f1609e);
        }
        this.f1607c = 0;
    }

    private void m(m mVar) {
        this.f1605a.K(2);
        mVar.readFully(this.f1605a.d(), 0, 2);
        this.f1609e = this.f1605a.I() - 2;
        this.f1607c = 2;
    }

    private void n(m mVar) {
        if (mVar.l(this.f1605a.d(), 0, 1, true)) {
            mVar.h();
            if (this.f1614j == null) {
                this.f1614j = new k();
            }
            c cVar = new c(mVar, this.f1610f);
            this.f1613i = cVar;
            if (this.f1614j.h(cVar)) {
                this.f1614j.d(new d(this.f1610f, (n) o2.a.e(this.f1606b)));
                o();
                return;
            }
        }
        f();
    }

    private void o() {
        i((a.b) o2.a.e(this.f1611g));
        this.f1607c = 5;
    }

    @Override // w0.l
    public void a() {
        k kVar = this.f1614j;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        if (j7 == 0) {
            this.f1607c = 0;
            this.f1614j = null;
        } else if (this.f1607c == 5) {
            ((k) o2.a.e(this.f1614j)).b(j7, j8);
        }
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f1606b = nVar;
    }

    @Override // w0.l
    public int e(m mVar, w0.a0 a0Var) {
        int i7 = this.f1607c;
        if (i7 == 0) {
            k(mVar);
            return 0;
        }
        if (i7 == 1) {
            m(mVar);
            return 0;
        }
        if (i7 == 2) {
            l(mVar);
            return 0;
        }
        if (i7 == 4) {
            long p7 = mVar.p();
            long j7 = this.f1610f;
            if (p7 != j7) {
                a0Var.f22873a = j7;
                return 1;
            }
            n(mVar);
            return 0;
        }
        if (i7 != 5) {
            if (i7 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f1613i == null || mVar != this.f1612h) {
            this.f1612h = mVar;
            this.f1613i = new c(mVar, this.f1610f);
        }
        int e7 = ((k) o2.a.e(this.f1614j)).e(this.f1613i, a0Var);
        if (e7 == 1) {
            a0Var.f22873a += this.f1610f;
        }
        return e7;
    }

    @Override // w0.l
    public boolean h(m mVar) {
        if (j(mVar) != 65496) {
            return false;
        }
        int j7 = j(mVar);
        this.f1608d = j7;
        if (j7 == 65504) {
            c(mVar);
            this.f1608d = j(mVar);
        }
        if (this.f1608d != 65505) {
            return false;
        }
        mVar.o(2);
        this.f1605a.K(6);
        mVar.n(this.f1605a.d(), 0, 6);
        return this.f1605a.E() == 1165519206 && this.f1605a.I() == 0;
    }
}
