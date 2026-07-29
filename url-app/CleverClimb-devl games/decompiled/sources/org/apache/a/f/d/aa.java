package org.apache.a.f.d;

/* compiled from: RFC2109VersionHandler.java */
/* loaded from: classes2.dex */
public class aa extends a {
    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null) {
            throw new org.apache.a.d.k("Missing value for version attribute");
        }
        if (str.trim().length() == 0) {
            throw new org.apache.a.d.k("Blank value for version attribute");
        }
        try {
            lVar.a(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            throw new org.apache.a.d.k("Invalid version: " + e.getMessage());
        }
    }

    @Override // org.apache.a.f.d.a, org.apache.a.d.c
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (bVar.g() < 0) {
            throw new org.apache.a.d.g("Cookie version may not be negative");
        }
    }
}
