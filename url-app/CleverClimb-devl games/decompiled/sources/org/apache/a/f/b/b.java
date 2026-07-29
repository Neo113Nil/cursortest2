package org.apache.a.f.b;

import java.io.IOException;
import java.net.URI;
import org.apache.a.f.d.ag;
import org.apache.a.f.d.w;
import org.apache.a.f.d.z;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: AbstractHttpClient.java */
/* loaded from: classes2.dex */
public abstract class b implements org.apache.a.b.g {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9762a = LogFactory.getLog(getClass());

    /* renamed from: b, reason: collision with root package name */
    private org.apache.a.i.d f9763b;

    /* renamed from: c, reason: collision with root package name */
    private org.apache.a.j.g f9764c;

    /* renamed from: d, reason: collision with root package name */
    private org.apache.a.c.b f9765d;
    private org.apache.a.b e;
    private org.apache.a.c.g f;
    private org.apache.a.d.j g;
    private org.apache.a.a.c h;
    private org.apache.a.j.b i;
    private org.apache.a.j.h j;
    private org.apache.a.b.h k;
    private org.apache.a.b.l l;
    private org.apache.a.b.b m;
    private org.apache.a.b.b n;
    private org.apache.a.b.e o;
    private org.apache.a.b.f p;
    private org.apache.a.c.b.d q;
    private org.apache.a.b.n r;

    protected abstract org.apache.a.i.d a();

    protected abstract org.apache.a.j.b b();

    protected b(org.apache.a.c.b bVar, org.apache.a.i.d dVar) {
        this.f9763b = dVar;
        this.f9765d = bVar;
    }

    protected org.apache.a.j.e c() {
        org.apache.a.j.a aVar = new org.apache.a.j.a();
        aVar.a("http.scheme-registry", q().a());
        aVar.a("http.authscheme-registry", s());
        aVar.a("http.cookiespec-registry", t());
        aVar.a("http.cookie-store", A());
        aVar.a("http.auth.credentials-provider", B());
        return aVar;
    }

