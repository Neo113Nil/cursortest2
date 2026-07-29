package org.apache.a.f.a;

import org.apache.a.p;

/* compiled from: AuthSchemeBase.java */
/* loaded from: classes2.dex */
public abstract class a implements org.apache.a.a.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9714a;

    protected abstract void a(org.apache.a.k.b bVar, int i, int i2) throws org.apache.a.a.j;

    @Override // org.apache.a.a.a
    public void a(org.apache.a.d dVar) throws org.apache.a.a.j {
        org.apache.a.k.b bVar;
        if (dVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        String c2 = dVar.c();
        int i = 0;
        if (c2.equalsIgnoreCase("WWW-Authenticate")) {
            this.f9714a = false;
        } else if (c2.equalsIgnoreCase("Proxy-Authenticate")) {
            this.f9714a = true;
        } else {
            throw new org.apache.a.a.j("Unexpected header name: " + c2);
        }
        if (dVar instanceof org.apache.a.c) {
            org.apache.a.c cVar = (org.apache.a.c) dVar;
            bVar = cVar.a();
            i = cVar.b();
        } else {
            String d2 = dVar.d();
            if (d2 == null) {
                throw new org.apache.a.a.j("Header value is null");
            }
            bVar = new org.apache.a.k.b(d2.length());
            bVar.a(d2);
        }
        while (i < bVar.c() && org.apache.a.j.d.a(bVar.a(i))) {
            i++;
        }
        int i2 = i;
        while (i2 < bVar.c() && !org.apache.a.j.d.a(bVar.a(i2))) {
            i2++;
        }
        String a2 = bVar.a(i, i2);
        if (!a2.equalsIgnoreCase(a())) {
            throw new org.apache.a.a.j("Invalid scheme identifier: " + a2);
        }
        a(bVar, i2, bVar.c());
    }

    @Override // org.apache.a.a.g
    public org.apache.a.d a(org.apache.a.a.h hVar, p pVar, org.apache.a.j.e eVar) throws org.apache.a.a.f {
        return a(hVar, pVar);
    }

    public boolean e() {
        return this.f9714a;
    }

    public String toString() {
        return a();
    }
}
