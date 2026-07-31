package r0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import j1.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.c0;
import m4.q;
import r0.a2;
import r0.e3;
import r0.m;
import r0.m2;
import r0.r3;
import r0.z2;
import t1.u;
import t1.x;
import v0.o;

/* loaded from: classes.dex */
final class o1 implements Handler.Callback, u.a, c0.a, m2.d, m.a, z2.a {
    private final long A;
    private j3 B;
    private s2 C;
    private e D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int O;
    private h P;
    private long Q;
    private int R;
    private boolean S;
    private r T;
    private long U;
    private long V = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    private final e3[] f20826f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<e3> f20827g;

    /* renamed from: h, reason: collision with root package name */
    private final g3[] f20828h;

    /* renamed from: i, reason: collision with root package name */
    private final m2.c0 f20829i;

    /* renamed from: j, reason: collision with root package name */
    private final m2.d0 f20830j;

    /* renamed from: k, reason: collision with root package name */
    private final y1 f20831k;

    /* renamed from: l, reason: collision with root package name */
    private final n2.f f20832l;

    /* renamed from: m, reason: collision with root package name */
    private final o2.n f20833m;

    /* renamed from: n, reason: collision with root package name */
    private final HandlerThread f20834n;

    /* renamed from: o, reason: collision with root package name */
    private final Looper f20835o;

    /* renamed from: p, reason: collision with root package name */
    private final r3.d f20836p;

    /* renamed from: q, reason: collision with root package name */
    private final r3.b f20837q;

    /* renamed from: r, reason: collision with root package name */
    private final long f20838r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f20839s;

    /* renamed from: t, reason: collision with root package name */
    private final m f20840t;

    /* renamed from: u, reason: collision with root package name */
    private final ArrayList<d> f20841u;

    /* renamed from: v, reason: collision with root package name */
    private final o2.d f20842v;

    /* renamed from: w, reason: collision with root package name */
    private final f f20843w;

    /* renamed from: x, reason: collision with root package name */
    private final j2 f20844x;

    /* renamed from: y, reason: collision with root package name */
    private final m2 f20845y;

    /* renamed from: z, reason: collision with root package name */
    private final x1 f20846z;

    class a implements e3.a {
        a() {
        }

        @Override // r0.e3.a
        public void a() {
            o1.this.M = true;
        }

