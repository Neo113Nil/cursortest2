package org.apache.a.f.d;

import java.util.Locale;

/* compiled from: RFC2109DomainHandler.java */
/* loaded from: classes2.dex */
public class x implements org.apache.a.d.c {
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
        if (c2.equals(a2)) {
            return;
        }
        if (c2.indexOf(46) == -1) {
            throw new org.apache.a.d.g("Domain attribute \"" + c2 + "\" does not match the host \"" + a2 + "\"");
        }
        if (!c2.startsWith(".")) {
            throw new org.apache.a.d.g("Domain attribute \"" + c2 + "\" violates RFC 2109: domain must start with a dot");
        }
        int indexOf = c2.indexOf(46, 1);
        if (indexOf < 0 || indexOf == c2.length() - 1) {
            throw new org.apache.a.d.g("Domain attribute \"" + c2 + "\" violates RFC 2109: domain must contain an embedded dot");
        }
        String lowerCase = a2.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.endsWith(c2)) {
            throw new org.apache.a.d.g("Illegal domain attribute \"" + c2 + "\". Domain of origin: \"" + lowerCase + "\"");
        }
        if (lowerCase.substring(0, lowerCase.length() - c2.length()).indexOf(46) == -1) {
            return;
        }
        throw new org.apache.a.d.g("Domain attribute \"" + c2 + "\" violates RFC 2109: host minus domain may not contain any dots");
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
        return a2.equals(c2) || (c2.startsWith(".") && a2.endsWith(c2));
    }
}
