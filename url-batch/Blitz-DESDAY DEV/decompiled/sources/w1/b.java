package w1;

import h0.a0;
import java.io.IOException;
import java.net.ProtocolException;
import r1.m;
import r1.q;
import r1.r;
import r1.s;
import v1.j;
import y1.C0317a;
import z1.l;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // r1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(f fVar) {
        IOException iOException;
        r a2;
        s sVar;
        v1.e eVar = fVar.d;
        g1.d.b(eVar);
        j jVar = eVar.f3861a;
        d dVar = eVar.f3863c;
        v1.m mVar = eVar.f3864e;
        J.d dVar2 = fVar.f3945e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                g1.d.e(jVar, "call");
                dVar.b(dVar2);
                a0.n((String) dVar2.f358b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0317a) {
                    throw e2;
                }
                if (!eVar.d) {
                    throw e2;
                }
                iOException = e2;
            }
            try {
                dVar.a();
                iOException = null;
                try {
                    q c2 = eVar.c(false);
                    g1.d.b(c2);
                    g1.d.e(jVar, "call");
                    c2.f3535a = dVar2;
                    c2.f3538e = mVar.f3893e;
                    c2.f3542k = currentTimeMillis;
                    c2.f3543l = System.currentTimeMillis();
                    r a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        g1.d.e(jVar, "call");
                        q h = a3.h();
                        h.f3540g = eVar.b(a3);
                        a2 = h.a();
                        if (!"close".equalsIgnoreCase(((r1.j) a2.f3545a.d).a("Connection")) || "close".equalsIgnoreCase(r.g("Connection", a2))) {
                            dVar.h().k();
                        }
                        if (i != 204 || i == 205) {
                            sVar = a2.f3550g;
                            if ((sVar == null ? sVar.g() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(sVar != null ? Long.valueOf(sVar.g()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a2;
                    }
                    q c3 = eVar.c(false);
                    g1.d.b(c3);
                    c3.f3535a = dVar2;
                    c3.f3538e = mVar.f3893e;
                    c3.f3542k = currentTimeMillis;
                    c3.f3543l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    g1.d.e(jVar, "call");
                    q h2 = a3.h();
                    h2.f3540g = eVar.b(a3);
                    a2 = h2.a();
                    if (!"close".equalsIgnoreCase(((r1.j) a2.f3545a.d).a("Connection"))) {
                    }
                    dVar.h().k();
                    if (i != 204) {
                    }
                    sVar = a2.f3550g;
                    if ((sVar == null ? sVar.g() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    l.j(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            g1.d.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
