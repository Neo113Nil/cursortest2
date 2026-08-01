package p1;

import java.io.IOException;
import java.net.ProtocolException;
import k0.y;
import k1.l;
import k1.o;
import k1.t;
import k1.u;
import k1.v;
import o1.j;
import o1.m;
import r1.C0290a;

/* loaded from: classes.dex */
public final class b implements o {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // k1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(f fVar) {
        IOException iOException;
        u a2;
        v vVar;
        o1.e eVar = fVar.d;
        Z0.d.b(eVar);
        j jVar = eVar.f3377a;
        d dVar = eVar.f3379c;
        m mVar = eVar.f3380e;
        H.e eVar2 = fVar.f3470e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Z0.d.e(jVar, "call");
                dVar.e(eVar2);
                y.j((String) eVar2.f198b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0290a) {
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
                    t c2 = eVar.c(false);
                    Z0.d.b(c2);
                    Z0.d.e(jVar, "call");
                    c2.f2887a = eVar2;
                    c2.f2890e = mVar.f3409e;
                    c2.f2894k = currentTimeMillis;
                    c2.f2895l = System.currentTimeMillis();
                    u a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        Z0.d.e(jVar, "call");
                        t h = a3.h();
                        h.f2892g = eVar.b(a3);
                        a2 = h.a();
                        if (!"close".equalsIgnoreCase(((l) a2.f2897a.d).a("Connection")) || "close".equalsIgnoreCase(u.f("Connection", a2))) {
                            dVar.h().k();
                        }
                        if (i != 204 || i == 205) {
                            vVar = a2.f2902g;
                            if ((vVar == null ? vVar.f() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(vVar != null ? Long.valueOf(vVar.f()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a2;
                    }
                    t c3 = eVar.c(false);
                    Z0.d.b(c3);
                    c3.f2887a = eVar2;
                    c3.f2890e = mVar.f3409e;
                    c3.f2894k = currentTimeMillis;
                    c3.f2895l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    Z0.d.e(jVar, "call");
                    t h2 = a3.h();
                    h2.f2892g = eVar.b(a3);
                    a2 = h2.a();
                    if (!"close".equalsIgnoreCase(((l) a2.f2897a.d).a("Connection"))) {
                    }
                    dVar.h().k();
                    if (i != 204) {
                    }
                    vVar = a2.f2902g;
                    if ((vVar == null ? vVar.f() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    s1.d.d(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            Z0.d.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
