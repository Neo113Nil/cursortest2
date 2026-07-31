package t1;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import n2.g0;
import n2.h0;
import n2.p;
import r0.j3;
import r0.n2;
import r0.s1;
import r0.t1;
import t1.e0;
import t1.p;
import t1.p0;
import t1.u;
import v0.w;
import w0.b0;

/* loaded from: classes.dex */
final class k0 implements u, w0.n, h0.b<a>, h0.f, p0.d {
    private static final Map<String, String> R = L();
    private static final s1 S = new s1.b().S("icy").e0("application/x-icy").E();
    private boolean A;
    private boolean B;
    private e C;
    private w0.b0 D;
    private boolean F;
    private boolean H;
    private boolean I;
    private int J;
    private boolean K;
    private long L;
    private boolean N;
    private int O;
    private boolean P;
    private boolean Q;

    /* renamed from: f, reason: collision with root package name */
    private final Uri f22057f;

    /* renamed from: g, reason: collision with root package name */
    private final n2.l f22058g;

    /* renamed from: h, reason: collision with root package name */
    private final v0.y f22059h;

    /* renamed from: i, reason: collision with root package name */
    private final n2.g0 f22060i;

    /* renamed from: j, reason: collision with root package name */
    private final e0.a f22061j;

    /* renamed from: k, reason: collision with root package name */
    private final w.a f22062k;

    /* renamed from: l, reason: collision with root package name */
    private final b f22063l;

    /* renamed from: m, reason: collision with root package name */
    private final n2.b f22064m;

    /* renamed from: n, reason: collision with root package name */
    private final String f22065n;

    /* renamed from: o, reason: collision with root package name */
    private final long f22066o;

    /* renamed from: q, reason: collision with root package name */
    private final f0 f22068q;

    /* renamed from: v, reason: collision with root package name */
    private u.a f22073v;

    /* renamed from: w, reason: collision with root package name */
    private n1.b f22074w;

    /* renamed from: z, reason: collision with root package name */
    private boolean f22077z;

    /* renamed from: p, reason: collision with root package name */
    private final n2.h0 f22067p = new n2.h0("ProgressiveMediaPeriod");