        @Override // r0.e3.a
        public void b() {
            o1.this.f20833m.c(2);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<m2.c> f20848a;

        /* renamed from: b, reason: collision with root package name */
        private final t1.s0 f20849b;

        /* renamed from: c, reason: collision with root package name */
        private final int f20850c;

        /* renamed from: d, reason: collision with root package name */
        private final long f20851d;

        private b(List<m2.c> list, t1.s0 s0Var, int i7, long j7) {
            this.f20848a = list;
            this.f20849b = s0Var;
            this.f20850c = i7;
            this.f20851d = j7;
        }

        /* synthetic */ b(List list, t1.s0 s0Var, int i7, long j7, a aVar) {
            this(list, s0Var, i7, j7);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f20852a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20853b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20854c;

        /* renamed from: d, reason: collision with root package name */
        public final t1.s0 f20855d;
    }

    private static final class d implements Comparable<d> {

        /* renamed from: f, reason: collision with root package name */
        public final z2 f20856f;

        /* renamed from: g, reason: collision with root package name */
        public int f20857g;

        /* renamed from: h, reason: collision with root package name */
        public long f20858h;

        /* renamed from: i, reason: collision with root package name */
        public Object f20859i;

        public d(z2 z2Var) {
            this.f20856f = z2Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f20859i;
            if ((obj == null) != (dVar.f20859i == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i7 = this.f20857g - dVar.f20857g;
            return i7 != 0 ? i7 : o2.m0.o(this.f20858h, dVar.f20858h);
        }

        public void d(int i7, long j7, Object obj) {
            this.f20857g = i7;
            this.f20858h = j7;
            this.f20859i = obj;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f20860a;

        /* renamed from: b, reason: collision with root package name */
        public s2 f20861b;

        /* renamed from: c, reason: collision with root package name */
        public int f20862c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20863d;

        /* renamed from: e, reason: collision with root package name */
        public int f20864e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f20865f;

        /* renamed from: g, reason: collision with root package name */
        public int f20866g;

        public e(s2 s2Var) {
            this.f20861b = s2Var;
        }

        public void b(int i7) {
            this.f20860a |= i7 > 0;
            this.f20862c += i7;
        }

        public void c(int i7) {
            this.f20860a = true;
            this.f20865f = true;
            this.f20866g = i7;
        }

        public void d(s2 s2Var) {
            this.f20860a |= this.f20861b != s2Var;
            this.f20861b = s2Var;
        }

        public void e(int i7) {
            if (this.f20863d && this.f20864e != 5) {
                o2.a.a(i7 == 5);
                return;
            }
            this.f20860a = true;
            this.f20863d = true;
            this.f20864e = i7;
        }
    }

    public interface f {
        void a(e eVar);
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final x.b f20867a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20868b;

        /* renamed from: c, reason: collision with root package name */
        public final long f20869c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f20870d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f20871e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f20872f;

        public g(x.b bVar, long j7, long j8, boolean z6, boolean z7, boolean z8) {
            this.f20867a = bVar;
            this.f20868b = j7;
            this.f20869c = j8;
            this.f20870d = z6;
            this.f20871e = z7;
            this.f20872f = z8;
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final r3 f20873a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20874b;

        /* renamed from: c, reason: collision with root package name */
        public final long f20875c;

        public h(r3 r3Var, int i7, long j7) {
            this.f20873a = r3Var;
            this.f20874b = i7;
            this.f20875c = j7;
        }
    }

    public o1(e3[] e3VarArr, m2.c0 c0Var, m2.d0 d0Var, y1 y1Var, n2.f fVar, int i7, boolean z6, s0.a aVar, j3 j3Var, x1 x1Var, long j7, boolean z7, Looper looper, o2.d dVar, f fVar2, s0.u1 u1Var) {
        this.f20843w = fVar2;
        this.f20826f = e3VarArr;
        this.f20829i = c0Var;
        this.f20830j = d0Var;
        this.f20831k = y1Var;
        this.f20832l = fVar;
        this.J = i7;
        this.K = z6;
        this.B = j3Var;
        this.f20846z = x1Var;
        this.A = j7;
        this.U = j7;
        this.F = z7;
        this.f20842v = dVar;
        this.f20838r = y1Var.j();
        this.f20839s = y1Var.c();
        s2 j8 = s2.j(d0Var);
        this.C = j8;
        this.D = new e(j8);
        this.f20828h = new g3[e3VarArr.length];
        for (int i8 = 0; i8 < e3VarArr.length; i8++) {
            e3VarArr[i8].x(i8, u1Var);
            this.f20828h[i8] = e3VarArr[i8].y();
        }
        this.f20840t = new m(this, dVar);
        this.f20841u = new ArrayList<>();
        this.f20827g = m4.p0.h();
        this.f20836p = new r3.d();
        this.f20837q = new r3.b();
        c0Var.b(this, fVar);
        this.S = true;
        Handler handler = new Handler(looper);
        this.f20844x = new j2(aVar, handler);
        this.f20845y = new m2(this, aVar, handler, u1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f20834n = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f20835o = looper2;
        this.f20833m = dVar.c(looper2, this);
    }

    private long A(r3 r3Var, Object obj, long j7) {
        r3Var.r(r3Var.l(obj, this.f20837q).f20914h, this.f20836p);
        r3.d dVar = this.f20836p;
        if (dVar.f20932k != -9223372036854775807L && dVar.h()) {
            r3.d dVar2 = this.f20836p;
            if (dVar2.f20935n) {
                return o2.m0.B0(dVar2.c() - this.f20836p.f20932k) - (j7 + this.f20837q.q());
            }
        }
        return -9223372036854775807L;
    }

    static Object A0(r3.d dVar, r3.b bVar, int i7, boolean z6, Object obj, r3 r3Var, r3 r3Var2) {
        int f7 = r3Var.f(obj);
        int m7 = r3Var.m();
        int i8 = f7;
        int i9 = -1;
        for (int i10 = 0; i10 < m7 && i9 == -1; i10++) {
            i8 = r3Var.h(i8, bVar, dVar, i7, z6);
            if (i8 == -1) {
                break;
            }
            i9 = r3Var2.f(r3Var.q(i8));
        }
        if (i9 == -1) {
            return null;
        }
        return r3Var2.q(i9);
    }

    private long B() {
        g2 q7 = this.f20844x.q();
        if (q7 == null) {
            return 0L;
        }
        long l7 = q7.l();
        if (!q7.f20652d) {
            return l7;
        }
        int i7 = 0;
        while (true) {
            e3[] e3VarArr = this.f20826f;
            if (i7 >= e3VarArr.length) {
                return l7;
            }
            if (S(e3VarArr[i7]) && this.f20826f[i7].q() == q7.f20651c[i7]) {
                long t6 = this.f20826f[i7].t();
                if (t6 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l7 = Math.max(t6, l7);
            }
            i7++;
        }
    }

    private void B0(long j7, long j8) {
        this.f20833m.f(2, j7 + j8);
    }

    private Pair<x.b, Long> C(r3 r3Var) {
        if (r3Var.u()) {
            return Pair.create(s2.k(), 0L);
        }
        Pair<Object, Long> n7 = r3Var.n(this.f20836p, this.f20837q, r3Var.e(this.K), -9223372036854775807L);
        x.b B = this.f20844x.B(r3Var, n7.first, 0L);
        long longValue = ((Long) n7.second).longValue();
        if (B.b()) {
            r3Var.l(B.f22249a, this.f20837q);
            longValue = B.f22251c == this.f20837q.n(B.f22250b) ? this.f20837q.j() : 0L;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    private void D0(boolean z6) {
        x.b bVar = this.f20844x.p().f20654f.f20667a;
        long G0 = G0(bVar, this.C.f21010r, true, false);
        if (G0 != this.C.f21010r) {
            s2 s2Var = this.C;
            this.C = N(bVar, G0, s2Var.f20995c, s2Var.f20996d, z6, 5);
        }
    }

    private long E() {
        return F(this.C.f21008p);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ab A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:6:0x00a1, B:8:0x00ab, B:15:0x00b1, B:17:0x00b7, B:18:0x00ba, B:19:0x00c0, B:21:0x00ca, B:23:0x00d2, B:27:0x00da, B:28:0x00e4, B:30:0x00f4, B:34:0x00fe, B:37:0x0110, B:40:0x0119), top: B:5:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void E0(h hVar) {
        long longValue;
        long j7;
        boolean z6;
        x.b bVar;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        s2 s2Var;
        int i7;
        this.D.b(1);
        Pair<Object, Long> z02 = z0(this.C.f20993a, hVar, true, this.J, this.K, this.f20836p, this.f20837q);
        try {
            if (z02 == null) {
                Pair<x.b, Long> C = C(this.C.f20993a);
                bVar = (x.b) C.first;
                longValue = ((Long) C.second).longValue();
                z6 = !this.C.f20993a.u();
                j7 = -9223372036854775807L;
            } else {
                Object obj = z02.first;
                longValue = ((Long) z02.second).longValue();
                long j13 = hVar.f20875c == -9223372036854775807L ? -9223372036854775807L : longValue;
                x.b B = this.f20844x.B(this.C.f20993a, obj, longValue);
                if (B.b()) {
                    this.C.f20993a.l(B.f22249a, this.f20837q);
                    j8 = this.f20837q.n(B.f22250b) == B.f22251c ? this.f20837q.j() : 0L;
                    j9 = j13;
                    z6 = true;
                    bVar = B;
                    if (!this.C.f20993a.u()) {
                        this.P = hVar;
                    } else {
                        if (z02 != null) {
                            if (bVar.equals(this.C.f20994b)) {
                                g2 p7 = this.f20844x.p();
                                j11 = (p7 == null || !p7.f20652d || j8 == 0) ? j8 : p7.f20649a.f(j8, this.B);
                                if (o2.m0.Y0(j11) == o2.m0.Y0(this.C.f21010r) && ((i7 = (s2Var = this.C).f20997e) == 2 || i7 == 3)) {
                                    long j14 = s2Var.f21010r;
                                    this.C = N(bVar, j14, j9, j14, z6, 2);
                                    return;
                                }
                            } else {
                                j11 = j8;
                            }
                            long F0 = F0(bVar, j11, this.C.f20997e == 4);
                            boolean z7 = (j8 != F0) | z6;
                            try {
                                s2 s2Var2 = this.C;
                                r3 r3Var = s2Var2.f20993a;
                                p1(r3Var, bVar, r3Var, s2Var2.f20994b, j9);
                                z6 = z7;
                                j12 = F0;
                                this.C = N(bVar, j12, j9, j12, z6, 2);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                z6 = z7;
                                j10 = F0;
                                this.C = N(bVar, j10, j9, j10, z6, 2);
                                throw th;
                            }
                        }
                        if (this.C.f20997e != 1) {
                            b1(4);
                        }
                        s0(false, true, false, true);
                    }
                    j12 = j8;
                    this.C = N(bVar, j12, j9, j12, z6, 2);
                    return;
                }
                j7 = j13;
                z6 = hVar.f20875c == -9223372036854775807L;
                bVar = B;
            }
            if (!this.C.f20993a.u()) {
            }
            j12 = j8;
            this.C = N(bVar, j12, j9, j12, z6, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j10 = j8;
        }
        j8 = longValue;
        j9 = j7;
    }

    private long F(long j7) {
        g2 j8 = this.f20844x.j();
        if (j8 == null) {
            return 0L;
        }
        return Math.max(0L, j7 - j8.y(this.Q));
    }

    private long F0(x.b bVar, long j7, boolean z6) {
        return G0(bVar, j7, this.f20844x.p() != this.f20844x.q(), z6);
    }

    private void G(t1.u uVar) {
        if (this.f20844x.v(uVar)) {
            this.f20844x.y(this.Q);
            X();
        }
    }

    private long G0(x.b bVar, long j7, boolean z6, boolean z7) {
        k1();
        this.H = false;
        if (z7 || this.C.f20997e == 3) {
            b1(2);
        }
        g2 p7 = this.f20844x.p();
        g2 g2Var = p7;
        while (g2Var != null && !bVar.equals(g2Var.f20654f.f20667a)) {
            g2Var = g2Var.j();
        }
        if (z6 || p7 != g2Var || (g2Var != null && g2Var.z(j7) < 0)) {
            for (e3 e3Var : this.f20826f) {
                p(e3Var);
            }
            if (g2Var != null) {
                while (this.f20844x.p() != g2Var) {
                    this.f20844x.b();
                }
                this.f20844x.z(g2Var);
                g2Var.x(1000000000000L);
                s();
            }
        }
        j2 j2Var = this.f20844x;
        if (g2Var != null) {
            j2Var.z(g2Var);
            if (!g2Var.f20652d) {
                g2Var.f20654f = g2Var.f20654f.b(j7);
            } else if (g2Var.f20653e) {
                long u6 = g2Var.f20649a.u(j7);
                g2Var.f20649a.t(u6 - this.f20838r, this.f20839s);
                j7 = u6;
            }
            u0(j7);
            X();
        } else {
            j2Var.f();
            u0(j7);
        }
        I(false);
        this.f20833m.c(2);
        return j7;
    }

    private void H(IOException iOException, int i7) {
        r h7 = r.h(iOException, i7);
        g2 p7 = this.f20844x.p();
        if (p7 != null) {
            h7 = h7.f(p7.f20654f.f20667a);
        }
        o2.r.d("ExoPlayerImplInternal", "Playback error", h7);
        j1(false, false);
        this.C = this.C.e(h7);
    }

    private void H0(z2 z2Var) {
        if (z2Var.f() == -9223372036854775807L) {
            I0(z2Var);
            return;
        }
        if (this.C.f20993a.u()) {
            this.f20841u.add(new d(z2Var));
            return;
        }
        d dVar = new d(z2Var);
        r3 r3Var = this.C.f20993a;
        if (!w0(dVar, r3Var, r3Var, this.J, this.K, this.f20836p, this.f20837q)) {
            z2Var.k(false);
        } else {
            this.f20841u.add(dVar);
            Collections.sort(this.f20841u);
        }
    }

    private void I(boolean z6) {
        g2 j7 = this.f20844x.j();
        x.b bVar = j7 == null ? this.C.f20994b : j7.f20654f.f20667a;
        boolean z7 = !this.C.f21003k.equals(bVar);
        if (z7) {
            this.C = this.C.b(bVar);
        }
        s2 s2Var = this.C;
        s2Var.f21008p = j7 == null ? s2Var.f21010r : j7.i();
        this.C.f21009q = E();
        if ((z7 || z6) && j7 != null && j7.f20652d) {
            m1(j7.n(), j7.o());
        }
    }

    private void I0(z2 z2Var) {
        if (z2Var.c() != this.f20835o) {
            this.f20833m.h(15, z2Var).a();
            return;
        }
        o(z2Var);
        int i7 = this.C.f20997e;
        if (i7 == 3 || i7 == 2) {
            this.f20833m.c(2);
        }
    }

    private void J(r3 r3Var, boolean z6) {
        boolean z7;
        g y02 = y0(r3Var, this.C, this.P, this.f20844x, this.J, this.K, this.f20836p, this.f20837q);
        x.b bVar = y02.f20867a;
        long j7 = y02.f20869c;
        boolean z8 = y02.f20870d;
        long j8 = y02.f20868b;
        boolean z9 = (this.C.f20994b.equals(bVar) && j8 == this.C.f21010r) ? false : true;
        h hVar = null;
        try {
            if (y02.f20871e) {
                if (this.C.f20997e != 1) {
                    b1(4);
                }
                s0(false, false, false, true);
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (z9) {
                z7 = false;
                if (!r3Var.u()) {
                    for (g2 p7 = this.f20844x.p(); p7 != null; p7 = p7.j()) {
                        if (p7.f20654f.f20667a.equals(bVar)) {
                            p7.f20654f = this.f20844x.r(r3Var, p7.f20654f);
                            p7.A();
                        }
                    }
                    j8 = F0(bVar, j8, z8);
                }
            } else {
                z7 = false;
                if (!this.f20844x.F(r3Var, this.Q, B())) {
                    D0(false);
                }
            }
            s2 s2Var = this.C;
            p1(r3Var, bVar, s2Var.f20993a, s2Var.f20994b, y02.f20872f ? j8 : -9223372036854775807L);
            if (z9 || j7 != this.C.f20995c) {
                s2 s2Var2 = this.C;
                Object obj = s2Var2.f20994b.f22249a;
                r3 r3Var2 = s2Var2.f20993a;
                this.C = N(bVar, j8, j7, this.C.f20996d, z9 && z6 && !r3Var2.u() && !r3Var2.l(obj, this.f20837q).f20917k, r3Var.f(obj) == -1 ? 4 : 3);
            }
            t0();
            x0(r3Var, this.C.f20993a);
            this.C = this.C.i(r3Var);
            if (!r3Var.u()) {
                this.P = null;
            }
            I(z7);
        } catch (Throwable th2) {
            th = th2;
            hVar = null;
            s2 s2Var3 = this.C;
            h hVar2 = hVar;
            p1(r3Var, bVar, s2Var3.f20993a, s2Var3.f20994b, y02.f20872f ? j8 : -9223372036854775807L);
            if (z9 || j7 != this.C.f20995c) {
                s2 s2Var4 = this.C;
                Object obj2 = s2Var4.f20994b.f22249a;
                r3 r3Var3 = s2Var4.f20993a;
                this.C = N(bVar, j8, j7, this.C.f20996d, z9 && z6 && !r3Var3.u() && !r3Var3.l(obj2, this.f20837q).f20917k, r3Var.f(obj2) == -1 ? 4 : 3);
            }
            t0();
            x0(r3Var, this.C.f20993a);
            this.C = this.C.i(r3Var);
            if (!r3Var.u()) {
                this.P = hVar2;
            }
            I(false);
            throw th;
        }
    }

    private void J0(final z2 z2Var) {
        Looper c7 = z2Var.c();
        if (c7.getThread().isAlive()) {
            this.f20842v.c(c7, null).j(new Runnable() { // from class: r0.m1
                @Override // java.lang.Runnable
                public final void run() {
                    o1.this.W(z2Var);
                }
            });
        } else {
            o2.r.i("TAG", "Trying to send message on a dead thread.");
            z2Var.k(false);
        }
    }

    private void K(t1.u uVar) {
        if (this.f20844x.v(uVar)) {
            g2 j7 = this.f20844x.j();
            j7.p(this.f20840t.d().f21048f, this.C.f20993a);
            m1(j7.n(), j7.o());
            if (j7 == this.f20844x.p()) {
                u0(j7.f20654f.f20668b);
                s();
                s2 s2Var = this.C;
                x.b bVar = s2Var.f20994b;
                long j8 = j7.f20654f.f20668b;
                this.C = N(bVar, j8, s2Var.f20995c, j8, false, 5);
            }
            X();
        }
    }

    private void K0(long j7) {
        for (e3 e3Var : this.f20826f) {
            if (e3Var.q() != null) {
                L0(e3Var, j7);
            }
        }
    }

    private void L(u2 u2Var, float f7, boolean z6, boolean z7) {
        if (z6) {
            if (z7) {
                this.D.b(1);
            }
            this.C = this.C.f(u2Var);
        }
        q1(u2Var.f21048f);
        for (e3 e3Var : this.f20826f) {
            if (e3Var != null) {
                e3Var.A(f7, u2Var.f21048f);
            }
        }
    }

    private void L0(e3 e3Var, long j7) {
        e3Var.r();
        if (e3Var instanceof c2.o) {
            ((c2.o) e3Var).c0(j7);
        }
    }

    private void M(u2 u2Var, boolean z6) {
        L(u2Var, u2Var.f21048f, true, z6);
    }

    private void M0(boolean z6, AtomicBoolean atomicBoolean) {
        if (this.L != z6) {
            this.L = z6;
            if (!z6) {
                for (e3 e3Var : this.f20826f) {
                    if (!S(e3Var) && this.f20827g.remove(e3Var)) {
                        e3Var.a();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private s2 N(x.b bVar, long j7, long j8, long j9, boolean z6, int i7) {
        List list;
        t1.z0 z0Var;
        m2.d0 d0Var;
        this.S = (!this.S && j7 == this.C.f21010r && bVar.equals(this.C.f20994b)) ? false : true;
        t0();
        s2 s2Var = this.C;
        t1.z0 z0Var2 = s2Var.f21000h;
        m2.d0 d0Var2 = s2Var.f21001i;
        List list2 = s2Var.f21002j;
        if (this.f20845y.s()) {
            g2 p7 = this.f20844x.p();
            t1.z0 n7 = p7 == null ? t1.z0.f22273i : p7.n();
            m2.d0 o7 = p7 == null ? this.f20830j : p7.o();
            List x6 = x(o7.f18990c);
            if (p7 != null) {
                h2 h2Var = p7.f20654f;
                if (h2Var.f20669c != j8) {
                    p7.f20654f = h2Var.a(j8);
                }
            }
            z0Var = n7;
            d0Var = o7;
            list = x6;
        } else if (bVar.equals(this.C.f20994b)) {
            list = list2;
            z0Var = z0Var2;
            d0Var = d0Var2;
        } else {
            z0Var = t1.z0.f22273i;
            d0Var = this.f20830j;
            list = m4.q.x();
        }
        if (z6) {
            this.D.e(i7);
        }
        return this.C.c(bVar, j7, j8, j9, E(), z0Var, d0Var, list);
    }

    private void N0(b bVar) {
        this.D.b(1);
        if (bVar.f20850c != -1) {
            this.P = new h(new a3(bVar.f20848a, bVar.f20849b), bVar.f20850c, bVar.f20851d);
        }
        J(this.f20845y.C(bVar.f20848a, bVar.f20849b), false);
    }

    private boolean O(e3 e3Var, g2 g2Var) {
        g2 j7 = g2Var.j();
        return g2Var.f20654f.f20672f && j7.f20652d && ((e3Var instanceof c2.o) || (e3Var instanceof j1.g) || e3Var.t() >= j7.m());
    }

    private boolean P() {
        g2 q7 = this.f20844x.q();
        if (!q7.f20652d) {
            return false;
        }
        int i7 = 0;
        while (true) {
            e3[] e3VarArr = this.f20826f;
            if (i7 >= e3VarArr.length) {
                return true;
            }
            e3 e3Var = e3VarArr[i7];
            t1.q0 q0Var = q7.f20651c[i7];
            if (e3Var.q() != q0Var || (q0Var != null && !e3Var.k() && !O(e3Var, q7))) {
                break;
            }
            i7++;
        }
        return false;
    }

    private void P0(boolean z6) {
        if (z6 == this.N) {
            return;
        }
        this.N = z6;
        if (z6 || !this.C.f21007o) {
            return;
        }
        this.f20833m.c(2);
    }

    private static boolean Q(boolean z6, x.b bVar, long j7, x.b bVar2, r3.b bVar3, long j8) {
        if (!z6 && j7 == j8 && bVar.f22249a.equals(bVar2.f22249a)) {
            return (bVar.b() && bVar3.t(bVar.f22250b)) ? (bVar3.k(bVar.f22250b, bVar.f22251c) == 4 || bVar3.k(bVar.f22250b, bVar.f22251c) == 2) ? false : true : bVar2.b() && bVar3.t(bVar2.f22250b);
        }
        return false;
    }

    private void Q0(boolean z6) {
        this.F = z6;
        t0();
        if (!this.G || this.f20844x.q() == this.f20844x.p()) {
            return;
        }
        D0(true);
        I(false);
    }

    private boolean R() {
        g2 j7 = this.f20844x.j();
        return (j7 == null || j7.k() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean S(e3 e3Var) {
        return e3Var.getState() != 0;
    }

    private void S0(boolean z6, int i7, boolean z7, int i8) {
        this.D.b(z7 ? 1 : 0);
        this.D.c(i8);
        this.C = this.C.d(z6, i7);
        this.H = false;
        h0(z6);
        if (!e1()) {
            k1();
            o1();
            return;
        }
        int i9 = this.C.f20997e;
        if (i9 == 3) {
            h1();
        } else if (i9 != 2) {
            return;
        }
        this.f20833m.c(2);
    }

    private boolean T() {
        g2 p7 = this.f20844x.p();
        long j7 = p7.f20654f.f20671e;
        return p7.f20652d && (j7 == -9223372036854775807L || this.C.f21010r < j7 || !e1());
    }

    private static boolean U(s2 s2Var, r3.b bVar) {
        x.b bVar2 = s2Var.f20994b;
        r3 r3Var = s2Var.f20993a;
        return r3Var.u() || r3Var.l(bVar2.f22249a, bVar).f20917k;
    }

    private void U0(u2 u2Var) {
        this.f20840t.e(u2Var);
        M(this.f20840t.d(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean V() {
        return Boolean.valueOf(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(z2 z2Var) {
        try {
            o(z2Var);
        } catch (r e7) {
            o2.r.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    private void W0(int i7) {
        this.J = i7;
        if (!this.f20844x.G(this.C.f20993a, i7)) {
            D0(true);
        }
        I(false);
    }

    private void X() {
        boolean d12 = d1();
        this.I = d12;
        if (d12) {
            this.f20844x.j().d(this.Q);
        }
        l1();
    }

    private void X0(j3 j3Var) {
        this.B = j3Var;
    }

    private void Y() {
        this.D.d(this.C);
        if (this.D.f20860a) {
            this.f20843w.a(this.D);
            this.D = new e(this.C);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r3 = r7.f20841u.get(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r3 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r4 = r3.f20857g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r4 > r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4 != r0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r3.f20858h <= r8) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1 >= r7.f20841u.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = r7.f20841u.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r3 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r3.f20859i == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r4 = r3.f20857g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r4 < r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r4 != r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r3.f20858h > r8) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r3 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r3.f20859i == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (r3.f20857g != r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r4 = r3.f20858h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r4 <= r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        if (r4 > r10) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        I0(r3.f20856f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r3.f20856f.b() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        if (r3.f20856f.j() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r1 >= r7.f20841u.size()) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:
    
        r3 = r7.f20841u.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        r7.f20841u.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cc, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r3.f20856f.b() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e2, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dd, code lost:
    
        r7.f20841u.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e3, code lost:
    
        r7.R = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007c, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0084, code lost:
    
        if (r1 >= r7.f20841u.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0069, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x006a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0053, code lost:
    
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0055, code lost:
    
        if (r1 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0044, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r1 > 0) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0055 -> B:10:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0084 -> B:21:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Z(long j7, long j8) {
        if (this.f20841u.isEmpty() || this.C.f20994b.b()) {
            return;
        }
        if (this.S) {
            j7--;
            this.S = false;
        }
        s2 s2Var = this.C;
        int f7 = s2Var.f20993a.f(s2Var.f20994b.f22249a);
        int min = Math.min(this.R, this.f20841u.size());
    }

    private void Z0(boolean z6) {
        this.K = z6;
        if (!this.f20844x.H(this.C.f20993a, z6)) {
            D0(true);
        }
        I(false);
    }

    private void a0() {
        h2 o7;
        this.f20844x.y(this.Q);
        if (this.f20844x.D() && (o7 = this.f20844x.o(this.Q, this.C)) != null) {
            g2 g7 = this.f20844x.g(this.f20828h, this.f20829i, this.f20831k.h(), this.f20845y, o7, this.f20830j);
            g7.f20649a.q(this, o7.f20668b);
            if (this.f20844x.p() == g7) {
                u0(o7.f20668b);
            }
            I(false);
        }
        if (!this.I) {
            X();
        } else {
            this.I = R();
            l1();
        }
    }

    private void a1(t1.s0 s0Var) {
        this.D.b(1);
        J(this.f20845y.D(s0Var), false);
    }

    private void b0() {
        boolean z6;
        boolean z7 = false;
        while (c1()) {
            if (z7) {
                Y();
            }
            g2 g2Var = (g2) o2.a.e(this.f20844x.b());
            if (this.C.f20994b.f22249a.equals(g2Var.f20654f.f20667a.f22249a)) {
                x.b bVar = this.C.f20994b;
                if (bVar.f22250b == -1) {
                    x.b bVar2 = g2Var.f20654f.f20667a;
                    if (bVar2.f22250b == -1 && bVar.f22253e != bVar2.f22253e) {
                        z6 = true;
                        h2 h2Var = g2Var.f20654f;
                        x.b bVar3 = h2Var.f20667a;
                        long j7 = h2Var.f20668b;
                        this.C = N(bVar3, j7, h2Var.f20669c, j7, !z6, 0);
                        t0();
                        o1();
                        z7 = true;
                    }
                }
            }
            z6 = false;
            h2 h2Var2 = g2Var.f20654f;
            x.b bVar32 = h2Var2.f20667a;
            long j72 = h2Var2.f20668b;
            this.C = N(bVar32, j72, h2Var2.f20669c, j72, !z6, 0);
            t0();
            o1();
            z7 = true;
        }
    }

    private void b1(int i7) {
        s2 s2Var = this.C;
        if (s2Var.f20997e != i7) {
            if (i7 != 2) {
                this.V = -9223372036854775807L;
            }
            this.C = s2Var.g(i7);
        }
    }

    private void c0() {
        g2 q7 = this.f20844x.q();
        if (q7 == null) {
            return;
        }
        int i7 = 0;
        if (q7.j() != null && !this.G) {
            if (P()) {
                if (q7.j().f20652d || this.Q >= q7.j().m()) {
                    m2.d0 o7 = q7.o();
                    g2 c7 = this.f20844x.c();
                    m2.d0 o8 = c7.o();
                    r3 r3Var = this.C.f20993a;
                    p1(r3Var, c7.f20654f.f20667a, r3Var, q7.f20654f.f20667a, -9223372036854775807L);
                    if (c7.f20652d && c7.f20649a.n() != -9223372036854775807L) {
                        K0(c7.m());
                        return;
                    }
                    for (int i8 = 0; i8 < this.f20826f.length; i8++) {
                        boolean c8 = o7.c(i8);
                        boolean c9 = o8.c(i8);
                        if (c8 && !this.f20826f[i8].v()) {
                            boolean z6 = this.f20828h[i8].j() == -2;
                            h3 h3Var = o7.f18989b[i8];
                            h3 h3Var2 = o8.f18989b[i8];
                            if (!c9 || !h3Var2.equals(h3Var) || z6) {
                                L0(this.f20826f[i8], c7.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!q7.f20654f.f20675i && !this.G) {
            return;
        }
        while (true) {
            e3[] e3VarArr = this.f20826f;
            if (i7 >= e3VarArr.length) {
                return;
            }
            e3 e3Var = e3VarArr[i7];
            t1.q0 q0Var = q7.f20651c[i7];
            if (q0Var != null && e3Var.q() == q0Var && e3Var.k()) {
                long j7 = q7.f20654f.f20671e;
                L0(e3Var, (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : q7.l() + q7.f20654f.f20671e);
            }
            i7++;
        }
    }

    private boolean c1() {
        g2 p7;
        g2 j7;
        return e1() && !this.G && (p7 = this.f20844x.p()) != null && (j7 = p7.j()) != null && this.Q >= j7.m() && j7.f20655g;
    }

    private void d0() {
        g2 q7 = this.f20844x.q();
        if (q7 == null || this.f20844x.p() == q7 || q7.f20655g || !q0()) {
            return;
        }
        s();
    }

    private boolean d1() {
        if (!R()) {
            return false;
        }
        g2 j7 = this.f20844x.j();
        return this.f20831k.g(j7 == this.f20844x.p() ? j7.y(this.Q) : j7.y(this.Q) - j7.f20654f.f20668b, F(j7.k()), this.f20840t.d().f21048f);
    }

    private void e0() {
        J(this.f20845y.i(), true);
    }

    private boolean e1() {
        s2 s2Var = this.C;
        return s2Var.f21004l && s2Var.f21005m == 0;
    }

    private void f0(c cVar) {
        this.D.b(1);
        J(this.f20845y.v(cVar.f20852a, cVar.f20853b, cVar.f20854c, cVar.f20855d), false);
    }

    private boolean f1(boolean z6) {
        if (this.O == 0) {
            return T();
        }
        if (!z6) {
            return false;
        }
        s2 s2Var = this.C;
        if (!s2Var.f20999g) {
            return true;
        }
        long e7 = g1(s2Var.f20993a, this.f20844x.p().f20654f.f20667a) ? this.f20846z.e() : -9223372036854775807L;
        g2 j7 = this.f20844x.j();
        return (j7.q() && j7.f20654f.f20675i) || (j7.f20654f.f20667a.b() && !j7.f20652d) || this.f20831k.f(E(), this.f20840t.d().f21048f, this.H, e7);
    }

    private void g0() {
        for (g2 p7 = this.f20844x.p(); p7 != null; p7 = p7.j()) {
            for (m2.t tVar : p7.o().f18990c) {
                if (tVar != null) {
                    tVar.u();
                }
            }
        }
    }

    private boolean g1(r3 r3Var, x.b bVar) {
        if (bVar.b() || r3Var.u()) {
            return false;
        }
        r3Var.r(r3Var.l(bVar.f22249a, this.f20837q).f20914h, this.f20836p);
        if (!this.f20836p.h()) {
            return false;
        }
        r3.d dVar = this.f20836p;
        return dVar.f20935n && dVar.f20932k != -9223372036854775807L;
    }

    private void h0(boolean z6) {
        for (g2 p7 = this.f20844x.p(); p7 != null; p7 = p7.j()) {
            for (m2.t tVar : p7.o().f18990c) {
                if (tVar != null) {
                    tVar.j(z6);
                }
            }
        }
    }

    private void h1() {
        this.H = false;
        this.f20840t.g();
        for (e3 e3Var : this.f20826f) {
            if (S(e3Var)) {
                e3Var.f();
            }
        }
    }

    private void i0() {
        for (g2 p7 = this.f20844x.p(); p7 != null; p7 = p7.j()) {
            for (m2.t tVar : p7.o().f18990c) {
                if (tVar != null) {
                    tVar.v();
                }
            }
        }
    }

    private void j1(boolean z6, boolean z7) {
        s0(z6 || !this.L, false, true, false);
        this.D.b(z7 ? 1 : 0);
        this.f20831k.i();
        b1(1);
    }

    private void k1() {
        this.f20840t.h();
        for (e3 e3Var : this.f20826f) {
            if (S(e3Var)) {
                u(e3Var);
            }
        }
    }

    private void l0() {
        this.D.b(1);
        s0(false, false, false, true);
        this.f20831k.b();
        b1(this.C.f20993a.u() ? 4 : 2);
        this.f20845y.w(this.f20832l.c());
        this.f20833m.c(2);
    }

    private void l1() {
        g2 j7 = this.f20844x.j();
        boolean z6 = this.I || (j7 != null && j7.f20649a.a());
        s2 s2Var = this.C;
        if (z6 != s2Var.f20999g) {
            this.C = s2Var.a(z6);
        }
    }

    private void m(b bVar, int i7) {
        this.D.b(1);
        m2 m2Var = this.f20845y;
        if (i7 == -1) {
            i7 = m2Var.q();
        }
        J(m2Var.f(i7, bVar.f20848a, bVar.f20849b), false);
    }

    private void m1(t1.z0 z0Var, m2.d0 d0Var) {
        this.f20831k.d(this.f20826f, z0Var, d0Var.f18990c);
    }

    private void n() {
        D0(true);
    }

    private void n0() {
        s0(true, false, true, false);
        this.f20831k.e();
        b1(1);
        this.f20834n.quit();
        synchronized (this) {
            this.E = true;
            notifyAll();
        }
    }

    private void n1() {
        if (this.C.f20993a.u() || !this.f20845y.s()) {
            return;
        }
        a0();
        c0();
        d0();
        b0();
    }

    private void o(z2 z2Var) {
        if (z2Var.j()) {
            return;
        }
        try {
            z2Var.g().p(z2Var.i(), z2Var.e());
        } finally {
            z2Var.k(true);
        }
    }

    private void o0(int i7, int i8, t1.s0 s0Var) {
        this.D.b(1);
        J(this.f20845y.A(i7, i8, s0Var), false);
    }

    private void o1() {
        g2 p7 = this.f20844x.p();
        if (p7 == null) {
            return;
        }
        long n7 = p7.f20652d ? p7.f20649a.n() : -9223372036854775807L;
        if (n7 != -9223372036854775807L) {
            u0(n7);
            if (n7 != this.C.f21010r) {
                s2 s2Var = this.C;
                this.C = N(s2Var.f20994b, n7, s2Var.f20995c, n7, true, 5);
            }
        } else {
            long i7 = this.f20840t.i(p7 != this.f20844x.q());
            this.Q = i7;
            long y6 = p7.y(i7);
            Z(this.C.f21010r, y6);
            this.C.f21010r = y6;
        }
        this.C.f21008p = this.f20844x.j().i();
        this.C.f21009q = E();
        s2 s2Var2 = this.C;
        if (s2Var2.f21004l && s2Var2.f20997e == 3 && g1(s2Var2.f20993a, s2Var2.f20994b) && this.C.f21006n.f21048f == 1.0f) {
            float b7 = this.f20846z.b(y(), E());
            if (this.f20840t.d().f21048f != b7) {
                this.f20840t.e(this.C.f21006n.e(b7));
                L(this.C.f21006n, this.f20840t.d().f21048f, false, false);
            }
        }
    }

    private void p(e3 e3Var) {
        if (S(e3Var)) {
            this.f20840t.a(e3Var);
            u(e3Var);
            e3Var.g();
            this.O--;
        }
    }

    private void p1(r3 r3Var, x.b bVar, r3 r3Var2, x.b bVar2, long j7) {
        if (!g1(r3Var, bVar)) {
            u2 u2Var = bVar.b() ? u2.f21046i : this.C.f21006n;
            if (this.f20840t.d().equals(u2Var)) {
                return;
            }
            this.f20840t.e(u2Var);
            return;
        }
        r3Var.r(r3Var.l(bVar.f22249a, this.f20837q).f20914h, this.f20836p);
        this.f20846z.c((a2.g) o2.m0.j(this.f20836p.f20937p));
        if (j7 != -9223372036854775807L) {
            this.f20846z.d(A(r3Var, bVar.f22249a, j7));
            return;
        }
        if (o2.m0.c(r3Var2.u() ? null : r3Var2.r(r3Var2.l(bVar2.f22249a, this.f20837q).f20914h, this.f20836p).f20927f, this.f20836p.f20927f)) {
            return;
        }
        this.f20846z.d(-9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q() {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        s2 s2Var;
        int i7;
        long j7;
        long b7 = this.f20842v.b();
        this.f20833m.g(2);
        n1();
        int i8 = this.C.f20997e;
        if (i8 == 1 || i8 == 4) {
            return;
        }
        g2 p7 = this.f20844x.p();
        if (p7 == null) {
            B0(b7, 10L);
            return;
        }
        o2.j0.a("doSomeWork");
        o1();
        if (p7.f20652d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            p7.f20649a.t(this.C.f21010r - this.f20838r, this.f20839s);
            int i9 = 0;
            z6 = true;
            z7 = true;
            while (true) {
                e3[] e3VarArr = this.f20826f;
                if (i9 >= e3VarArr.length) {
                    break;
                }
                e3 e3Var = e3VarArr[i9];
                if (S(e3Var)) {
                    e3Var.o(this.Q, elapsedRealtime);
                    z6 = z6 && e3Var.c();
                    boolean z10 = p7.f20651c[i9] != e3Var.q();
                    boolean z11 = z10 || (!z10 && e3Var.k()) || e3Var.i() || e3Var.c();
                    z7 = z7 && z11;
                    if (!z11) {
                        e3Var.s();
                    }
                }
                i9++;
            }
        } else {
            p7.f20649a.s();
            z6 = true;
            z7 = true;
        }
        long j8 = p7.f20654f.f20671e;
        boolean z12 = z6 && p7.f20652d && (j8 == -9223372036854775807L || j8 <= this.C.f21010r);
        if (z12 && this.G) {
            this.G = false;
            S0(false, this.C.f21005m, false, 5);
        }
        if (!z12 || !p7.f20654f.f20675i) {
            if (this.C.f20997e == 2 && f1(z7)) {
                b1(3);
                this.T = null;
                if (e1()) {
                    h1();
                }
            } else if (this.C.f20997e == 3 && (this.O != 0 ? !z7 : !T())) {
                this.H = e1();
                b1(2);
                if (this.H) {
                    i0();
                    this.f20846z.a();
                }
            }
            if (this.C.f20997e == 2) {
                int i10 = 0;
                while (true) {
                    e3[] e3VarArr2 = this.f20826f;
                    if (i10 >= e3VarArr2.length) {
                        break;
                    }
                    if (S(e3VarArr2[i10]) && this.f20826f[i10].q() == p7.f20651c[i10]) {
                        this.f20826f[i10].s();
                    }
                    i10++;
                }
                s2 s2Var2 = this.C;
                if (!s2Var2.f20999g && s2Var2.f21009q < 500000 && R()) {
                    z8 = true;
                    if (z8) {
                        long j9 = this.V;
                        long a7 = this.f20842v.a();
                        if (j9 == -9223372036854775807L) {
                            this.V = a7;
                        } else if (a7 - this.V >= 4000) {
                            throw new IllegalStateException("Playback stuck buffering and not loading");
                        }
                    } else {
                        this.V = -9223372036854775807L;
                    }
                    boolean z13 = !e1() && this.C.f20997e == 3;
                    z9 = !this.N && this.M && z13;
                    s2Var = this.C;
                    if (s2Var.f21007o != z9) {
                        this.C = s2Var.h(z9);
                    }
                    this.M = false;
                    if (z9 || (i7 = this.C.f20997e) == 4) {
                        return;
                    }
                    if (!z13 && i7 != 2) {
                        j7 = (i7 == 3 && this.O != 0) ? 1000L : 10L;
                        o2.j0.c();
                        return;
                    }
                    B0(b7, j7);
                    o2.j0.c();
                    return;
                }
            }
            z8 = false;
            if (z8) {
            }
            if (e1()) {
            }
            if (this.N) {
            }
            s2Var = this.C;
            if (s2Var.f21007o != z9) {
            }
            this.M = false;
            if (z9) {
                return;
            } else {
                return;
            }
        }
        b1(4);
        k1();
        if (this.C.f20997e == 2) {
        }
        z8 = false;
        if (z8) {
        }
        if (e1()) {
        }
        if (this.N) {
        }
        s2Var = this.C;
        if (s2Var.f21007o != z9) {
        }
        this.M = false;
        if (z9) {
        }
    }

    private boolean q0() {
        g2 q7 = this.f20844x.q();
        m2.d0 o7 = q7.o();
        int i7 = 0;
        boolean z6 = false;
        while (true) {
            e3[] e3VarArr = this.f20826f;
            if (i7 >= e3VarArr.length) {
                return !z6;
            }
            e3 e3Var = e3VarArr[i7];
            if (S(e3Var)) {
                boolean z7 = e3Var.q() != q7.f20651c[i7];
                if (!o7.c(i7) || z7) {
                    if (!e3Var.v()) {
                        e3Var.l(z(o7.f18990c[i7]), q7.f20651c[i7], q7.m(), q7.l());
                    } else if (e3Var.c()) {
                        p(e3Var);
                    } else {
                        z6 = true;
                    }
                }
            }
            i7++;
        }
    }

    private void q1(float f7) {
        for (g2 p7 = this.f20844x.p(); p7 != null; p7 = p7.j()) {
            for (m2.t tVar : p7.o().f18990c) {
                if (tVar != null) {
                    tVar.s(f7);
                }
            }
        }
    }

    private void r(int i7, boolean z6) {
        e3 e3Var = this.f20826f[i7];
        if (S(e3Var)) {
            return;
        }
        g2 q7 = this.f20844x.q();
        boolean z7 = q7 == this.f20844x.p();
        m2.d0 o7 = q7.o();
        h3 h3Var = o7.f18989b[i7];
        s1[] z8 = z(o7.f18990c[i7]);
        boolean z9 = e1() && this.C.f20997e == 3;
        boolean z10 = !z6 && z9;
        this.O++;
        this.f20827g.add(e3Var);
        e3Var.m(h3Var, z8, q7.f20651c[i7], this.Q, z10, z7, q7.m(), q7.l());
        e3Var.p(11, new a());
        this.f20840t.b(e3Var);
        if (z9) {
            e3Var.f();
        }
    }

    private void r0() {
        float f7 = this.f20840t.d().f21048f;
        g2 q7 = this.f20844x.q();
        boolean z6 = true;
        for (g2 p7 = this.f20844x.p(); p7 != null && p7.f20652d; p7 = p7.j()) {
            m2.d0 v6 = p7.v(f7, this.C.f20993a);
            if (!v6.a(p7.o())) {
                j2 j2Var = this.f20844x;
                if (z6) {
                    g2 p8 = j2Var.p();
                    boolean z7 = this.f20844x.z(p8);
                    boolean[] zArr = new boolean[this.f20826f.length];
                    long b7 = p8.b(v6, this.C.f21010r, z7, zArr);
                    s2 s2Var = this.C;
                    boolean z8 = (s2Var.f20997e == 4 || b7 == s2Var.f21010r) ? false : true;
                    s2 s2Var2 = this.C;
                    this.C = N(s2Var2.f20994b, b7, s2Var2.f20995c, s2Var2.f20996d, z8, 5);
                    if (z8) {
                        u0(b7);
                    }
                    boolean[] zArr2 = new boolean[this.f20826f.length];
                    int i7 = 0;
                    while (true) {
                        e3[] e3VarArr = this.f20826f;
                        if (i7 >= e3VarArr.length) {
                            break;
                        }
                        e3 e3Var = e3VarArr[i7];
                        zArr2[i7] = S(e3Var);
                        t1.q0 q0Var = p8.f20651c[i7];
                        if (zArr2[i7]) {
                            if (q0Var != e3Var.q()) {
                                p(e3Var);
                            } else if (zArr[i7]) {
                                e3Var.u(this.Q);
                            }
                        }
                        i7++;
                    }
                    t(zArr2);
                } else {
                    j2Var.z(p7);
                    if (p7.f20652d) {
                        p7.a(v6, Math.max(p7.f20654f.f20668b, p7.y(this.Q)), false);
                    }
                }
                I(true);
                if (this.C.f20997e != 4) {
                    X();
                    o1();
                    this.f20833m.c(2);
                    return;
                }
                return;
            }
            if (p7 == q7) {
                z6 = false;
            }
        }
    }

    private synchronized void r1(l4.o<Boolean> oVar, long j7) {
        long a7 = this.f20842v.a() + j7;
        boolean z6 = false;
        while (!oVar.get().booleanValue() && j7 > 0) {
            try {
                this.f20842v.d();
                wait(j7);
            } catch (InterruptedException unused) {
                z6 = true;
            }
            j7 = a7 - this.f20842v.a();
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    private void s() {
        t(new boolean[this.f20826f.length]);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void s0(boolean z6, boolean z7, boolean z8, boolean z9) {
        x.b bVar;
        long j7;
        boolean z10;
        this.f20833m.g(2);
        this.T = null;
        this.H = false;
        this.f20840t.h();
        this.Q = 1000000000000L;
        for (e3 e3Var : this.f20826f) {
            try {
                p(e3Var);
            } catch (RuntimeException | r e7) {
                o2.r.d("ExoPlayerImplInternal", "Disable failed.", e7);
            }
        }
        if (z6) {
            for (e3 e3Var2 : this.f20826f) {
                if (this.f20827g.remove(e3Var2)) {
                    try {
                        e3Var2.a();
                    } catch (RuntimeException e8) {
                        o2.r.d("ExoPlayerImplInternal", "Reset failed.", e8);
                    }
                }
            }
        }
        this.O = 0;
        s2 s2Var = this.C;
        x.b bVar2 = s2Var.f20994b;
        long j8 = s2Var.f21010r;
        long j9 = (this.C.f20994b.b() || U(this.C, this.f20837q)) ? this.C.f20995c : this.C.f21010r;
        if (z7) {
            this.P = null;
            Pair<x.b, Long> C = C(this.C.f20993a);
            bVar2 = (x.b) C.first;
            j8 = ((Long) C.second).longValue();
            j9 = -9223372036854775807L;
            if (!bVar2.equals(this.C.f20994b)) {
                z10 = true;
                bVar = bVar2;
                j7 = j8;
                this.f20844x.f();
                this.I = false;
                s2 s2Var2 = this.C;
                r3 r3Var = s2Var2.f20993a;
                int i7 = s2Var2.f20997e;
                r rVar = z9 ? null : s2Var2.f20998f;
                t1.z0 z0Var = !z10 ? t1.z0.f22273i : s2Var2.f21000h;
                m2.d0 d0Var = !z10 ? this.f20830j : s2Var2.f21001i;
                List x6 = !z10 ? m4.q.x() : s2Var2.f21002j;
                s2 s2Var3 = this.C;
                this.C = new s2(r3Var, bVar, j9, j7, i7, rVar, false, z0Var, d0Var, x6, bVar, s2Var3.f21004l, s2Var3.f21005m, s2Var3.f21006n, j7, 0L, j7, false);
                if (z8) {
                    return;
                }
                this.f20845y.y();
                return;
            }
        }
        bVar = bVar2;
        j7 = j8;
        z10 = false;
        this.f20844x.f();
        this.I = false;
        s2 s2Var22 = this.C;
        r3 r3Var2 = s2Var22.f20993a;
        int i72 = s2Var22.f20997e;
        r rVar2 = z9 ? null : s2Var22.f20998f;
        t1.z0 z0Var2 = !z10 ? t1.z0.f22273i : s2Var22.f21000h;
        m2.d0 d0Var2 = !z10 ? this.f20830j : s2Var22.f21001i;
        List x62 = !z10 ? m4.q.x() : s2Var22.f21002j;
        s2 s2Var32 = this.C;
        this.C = new s2(r3Var2, bVar, j9, j7, i72, rVar2, false, z0Var2, d0Var2, x62, bVar, s2Var32.f21004l, s2Var32.f21005m, s2Var32.f21006n, j7, 0L, j7, false);
        if (z8) {
        }
    }

    private void t(boolean[] zArr) {
        g2 q7 = this.f20844x.q();
        m2.d0 o7 = q7.o();
        for (int i7 = 0; i7 < this.f20826f.length; i7++) {
            if (!o7.c(i7) && this.f20827g.remove(this.f20826f[i7])) {
                this.f20826f[i7].a();
            }
        }
        for (int i8 = 0; i8 < this.f20826f.length; i8++) {
            if (o7.c(i8)) {
                r(i8, zArr[i8]);
            }
        }
        q7.f20655g = true;
    }

    private void t0() {
        g2 p7 = this.f20844x.p();
        this.G = p7 != null && p7.f20654f.f20674h && this.F;
    }

    private void u(e3 e3Var) {
        if (e3Var.getState() == 2) {
            e3Var.B();
        }
    }

    private void u0(long j7) {
        g2 p7 = this.f20844x.p();
        long z6 = p7 == null ? j7 + 1000000000000L : p7.z(j7);
        this.Q = z6;
        this.f20840t.c(z6);
        for (e3 e3Var : this.f20826f) {
            if (S(e3Var)) {
                e3Var.u(this.Q);
            }
        }
        g0();
    }

    private static void v0(r3 r3Var, d dVar, r3.d dVar2, r3.b bVar) {
        int i7 = r3Var.r(r3Var.l(dVar.f20859i, bVar).f20914h, dVar2).f20942u;
        Object obj = r3Var.k(i7, bVar, true).f20913g;
        long j7 = bVar.f20915i;
        dVar.d(i7, j7 != -9223372036854775807L ? j7 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean w0(d dVar, r3 r3Var, r3 r3Var2, int i7, boolean z6, r3.d dVar2, r3.b bVar) {
        Object obj = dVar.f20859i;
        if (obj == null) {
            Pair<Object, Long> z02 = z0(r3Var, new h(dVar.f20856f.h(), dVar.f20856f.d(), dVar.f20856f.f() == Long.MIN_VALUE ? -9223372036854775807L : o2.m0.B0(dVar.f20856f.f())), false, i7, z6, dVar2, bVar);
            if (z02 == null) {
                return false;
            }
            dVar.d(r3Var.f(z02.first), ((Long) z02.second).longValue(), z02.first);
            if (dVar.f20856f.f() == Long.MIN_VALUE) {
                v0(r3Var, dVar, dVar2, bVar);
            }
            return true;
        }
        int f7 = r3Var.f(obj);
        if (f7 == -1) {
            return false;
        }
        if (dVar.f20856f.f() == Long.MIN_VALUE) {
            v0(r3Var, dVar, dVar2, bVar);
            return true;
        }
        dVar.f20857g = f7;
        r3Var2.l(dVar.f20859i, bVar);
        if (bVar.f20917k && r3Var2.r(bVar.f20914h, dVar2).f20941t == r3Var2.f(dVar.f20859i)) {
            Pair<Object, Long> n7 = r3Var.n(dVar2, bVar, r3Var.l(dVar.f20859i, bVar).f20914h, dVar.f20858h + bVar.q());
            dVar.d(r3Var.f(n7.first), ((Long) n7.second).longValue(), n7.first);
        }
        return true;
    }

    private m4.q<j1.a> x(m2.t[] tVarArr) {
        q.a aVar = new q.a();
        boolean z6 = false;
        for (m2.t tVar : tVarArr) {
            if (tVar != null) {
                j1.a aVar2 = tVar.a(0).f20954o;
                if (aVar2 == null) {
                    aVar.a(new j1.a(new a.b[0]));
                } else {
                    aVar.a(aVar2);
                    z6 = true;
                }
            }
        }
        return z6 ? aVar.h() : m4.q.x();
    }

    private void x0(r3 r3Var, r3 r3Var2) {
        if (r3Var.u() && r3Var2.u()) {
            return;
        }
        for (int size = this.f20841u.size() - 1; size >= 0; size--) {
            if (!w0(this.f20841u.get(size), r3Var, r3Var2, this.J, this.K, this.f20836p, this.f20837q)) {
                this.f20841u.get(size).f20856f.k(false);
                this.f20841u.remove(size);
            }
        }
        Collections.sort(this.f20841u);
    }

    private long y() {
        s2 s2Var = this.C;
        return A(s2Var.f20993a, s2Var.f20994b.f22249a, s2Var.f21010r);
    }

    private static g y0(r3 r3Var, s2 s2Var, h hVar, j2 j2Var, int i7, boolean z6, r3.d dVar, r3.b bVar) {
        int i8;
        x.b bVar2;
        long j7;
        int i9;
        boolean z7;
        boolean z8;
        boolean z9;
        int i10;
        int i11;
        boolean z10;
        j2 j2Var2;
        long j8;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        boolean z13;
        if (r3Var.u()) {
            return new g(s2.k(), 0L, -9223372036854775807L, false, true, false);
        }
        x.b bVar3 = s2Var.f20994b;
        Object obj = bVar3.f22249a;
        boolean U = U(s2Var, bVar);
        long j9 = (s2Var.f20994b.b() || U) ? s2Var.f20995c : s2Var.f21010r;
        if (hVar != null) {
            i8 = -1;
            Pair<Object, Long> z02 = z0(r3Var, hVar, true, i7, z6, dVar, bVar);
            if (z02 == null) {
                i13 = r3Var.e(z6);
                j7 = j9;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                if (hVar.f20875c == -9223372036854775807L) {
                    i13 = r3Var.l(z02.first, bVar).f20914h;
                    j7 = j9;
                    z11 = false;
                } else {
                    obj = z02.first;
                    j7 = ((Long) z02.second).longValue();
                    z11 = true;
                    i13 = -1;
                }
                z12 = s2Var.f20997e == 4;
                z13 = false;
            }
            z9 = z11;
            z7 = z12;
            z8 = z13;
            i9 = i13;
            bVar2 = bVar3;
        } else {
            i8 = -1;
            if (s2Var.f20993a.u()) {
                i10 = r3Var.e(z6);
            } else if (r3Var.f(obj) == -1) {
                Object A0 = A0(dVar, bVar, i7, z6, obj, s2Var.f20993a, r3Var);
                if (A0 == null) {
                    i11 = r3Var.e(z6);
                    z10 = true;
                } else {
                    i11 = r3Var.l(A0, bVar).f20914h;
                    z10 = false;
                }
                i9 = i11;
                z8 = z10;
                j7 = j9;
                bVar2 = bVar3;
                z7 = false;
                z9 = false;
            } else if (j9 == -9223372036854775807L) {
                i10 = r3Var.l(obj, bVar).f20914h;
            } else if (U) {
                bVar2 = bVar3;
                s2Var.f20993a.l(bVar2.f22249a, bVar);
                if (s2Var.f20993a.r(bVar.f20914h, dVar).f20941t == s2Var.f20993a.f(bVar2.f22249a)) {
                    Pair<Object, Long> n7 = r3Var.n(dVar, bVar, r3Var.l(obj, bVar).f20914h, j9 + bVar.q());
                    obj = n7.first;
                    j7 = ((Long) n7.second).longValue();
                } else {
                    j7 = j9;
                }
                i9 = -1;
                z7 = false;
                z8 = false;
                z9 = true;
            } else {
                bVar2 = bVar3;
                j7 = j9;
                i9 = -1;
                z7 = false;
                z8 = false;
                z9 = false;
            }
            i9 = i10;
            j7 = j9;
            bVar2 = bVar3;
            z7 = false;
            z8 = false;
            z9 = false;
        }
        if (i9 != i8) {
            Pair<Object, Long> n8 = r3Var.n(dVar, bVar, i9, -9223372036854775807L);
            obj = n8.first;
            j7 = ((Long) n8.second).longValue();
            j2Var2 = j2Var;
            j8 = -9223372036854775807L;
        } else {
            j2Var2 = j2Var;
            j8 = j7;
        }
        x.b B = j2Var2.B(r3Var, obj, j7);
        int i14 = B.f22253e;
        boolean z14 = bVar2.f22249a.equals(obj) && !bVar2.b() && !B.b() && (i14 == i8 || ((i12 = bVar2.f22253e) != i8 && i14 >= i12));
        x.b bVar4 = bVar2;
        boolean Q = Q(U, bVar2, j9, B, r3Var.l(obj, bVar), j8);
        if (z14 || Q) {
            B = bVar4;
        }
        if (B.b()) {
            if (B.equals(bVar4)) {
                j7 = s2Var.f21010r;
            } else {
                r3Var.l(B.f22249a, bVar);
                j7 = B.f22251c == bVar.n(B.f22250b) ? bVar.j() : 0L;
            }
        }
        return new g(B, j7, j8, z7, z8, z9);
    }

    private static s1[] z(m2.t tVar) {
        int length = tVar != null ? tVar.length() : 0;
        s1[] s1VarArr = new s1[length];
        for (int i7 = 0; i7 < length; i7++) {
            s1VarArr[i7] = tVar.a(i7);
        }
        return s1VarArr;
    }

    private static Pair<Object, Long> z0(r3 r3Var, h hVar, boolean z6, int i7, boolean z7, r3.d dVar, r3.b bVar) {
        Pair<Object, Long> n7;
        Object A0;
        r3 r3Var2 = hVar.f20873a;
        if (r3Var.u()) {
            return null;
        }
        r3 r3Var3 = r3Var2.u() ? r3Var : r3Var2;
        try {
            n7 = r3Var3.n(dVar, bVar, hVar.f20874b, hVar.f20875c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (r3Var.equals(r3Var3)) {
            return n7;
        }
        if (r3Var.f(n7.first) != -1) {
            return (r3Var3.l(n7.first, bVar).f20917k && r3Var3.r(bVar.f20914h, dVar).f20941t == r3Var3.f(n7.first)) ? r3Var.n(dVar, bVar, r3Var.l(n7.first, bVar).f20914h, hVar.f20875c) : n7;
        }
        if (z6 && (A0 = A0(dVar, bVar, i7, z7, n7.first, r3Var3, r3Var)) != null) {
            return r3Var.n(dVar, bVar, r3Var.l(A0, bVar).f20914h, -9223372036854775807L);
        }
        return null;
    }

    public void C0(r3 r3Var, int i7, long j7) {
        this.f20833m.h(3, new h(r3Var, i7, j7)).a();
    }

    public Looper D() {
        return this.f20835o;
    }

    public void O0(List<m2.c> list, int i7, long j7, t1.s0 s0Var) {
        this.f20833m.h(17, new b(list, s0Var, i7, j7, null)).a();
    }

    public void R0(boolean z6, int i7) {
        this.f20833m.b(1, z6 ? 1 : 0, i7).a();
    }

    public void T0(u2 u2Var) {
        this.f20833m.h(4, u2Var).a();
    }

    public void V0(int i7) {
        this.f20833m.b(11, i7, 0).a();
    }

    public void Y0(boolean z6) {
        this.f20833m.b(12, z6 ? 1 : 0, 0).a();
    }

    @Override // r0.m2.d
    public void a() {
        this.f20833m.c(22);
    }

    @Override // r0.z2.a
    public synchronized void c(z2 z2Var) {
        if (!this.E && this.f20834n.isAlive()) {
            this.f20833m.h(14, z2Var).a();
            return;
        }
        o2.r.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        z2Var.k(false);
    }

    @Override // m2.c0.a
    public void d() {
        this.f20833m.c(10);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        r e7;
        int i7;
        g2 q7;
        IOException iOException;
        try {
            switch (message.what) {
                case 0:
                    l0();
                    break;
                case 1:
                    S0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    q();
                    break;
                case 3:
                    E0((h) message.obj);
                    break;
                case 4:
                    U0((u2) message.obj);
                    break;
                case 5:
                    X0((j3) message.obj);
                    break;
                case 6:
                    j1(false, true);
                    break;
                case c4.w0.f2149o /* 7 */:
                    n0();
                    return true;
                case c4.w0.f2150p /* 8 */:
                    K((t1.u) message.obj);
                    break;
                case 9:
                    G((t1.u) message.obj);
                    break;
                case 10:
                    r0();
                    break;
                case 11:
                    W0(message.arg1);
                    break;
                case 12:
                    Z0(message.arg1 != 0);
                    break;
                case 13:
                    M0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    H0((z2) message.obj);
                    break;
                case 15:
                    J0((z2) message.obj);
                    break;
                case 16:
                    M((u2) message.obj, false);
                    break;
                case 17:
                    N0((b) message.obj);
                    break;
                case 18:
                    m((b) message.obj, message.arg1);
                    break;
                case 19:
                    f0((c) message.obj);
                    break;
                case 20:
                    o0(message.arg1, message.arg2, (t1.s0) message.obj);
                    break;
                case 21:
                    a1((t1.s0) message.obj);
                    break;
                case 22:
                    e0();
                    break;
                case 23:
                    Q0(message.arg1 != 0);
                    break;
                case 24:
                    P0(message.arg1 == 1);
                    break;
                case 25:
                    n();
                    break;
                default:
                    return false;
            }
        } catch (n2.m e8) {
            i7 = e8.f19472f;
            iOException = e8;
            H(iOException, i7);
        } catch (r e9) {
            e7 = e9;
            if (e7.f20897i == 1 && (q7 = this.f20844x.q()) != null) {
                e7 = e7.f(q7.f20654f.f20667a);
            }
            if (e7.f20903o && this.T == null) {
                o2.r.j("ExoPlayerImplInternal", "Recoverable renderer error", e7);
                this.T = e7;
                o2.n nVar = this.f20833m;
                nVar.e(nVar.h(25, e7));
            } else {
                r rVar = this.T;
                if (rVar != null) {
                    rVar.addSuppressed(e7);
                    e7 = this.T;
                }
                o2.r.d("ExoPlayerImplInternal", "Playback error", e7);
                j1(true, false);
                this.C = this.C.e(e7);
            }
        } catch (t1.b e10) {
            i7 = 1002;
            iOException = e10;
            H(iOException, i7);
        } catch (o.a e11) {
            i7 = e11.f22690f;
            iOException = e11;
            H(iOException, i7);
        } catch (IOException e12) {
            i7 = 2000;
            iOException = e12;
            H(iOException, i7);
        } catch (RuntimeException e13) {
            e7 = r.j(e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000);
            o2.r.d("ExoPlayerImplInternal", "Playback error", e7);
            j1(true, false);
            this.C = this.C.e(e7);
        } catch (n2 e14) {
            int i8 = e14.f20822g;
            if (i8 == 1) {
                r2 = e14.f20821f ? 3001 : 3003;
            } else if (i8 == 4) {
                r2 = e14.f20821f ? 3002 : 3004;
            }
            H(e14, r2);
        }
        Y();
        return true;
    }

    @Override // t1.u.a
    public void i(t1.u uVar) {
        this.f20833m.h(8, uVar).a();
    }

    public void i1() {
        this.f20833m.k(6).a();
    }

    @Override // r0.m.a
    public void j(u2 u2Var) {
        this.f20833m.h(16, u2Var).a();
    }

    @Override // t1.r0.a
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void l(t1.u uVar) {
        this.f20833m.h(9, uVar).a();
    }

    public void k0() {
        this.f20833m.k(0).a();
    }

    public synchronized boolean m0() {
        if (!this.E && this.f20834n.isAlive()) {
            this.f20833m.c(7);
            r1(new l4.o() { // from class: r0.n1
                @Override // l4.o
                public final Object get() {
                    Boolean V;
                    V = o1.this.V();
                    return V;
                }
            }, this.A);
            return this.E;
        }
        return true;
    }

    public void p0(int i7, int i8, t1.s0 s0Var) {
        this.f20833m.d(20, i7, i8, s0Var).a();
    }

    public void v(long j7) {
        this.U = j7;
    }

    public void w(boolean z6) {
        this.f20833m.b(24, z6 ? 1 : 0, 0).a();
    }
}
