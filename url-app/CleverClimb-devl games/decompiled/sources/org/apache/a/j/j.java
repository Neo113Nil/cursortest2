package org.apache.a.j;

import java.io.IOException;
import org.apache.a.aa;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.a.u;

/* compiled from: RequestExpectContinue.java */
/* loaded from: classes2.dex */
public class j implements q {
    @Override // org.apache.a.q
    public void a(p pVar, e eVar) throws org.apache.a.l, IOException {
        org.apache.a.j entity;
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (!(pVar instanceof org.apache.a.k) || (entity = ((org.apache.a.k) pVar).getEntity()) == null || entity.c() == 0) {
            return;
        }
        aa b2 = pVar.getRequestLine().b();
        if (!org.apache.a.i.e.d(pVar.getParams()) || b2.c(u.f10003b)) {
            return;
        }
        pVar.addHeader("Expect", "100-continue");
    }
}
