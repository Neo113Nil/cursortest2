package org.apache.a.b.d;

import java.io.IOException;
import org.apache.a.l;
import org.apache.a.m;
import org.apache.a.r;
import org.apache.a.t;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: ResponseAuthCache.java */
/* loaded from: classes2.dex */
public class g implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9656a = LogFactory.getLog(getClass());

    @Override // org.apache.a.t
    public void a(r rVar, org.apache.a.j.e eVar) throws l, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        org.apache.a.b.a aVar = (org.apache.a.b.a) eVar.a("http.auth.auth-cache");
        m mVar = (m) eVar.a("http.target_host");
        org.apache.a.a.e eVar2 = (org.apache.a.a.e) eVar.a("http.auth.target-scope");
        if (mVar != null && eVar2 != null && a(eVar2)) {
            if (aVar == null) {
                aVar = new org.apache.a.f.b.c();
                eVar.a("http.auth.auth-cache", aVar);
            }
            a(aVar, mVar, eVar2);
        }
        m mVar2 = (m) eVar.a("http.proxy_host");
        org.apache.a.a.e eVar3 = (org.apache.a.a.e) eVar.a("http.auth.proxy-scope");
        if (mVar2 == null || eVar3 == null || !a(eVar3)) {
            return;
        }
        if (aVar == null) {
            aVar = new org.apache.a.f.b.c();
            eVar.a("http.auth.auth-cache", aVar);
        }
        a(aVar, mVar2, eVar3);
    }

    private boolean a(org.apache.a.a.e eVar) {
        org.apache.a.a.a c2 = eVar.c();
        if (c2 == null || !c2.d()) {
            return false;
        }
        String a2 = c2.a();
        return a2.equalsIgnoreCase("Basic") || a2.equalsIgnoreCase("Digest");
    }

    private void a(org.apache.a.b.a aVar, m mVar, org.apache.a.a.e eVar) {
        org.apache.a.a.a c2 = eVar.c();
        if (eVar.e() != null) {
            if (eVar.d() != null) {
                if (this.f9656a.isDebugEnabled()) {
                    this.f9656a.debug("Caching '" + c2.a() + "' auth scheme for " + mVar);
                }
                aVar.a(mVar, c2);
                return;
            }
            aVar.b(mVar);
        }
    }
}
