package L2;

import C0.q;
import E.F;
import G2.l;
import G2.o;
import G2.t;
import G2.u;
import G2.v;
import N2.C0203a;
import f2.j;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class b implements o {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[Catch: IOException -> 0x009b, TRY_ENTER, TryCatch #3 {IOException -> 0x009b, blocks: (B:9:0x0052, B:12:0x007f, B:13:0x009e, B:15:0x00bf, B:25:0x00dc, B:28:0x00e9, B:30:0x00fa, B:31:0x0104, B:32:0x010e, B:36:0x00c9), top: B:8:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[Catch: IOException -> 0x009b, TryCatch #3 {IOException -> 0x009b, blocks: (B:9:0x0052, B:12:0x007f, B:13:0x009e, B:15:0x00bf, B:25:0x00dc, B:28:0x00e9, B:30:0x00fa, B:31:0x0104, B:32:0x010e, B:36:0x00c9), top: B:8:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    @Override // G2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u a(g gVar) {
        IOException iOException;
        u a3;
        v vVar;
        F f3 = gVar.f3415d;
        j.c(f3);
        K2.g gVar2 = (K2.g) f3.f923b;
        e eVar = (e) f3.f925d;
        K2.j jVar = (K2.j) f3.f926e;
        q qVar = gVar.f3416e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                j.f(gVar2, "call");
                eVar.b(qVar);
                l0.c.J((String) qVar.f631d);
                gVar2.f(f3, true, false, null);
                try {
                    eVar.d();
                    iOException = null;
                } catch (IOException e3) {
                    f3.h(e3);
                    throw e3;
                }
            } catch (IOException e4) {
                j.f(gVar2, "call");
                f3.h(e4);
                throw e4;
            }
        } catch (IOException e5) {
            if (e5 instanceof C0203a) {
                throw e5;
            }
            if (!f3.f922a) {
                throw e5;
            }
            iOException = e5;
        }
        try {
            t g3 = f3.g(false);
            j.c(g3);
            j.f(gVar2, "call");
            g3.f2281a = qVar;
            g3.f2285e = jVar.f3310e;
            g3.f2291k = currentTimeMillis;
            g3.f2292l = System.currentTimeMillis();
            u a4 = g3.a();
            int i3 = a4.f2297g;
            if (i3 != 100) {
                if (102 <= i3 && i3 < 200) {
                }
                j.f(gVar2, "call");
                t b3 = a4.b();
                b3.f2287g = f3.d(a4);
                a3 = b3.a();
                if (!"close".equalsIgnoreCase(((l) a3.f2294d.f632e).b("Connection")) || "close".equalsIgnoreCase(u.a(a3, "Connection"))) {
                    eVar.h().k();
                }
                if (i3 != 204 || i3 == 205) {
                    vVar = a3.f2300j;
                    if ((vVar == null ? vVar.a() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i3);
                        sb.append(" had non-zero Content-Length: ");
                        sb.append(vVar != null ? Long.valueOf(vVar.a()) : null);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return a3;
            }
            t g4 = f3.g(false);
            j.c(g4);
            g4.f2281a = qVar;
            g4.f2285e = jVar.f3310e;
            g4.f2291k = currentTimeMillis;
            g4.f2292l = System.currentTimeMillis();
            a4 = g4.a();
            i3 = a4.f2297g;
            j.f(gVar2, "call");
            t b32 = a4.b();
            b32.f2287g = f3.d(a4);
            a3 = b32.a();
            if (!"close".equalsIgnoreCase(((l) a3.f2294d.f632e).b("Connection"))) {
            }
            eVar.h().k();
            if (i3 != 204) {
            }
            vVar = a3.f2300j;
            if ((vVar == null ? vVar.a() : -1L) > 0) {
            }
            return a3;
        } catch (IOException e6) {
            if (iOException == null) {
                throw e6;
            }
            R1.a.a(iOException, e6);
            throw iOException;
        }
    }
}
