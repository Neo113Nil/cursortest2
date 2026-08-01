package u1;

import java.io.IOException;
import java.net.ProtocolException;
import k0.k;
import p1.n;
import p1.s;
import p1.t;
import p1.u;
import t1.j;
import t1.m;
import w1.C0333a;

/* loaded from: classes.dex */
public final class b implements n {
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6 A[Catch: IOException -> 0x0095, TRY_ENTER, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e3 A[Catch: IOException -> 0x0095, TryCatch #1 {IOException -> 0x0095, blocks: (B:9:0x004c, B:12:0x0079, B:13:0x0098, B:15:0x00b9, B:25:0x00d6, B:28:0x00e3, B:30:0x00f4, B:31:0x00fe, B:32:0x0108, B:36:0x00c3), top: B:8:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // p1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t a(f fVar) {
        IOException iOException;
        t a2;
        u uVar;
        t1.e eVar = fVar.d;
        e1.d.b(eVar);
        j jVar = eVar.f3744a;
        d dVar = eVar.f3746c;
        m mVar = eVar.f3747e;
        H.e eVar2 = fVar.f3828e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                e1.d.e(jVar, "call");
                dVar.d(eVar2);
                k.n((String) eVar2.f258b);
                jVar.g(eVar, true, false, null);
            } catch (IOException e2) {
                if (e2 instanceof C0333a) {
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
                    e1.d.b(c2);
                    e1.d.e(jVar, "call");
                    c2.f3419a = eVar2;
                    c2.f3422e = mVar.f3776e;
                    c2.f3426k = currentTimeMillis;
                    c2.f3427l = System.currentTimeMillis();
                    t a3 = c2.a();
                    int i = a3.d;
                    if (i != 100) {
                        if (102 <= i && i < 200) {
                        }
                        e1.d.e(jVar, "call");
                        s h = a3.h();
                        h.f3424g = eVar.b(a3);
                        a2 = h.a();
                        if (!"close".equalsIgnoreCase(((p1.k) a2.f3429a.d).a("Connection")) || "close".equalsIgnoreCase(t.g("Connection", a2))) {
                            dVar.h().k();
                        }
                        if (i != 204 || i == 205) {
                            uVar = a2.f3434g;
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
                    e1.d.b(c3);
                    c3.f3419a = eVar2;
                    c3.f3422e = mVar.f3776e;
                    c3.f3426k = currentTimeMillis;
                    c3.f3427l = System.currentTimeMillis();
                    a3 = c3.a();
                    i = a3.d;
                    e1.d.e(jVar, "call");
                    s h2 = a3.h();
                    h2.f3424g = eVar.b(a3);
                    a2 = h2.a();
                    if (!"close".equalsIgnoreCase(((p1.k) a2.f3429a.d).a("Connection"))) {
                    }
                    dVar.h().k();
                    if (i != 204) {
                    }
                    uVar = a2.f3434g;
                    if ((uVar == null ? uVar.g() : -1L) > 0) {
                    }
                    return a2;
                } catch (IOException e3) {
                    if (iOException == null) {
                        throw e3;
                    }
                    x1.d.e(iOException, e3);
                    throw iOException;
                }
            } catch (IOException e4) {
                eVar.d(e4);
                throw e4;
            }
        } catch (IOException e5) {
            e1.d.e(jVar, "call");
            eVar.d(e5);
            throw e5;
        }
    }
}
