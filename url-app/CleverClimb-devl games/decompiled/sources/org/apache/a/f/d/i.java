package org.apache.a.f.d;

/* compiled from: BasicPathHandler.java */
/* loaded from: classes2.dex */
public class i implements org.apache.a.d.c {
    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.l lVar, String str) throws org.apache.a.d.k {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (str == null || str.trim().length() == 0) {
            str = "/";
        }
        lVar.e(str);
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (b(bVar, eVar)) {
            return;
        }
        throw new org.apache.a.d.g("Illegal path attribute \"" + bVar.d() + "\". Path of origin: \"" + eVar.b() + "\"");
    }

    @Override // org.apache.a.d.c
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        String b2 = eVar.b();
        String d2 = bVar.d();
        if (d2 == null) {
            d2 = "/";
        }
        if (d2.length() > 1 && d2.endsWith("/")) {
            d2 = d2.substring(0, d2.length() - 1);
        }
        boolean startsWith = b2.startsWith(d2);
        return (!startsWith || b2.length() == d2.length() || d2.endsWith("/")) ? startsWith : b2.charAt(d2.length()) == '/';
    }
}
