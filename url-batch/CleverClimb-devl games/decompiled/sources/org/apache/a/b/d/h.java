package org.apache.a.b.d;

import java.io.IOException;
import org.apache.a.d.k;
import org.apache.a.l;
import org.apache.a.r;
import org.apache.a.t;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: ResponseProcessCookies.java */
/* loaded from: classes2.dex */
public class h implements t {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9657a = LogFactory.getLog(getClass());

    @Override // org.apache.a.t
    public void a(r rVar, org.apache.a.j.e eVar) throws l, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        org.apache.a.d.h hVar = (org.apache.a.d.h) eVar.a("http.cookie-spec");
        if (hVar == null) {
            this.f9657a.debug("Cookie spec not specified in HTTP context");
            return;
        }
        org.apache.a.b.e eVar2 = (org.apache.a.b.e) eVar.a("http.cookie-store");
        if (eVar2 == null) {
            this.f9657a.debug("Cookie store not specified in HTTP context");
            return;
        }
        org.apache.a.d.e eVar3 = (org.apache.a.d.e) eVar.a("http.cookie-origin");
        if (eVar3 == null) {
            this.f9657a.debug("Cookie origin not specified in HTTP context");
            return;
        }
        a(rVar.headerIterator("Set-Cookie"), hVar, eVar3, eVar2);
        if (hVar.a() > 0) {
            a(rVar.headerIterator("Set-Cookie2"), hVar, eVar3, eVar2);
        }
    }

    private void a(org.apache.a.g gVar, org.apache.a.d.h hVar, org.apache.a.d.e eVar, org.apache.a.b.e eVar2) {
        while (gVar.hasNext()) {
            org.apache.a.d a2 = gVar.a();
            try {
                for (org.apache.a.d.b bVar : hVar.a(a2, eVar)) {
                    try {
                        hVar.a(bVar, eVar);
                        eVar2.a(bVar);
                        if (this.f9657a.isDebugEnabled()) {
                            this.f9657a.debug("Cookie accepted: \"" + bVar + "\". ");
                        }
                    } catch (k e) {
                        if (this.f9657a.isWarnEnabled()) {
                            this.f9657a.warn("Cookie rejected: \"" + bVar + "\". " + e.getMessage());
                        }
                    }
                }
            } catch (k e2) {
                if (this.f9657a.isWarnEnabled()) {
                    this.f9657a.warn("Invalid cookie header: \"" + a2 + "\". " + e2.getMessage());
                }
            }
        }
    }
}
