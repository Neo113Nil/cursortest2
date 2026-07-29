package org.apache.a.j;

import java.io.IOException;
import org.apache.a.p;
import org.apache.a.q;

/* compiled from: RequestUserAgent.java */
/* loaded from: classes2.dex */
public class l implements q {
    @Override // org.apache.a.q
    public void a(p pVar, e eVar) throws org.apache.a.l, IOException {
        String c2;
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (pVar.containsHeader("User-Agent") || (c2 = org.apache.a.i.e.c(pVar.getParams())) == null) {
            return;
        }
        pVar.addHeader("User-Agent", c2);
    }
}
