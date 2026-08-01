package h3;

import c3.n;
import c3.s;
import c3.t;
import c3.u;
import c3.w;
import g3.i;
import g3.l;
import java.io.IOException;
import java.net.ProtocolException;
import k3.m;
import p3.p;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0064, code lost:
    
        if (r12 < 200) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[Catch: IOException -> 0x0082, TryCatch #2 {IOException -> 0x0082, blocks: (B:9:0x003e, B:12:0x0066, B:13:0x0085, B:16:0x00a6, B:18:0x00ba, B:26:0x00d3, B:28:0x00d7, B:31:0x00e4, B:33:0x00f7, B:34:0x00ff, B:35:0x0109, B:37:0x00c4, B:40:0x010c, B:41:0x010f, B:15:0x0089), top: B:8:0x003e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4 A[Catch: IOException -> 0x0082, TryCatch #2 {IOException -> 0x0082, blocks: (B:9:0x003e, B:12:0x0066, B:13:0x0085, B:16:0x00a6, B:18:0x00ba, B:26:0x00d3, B:28:0x00d7, B:31:0x00e4, B:33:0x00f7, B:34:0x00ff, B:35:0x0109, B:37:0x00c4, B:40:0x010c, B:41:0x010f, B:15:0x0089), top: B:8:0x003e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    @Override // c3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(g gVar) {
        u a4;
        w wVar;
        g3.d dVar = gVar.f2023d;
        u2.c.b(dVar);
        i iVar = dVar.f1930a;
        e eVar = dVar.c;
        l lVar = dVar.f1933e;
        s sVar = gVar.f2024e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                eVar.c(sVar);
                m.N(sVar.f1128b);
                iVar.g(dVar, true, false, null);
                try {
                    eVar.a();
                    e = null;
                } catch (IOException e4) {
                    dVar.b(e4);
                    throw e4;
                }
            } catch (IOException e5) {
                dVar.b(e5);
                throw e5;
            }
        } catch (IOException e6) {
            e = e6;
            if (e instanceof j3.a) {
                throw e;
            }
            if (!dVar.f1932d) {
                throw e;
            }
        }
        try {
            t a5 = dVar.a(false);
            u2.c.b(a5);
            a5.f1131a = sVar;
            a5.f1134e = lVar.f1960e;
            a5.f1138k = currentTimeMillis;
            a5.f1139l = System.currentTimeMillis();
            u a6 = a5.a();
            int i4 = a6.f1142i;
            try {
                if (i4 != 100) {
                    if (102 <= i4) {
                    }
                    t n3 = a6.n();
                    String m4 = u.m(a6, "Content-Type");
                    long d4 = eVar.d(a6);
                    n3.g = new h(m4, d4, new p(new g3.c(dVar, eVar.e(a6), d4)));
                    a4 = n3.a();
                    if (!"close".equalsIgnoreCase(a4.f1141f.c.a("Connection")) || "close".equalsIgnoreCase(u.m(a4, "Connection"))) {
                        eVar.g().k();
                    }
                    if (i4 != 204 || i4 == 205) {
                        wVar = a4.f1145l;
                        if ((wVar == null ? wVar.m() : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i4);
                            sb.append(" had non-zero Content-Length: ");
                            w wVar2 = a4.f1145l;
                            sb.append(wVar2 != null ? Long.valueOf(wVar2.m()) : null);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return a4;
                }
                String m42 = u.m(a6, "Content-Type");
                long d42 = eVar.d(a6);
                n3.g = new h(m42, d42, new p(new g3.c(dVar, eVar.e(a6), d42)));
                a4 = n3.a();
                if (!"close".equalsIgnoreCase(a4.f1141f.c.a("Connection"))) {
                }
                eVar.g().k();
                if (i4 != 204) {
                }
                wVar = a4.f1145l;
                if ((wVar == null ? wVar.m() : -1L) > 0) {
                }
                return a4;
            } catch (IOException e7) {
                dVar.b(e7);
                throw e7;
            }
            t a7 = dVar.a(false);
            u2.c.b(a7);
            a7.f1131a = sVar;
            a7.f1134e = lVar.f1960e;
            a7.f1138k = currentTimeMillis;
            a7.f1139l = System.currentTimeMillis();
            a6 = a7.a();
            i4 = a6.f1142i;
            t n32 = a6.n();
        } catch (IOException e8) {
            if (e == null) {
                throw e8;
            }
            l0.g.a(e, e8);
            throw e;
        }
    }
}
