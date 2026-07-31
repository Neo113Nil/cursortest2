package t1;

import android.os.Looper;
import n2.l;
import r0.a2;
import r0.r3;
import s0.u1;
import t1.f0;
import t1.k0;
import t1.l0;
import t1.x;

/* loaded from: classes.dex */
public final class l0 extends t1.a implements k0.b {

    /* renamed from: m, reason: collision with root package name */
    private final a2 f22100m;

    /* renamed from: n, reason: collision with root package name */
    private final a2.h f22101n;

    /* renamed from: o, reason: collision with root package name */
    private final l.a f22102o;

    /* renamed from: p, reason: collision with root package name */
    private final f0.a f22103p;

    /* renamed from: q, reason: collision with root package name */
    private final v0.y f22104q;

    /* renamed from: r, reason: collision with root package name */
    private final n2.g0 f22105r;

    /* renamed from: s, reason: collision with root package name */
    private final int f22106s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22107t;

    /* renamed from: u, reason: collision with root package name */
    private long f22108u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f22109v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22110w;

    /* renamed from: x, reason: collision with root package name */
    private n2.p0 f22111x;

    class a extends o {
        a(l0 l0Var, r3 r3Var) {
            super(r3Var);
        }

        @Override // t1.o, r0.r3
        public r3.b k(int i7, r3.b bVar, boolean z6) {
            super.k(i7, bVar, z6);
            bVar.f20917k = true;
            return bVar;
        }

        @Override // t1.o, r0.r3
        public r3.d s(int i7, r3.d dVar, long j7) {
            super.s(i7, dVar, j7);
            dVar.f20938q = true;
            return dVar;
        }
    }

    public static final class b implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private final l.a f22112a;

        /* renamed from: b, reason: collision with root package name */
        private f0.a f22113b;

        /* renamed from: c, reason: collision with root package name */
        private v0.b0 f22114c;

        /* renamed from: d, reason: collision with root package name */
        private n2.g0 f22115d;

        /* renamed from: e, reason: collision with root package name */
        private int f22116e;

        /* renamed from: f, reason: collision with root package name */
        private String f22117f;

        /* renamed from: g, reason: collision with root package name */
        private Object f22118g;

        public b(l.a aVar) {
            this(aVar, new w0.i());
        }

        public b(l.a aVar, f0.a aVar2) {
            this(aVar, aVar2, new v0.l(), new n2.x(), 1048576);
        }

        public b(l.a aVar, f0.a aVar2, v0.b0 b0Var, n2.g0 g0Var, int i7) {
            this.f22112a = aVar;
            this.f22113b = aVar2;
            this.f22114c = b0Var;
            this.f22115d = g0Var;
            this.f22116e = i7;
        }

        public b(l.a aVar, final w0.r rVar) {
            this(aVar, new f0.a() { // from class: t1.m0
                @Override // t1.f0.a
                public final f0 a(u1 u1Var) {
                    f0 c7;
                    c7 = l0.b.c(w0.r.this, u1Var);
                    return c7;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ f0 c(w0.r rVar, u1 u1Var) {
            return new c(rVar);
        }

        public l0 b(a2 a2Var) {
            a2.c b7;
            a2.c e7;
            o2.a.e(a2Var.f20393g);
            a2.h hVar = a2Var.f20393g;
            boolean z6 = hVar.f20465i == null && this.f22118g != null;
            boolean z7 = hVar.f20462f == null && this.f22117f != null;
            if (!z6 || !z7) {
                if (z6) {
                    e7 = a2Var.b().e(this.f22118g);
                    a2Var = e7.a();
                    a2 a2Var2 = a2Var;
                    return new l0(a2Var2, this.f22112a, this.f22113b, this.f22114c.a(a2Var2), this.f22115d, this.f22116e, null);
                }
                if (z7) {
                    b7 = a2Var.b();
                }
                a2 a2Var22 = a2Var;
                return new l0(a2Var22, this.f22112a, this.f22113b, this.f22114c.a(a2Var22), this.f22115d, this.f22116e, null);
            }
            b7 = a2Var.b().e(this.f22118g);
            e7 = b7.b(this.f22117f);
            a2Var = e7.a();
            a2 a2Var222 = a2Var;
            return new l0(a2Var222, this.f22112a, this.f22113b, this.f22114c.a(a2Var222), this.f22115d, this.f22116e, null);
        }
    }

    private l0(a2 a2Var, l.a aVar, f0.a aVar2, v0.y yVar, n2.g0 g0Var, int i7) {
        this.f22101n = (a2.h) o2.a.e(a2Var.f20393g);
        this.f22100m = a2Var;
        this.f22102o = aVar;
        this.f22103p = aVar2;
        this.f22104q = yVar;
        this.f22105r = g0Var;
        this.f22106s = i7;
        this.f22107t = true;
        this.f22108u = -9223372036854775807L;
    }

    /* synthetic */ l0(a2 a2Var, l.a aVar, f0.a aVar2, v0.y yVar, n2.g0 g0Var, int i7, a aVar3) {
        this(a2Var, aVar, aVar2, yVar, g0Var, i7);
    }

    private void F() {
        r3 u0Var = new u0(this.f22108u, this.f22109v, false, this.f22110w, null, this.f22100m);
        if (this.f22107t) {
            u0Var = new a(this, u0Var);
        }
        D(u0Var);
    }

    @Override // t1.a
    protected void C(n2.p0 p0Var) {
        this.f22111x = p0Var;
        this.f22104q.W();
        this.f22104q.c((Looper) o2.a.e(Looper.myLooper()), A());
        F();
    }

    @Override // t1.a
    protected void E() {
        this.f22104q.a();
    }

    @Override // t1.x
    public a2 a() {
        return this.f22100m;
    }

    @Override // t1.x
    public void c() {
    }

    @Override // t1.x
    public void e(u uVar) {
        ((k0) uVar).f0();
    }

    @Override // t1.x
    public u j(x.b bVar, n2.b bVar2, long j7) {
        n2.l a7 = this.f22102o.a();
        n2.p0 p0Var = this.f22111x;
        if (p0Var != null) {
            a7.d(p0Var);
        }
        return new k0(this.f22101n.f20457a, a7, this.f22103p.a(A()), this.f22104q, u(bVar), this.f22105r, w(bVar), this, bVar2, this.f22101n.f20462f, this.f22106s);
    }

    @Override // t1.k0.b
    public void s(long j7, boolean z6, boolean z7) {
        if (j7 == -9223372036854775807L) {
            j7 = this.f22108u;
        }
        if (!this.f22107t && this.f22108u == j7 && this.f22109v == z6 && this.f22110w == z7) {
            return;
        }
        this.f22108u = j7;
        this.f22109v = z6;
        this.f22110w = z7;
        this.f22107t = false;
        F();
    }
}
