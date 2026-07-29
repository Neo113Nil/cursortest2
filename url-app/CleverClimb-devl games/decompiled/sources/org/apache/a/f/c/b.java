package org.apache.a.f.c;

import java.io.IOException;

/* compiled from: AbstractPoolEntry.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected final org.apache.a.c.d f9823a;

    /* renamed from: b, reason: collision with root package name */
    protected final org.apache.a.c.o f9824b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile org.apache.a.c.b.b f9825c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile Object f9826d;
    protected volatile org.apache.a.c.b.f e;

    protected b(org.apache.a.c.d dVar, org.apache.a.c.b.b bVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Connection operator may not be null");
        }
        this.f9823a = dVar;
        this.f9824b = dVar.a();
        this.f9825c = bVar;
        this.e = null;
    }

    public Object a() {
        return this.f9826d;
    }

    public void a(Object obj) {
        this.f9826d = obj;
    }

    public void a(org.apache.a.c.b.b bVar, org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("Route must not be null.");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (this.e != null && this.e.d()) {
            throw new IllegalStateException("Connection already open.");
        }
        this.e = new org.apache.a.c.b.f(bVar);
        org.apache.a.m d2 = bVar.d();
        this.f9823a.a(this.f9824b, d2 != null ? d2 : bVar.a(), bVar.b(), eVar, dVar);
        org.apache.a.c.b.f fVar = this.e;
        if (fVar == null) {
            throw new IOException("Request aborted");
        }
        if (d2 == null) {
            fVar.a(this.f9824b.i());
        } else {
            fVar.a(d2, this.f9824b.i());
        }
    }

    public void a(boolean z, org.apache.a.i.d dVar) throws IOException {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (this.e == null || !this.e.d()) {
            throw new IllegalStateException("Connection not open.");
        }
        if (this.e.e()) {
            throw new IllegalStateException("Connection is already tunnelled.");
        }
        this.f9824b.a(null, this.e.a(), z, dVar);
        this.e.b(z);
    }

    public void a(org.apache.a.m mVar, boolean z, org.apache.a.i.d dVar) throws IOException {
        if (mVar == null) {
            throw new IllegalArgumentException("Next proxy must not be null.");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (this.e == null || !this.e.d()) {
            throw new IllegalStateException("Connection not open.");
        }
        this.f9824b.a(null, mVar, z, dVar);
        this.e.b(mVar, z);
    }

    public void a(org.apache.a.j.e eVar, org.apache.a.i.d dVar) throws IOException {
        if (dVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
        if (this.e == null || !this.e.d()) {
            throw new IllegalStateException("Connection not open.");
        }
        if (!this.e.e()) {
            throw new IllegalStateException("Protocol layering without a tunnel not supported.");
        }
        if (this.e.f()) {
            throw new IllegalStateException("Multiple protocol layering not supported.");
        }
        this.f9823a.a(this.f9824b, this.e.a(), eVar, dVar);
        this.e.c(this.f9824b.i());
    }

    protected void b() {
        this.e = null;
        this.f9826d = null;
    }
}
