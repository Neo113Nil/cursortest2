package org.apache.a.f.b;

import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.a.z;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: DefaultRedirectStrategy.java */
/* loaded from: classes2.dex */
public class k implements org.apache.a.b.l {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9775a = LogFactory.getLog(getClass());

    @Override // org.apache.a.b.l
    public boolean a(org.apache.a.p pVar, org.apache.a.r rVar, org.apache.a.j.e eVar) throws z {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        int b2 = rVar.a().b();
        String a2 = pVar.getRequestLine().a();
        org.apache.a.d firstHeader = rVar.getFirstHeader(GooglePlayServicesInterstitial.LOCATION_KEY);
        if (b2 != 307) {
            switch (b2) {
                case 301:
                    break;
                case 302:
                    return (a2.equalsIgnoreCase("GET") || a2.equalsIgnoreCase("HEAD")) && firstHeader != null;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return a2.equalsIgnoreCase("GET") || a2.equalsIgnoreCase("HEAD");
    }

    public URI c(org.apache.a.p pVar, org.apache.a.r rVar, org.apache.a.j.e eVar) throws z {
        URI a2;
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        org.apache.a.d firstHeader = rVar.getFirstHeader(GooglePlayServicesInterstitial.LOCATION_KEY);
        if (firstHeader == null) {
            throw new z("Received redirect response " + rVar.a() + " but no location header");
        }
        String d2 = firstHeader.d();
        if (this.f9775a.isDebugEnabled()) {
            this.f9775a.debug("Redirect requested to location '" + d2 + "'");
        }
        URI a3 = a(d2);
        org.apache.a.i.d params = rVar.getParams();
        if (!a3.isAbsolute()) {
            if (params.b("http.protocol.reject-relative-redirect")) {
                throw new z("Relative redirect location '" + a3 + "' not allowed");
            }
            org.apache.a.m mVar = (org.apache.a.m) eVar.a("http.target_host");
            if (mVar == null) {
                throw new IllegalStateException("Target host not available in the HTTP context");
            }
            try {
                a3 = org.apache.a.b.e.b.a(org.apache.a.b.e.b.a(new URI(pVar.getRequestLine().c()), mVar, true), a3);
            } catch (URISyntaxException e) {
                throw new z(e.getMessage(), e);
            }
        }
        if (params.c("http.protocol.allow-circular-redirects")) {
            q qVar = (q) eVar.a("http.protocol.redirect-locations");
            if (qVar == null) {
                qVar = new q();
                eVar.a("http.protocol.redirect-locations", qVar);
            }
            if (a3.getFragment() != null) {
                try {
                    a2 = org.apache.a.b.e.b.a(a3, new org.apache.a.m(a3.getHost(), a3.getPort(), a3.getScheme()), true);
                } catch (URISyntaxException e2) {
                    throw new z(e2.getMessage(), e2);
                }
            } else {
                a2 = a3;
            }
            if (qVar.a(a2)) {
                throw new org.apache.a.b.c("Circular redirect to '" + a2 + "'");
            }
            qVar.b(a2);
        }
        return a3;
    }

    protected URI a(String str) throws z {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new z("Invalid redirect URI: " + str, e);
        }
    }

    @Override // org.apache.a.b.l
    public org.apache.a.b.b.k b(org.apache.a.p pVar, org.apache.a.r rVar, org.apache.a.j.e eVar) throws z {
        URI c2 = c(pVar, rVar, eVar);
        if (pVar.getRequestLine().a().equalsIgnoreCase("HEAD")) {
            return new org.apache.a.b.b.e(c2);
        }
        return new org.apache.a.b.b.d(c2);
    }
}
