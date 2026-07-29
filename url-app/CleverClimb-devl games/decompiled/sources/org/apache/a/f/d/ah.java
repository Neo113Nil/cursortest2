package org.apache.a.f.d;

/* compiled from: RFC2965VersionAttributeHandler.java */
/* loaded from: classes2.dex */
public class ah implements org.apache.a.d.c {
    @Override // org.apache.a.d.c
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        return true;
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        int i;
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null) {
            throw new org.apache.a.d.k("Missing value for version attribute");
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i < 0) {
            throw new org.apache.a.d.k("Invalid cookie version.");
        }
        lVar.a(i);
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if ((bVar instanceof org.apache.a.d.m) && (bVar instanceof org.apache.a.d.a) && !((org.apache.a.d.a) bVar).b("version")) {
            throw new org.apache.a.d.g("Violates RFC 2965. Version attribute is required.");
        }
    }
}
