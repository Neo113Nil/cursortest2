package s0;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import m4.r;
import o2.q;
import r0.a2;
import r0.f2;
import r0.r2;
import r0.r3;
import r0.u2;
import r0.v2;
import r0.w3;
import s0.c;
import t1.x;

/* loaded from: classes.dex */
public class p1 implements s0.a {

    /* renamed from: f, reason: collision with root package name */
    private final o2.d f21493f;

    /* renamed from: g, reason: collision with root package name */
    private final r3.b f21494g;

    /* renamed from: h, reason: collision with root package name */
    private final r3.d f21495h;

    /* renamed from: i, reason: collision with root package name */
    private final a f21496i;

    /* renamed from: j, reason: collision with root package name */
    private final SparseArray<c.a> f21497j;

    /* renamed from: k, reason: collision with root package name */
    private o2.q<c> f21498k;

    /* renamed from: l, reason: collision with root package name */
    private v2 f21499l;

    /* renamed from: m, reason: collision with root package name */
    private o2.n f21500m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f21501n;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final r3.b f21502a;

        /* renamed from: b, reason: collision with root package name */
        private m4.q<x.b> f21503b = m4.q.x();

        /* renamed from: c, reason: collision with root package name */
        private m4.r<x.b, r3> f21504c = m4.r.j();

        /* renamed from: d, reason: collision with root package name */
        private x.b f21505d;

        /* renamed from: e, reason: collision with root package name */
        private x.b f21506e;

        /* renamed from: f, reason: collision with root package name */
        private x.b f21507f;

        public a(r3.b bVar) {
            this.f21502a = bVar;
        }

        private void b(r.a<x.b, r3> aVar, x.b bVar, r3 r3Var) {
            if (bVar == null) {
                return;
            }
            if (r3Var.f(bVar.f22249a) == -1 && (r3Var = this.f21504c.get(bVar)) == null) {
                return;
            }
            aVar.d(bVar, r3Var);
        }

