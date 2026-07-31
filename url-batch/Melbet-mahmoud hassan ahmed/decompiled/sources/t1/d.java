package t1;

import r0.j3;
import r0.s1;
import r0.t1;
import t1.e;
import t1.u;

/* loaded from: classes.dex */
public final class d implements u, u.a {

    /* renamed from: f, reason: collision with root package name */
    public final u f21973f;

    /* renamed from: g, reason: collision with root package name */
    private u.a f21974g;

    /* renamed from: h, reason: collision with root package name */
    private a[] f21975h = new a[0];

    /* renamed from: i, reason: collision with root package name */
    private long f21976i;

    /* renamed from: j, reason: collision with root package name */
    long f21977j;

    /* renamed from: k, reason: collision with root package name */
    long f21978k;

    /* renamed from: l, reason: collision with root package name */
    private e.b f21979l;

    private final class a implements q0 {

        /* renamed from: f, reason: collision with root package name */
        public final q0 f21980f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f21981g;

        public a(q0 q0Var) {
            this.f21980f = q0Var;
        }

        public void a() {
            this.f21981g = false;
        }

        @Override // t1.q0
        public void b() {
            this.f21980f.b();
        }

        @Override // t1.q0
        public int d(long j7) {
            if (d.this.j()) {
                return -3;
            }
            return this.f21980f.d(j7);
        }

        @Override // t1.q0
        public boolean i() {
            return !d.this.j() && this.f21980f.i();
        }

