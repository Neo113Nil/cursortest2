package org.apache.a.f;

import java.io.IOException;
import org.apache.a.f.f.i;
import org.apache.a.f.f.j;
import org.apache.a.g.g;
import org.apache.a.h;
import org.apache.a.k;
import org.apache.a.l;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.s;

/* compiled from: AbstractHttpClientConnection.java */
/* loaded from: classes2.dex */
public abstract class a implements h {

    /* renamed from: c, reason: collision with root package name */
    private org.apache.a.g.f f9712c = null;

    /* renamed from: d, reason: collision with root package name */
    private g f9713d = null;
    private org.apache.a.g.b e = null;
    private org.apache.a.g.c f = null;
    private org.apache.a.g.d g = null;
    private e h = null;

    /* renamed from: a, reason: collision with root package name */
    private final org.apache.a.f.e.b f9710a = m();

    /* renamed from: b, reason: collision with root package name */
    private final org.apache.a.f.e.a f9711b = l();

    protected abstract void k() throws IllegalStateException;

    protected org.apache.a.f.e.a l() {
        return new org.apache.a.f.e.a(new org.apache.a.f.e.c());
    }

    protected org.apache.a.f.e.b m() {
        return new org.apache.a.f.e.b(new org.apache.a.f.e.d());
    }

    protected s n() {
        return new c();
    }

    protected org.apache.a.g.c a(org.apache.a.g.f fVar, s sVar, org.apache.a.i.d dVar) {
        return new j(fVar, null, sVar, dVar);
    }

    protected org.apache.a.g.d a(g gVar, org.apache.a.i.d dVar) {
        return new i(gVar, null, dVar);
    }

    protected e a(org.apache.a.g.e eVar, org.apache.a.g.e eVar2) {
        return new e(eVar, eVar2);
    }

    protected void a(org.apache.a.g.f fVar, g gVar, org.apache.a.i.d dVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("Input session buffer may not be null");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("Output session buffer may not be null");
        }
        this.f9712c = fVar;
        this.f9713d = gVar;
        if (fVar instanceof org.apache.a.g.b) {
            this.e = (org.apache.a.g.b) fVar;
        }
        this.f = a(fVar, n(), dVar);
        this.g = a(gVar, dVar);
        this.h = a(fVar.b(), gVar.b());
    }

    @Override // org.apache.a.h
    public boolean a(int i) throws IOException {
        k();
        return this.f9712c.a(i);
    }

    @Override // org.apache.a.h
    public void a(p pVar) throws l, IOException {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        k();
        this.g.b(pVar);
        this.h.a();
    }

    @Override // org.apache.a.h
    public void a(k kVar) throws l, IOException {
        if (kVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        k();
        if (kVar.getEntity() == null) {
            return;
        }
        this.f9710a.a(this.f9713d, kVar, kVar.getEntity());
    }

    protected void o() throws IOException {
        this.f9713d.a();
    }

    @Override // org.apache.a.h
    public void b() throws IOException {
        k();
        o();
    }

    @Override // org.apache.a.h
    public r a() throws l, IOException {
        k();
        r rVar = (r) this.f.a();
        if (rVar.a().b() >= 200) {
            this.h.b();
        }
        return rVar;
    }

    @Override // org.apache.a.h
    public void a(r rVar) throws l, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        k();
        rVar.a(this.f9711b.b(this.f9712c, rVar));
    }

    protected boolean p() {
        return this.e != null && this.e.c();
    }

    @Override // org.apache.a.i
    public boolean e() {
        if (!d() || p()) {
            return true;
        }
        try {
            this.f9712c.a(1);
            return p();
        } catch (IOException unused) {
            return true;
        }
    }
}