    protected org.apache.a.c.b d() {
        org.apache.a.c.c cVar;
        org.apache.a.c.c.g a2 = org.apache.a.f.c.m.a();
        org.apache.a.i.d params = getParams();
        String str = (String) params.a("http.connection-manager.factory-class-name");
        if (str != null) {
            try {
                cVar = (org.apache.a.c.c) Class.forName(str).newInstance();
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Invalid class name: " + str);
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InstantiationException e2) {
                throw new InstantiationError(e2.getMessage());
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.a(params, a2);
        }
        return new org.apache.a.f.c.n(a2);
    }

    protected org.apache.a.a.c e() {
        org.apache.a.a.c cVar = new org.apache.a.a.c();
        cVar.a("Basic", new org.apache.a.f.a.c());
        cVar.a("Digest", new org.apache.a.f.a.e());
        cVar.a("NTLM", new org.apache.a.f.a.j());
        cVar.a("negotiate", new org.apache.a.f.a.l());
        return cVar;
    }

    protected org.apache.a.d.j f() {
        org.apache.a.d.j jVar = new org.apache.a.d.j();
        jVar.a("best-match", new org.apache.a.f.d.l());
        jVar.a("compatibility", new org.apache.a.f.d.n());
        jVar.a("netscape", new w());
        jVar.a("rfc2109", new z());
        jVar.a("rfc2965", new ag());
        jVar.a("ignoreCookies", new org.apache.a.f.d.s());
        return jVar;
    }

    protected org.apache.a.j.g g() {
        return new org.apache.a.j.g();
    }

    protected org.apache.a.b h() {
        return new org.apache.a.f.b();
    }

    protected org.apache.a.c.g i() {
        return new g();
    }

    protected org.apache.a.b.h j() {
        return new i();
    }

    protected org.apache.a.b.b k() {
        return new n();
    }

    protected org.apache.a.b.b l() {
        return new j();
    }

    protected org.apache.a.b.e m() {
        return new d();
    }

    protected org.apache.a.b.f n() {
        return new e();
    }

    protected org.apache.a.c.b.d o() {
        return new org.apache.a.f.c.g(q().a());
    }

    protected org.apache.a.b.n p() {
        return new o();
    }

    @Override // org.apache.a.b.g
    public final synchronized org.apache.a.i.d getParams() {
        if (this.f9763b == null) {
            this.f9763b = a();
        }
        return this.f9763b;
    }

    public final synchronized org.apache.a.c.b q() {
        if (this.f9765d == null) {
            this.f9765d = d();
        }
        return this.f9765d;
    }

    public final synchronized org.apache.a.j.g r() {
        if (this.f9764c == null) {
            this.f9764c = g();
        }
        return this.f9764c;
    }

    public final synchronized org.apache.a.a.c s() {
        if (this.h == null) {
            this.h = e();
        }
        return this.h;
    }

    public final synchronized org.apache.a.d.j t() {
        if (this.g == null) {
            this.g = f();
        }
        return this.g;
    }

    public final synchronized org.apache.a.b u() {
        if (this.e == null) {
            this.e = h();
        }
        return this.e;
    }

    public final synchronized org.apache.a.c.g v() {
        if (this.f == null) {
            this.f = i();
        }
        return this.f;
    }

    public final synchronized org.apache.a.b.h w() {
        if (this.k == null) {
            this.k = j();
        }
        return this.k;
    }

    @Deprecated
    public synchronized void a(org.apache.a.b.k kVar) {
        this.l = new l(kVar);
    }

    public final synchronized org.apache.a.b.l x() {
        if (this.l == null) {
            this.l = new k();
        }
        return this.l;
    }

    public final synchronized org.apache.a.b.b y() {
        if (this.m == null) {
            this.m = k();
        }
        return this.m;
    }

    public final synchronized org.apache.a.b.b z() {
        if (this.n == null) {
            this.n = l();
        }
        return this.n;
    }

    public final synchronized org.apache.a.b.e A() {
        if (this.o == null) {
            this.o = m();
        }
        return this.o;
    }

    public final synchronized org.apache.a.b.f B() {
        if (this.p == null) {
            this.p = n();
        }
        return this.p;
    }

    public final synchronized org.apache.a.c.b.d C() {
        if (this.q == null) {
            this.q = o();
        }
        return this.q;
    }

    public final synchronized org.apache.a.b.n D() {
        if (this.r == null) {
            this.r = p();
        }
        return this.r;
    }

    protected final synchronized org.apache.a.j.b E() {
        if (this.i == null) {
            this.i = b();
        }
        return this.i;
    }

    private final synchronized org.apache.a.j.f F() {
        if (this.j == null) {
            org.apache.a.j.b E = E();
            int a2 = E.a();
            org.apache.a.q[] qVarArr = new org.apache.a.q[a2];
            for (int i = 0; i < a2; i++) {
                qVarArr[i] = E.a(i);
            }
            int b2 = E.b();
            org.apache.a.t[] tVarArr = new org.apache.a.t[b2];
            for (int i2 = 0; i2 < b2; i2++) {
                tVarArr[i2] = E.b(i2);
            }
            this.j = new org.apache.a.j.h(qVarArr, tVarArr);
        }
        return this.j;
    }

    @Override // org.apache.a.b.g
    public final org.apache.a.r execute(org.apache.a.b.b.k kVar) throws IOException, org.apache.a.b.d {
        return a(kVar, (org.apache.a.j.e) null);
    }

    public final org.apache.a.r a(org.apache.a.b.b.k kVar, org.apache.a.j.e eVar) throws IOException, org.apache.a.b.d {
        if (kVar == null) {
            throw new IllegalArgumentException("Request must not be null.");
        }
        return a(a(kVar), kVar, eVar);
    }

    private static org.apache.a.m a(org.apache.a.b.b.k kVar) throws org.apache.a.b.d {
        URI uri = kVar.getURI();
        if (!uri.isAbsolute()) {
            return null;
        }
        org.apache.a.m a2 = org.apache.a.b.e.b.a(uri);
        if (a2 != null) {
            return a2;
        }
        throw new org.apache.a.b.d("URI does not specify a valid host name: " + uri);
    }

    public final org.apache.a.r a(org.apache.a.m mVar, org.apache.a.p pVar, org.apache.a.j.e eVar) throws IOException, org.apache.a.b.d {
        org.apache.a.j.e cVar;
        org.apache.a.b.m a2;
        if (pVar == null) {
            throw new IllegalArgumentException("Request must not be null.");
        }
        synchronized (this) {
            org.apache.a.j.e c2 = c();
            cVar = eVar == null ? c2 : new org.apache.a.j.c(eVar, c2);
            a2 = a(r(), q(), u(), v(), C(), F(), w(), x(), y(), z(), D(), a(pVar));
        }
        try {
            return a2.a(mVar, pVar, cVar);
        } catch (org.apache.a.l e) {
            throw new org.apache.a.b.d(e);
        }
    }

    protected org.apache.a.b.m a(org.apache.a.j.g gVar, org.apache.a.c.b bVar, org.apache.a.b bVar2, org.apache.a.c.g gVar2, org.apache.a.c.b.d dVar, org.apache.a.j.f fVar, org.apache.a.b.h hVar, org.apache.a.b.l lVar, org.apache.a.b.b bVar3, org.apache.a.b.b bVar4, org.apache.a.b.n nVar, org.apache.a.i.d dVar2) {
        return new m(this.f9762a, gVar, bVar, bVar2, gVar2, dVar, fVar, hVar, lVar, bVar3, bVar4, nVar, dVar2);
    }

    protected org.apache.a.i.d a(org.apache.a.p pVar) {
        return new f(null, getParams(), pVar.getParams(), null);
    }
}
