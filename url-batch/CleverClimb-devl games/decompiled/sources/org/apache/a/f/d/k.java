package org.apache.a.f.d;

import java.util.List;

/* compiled from: BestMatchSpec.java */
/* loaded from: classes2.dex */
public class k implements org.apache.a.d.h {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f9868a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9869b;

    /* renamed from: c, reason: collision with root package name */
    private af f9870c;

    /* renamed from: d, reason: collision with root package name */
    private y f9871d;
    private m e;

    public String toString() {
        return "best-match";
    }

    public k(String[] strArr, boolean z) {
        this.f9868a = strArr == null ? null : (String[]) strArr.clone();
        this.f9869b = z;
    }

    public k() {
        this(null, false);
    }

    private af c() {
        if (this.f9870c == null) {
            this.f9870c = new af(this.f9868a, this.f9869b);
        }
        return this.f9870c;
    }

    private y d() {
        if (this.f9871d == null) {
            this.f9871d = new y(this.f9868a, this.f9869b);
        }
        return this.f9871d;
    }

    private m e() {
        if (this.e == null) {
            this.e = new m(this.f9868a);
        }
        return this.e;
    }

    @Override // org.apache.a.d.h
    public List<org.apache.a.d.b> a(org.apache.a.d dVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        org.apache.a.k.b bVar;
        org.apache.a.h.u uVar;
        if (dVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        org.apache.a.e[] e = dVar.e();
        boolean z = false;
        boolean z2 = false;
        for (org.apache.a.e eVar2 : e) {
            if (eVar2.a("version") != null) {
                z2 = true;
            }
            if (eVar2.a("expires") != null) {
                z = true;
            }
        }
        if (z || !z2) {
            u uVar2 = u.f9879a;
            if (dVar instanceof org.apache.a.c) {
                org.apache.a.c cVar = (org.apache.a.c) dVar;
                bVar = cVar.a();
                uVar = new org.apache.a.h.u(cVar.b(), bVar.c());
            } else {
                String d2 = dVar.d();
                if (d2 == null) {
                    throw new org.apache.a.d.k("Header value is null");
                }
                bVar = new org.apache.a.k.b(d2.length());
                bVar.a(d2);
                uVar = new org.apache.a.h.u(0, bVar.c());
            }
            return e().a(new org.apache.a.e[]{uVar2.a(bVar, uVar)}, eVar);
        }
        if ("Set-Cookie2".equals(dVar.c())) {
            return c().a(e, eVar);
        }
        return d().a(e, eVar);
    }

    @Override // org.apache.a.d.h
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        if (bVar.g() > 0) {
            if (bVar instanceof org.apache.a.d.m) {
                c().a(bVar, eVar);
                return;
            } else {
                d().a(bVar, eVar);
                return;
            }
        }
        e().a(bVar, eVar);
    }

    @Override // org.apache.a.d.h
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        if (bVar.g() > 0) {
            if (bVar instanceof org.apache.a.d.m) {
                return c().b(bVar, eVar);
            }
            return d().b(bVar, eVar);
        }
        return e().b(bVar, eVar);
    }

    @Override // org.apache.a.d.h
    public List<org.apache.a.d> a(List<org.apache.a.d.b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        }
        int i = Integer.MAX_VALUE;
        boolean z = true;
        for (org.apache.a.d.b bVar : list) {
            if (!(bVar instanceof org.apache.a.d.m)) {
                z = false;
            }
            if (bVar.g() < i) {
                i = bVar.g();
            }
        }
        if (i <= 0) {
            return e().a(list);
        }
        if (z) {
            return c().a(list);
        }
        return d().a(list);
    }

    @Override // org.apache.a.d.h
    public int a() {
        return c().a();
    }

    @Override // org.apache.a.d.h
    public org.apache.a.d b() {
        return c().b();
    }
}