    /* renamed from: r, reason: collision with root package name */
    private final o2.g f22069r = new o2.g();

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f22070s = new Runnable() { // from class: t1.g0
        @Override // java.lang.Runnable
        public final void run() {
            k0.this.U();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f22071t = new Runnable() { // from class: t1.i0
        @Override // java.lang.Runnable
        public final void run() {
            k0.this.R();
        }
    };

    /* renamed from: u, reason: collision with root package name */
    private final Handler f22072u = o2.m0.w();

    /* renamed from: y, reason: collision with root package name */
    private d[] f22076y = new d[0];

    /* renamed from: x, reason: collision with root package name */
    private p0[] f22075x = new p0[0];
    private long M = -9223372036854775807L;
    private long E = -9223372036854775807L;
    private int G = 1;

    final class a implements h0.e, p.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f22079b;

        /* renamed from: c, reason: collision with root package name */
        private final n2.o0 f22080c;

        /* renamed from: d, reason: collision with root package name */
        private final f0 f22081d;

        /* renamed from: e, reason: collision with root package name */
        private final w0.n f22082e;

        /* renamed from: f, reason: collision with root package name */
        private final o2.g f22083f;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f22085h;

        /* renamed from: j, reason: collision with root package name */
        private long f22087j;

        /* renamed from: l, reason: collision with root package name */
        private w0.e0 f22089l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f22090m;

        /* renamed from: g, reason: collision with root package name */
        private final w0.a0 f22084g = new w0.a0();

        /* renamed from: i, reason: collision with root package name */
        private boolean f22086i = true;

        /* renamed from: a, reason: collision with root package name */
        private final long f22078a = q.a();

        /* renamed from: k, reason: collision with root package name */
        private n2.p f22088k = i(0);

        public a(Uri uri, n2.l lVar, f0 f0Var, w0.n nVar, o2.g gVar) {
            this.f22079b = uri;
            this.f22080c = new n2.o0(lVar);
            this.f22081d = f0Var;
            this.f22082e = nVar;
            this.f22083f = gVar;
        }

        private n2.p i(long j7) {
            return new p.b().i(this.f22079b).h(j7).f(k0.this.f22065n).b(6).e(k0.R).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j7, long j8) {
            this.f22084g.f22873a = j7;
            this.f22087j = j8;
            this.f22086i = true;
            this.f22090m = false;
        }

        @Override // n2.h0.e
        public void a() {
            int i7 = 0;
            while (i7 == 0 && !this.f22085h) {
                try {
                    long j7 = this.f22084g.f22873a;
                    n2.p i8 = i(j7);
                    this.f22088k = i8;
                    long b7 = this.f22080c.b(i8);
                    if (b7 != -1) {
                        b7 += j7;
                        k0.this.Z();
                    }
                    long j8 = b7;
                    k0.this.f22074w = n1.b.a(this.f22080c.g());
                    n2.i iVar = this.f22080c;
                    if (k0.this.f22074w != null && k0.this.f22074w.f19384k != -1) {
                        iVar = new p(this.f22080c, k0.this.f22074w.f19384k, this);
                        w0.e0 O = k0.this.O();
                        this.f22089l = O;
                        O.e(k0.S);
                    }
                    long j9 = j7;
                    this.f22081d.c(iVar, this.f22079b, this.f22080c.g(), j7, j8, this.f22082e);
                    if (k0.this.f22074w != null) {
                        this.f22081d.f();
                    }
                    if (this.f22086i) {
                        this.f22081d.b(j9, this.f22087j);
                        this.f22086i = false;
                    }
                    while (true) {
                        long j10 = j9;
                        while (i7 == 0 && !this.f22085h) {
                            try {
                                this.f22083f.a();
                                i7 = this.f22081d.d(this.f22084g);
                                j9 = this.f22081d.e();
                                if (j9 > k0.this.f22066o + j10) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f22083f.c();
                        k0.this.f22072u.post(k0.this.f22071t);
                    }
                    if (i7 == 1) {
                        i7 = 0;
                    } else if (this.f22081d.e() != -1) {
                        this.f22084g.f22873a = this.f22081d.e();
                    }
                    n2.o.a(this.f22080c);
                } catch (Throwable th) {
                    if (i7 != 1 && this.f22081d.e() != -1) {
                        this.f22084g.f22873a = this.f22081d.e();
                    }
                    n2.o.a(this.f22080c);
                    throw th;
                }
            }
        }

        @Override // t1.p.a
        public void b(o2.a0 a0Var) {
            long max = !this.f22090m ? this.f22087j : Math.max(k0.this.N(true), this.f22087j);
            int a7 = a0Var.a();
            w0.e0 e0Var = (w0.e0) o2.a.e(this.f22089l);
            e0Var.d(a0Var, a7);
            e0Var.b(max, 1, a7, 0, null);
            this.f22090m = true;
        }

        @Override // n2.h0.e
        public void c() {
            this.f22085h = true;
        }
    }

    interface b {
        void s(long j7, boolean z6, boolean z7);
    }

    private final class c implements q0 {

        /* renamed from: f, reason: collision with root package name */
        private final int f22092f;

        public c(int i7) {
            this.f22092f = i7;
        }

        @Override // t1.q0
        public void b() {
            k0.this.Y(this.f22092f);
        }

        @Override // t1.q0
        public int d(long j7) {
            return k0.this.i0(this.f22092f, j7);
        }

        @Override // t1.q0
        public boolean i() {
            return k0.this.Q(this.f22092f);
        }

        @Override // t1.q0
        public int j(t1 t1Var, u0.g gVar, int i7) {
            return k0.this.e0(this.f22092f, t1Var, gVar, i7);
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f22094a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f22095b;

        public d(int i7, boolean z6) {
            this.f22094a = i7;
            this.f22095b = z6;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22094a == dVar.f22094a && this.f22095b == dVar.f22095b;
        }

        public int hashCode() {
            return (this.f22094a * 31) + (this.f22095b ? 1 : 0);
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final z0 f22096a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f22097b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f22098c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f22099d;

        public e(z0 z0Var, boolean[] zArr) {
            this.f22096a = z0Var;
            this.f22097b = zArr;
            int i7 = z0Var.f22275f;
            this.f22098c = new boolean[i7];
            this.f22099d = new boolean[i7];
        }
    }

    public k0(Uri uri, n2.l lVar, f0 f0Var, v0.y yVar, w.a aVar, n2.g0 g0Var, e0.a aVar2, b bVar, n2.b bVar2, String str, int i7) {
        this.f22057f = uri;
        this.f22058g = lVar;
        this.f22059h = yVar;
        this.f22062k = aVar;
        this.f22060i = g0Var;
        this.f22061j = aVar2;
        this.f22063l = bVar;
        this.f22064m = bVar2;
        this.f22065n = str;
        this.f22066o = i7;
        this.f22068q = f0Var;
    }

    private void J() {
        o2.a.f(this.A);
        o2.a.e(this.C);
        o2.a.e(this.D);
    }

    private boolean K(a aVar, int i7) {
        w0.b0 b0Var;
        if (this.K || !((b0Var = this.D) == null || b0Var.j() == -9223372036854775807L)) {
            this.O = i7;
            return true;
        }
        if (this.A && !k0()) {
            this.N = true;
            return false;
        }
        this.I = this.A;
        this.L = 0L;
        this.O = 0;
        for (p0 p0Var : this.f22075x) {
            p0Var.V();
        }
        aVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> L() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int M() {
        int i7 = 0;
        for (p0 p0Var : this.f22075x) {
            i7 += p0Var.G();
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long N(boolean z6) {
        long j7 = Long.MIN_VALUE;
        for (int i7 = 0; i7 < this.f22075x.length; i7++) {
            if (z6 || ((e) o2.a.e(this.C)).f22098c[i7]) {
                j7 = Math.max(j7, this.f22075x[i7].z());
            }
        }
        return j7;
    }

    private boolean P() {
        return this.M != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        if (this.Q) {
            return;
        }
        ((u.a) o2.a.e(this.f22073v)).l(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.K = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.Q || this.A || !this.f22077z || this.D == null) {
            return;
        }
        for (p0 p0Var : this.f22075x) {
            if (p0Var.F() == null) {
                return;
            }
        }
        this.f22069r.c();
        int length = this.f22075x.length;
        x0[] x0VarArr = new x0[length];
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            s1 s1Var = (s1) o2.a.e(this.f22075x[i7].F());
            String str = s1Var.f20956q;
            boolean o7 = o2.v.o(str);
            boolean z6 = o7 || o2.v.s(str);
            zArr[i7] = z6;
            this.B = z6 | this.B;
            n1.b bVar = this.f22074w;
            if (bVar != null) {
                if (o7 || this.f22076y[i7].f22095b) {
                    j1.a aVar = s1Var.f20954o;
                    s1Var = s1Var.b().X(aVar == null ? new j1.a(bVar) : aVar.a(bVar)).E();
                }
                if (o7 && s1Var.f20950k == -1 && s1Var.f20951l == -1 && bVar.f19379f != -1) {
                    s1Var = s1Var.b().G(bVar.f19379f).E();
                }
            }
            x0VarArr[i7] = new x0(Integer.toString(i7), s1Var.c(this.f22059h.e(s1Var)));
        }
        this.C = new e(new z0(x0VarArr), zArr);
        this.A = true;
        ((u.a) o2.a.e(this.f22073v)).i(this);
    }

    private void V(int i7) {
        J();
        e eVar = this.C;
        boolean[] zArr = eVar.f22099d;
        if (zArr[i7]) {
            return;
        }
        s1 b7 = eVar.f22096a.b(i7).b(0);
        this.f22061j.i(o2.v.k(b7.f20956q), b7, 0, null, this.L);
        zArr[i7] = true;
    }

    private void W(int i7) {
        J();
        boolean[] zArr = this.C.f22097b;
        if (this.N && zArr[i7]) {
            if (this.f22075x[i7].K(false)) {
                return;
            }
            this.M = 0L;
            this.N = false;
            this.I = true;
            this.L = 0L;
            this.O = 0;
            for (p0 p0Var : this.f22075x) {
                p0Var.V();
            }
            ((u.a) o2.a.e(this.f22073v)).l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.f22072u.post(new Runnable() { // from class: t1.h0
            @Override // java.lang.Runnable
            public final void run() {
                k0.this.S();
            }
        });
    }

    private w0.e0 d0(d dVar) {
        int length = this.f22075x.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (dVar.equals(this.f22076y[i7])) {
                return this.f22075x[i7];
            }
        }
        p0 k7 = p0.k(this.f22064m, this.f22059h, this.f22062k);
        k7.d0(this);
        int i8 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f22076y, i8);
        dVarArr[length] = dVar;
        this.f22076y = (d[]) o2.m0.k(dVarArr);
        p0[] p0VarArr = (p0[]) Arrays.copyOf(this.f22075x, i8);
        p0VarArr[length] = k7;
        this.f22075x = (p0[]) o2.m0.k(p0VarArr);
        return k7;
    }

    private boolean g0(boolean[] zArr, long j7) {
        int length = this.f22075x.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (!this.f22075x[i7].Z(j7, false) && (zArr[i7] || !this.B)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void T(w0.b0 b0Var) {
        this.D = this.f22074w == null ? b0Var : new b0.b(-9223372036854775807L);
        this.E = b0Var.j();
        boolean z6 = !this.K && b0Var.j() == -9223372036854775807L;
        this.F = z6;
        this.G = z6 ? 7 : 1;
        this.f22063l.s(this.E, b0Var.g(), this.F);
        if (this.A) {
            return;
        }
        U();
    }

    private void j0() {
        a aVar = new a(this.f22057f, this.f22058g, this.f22068q, this, this.f22069r);
        if (this.A) {
            o2.a.f(P());
            long j7 = this.E;
            if (j7 != -9223372036854775807L && this.M > j7) {
                this.P = true;
                this.M = -9223372036854775807L;
                return;
            }
            aVar.j(((w0.b0) o2.a.e(this.D)).i(this.M).f22874a.f22880b, this.M);
            for (p0 p0Var : this.f22075x) {
                p0Var.b0(this.M);
            }
            this.M = -9223372036854775807L;
        }
        this.O = M();
        this.f22061j.A(new q(aVar.f22078a, aVar.f22088k, this.f22067p.n(aVar, this, this.f22060i.d(this.G))), 1, -1, null, 0, null, aVar.f22087j, this.E);
    }

    private boolean k0() {
        return this.I || P();
    }

    w0.e0 O() {
        return d0(new d(0, true));
    }

    boolean Q(int i7) {
        return !k0() && this.f22075x[i7].K(this.P);
    }

    void X() {
        this.f22067p.k(this.f22060i.d(this.G));
    }

    void Y(int i7) {
        this.f22075x[i7].N();
        X();
    }

    @Override // t1.u, t1.r0
    public boolean a() {
        return this.f22067p.j() && this.f22069r.d();
    }

    @Override // n2.h0.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void m(a aVar, long j7, long j8, boolean z6) {
        n2.o0 o0Var = aVar.f22080c;
        q qVar = new q(aVar.f22078a, aVar.f22088k, o0Var.r(), o0Var.s(), j7, j8, o0Var.q());
        this.f22060i.a(aVar.f22078a);
        this.f22061j.r(qVar, 1, -1, null, 0, null, aVar.f22087j, this.E);
        if (z6) {
            return;
        }
        for (p0 p0Var : this.f22075x) {
            p0Var.V();
        }
        if (this.J > 0) {
            ((u.a) o2.a.e(this.f22073v)).l(this);
        }
    }

    @Override // t1.p0.d
    public void b(s1 s1Var) {
        this.f22072u.post(this.f22070s);
    }

    @Override // n2.h0.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void l(a aVar, long j7, long j8) {
        w0.b0 b0Var;
        if (this.E == -9223372036854775807L && (b0Var = this.D) != null) {
            boolean g7 = b0Var.g();
            long N = N(true);
            long j9 = N == Long.MIN_VALUE ? 0L : N + 10000;
            this.E = j9;
            this.f22063l.s(j9, g7, this.F);
        }
        n2.o0 o0Var = aVar.f22080c;
        q qVar = new q(aVar.f22078a, aVar.f22088k, o0Var.r(), o0Var.s(), j7, j8, o0Var.q());
        this.f22060i.a(aVar.f22078a);
        this.f22061j.u(qVar, 1, -1, null, 0, null, aVar.f22087j, this.E);
        this.P = true;
        ((u.a) o2.a.e(this.f22073v)).l(this);
    }

    @Override // t1.u, t1.r0
    public long c() {
        return e();
    }

    @Override // n2.h0.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public h0.c o(a aVar, long j7, long j8, IOException iOException, int i7) {
        boolean z6;
        a aVar2;
        h0.c h7;
        n2.o0 o0Var = aVar.f22080c;
        q qVar = new q(aVar.f22078a, aVar.f22088k, o0Var.r(), o0Var.s(), j7, j8, o0Var.q());
        long c7 = this.f22060i.c(new g0.c(qVar, new t(1, -1, null, 0, null, o2.m0.Y0(aVar.f22087j), o2.m0.Y0(this.E)), iOException, i7));
        if (c7 == -9223372036854775807L) {
            h7 = n2.h0.f19437g;
        } else {
            int M = M();
            if (M > this.O) {
                aVar2 = aVar;
                z6 = true;
            } else {
                z6 = false;
                aVar2 = aVar;
            }
            h7 = K(aVar2, M) ? n2.h0.h(z6, c7) : n2.h0.f19436f;
        }
        boolean z7 = !h7.c();
        this.f22061j.w(qVar, 1, -1, null, 0, null, aVar.f22087j, this.E, iOException, z7);
        if (z7) {
            this.f22060i.a(aVar.f22078a);
        }
        return h7;
    }

    @Override // w0.n
    public w0.e0 d(int i7, int i8) {
        return d0(new d(i7, false));
    }

    @Override // t1.u, t1.r0
    public long e() {
        long j7;
        J();
        if (this.P || this.J == 0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.M;
        }
        if (this.B) {
            int length = this.f22075x.length;
            j7 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                e eVar = this.C;
                if (eVar.f22097b[i7] && eVar.f22098c[i7] && !this.f22075x[i7].J()) {
                    j7 = Math.min(j7, this.f22075x[i7].z());
                }
            }
        } else {
            j7 = Long.MAX_VALUE;
        }
        if (j7 == Long.MAX_VALUE) {
            j7 = N(false);
        }
        return j7 == Long.MIN_VALUE ? this.L : j7;
    }

    int e0(int i7, t1 t1Var, u0.g gVar, int i8) {
        if (k0()) {
            return -3;
        }
        V(i7);
        int S2 = this.f22075x[i7].S(t1Var, gVar, i8, this.P);
        if (S2 == -3) {
            W(i7);
        }
        return S2;
    }

    @Override // t1.u
    public long f(long j7, j3 j3Var) {
        J();
        if (!this.D.g()) {
            return 0L;
        }
        b0.a i7 = this.D.i(j7);
        return j3Var.a(j7, i7.f22874a.f22879a, i7.f22875b.f22879a);
    }

    public void f0() {
        if (this.A) {
            for (p0 p0Var : this.f22075x) {
                p0Var.R();
            }
        }
        this.f22067p.m(this);
        this.f22072u.removeCallbacksAndMessages(null);
        this.f22073v = null;
        this.Q = true;
    }

    @Override // t1.u, t1.r0
    public boolean g(long j7) {
        if (this.P || this.f22067p.i() || this.N) {
            return false;
        }
        if (this.A && this.J == 0) {
            return false;
        }
        boolean e7 = this.f22069r.e();
        if (this.f22067p.j()) {
            return e7;
        }
        j0();
        return true;
    }

    @Override // t1.u, t1.r0
    public void h(long j7) {
    }

    @Override // w0.n
    public void i(final w0.b0 b0Var) {
        this.f22072u.post(new Runnable() { // from class: t1.j0
            @Override // java.lang.Runnable
            public final void run() {
                k0.this.T(b0Var);
            }
        });
    }

    int i0(int i7, long j7) {
        if (k0()) {
            return 0;
        }
        V(i7);
        p0 p0Var = this.f22075x[i7];
        int E = p0Var.E(j7, this.P);
        p0Var.e0(E);
        if (E == 0) {
            W(i7);
        }
        return E;
    }

    @Override // w0.n
    public void j() {
        this.f22077z = true;
        this.f22072u.post(this.f22070s);
    }

    @Override // n2.h0.f
    public void k() {
        for (p0 p0Var : this.f22075x) {
            p0Var.T();
        }
        this.f22068q.a();
    }

    @Override // t1.u
    public long n() {
        if (!this.I) {
            return -9223372036854775807L;
        }
        if (!this.P && M() <= this.O) {
            return -9223372036854775807L;
        }
        this.I = false;
        return this.L;
    }

    @Override // t1.u
    public z0 p() {
        J();
        return this.C.f22096a;
    }

    @Override // t1.u
    public void q(u.a aVar, long j7) {
        this.f22073v = aVar;
        this.f22069r.e();
        j0();
    }

    @Override // t1.u
    public long r(m2.t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7) {
        J();
        e eVar = this.C;
        z0 z0Var = eVar.f22096a;
        boolean[] zArr3 = eVar.f22098c;
        int i7 = this.J;
        int i8 = 0;
        for (int i9 = 0; i9 < tVarArr.length; i9++) {
            if (q0VarArr[i9] != null && (tVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((c) q0VarArr[i9]).f22092f;
                o2.a.f(zArr3[i10]);
                this.J--;
                zArr3[i10] = false;
                q0VarArr[i9] = null;
            }
        }
        boolean z6 = !this.H ? j7 == 0 : i7 != 0;
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            if (q0VarArr[i11] == null && tVarArr[i11] != null) {
                m2.t tVar = tVarArr[i11];
                o2.a.f(tVar.length() == 1);
                o2.a.f(tVar.b(0) == 0);
                int c7 = z0Var.c(tVar.c());
                o2.a.f(!zArr3[c7]);
                this.J++;
                zArr3[c7] = true;
                q0VarArr[i11] = new c(c7);
                zArr2[i11] = true;
                if (!z6) {
                    p0 p0Var = this.f22075x[c7];
                    z6 = (p0Var.Z(j7, true) || p0Var.C() == 0) ? false : true;
                }
            }
        }
        if (this.J == 0) {
            this.N = false;
            this.I = false;
            if (this.f22067p.j()) {
                p0[] p0VarArr = this.f22075x;
                int length = p0VarArr.length;
                while (i8 < length) {
                    p0VarArr[i8].r();
                    i8++;
                }
                this.f22067p.f();
            } else {
                p0[] p0VarArr2 = this.f22075x;
                int length2 = p0VarArr2.length;
                while (i8 < length2) {
                    p0VarArr2[i8].V();
                    i8++;
                }
            }
        } else if (z6) {
            j7 = u(j7);
            while (i8 < q0VarArr.length) {
                if (q0VarArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.H = true;
        return j7;
    }

    @Override // t1.u
    public void s() {
        X();
        if (this.P && !this.A) {
            throw n2.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // t1.u
    public void t(long j7, boolean z6) {
        J();
        if (P()) {
            return;
        }
        boolean[] zArr = this.C.f22098c;
        int length = this.f22075x.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f22075x[i7].q(j7, z6, zArr[i7]);
        }
    }

    @Override // t1.u
    public long u(long j7) {
        J();
        boolean[] zArr = this.C.f22097b;
        if (!this.D.g()) {
            j7 = 0;
        }
        int i7 = 0;
        this.I = false;
        this.L = j7;
        if (P()) {
            this.M = j7;
            return j7;
        }
        if (this.G != 7 && g0(zArr, j7)) {
            return j7;
        }
        this.N = false;
        this.M = j7;
        this.P = false;
        if (this.f22067p.j()) {
            p0[] p0VarArr = this.f22075x;
            int length = p0VarArr.length;
            while (i7 < length) {
                p0VarArr[i7].r();
                i7++;
            }
            this.f22067p.f();
        } else {
            this.f22067p.g();
            p0[] p0VarArr2 = this.f22075x;
            int length2 = p0VarArr2.length;
            while (i7 < length2) {
                p0VarArr2[i7].V();
                i7++;
            }
        }
        return j7;
    }
}
