package org.apache.a.h;

import org.apache.a.aa;
import org.apache.a.ac;
import org.apache.a.ad;

/* compiled from: BasicLineFormatter.java */
/* loaded from: classes2.dex */
public class i implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final i f9953a = new i();

    protected org.apache.a.k.b a(org.apache.a.k.b bVar) {
        if (bVar != null) {
            bVar.a();
            return bVar;
        }
        return new org.apache.a.k.b(64);
    }

    public org.apache.a.k.b a(org.apache.a.k.b bVar, aa aaVar) {
        if (aaVar == null) {
            throw new IllegalArgumentException("Protocol version may not be null");
        }
        int a2 = a(aaVar);
        if (bVar == null) {
            bVar = new org.apache.a.k.b(a2);
        } else {
            bVar.b(a2);
        }
        bVar.a(aaVar.a());
        bVar.a('/');
        bVar.a(Integer.toString(aaVar.b()));
        bVar.a('.');
        bVar.a(Integer.toString(aaVar.c()));
        return bVar;
    }

    protected int a(aa aaVar) {
        return aaVar.a().length() + 4;
    }

    @Override // org.apache.a.h.s
    public org.apache.a.k.b a(org.apache.a.k.b bVar, ac acVar) {
        if (acVar == null) {
            throw new IllegalArgumentException("Request line may not be null");
        }
        org.apache.a.k.b a2 = a(bVar);
        b(a2, acVar);
        return a2;
    }

    protected void b(org.apache.a.k.b bVar, ac acVar) {
        String a2 = acVar.a();
        String c2 = acVar.c();
        bVar.b(a2.length() + 1 + c2.length() + 1 + a(acVar.b()));
        bVar.a(a2);
        bVar.a(' ');
        bVar.a(c2);
        bVar.a(' ');
        a(bVar, acVar.b());
    }

    public org.apache.a.k.b a(org.apache.a.k.b bVar, ad adVar) {
        if (adVar == null) {
            throw new IllegalArgumentException("Status line may not be null");
        }
        org.apache.a.k.b a2 = a(bVar);
        b(a2, adVar);
        return a2;
    }

    protected void b(org.apache.a.k.b bVar, ad adVar) {
        int a2 = a(adVar.a()) + 1 + 3 + 1;
        String c2 = adVar.c();
        if (c2 != null) {
            a2 += c2.length();
        }
        bVar.b(a2);
        a(bVar, adVar.a());
        bVar.a(' ');
        bVar.a(Integer.toString(adVar.b()));
        bVar.a(' ');
        if (c2 != null) {
            bVar.a(c2);
        }
    }

    @Override // org.apache.a.h.s
    public org.apache.a.k.b a(org.apache.a.k.b bVar, org.apache.a.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        }
        if (dVar instanceof org.apache.a.c) {
            return ((org.apache.a.c) dVar).a();
        }
        org.apache.a.k.b a2 = a(bVar);
        b(a2, dVar);
        return a2;
    }

    protected void b(org.apache.a.k.b bVar, org.apache.a.d dVar) {
        String c2 = dVar.c();
        String d2 = dVar.d();
        int length = c2.length() + 2;
        if (d2 != null) {
            length += d2.length();
        }
        bVar.b(length);
        bVar.a(c2);
        bVar.a(": ");
        if (d2 != null) {
            bVar.a(d2);
        }
    }
}
