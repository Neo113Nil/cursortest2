package com.anythink.core.common.n.b.a.b;

import com.anythink.core.common.n.b.a.k.a;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.c.n;
import com.anythink.core.common.n.c.v;
import com.anythink.core.common.n.c.w;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    final j f15110a;

    /* renamed from: b, reason: collision with root package name */
    final com.anythink.core.common.n.b.e f15111b;

    /* renamed from: c, reason: collision with root package name */
    final r f15112c;

    /* renamed from: d, reason: collision with root package name */
    final d f15113d;

    /* renamed from: e, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.c.c f15114e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15115f;

    public final class b extends com.anythink.core.common.n.c.i {

        /* renamed from: b, reason: collision with root package name */
        private final long f15122b;

        /* renamed from: c, reason: collision with root package name */
        private long f15123c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15124d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15125e;

        public b(w wVar, long j9) {
            super(wVar);
            this.f15122b = j9;
            if (j9 == 0) {
                a(null);
            }
        }

        private IOException a(IOException iOException) {
            if (this.f15124d) {
                return iOException;
            }
            this.f15124d = true;
            return c.this.a(true, false, iOException);
        }

        @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w
        public final long a_(com.anythink.core.common.n.c.c cVar, long j9) {
            if (this.f15125e) {
                throw new IllegalStateException("closed");
            }
            try {
                long a_ = b().a_(cVar, j9);
                if (a_ == -1) {
                    a(null);
                    return -1L;
                }
                long j10 = this.f15123c + a_;
                long j11 = this.f15122b;
                if (j11 != -1 && j10 > j11) {
                    throw new ProtocolException("expected " + this.f15122b + " bytes but received " + j10);
                }
                this.f15123c = j10;
                if (j10 == j11) {
                    a(null);
                }
                return a_;
            } catch (IOException e6) {
                throw a(e6);
            }
        }

        @Override // com.anythink.core.common.n.c.i, com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15125e) {
                return;
            }
            this.f15125e = true;
            try {
                super.close();
                a(null);
            } catch (IOException e6) {
                throw a(e6);
            }
        }
    }

    public c(j jVar, com.anythink.core.common.n.b.e eVar, r rVar, d dVar, com.anythink.core.common.n.b.a.c.c cVar) {
        this.f15110a = jVar;
        this.f15111b = eVar;
        this.f15112c = rVar;
        this.f15113d = dVar;
        this.f15114e = cVar;
    }

    private static void k() {
    }

    private static void l() {
    }

    private void m() {
        this.f15110a.c();
    }

    private void n() {
        this.f15114e.e();
    }

    public final e a() {
        return this.f15114e.a();
    }

    public final boolean b() {
        return this.f15115f;
    }

    public final void c() {
        try {
            this.f15114e.b();
        } catch (IOException e6) {
            a(e6);
            throw e6;
        }
    }

    public final void d() {
        try {
            this.f15114e.c();
        } catch (IOException e6) {
            a(e6);
            throw e6;
        }
    }

    public final u e() {
        return this.f15114e.d();
    }

    public final a.e f() {
        this.f15110a.c();
        return this.f15114e.a().a(this);
    }

    public final void g() {
        a(true, true, null);
    }

    public final void h() {
        this.f15114e.a().e();
    }

    public final void i() {
        this.f15114e.e();
        this.f15110a.a(this, true, true, null);
    }

    public final void j() {
        this.f15110a.a(this, true, false, null);
    }

    public final void a(ad adVar) {
        try {
            this.f15114e.a(adVar);
        } catch (IOException e6) {
            a(e6);
            throw e6;
        }
    }

    public final v b(ad adVar) {
        this.f15115f = false;
        long b9 = adVar.d().b();
        return new a(this.f15114e.a(adVar, b9), b9);
    }

    public final af.a a(boolean z8) {
        try {
            af.a a9 = this.f15114e.a(z8);
            if (a9 == null) {
                return a9;
            }
            com.anythink.core.common.n.b.a.a.f15027a.a(a9, this);
            return a9;
        } catch (IOException e6) {
            a(e6);
            throw e6;
        }
    }

    public final class a extends com.anythink.core.common.n.c.h {

        /* renamed from: b, reason: collision with root package name */
        private boolean f15117b;

        /* renamed from: c, reason: collision with root package name */
        private long f15118c;

        /* renamed from: d, reason: collision with root package name */
        private long f15119d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f15120e;

        public a(v vVar, long j9) {
            super(vVar);
            this.f15118c = j9;
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v
        public final void a(com.anythink.core.common.n.c.c cVar, long j9) {
            if (this.f15120e) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.f15118c;
            if (j10 == -1 || this.f15119d + j9 <= j10) {
                try {
                    super.a(cVar, j9);
                    this.f15119d += j9;
                    return;
                } catch (IOException e6) {
                    throw a(e6);
                }
            }
            throw new ProtocolException("expected " + this.f15118c + " bytes but received " + (this.f15119d + j9));
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f15120e) {
                return;
            }
            this.f15120e = true;
            long j9 = this.f15118c;
            if (j9 != -1 && this.f15119d != j9) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e6) {
                throw a(e6);
            }
        }

        @Override // com.anythink.core.common.n.c.h, com.anythink.core.common.n.c.v, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e6) {
                throw a(e6);
            }
        }

        private IOException a(IOException iOException) {
            if (this.f15117b) {
                return iOException;
            }
            this.f15117b = true;
            return c.this.a(false, true, iOException);
        }
    }

    public final ag a(af afVar) {
        try {
            String a9 = afVar.a("Content-Type");
            long a10 = this.f15114e.a(afVar);
            return new com.anythink.core.common.n.b.a.c.h(a9, a10, n.a(new b(this.f15114e.b(afVar), a10)));
        } catch (IOException e6) {
            a(e6);
            throw e6;
        }
    }

    private void a(IOException iOException) {
        this.f15113d.b();
        this.f15114e.a().a(iOException);
    }

    public final IOException a(boolean z8, boolean z9, IOException iOException) {
        if (iOException != null) {
            a(iOException);
        }
        return this.f15110a.a(this, z9, z8, iOException);
    }
}
