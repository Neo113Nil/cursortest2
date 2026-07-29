package org.apache.a.f.d;

import java.util.Locale;
import java.util.StringTokenizer;

/* compiled from: NetscapeDomainHandler.java */
/* loaded from: classes2.dex */
public class t extends f {
    @Override // org.apache.a.f.d.f, org.apache.a.d.c
    public void a(org.apache.a.d.b bVar, org.apache.a.d.e eVar) throws org.apache.a.d.k {
        super.a(bVar, eVar);
        String a2 = eVar.a();
        String c2 = bVar.c();
        if (a2.contains(".")) {
            int countTokens = new StringTokenizer(c2, ".").countTokens();
            if (!a(c2)) {
                if (countTokens >= 3) {
                    return;
                }
                throw new org.apache.a.d.g("Domain attribute \"" + c2 + "\" violates the Netscape cookie specification");
            }
            if (countTokens >= 2) {
                return;
            }
            throw new org.apache.a.d.g("Domain attribute \"" + c2 + "\" violates the Netscape cookie specification for special domains");
        }
    }

    private static boolean a(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
    }

    @Override // org.apache.a.f.d.f, org.apache.a.d.c
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
        return a2.endsWith(c2);
    }
}
