package org.apache.a.b.d;

import java.io.IOException;
import org.apache.a.c.m;
import org.apache.a.l;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: RequestClientConnControl.java */
/* loaded from: classes2.dex */
public class c implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Log f9653a = LogFactory.getLog(getClass());

    @Override // org.apache.a.q
    public void a(p pVar, org.apache.a.j.e eVar) throws l, IOException {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (pVar.getRequestLine().a().equalsIgnoreCase("CONNECT")) {
            pVar.setHeader("Proxy-Connection", "Keep-Alive");
            return;
        }
        m mVar = (m) eVar.a("http.connection");
        if (mVar == null) {
            this.f9653a.debug("HTTP connection not set in the context");
            return;
        }
        org.apache.a.c.b.b l = mVar.l();
        if ((l.c() == 1 || l.e()) && !pVar.containsHeader("Connection")) {
            pVar.addHeader("Connection", "Keep-Alive");
        }
        if (l.c() != 2 || l.e() || pVar.containsHeader("Proxy-Connection")) {
            return;
        }
        pVar.addHeader("Proxy-Connection", "Keep-Alive");
    }
}
