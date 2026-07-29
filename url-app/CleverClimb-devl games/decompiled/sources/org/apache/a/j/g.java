package org.apache.a.j;

import java.io.IOException;
import java.net.ProtocolException;
import org.apache.a.aa;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;

/* compiled from: HttpRequestExecutor.java */
/* loaded from: classes2.dex */
public class g {
    protected boolean a(p pVar, r rVar) {
        int b2;
        return ("HEAD".equalsIgnoreCase(pVar.getRequestLine().a()) || (b2 = rVar.a().b()) < 200 || b2 == 204 || b2 == 304 || b2 == 205) ? false : true;
    }

    public r a(p pVar, org.apache.a.h hVar, e eVar) throws IOException, org.apache.a.l {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("Client connection may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        try {
            r b2 = b(pVar, hVar, eVar);
            return b2 == null ? c(pVar, hVar, eVar) : b2;
        } catch (IOException e) {
            a(hVar);
            throw e;
        } catch (RuntimeException e2) {
            a(hVar);
            throw e2;
        } catch (org.apache.a.l e3) {
            a(hVar);
            throw e3;
        }
    }

    private static final void a(org.apache.a.h hVar) {
        try {
            hVar.c();
        } catch (IOException unused) {
        }
    }

    public void a(p pVar, f fVar, e eVar) throws org.apache.a.l, IOException {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        eVar.a("http.request", pVar);
        fVar.a(pVar, eVar);
    }

    protected r b(p pVar, org.apache.a.h hVar, e eVar) throws IOException, org.apache.a.l {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        eVar.a("http.connection", hVar);
        eVar.a("http.request_sent", Boolean.FALSE);
        hVar.a(pVar);
        r rVar = null;
        if (pVar instanceof org.apache.a.k) {
            boolean z = true;
            aa b2 = pVar.getRequestLine().b();
            org.apache.a.k kVar = (org.apache.a.k) pVar;
            if (kVar.expectContinue() && !b2.c(u.f10003b)) {
                hVar.b();
                if (hVar.a(pVar.getParams().a("http.protocol.wait-for-continue", 2000))) {
                    r a2 = hVar.a();
                    if (a(pVar, a2)) {
                        hVar.a(a2);
                    }
                    int b3 = a2.a().b();
                    if (b3 >= 200) {
                        z = false;
                        rVar = a2;
                    } else if (b3 != 100) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Unexpected response: ");
                        stringBuffer.append(a2.a());
                        throw new ProtocolException(stringBuffer.toString());
                    }
                }
            }
            if (z) {
                hVar.a(kVar);
            }
        }
        hVar.b();
        eVar.a("http.request_sent", Boolean.TRUE);
        return rVar;
    }

    protected r c(p pVar, org.apache.a.h hVar, e eVar) throws org.apache.a.l, IOException {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("HTTP connection may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        r rVar = null;
        int i = 0;
        while (true) {
            if (rVar != null && i >= 200) {
                return rVar;
            }
            rVar = hVar.a();
            if (a(pVar, rVar)) {
                hVar.a(rVar);
            }
            i = rVar.a().b();
        }
    }

    public void a(r rVar, f fVar, e eVar) throws org.apache.a.l, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("HTTP processor may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        eVar.a("http.response", rVar);
        fVar.a(rVar, eVar);
    }
}
