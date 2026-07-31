package z1;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m4.t;
import n2.c0;
import n2.g0;
import n2.h0;
import n2.j0;
import o2.m0;
import r0.n2;
import t1.e0;
import t1.q;
import z1.c;
import z1.g;
import z1.h;
import z1.j;
import z1.l;

/* loaded from: classes.dex */
public final class c implements l, h0.b<j0<i>> {

    /* renamed from: u, reason: collision with root package name */
    public static final l.a f23505u = new l.a() { // from class: z1.b
        @Override // z1.l.a
        public final l a(y1.g gVar, g0 g0Var, k kVar) {
            return new c(gVar, g0Var, kVar);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private final y1.g f23506f;

    /* renamed from: g, reason: collision with root package name */
    private final k f23507g;

    /* renamed from: h, reason: collision with root package name */
    private final g0 f23508h;

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<Uri, C0158c> f23509i;

    /* renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList<l.b> f23510j;

    /* renamed from: k, reason: collision with root package name */
    private final double f23511k;

    /* renamed from: l, reason: collision with root package name */
    private e0.a f23512l;

    /* renamed from: m, reason: collision with root package name */
    private h0 f23513m;

    /* renamed from: n, reason: collision with root package name */
    private Handler f23514n;

    /* renamed from: o, reason: collision with root package name */
    private l.e f23515o;

    /* renamed from: p, reason: collision with root package name */
    private h f23516p;

    /* renamed from: q, reason: collision with root package name */
    private Uri f23517q;

    /* renamed from: r, reason: collision with root package name */
    private g f23518r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23519s;

    /* renamed from: t, reason: collision with root package name */
    private long f23520t;

    private class b implements l.b {
        private b() {
        }

        @Override // z1.l.b
        public void d() {
            c.this.f23510j.remove(this);
        }

        @Override // z1.l.b
        public boolean j(Uri uri, g0.c cVar, boolean z6) {
            C0158c c0158c;
            if (c.this.f23518r == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<h.b> list = ((h) m0.j(c.this.f23516p)).f23581e;
                int i7 = 0;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    C0158c c0158c2 = (C0158c) c.this.f23509i.get(list.get(i8).f23594a);
                    if (c0158c2 != null && elapsedRealtime < c0158c2.f23529m) {
                        i7++;
                    }
                }
                g0.b b7 = c.this.f23508h.b(new g0.a(1, 0, c.this.f23516p.f23581e.size(), i7), cVar);
                if (b7 != null && b7.f19422a == 2 && (c0158c = (C0158c) c.this.f23509i.get(uri)) != null) {
                    c0158c.h(b7.f19423b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1.c$c, reason: collision with other inner class name */
    final class C0158c implements h0.b<j0<i>> {

        /* renamed from: f, reason: collision with root package name */
        private final Uri f23522f;

        /* renamed from: g, reason: collision with root package name */
        private final h0 f23523g = new h0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: h, reason: collision with root package name */
        private final n2.l f23524h;

        /* renamed from: i, reason: collision with root package name */
        private g f23525i;

        /* renamed from: j, reason: collision with root package name */
        private long f23526j;

        /* renamed from: k, reason: collision with root package name */
        private long f23527k;

        /* renamed from: l, reason: collision with root package name */
        private long f23528l;

        /* renamed from: m, reason: collision with root package name */
        private long f23529m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f23530n;

        /* renamed from: o, reason: collision with root package name */
        private IOException f23531o;

        public C0158c(Uri uri) {
            this.f23522f = uri;
            this.f23524h = c.this.f23506f.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j7) {
            this.f23529m = SystemClock.elapsedRealtime() + j7;
            return this.f23522f.equals(c.this.f23517q) && !c.this.M();
        }

        private Uri i() {
            g gVar = this.f23525i;
            if (gVar != null) {
                g.f fVar = gVar.f23555v;
                if (fVar.f23574a != -9223372036854775807L || fVar.f23578e) {
                    Uri.Builder buildUpon = this.f23522f.buildUpon();
                    g gVar2 = this.f23525i;
                    if (gVar2.f23555v.f23578e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f23544k + gVar2.f23551r.size()));
                        g gVar3 = this.f23525i;
                        if (gVar3.f23547n != -9223372036854775807L) {
                            List<g.b> list = gVar3.f23552s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) t.c(list)).f23557r) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f23525i.f23555v;
                    if (fVar2.f23574a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f23575b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f23522f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(Uri uri) {
            this.f23530n = false;
            q(uri);
        }

        private void q(Uri uri) {
            j0 j0Var = new j0(this.f23524h, uri, 4, c.this.f23507g.a(c.this.f23516p, this.f23525i));
            c.this.f23512l.z(new q(j0Var.f19458a, j0Var.f19459b, this.f23523g.n(j0Var, this, c.this.f23508h.d(j0Var.f19460c))), j0Var.f19460c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(final Uri uri) {
            this.f23529m = 0L;
            if (this.f23530n || this.f23523g.j() || this.f23523g.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f23528l) {
                q(uri);
            } else {
                this.f23530n = true;
                c.this.f23514n.postDelayed(new Runnable() { // from class: z1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0158c.this.n(uri);
                    }
                }, this.f23528l - elapsedRealtime);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(g gVar, q qVar) {
            IOException dVar;
            boolean z6;
            g gVar2 = this.f23525i;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f23526j = elapsedRealtime;
            g H = c.this.H(gVar2, gVar);
            this.f23525i = H;
            if (H != gVar2) {
                this.f23531o = null;
                this.f23527k = elapsedRealtime;
                c.this.S(this.f23522f, H);
            } else if (!H.f23548o) {
                long size = gVar.f23544k + gVar.f23551r.size();
                g gVar3 = this.f23525i;
                if (size < gVar3.f23544k) {
                    dVar = new l.c(this.f23522f);
                    z6 = true;
                } else {
                    double d7 = elapsedRealtime - this.f23527k;
                    double Y0 = m0.Y0(gVar3.f23546m);
                    double d8 = c.this.f23511k;
                    Double.isNaN(Y0);
                    dVar = d7 > Y0 * d8 ? new l.d(this.f23522f) : null;
                    z6 = false;
                }
                if (dVar != null) {
                    this.f23531o = dVar;
                    c.this.O(this.f23522f, new g0.c(qVar, new t1.t(4), dVar, 1), z6);
                }
            }
            long j7 = 0;
            g gVar4 = this.f23525i;
            if (!gVar4.f23555v.f23578e) {
                j7 = gVar4.f23546m;
                if (gVar4 == gVar2) {
                    j7 /= 2;
                }
            }
            this.f23528l = elapsedRealtime + m0.Y0(j7);
            if (!(this.f23525i.f23547n != -9223372036854775807L || this.f23522f.equals(c.this.f23517q)) || this.f23525i.f23548o) {
                return;
            }
            r(i());
        }

        public g j() {
            return this.f23525i;
        }

        public boolean k() {
            int i7;
            if (this.f23525i == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, m0.Y0(this.f23525i.f23554u));
            g gVar = this.f23525i;
            return gVar.f23548o || (i7 = gVar.f23537d) == 2 || i7 == 1 || this.f23526j + max > elapsedRealtime;
        }

        public void p() {
            r(this.f23522f);
        }

        public void s() {
            this.f23523g.b();
            IOException iOException = this.f23531o;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // n2.h0.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m(j0<i> j0Var, long j7, long j8, boolean z6) {
            q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
            c.this.f23508h.a(j0Var.f19458a);
            c.this.f23512l.q(qVar, 4);
        }

        @Override // n2.h0.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void l(j0<i> j0Var, long j7, long j8) {
            i e7 = j0Var.e();
            q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
            if (e7 instanceof g) {
                w((g) e7, qVar);
                c.this.f23512l.t(qVar, 4);
            } else {
                this.f23531o = n2.c("Loaded playlist has unexpected type.", null);
                c.this.f23512l.x(qVar, 4, this.f23531o, true);
            }
            c.this.f23508h.a(j0Var.f19458a);
        }

        @Override // n2.h0.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public h0.c o(j0<i> j0Var, long j7, long j8, IOException iOException, int i7) {
            h0.c cVar;
            q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
            boolean z6 = iOException instanceof j.a;
            if ((j0Var.f().getQueryParameter("_HLS_msn") != null) || z6) {
                int i8 = iOException instanceof c0 ? ((c0) iOException).f19398i : Integer.MAX_VALUE;
                if (z6 || i8 == 400 || i8 == 503) {
                    this.f23528l = SystemClock.elapsedRealtime();
                    p();
                    ((e0.a) m0.j(c.this.f23512l)).x(qVar, j0Var.f19460c, iOException, true);
                    return h0.f19436f;
                }
            }
            g0.c cVar2 = new g0.c(qVar, new t1.t(j0Var.f19460c), iOException, i7);
            if (c.this.O(this.f23522f, cVar2, false)) {
                long c7 = c.this.f23508h.c(cVar2);
                cVar = c7 != -9223372036854775807L ? h0.h(false, c7) : h0.f19437g;
            } else {
                cVar = h0.f19436f;
            }
            boolean c8 = true ^ cVar.c();
            c.this.f23512l.x(qVar, j0Var.f19460c, iOException, c8);
            if (c8) {
                c.this.f23508h.a(j0Var.f19458a);
            }
            return cVar;
        }

        public void x() {
            this.f23523g.l();
        }
    }

    public c(y1.g gVar, g0 g0Var, k kVar) {
        this(gVar, g0Var, kVar, 3.5d);
    }

    public c(y1.g gVar, g0 g0Var, k kVar, double d7) {
        this.f23506f = gVar;
        this.f23507g = kVar;
        this.f23508h = g0Var;
        this.f23511k = d7;
        this.f23510j = new CopyOnWriteArrayList<>();
        this.f23509i = new HashMap<>();
        this.f23520t = -9223372036854775807L;
    }

    private void F(List<Uri> list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri = list.get(i7);
            this.f23509i.put(uri, new C0158c(uri));
        }
    }

    private static g.d G(g gVar, g gVar2) {
        int i7 = (int) (gVar2.f23544k - gVar.f23544k);
        List<g.d> list = gVar.f23551r;
        if (i7 < list.size()) {
            return list.get(i7);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g H(g gVar, g gVar2) {
        return !gVar2.f(gVar) ? gVar2.f23548o ? gVar.d() : gVar : gVar2.c(J(gVar, gVar2), I(gVar, gVar2));
    }

    private int I(g gVar, g gVar2) {
        g.d G;
        if (gVar2.f23542i) {
            return gVar2.f23543j;
        }
        g gVar3 = this.f23518r;
        int i7 = gVar3 != null ? gVar3.f23543j : 0;
        return (gVar == null || (G = G(gVar, gVar2)) == null) ? i7 : (gVar.f23543j + G.f23566i) - gVar2.f23551r.get(0).f23566i;
    }

    private long J(g gVar, g gVar2) {
        if (gVar2.f23549p) {
            return gVar2.f23541h;
        }
        g gVar3 = this.f23518r;
        long j7 = gVar3 != null ? gVar3.f23541h : 0L;
        if (gVar == null) {
            return j7;
        }
        int size = gVar.f23551r.size();
        g.d G = G(gVar, gVar2);
        return G != null ? gVar.f23541h + G.f23567j : ((long) size) == gVar2.f23544k - gVar.f23544k ? gVar.e() : j7;
    }

    private Uri K(Uri uri) {
        g.c cVar;
        g gVar = this.f23518r;
        if (gVar == null || !gVar.f23555v.f23578e || (cVar = gVar.f23553t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f23559b));
        int i7 = cVar.f23560c;
        if (i7 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return buildUpon.build();
    }

    private boolean L(Uri uri) {
        List<h.b> list = this.f23516p.f23581e;
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (uri.equals(list.get(i7).f23594a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean M() {
        List<h.b> list = this.f23516p.f23581e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            C0158c c0158c = (C0158c) o2.a.e(this.f23509i.get(list.get(i7).f23594a));
            if (elapsedRealtime > c0158c.f23529m) {
                Uri uri = c0158c.f23522f;
                this.f23517q = uri;
                c0158c.r(K(uri));
                return true;
            }
        }
        return false;
    }

    private void N(Uri uri) {
        if (uri.equals(this.f23517q) || !L(uri)) {
            return;
        }
        g gVar = this.f23518r;
        if (gVar == null || !gVar.f23548o) {
            this.f23517q = uri;
            C0158c c0158c = this.f23509i.get(uri);
            g gVar2 = c0158c.f23525i;
            if (gVar2 == null || !gVar2.f23548o) {
                c0158c.r(K(uri));
            } else {
                this.f23518r = gVar2;
                this.f23515o.h(gVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O(Uri uri, g0.c cVar, boolean z6) {
        Iterator<l.b> it = this.f23510j.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= !it.next().j(uri, cVar, z6);
        }
        return z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(Uri uri, g gVar) {
        if (uri.equals(this.f23517q)) {
            if (this.f23518r == null) {
                this.f23519s = !gVar.f23548o;
                this.f23520t = gVar.f23541h;
            }
            this.f23518r = gVar;
            this.f23515o.h(gVar);
        }
        Iterator<l.b> it = this.f23510j.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // z1.l
    public void B() {
        this.f23517q = null;
        this.f23518r = null;
        this.f23516p = null;
        this.f23520t = -9223372036854775807L;
        this.f23513m.l();
        this.f23513m = null;
        Iterator<C0158c> it = this.f23509i.values().iterator();
        while (it.hasNext()) {
            it.next().x();
        }
        this.f23514n.removeCallbacksAndMessages(null);
        this.f23514n = null;
        this.f23509i.clear();
    }

    @Override // n2.h0.b
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m(j0<i> j0Var, long j7, long j8, boolean z6) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        this.f23508h.a(j0Var.f19458a);
        this.f23512l.q(qVar, 4);
    }

    @Override // n2.h0.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void l(j0<i> j0Var, long j7, long j8) {
        i e7 = j0Var.e();
        boolean z6 = e7 instanceof g;
        h e8 = z6 ? h.e(e7.f23600a) : (h) e7;
        this.f23516p = e8;
        this.f23517q = e8.f23581e.get(0).f23594a;
        this.f23510j.add(new b());
        F(e8.f23580d);
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        C0158c c0158c = this.f23509i.get(this.f23517q);
        if (z6) {
            c0158c.w((g) e7, qVar);
        } else {
            c0158c.p();
        }
        this.f23508h.a(j0Var.f19458a);
        this.f23512l.t(qVar, 4);
    }

    @Override // n2.h0.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public h0.c o(j0<i> j0Var, long j7, long j8, IOException iOException, int i7) {
        q qVar = new q(j0Var.f19458a, j0Var.f19459b, j0Var.f(), j0Var.d(), j7, j8, j0Var.b());
        long c7 = this.f23508h.c(new g0.c(qVar, new t1.t(j0Var.f19460c), iOException, i7));
        boolean z6 = c7 == -9223372036854775807L;
        this.f23512l.x(qVar, j0Var.f19460c, iOException, z6);
        if (z6) {
            this.f23508h.a(j0Var.f19458a);
        }
        return z6 ? h0.f19437g : h0.h(false, c7);
    }

    @Override // z1.l
    public boolean a() {
        return this.f23519s;
    }

    @Override // z1.l
    public h b() {
        return this.f23516p;
    }

    @Override // z1.l
    public boolean c(Uri uri, long j7) {
        if (this.f23509i.get(uri) != null) {
            return !r2.h(j7);
        }
        return false;
    }

    @Override // z1.l
    public void d(Uri uri, e0.a aVar, l.e eVar) {
        this.f23514n = m0.w();
        this.f23512l = aVar;
        this.f23515o = eVar;
        j0 j0Var = new j0(this.f23506f.a(4), uri, 4, this.f23507g.b());
        o2.a.f(this.f23513m == null);
        h0 h0Var = new h0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f23513m = h0Var;
        aVar.z(new q(j0Var.f19458a, j0Var.f19459b, h0Var.n(j0Var, this, this.f23508h.d(j0Var.f19460c))), j0Var.f19460c);
    }

    @Override // z1.l
    public boolean e(Uri uri) {
        return this.f23509i.get(uri).k();
    }

    @Override // z1.l
    public void f() {
        h0 h0Var = this.f23513m;
        if (h0Var != null) {
            h0Var.b();
        }
        Uri uri = this.f23517q;
        if (uri != null) {
            g(uri);
        }
    }

    @Override // z1.l
    public void g(Uri uri) {
        this.f23509i.get(uri).s();
    }

    @Override // z1.l
    public void h(Uri uri) {
        this.f23509i.get(uri).p();
    }

    @Override // z1.l
    public g i(Uri uri, boolean z6) {
        g j7 = this.f23509i.get(uri).j();
        if (j7 != null && z6) {
            N(uri);
        }
        return j7;
    }

    @Override // z1.l
    public void j(l.b bVar) {
        this.f23510j.remove(bVar);
    }

    @Override // z1.l
    public void k(l.b bVar) {
        o2.a.e(bVar);
        this.f23510j.add(bVar);
    }

    @Override // z1.l
    public long n() {
        return this.f23520t;
    }
}
