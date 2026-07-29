package org.apache.a.f.c;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.a.p;
import org.apache.a.r;

/* compiled from: AbstractClientConnAdapter.java */
/* loaded from: classes2.dex */
public abstract class a implements org.apache.a.c.n, org.apache.a.j.e {

    /* renamed from: a, reason: collision with root package name */
    private volatile org.apache.a.c.b f9794a;

    /* renamed from: b, reason: collision with root package name */
    private volatile org.apache.a.c.o f9795b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f9796c = false;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f9797d = false;
    private volatile long e = Long.MAX_VALUE;

    protected a(org.apache.a.c.b bVar, org.apache.a.c.o oVar) {
        this.f9794a = bVar;
        this.f9795b = oVar;
    }

    protected synchronized void o() {
        this.f9795b = null;
        this.f9794a = null;
        this.e = Long.MAX_VALUE;
    }

    protected org.apache.a.c.o p() {
        return this.f9795b;
    }

    protected org.apache.a.c.b q() {
        return this.f9794a;
    }

    protected boolean r() {
        return this.f9797d;
    }

    protected final void a(org.apache.a.c.o oVar) throws d {
        if (r() || oVar == null) {
            throw new d();
        }
    }

    @Override // org.apache.a.i
    public boolean d() {
        org.apache.a.c.o p = p();
        if (p == null) {
            return false;
        }
        return p.d();
    }

    @Override // org.apache.a.i
    public boolean e() {
        org.apache.a.c.o p;
        if (r() || (p = p()) == null) {
            return true;
        }
        return p.e();
    }

    @Override // org.apache.a.i
    public void b(int i) {
        org.apache.a.c.o p = p();
        a(p);
        p.b(i);
    }

    @Override // org.apache.a.h
    public void b() throws IOException {
        org.apache.a.c.o p = p();
        a(p);
        p.b();
    }

    @Override // org.apache.a.h
    public boolean a(int i) throws IOException {
        org.apache.a.c.o p = p();
        a(p);
        return p.a(i);
    }

    @Override // org.apache.a.h
    public void a(r rVar) throws org.apache.a.l, IOException {
        org.apache.a.c.o p = p();
        a(p);
        s();
        p.a(rVar);
    }

    @Override // org.apache.a.h
    public r a() throws org.apache.a.l, IOException {
        org.apache.a.c.o p = p();
        a(p);
        s();
        return p.a();
    }

    @Override // org.apache.a.h
    public void a(org.apache.a.k kVar) throws org.apache.a.l, IOException {
        org.apache.a.c.o p = p();
        a(p);
        s();
        p.a(kVar);
    }

    @Override // org.apache.a.h
    public void a(p pVar) throws org.apache.a.l, IOException {
        org.apache.a.c.o p = p();
        a(p);
        s();
        p.a(pVar);
    }

    @Override // org.apache.a.n
    public InetAddress g() {
        org.apache.a.c.o p = p();
        a(p);
        return p.g();
    }

    @Override // org.apache.a.n
    public int h() {
        org.apache.a.c.o p = p();
        a(p);
        return p.h();
    }

    @Override // org.apache.a.c.m
    public boolean k() {
        org.apache.a.c.o p = p();
        a(p);
        return p.i();
    }

    @Override // org.apache.a.c.m
    public SSLSession m() {
        org.apache.a.c.o p = p();
        a(p);
        if (!d()) {
            return null;
        }
        Socket j = p.j();
        if (j instanceof SSLSocket) {
            return ((SSLSocket) j).getSession();
        }
        return null;
    }

    @Override // org.apache.a.c.n
    public void n() {
        this.f9796c = true;
    }

    public void s() {
        this.f9796c = false;
    }

    public boolean t() {
        return this.f9796c;
    }

    @Override // org.apache.a.c.n
    public void a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            this.e = timeUnit.toMillis(j);
        } else {
            this.e = -1L;
        }
    }

    @Override // org.apache.a.c.i
    public synchronized void i() {
        if (this.f9797d) {
            return;
        }
        this.f9797d = true;
        if (this.f9794a != null) {
            this.f9794a.a(this, this.e, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.apache.a.c.i
    public synchronized void j() {
        if (this.f9797d) {
            return;
        }
        this.f9797d = true;
        s();
        try {
            f();
        } catch (IOException unused) {
        }
        if (this.f9794a != null) {
            this.f9794a.a(this, this.e, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.apache.a.j.e
    public synchronized Object a(String str) {
        org.apache.a.c.o p = p();
        a(p);
        if (!(p instanceof org.apache.a.j.e)) {
            return null;
        }
        return ((org.apache.a.j.e) p).a(str);
    }

    @Override // org.apache.a.j.e
    public synchronized void a(String str, Object obj) {
        org.apache.a.c.o p = p();
        a(p);
        if (p instanceof org.apache.a.j.e) {
            ((org.apache.a.j.e) p).a(str, obj);
        }
    }
}
