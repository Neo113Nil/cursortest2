package org.apache.a.f.c.a;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.a.c.n;
import org.apache.a.f.c.m;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: ThreadSafeClientConnManager.java */
/* loaded from: classes2.dex */
public class g implements org.apache.a.c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.c.c.g f9810a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    protected final a f9811b;

    /* renamed from: c, reason: collision with root package name */
    protected final d f9812c;

    /* renamed from: d, reason: collision with root package name */
    protected final org.apache.a.c.d f9813d;
    protected final org.apache.a.c.a.c e;
    private final Log f;

    public g(org.apache.a.c.c.g gVar) {
        this(gVar, -1L, TimeUnit.MILLISECONDS);
    }

    public g() {
        this(m.a());
    }

    public g(org.apache.a.c.c.g gVar, long j, TimeUnit timeUnit) {
        if (gVar == null) {
            throw new IllegalArgumentException("Scheme registry may not be null");
        }
        this.f = LogFactory.getLog(getClass());
        this.f9810a = gVar;
        this.e = new org.apache.a.c.a.c();
        this.f9813d = a(gVar);
        this.f9812c = a(j, timeUnit);
        this.f9811b = this.f9812c;
    }

    @Deprecated
    public g(org.apache.a.i.d dVar, org.apache.a.c.c.g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("Scheme registry may not be null");
        }
        this.f = LogFactory.getLog(getClass());
        this.f9810a = gVar;
        this.e = new org.apache.a.c.a.c();
        this.f9813d = a(gVar);
        this.f9812c = (d) a(dVar);
        this.f9811b = this.f9812c;
    }

    protected void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    @Deprecated
    protected a a(org.apache.a.i.d dVar) {
        return new d(this.f9813d, dVar);
    }

    protected d a(long j, TimeUnit timeUnit) {
        return new d(this.f9813d, this.e, 20, j, timeUnit);
    }

    protected org.apache.a.c.d a(org.apache.a.c.c.g gVar) {
        return new org.apache.a.f.c.f(gVar);
    }

    @Override // org.apache.a.c.b
    public org.apache.a.c.c.g a() {
        return this.f9810a;
    }

    @Override // org.apache.a.c.b
    public org.apache.a.c.e a(final org.apache.a.c.b.b bVar, Object obj) {
        final e a2 = this.f9812c.a(bVar, obj);
        return new org.apache.a.c.e() { // from class: org.apache.a.f.c.a.g.1
            @Override // org.apache.a.c.e
            public void a() {
                a2.a();
            }

            @Override // org.apache.a.c.e
            public n a(long j, TimeUnit timeUnit) throws InterruptedException, org.apache.a.c.h {
                if (bVar != null) {
                    if (g.this.f.isDebugEnabled()) {
                        g.this.f.debug("Get connection: " + bVar + ", timeout = " + j);
                    }
                    return new c(g.this, a2.a(j, timeUnit));
                }
                throw new IllegalArgumentException("Route may not be null.");
            }
        };
    }

    @Override // org.apache.a.c.b
    public void a(n nVar, long j, TimeUnit timeUnit) {
        boolean t;
        d dVar;
        if (!(nVar instanceof c)) {
            throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager.");
        }
        c cVar = (c) nVar;
        if (cVar.u() != null && cVar.q() != this) {
            throw new IllegalArgumentException("Connection not obtained from this manager.");
        }
        synchronized (cVar) {
            b bVar = (b) cVar.u();
            if (bVar == null) {
                return;
            }
            try {
                try {
                    if (cVar.d() && !cVar.t()) {
                        cVar.f();
                    }
                    t = cVar.t();
                    if (this.f.isDebugEnabled()) {
                        if (t) {
                            this.f.debug("Released connection is reusable.");
                        } else {
                            this.f.debug("Released connection is not reusable.");
                        }
                    }
                    cVar.o();
                    dVar = this.f9812c;
                } catch (IOException e) {
                    if (this.f.isDebugEnabled()) {
                        this.f.debug("Exception shutting down released connection.", e);
                    }
                    t = cVar.t();
                    if (this.f.isDebugEnabled()) {
                        if (t) {
                            this.f.debug("Released connection is reusable.");
                        } else {
                            this.f.debug("Released connection is not reusable.");
                        }
                    }
                    cVar.o();
                    dVar = this.f9812c;
                }
                dVar.a(bVar, t, j, timeUnit);
            } catch (Throwable th) {
                boolean t2 = cVar.t();
                if (this.f.isDebugEnabled()) {
                    if (t2) {
                        this.f.debug("Released connection is reusable.");
                    } else {
                        this.f.debug("Released connection is not reusable.");
                    }
                }
                cVar.o();
                this.f9812c.a(bVar, t2, j, timeUnit);
                throw th;
            }
        }
    }

    @Override // org.apache.a.c.b
    public void b() {
        this.f.debug("Shutting down");
        this.f9812c.a();
    }
}
