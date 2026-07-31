package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import n2.i;
import o2.a0;
import o2.m0;
import r0.n2;
import r0.s1;
import r0.t1;
import t1.p0;
import v1.f;
import w0.d0;
import w0.e0;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private final n2.b f2314f;

    /* renamed from: g, reason: collision with root package name */
    private final b f2315g;

    /* renamed from: k, reason: collision with root package name */
    private x1.c f2319k;

    /* renamed from: l, reason: collision with root package name */
    private long f2320l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f2321m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f2322n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2323o;

    /* renamed from: j, reason: collision with root package name */
    private final TreeMap<Long, Long> f2318j = new TreeMap<>();

    /* renamed from: i, reason: collision with root package name */
    private final Handler f2317i = m0.x(this);

    /* renamed from: h, reason: collision with root package name */
    private final l1.b f2316h = new l1.b();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f2324a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2325b;

        public a(long j7, long j8) {
            this.f2324a = j7;
            this.f2325b = j8;
        }
    }

    public interface b {
        void a();

        void b(long j7);
    }

    public final class c implements e0 {

        /* renamed from: a, reason: collision with root package name */
        private final p0 f2326a;

        /* renamed from: b, reason: collision with root package name */
        private final t1 f2327b = new t1();

        /* renamed from: c, reason: collision with root package name */
        private final j1.e f2328c = new j1.e();

        /* renamed from: d, reason: collision with root package name */
        private long f2329d = -9223372036854775807L;

        c(n2.b bVar) {
            this.f2326a = p0.l(bVar);
        }

        private j1.e g() {
            this.f2328c.h();
            if (this.f2326a.S(this.f2327b, this.f2328c, 0, false) != -4) {
                return null;
            }
            this.f2328c.s();
            return this.f2328c;
        }

        private void k(long j7, long j8) {
            e.this.f2317i.sendMessage(e.this.f2317i.obtainMessage(1, new a(j7, j8)));
        }

        private void l() {
            while (this.f2326a.K(false)) {
                j1.e g7 = g();
                if (g7 != null) {
                    long j7 = g7.f22413j;
                    j1.a a7 = e.this.f2316h.a(g7);
                    if (a7 != null) {
                        l1.a aVar = (l1.a) a7.g(0);
                        if (e.h(aVar.f18527f, aVar.f18528g)) {
                            m(j7, aVar);
                        }
                    }
                }
            }
            this.f2326a.s();
        }

        private void m(long j7, l1.a aVar) {
            long f7 = e.f(aVar);
            if (f7 == -9223372036854775807L) {
                return;
            }
            k(j7, f7);
        }

        @Override // w0.e0
        public /* synthetic */ int a(i iVar, int i7, boolean z6) {
            return d0.a(this, iVar, i7, z6);
        }

        @Override // w0.e0
        public void b(long j7, int i7, int i8, int i9, e0.a aVar) {
            this.f2326a.b(j7, i7, i8, i9, aVar);
            l();
        }

        @Override // w0.e0
        public void c(a0 a0Var, int i7, int i8) {
            this.f2326a.d(a0Var, i7);
        }

        @Override // w0.e0
        public /* synthetic */ void d(a0 a0Var, int i7) {
            d0.b(this, a0Var, i7);
        }

        @Override // w0.e0
        public void e(s1 s1Var) {
            this.f2326a.e(s1Var);
        }

        @Override // w0.e0
        public int f(i iVar, int i7, boolean z6, int i8) {
            return this.f2326a.a(iVar, i7, z6);
        }

        public boolean h(long j7) {
            return e.this.j(j7);
        }

        public void i(f fVar) {
            long j7 = this.f2329d;
            if (j7 == -9223372036854775807L || fVar.f22754h > j7) {
                this.f2329d = fVar.f22754h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            long j7 = this.f2329d;
            return e.this.n(j7 != -9223372036854775807L && j7 < fVar.f22753g);
        }

        public void n() {
            this.f2326a.T();
        }
    }

    public e(x1.c cVar, b bVar, n2.b bVar2) {
        this.f2319k = cVar;
        this.f2315g = bVar;
        this.f2314f = bVar2;
    }

    private Map.Entry<Long, Long> e(long j7) {
        return this.f2318j.ceilingEntry(Long.valueOf(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(l1.a aVar) {
        try {
            return m0.I0(m0.D(aVar.f18531j));
        } catch (n2 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j7, long j8) {
        Long l7 = this.f2318j.get(Long.valueOf(j8));
        if (l7 != null && l7.longValue() <= j7) {
            return;
        }
        this.f2318j.put(Long.valueOf(j8), Long.valueOf(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void i() {
        if (this.f2321m) {
            this.f2322n = true;
            this.f2321m = false;
            this.f2315g.a();
        }
    }

    private void l() {
        this.f2315g.b(this.f2320l);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f2318j.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f2319k.f23098h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f2323o) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f2324a, aVar.f2325b);
        return true;
    }

    boolean j(long j7) {
        x1.c cVar = this.f2319k;
        boolean z6 = false;
        if (!cVar.f23094d) {
            return false;
        }
        if (this.f2322n) {
            return true;
        }
        Map.Entry<Long, Long> e7 = e(cVar.f23098h);
        if (e7 != null && e7.getValue().longValue() < j7) {
            this.f2320l = e7.getKey().longValue();
            l();
            z6 = true;
        }
        if (z6) {
            i();
        }
        return z6;
    }

    public c k() {
        return new c(this.f2314f);
    }

    void m(f fVar) {
        this.f2321m = true;
    }

    boolean n(boolean z6) {
        if (!this.f2319k.f23094d) {
            return false;
        }
        if (this.f2322n) {
            return true;
        }
        if (!z6) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f2323o = true;
        this.f2317i.removeCallbacksAndMessages(null);
    }

    public void q(x1.c cVar) {
        this.f2322n = false;
        this.f2320l = -9223372036854775807L;
        this.f2319k = cVar;
        p();
    }
}
