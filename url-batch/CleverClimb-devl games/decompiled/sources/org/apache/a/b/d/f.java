package org.apache.a.b.d;

import java.io.IOException;
import org.apache.a.l;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: RequestTargetAuthentication.java */
/* loaded from: classes2.dex */
public class f implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9655a = LogFactory.getLog(getClass());

    @Override // org.apache.a.q
    public void a(p pVar, org.apache.a.j.e eVar) throws l, IOException {
        org.apache.a.d a2;
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        if (pVar.getRequestLine().a().equalsIgnoreCase("CONNECT") || pVar.containsHeader("Authorization")) {
            return;
        }
        org.apache.a.a.e eVar2 = (org.apache.a.a.e) eVar.a("http.auth.target-scope");
        if (eVar2 == null) {
            this.f9655a.debug("Target auth state not set in the context");
            return;
        }
        org.apache.a.a.a c2 = eVar2.c();
        if (c2 == null) {
            return;
        }
        org.apache.a.a.h d2 = eVar2.d();
        if (d2 == null) {
            this.f9655a.debug("User credentials not available");
            return;
        }
        if (eVar2.e() == null && c2.c()) {
            return;
        }
        try {
            if (c2 instanceof org.apache.a.a.g) {
                a2 = ((org.apache.a.a.g) c2).a(d2, pVar, eVar);
            } else {
                a2 = c2.a(d2, pVar);
            }
            pVar.addHeader(a2);
        } catch (org.apache.a.a.f e) {
            if (this.f9655a.isErrorEnabled()) {
                this.f9655a.error("Authentication error: " + e.getMessage());
            }
        }
    }
}
