package org.apache.a.f.b;

import java.util.List;
import java.util.Map;

/* compiled from: DefaultProxyAuthenticationHandler.java */
/* loaded from: classes2.dex */
public class j extends a {
    @Override // org.apache.a.b.b
    public boolean a(org.apache.a.r rVar, org.apache.a.j.e eVar) {
        if (rVar != null) {
            return rVar.a().b() == 407;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    @Override // org.apache.a.b.b
    public Map<String, org.apache.a.d> b(org.apache.a.r rVar, org.apache.a.j.e eVar) throws org.apache.a.a.j {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        return a(rVar.getHeaders("Proxy-Authenticate"));
    }

    @Override // org.apache.a.f.b.a
    protected List<String> c(org.apache.a.r rVar, org.apache.a.j.e eVar) {
        List<String> list = (List) rVar.getParams().a("http.auth.proxy-scheme-pref");
        return list != null ? list : super.c(rVar, eVar);
    }
}
