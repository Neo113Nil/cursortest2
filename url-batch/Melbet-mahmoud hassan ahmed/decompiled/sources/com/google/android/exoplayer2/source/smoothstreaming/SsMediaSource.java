package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import b2.a;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n2.g0;
import n2.h0;
import n2.i0;
import n2.j0;
import n2.l;
import n2.p0;
import o2.m0;
import r0.a2;
import r0.p1;
import t1.e0;
import t1.i;
import t1.q;
import t1.t;
import t1.u;
import t1.u0;
import t1.x;
import v0.b0;
import v0.y;

/* loaded from: classes.dex */
public final class SsMediaSource extends t1.a implements h0.b<j0<b2.a>> {
    private h0 A;
    private i0 B;
    private p0 C;
    private long D;
    private b2.a E;
    private Handler F;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f2359m;

    /* renamed from: n, reason: collision with root package name */
    private final Uri f2360n;

    /* renamed from: o, reason: collision with root package name */
    private final a2.h f2361o;

    /* renamed from: p, reason: collision with root package name */
    private final a2 f2362p;

    /* renamed from: q, reason: collision with root package name */
    private final l.a f2363q;

    /* renamed from: r, reason: collision with root package name */
    private final b.a f2364r;

    /* renamed from: s, reason: collision with root package name */
    private final i f2365s;

    /* renamed from: t, reason: collision with root package name */
    private final y f2366t;

    /* renamed from: u, reason: collision with root package name */
    private final g0 f2367u;

    /* renamed from: v, reason: collision with root package name */
    private final long f2368v;

    /* renamed from: w, reason: collision with root package name */
    private final e0.a f2369w;

    /* renamed from: x, reason: collision with root package name */
    private final j0.a<? extends b2.a> f2370x;

    /* renamed from: y, reason: collision with root package name */
    private final ArrayList<c> f2371y;

    /* renamed from: z, reason: collision with root package name */
    private l f2372z;

    public static final class Factory implements x.a {

        /* renamed from: a, reason: collision with root package name */
        private final b.a f2373a;

        /* renamed from: b, reason: collision with root package name */
        private final l.a f2374b;

        /* renamed from: c, reason: collision with root package name */
        private i f2375c;

        /* renamed from: d, reason: collision with root package name */
        private b0 f2376d;

        /* renamed from: e, reason: collision with root package name */
        private g0 f2377e;

        /* renamed from: f, reason: collision with root package name */
        private long f2378f;

        /* renamed from: g, reason: collision with root package name */
        private j0.a<? extends b2.a> f2379g;

        public Factory(b.a aVar, l.a aVar2) {
            this.f2373a = (b.a) o2.a.e(aVar);
            this.f2374b = aVar2;
            this.f2376d = new v0.l();
            this.f2377e = new n2.x();
            this.f2378f = 30000L;
            this.f2375c = new t1.l();
        }

        public Factory(l.a aVar) {
            this(new a.C0046a(aVar), aVar);
        }

        public SsMediaSource a(a2 a2Var) {
            o2.a.e(a2Var.f20393g);
            j0.a aVar = this.f2379g;
            if (aVar == null) {
                aVar = new b2.b();
            }
            List<s1.c> list = a2Var.f20393g.f20461e;
            return new SsMediaSource(a2Var, null, this.f2374b, !list.isEmpty() ? new s1.b(aVar, list) : aVar, this.f2373a, this.f2375c, this.f2376d.a(a2Var), this.f2377e, this.f2378f);
        }
    }

    static {
        p1.a("goog.exo.smoothstreaming");
    }

    private SsMediaSource(a2 a2Var, b2.a aVar, l.a aVar2, j0.a<? extends b2.a> aVar3, b.a aVar4, i iVar, y yVar, g0 g0Var, long j7) {
        o2.a.f(aVar == null || !aVar.f1632d);
        this.f2362p = a2Var;
        a2.h hVar = (a2.h) o2.a.e(a2Var.f20393g);
        this.f2361o = hVar;
        this.E = aVar;
        this.f2360n = hVar.f20457a.equals(Uri.EMPTY) ? null : m0.B(hVar.f20457a);
        this.f2363q = aVar2;
        this.f2370x = aVar3;
        this.f2364r = aVar4;
        this.f2365s = iVar;
        this.f2366t = yVar;
        this.f2367u = g0Var;
        this.f2368v = j7;
        this.f2369w = w(null);
        this.f2359m = aVar != null;
        this.f2371y = new ArrayList<>();
    }

