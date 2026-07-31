package t1;

import android.util.Pair;
import r0.a2;
import r0.r3;
import t1.x;

/* loaded from: classes.dex */
public final class s extends g<Void> {

    /* renamed from: p, reason: collision with root package name */
    private final x f22198p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f22199q;

    /* renamed from: r, reason: collision with root package name */
    private final r3.d f22200r;

    /* renamed from: s, reason: collision with root package name */
    private final r3.b f22201s;

    /* renamed from: t, reason: collision with root package name */
    private a f22202t;

    /* renamed from: u, reason: collision with root package name */
    private r f22203u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f22204v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22205w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22206x;

    private static final class a extends o {

        /* renamed from: k, reason: collision with root package name */
        public static final Object f22207k = new Object();

        /* renamed from: i, reason: collision with root package name */
        private final Object f22208i;

        /* renamed from: j, reason: collision with root package name */
        private final Object f22209j;

        private a(r3 r3Var, Object obj, Object obj2) {
            super(r3Var);
            this.f22208i = obj;
            this.f22209j = obj2;
        }

        public static a A(r3 r3Var, Object obj, Object obj2) {
            return new a(r3Var, obj, obj2);
        }

        public static a z(a2 a2Var) {
            return new a(new b(a2Var), r3.d.f20923w, f22207k);
        }

        @Override // t1.o, r0.r3
        public int f(Object obj) {
            Object obj2;
            r3 r3Var = this.f22143h;
            if (f22207k.equals(obj) && (obj2 = this.f22209j) != null) {
                obj = obj2;
            }
            return r3Var.f(obj);
        }

        @Override // t1.o, r0.r3
        public r3.b k(int i7, r3.b bVar, boolean z6) {
            this.f22143h.k(i7, bVar, z6);
            if (o2.m0.c(bVar.f20913g, this.f22209j) && z6) {
                bVar.f20913g = f22207k;
            }
            return bVar;
        }

        @Override // t1.o, r0.r3
        public Object q(int i7) {
            Object q7 = this.f22143h.q(i7);
            return o2.m0.c(q7, this.f22209j) ? f22207k : q7;
        }

        @Override // t1.o, r0.r3
        public r3.d s(int i7, r3.d dVar, long j7) {
            this.f22143h.s(i7, dVar, j7);
            if (o2.m0.c(dVar.f20927f, this.f22208i)) {
                dVar.f20927f = r3.d.f20923w;
            }
            return dVar;
        }

        public a y(r3 r3Var) {
            return new a(r3Var, this.f22208i, this.f22209j);
        }
    }

    public static final class b extends r3 {

        /* renamed from: h, reason: collision with root package name */
        private final a2 f22210h;

        public b(a2 a2Var) {
            this.f22210h = a2Var;
        }

        @Override // r0.r3
        public int f(Object obj) {
            return obj == a.f22207k ? 0 : -1;
        }

        @Override // r0.r3
        public r3.b k(int i7, r3.b bVar, boolean z6) {
            bVar.w(z6 ? 0 : null, z6 ? a.f22207k : null, 0, -9223372036854775807L, 0L, u1.c.f22442l, true);
            return bVar;
        }

        @Override // r0.r3
        public int m() {
            return 1;
        }

        @Override // r0.r3
        public Object q(int i7) {
            return a.f22207k;
        }

        @Override // r0.r3
        public r3.d s(int i7, r3.d dVar, long j7) {
            dVar.j(r3.d.f20923w, this.f22210h, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f20938q = true;
            return dVar;
        }

        @Override // r0.r3
        public int t() {
            return 1;
        }
    }

    public s(x xVar, boolean z6) {
        this.f22198p = xVar;
        this.f22199q = z6 && xVar.f();
        this.f22200r = new r3.d();
        this.f22201s = new r3.b();
        r3 g7 = xVar.g();
        if (g7 == null) {
            this.f22202t = a.z(xVar.a());
        } else {
            this.f22202t = a.A(g7, null, null);
            this.f22206x = true;
        }
    }

    private Object Q(Object obj) {
        return (this.f22202t.f22209j == null || !this.f22202t.f22209j.equals(obj)) ? obj : a.f22207k;
    }

