package org.apache.a.j;

import com.aiming.mdt.utils.Constants;
import java.io.IOException;
import org.apache.a.aa;
import org.apache.a.p;
import org.apache.a.q;
import org.apache.a.u;
import org.apache.a.z;

/* compiled from: RequestContent.java */
/* loaded from: classes2.dex */
public class i implements q {
    @Override // org.apache.a.q
    public void a(p pVar, e eVar) throws org.apache.a.l, IOException {
        if (pVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (pVar instanceof org.apache.a.k) {
            if (pVar.containsHeader("Transfer-Encoding")) {
                throw new z("Transfer-encoding header already present");
            }
            if (pVar.containsHeader("Content-Length")) {
                throw new z("Content-Length header already present");
            }
            aa b2 = pVar.getRequestLine().b();
            org.apache.a.j entity = ((org.apache.a.k) pVar).getEntity();
            if (entity == null) {
                pVar.addHeader("Content-Length", "0");
                return;
            }
            if (entity.b() || entity.c() < 0) {
                if (b2.c(u.f10003b)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Chunked transfer encoding not allowed for ");
                    stringBuffer.append(b2);
                    throw new z(stringBuffer.toString());
                }
                pVar.addHeader("Transfer-Encoding", "chunked");
            } else {
                pVar.addHeader("Content-Length", Long.toString(entity.c()));
            }
            if (entity.d() != null && !pVar.containsHeader(Constants.KEY_CONTENT_TYPE)) {
                pVar.addHeader(entity.d());
            }
            if (entity.e() == null || pVar.containsHeader("Content-Encoding")) {
                return;
            }
            pVar.addHeader(entity.e());
        }
    }
}
