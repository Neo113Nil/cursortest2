package org.apache.a.f.b;

import java.security.Principal;
import javax.net.ssl.SSLSession;

/* compiled from: DefaultUserTokenHandler.java */
/* loaded from: classes2.dex */
public class o implements org.apache.a.b.n {
    @Override // org.apache.a.b.n
    public Object a(org.apache.a.j.e eVar) {
        Principal principal;
        SSLSession m;
        org.apache.a.a.e eVar2 = (org.apache.a.a.e) eVar.a("http.auth.target-scope");
        if (eVar2 != null) {
            principal = a(eVar2);
            if (principal == null) {
                principal = a((org.apache.a.a.e) eVar.a("http.auth.proxy-scope"));
            }
        } else {
            principal = null;
        }
        if (principal != null) {
            return principal;
        }
        org.apache.a.c.m mVar = (org.apache.a.c.m) eVar.a("http.connection");
        return (!mVar.d() || (m = mVar.m()) == null) ? principal : m.getLocalPrincipal();
    }

    private static Principal a(org.apache.a.a.e eVar) {
        org.apache.a.a.h d2;
        org.apache.a.a.a c2 = eVar.c();
        if (c2 == null || !c2.d() || !c2.c() || (d2 = eVar.d()) == null) {
            return null;
        }
        return d2.a();
    }
}
