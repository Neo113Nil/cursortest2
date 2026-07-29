package org.apache.a.j;

import java.io.IOException;
import java.net.InetAddress;
import org.apache.a.aa;
import org.apache.a.m;
import org.apache.a.n;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.a.u;
import org.apache.a.z;

/* compiled from: RequestTargetHost.java */
/* loaded from: classes2.dex */
public class k implements q {
    @Override // org.apache.a.q
    public void a(p pVar, e eVar) throws org.apache.a.l, IOException {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        aa b2 = pVar.getRequestLine().b();
        if ((pVar.getRequestLine().a().equalsIgnoreCase("CONNECT") && b2.c(u.f10003b)) || pVar.containsHeader("Host")) {
            return;
        }
        m mVar = (m) eVar.a("http.target_host");
        if (mVar == null) {
            org.apache.a.i iVar = (org.apache.a.i) eVar.a("http.connection");
            if (iVar instanceof n) {
                n nVar = (n) iVar;
                InetAddress g = nVar.g();
                int h = nVar.h();
                if (g != null) {
                    mVar = new m(g.getHostName(), h);
                }
            }
            if (mVar == null) {
                if (!b2.c(u.f10003b)) {
                    throw new z("Target host missing");
                }
                return;
            }
        }
        pVar.addHeader("Host", mVar.e());
    }
}
