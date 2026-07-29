package org.apache.a.f.b;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.a.z;
import org.apache.commons.logging.Log;

/* compiled from: DefaultRequestDirector.java */
/* loaded from: classes2.dex */
public class m implements org.apache.a.b.m {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.c.b f9777a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.a.c.b.d f9778b;

    /* renamed from: c, reason: collision with root package name */
    protected final org.apache.a.b f9779c;

    /* renamed from: d, reason: collision with root package name */
    protected final org.apache.a.c.g f9780d;
    protected final org.apache.a.j.g e;
    protected final org.apache.a.j.f f;
    protected final org.apache.a.b.h g;

    @Deprecated
    protected final org.apache.a.b.k h = null;
    protected final org.apache.a.b.l i;
    protected final org.apache.a.b.b j;
    protected final org.apache.a.b.b k;
    protected final org.apache.a.b.n l;
    protected final org.apache.a.i.d m;
    protected org.apache.a.c.n n;
    protected final org.apache.a.a.e o;
    protected final org.apache.a.a.e p;
    private final Log q;
    private int r;
    private int s;
    private int t;
    private org.apache.a.m u;

    public m(Log log, org.apache.a.j.g gVar, org.apache.a.c.b bVar, org.apache.a.b bVar2, org.apache.a.c.g gVar2, org.apache.a.c.b.d dVar, org.apache.a.j.f fVar, org.apache.a.b.h hVar, org.apache.a.b.l lVar, org.apache.a.b.b bVar3, org.apache.a.b.b bVar4, org.apache.a.b.n nVar, org.apache.a.i.d dVar2) {
        if (log == null) {
            throw new IllegalArgumentException("Log may not be null.");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        }
        if (bVar2 == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        }
        if (gVar2 == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("Redirect strategy may not be null.");
        }
        if (bVar3 == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        }
        if (bVar4 == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        }
        if (nVar == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        }
        if (dVar2 == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        this.q = log;
        this.e = gVar;
        this.f9777a = bVar;
        this.f9779c = bVar2;
        this.f9780d = gVar2;
        this.f9778b = dVar;
        this.f = fVar;
        this.g = hVar;
        this.i = lVar;
        this.j = bVar3;
        this.k = bVar4;
        this.l = nVar;
        this.m = dVar2;
        this.n = null;
        this.r = 0;
        this.s = 0;
        this.t = this.m.a("http.protocol.max-redirects", 100);
        this.o = new org.apache.a.a.e();
        this.p = new org.apache.a.a.e();
    }

    private r a(org.apache.a.p pVar) throws z {
        if (pVar instanceof org.apache.a.k) {
            return new p((org.apache.a.k) pVar);
        }
        return new r(pVar);
    }

    protected void a(r rVar, org.apache.a.c.b.b bVar) throws z {
        try {
            URI uri = rVar.getURI();
            if (bVar.d() != null && !bVar.e()) {
                if (uri.isAbsolute()) {
                    return;
                }
                rVar.a(org.apache.a.b.e.b.a(uri, bVar.a()));
            } else if (uri.isAbsolute()) {
                rVar.a(org.apache.a.b.e.b.a(uri, (org.apache.a.m) null));
            }
        } catch (URISyntaxException e) {
            throw new z("Invalid URI: " + rVar.getRequestLine().c(), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f8, code lost:
    
        r10.n.n();
     */
    @Override // org.apache.a.b.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.apache.a.r a(org.apache.a.m mVar, org.apache.a.p pVar, org.apache.a.j.e eVar) throws org.apache.a.l, IOException {
        String str;
        int b2;
        r a2 = a(pVar);
        a2.setParams(this.m);
        org.apache.a.c.b.b b3 = b(mVar, a2, eVar);
        this.u = (org.apache.a.m) pVar.getParams().a("http.virtual-host");
        if (this.u != null && this.u.b() == -1 && (b2 = mVar.b()) != -1) {
            this.u = new org.apache.a.m(this.u.a(), b2, this.u.c());
        }
        s sVar = new s(a2, b3);
        org.apache.a.r rVar = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                r a3 = sVar.a();
                org.apache.a.c.b.b b4 = sVar.b();
                Object a4 = eVar.a("http.user-token");
                if (this.n == null) {
                    org.apache.a.c.e a5 = this.f9777a.a(b4, a4);
                    if (pVar instanceof org.apache.a.b.b.a) {
                        ((org.apache.a.b.b.a) pVar).setConnectionRequest(a5);
                    }
                    try {
                        this.n = a5.a(org.apache.a.c.a.a.a(this.m), TimeUnit.MILLISECONDS);
                        if (org.apache.a.i.c.g(this.m) && this.n.d()) {
                            this.q.debug("Stale connection check");
                            if (this.n.e()) {
                                this.q.debug("Stale connection detected");
                                this.n.c();
                            }
                        }
                    } catch (InterruptedException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException();
                        interruptedIOException.initCause(e);
                        throw interruptedIOException;
                    }
                }
                if (pVar instanceof org.apache.a.b.b.a) {
                    ((org.apache.a.b.b.a) pVar).setReleaseTrigger(this.n);
                }
                try {
                    a(sVar, eVar);
                    a3.b();
                    a(a3, b4);
                    org.apache.a.m mVar2 = this.u;
                    if (mVar2 == null) {
                        mVar2 = b4.a();
                    }
                    org.apache.a.m d2 = b4.d();
                    eVar.a("http.target_host", mVar2);
                    eVar.a("http.proxy_host", d2);
                    eVar.a("http.connection", this.n);
                    eVar.a("http.auth.target-scope", this.o);
                    eVar.a("http.auth.proxy-scope", this.p);
                    this.e.a(a3, this.f, eVar);
                    rVar = b(sVar, eVar);
                    if (rVar != null) {
                        rVar.setParams(this.m);
                        this.e.a(rVar, this.f, eVar);
                        z2 = this.f9779c.a(rVar, eVar);
                        if (z2) {
                            long a6 = this.f9780d.a(rVar, eVar);
                            if (this.q.isDebugEnabled()) {
                                if (a6 > 0) {
                                    str = "for " + a6 + " " + TimeUnit.MILLISECONDS;
                                } else {
                                    str = "indefinitely";
                                }
                                this.q.debug("Connection can be kept alive " + str);
                            }
                            this.n.a(a6, TimeUnit.MILLISECONDS);
                        }
                        s a7 = a(sVar, rVar, eVar);
                        if (a7 == null) {
                            z = true;
                        } else {
                            if (z2) {
                                org.apache.a.k.d.a(rVar.b());
                                this.n.n();
                            } else {
                                this.n.c();
                                a(this.p);
                                a(this.o);
                            }
                            if (!a7.b().equals(sVar.b())) {
                                a();
                            }
                            sVar = a7;
                        }
                        if (this.n != null && a4 == null) {
                            Object a8 = this.l.a(eVar);
                            eVar.a("http.user-token", a8);
                            if (a8 != null) {
                                this.n.a(a8);
                            }
                        }
                    }
                } catch (t e2) {
                    if (this.q.isDebugEnabled()) {
                        this.q.debug(e2.getMessage());
                    }
                    rVar = e2.a();
                }
            } catch (IOException e3) {
                b();
                throw e3;
            } catch (org.apache.a.f.c.d e4) {
                InterruptedIOException interruptedIOException2 = new InterruptedIOException("Connection has been shut down");
                interruptedIOException2.initCause(e4);
                throw interruptedIOException2;
            } catch (RuntimeException e5) {
                b();
                throw e5;
            } catch (org.apache.a.l e6) {
                b();
                throw e6;
            }
        }
        if (rVar != null && rVar.b() != null && rVar.b().g()) {
            rVar.a(new org.apache.a.c.a(rVar.b(), this.n, z2));
            return rVar;
        }
        a();
        return rVar;
    }

    private void a(s sVar, org.apache.a.j.e eVar) throws org.apache.a.l, IOException {
        org.apache.a.c.b.b b2 = sVar.b();
        int i = 0;
        while (true) {
            i++;
            try {
                if (!this.n.d()) {
                    this.n.a(b2, eVar, this.m);
                } else {
                    this.n.b(org.apache.a.i.c.a(this.m));
                }
                a(b2, eVar);
                return;
            } catch (IOException e) {
                try {
                    this.n.c();
                } catch (IOException unused) {
                }
                if (this.g.a(e, i, eVar)) {
                    if (this.q.isInfoEnabled()) {
                        this.q.info("I/O exception (" + e.getClass().getName() + ") caught when connecting to the target host: " + e.getMessage());
                    }
                    if (this.q.isDebugEnabled()) {
                        this.q.debug(e.getMessage(), e);
                    }
                    this.q.info("Retrying connect");
                } else {
                    throw e;
                }
            }
        }
    }

    private org.apache.a.r b(s sVar, org.apache.a.j.e eVar) throws org.apache.a.l, IOException {
        r a2 = sVar.a();
        org.apache.a.c.b.b b2 = sVar.b();
        IOException e = null;
        while (true) {
            this.r++;
            a2.e();
            if (!a2.a()) {
                this.q.debug("Cannot retry non-repeatable request");
                if (e != null) {
                    throw new org.apache.a.b.i("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", e);
                }
                throw new org.apache.a.b.i("Cannot retry request with a non-repeatable request entity.");
            }
            try {
                if (!this.n.d()) {
                    if (!b2.e()) {
                        this.q.debug("Reopening the direct connection.");
                        this.n.a(b2, eVar, this.m);
                    } else {
                        this.q.debug("Proxied connection. Need to start over.");
                        return null;
                    }
                }
                if (this.q.isDebugEnabled()) {
                    this.q.debug("Attempt " + this.r + " to execute request");
                }
                return this.e.a(a2, this.n, eVar);
            } catch (IOException e2) {
                e = e2;
                this.q.debug("Closing the connection.");
                try {
                    this.n.c();
                } catch (IOException unused) {
                }
                if (this.g.a(e, a2.d(), eVar)) {
                    if (this.q.isInfoEnabled()) {
                        this.q.info("I/O exception (" + e.getClass().getName() + ") caught when processing request: " + e.getMessage());
                    }
                    if (this.q.isDebugEnabled()) {
                        this.q.debug(e.getMessage(), e);
                    }
                    this.q.info("Retrying request");
                } else {
                    throw e;
                }
            }
        }
    }

    protected void a() {
        try {
            this.n.i();
        } catch (IOException e) {
            this.q.debug("IOException releasing connection", e);
        }
        this.n = null;
    }

    protected org.apache.a.c.b.b b(org.apache.a.m mVar, org.apache.a.p pVar, org.apache.a.j.e eVar) throws org.apache.a.l {
        if (mVar == null) {
            mVar = (org.apache.a.m) pVar.getParams().a("http.default-host");
        }
        if (mVar == null) {
            throw new IllegalStateException("Target host must not be null, or set in parameters.");
        }
        return this.f9778b.a(mVar, pVar, eVar);
    }

    protected void a(org.apache.a.c.b.b bVar, org.apache.a.j.e eVar) throws org.apache.a.l, IOException {
        int a2;
        org.apache.a.c.b.a aVar = new org.apache.a.c.b.a();
        do {
            org.apache.a.c.b.b l = this.n.l();
            a2 = aVar.a(bVar, l);
            switch (a2) {
                case -1:
                    throw new org.apache.a.l("Unable to establish route: planned = " + bVar + "; current = " + l);
                case 0:
                    break;
                case 1:
                case 2:
                    this.n.a(bVar, eVar, this.m);
                    break;
                case 3:
                    boolean b2 = b(bVar, eVar);
                    this.q.debug("Tunnel to target created.");
                    this.n.a(b2, this.m);
                    break;
                case 4:
                    int c2 = l.c() - 1;
                    boolean a3 = a(bVar, c2, eVar);
                    this.q.debug("Tunnel to proxy created.");
                    this.n.a(bVar.a(c2), a3, this.m);
                    break;
                case 5:
                    this.n.a(eVar, this.m);
                    break;
                default:
                    throw new IllegalStateException("Unknown step indicator " + a2 + " from RouteDirector.");
            }
        } while (a2 > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean b(org.apache.a.c.b.b bVar, org.apache.a.j.e eVar) throws org.apache.a.l, IOException {
        org.apache.a.r rVar;
        org.apache.a.b.f fVar;
        boolean z;
        org.apache.a.m d2 = bVar.d();
        org.apache.a.m a2 = bVar.a();
        org.apache.a.r rVar2 = null;
        boolean z2 = false;
        while (true) {
            if (z2) {
                rVar = rVar2;
                break;
            }
            if (!this.n.d()) {
                this.n.a(bVar, eVar, this.m);
            }
            org.apache.a.p c2 = c(bVar, eVar);
            c2.setParams(this.m);
            eVar.a("http.target_host", a2);
            eVar.a("http.proxy_host", d2);
            eVar.a("http.connection", this.n);
            eVar.a("http.auth.target-scope", this.o);
            eVar.a("http.auth.proxy-scope", this.p);
            eVar.a("http.request", c2);
            this.e.a(c2, this.f, eVar);
            rVar = this.e.a(c2, this.n, eVar);
            rVar.setParams(this.m);
            this.e.a(rVar, this.f, eVar);
            if (rVar.a().b() < 200) {
                throw new org.apache.a.l("Unexpected response to CONNECT request: " + rVar.a());
            }
            org.apache.a.b.f fVar2 = (org.apache.a.b.f) eVar.a("http.auth.credentials-provider");
            if (fVar2 != null && org.apache.a.b.c.a.b(this.m)) {
                if (this.k.a(rVar, eVar)) {
                    this.q.debug("Proxy requested authentication");
                    try {
                        fVar = fVar2;
                    } catch (org.apache.a.a.f e) {
                        e = e;
                        fVar = fVar2;
                    }
                    try {
                        a(this.k.b(rVar, eVar), this.p, this.k, rVar, eVar);
                    } catch (org.apache.a.a.f e2) {
                        e = e2;
                        if (this.q.isWarnEnabled()) {
                            this.q.warn("Authentication error: " + e.getMessage());
                            if (rVar.a().b() <= 299) {
                            }
                        }
                        a(this.p, d2, fVar);
                        if (this.p.d() == null) {
                        }
                        z2 = z;
                        rVar2 = rVar;
                    }
                    a(this.p, d2, fVar);
                    if (this.p.d() == null) {
                        if (this.f9779c.a(rVar, eVar)) {
                            this.q.debug("Connection kept alive");
                            org.apache.a.k.d.a(rVar.b());
                        } else {
                            this.n.c();
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 = z;
                    rVar2 = rVar;
                } else {
                    this.p.a((org.apache.a.a.d) null);
                }
            }
            z2 = true;
            rVar2 = rVar;
        }
        if (rVar.a().b() <= 299) {
            org.apache.a.j b2 = rVar.b();
            if (b2 != null) {
                rVar.a(new org.apache.a.e.c(b2));
            }
            this.n.c();
            throw new t("CONNECT refused by proxy: " + rVar.a(), rVar);
        }
        this.n.n();
        return false;
    }

    protected boolean a(org.apache.a.c.b.b bVar, int i, org.apache.a.j.e eVar) throws org.apache.a.l, IOException {
        throw new org.apache.a.l("Proxy chains are not supported.");
    }

    protected org.apache.a.p c(org.apache.a.c.b.b bVar, org.apache.a.j.e eVar) {
        org.apache.a.m a2 = bVar.a();
        String a3 = a2.a();
        int b2 = a2.b();
        if (b2 < 0) {
            b2 = this.f9777a.a().a(a2.c()).a();
        }
        StringBuilder sb = new StringBuilder(a3.length() + 6);
        sb.append(a3);
        sb.append(':');
        sb.append(Integer.toString(b2));
        return new org.apache.a.h.g("CONNECT", sb.toString(), org.apache.a.i.e.b(this.m));
    }

    protected s a(s sVar, org.apache.a.r rVar, org.apache.a.j.e eVar) throws org.apache.a.l, IOException {
        org.apache.a.c.b.b b2 = sVar.b();
        r a2 = sVar.a();
        org.apache.a.i.d params = a2.getParams();
        if (org.apache.a.b.c.a.a(params) && this.i.a(a2, rVar, eVar)) {
            if (this.s >= this.t) {
                throw new org.apache.a.b.j("Maximum redirects (" + this.t + ") exceeded");
            }
            this.s++;
            this.u = null;
            org.apache.a.b.b.k b3 = this.i.b(a2, rVar, eVar);
            b3.setHeaders(a2.c().getAllHeaders());
            URI uri = b3.getURI();
            if (uri.getHost() == null) {
                throw new z("Redirect URI does not specify a valid host name: " + uri);
            }
            org.apache.a.m mVar = new org.apache.a.m(uri.getHost(), uri.getPort(), uri.getScheme());
            this.o.a((org.apache.a.a.d) null);
            this.p.a((org.apache.a.a.d) null);
            if (!b2.a().equals(mVar)) {
                this.o.a();
                org.apache.a.a.a c2 = this.p.c();
                if (c2 != null && c2.c()) {
                    this.p.a();
                }
            }
            r a3 = a(b3);
            a3.setParams(params);
            org.apache.a.c.b.b b4 = b(mVar, a3, eVar);
            s sVar2 = new s(a3, b4);
            if (this.q.isDebugEnabled()) {
                this.q.debug("Redirecting to '" + uri + "' via " + b4);
            }
            return sVar2;
        }
        org.apache.a.b.f fVar = (org.apache.a.b.f) eVar.a("http.auth.credentials-provider");
        if (fVar != null && org.apache.a.b.c.a.b(params)) {
            if (this.j.a(rVar, eVar)) {
                org.apache.a.m mVar2 = (org.apache.a.m) eVar.a("http.target_host");
                if (mVar2 == null) {
                    mVar2 = b2.a();
                }
                this.q.debug("Target requested authentication");
                try {
                    a(this.j.b(rVar, eVar), this.o, this.j, rVar, eVar);
                } catch (org.apache.a.a.f e) {
                    if (this.q.isWarnEnabled()) {
                        this.q.warn("Authentication error: " + e.getMessage());
                        return null;
                    }
                }
                a(this.o, mVar2, fVar);
                if (this.o.d() != null) {
                    return sVar;
                }
                return null;
            }
            this.o.a((org.apache.a.a.d) null);
            if (this.k.a(rVar, eVar)) {
                org.apache.a.m d2 = b2.d();
                this.q.debug("Proxy requested authentication");
                try {
                    a(this.k.b(rVar, eVar), this.p, this.k, rVar, eVar);
                } catch (org.apache.a.a.f e2) {
                    if (this.q.isWarnEnabled()) {
                        this.q.warn("Authentication error: " + e2.getMessage());
                        return null;
                    }
                }
                a(this.p, d2, fVar);
                if (this.p.d() != null) {
                    return sVar;
                }
                return null;
            }
            this.p.a((org.apache.a.a.d) null);
        }
        return null;
    }

    private void b() {
        org.apache.a.c.n nVar = this.n;
        if (nVar != null) {
            this.n = null;
            try {
                nVar.j();
            } catch (IOException e) {
                if (this.q.isDebugEnabled()) {
                    this.q.debug(e.getMessage(), e);
                }
            }
            try {
                nVar.i();
            } catch (IOException e2) {
                this.q.debug("Error releasing connection", e2);
            }
        }
    }

    private void a(Map<String, org.apache.a.d> map, org.apache.a.a.e eVar, org.apache.a.b.b bVar, org.apache.a.r rVar, org.apache.a.j.e eVar2) throws org.apache.a.a.j, org.apache.a.a.f {
        org.apache.a.a.a c2 = eVar.c();
        if (c2 == null) {
            c2 = bVar.a(map, rVar, eVar2);
            eVar.a(c2);
        }
        String a2 = c2.a();
        org.apache.a.d dVar = map.get(a2.toLowerCase(Locale.ENGLISH));
        if (dVar == null) {
            throw new org.apache.a.a.f(a2 + " authorization challenge expected, but not found");
        }
        c2.a(dVar);
        this.q.debug("Authorization challenge processed");
    }

    private void a(org.apache.a.a.e eVar, org.apache.a.m mVar, org.apache.a.b.f fVar) {
        if (eVar.b()) {
            String a2 = mVar.a();
            int b2 = mVar.b();
            if (b2 < 0) {
                b2 = this.f9777a.a().a(mVar).a();
            }
            org.apache.a.a.a c2 = eVar.c();
            org.apache.a.a.d dVar = new org.apache.a.a.d(a2, b2, c2.b(), c2.a());
            if (this.q.isDebugEnabled()) {
                this.q.debug("Authentication scope: " + dVar);
            }
            org.apache.a.a.h d2 = eVar.d();
            if (d2 == null) {
                d2 = fVar.a(dVar);
                if (this.q.isDebugEnabled()) {
                    if (d2 != null) {
                        this.q.debug("Found credentials");
                    } else {
                        this.q.debug("Credentials not found");
                    }
                }
            } else if (c2.d()) {
                this.q.debug("Authentication failed");
                d2 = null;
            }
            eVar.a(dVar);
            eVar.a(d2);
        }
    }

    private void a(org.apache.a.a.e eVar) {
        org.apache.a.a.a c2 = eVar.c();
        if (c2 == null || !c2.c() || !c2.d() || eVar.d() == null) {
            return;
        }
        eVar.a();
    }
}
