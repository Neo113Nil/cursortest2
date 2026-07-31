package y0;

import java.util.ArrayList;
import m4.s0;
import o2.a0;
import o2.r;
import o2.v;
import r0.n2;
import r0.s1;
import w0.b0;
import w0.e0;
import w0.j;
import w0.l;
import w0.m;
import w0.n;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: c, reason: collision with root package name */
    private int f23199c;

    /* renamed from: e, reason: collision with root package name */
    private y0.c f23201e;

    /* renamed from: h, reason: collision with root package name */
    private long f23204h;

    /* renamed from: i, reason: collision with root package name */
    private e f23205i;

    /* renamed from: m, reason: collision with root package name */
    private int f23209m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f23210n;

    /* renamed from: a, reason: collision with root package name */
    private final a0 f23197a = new a0(12);

    /* renamed from: b, reason: collision with root package name */
    private final c f23198b = new c();

    /* renamed from: d, reason: collision with root package name */
    private n f23200d = new j();

    /* renamed from: g, reason: collision with root package name */
    private e[] f23203g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    private long f23207k = -1;

    /* renamed from: l, reason: collision with root package name */
    private long f23208l = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f23206j = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f23202f = -9223372036854775807L;

    /* renamed from: y0.b$b, reason: collision with other inner class name */
    private class C0155b implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final long f23211a;

        public C0155b(long j7) {
            this.f23211a = j7;
        }

        @Override // w0.b0
        public boolean g() {
            return true;
        }

        @Override // w0.b0
        public b0.a i(long j7) {
            b0.a i7 = b.this.f23203g[0].i(j7);
            for (int i8 = 1; i8 < b.this.f23203g.length; i8++) {
                b0.a i9 = b.this.f23203g[i8].i(j7);
                if (i9.f22874a.f22880b < i7.f22874a.f22880b) {
                    i7 = i9;
                }
            }
            return i7;
        }

        @Override // w0.b0
        public long j() {
            return this.f23211a;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f23213a;

        /* renamed from: b, reason: collision with root package name */
        public int f23214b;

        /* renamed from: c, reason: collision with root package name */
        public int f23215c;

        private c() {
        }

        public void a(a0 a0Var) {
            this.f23213a = a0Var.p();
            this.f23214b = a0Var.p();
            this.f23215c = 0;
        }

        public void b(a0 a0Var) {
            a(a0Var);
            if (this.f23213a == 1414744396) {
                this.f23215c = a0Var.p();
                return;
            }
            throw n2.a("LIST expected, found: " + this.f23213a, null);
        }
    }

    private static void f(m mVar) {
        if ((mVar.p() & 1) == 1) {
            mVar.i(1);
        }
    }

    private e g(int i7) {
        for (e eVar : this.f23203g) {
            if (eVar.j(i7)) {
                return eVar;
            }
        }
        return null;
    }

    private void i(a0 a0Var) {
        f c7 = f.c(1819436136, a0Var);
        if (c7.getType() != 1819436136) {
            throw n2.a("Unexpected header list type " + c7.getType(), null);
        }
        y0.c cVar = (y0.c) c7.b(y0.c.class);
        if (cVar == null) {
            throw n2.a("AviHeader not found", null);
        }
        this.f23201e = cVar;
        this.f23202f = cVar.f23218c * cVar.f23216a;
        ArrayList arrayList = new ArrayList();
        s0<y0.a> it = c7.f23238a.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            y0.a next = it.next();
            if (next.getType() == 1819440243) {
                int i8 = i7 + 1;
                e l7 = l((f) next, i7);
                if (l7 != null) {
                    arrayList.add(l7);
                }
                i7 = i8;
            }
        }
        this.f23203g = (e[]) arrayList.toArray(new e[0]);
        this.f23200d.j();
    }

    private void j(a0 a0Var) {
        long k7 = k(a0Var);
        while (a0Var.a() >= 16) {
            int p7 = a0Var.p();
            int p8 = a0Var.p();
            long p9 = a0Var.p() + k7;
            a0Var.p();
            e g7 = g(p7);
            if (g7 != null) {
                if ((p8 & 16) == 16) {
                    g7.b(p9);
                }
                g7.k();
            }
        }
        for (e eVar : this.f23203g) {
            eVar.c();
        }
        this.f23210n = true;
        this.f23200d.i(new C0155b(this.f23202f));
    }

    private long k(a0 a0Var) {
        if (a0Var.a() < 16) {
            return 0L;
        }
        int e7 = a0Var.e();
        a0Var.P(8);
        long p7 = a0Var.p();
        long j7 = this.f23207k;
        long j8 = p7 <= j7 ? 8 + j7 : 0L;
        a0Var.O(e7);
        return j8;
    }

    private e l(f fVar, int i7) {
        String str;
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            str = "Missing Stream Header";
        } else {
            if (gVar != null) {
                long a7 = dVar.a();
                s1 s1Var = gVar.f23240a;
                s1.b b7 = s1Var.b();
                b7.R(i7);
                int i8 = dVar.f23225f;
                if (i8 != 0) {
                    b7.W(i8);
                }
                h hVar = (h) fVar.b(h.class);
                if (hVar != null) {
                    b7.U(hVar.f23241a);
                }
                int k7 = v.k(s1Var.f20956q);
                if (k7 != 1 && k7 != 2) {
                    return null;
                }
                e0 d7 = this.f23200d.d(i7, k7);
                d7.e(b7.E());
                e eVar = new e(i7, k7, a7, dVar.f23224e, d7);
                this.f23202f = a7;
                return eVar;
            }
            str = "Missing Stream Format";
        }
        r.i("AviExtractor", str);
        return null;
    }

    private int m(m mVar) {
        if (mVar.p() >= this.f23208l) {
            return -1;
        }
        e eVar = this.f23205i;
        if (eVar == null) {
            f(mVar);
            mVar.n(this.f23197a.d(), 0, 12);
            this.f23197a.O(0);
            int p7 = this.f23197a.p();
            if (p7 == 1414744396) {
                this.f23197a.O(8);
                mVar.i(this.f23197a.p() != 1769369453 ? 8 : 12);
                mVar.h();
                return 0;
            }
            int p8 = this.f23197a.p();
            if (p7 == 1263424842) {
                this.f23204h = mVar.p() + p8 + 8;
                return 0;
            }
            mVar.i(8);
            mVar.h();
            e g7 = g(p7);
            if (g7 == null) {
                this.f23204h = mVar.p() + p8;
                return 0;
            }
            g7.n(p8);
            this.f23205i = g7;
        } else if (eVar.m(mVar)) {
            this.f23205i = null;
        }
        return 0;
    }

    private boolean n(m mVar, w0.a0 a0Var) {
        boolean z6;
        if (this.f23204h != -1) {
            long p7 = mVar.p();
            long j7 = this.f23204h;
            if (j7 < p7 || j7 > 262144 + p7) {
                a0Var.f22873a = j7;
                z6 = true;
                this.f23204h = -1L;
                return z6;
            }
            mVar.i((int) (j7 - p7));
        }
        z6 = false;
        this.f23204h = -1L;
        return z6;
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f23204h = -1L;
        this.f23205i = null;
        for (e eVar : this.f23203g) {
            eVar.o(j7);
        }
        if (j7 != 0) {
            this.f23199c = 6;
        } else if (this.f23203g.length == 0) {
            this.f23199c = 0;
        } else {
            this.f23199c = 3;
        }
    }

    @Override // w0.l
    public void d(n nVar) {
        this.f23199c = 0;
        this.f23200d = nVar;
        this.f23204h = -1L;
    }

    @Override // w0.l
    public int e(m mVar, w0.a0 a0Var) {
        if (n(mVar, a0Var)) {
            return 1;
        }
        switch (this.f23199c) {
            case 0:
                if (!h(mVar)) {
                    throw n2.a("AVI Header List not found", null);
                }
                mVar.i(12);
                this.f23199c = 1;
                return 0;
            case 1:
                mVar.readFully(this.f23197a.d(), 0, 12);
                this.f23197a.O(0);
                this.f23198b.b(this.f23197a);
                c cVar = this.f23198b;
                if (cVar.f23215c == 1819436136) {
                    this.f23206j = cVar.f23214b;
                    this.f23199c = 2;
                    return 0;
                }
                throw n2.a("hdrl expected, found: " + this.f23198b.f23215c, null);
            case 2:
                int i7 = this.f23206j - 4;
                a0 a0Var2 = new a0(i7);
                mVar.readFully(a0Var2.d(), 0, i7);
                i(a0Var2);
                this.f23199c = 3;
                return 0;
            case 3:
                if (this.f23207k != -1) {
                    long p7 = mVar.p();
                    long j7 = this.f23207k;
                    if (p7 != j7) {
                        this.f23204h = j7;
                        return 0;
                    }
                }
                mVar.n(this.f23197a.d(), 0, 12);
                mVar.h();
                this.f23197a.O(0);
                this.f23198b.a(this.f23197a);
                int p8 = this.f23197a.p();
                int i8 = this.f23198b.f23213a;
                if (i8 == 1179011410) {
                    mVar.i(12);
                    return 0;
                }
                if (i8 != 1414744396 || p8 != 1769369453) {
                    this.f23204h = mVar.p() + this.f23198b.f23214b + 8;
                    return 0;
                }
                long p9 = mVar.p();
                this.f23207k = p9;
                this.f23208l = p9 + this.f23198b.f23214b + 8;
                if (!this.f23210n) {
                    if (((y0.c) o2.a.e(this.f23201e)).a()) {
                        this.f23199c = 4;
                        this.f23204h = this.f23208l;
                        return 0;
                    }
                    this.f23200d.i(new b0.b(this.f23202f));
                    this.f23210n = true;
                }
                this.f23204h = mVar.p() + 12;
                this.f23199c = 6;
                return 0;
            case 4:
                mVar.readFully(this.f23197a.d(), 0, 8);
                this.f23197a.O(0);
                int p10 = this.f23197a.p();
                int p11 = this.f23197a.p();
                if (p10 == 829973609) {
                    this.f23199c = 5;
                    this.f23209m = p11;
                } else {
                    this.f23204h = mVar.p() + p11;
                }
                return 0;
            case 5:
                a0 a0Var3 = new a0(this.f23209m);
                mVar.readFully(a0Var3.d(), 0, this.f23209m);
                j(a0Var3);
                this.f23199c = 6;
                this.f23204h = this.f23207k;
                return 0;
            case 6:
                return m(mVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // w0.l
    public boolean h(m mVar) {
        mVar.n(this.f23197a.d(), 0, 12);
        this.f23197a.O(0);
        if (this.f23197a.p() != 1179011410) {
            return false;
        }
        this.f23197a.P(4);
        return this.f23197a.p() == 541677121;
    }
}