    private void J() {
        u0 u0Var;
        for (int i7 = 0; i7 < this.f2371y.size(); i7++) {
            this.f2371y.get(i7).w(this.E);
        }
        long j7 = Long.MIN_VALUE;
        long j8 = Long.MAX_VALUE;
        for (a.b bVar : this.E.f1634f) {
            if (bVar.f1650k > 0) {
                j8 = Math.min(j8, bVar.e(0));
                j7 = Math.max(j7, bVar.e(bVar.f1650k - 1) + bVar.c(bVar.f1650k - 1));
            }
        }
        if (j8 == Long.MAX_VALUE) {
            long j9 = this.E.f1632d ? -9223372036854775807L : 0L;
            b2.a aVar = this.E;
            boolean z6 = aVar.f1632d;
            u0Var = new u0(j9, 0L, 0L, 0L, true, z6, z6, aVar, this.f2362p);
        } else {
            b2.a aVar2 = this.E;
            if (aVar2.f1632d) {
                long j10 = aVar2.f1636h;
                if (j10 != -9223372036854775807L && j10 > 0) {
                    j8 = Math.max(j8, j7 - j10);
                }
                long j11 = j8;
                long j12 = j7 - j11;
                long B0 = j12 - m0.B0(this.f2368v);
                if (B0 < 5000000) {
                    B0 = Math.min(5000000L, j12 / 2);
                }
                u0Var = new u0(-9223372036854775807L, j12, j11, B0, true, true, true, this.E, this.f2362p);
            } else {
                long j13 = aVar2.f1635g;
                long j14 = j13 != -9223372036854775807L ? j13 : j7 - j8;
                u0Var = new u0(j8 + j14, j14, j8, 0L, true, false, false, this.E, this.f2362p);
            }
        }
        D(u0Var);
    }

    private void K() {
        if (this.E.f1632d) {
            this.F.postDelayed(new Runnable() { // from class: a2.a
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.L();
                }
            }, Math.max(0L, (this.D + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.A.i()) {
            return;
        }
        j0 j0Var = new j0(this.f2372z, this.f2360n, 4, this.f2370x);
        this.f2369w.z(new q(j0Var.f19458a, j0Var.f19459b, this.A.n(j0Var, this, this.f2367u.d(j0Var.f19460c))), j0Var.f19460c);
    }

    @Override // t1.a
    protected void C(p0 p0Var) {
        this.C = p0Var;
        this.f2366t.W();
        this.f2366t.c(Looper.myLooper(), A());
        if (this.f2359m) {
            this.B = new i0.a();
            J();
            return;
        }
        this.f2372z = this.f2363q.a();
        h0 h0Var = new h0("SsMediaSource");
        this.A = h0Var;
        this.B = h0Var;
        this.F = m0.w();
        L();
    }

    @Override // t1.a
    protected void E() {
        this.E = this.f2359m ? this.E : null;
        this.f2372z = null;
        this.D = 0L;
        h0 h0Var = this.A;
        if (h0Var != null) {
            h0Var.l();
            this.A = null;
        }
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.F = null;
        }
        this.f2366t.a();
    }

    @Override // n2.h0.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m(j0<b2.a> j0Var, long j7, long j8, boolean z6) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        this.f2367u.a(j0Var.f19458a);
        this.f2369w.q(qVar, j0Var.f19460c);
    }

    @Override // n2.h0.b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void l(j0<b2.a> j0Var, long j7, long j8) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        this.f2367u.a(j0Var.f19458a);
        this.f2369w.t(qVar, j0Var.f19460c);
        this.E = j0Var.e();
        this.D = j7 - j8;
        J();
        K();
    }

    @Override // n2.h0.b
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public h0.c o(j0<b2.a> j0Var, long j7, long j8, IOException iOException, int i7) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        long c7 = this.f2367u.c(new g0.c(qVar, new t(j0Var.f19460c), iOException, i7));
        h0.c h7 = c7 == -9223372036854775807L ? h0.f19437g : h0.h(false, c7);
        boolean z6 = !h7.c();
        this.f2369w.x(qVar, j0Var.f19460c, iOException, z6);
        if (z6) {
            this.f2367u.a(j0Var.f19458a);
        }
        return h7;
    }

    @Override // t1.x
    public a2 a() {
        return this.f2362p;
    }

    @Override // t1.x
    public void c() {
        this.B.b();
    }

    @Override // t1.x
    public void e(u uVar) {
        ((c) uVar).v();
        this.f2371y.remove(uVar);
    }

    @Override // t1.x
    public u j(x.b bVar, n2.b bVar2, long j7) {
        e0.a w6 = w(bVar);
        c cVar = new c(this.E, this.f2364r, this.C, this.f2365s, this.f2366t, u(bVar), this.f2367u, w6, this.B, bVar2);
        this.f2371y.add(cVar);
        return cVar;
    }
}
