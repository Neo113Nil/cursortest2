package y3;

import g4.p;
import java.io.IOException;
import java.net.ProtocolException;
import t3.l;
import t3.q;
import t3.r;
import t3.s;
import t3.u;
import x3.i;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements l {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0064, code lost:
    
        if (r12 < 200) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[Catch: IOException -> 0x0082, TryCatch #2 {IOException -> 0x0082, blocks: (B:9:0x003e, B:12:0x0066, B:13:0x0085, B:16:0x00a6, B:18:0x00ba, B:26:0x00d3, B:28:0x00d7, B:31:0x00e4, B:33:0x00f7, B:34:0x00ff, B:35:0x0109, B:37:0x00c4, B:40:0x010c, B:41:0x010f, B:15:0x0089), top: B:8:0x003e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4 A[Catch: IOException -> 0x0082, TryCatch #2 {IOException -> 0x0082, blocks: (B:9:0x003e, B:12:0x0066, B:13:0x0085, B:16:0x00a6, B:18:0x00ba, B:26:0x00d3, B:28:0x00d7, B:31:0x00e4, B:33:0x00f7, B:34:0x00ff, B:35:0x0109, B:37:0x00c4, B:40:0x010c, B:41:0x010f, B:15:0x0089), top: B:8:0x003e, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    @Override // t3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(f fVar) {
        s a5;
        u uVar;
        x3.d dVar = fVar.d;
        i3.d.b(dVar);
        i iVar = dVar.f3899a;
        d dVar2 = dVar.f3901c;
        x3.l lVar = dVar.f3902e;
        q qVar = fVar.f4117e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                dVar2.f(qVar);
                r1.b.v(qVar.f3507b);
                iVar.g(dVar, true, false, null);
                try {
                    dVar2.a();
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
            if (e instanceof a4.a) {
                throw e;
            }
            if (!dVar.d) {
                throw e;
            }
        }
        try {
            r a6 = dVar.a(false);
            i3.d.b(a6);
            a6.f3510a = qVar;
            a6.f3513e = lVar.f3931e;
            a6.f3517k = currentTimeMillis;
            a6.f3518l = System.currentTimeMillis();
            s a7 = a6.a();
            int i = a7.i;
            try {
                if (i != 100) {
                    if (102 <= i) {
                    }
                    r n4 = a7.n();
                    String m4 = s.m("Content-Type", a7);
                    long d = dVar2.d(a7);
                    n4.f3515g = new g(m4, d, new p(new x3.c(dVar, dVar2.c(a7), d)));
                    a5 = n4.a();
                    if (!"close".equalsIgnoreCase(a5.f3520f.f3508c.a("Connection")) || "close".equalsIgnoreCase(s.m("Connection", a5))) {
                        dVar2.g().k();
                    }
                    if (i != 204 || i == 205) {
                        uVar = a5.f3524l;
                        if ((uVar == null ? uVar.m() : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i);
                            sb.append(" had non-zero Content-Length: ");
                            u uVar2 = a5.f3524l;
                            sb.append(uVar2 != null ? Long.valueOf(uVar2.m()) : null);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return a5;
                }
                String m42 = s.m("Content-Type", a7);
                long d5 = dVar2.d(a7);
                n4.f3515g = new g(m42, d5, new p(new x3.c(dVar, dVar2.c(a7), d5)));
                a5 = n4.a();
                if (!"close".equalsIgnoreCase(a5.f3520f.f3508c.a("Connection"))) {
                }
                dVar2.g().k();
                if (i != 204) {
                }
                uVar = a5.f3524l;
                if ((uVar == null ? uVar.m() : -1L) > 0) {
                }
                return a5;
            } catch (IOException e7) {
                dVar.b(e7);
                throw e7;
            }
            r a8 = dVar.a(false);
            i3.d.b(a8);
            a8.f3510a = qVar;
            a8.f3513e = lVar.f3931e;
            a8.f3517k = currentTimeMillis;
            a8.f3518l = System.currentTimeMillis();
            a7 = a8.a();
            i = a7.i;
            r n42 = a7.n();
        } catch (IOException e8) {
            if (e == null) {
                throw e8;
            }
            s.a.c(e, e8);
            throw e;
        }
    }
}
