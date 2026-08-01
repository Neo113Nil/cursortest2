package x1;

import h0.d0;
import java.io.IOException;
import java.net.ProtocolException;
import s1.m;
import s1.q;
import s1.r;
import s1.s;
import w1.j;
import z1.C0322a;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // s1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r a(f fVar) {
        IOException iOException;
        r a2;
        s sVar;
        w1.e eVar = fVar.d;
        h1.d.b(eVar);
        j jVar = eVar.f4221a;
        d dVar = eVar.f4223c;
        w1.m mVar = eVar.f4224e;
        I.d dVar2 = fVar.f4294e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                h1.d.e(jVar, "call");
                dVar.g(dVar2);
                d0.m((String) dVar2.f320b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0322a) {
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
                    h1.d.b(c2);
                    h1.d.e(jVar, "call");
                    c2.f3691a = dVar2;
                    c2.f3694e = mVar.f4255e;
                    c2.f3699k = currentTimeMillis;
                    c2.f3700l = System.currentTimeMillis();
                    r a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        h1.d.e(jVar, "call");
                        q h2 = a3.h();
                        h2.f3696g = eVar.b(a3);
                        a2 = h2.a();
                        if (!"close".equalsIgnoreCase(((s1.j) a2.f3702a.d).a("Connection")) || "close".equalsIgnoreCase(r.g("Connection", a2))) {
                            dVar.h().k();
                        }
                        if (i != 204 || i == 205) {
                            sVar = a2.f3707g;
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
                    h1.d.b(c3);
                    c3.f3691a = dVar2;
                    c3.f3694e = mVar.f4255e;
                    c3.f3699k = currentTimeMillis;
                    c3.f3700l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    h1.d.e(jVar, "call");
                    q h22 = a3.h();
                    h22.f3696g = eVar.b(a3);
                    a2 = h22.a();
                    if (!"close".equalsIgnoreCase(((s1.j) a2.f3702a.d).a("Connection"))) {
                    }
                    dVar.h().k();
                    if (i != 204) {
                    }
                    sVar = a2.f3707g;
                    if ((sVar == null ? sVar.g() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    A1.d.e(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            h1.d.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
