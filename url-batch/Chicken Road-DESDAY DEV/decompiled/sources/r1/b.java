package r1;

import java.io.IOException;
import java.net.ProtocolException;
import k0.k;
import m1.m;
import m1.r;
import m1.s;
import m1.t;
import q1.j;
import t1.C0315a;
import u1.l;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // m1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(f fVar) {
        IOException iOException;
        s a2;
        t tVar;
        q1.e eVar = fVar.d;
        b1.d.b(eVar);
        j jVar = eVar.f3458a;
        d dVar = eVar.f3460c;
        q1.m mVar = eVar.f3461e;
        H.e eVar2 = fVar.f3522e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                b1.d.e(jVar, "call");
                dVar.d(eVar2);
                k.o((String) eVar2.f205b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0315a) {
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
                    r c2 = eVar.c(false);
                    b1.d.b(c2);
                    b1.d.e(jVar, "call");
                    c2.f3239a = eVar2;
                    c2.f3242e = mVar.f3490e;
                    c2.f3246k = currentTimeMillis;
                    c2.f3247l = System.currentTimeMillis();
                    s a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        b1.d.e(jVar, "call");
                        r h = a3.h();
                        h.f3244g = eVar.b(a3);
                        a2 = h.a();
                        if (!"close".equalsIgnoreCase(((m1.j) a2.f3249a.d).a("Connection")) || "close".equalsIgnoreCase(s.g("Connection", a2))) {
                            dVar.g().k();
                        }
                        if (i != 204 || i == 205) {
                            tVar = a2.f3254g;
                            if ((tVar == null ? tVar.g() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(tVar != null ? Long.valueOf(tVar.g()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a2;
                    }
                    r c3 = eVar.c(false);
                    b1.d.b(c3);
                    c3.f3239a = eVar2;
                    c3.f3242e = mVar.f3490e;
                    c3.f3246k = currentTimeMillis;
                    c3.f3247l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    b1.d.e(jVar, "call");
                    r h2 = a3.h();
                    h2.f3244g = eVar.b(a3);
                    a2 = h2.a();
                    if (!"close".equalsIgnoreCase(((m1.j) a2.f3249a.d).a("Connection"))) {
                    }
                    dVar.g().k();
                    if (i != 204) {
                    }
                    tVar = a2.f3254g;
                    if ((tVar == null ? tVar.g() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    l.e(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            b1.d.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
