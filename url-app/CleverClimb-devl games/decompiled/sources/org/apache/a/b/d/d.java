package org.apache.a.b.d;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import org.apache.a.l;
import org.apache.a.p;
import org.apache.a.q;

/* compiled from: RequestDefaultHeaders.java */
/* loaded from: classes2.dex */
public class d implements q {
    @Override // org.apache.a.q
    public void a(p pVar, org.apache.a.j.e eVar) throws l, IOException {
        Collection collection;
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (pVar.getRequestLine().a().equalsIgnoreCase("CONNECT") || (collection = (Collection) pVar.getParams().a("http.default-headers")) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            pVar.addHeader((org.apache.a.d) it.next());
        }
    }
}
