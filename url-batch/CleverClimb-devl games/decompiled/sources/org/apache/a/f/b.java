package org.apache.a.f;

import org.apache.a.aa;
import org.apache.a.ae;
import org.apache.a.g;
import org.apache.a.h.o;
import org.apache.a.i;
import org.apache.a.j;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.y;

/* compiled from: DefaultConnectionReuseStrategy.java */
/* loaded from: classes2.dex */
public class b implements org.apache.a.b {
    @Override // org.apache.a.b
    public boolean a(r rVar, org.apache.a.j.e eVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        }
        if (eVar == null) {
            throw new IllegalArgumentException("HTTP context may not be null.");
        }
        i iVar = (i) eVar.a("http.connection");
        if (iVar != null && !iVar.d()) {
            return false;
        }
        j b2 = rVar.b();
        aa a2 = rVar.a().a();
        if (b2 != null && b2.c() < 0 && (!b2.b() || a2.c(u.f10003b))) {
            return false;
        }
        g headerIterator = rVar.headerIterator("Connection");
        if (!headerIterator.hasNext()) {
            headerIterator = rVar.headerIterator("Proxy-Connection");
        }
        if (headerIterator.hasNext()) {
            try {
                ae a3 = a(headerIterator);
                boolean z = false;
                while (a3.hasNext()) {
                    String a4 = a3.a();
                    if ("Close".equalsIgnoreCase(a4)) {
                        return false;
                    }
                    if ("Keep-Alive".equalsIgnoreCase(a4)) {
                        z = true;
                    }
                }
                if (z) {
                    return true;
                }
            } catch (y unused) {
                return false;
            }
        }
        return !a2.c(u.f10003b);
    }

    protected ae a(g gVar) {
        return new o(gVar);
    }
}
