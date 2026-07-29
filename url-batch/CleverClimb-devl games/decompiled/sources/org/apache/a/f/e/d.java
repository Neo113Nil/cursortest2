package org.apache.a.f.e;

import org.apache.a.e.e;
import org.apache.a.l;
import org.apache.a.o;
import org.apache.a.u;
import org.apache.a.z;

/* compiled from: StrictContentLengthStrategy.java */
/* loaded from: classes2.dex */
public class d implements e {
    @Override // org.apache.a.e.e
    public long a(o oVar) throws l {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        org.apache.a.d firstHeader = oVar.getFirstHeader("Transfer-Encoding");
        org.apache.a.d firstHeader2 = oVar.getFirstHeader("Content-Length");
        if (firstHeader == null) {
            if (firstHeader2 == null) {
                return -1L;
            }
            String d2 = firstHeader2.d();
            try {
                return Long.parseLong(d2);
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid content length: ");
                stringBuffer.append(d2);
                throw new z(stringBuffer.toString());
            }
        }
        String d3 = firstHeader.d();
        if ("chunked".equalsIgnoreCase(d3)) {
            if (!oVar.getProtocolVersion().c(u.f10003b)) {
                return -2L;
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Chunked transfer encoding not allowed for ");
            stringBuffer2.append(oVar.getProtocolVersion());
            throw new z(stringBuffer2.toString());
        }
        if ("identity".equalsIgnoreCase(d3)) {
            return -1L;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("Unsupported transfer encoding: ");
        stringBuffer3.append(d3);
        throw new z(stringBuffer3.toString());
    }
}
