package org.apache.a.f.e;

import org.apache.a.e.e;
import org.apache.a.l;
import org.apache.a.o;
import org.apache.a.y;
import org.apache.a.z;

/* compiled from: LaxContentLengthStrategy.java */
/* loaded from: classes2.dex */
public class c implements e {
    @Override // org.apache.a.e.e
    public long a(o oVar) throws l {
        long j;
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        boolean b2 = oVar.getParams().b("http.protocol.strict-transfer-encoding");
        org.apache.a.d firstHeader = oVar.getFirstHeader("Transfer-Encoding");
        org.apache.a.d firstHeader2 = oVar.getFirstHeader("Content-Length");
        if (firstHeader == null) {
            if (firstHeader2 == null) {
                return -1L;
            }
            org.apache.a.d[] headers = oVar.getHeaders("Content-Length");
            if (b2 && headers.length > 1) {
                throw new z("Multiple content length headers");
            }
            int length = headers.length - 1;
            while (true) {
                if (length < 0) {
                    j = -1;
                    break;
                }
                org.apache.a.d dVar = headers[length];
                try {
                    j = Long.parseLong(dVar.d());
                    break;
                } catch (NumberFormatException unused) {
                    if (b2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Invalid content length: ");
                        stringBuffer.append(dVar.d());
                        throw new z(stringBuffer.toString());
                    }
                    length--;
                }
            }
            if (j >= 0) {
                return j;
            }
            return -1L;
        }
        try {
            org.apache.a.e[] e = firstHeader.e();
            if (b2) {
                for (org.apache.a.e eVar : e) {
                    String a2 = eVar.a();
                    if (a2 != null && a2.length() > 0 && !a2.equalsIgnoreCase("chunked") && !a2.equalsIgnoreCase("identity")) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Unsupported transfer encoding: ");
                        stringBuffer2.append(a2);
                        throw new z(stringBuffer2.toString());
                    }
                }
            }
            int length2 = e.length;
            if ("identity".equalsIgnoreCase(firstHeader.d())) {
                return -1L;
            }
            if (length2 > 0 && "chunked".equalsIgnoreCase(e[length2 - 1].a())) {
                return -2L;
            }
            if (b2) {
                throw new z("Chunk-encoding must be the last one applied");
            }
            return -1L;
        } catch (y e2) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Invalid Transfer-Encoding header value: ");
            stringBuffer3.append(firstHeader);
            throw new z(stringBuffer3.toString(), e2);
        }
    }
}
