package org.apache.a.b.d;

import java.io.IOException;
import org.apache.a.l;
import org.apache.a.m;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: RequestAuthCache.java */
/* loaded from: classes2.dex */
public class b implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9652a = LogFactory.getLog(getClass());

    @Override // org.apache.a.q
    public void a(p pVar, org.apache.a.j.e eVar) throws l, IOException {
        org.apache.a.a.a a2;
        org.apache.a.a.a a3;
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        org.apache.a.b.a aVar = (org.apache.a.b.a) eVar.a("http.auth.auth-cache");
        if (aVar == null) {
            this.f9652a.debug("Auth cache not set in the context");
            return;
        }
        org.apache.a.b.f fVar = (org.apache.a.b.f) eVar.a("http.auth.credentials-provider");
        if (fVar == null) {
            this.f9652a.debug("Credentials provider not set in the context");
            return;
        }
        m mVar = (m) eVar.a("http.target_host");
        org.apache.a.a.e eVar2 = (org.apache.a.a.e) eVar.a("http.auth.target-scope");
        if (mVar != null && eVar2 != null && eVar2.c() == null && (a3 = aVar.a(mVar)) != null) {
            a(mVar, a3, eVar2, fVar);
        }
        m mVar2 = (m) eVar.a("http.proxy_host");
        org.apache.a.a.e eVar3 = (org.apache.a.a.e) eVar.a("http.auth.proxy-scope");
        if (mVar2 == null || eVar3 == null || eVar3.c() != null || (a2 = aVar.a(mVar2)) == null) {
            return;
        }
        a(mVar2, a2, eVar3, fVar);
    }

    private void a(m mVar, org.apache.a.a.a aVar, org.apache.a.a.e eVar, org.apache.a.b.f fVar) {
        String a2 = aVar.a();
        if (this.f9652a.isDebugEnabled()) {
            this.f9652a.debug("Re-using cached '" + a2 + "' auth scheme for " + mVar);
        }
        org.apache.a.a.h a3 = fVar.a(new org.apache.a.a.d(mVar.a(), mVar.b(), org.apache.a.a.d.f9638b, a2));
        if (a3 != null) {
            eVar.a(aVar);
            eVar.a(a3);
        } else {
            this.f9652a.debug("No credentials for preemptive authentication");
        }
    }
}