        @Override // t1.q0
        public int j(t1 t1Var, u0.g gVar, int i7) {
            if (d.this.j()) {
                return -3;
            }
            if (this.f21981g) {
                gVar.p(4);
                return -4;
            }
            int j7 = this.f21980f.j(t1Var, gVar, i7);
            if (j7 == -5) {
                s1 s1Var = (s1) o2.a.e(t1Var.f21040b);
                int i8 = s1Var.G;
                if (i8 != 0 || s1Var.H != 0) {
                    d dVar = d.this;
                    if (dVar.f21977j != 0) {
                        i8 = 0;
                    }
                    t1Var.f21040b = s1Var.b().N(i8).O(dVar.f21978k == Long.MIN_VALUE ? s1Var.H : 0).E();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j8 = dVar2.f21978k;
            if (j8 == Long.MIN_VALUE || ((j7 != -4 || gVar.f22413j < j8) && !(j7 == -3 && dVar2.e() == Long.MIN_VALUE && !gVar.f22412i))) {
                return j7;
            }
            gVar.h();
            gVar.p(4);
            this.f21981g = true;
            return -4;
        }
    }

    public d(u uVar, boolean z6, long j7, long j8) {
        this.f21973f = uVar;
        this.f21976i = z6 ? j7 : -9223372036854775807L;
        this.f21977j = j7;
        this.f21978k = j8;
    }

    private j3 d(long j7, j3 j3Var) {
        long r7 = o2.m0.r(j3Var.f20708a, 0L, j7 - this.f21977j);
        long j8 = j3Var.f20709b;
        long j9 = this.f21978k;
        long r8 = o2.m0.r(j8, 0L, j9 == Long.MIN_VALUE ? Long.MAX_VALUE : j9 - j7);
        return (r7 == j3Var.f20708a && r8 == j3Var.f20709b) ? j3Var : new j3(r7, r8);
    }

    private static boolean v(long j7, m2.t[] tVarArr) {
        if (j7 != 0) {
            for (m2.t tVar : tVarArr) {
                if (tVar != null) {
                    s1 p7 = tVar.p();
                    if (!o2.v.a(p7.f20956q, p7.f20953n)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // t1.u, t1.r0
    public boolean a() {
        return this.f21973f.a();
    }

    @Override // t1.u, t1.r0
    public long c() {
        long c7 = this.f21973f.c();
        if (c7 != Long.MIN_VALUE) {
            long j7 = this.f21978k;
            if (j7 == Long.MIN_VALUE || c7 < j7) {
                return c7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // t1.u, t1.r0
    public long e() {
        long e7 = this.f21973f.e();
        if (e7 != Long.MIN_VALUE) {
            long j7 = this.f21978k;
            if (j7 == Long.MIN_VALUE || e7 < j7) {
                return e7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // t1.u
    public long f(long j7, j3 j3Var) {
        long j8 = this.f21977j;
        if (j7 == j8) {
            return j8;
        }
        return this.f21973f.f(j7, d(j7, j3Var));
    }

    @Override // t1.u, t1.r0
    public boolean g(long j7) {
        return this.f21973f.g(j7);
    }

    @Override // t1.u, t1.r0
    public void h(long j7) {
        this.f21973f.h(j7);
    }

    @Override // t1.u.a
    public void i(u uVar) {
        if (this.f21979l != null) {
            return;
        }
        ((u.a) o2.a.e(this.f21974g)).i(this);
    }

    boolean j() {
        return this.f21976i != -9223372036854775807L;
    }

    @Override // t1.r0.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void l(u uVar) {
        ((u.a) o2.a.e(this.f21974g)).l(this);
    }

    @Override // t1.u
    public long n() {
        if (j()) {
            long j7 = this.f21976i;
            this.f21976i = -9223372036854775807L;
            long n7 = n();
            return n7 != -9223372036854775807L ? n7 : j7;
        }
        long n8 = this.f21973f.n();
        if (n8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z6 = true;
        o2.a.f(n8 >= this.f21977j);
        long j8 = this.f21978k;
        if (j8 != Long.MIN_VALUE && n8 > j8) {
            z6 = false;
        }
        o2.a.f(z6);
        return n8;
    }

    public void o(e.b bVar) {
        this.f21979l = bVar;
    }

    @Override // t1.u
    public z0 p() {
        return this.f21973f.p();
    }

    @Override // t1.u
    public void q(u.a aVar, long j7) {
        this.f21974g = aVar;
        this.f21973f.q(this, j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    @Override // t1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long r(m2.t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7) {
        long j8;
        boolean z6;
        this.f21975h = new a[q0VarArr.length];
        q0[] q0VarArr2 = new q0[q0VarArr.length];
        int i7 = 0;
        while (true) {
            q0 q0Var = null;
            if (i7 >= q0VarArr.length) {
                break;
            }
            a[] aVarArr = this.f21975h;
            aVarArr[i7] = (a) q0VarArr[i7];
            if (aVarArr[i7] != null) {
                q0Var = aVarArr[i7].f21980f;
            }
            q0VarArr2[i7] = q0Var;
            i7++;
        }
        long r7 = this.f21973f.r(tVarArr, zArr, q0VarArr2, zArr2, j7);
        if (j()) {
            long j9 = this.f21977j;
            if (j7 == j9 && v(j9, tVarArr)) {
                j8 = r7;
                this.f21976i = j8;
                if (r7 != j7) {
                    if (r7 >= this.f21977j) {
                        long j10 = this.f21978k;
                        if (j10 != Long.MIN_VALUE) {
                        }
                    }
                    z6 = false;
                    o2.a.f(z6);
                    for (int i8 = 0; i8 < q0VarArr.length; i8++) {
                        if (q0VarArr2[i8] == null) {
                            this.f21975h[i8] = null;
                        } else {
                            a[] aVarArr2 = this.f21975h;
                            if (aVarArr2[i8] == null || aVarArr2[i8].f21980f != q0VarArr2[i8]) {
                                aVarArr2[i8] = new a(q0VarArr2[i8]);
                            }
                        }
                        q0VarArr[i8] = this.f21975h[i8];
                    }
                    return r7;
                }
                z6 = true;
                o2.a.f(z6);
                while (i8 < q0VarArr.length) {
                }
                return r7;
            }
        }
        j8 = -9223372036854775807L;
        this.f21976i = j8;
        if (r7 != j7) {
        }
        z6 = true;
        o2.a.f(z6);
        while (i8 < q0VarArr.length) {
        }
        return r7;
    }

    @Override // t1.u
    public void s() {
        e.b bVar = this.f21979l;
        if (bVar != null) {
            throw bVar;
        }
        this.f21973f.s();
    }

    @Override // t1.u
    public void t(long j7, boolean z6) {
        this.f21973f.t(j7, z6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r7) goto L17;
     */
    @Override // t1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long u(long j7) {
        this.f21976i = -9223372036854775807L;
        boolean z6 = false;
        for (a aVar : this.f21975h) {
            if (aVar != null) {
                aVar.a();
            }
        }
        long u6 = this.f21973f.u(j7);
        if (u6 != j7) {
            if (u6 >= this.f21977j) {
                long j8 = this.f21978k;
                if (j8 != Long.MIN_VALUE) {
                }
            }
            o2.a.f(z6);
            return u6;
        }
        z6 = true;
        o2.a.f(z6);
        return u6;
    }

    public void w(long j7, long j8) {
        this.f21977j = j7;
        this.f21978k = j8;
    }
}
