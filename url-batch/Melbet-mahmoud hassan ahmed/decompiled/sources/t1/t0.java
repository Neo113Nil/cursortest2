package t1;

import android.net.Uri;
import java.util.ArrayList;
import r0.a2;
import r0.j3;
import r0.s1;
import r0.t1;
import t1.u;
import t1.x;

/* loaded from: classes.dex */
public final class t0 extends t1.a {

    /* renamed from: o, reason: collision with root package name */
    private static final s1 f22221o;

    /* renamed from: p, reason: collision with root package name */
    private static final a2 f22222p;

    /* renamed from: q, reason: collision with root package name */
    private static final byte[] f22223q;

    /* renamed from: m, reason: collision with root package name */
    private final long f22224m;

    /* renamed from: n, reason: collision with root package name */
    private final a2 f22225n;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f22226a;

        /* renamed from: b, reason: collision with root package name */
        private Object f22227b;

        public t0 a() {
            o2.a.f(this.f22226a > 0);
            return new t0(this.f22226a, t0.f22222p.b().e(this.f22227b).a());
        }

        public b b(long j7) {
            this.f22226a = j7;
            return this;
        }

        public b c(Object obj) {
            this.f22227b = obj;
            return this;
        }
    }

    private static final class c implements u {

        /* renamed from: h, reason: collision with root package name */
        private static final z0 f22228h = new z0(new x0(t0.f22221o));

        /* renamed from: f, reason: collision with root package name */
        private final long f22229f;

        /* renamed from: g, reason: collision with root package name */
        private final ArrayList<q0> f22230g = new ArrayList<>();

        public c(long j7) {
            this.f22229f = j7;
        }

        private long b(long j7) {
            return o2.m0.r(j7, 0L, this.f22229f);
        }

        @Override // t1.u, t1.r0
        public boolean a() {
            return false;
        }

        @Override // t1.u, t1.r0
        public long c() {
            return Long.MIN_VALUE;
        }

        @Override // t1.u, t1.r0
        public long e() {
            return Long.MIN_VALUE;
        }

        @Override // t1.u
        public long f(long j7, j3 j3Var) {
            return b(j7);
        }

        @Override // t1.u, t1.r0
        public boolean g(long j7) {
            return false;
        }

        @Override // t1.u, t1.r0
        public void h(long j7) {
        }

        @Override // t1.u
        public long n() {
            return -9223372036854775807L;
        }

        @Override // t1.u
        public z0 p() {
            return f22228h;
        }

        @Override // t1.u
        public void q(u.a aVar, long j7) {
            aVar.i(this);
        }

        @Override // t1.u
        public long r(m2.t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7) {
            long b7 = b(j7);
            for (int i7 = 0; i7 < tVarArr.length; i7++) {
                if (q0VarArr[i7] != null && (tVarArr[i7] == null || !zArr[i7])) {
                    this.f22230g.remove(q0VarArr[i7]);
                    q0VarArr[i7] = null;
                }
                if (q0VarArr[i7] == null && tVarArr[i7] != null) {
                    d dVar = new d(this.f22229f);
                    dVar.a(b7);
                    this.f22230g.add(dVar);
                    q0VarArr[i7] = dVar;
                    zArr2[i7] = true;
                }
            }
            return b7;
        }

        @Override // t1.u
        public void s() {
        }

        @Override // t1.u
        public void t(long j7, boolean z6) {
        }

        @Override // t1.u
        public long u(long j7) {
            long b7 = b(j7);
            for (int i7 = 0; i7 < this.f22230g.size(); i7++) {
                ((d) this.f22230g.get(i7)).a(b7);
            }
            return b7;
        }
    }

    private static final class d implements q0 {

        /* renamed from: f, reason: collision with root package name */
        private final long f22231f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f22232g;

        /* renamed from: h, reason: collision with root package name */
        private long f22233h;

        public d(long j7) {
            this.f22231f = t0.K(j7);
            a(0L);
        }

        public void a(long j7) {
            this.f22233h = o2.m0.r(t0.K(j7), 0L, this.f22231f);
        }

        @Override // t1.q0
        public void b() {
        }

        @Override // t1.q0
        public int d(long j7) {
            long j8 = this.f22233h;
            a(j7);
            return (int) ((this.f22233h - j8) / t0.f22223q.length);
        }

        @Override // t1.q0
        public boolean i() {
            return true;
        }

        @Override // t1.q0
        public int j(t1 t1Var, u0.g gVar, int i7) {
            if (!this.f22232g || (i7 & 2) != 0) {
                t1Var.f21040b = t0.f22221o;
                this.f22232g = true;
                return -5;
            }
            long j7 = this.f22231f;
            long j8 = this.f22233h;
            long j9 = j7 - j8;
            if (j9 == 0) {
                gVar.g(4);
                return -4;
            }
            gVar.f22413j = t0.L(j8);
            gVar.g(1);
            int min = (int) Math.min(t0.f22223q.length, j9);
            if ((i7 & 4) == 0) {
                gVar.r(min);
                gVar.f22411h.put(t0.f22223q, 0, min);
            }
            if ((i7 & 1) == 0) {
                this.f22233h += min;
            }
            return -4;
        }
    }

    static {
        s1 E = new s1.b().e0("audio/raw").H(2).f0(44100).Y(2).E();
        f22221o = E;
        f22222p = new a2.c().c("SilenceMediaSource").f(Uri.EMPTY).d(E.f20956q).a();
        f22223q = new byte[o2.m0.d0(2, 2) * 1024];
    }

    private t0(long j7, a2 a2Var) {
        o2.a.a(j7 >= 0);
        this.f22224m = j7;
        this.f22225n = a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long K(long j7) {
        return o2.m0.d0(2, 2) * ((j7 * 44100) / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long L(long j7) {
        return ((j7 / o2.m0.d0(2, 2)) * 1000000) / 44100;
    }

    @Override // t1.a
    protected void C(n2.p0 p0Var) {
        D(new u0(this.f22224m, true, false, false, null, this.f22225n));
    }

    @Override // t1.a
    protected void E() {
    }

    @Override // t1.x
    public a2 a() {
        return this.f22225n;
    }

    @Override // t1.x
    public void c() {
    }

    @Override // t1.x
    public void e(u uVar) {
    }

    @Override // t1.x
    public u j(x.b bVar, n2.b bVar2, long j7) {
        return new c(this.f22224m);
    }
}
