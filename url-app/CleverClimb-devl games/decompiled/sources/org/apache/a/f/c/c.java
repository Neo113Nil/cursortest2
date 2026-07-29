package org.apache.a.f.c;

import java.io.IOException;

/* compiled from: AbstractPooledConnAdapter.java */
/* loaded from: classes2.dex */
public abstract class c extends a {

    /* renamed from: a, reason: collision with root package name */
    protected volatile b f9827a;

    protected c(org.apache.a.c.b bVar, b bVar2) {
        super(bVar, bVar2.f9824b);
        this.f9827a = bVar2;
    }

    protected b u() {
        return this.f9827a;
    }

    protected void a(b bVar) {
        if (r() || bVar == null) {
            throw new d();
        }
    }

    @Override // org.apache.a.f.c.a
    protected synchronized void o() {
        this.f9827a = null;
        super.o();
    }

    @Override // org.apache.a.c.n, org.apache.a.c.m
    public org.apache.a.c.b.b l() {
        b u = u();
        a(u);
        if (u.e == null) {
            return null;
        }
        return u.e.h();
    }

    @Override // org.apache.a.c.n
    public void a(org.apache.a.c.b.b bVar, org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException {
        b u = u();
        a(u);
        u.a(bVar, eVar, dVar);
    }

    @Override // org.apache.a.c.n
    public void a(boolean z, org.apache.a.i.d dVar) throws IOException {
        b u = u();
        a(u);
        u.a(z, dVar);
    }

    @Override // org.apache.a.c.n
    public void a(org.apache.a.m mVar, boolean z, org.apache.a.i.d dVar) throws IOException {
        b u = u();
        a(u);
        u.a(mVar, z, dVar);
    }

    @Override // org.apache.a.c.n
    public void a(org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException {
        b u = u();
        a(u);
        u.a(eVar, dVar);
    }

    @Override // org.apache.a.i
    public void c() throws IOException {
        b u = u();
        if (u != null) {
            u.b();
        }
        org.apache.a.c.o p = p();
        if (p != null) {
            p.c();
        }
    }

    @Override // org.apache.a.i
    public void f() throws IOException {
        b u = u();
        if (u != null) {
            u.b();
        }
        org.apache.a.c.o p = p();
        if (p != null) {
            p.f();
        }
    }

    @Override // org.apache.a.c.n
    public void a(Object obj) {
        b u = u();
        a(u);
        u.a(obj);
    }
}
