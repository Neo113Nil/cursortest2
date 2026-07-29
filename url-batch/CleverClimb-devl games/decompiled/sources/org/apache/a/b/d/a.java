package org.apache.a.b.d;

import com.mopub.common.Constants;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.apache.a.b.b.k;
import org.apache.a.d.j;
import org.apache.a.l;
import org.apache.a.m;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.a.z;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: RequestAddCookies.java */
/* loaded from: classes2.dex */
public class a implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9651a = LogFactory.getLog(getClass());

    @Override // org.apache.a.q
    public void a(p pVar, org.apache.a.j.e eVar) throws l, IOException {
        URI uri;
        org.apache.a.d b2;
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        if (pVar.getRequestLine().a().equalsIgnoreCase("CONNECT")) {
            return;
        }
        org.apache.a.b.e eVar2 = (org.apache.a.b.e) eVar.a("http.cookie-store");
        if (eVar2 == null) {
            this.f9651a.debug("Cookie store not specified in HTTP context");
            return;
        }
        j jVar = (j) eVar.a("http.cookiespec-registry");
        if (jVar == null) {
            this.f9651a.debug("CookieSpec registry not specified in HTTP context");
            return;
        }
        m mVar = (m) eVar.a("http.target_host");
        if (mVar == null) {
            this.f9651a.debug("Target host not set in the context");
            return;
        }
        org.apache.a.c.m mVar2 = (org.apache.a.c.m) eVar.a("http.connection");
        if (mVar2 == null) {
            this.f9651a.debug("HTTP connection not set in the context");
            return;
        }
        String c2 = org.apache.a.b.c.a.c(pVar.getParams());
        if (this.f9651a.isDebugEnabled()) {
            this.f9651a.debug("CookieSpec selected: " + c2);
        }
        if (pVar instanceof k) {
            uri = ((k) pVar).getURI();
        } else {
            try {
                uri = new URI(pVar.getRequestLine().c());
            } catch (URISyntaxException e) {
                throw new z("Invalid request URI: " + pVar.getRequestLine().c(), e);
            }
        }
        String a2 = mVar.a();
        int b3 = mVar.b();
        boolean z = false;
        if (b3 < 0) {
            if (mVar2.l().c() == 1) {
                b3 = mVar2.h();
            } else {
                String c3 = mVar.c();
                if (c3.equalsIgnoreCase(Constants.HTTP)) {
                    b3 = 80;
                } else {
                    b3 = c3.equalsIgnoreCase(Constants.HTTPS) ? 443 : 0;
                }
            }
        }
        org.apache.a.d.e eVar3 = new org.apache.a.d.e(a2, b3, uri.getPath(), mVar2.k());
        org.apache.a.d.h a3 = jVar.a(c2, pVar.getParams());
        ArrayList<org.apache.a.d.b> arrayList = new ArrayList(eVar2.a());
        ArrayList arrayList2 = new ArrayList();
        Date date = new Date();
        for (org.apache.a.d.b bVar : arrayList) {
            if (!bVar.a(date)) {
                if (a3.b(bVar, eVar3)) {
                    if (this.f9651a.isDebugEnabled()) {
                        this.f9651a.debug("Cookie " + bVar + " match " + eVar3);
                    }
                    arrayList2.add(bVar);
                }
            } else if (this.f9651a.isDebugEnabled()) {
                this.f9651a.debug("Cookie " + bVar + " expired");
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator<org.apache.a.d> it = a3.a(arrayList2).iterator();
            while (it.hasNext()) {
                pVar.addHeader(it.next());
            }
        }
        int a4 = a3.a();
        if (a4 > 0) {
            for (org.apache.a.d.b bVar2 : arrayList2) {
                if (a4 != bVar2.g() || !(bVar2 instanceof org.apache.a.d.m)) {
                    z = true;
                }
            }
            if (z && (b2 = a3.b()) != null) {
                pVar.addHeader(b2);
            }
        }
        eVar.a("http.cookie-spec", a3);
        eVar.a("http.cookie-origin", eVar3);
    }
}