        private static x.b c(v2 v2Var, m4.q<x.b> qVar, x.b bVar, r3.b bVar2) {
            r3 I = v2Var.I();
            int y6 = v2Var.y();
            Object q7 = I.u() ? null : I.q(y6);
            int g7 = (v2Var.k() || I.u()) ? -1 : I.j(y6, bVar2).g(o2.m0.B0(v2Var.N()) - bVar2.q());
            for (int i7 = 0; i7 < qVar.size(); i7++) {
                x.b bVar3 = qVar.get(i7);
                if (i(bVar3, q7, v2Var.k(), v2Var.z(), v2Var.D(), g7)) {
                    return bVar3;
                }
            }
            if (qVar.isEmpty() && bVar != null) {
                if (i(bVar, q7, v2Var.k(), v2Var.z(), v2Var.D(), g7)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(x.b bVar, Object obj, boolean z6, int i7, int i8, int i9) {
            if (bVar.f22249a.equals(obj)) {
                return (z6 && bVar.f22250b == i7 && bVar.f22251c == i8) || (!z6 && bVar.f22250b == -1 && bVar.f22253e == i9);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
        
            b(r0, r3.f21505d, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            if (r3.f21503b.contains(r3.f21505d) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        
            if (l4.i.a(r3.f21505d, r3.f21507f) == false) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void m(r3 r3Var) {
            r.a<x.b, r3> a7 = m4.r.a();
            if (this.f21503b.isEmpty()) {
                b(a7, this.f21506e, r3Var);
                if (!l4.i.a(this.f21507f, this.f21506e)) {
                    b(a7, this.f21507f, r3Var);
                }
                if (!l4.i.a(this.f21505d, this.f21506e)) {
                }
            } else {
                for (int i7 = 0; i7 < this.f21503b.size(); i7++) {
                    b(a7, this.f21503b.get(i7), r3Var);
                }
            }
            this.f21504c = a7.b();
        }

        public x.b d() {
            return this.f21505d;
        }

        public x.b e() {
            if (this.f21503b.isEmpty()) {
                return null;
            }
            return (x.b) m4.t.c(this.f21503b);
        }

        public r3 f(x.b bVar) {
            return this.f21504c.get(bVar);
        }

        public x.b g() {
            return this.f21506e;
        }

        public x.b h() {
            return this.f21507f;
        }

        public void j(v2 v2Var) {
            this.f21505d = c(v2Var, this.f21503b, this.f21506e, this.f21502a);
        }

        public void k(List<x.b> list, x.b bVar, v2 v2Var) {
            this.f21503b = m4.q.t(list);
            if (!list.isEmpty()) {
                this.f21506e = list.get(0);
                this.f21507f = (x.b) o2.a.e(bVar);
            }
            if (this.f21505d == null) {
                this.f21505d = c(v2Var, this.f21503b, this.f21506e, this.f21502a);
            }
            m(v2Var.I());
        }

        public void l(v2 v2Var) {
            this.f21505d = c(v2Var, this.f21503b, this.f21506e, this.f21502a);
            m(v2Var.I());
        }
    }

    public p1(o2.d dVar) {
        this.f21493f = (o2.d) o2.a.e(dVar);
        this.f21498k = new o2.q<>(o2.m0.Q(), dVar, new q.b() { // from class: s0.k1
            @Override // o2.q.b
            public final void a(Object obj, o2.l lVar) {
                p1.L1((c) obj, lVar);
            }
        });
        r3.b bVar = new r3.b();
        this.f21494g = bVar;
        this.f21495h = new r3.d();
        this.f21496i = new a(bVar);
        this.f21497j = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B2(c.a aVar, int i7, v2.e eVar, v2.e eVar2, c cVar) {
        cVar.z(aVar, i7);
        cVar.Y(aVar, eVar, eVar2, i7);
    }

    private c.a F1(x.b bVar) {
        o2.a.e(this.f21499l);
        r3 f7 = bVar == null ? null : this.f21496i.f(bVar);
        if (bVar != null && f7 != null) {
            return E1(f7, f7.l(bVar.f22249a, this.f21494g).f20914h, bVar);
        }
        int A = this.f21499l.A();
        r3 I = this.f21499l.I();
        if (!(A < I.t())) {
            I = r3.f20909f;
        }
        return E1(I, A, null);
    }

    private c.a G1() {
        return F1(this.f21496i.e());
    }

    private c.a H1(int i7, x.b bVar) {
        o2.a.e(this.f21499l);
        if (bVar != null) {
            return this.f21496i.f(bVar) != null ? F1(bVar) : E1(r3.f20909f, i7, bVar);
        }
        r3 I = this.f21499l.I();
        if (!(i7 < I.t())) {
            I = r3.f20909f;
        }
        return E1(I, i7, null);
    }

    private c.a I1() {
        return F1(this.f21496i.g());
    }

    private c.a J1() {
        return F1(this.f21496i.h());
    }

    private c.a K1(r2 r2Var) {
        t1.v vVar;
        return (!(r2Var instanceof r0.r) || (vVar = ((r0.r) r2Var).f20902n) == null) ? D1() : F1(new x.b(vVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L1(c cVar, o2.l lVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M2(c.a aVar, String str, long j7, long j8, c cVar) {
        cVar.j0(aVar, str, j7);
        cVar.w(aVar, str, j8, j7);
        cVar.y(aVar, 2, str, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O2(c.a aVar, u0.e eVar, c cVar) {
        cVar.b0(aVar, eVar);
        cVar.P(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P1(c.a aVar, String str, long j7, long j8, c cVar) {
        cVar.o0(aVar, str, j7);
        cVar.n0(aVar, str, j8, j7);
        cVar.y(aVar, 1, str, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P2(c.a aVar, u0.e eVar, c cVar) {
        cVar.s0(aVar, eVar);
        cVar.W(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R1(c.a aVar, u0.e eVar, c cVar) {
        cVar.f0(aVar, eVar);
        cVar.P(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R2(c.a aVar, r0.s1 s1Var, u0.i iVar, c cVar) {
        cVar.w0(aVar, s1Var);
        cVar.E(aVar, s1Var, iVar);
        cVar.a(aVar, 2, s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S1(c.a aVar, u0.e eVar, c cVar) {
        cVar.s(aVar, eVar);
        cVar.W(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S2(c.a aVar, p2.z zVar, c cVar) {
        cVar.e0(aVar, zVar);
        cVar.p(aVar, zVar.f20106f, zVar.f20107g, zVar.f20108h, zVar.f20109i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T1(c.a aVar, r0.s1 s1Var, u0.i iVar, c cVar) {
        cVar.p0(aVar, s1Var);
        cVar.i(aVar, s1Var, iVar);
        cVar.a(aVar, 1, s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V2(v2 v2Var, c cVar, o2.l lVar) {
        cVar.Z(v2Var, new c.b(lVar, this.f21497j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W2() {
        final c.a D1 = D1();
        X2(D1, 1028, new q.a() { // from class: s0.z
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).t(c.a.this);
            }
        });
        this.f21498k.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h2(c.a aVar, int i7, c cVar) {
        cVar.a0(aVar);
        cVar.g0(aVar, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l2(c.a aVar, boolean z6, c cVar) {
        cVar.h(aVar, z6);
        cVar.x(aVar, z6);
    }

    @Override // r0.v2.d
    public final void A(final boolean z6, final int i7) {
        final c.a D1 = D1();
        X2(D1, -1, new q.a() { // from class: s0.i1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).T(c.a.this, z6, i7);
            }
        });
    }

    @Override // r0.v2.d
    public void B(final w3 w3Var) {
        final c.a D1 = D1();
        X2(D1, 2, new q.a() { // from class: s0.p0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).f(c.a.this, w3Var);
            }
        });
    }

    @Override // t1.e0
    public final void C(int i7, x.b bVar, final t1.q qVar, final t1.t tVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1002, new q.a() { // from class: s0.s0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).k(c.a.this, qVar, tVar);
            }
        });
    }

    @Override // s0.a
    public void D(c cVar) {
        o2.a.e(cVar);
        this.f21498k.c(cVar);
    }

    protected final c.a D1() {
        return F1(this.f21496i.d());
    }

    @Override // r0.v2.d
    public void E(boolean z6) {
    }

    protected final c.a E1(r3 r3Var, int i7, x.b bVar) {
        long l7;
        x.b bVar2 = r3Var.u() ? null : bVar;
        long a7 = this.f21493f.a();
        boolean z6 = r3Var.equals(this.f21499l.I()) && i7 == this.f21499l.A();
        long j7 = 0;
        if (bVar2 != null && bVar2.b()) {
            if (z6 && this.f21499l.z() == bVar2.f22250b && this.f21499l.D() == bVar2.f22251c) {
                j7 = this.f21499l.N();
            }
        } else {
            if (z6) {
                l7 = this.f21499l.l();
                return new c.a(a7, r3Var, i7, bVar2, l7, this.f21499l.I(), this.f21499l.A(), this.f21496i.d(), this.f21499l.N(), this.f21499l.m());
            }
            if (!r3Var.u()) {
                j7 = r3Var.r(i7, this.f21495h).d();
            }
        }
        l7 = j7;
        return new c.a(a7, r3Var, i7, bVar2, l7, this.f21499l.I(), this.f21499l.A(), this.f21496i.d(), this.f21499l.N(), this.f21499l.m());
    }

    @Override // r0.v2.d
    public void F(int i7) {
    }

    @Override // r0.v2.d
    public void G(v2 v2Var, v2.c cVar) {
    }

    @Override // r0.v2.d
    public final void H(final v2.e eVar, final v2.e eVar2, final int i7) {
        if (i7 == 1) {
            this.f21501n = false;
        }
        this.f21496i.j((v2) o2.a.e(this.f21499l));
        final c.a D1 = D1();
        X2(D1, 11, new q.a() { // from class: s0.m
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.B2(c.a.this, i7, eVar, eVar2, (c) obj);
            }
        });
    }

    @Override // t1.e0
    public final void I(int i7, x.b bVar, final t1.q qVar, final t1.t tVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1001, new q.a() { // from class: s0.r0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).B(c.a.this, qVar, tVar);
            }
        });
    }

    @Override // t1.e0
    public final void J(int i7, x.b bVar, final t1.t tVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1005, new q.a() { // from class: s0.x0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).m(c.a.this, tVar);
            }
        });
    }

    @Override // r0.v2.d
    public final void K(final boolean z6) {
        final c.a D1 = D1();
        X2(D1, 3, new q.a() { // from class: s0.f1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.l2(c.a.this, z6, (c) obj);
            }
        });
    }

    @Override // r0.v2.d
    public void L() {
    }

    @Override // r0.v2.d
    public final void M() {
        final c.a D1 = D1();
        X2(D1, -1, new q.a() { // from class: s0.v0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).l(c.a.this);
            }
        });
    }

    @Override // v0.w
    public final void N(int i7, x.b bVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1026, new q.a() { // from class: s0.g1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).t0(c.a.this);
            }
        });
    }

    @Override // t1.e0
    public final void O(int i7, x.b bVar, final t1.t tVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1004, new q.a() { // from class: s0.w0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).q(c.a.this, tVar);
            }
        });
    }

    @Override // s0.a
    public void P(final v2 v2Var, Looper looper) {
        o2.a.f(this.f21499l == null || this.f21496i.f21503b.isEmpty());
        this.f21499l = (v2) o2.a.e(v2Var);
        this.f21500m = this.f21493f.c(looper, null);
        this.f21498k = this.f21498k.e(looper, new q.b() { // from class: s0.j1
            @Override // o2.q.b
            public final void a(Object obj, o2.l lVar) {
                p1.this.V2(v2Var, (c) obj, lVar);
            }
        });
    }

    @Override // t1.e0
    public final void Q(int i7, x.b bVar, final t1.q qVar, final t1.t tVar, final IOException iOException, final boolean z6) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1003, new q.a() { // from class: s0.u0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).I(c.a.this, qVar, tVar, iOException, z6);
            }
        });
    }

    @Override // r0.v2.d
    public final void R(final float f7) {
        final c.a J1 = J1();
        X2(J1, 22, new q.a() { // from class: s0.n1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).J(c.a.this, f7);
            }
        });
    }

    @Override // v0.w
    public final void S(int i7, x.b bVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1023, new q.a() { // from class: s0.k0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).b(c.a.this);
            }
        });
    }

    @Override // r0.v2.d
    public void T(final v2.b bVar) {
        final c.a D1 = D1();
        X2(D1, 13, new q.a() { // from class: s0.o0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).G(c.a.this, bVar);
            }
        });
    }

    @Override // v0.w
    public /* synthetic */ void U(int i7, x.b bVar) {
        v0.p.a(this, i7, bVar);
    }

    @Override // r0.v2.d
    public final void V(final int i7) {
        final c.a D1 = D1();
        X2(D1, 4, new q.a() { // from class: s0.f
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).K(c.a.this, i7);
            }
        });
    }

    @Override // r0.v2.d
    public final void W(final boolean z6, final int i7) {
        final c.a D1 = D1();
        X2(D1, 5, new q.a() { // from class: s0.h1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).c(c.a.this, z6, i7);
            }
        });
    }

    @Override // t1.e0
    public final void X(int i7, x.b bVar, final t1.q qVar, final t1.t tVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1000, new q.a() { // from class: s0.t0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).S(c.a.this, qVar, tVar);
            }
        });
    }

    protected final void X2(c.a aVar, int i7, q.a<c> aVar2) {
        this.f21497j.put(i7, aVar);
        this.f21498k.k(i7, aVar2);
    }

    @Override // n2.f.a
    public final void Y(final int i7, final long j7, final long j8) {
        final c.a G1 = G1();
        X2(G1, 1006, new q.a() { // from class: s0.k
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).r0(c.a.this, i7, j7, j8);
            }
        });
    }

    @Override // s0.a
    public final void Z() {
        if (this.f21501n) {
            return;
        }
        final c.a D1 = D1();
        this.f21501n = true;
        X2(D1, -1, new q.a() { // from class: s0.m1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).g(c.a.this);
            }
        });
    }

    @Override // s0.a
    public void a() {
        ((o2.n) o2.a.h(this.f21500m)).j(new Runnable() { // from class: s0.d
            @Override // java.lang.Runnable
            public final void run() {
                p1.this.W2();
            }
        });
    }

    @Override // r0.v2.d
    public final void a0(final boolean z6) {
        final c.a D1 = D1();
        X2(D1, 9, new q.a() { // from class: s0.d1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).M(c.a.this, z6);
            }
        });
    }

    @Override // r0.v2.d
    public final void b(final boolean z6) {
        final c.a J1 = J1();
        X2(J1, 23, new q.a() { // from class: s0.e1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).D(c.a.this, z6);
            }
        });
    }

    @Override // r0.v2.d
    public final void b0(r3 r3Var, final int i7) {
        this.f21496i.l((v2) o2.a.e(this.f21499l));
        final c.a D1 = D1();
        X2(D1, 0, new q.a() { // from class: s0.h
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).j(c.a.this, i7);
            }
        });
    }

    @Override // s0.a
    public final void c(final Exception exc) {
        final c.a J1 = J1();
        X2(J1, 1014, new q.a() { // from class: s0.v
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).V(c.a.this, exc);
            }
        });
    }

    @Override // r0.v2.d
    public final void c0(final int i7, final int i8) {
        final c.a J1 = J1();
        X2(J1, 24, new q.a() { // from class: s0.i
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).o(c.a.this, i7, i8);
            }
        });
    }

    @Override // s0.a
    public final void d(final String str) {
        final c.a J1 = J1();
        X2(J1, 1019, new q.a() { // from class: s0.y
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).n(c.a.this, str);
            }
        });
    }

    @Override // v0.w
    public final void d0(int i7, x.b bVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1027, new q.a() { // from class: s0.o
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).F(c.a.this);
            }
        });
    }

    @Override // s0.a
    public final void e(final r0.s1 s1Var, final u0.i iVar) {
        final c.a J1 = J1();
        X2(J1, 1017, new q.a() { // from class: s0.g0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.R2(c.a.this, s1Var, iVar, (c) obj);
            }
        });
    }

    @Override // r0.v2.d
    public void e0(final f2 f2Var) {
        final c.a D1 = D1();
        X2(D1, 14, new q.a() { // from class: s0.j0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).m0(c.a.this, f2Var);
            }
        });
    }

    @Override // s0.a
    public final void f(final Object obj, final long j7) {
        final c.a J1 = J1();
        X2(J1, 26, new q.a() { // from class: s0.x
            @Override // o2.q.a
            public final void invoke(Object obj2) {
                ((c) obj2).z0(c.a.this, obj, j7);
            }
        });
    }

    @Override // r0.v2.d
    public final void f0(final t0.e eVar) {
        final c.a J1 = J1();
        X2(J1, 20, new q.a() { // from class: s0.q0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).l0(c.a.this, eVar);
            }
        });
    }

    @Override // s0.a
    public final void g(final String str, final long j7, final long j8) {
        final c.a J1 = J1();
        X2(J1, 1016, new q.a() { // from class: s0.c0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.M2(c.a.this, str, j8, j7, (c) obj);
            }
        });
    }

    @Override // v0.w
    public final void g0(int i7, x.b bVar) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1025, new q.a() { // from class: s0.l1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).d0(c.a.this);
            }
        });
    }

    @Override // s0.a
    public final void h(final u0.e eVar) {
        final c.a J1 = J1();
        X2(J1, 1007, new q.a() { // from class: s0.a1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.S1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // v0.w
    public final void h0(int i7, x.b bVar, final Exception exc) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1024, new q.a() { // from class: s0.w
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).O(c.a.this, exc);
            }
        });
    }

    @Override // r0.v2.d
    public void i(final List<c2.b> list) {
        final c.a D1 = D1();
        X2(D1, 27, new q.a() { // from class: s0.d0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).C(c.a.this, list);
            }
        });
    }

    @Override // r0.v2.d
    public final void i0(final r2 r2Var) {
        final c.a K1 = K1(r2Var);
        X2(K1, 10, new q.a() { // from class: s0.l0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).h0(c.a.this, r2Var);
            }
        });
    }

    @Override // r0.v2.d
    public final void j(final u2 u2Var) {
        final c.a D1 = D1();
        X2(D1, 12, new q.a() { // from class: s0.n0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).U(c.a.this, u2Var);
            }
        });
    }

    @Override // r0.v2.d
    public void j0(final r0.p pVar) {
        final c.a D1 = D1();
        X2(D1, 29, new q.a() { // from class: s0.f0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).v0(c.a.this, pVar);
            }
        });
    }

    @Override // s0.a
    public final void k(final long j7) {
        final c.a J1 = J1();
        X2(J1, 1010, new q.a() { // from class: s0.p
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).L(c.a.this, j7);
            }
        });
    }

    @Override // s0.a
    public final void k0(List<x.b> list, x.b bVar) {
        this.f21496i.k(list, bVar, (v2) o2.a.e(this.f21499l));
    }

    @Override // s0.a
    public final void l(final Exception exc) {
        final c.a J1 = J1();
        X2(J1, 1029, new q.a() { // from class: s0.t
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).H(c.a.this, exc);
            }
        });
    }

    @Override // r0.v2.d
    public void l0(final r2 r2Var) {
        final c.a K1 = K1(r2Var);
        X2(K1, 10, new q.a() { // from class: s0.m0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).u0(c.a.this, r2Var);
            }
        });
    }

    @Override // s0.a
    public final void m(final r0.s1 s1Var, final u0.i iVar) {
        final c.a J1 = J1();
        X2(J1, 1009, new q.a() { // from class: s0.h0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.T1(c.a.this, s1Var, iVar, (c) obj);
            }
        });
    }

    @Override // r0.v2.d
    public void m0(final int i7, final boolean z6) {
        final c.a D1 = D1();
        X2(D1, 30, new q.a() { // from class: s0.n
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).e(c.a.this, i7, z6);
            }
        });
    }

    @Override // s0.a
    public final void n(final Exception exc) {
        final c.a J1 = J1();
        X2(J1, 1030, new q.a() { // from class: s0.u
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).N(c.a.this, exc);
            }
        });
    }

    @Override // r0.v2.d
    public final void n0(final int i7) {
        final c.a D1 = D1();
        X2(D1, 8, new q.a() { // from class: s0.o1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).v(c.a.this, i7);
            }
        });
    }

    @Override // s0.a
    public final void o(final u0.e eVar) {
        final c.a I1 = I1();
        X2(I1, 1020, new q.a() { // from class: s0.y0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.O2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // r0.v2.d
    public final void o0(final a2 a2Var, final int i7) {
        final c.a D1 = D1();
        X2(D1, 1, new q.a() { // from class: s0.i0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).Q(c.a.this, a2Var, i7);
            }
        });
    }

    @Override // s0.a
    public final void p(final String str) {
        final c.a J1 = J1();
        X2(J1, 1012, new q.a() { // from class: s0.a0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).X(c.a.this, str);
            }
        });
    }

    @Override // r0.v2.d
    public void p0(final boolean z6) {
        final c.a D1 = D1();
        X2(D1, 7, new q.a() { // from class: s0.c1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).x0(c.a.this, z6);
            }
        });
    }

    @Override // s0.a
    public final void q(final String str, final long j7, final long j8) {
        final c.a J1 = J1();
        X2(J1, 1008, new q.a() { // from class: s0.b0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.P1(c.a.this, str, j8, j7, (c) obj);
            }
        });
    }

    @Override // v0.w
    public final void q0(int i7, x.b bVar, final int i8) {
        final c.a H1 = H1(i7, bVar);
        X2(H1, 1022, new q.a() { // from class: s0.e
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.h2(c.a.this, i8, (c) obj);
            }
        });
    }

    @Override // r0.v2.d
    public final void r(final p2.z zVar) {
        final c.a J1 = J1();
        X2(J1, 25, new q.a() { // from class: s0.e0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.S2(c.a.this, zVar, (c) obj);
            }
        });
    }

    @Override // r0.v2.d
    public void s(final c2.e eVar) {
        final c.a D1 = D1();
        X2(D1, 27, new q.a() { // from class: s0.r
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).c0(c.a.this, eVar);
            }
        });
    }

    @Override // s0.a
    public final void t(final u0.e eVar) {
        final c.a I1 = I1();
        X2(I1, 1013, new q.a() { // from class: s0.z0
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.R1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // r0.v2.d
    public final void u(final j1.a aVar) {
        final c.a D1 = D1();
        X2(D1, 28, new q.a() { // from class: s0.s
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).i0(c.a.this, aVar);
            }
        });
    }

    @Override // s0.a
    public final void v(final u0.e eVar) {
        final c.a J1 = J1();
        X2(J1, 1015, new q.a() { // from class: s0.b1
            @Override // o2.q.a
            public final void invoke(Object obj) {
                p1.P2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // s0.a
    public final void w(final int i7, final long j7, final long j8) {
        final c.a J1 = J1();
        X2(J1, 1011, new q.a() { // from class: s0.l
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).R(c.a.this, i7, j7, j8);
            }
        });
    }

    @Override // s0.a
    public final void x(final int i7, final long j7) {
        final c.a I1 = I1();
        X2(I1, 1018, new q.a() { // from class: s0.j
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).y0(c.a.this, i7, j7);
            }
        });
    }

    @Override // s0.a
    public final void y(final long j7, final int i7) {
        final c.a I1 = I1();
        X2(I1, 1021, new q.a() { // from class: s0.q
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).A(c.a.this, j7, i7);
            }
        });
    }

    @Override // r0.v2.d
    public final void z(final int i7) {
        final c.a D1 = D1();
        X2(D1, 6, new q.a() { // from class: s0.g
            @Override // o2.q.a
            public final void invoke(Object obj) {
                ((c) obj).d(c.a.this, i7);
            }
        });
    }
}
