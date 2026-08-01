package E1;

import D1.j;
import D1.m;
import G1.C0000a;
import a.AbstractC0058a;
import java.io.IOException;
import java.net.ProtocolException;
import z1.p;
import z1.u;
import z1.v;

/* loaded from: classes.dex */
public final class b implements p {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // z1.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v a(g gVar) {
        IOException iOException;
        v a2;
        h hVar;
        D1.e eVar = gVar.f308d;
        j1.h.b(eVar);
        j jVar = eVar.f219a;
        e eVar2 = eVar.f221c;
        m mVar = eVar.e;
        J.d dVar = gVar.e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                j1.h.e(jVar, "call");
                eVar2.b(dVar);
                AbstractC0058a.Q((String) dVar.f625b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e) {
                if (e instanceof C0000a) {
                    throw e;
                }
                if (!eVar.f222d) {
                    throw e;
                }
                iOException = e;
            }
            try {
                eVar2.a();
                iOException = null;
                try {
                    u c2 = eVar.c(false);
                    j1.h.b(c2);
                    j1.h.e(jVar, "call");
                    c2.f4934a = dVar;
                    c2.e = mVar.e;
                    c2.f4941k = currentTimeMillis;
                    c2.f4942l = System.currentTimeMillis();
                    v a3 = c2.a();
                    int i = a3.f4947d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        j1.h.e(jVar, "call");
                        u d2 = a3.d();
                        d2.f4939g = eVar.b(a3);
                        a2 = d2.a();
                        if (!"close".equalsIgnoreCase(((z1.m) a2.f4944a.f627d).a("Connection")) || "close".equalsIgnoreCase(v.a("Connection", a2))) {
                            eVar2.h().k();
                        }
                        if (i != 204 || i == 205) {
                            hVar = a2.f4949g;
                            if ((hVar == null ? hVar.a() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(hVar != null ? Long.valueOf(hVar.a()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a2;
                    }
                    u c3 = eVar.c(false);
                    j1.h.b(c3);
                    c3.f4934a = dVar;
                    c3.e = mVar.e;
                    c3.f4941k = currentTimeMillis;
                    c3.f4942l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.f4947d;
                    j1.h.e(jVar, "call");
                    u d22 = a3.d();
                    d22.f4939g = eVar.b(a3);
                    a2 = d22.a();
                    if (!"close".equalsIgnoreCase(((z1.m) a2.f4944a.f627d).a("Connection"))) {
                    }
                    eVar2.h().k();
                    if (i != 204) {
                    }
                    hVar = a2.f4949g;
                    if ((hVar == null ? hVar.a() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e2) {
                    if (iOException == null) {
                        throw e2;
                    }
                    AbstractC0058a.a(iOException, e2);
                    throw iOException;
                }
            } catch (IOException e3) {
                eVar.d(e3);
                throw e3;
            }
        } catch (IOException e4) {
            j1.h.e(jVar, "call");
            eVar.d(e4);
            throw e4;
        }
    }
}
