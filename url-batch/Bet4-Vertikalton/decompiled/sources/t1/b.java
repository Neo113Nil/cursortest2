package t1;

import java.io.IOException;
import java.net.ProtocolException;
import m.C0260a;
import o1.m;
import o1.r;
import o1.s;
import o1.t;
import s1.j;
import v1.C0308a;

/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // o1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(f fVar) {
        IOException iOException;
        s a2;
        t tVar;
        s1.e eVar = fVar.d;
        d1.d.b(eVar);
        j jVar = eVar.f3705a;
        d dVar = eVar.f3707c;
        s1.m mVar = eVar.f3708e;
        H.e eVar2 = fVar.f3809e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                d1.d.e(jVar, "call");
                dVar.e(eVar2);
                C0260a.q((String) eVar2.f260b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0308a) {
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
                    d1.d.b(c2);
                    d1.d.e(jVar, "call");
                    c2.f3373a = eVar2;
                    c2.f3376e = mVar.f3737e;
                    c2.f3380k = currentTimeMillis;
                    c2.f3381l = System.currentTimeMillis();
                    s a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        d1.d.e(jVar, "call");
                        r h = a3.h();
                        h.f3378g = eVar.b(a3);
                        a2 = h.a();
                        if (!"close".equalsIgnoreCase(((o1.j) a2.f3383a.d).a("Connection")) || "close".equalsIgnoreCase(s.g("Connection", a2))) {
                            dVar.h().k();
                        }
                        if (i != 204 || i == 205) {
                            tVar = a2.f3388g;
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
                    d1.d.b(c3);
                    c3.f3373a = eVar2;
                    c3.f3376e = mVar.f3737e;
                    c3.f3380k = currentTimeMillis;
                    c3.f3381l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    d1.d.e(jVar, "call");
                    r h2 = a3.h();
                    h2.f3378g = eVar.b(a3);
                    a2 = h2.a();
                    if (!"close".equalsIgnoreCase(((o1.j) a2.f3383a.d).a("Connection"))) {
                    }
                    dVar.h().k();
                    if (i != 204) {
                    }
                    tVar = a2.f3388g;
                    if ((tVar == null ? tVar.g() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    w1.d.d(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            d1.d.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
