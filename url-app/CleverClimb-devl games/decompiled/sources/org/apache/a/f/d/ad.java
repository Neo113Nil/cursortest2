package org.apache.a.f.d;

import java.util.Locale;

/* compiled from: RFC2965DomainAttributeHandler.java */
/* loaded from: classes2.dex */
public class ad implements org.apache.a.d.c {
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
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.startsWith(".")) {
            lowerCase = '.' + lowerCase;
        }
        lVar.d(lowerCase);
    }

    public boolean a(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }

    @Override // org.apache.a.d.c
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        String lowerCase = eVar.a().toLowerCase(Locale.ENGLISH);
        if (bVar.c() == null) {
            throw new org.apache.a.d.g("Invalid cookie state: domain not specified");
        }
        String lowerCase2 = bVar.c().toLowerCase(Locale.ENGLISH);
        if ((bVar instanceof org.apache.a.d.a) && ((org.apache.a.d.a) bVar).b("domain")) {
            if (!lowerCase2.startsWith(".")) {
                throw new org.apache.a.d.g("Domain attribute \"" + bVar.c() + "\" violates RFC 2109: domain must start with a dot");
            }
            int indexOf = lowerCase2.indexOf(46, 1);
            if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                throw new org.apache.a.d.g("Domain attribute \"" + bVar.c() + "\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
            }
            if (!a(lowerCase, lowerCase2)) {
                throw new org.apache.a.d.g("Domain attribute \"" + bVar.c() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
            }
            if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) == -1) {
                return;
            }
            throw new org.apache.a.d.g("Domain attribute \"" + bVar.c() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
        }
        if (bVar.c().equals(lowerCase)) {
            return;
        }
        throw new org.apache.a.d.g("Illegal domain attribute: \"" + bVar.c() + "\".Domain of origin: \"" + lowerCase + "\"");
    }

    @Override // org.apache.a.d.c
    public boolean b(org.apache.a.d.b bVar, org.apache.a.d.e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
        String lowerCase = eVar.a().toLowerCase(Locale.ENGLISH);
        String c2 = bVar.c();
        return a(lowerCase, c2) && lowerCase.substring(0, lowerCase.length() - c2.length()).indexOf(46) == -1;
    }
}