    private Object R(Object obj) {
        return (this.f22202t.f22209j == null || !obj.equals(a.f22207k)) ? obj : this.f22202t.f22209j;
    }

    private void V(long j7) {
        r rVar = this.f22203u;
        int f7 = this.f22202t.f(rVar.f22189f.f22249a);
        if (f7 == -1) {
            return;
        }
        long j8 = this.f22202t.j(f7, this.f22201s).f20915i;
        if (j8 != -9223372036854775807L && j7 >= j8) {
            j7 = Math.max(0L, j8 - 1);
        }
        rVar.w(j7);
    }

    @Override // t1.g, t1.a
    public void C(n2.p0 p0Var) {
        super.C(p0Var);
        if (this.f22199q) {
            return;
        }
        this.f22204v = true;
        N(null, this.f22198p);
    }

    @Override // t1.g, t1.a
    public void E() {
        this.f22205w = false;
        this.f22204v = false;
        super.E();
    }

    @Override // t1.x
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public r j(x.b bVar, n2.b bVar2, long j7) {
        r rVar = new r(bVar, bVar2, j7);
        rVar.y(this.f22198p);
        if (this.f22205w) {
            rVar.d(bVar.c(R(bVar.f22249a)));
        } else {
            this.f22203u = rVar;
            if (!this.f22204v) {
                this.f22204v = true;
                N(null, this.f22198p);
            }
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t1.g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public x.b I(Void r12, x.b bVar) {
        return bVar.c(Q(bVar.f22249a));
    }

    public r3 T() {
        return this.f22202t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // t1.g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void L(Void r13, x xVar, r3 r3Var) {
        long j7;
        r rVar;
        x.b c7;
        if (this.f22205w) {
            this.f22202t = this.f22202t.y(r3Var);
            r rVar2 = this.f22203u;
            if (rVar2 != null) {
                V(rVar2.j());
            }
        } else if (r3Var.u()) {
            this.f22202t = this.f22206x ? this.f22202t.y(r3Var) : a.A(r3Var, r3.d.f20923w, a.f22207k);
        } else {
            r3Var.r(0, this.f22200r);
            long e7 = this.f22200r.e();
            Object obj = this.f22200r.f20927f;
            r rVar3 = this.f22203u;
            if (rVar3 != null) {
                long m7 = rVar3.m();
                this.f22202t.l(this.f22203u.f22189f.f22249a, this.f22201s);
                long q7 = this.f22201s.q() + m7;
                if (q7 != this.f22202t.r(0, this.f22200r).e()) {
                    j7 = q7;
                    Pair<Object, Long> n7 = r3Var.n(this.f22200r, this.f22201s, 0, j7);
                    Object obj2 = n7.first;
                    long longValue = ((Long) n7.second).longValue();
                    this.f22202t = !this.f22206x ? this.f22202t.y(r3Var) : a.A(r3Var, obj, obj2);
                    rVar = this.f22203u;
                    if (rVar != null) {
                        V(longValue);
                        x.b bVar = rVar.f22189f;
                        c7 = bVar.c(R(bVar.f22249a));
                        this.f22206x = true;
                        this.f22205w = true;
                        D(this.f22202t);
                        if (c7 == null) {
                            ((r) o2.a.e(this.f22203u)).d(c7);
                            return;
                        }
                        return;
                    }
                }
            }
            j7 = e7;
            Pair<Object, Long> n72 = r3Var.n(this.f22200r, this.f22201s, 0, j7);
            Object obj22 = n72.first;
            long longValue2 = ((Long) n72.second).longValue();
            this.f22202t = !this.f22206x ? this.f22202t.y(r3Var) : a.A(r3Var, obj, obj22);
            rVar = this.f22203u;
            if (rVar != null) {
            }
        }
        c7 = null;
        this.f22206x = true;
        this.f22205w = true;
        D(this.f22202t);
        if (c7 == null) {
        }
    }

    @Override // t1.x
    public a2 a() {
        return this.f22198p.a();
    }

    @Override // t1.g, t1.x
    public void c() {
    }

    @Override // t1.x
    public void e(u uVar) {
        ((r) uVar).x();
        if (uVar == this.f22203u) {
            this.f22203u = null;
        }
    }
}
