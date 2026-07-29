package org.apache.a.f.d;

/* compiled from: BasicDomainHandler.java */
/* loaded from: classes2.dex */
public class f implements org.apache.a.d.c {
    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null) {
            throw new org.apache.a.d.k("Missing value for domain attribute");
        }
        if (str.trim().length() == 0) {
            throw new org.apache.a.d.k("Blank value for domain attribute");
        }
        lVar.d(str);
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        String a2 = eVar.a();
        String c2 = bVar.c();
        if (c2 == null) {
            throw new org.apache.a.d.g("Cookie domain may not be null");
        }
        if (a2.contains(".")) {
            if (a2.endsWith(c2)) {
                return;
            }
            if (c2.startsWith(".")) {
                c2 = c2.substring(1, c2.length());
            }
            if (a2.equals(c2)) {
                return;
            }
            throw new org.apache.a.d.g("Illegal domain attribute \"" + c2 + "\". Domain of origin: \"" + a2 + "\"");
        }
        if (a2.equals(c2)) {
            return;
        }
        throw new org.apache.a.d.g("Illegal domain attribute \"" + c2 + "\". Domain of origin: \"" + a2 + "\"");
    }

    @Override // org.apache.a.d.c
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        String a2 = eVar.a();
        String c2 = bVar.c();
        if (c2 == null) {
            return false;
        }
        if (a2.equals(c2)) {
            return true;
        }
        if (!c2.startsWith(".")) {
            c2 = '.' + c2;
        }
        return a2.endsWith(c2) || a2.equals(c2.substring(1));
    }
}
