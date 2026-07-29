package org.apache.a.f.b;

import org.apache.a.u;

/* compiled from: DefaultHttpClient.java */
/* loaded from: classes2.dex */
public class h extends b {
    public h(org.apache.a.c.b bVar, org.apache.a.i.d dVar) {
        super(bVar, dVar);
    }

    public h(org.apache.a.i.d dVar) {
        super(null, dVar);
    }

    public h() {
        super(null, null);
    }

    @Override // org.apache.a.f.b.b
    protected org.apache.a.i.d a() {
        org.apache.a.i.f fVar = new org.apache.a.i.f();
        a(fVar);
        return fVar;
    }

    public static void a(org.apache.a.i.d dVar) {
        org.apache.a.i.e.a(dVar, u.f10004c);
        org.apache.a.i.e.a(dVar, "ISO-8859-1");
        org.apache.a.i.c.a(dVar, true);
        org.apache.a.i.c.b(dVar, 8192);
        org.apache.a.k.g a2 = org.apache.a.k.g.a("org.apache.http.client", h.class.getClassLoader());
        org.apache.a.i.e.b(dVar, "Apache-HttpClient/" + (a2 != null ? a2.a() : "UNAVAILABLE") + " (java 1.5)");
    }

    @Override // org.apache.a.f.b.b
    protected org.apache.a.j.b b() {
        org.apache.a.j.b bVar = new org.apache.a.j.b();
        bVar.b(new org.apache.a.b.d.d());
        bVar.b(new org.apache.a.j.i());
        bVar.b(new org.apache.a.j.k());
        bVar.b(new org.apache.a.b.d.c());
        bVar.b(new org.apache.a.j.l());
        bVar.b(new org.apache.a.j.j());
        bVar.b(new org.apache.a.b.d.a());
        bVar.b(new org.apache.a.b.d.h());
        bVar.b(new org.apache.a.b.d.b());
        bVar.b(new org.apache.a.b.d.g());
        bVar.b(new org.apache.a.b.d.f());
        bVar.b(new org.apache.a.b.d.e());
        return bVar;
    }
}
