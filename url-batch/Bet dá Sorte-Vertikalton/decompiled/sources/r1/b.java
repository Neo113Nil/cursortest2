package r1;

import java.io.IOException;
import java.net.ProtocolException;
import k0.z;
import m1.k;
import m1.n;
import m1.s;
import m1.t;
import m1.u;
import q1.j;
import q1.m;
import t1.C0302a;
import u1.l;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // m1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t a(f fVar) {
        IOException iOException;
        t a2;
        u uVar;
        q1.e eVar = fVar.d;
        b1.d.b(eVar);
        j jVar = eVar.f3511a;
        d dVar = eVar.f3513c;
        m mVar = eVar.f3514e;
        H.e eVar2 = fVar.f3576e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                b1.d.e(jVar, "call");
                dVar.d(eVar2);
                z.k((String) eVar2.f274b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0302a) {
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
                    s c2 = eVar.c(false);
                    b1.d.b(c2);
                    b1.d.e(jVar, "call");
                    c2.f3272a = eVar2;
                    c2.f3275e = mVar.f3543e;
                    c2.f3279k = currentTimeMillis;
                    c2.f3280l = System.currentTimeMillis();
                    t a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        b1.d.e(jVar, "call");
                        s h = a3.h();
                        h.f3277g = eVar.b(a3);
                        a2 = h.a();
                        if (!"close".equalsIgnoreCase(((k) a2.f3282a.d).a("Connection")) || "close".equalsIgnoreCase(t.g("Connection", a2))) {
                            dVar.g().k();
                        }
                        if (i != 204 || i == 205) {
                            uVar = a2.f3287g;
                            if ((uVar == null ? uVar.g() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i);
                                sb.append(" had non-zero Content-Length: ");
                                sb.append(uVar != null ? Long.valueOf(uVar.g()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a2;
                    }
                    s c3 = eVar.c(false);
                    b1.d.b(c3);
                    c3.f3272a = eVar2;
                    c3.f3275e = mVar.f3543e;
                    c3.f3279k = currentTimeMillis;
                    c3.f3280l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    b1.d.e(jVar, "call");
                    s h2 = a3.h();
                    h2.f3277g = eVar.b(a3);
                    a2 = h2.a();
                    if (!"close".equalsIgnoreCase(((k) a2.f3282a.d).a("Connection"))) {
                    }
                    dVar.g().k();
                    if (i != 204) {
                    }
                    uVar = a2.f3287g;
                    if ((uVar == null ? uVar.g() : -1L) > 0) {
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
