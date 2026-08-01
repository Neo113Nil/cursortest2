package n1;

import i1.q;
import i1.r;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
import java.io.IOException;
import java.net.ProtocolException;
import m1.j;
import m1.m;
import p1.C0311a;
import q1.l;

/* loaded from: classes.dex */
public final class b implements q {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1 A[Catch: IOException -> 0x0093, TRY_ENTER, TryCatch #2 {IOException -> 0x0093, blocks: (B:9:0x004a, B:12:0x0077, B:13:0x0095, B:15:0x00b4, B:25:0x00d1, B:28:0x00de, B:30:0x00ef, B:31:0x00f9, B:32:0x0103, B:36:0x00be), top: B:8:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de A[Catch: IOException -> 0x0093, TryCatch #2 {IOException -> 0x0093, blocks: (B:9:0x004a, B:12:0x0077, B:13:0x0095, B:15:0x00b4, B:25:0x00d1, B:28:0x00de, B:30:0x00ef, B:31:0x00f9, B:32:0x0103, B:36:0x00be), top: B:8:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    @Override // i1.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(f fVar) {
        IOException iOException;
        y a2;
        z zVar;
        m1.e eVar = fVar.f3660d;
        X0.f.b(eVar);
        j jVar = eVar.f3552a;
        d dVar = eVar.f3554c;
        m mVar = eVar.f3556e;
        w wVar = fVar.f3661e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                X0.f.e(jVar, "call");
                dVar.d(wVar);
                r.n(wVar.f2777b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                X0.f.e(jVar, "call");
                eVar.d(e2);
                throw e2;
            }
        } catch (IOException e3) {
            if (e3 instanceof C0311a) {
                throw e3;
            }
            if (!eVar.f3555d) {
                throw e3;
            }
            iOException = e3;
        }
        try {
            dVar.b();
            iOException = null;
            try {
                x c2 = eVar.c(false);
                X0.f.b(c2);
                X0.f.e(jVar, "call");
                c2.f2781a = wVar;
                c2.f2785e = mVar.f3589e;
                c2.f2789k = currentTimeMillis;
                c2.f2790l = System.currentTimeMillis();
                y a3 = c2.a();
                int i = a3.f2795d;
                if (i != 100) {
                    if (102 <= i && i < 200) {
                    }
                    X0.f.e(jVar, "call");
                    x h = a3.h();
                    h.f2787g = eVar.b(a3);
                    a2 = h.a();
                    if (!"close".equalsIgnoreCase(a2.f2792a.f2778c.a("Connection")) || "close".equalsIgnoreCase(y.g(a2, "Connection"))) {
                        dVar.g().k();
                    }
                    if (i != 204 || i == 205) {
                        zVar = a2.f2798g;
                        if ((zVar == null ? zVar.g() : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i);
                            sb.append(" had non-zero Content-Length: ");
                            sb.append(zVar != null ? Long.valueOf(zVar.g()) : null);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return a2;
                }
                x c3 = eVar.c(false);
                X0.f.b(c3);
                c3.f2781a = wVar;
                c3.f2785e = mVar.f3589e;
                c3.f2789k = currentTimeMillis;
                c3.f2790l = System.currentTimeMillis();
                a3 = c3.a();
                i = a3.f2795d;
                X0.f.e(jVar, "call");
                x h2 = a3.h();
                h2.f2787g = eVar.b(a3);
                a2 = h2.a();
                if (!"close".equalsIgnoreCase(a2.f2792a.f2778c.a("Connection"))) {
                }
                dVar.g().k();
                if (i != 204) {
                }
                zVar = a2.f2798g;
                if ((zVar == null ? zVar.g() : -1L) > 0) {
                }
                return a2;
            } catch (IOException e4) {
                if (iOException == null) {
                    throw e4;
                }
                l.b(iOException, e4);
                throw iOException;
            }
        } catch (IOException e5) {
            eVar.d(e5);
            throw e5;
        }
    }
}
