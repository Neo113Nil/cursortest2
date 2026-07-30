package x7;

import a2.q;
import c0.w;
import java.io.IOException;
import java.net.ProtocolException;
import r6.k;
import s7.m;
import s7.r;
import s7.s;
import s7.u;
import w7.i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements m {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006c, code lost:
    
        if (r12 < 200) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0 A[Catch: IOException -> 0x008a, TryCatch #1 {IOException -> 0x008a, blocks: (B:9:0x0046, B:12:0x006e, B:13:0x008d, B:16:0x00ad, B:18:0x00c3, B:26:0x00dc, B:28:0x00e0, B:31:0x00ed, B:33:0x0100, B:34:0x0108, B:35:0x0112, B:37:0x00cd, B:40:0x0115, B:41:0x0118, B:15:0x0091), top: B:8:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed A[Catch: IOException -> 0x008a, TryCatch #1 {IOException -> 0x008a, blocks: (B:9:0x0046, B:12:0x006e, B:13:0x008d, B:16:0x00ad, B:18:0x00c3, B:26:0x00dc, B:28:0x00e0, B:31:0x00ed, B:33:0x0100, B:34:0x0108, B:35:0x0112, B:37:0x00cd, B:40:0x0115, B:41:0x0118, B:15:0x0091), top: B:8:0x0046, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    @Override // s7.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s a(f fVar) {
        s a3;
        u uVar;
        w wVar = fVar.f9691d;
        k.c(wVar);
        w7.g gVar = (w7.g) wVar.f1514b;
        d dVar = (d) wVar.f1516d;
        i iVar = (i) wVar.f1517e;
        q qVar = fVar.f9692e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                dVar.b(qVar);
                u3.q.i((String) qVar.f437d);
                gVar.f(wVar, true, false, null);
            } catch (IOException e9) {
                wVar.f(e9);
                throw e9;
            }
        } catch (IOException e10) {
            e = e10;
            if (e instanceof z7.a) {
                throw e;
            }
            if (!wVar.f1513a) {
                throw e;
            }
        }
        try {
            dVar.c();
            e = null;
            try {
                r e11 = wVar.e(false);
                k.c(e11);
                e11.f8670a = qVar;
                e11.f8674e = iVar.f9570e;
                e11.f8680k = currentTimeMillis;
                e11.f8681l = System.currentTimeMillis();
                s a9 = e11.a();
                int i7 = a9.f8686i;
                try {
                    if (i7 != 100) {
                        if (102 <= i7) {
                        }
                        r c4 = a9.c();
                        String b9 = s.b("Content-Type", a9);
                        long a10 = dVar.a(a9);
                        c4.f8676g = new g(b9, a10, a8.d.n(new w7.c(wVar, dVar.e(a9), a10)));
                        a3 = c4.a();
                        if (!"close".equalsIgnoreCase(((s7.k) a3.f8683f.f438e).a("Connection")) || "close".equalsIgnoreCase(s.b("Connection", a3))) {
                            dVar.g().k();
                        }
                        if (i7 != 204 || i7 == 205) {
                            uVar = a3.f8689l;
                            if ((uVar == null ? uVar.b() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i7);
                                sb.append(" had non-zero Content-Length: ");
                                u uVar2 = a3.f8689l;
                                sb.append(uVar2 != null ? Long.valueOf(uVar2.b()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a3;
                    }
                    String b92 = s.b("Content-Type", a9);
                    long a102 = dVar.a(a9);
                    c4.f8676g = new g(b92, a102, a8.d.n(new w7.c(wVar, dVar.e(a9), a102)));
                    a3 = c4.a();
                    if (!"close".equalsIgnoreCase(((s7.k) a3.f8683f.f438e).a("Connection"))) {
                    }
                    dVar.g().k();
                    if (i7 != 204) {
                    }
                    uVar = a3.f8689l;
                    if ((uVar == null ? uVar.b() : -1L) > 0) {
                    }
                    return a3;
                } catch (IOException e12) {
                    wVar.f(e12);
                    throw e12;
                }
                r e13 = wVar.e(false);
                k.c(e13);
                e13.f8670a = qVar;
                e13.f8674e = iVar.f9570e;
                e13.f8680k = currentTimeMillis;
                e13.f8681l = System.currentTimeMillis();
                a9 = e13.a();
                i7 = a9.f8686i;
                r c42 = a9.c();
            } catch (IOException e14) {
                if (e == null) {
                    throw e14;
                }
                d6.a.a(e, e14);
                throw e;
            }
        } catch (IOException e15) {
            wVar.f(e15);
            throw e15;
        }
    }
}
