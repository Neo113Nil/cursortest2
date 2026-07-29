package org.apache.a.f.c;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: SingleClientConnManager.java */
/* loaded from: classes2.dex */
public class n implements org.apache.a.c.b {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.c.c.g f9848a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.a.c.d f9849b;

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f9850c;

    /* renamed from: d, reason: collision with root package name */
    protected b f9851d;
    protected a e;
    protected long f;
    protected long g;
    protected volatile boolean h;
    private final Log i;

    public n(org.apache.a.c.c.g gVar) {
        this.i = LogFactory.getLog(getClass());
        if (gVar == null) {
            throw new IllegalArgumentException("Scheme registry must not be null.");
        }
        this.f9848a = gVar;
        this.f9849b = a(gVar);
        this.f9851d = new b();
        this.e = null;
        this.f = -1L;
        this.f9850c = false;
        this.h = false;
    }

    public n() {
        this(m.a());
    }

    protected void finalize() throws Throwable {
        try {
            b();
        } finally {
            super.finalize();
        }
    }

    @Override // org.apache.a.c.b
    public org.apache.a.c.c.g a() {
        return this.f9848a;
    }

    protected org.apache.a.c.d a(org.apache.a.c.c.g gVar) {
        return new f(gVar);
    }

    protected final void c() throws IllegalStateException {
        if (this.h) {
            throw new IllegalStateException("Manager is shut down.");
        }
    }

    @Override // org.apache.a.c.b
    public final org.apache.a.c.e a(final org.apache.a.c.b.b bVar, final Object obj) {
        return new org.apache.a.c.e() { // from class: org.apache.a.f.c.n.1
            @Override // org.apache.a.c.e
            public void a() {
            }

            @Override // org.apache.a.c.e
            public org.apache.a.c.n a(long j, TimeUnit timeUnit) {
                return n.this.b(bVar, obj);
            }
        };
    }

    public synchronized org.apache.a.c.n b(org.apache.a.c.b.b bVar, Object obj) {
        boolean z;
        if (bVar == null) {
            throw new IllegalArgumentException("Route may not be null.");
        }
        c();
        if (this.i.isDebugEnabled()) {
            this.i.debug("Get connection for route " + bVar);
        }
        if (this.e != null) {
            throw new IllegalStateException("Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
        }
        d();
        boolean z2 = true;
        boolean z3 = false;
        if (this.f9851d.f9824b.d()) {
            org.apache.a.c.b.f fVar = this.f9851d.e;
            z = fVar == null || !fVar.h().equals(bVar);
        } else {
            z = false;
            z3 = true;
        }
        if (z) {
            try {
                this.f9851d.d();
            } catch (IOException e) {
                this.i.debug("Problem shutting down connection.", e);
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            this.f9851d = new b();
        }
        this.e = new a(this.f9851d, bVar);
        return this.e;
    }

    @Override // org.apache.a.c.b
    public synchronized void a(org.apache.a.c.n nVar, long j, TimeUnit timeUnit) {
        c();
        if (!(nVar instanceof a)) {
            throw new IllegalArgumentException("Connection class mismatch, connection not obtained from this manager.");
        }
        if (this.i.isDebugEnabled()) {
            this.i.debug("Releasing connection " + nVar);
        }
        a aVar = (a) nVar;
        if (aVar.f9827a == null) {
            return;
        }
        org.apache.a.c.b q = aVar.q();
        if (q != null && q != this) {
            throw new IllegalArgumentException("Connection not obtained from this manager.");
        }
        try {
            try {
                if (aVar.d() && (this.f9850c || !aVar.t())) {
                    if (this.i.isDebugEnabled()) {
                        this.i.debug("Released connection open but not reusable.");
                    }
                    aVar.f();
                }
            } catch (IOException e) {
                if (this.i.isDebugEnabled()) {
                    this.i.debug("Exception shutting down released connection.", e);
                }
                aVar.o();
                this.e = null;
                this.f = System.currentTimeMillis();
                if (j > 0) {
                    this.g = timeUnit.toMillis(j) + this.f;
                }
            }
        } finally {
            aVar.o();
            this.e = null;
            this.f = System.currentTimeMillis();
            if (j > 0) {
                this.g = timeUnit.toMillis(j) + this.f;
            } else {
                this.g = Long.MAX_VALUE;
            }
        }
    }

    public synchronized void d() {
        if (System.currentTimeMillis() >= this.g) {
            a(0L, TimeUnit.MILLISECONDS);
        }
    }

    public synchronized void a(long j, TimeUnit timeUnit) {
        c();
        if (timeUnit == null) {
            throw new IllegalArgumentException("Time unit must not be null.");
        }
        if (this.e == null && this.f9851d.f9824b.d()) {
            if (this.f <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                try {
                    this.f9851d.c();
                } catch (IOException e) {
                    this.i.debug("Problem closing idle connection.", e);
                }
            }
        }
    }

    @Override // org.apache.a.c.b
    public synchronized void b() {
        this.h = true;
        if (this.e != null) {
            this.e.o();
        }
        try {
            try {
                if (this.f9851d != null) {
                    this.f9851d.d();
                }
            } catch (IOException e) {
                this.i.debug("Problem while shutting down manager.", e);
            }
        } finally {
        }
    }

    /* compiled from: SingleClientConnManager.java */
    protected class b extends org.apache.a.f.c.b {
        protected b() {
            super(n.this.f9849b, null);
        }

        protected void c() throws IOException {
            b();
            if (this.f9824b.d()) {
                this.f9824b.c();
            }
        }

        protected void d() throws IOException {
            b();
            if (this.f9824b.d()) {
                this.f9824b.f();
            }
        }
    }

    /* compiled from: SingleClientConnManager.java */
    protected class a extends c {
        protected a(b bVar, org.apache.a.c.b.b bVar2) {
            super(n.this, bVar);
            n();
            bVar.f9825c = bVar2;
        }
    }
}
