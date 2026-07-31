package F2;

import A2.o;
import A2.r;
import A2.w;
import A2.x;
import A2.y;
import A2.z;
import E.G;
import E2.k;
import H2.C0079a;
import I2.l;
import M1.B;
import Z1.i;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class b implements r {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc A[Catch: IOException -> 0x009b, TRY_ENTER, TryCatch #3 {IOException -> 0x009b, blocks: (B:9:0x0052, B:12:0x007f, B:13:0x009e, B:15:0x00bf, B:25:0x00dc, B:28:0x00e9, B:30:0x00fa, B:31:0x0104, B:32:0x010e, B:36:0x00c9), top: B:8:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[Catch: IOException -> 0x009b, TryCatch #3 {IOException -> 0x009b, blocks: (B:9:0x0052, B:12:0x007f, B:13:0x009e, B:15:0x00bf, B:25:0x00dc, B:28:0x00e9, B:30:0x00fa, B:31:0x0104, B:32:0x010e, B:36:0x00c9), top: B:8:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    @Override // A2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y a(g gVar) {
        IOException iOException;
        y a3;
        z zVar;
        G g3 = gVar.f1495d;
        i.c(g3);
        E2.h hVar = (E2.h) g3.f622b;
        e eVar = (e) g3.f624d;
        k kVar = (k) g3.f625e;
        w wVar = gVar.f1496e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                i.f(hVar, "call");
                eVar.g(wVar);
                l.K((String) wVar.f194c);
                hVar.f(g3, true, false, null);
                try {
                    eVar.b();
                    iOException = null;
                } catch (IOException e3) {
                    g3.h(e3);
                    throw e3;
                }
            } catch (IOException e4) {
                i.f(hVar, "call");
                g3.h(e4);
                throw e4;
            }
        } catch (IOException e5) {
            if (e5 instanceof C0079a) {
                throw e5;
            }
            if (!g3.f621a) {
                throw e5;
            }
            iOException = e5;
        }
        try {
            x g4 = g3.g(false);
            i.c(g4);
            i.f(hVar, "call");
            g4.f198a = wVar;
            g4.f202e = kVar.f824e;
            g4.f208k = currentTimeMillis;
            g4.f209l = System.currentTimeMillis();
            y a4 = g4.a();
            int i3 = a4.f214g;
            if (i3 != 100) {
                if (102 <= i3 && i3 < 200) {
                }
                i.f(hVar, "call");
                x b2 = a4.b();
                b2.f204g = g3.d(a4);
                a3 = b2.a();
                if (!"close".equalsIgnoreCase(((o) a3.f211d.f195d).b("Connection")) || "close".equalsIgnoreCase(y.a(a3, "Connection"))) {
                    eVar.h().k();
                }
                if (i3 != 204 || i3 == 205) {
                    zVar = a3.f217j;
                    if ((zVar == null ? zVar.a() : -1L) > 0) {
                        StringBuilder sb = new StringBuilder("HTTP ");
                        sb.append(i3);
                        sb.append(" had non-zero Content-Length: ");
                        sb.append(zVar != null ? Long.valueOf(zVar.a()) : null);
                        throw new ProtocolException(sb.toString());
                    }
                }
                return a3;
            }
            x g5 = g3.g(false);
            i.c(g5);
            g5.f198a = wVar;
            g5.f202e = kVar.f824e;
            g5.f208k = currentTimeMillis;
            g5.f209l = System.currentTimeMillis();
            a4 = g5.a();
            i3 = a4.f214g;
            i.f(hVar, "call");
            x b22 = a4.b();
            b22.f204g = g3.d(a4);
            a3 = b22.a();
            if (!"close".equalsIgnoreCase(((o) a3.f211d.f195d).b("Connection"))) {
            }
            eVar.h().k();
            if (i3 != 204) {
            }
            zVar = a3.f217j;
            if ((zVar == null ? zVar.a() : -1L) > 0) {
            }
            return a3;
        } catch (IOException e6) {
            if (iOException == null) {
                throw e6;
            }
            B.o(iOException, e6);
            throw iOException;
        }
    }
}
