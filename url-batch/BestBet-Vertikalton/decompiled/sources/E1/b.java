package E1;

import D1.j;
import G1.C0000a;
import java.io.IOException;
import java.net.ProtocolException;
import z1.m;
import z1.r;
import z1.s;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // z1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(g gVar) {
        IOException iOException;
        s a2;
        h hVar;
        D1.e eVar = gVar.d;
        k1.e.b(eVar);
        j jVar = eVar.f163a;
        e eVar2 = eVar.f165c;
        D1.m mVar = eVar.f166e;
        H.e eVar3 = gVar.f236e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                k1.e.e(jVar, "call");
                eVar2.f(eVar3);
                H1.d.a0((String) eVar3.f482b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0000a) {
                    throw e2;
                }
                if (!eVar.d) {
                    throw e2;
                }
                iOException = e2;
            }
            try {
                eVar2.a();
                iOException = null;
                try {
                    r c2 = eVar.c(false);
                    k1.e.b(c2);
                    k1.e.e(jVar, "call");
                    c2.f4749a = eVar3;
                    c2.f4752e = mVar.f195e;
                    c2.f4756k = currentTimeMillis;
                    c2.f4757l = System.currentTimeMillis();
                    s a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        k1.e.e(jVar, "call");
                        r d = a3.d();
                        d.f4754g = eVar.b(a3);
                        a2 = d.a();
                        if (!"close".equalsIgnoreCase(((z1.j) a2.f4759a.d).a("Connection")) || "close".equalsIgnoreCase(s.a("Connection", a2))) {
                            eVar2.h().k();
                        }
                        if (i != 204 || i == 205) {
                            hVar = a2.f4764g;
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
                    r c3 = eVar.c(false);
                    k1.e.b(c3);
                    c3.f4749a = eVar3;
                    c3.f4752e = mVar.f195e;
                    c3.f4756k = currentTimeMillis;
                    c3.f4757l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    k1.e.e(jVar, "call");
                    r d2 = a3.d();
                    d2.f4754g = eVar.b(a3);
                    a2 = d2.a();
                    if (!"close".equalsIgnoreCase(((z1.j) a2.f4759a.d).a("Connection"))) {
                    }
                    eVar2.h().k();
                    if (i != 204) {
                    }
                    hVar = a2.f4764g;
                    if ((hVar == null ? hVar.a() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    H1.d.b(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            k1.e.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
