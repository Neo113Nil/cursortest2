package h3;

import c3.k;
import c3.l;
import c3.m;
import c3.n;
import c3.q;
import c3.s;
import c3.t;
import c3.u;
import c3.w;
import c3.x;
import g3.i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import n2.o;
import p3.p;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2017a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2018b;

    public a(c3.b bVar) {
        u2.c.e(bVar, "cookieJar");
        this.f2018b = bVar;
    }

    public static int d(u uVar, int i4) {
        String m4 = u.m(uVar, "Retry-After");
        if (m4 == null) {
            return i4;
        }
        Pattern compile = Pattern.compile("\\d+");
        u2.c.d(compile, "compile(...)");
        if (!compile.matcher(m4).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(m4);
        u2.c.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c3.n
    public final u a(g gVar) {
        w wVar;
        SSLSocketFactory sSLSocketFactory;
        o3.c cVar;
        c3.d dVar;
        switch (this.f2017a) {
            case 0:
                c3.b bVar = (c3.b) this.f2018b;
                s sVar = gVar.f2024e;
                k kVar = sVar.c;
                androidx.emoji2.text.w a4 = sVar.a();
                m mVar = sVar.f1127a;
                boolean z3 = false;
                if (kVar.a("Host") == null) {
                    a4.k("Host", d3.c.t(mVar, false));
                }
                if (kVar.a("Connection") == null) {
                    a4.k("Connection", "Keep-Alive");
                }
                if (kVar.a("Accept-Encoding") == null && kVar.a("Range") == null) {
                    a4.k("Accept-Encoding", "gzip");
                    z3 = true;
                }
                bVar.getClass();
                u2.c.e(mVar, "url");
                if (kVar.a("User-Agent") == null) {
                    a4.k("User-Agent", "okhttp/4.12.0");
                }
                u b2 = gVar.b(a4.b());
                k kVar2 = b2.f1144k;
                f.b(bVar, mVar, kVar2);
                t n3 = b2.n();
                n3.f1131a = sVar;
                if (z3 && "gzip".equalsIgnoreCase(u.m(b2, "Content-Encoding")) && f.a(b2) && (wVar = b2.f1145l) != null) {
                    p3.k kVar3 = new p3.k(wVar.o());
                    a2.e c = kVar2.c();
                    c.A("Content-Encoding");
                    c.A("Content-Length");
                    n3.f1135f = c.u().c();
                    n3.g = new h(u.m(b2, "Content-Type"), -1L, new p(kVar3));
                }
                return n3.a();
            default:
                s sVar2 = gVar.f2024e;
                i iVar = gVar.f2021a;
                o oVar = o.f2953f;
                u uVar = null;
                int i4 = 0;
                s sVar3 = sVar2;
                while (true) {
                    boolean z4 = true;
                    while (iVar.f1949n == null) {
                        synchronized (iVar) {
                            try {
                                if (iVar.f1951p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f1950o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z4) {
                            g3.m mVar2 = iVar.h;
                            m mVar3 = sVar3.f1127a;
                            q qVar = iVar.f1943f;
                            if (mVar3.f1081i) {
                                SSLSocketFactory sSLSocketFactory2 = qVar.f1114t;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                o3.c cVar2 = qVar.f1118x;
                                dVar = qVar.f1119y;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            iVar.f1947l = new g3.e(mVar2, new c3.a(mVar3.f1078d, mVar3.f1079e, qVar.f1110p, qVar.f1113s, sSLSocketFactory, cVar, dVar, qVar.f1112r, qVar.f1117w, qVar.f1116v, qVar.f1111q), iVar);
                        }
                        try {
                            if (iVar.f1953r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b4 = gVar.b(sVar3);
                                if (uVar != null) {
                                    t n4 = b4.n();
                                    t n5 = uVar.n();
                                    n5.g = null;
                                    u a5 = n5.a();
                                    if (a5.f1145l != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    n4.f1137j = a5;
                                    b4 = n4.a();
                                }
                                uVar = b4;
                                sVar3 = b(uVar, iVar.f1949n);
                                if (sVar3 == null) {
                                    iVar.e(false);
                                    return uVar;
                                }
                                w wVar2 = uVar.f1145l;
                                if (wVar2 != null) {
                                    d3.c.b(wVar2);
                                }
                                i4++;
                                if (i4 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i4);
                                }
                                iVar.e(true);
                            } catch (g3.n e4) {
                                if (!c(e4.g, iVar, sVar3, false)) {
                                    IOException iOException = e4.f1974f;
                                    u2.c.e(iOException, "<this>");
                                    Iterator it = oVar.iterator();
                                    while (it.hasNext()) {
                                        l0.g.a(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e4.f1974f;
                                ArrayList arrayList = new ArrayList(oVar.size() + 1);
                                arrayList.addAll(oVar);
                                arrayList.add(iOException2);
                                iVar.e(true);
                                oVar = arrayList;
                                z4 = false;
                            } catch (IOException e5) {
                                if (!c(e5, iVar, sVar3, !(e5 instanceof j3.a))) {
                                    Iterator it2 = oVar.iterator();
                                    while (it2.hasNext()) {
                                        l0.g.a(e5, (Exception) it2.next());
                                    }
                                    throw e5;
                                }
                                ArrayList arrayList2 = new ArrayList(oVar.size() + 1);
                                arrayList2.addAll(oVar);
                                arrayList2.add(e5);
                                iVar.e(true);
                                oVar = arrayList2;
                                z4 = false;
                            }
                        } catch (Throwable th2) {
                            iVar.e(true);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                }
        }
    }

    public s b(u uVar, g3.d dVar) {
        l lVar;
        u uVar2;
        g3.l lVar2;
        x xVar = (dVar == null || (lVar2 = dVar.f1933e) == null) ? null : lVar2.f1958b;
        int i4 = uVar.f1142i;
        String str = uVar.f1141f.f1128b;
        if (i4 != 307 && i4 != 308) {
            if (i4 == 401) {
                ((q) this.f2018b).f1106l.getClass();
                return null;
            }
            if (i4 != 421) {
                if (i4 == 503) {
                    u uVar3 = uVar.f1148o;
                    if ((uVar3 == null || uVar3.f1142i != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                        return uVar.f1141f;
                    }
                } else {
                    if (i4 == 407) {
                        u2.c.b(xVar);
                        if (xVar.f1154b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((q) this.f2018b).f1112r.getClass();
                        return null;
                    }
                    if (i4 != 408) {
                        switch (i4) {
                        }
                    } else if (((q) this.f2018b).f1105k && (((uVar2 = uVar.f1148o) == null || uVar2.f1142i != 408) && d(uVar, 0) <= 0)) {
                        return uVar.f1141f;
                    }
                }
            } else if (dVar != null && !u2.c.a(dVar.f1931b.f1935b.h.f1078d, dVar.f1933e.f1958b.f1153a.h.f1078d)) {
                g3.l lVar3 = dVar.f1933e;
                synchronized (lVar3) {
                    lVar3.f1964k = true;
                }
                return uVar.f1141f;
            }
            return null;
        }
        q qVar = (q) this.f2018b;
        if (qVar.f1107m) {
            String m4 = u.m(uVar, "Location");
            s sVar = uVar.f1141f;
            if (m4 != null) {
                m mVar = sVar.f1127a;
                mVar.getClass();
                try {
                    lVar = new l(0);
                    lVar.f(mVar, m4);
                } catch (IllegalArgumentException unused) {
                    lVar = null;
                }
                m b2 = lVar != null ? lVar.b() : null;
                if (b2 != null && (u2.c.a(b2.f1076a, sVar.f1127a.f1076a) || qVar.f1108n)) {
                    androidx.emoji2.text.w a4 = sVar.a();
                    if (k3.m.N(str)) {
                        int i5 = uVar.f1142i;
                        boolean z3 = str.equals("PROPFIND") || i5 == 308 || i5 == 307;
                        if (str.equals("PROPFIND") || i5 == 308 || i5 == 307) {
                            a4.n(str, null);
                        } else {
                            a4.n("GET", null);
                        }
                        if (!z3) {
                            ((a2.e) a4.h).A("Transfer-Encoding");
                            ((a2.e) a4.h).A("Content-Length");
                            ((a2.e) a4.h).A("Content-Type");
                        }
                    }
                    if (!d3.c.a(sVar.f1127a, b2)) {
                        ((a2.e) a4.h).A("Authorization");
                    }
                    a4.f368f = b2;
                    return a4.b();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r7 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(IOException iOException, i iVar, s sVar, boolean z3) {
        boolean z4;
        b1.b bVar;
        g3.l lVar;
        if (!((q) this.f2018b).f1105k || ((z3 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        g3.e eVar = iVar.f1947l;
        u2.c.b(eVar);
        int i4 = eVar.f1938f;
        if (i4 == 0 && eVar.g == 0 && eVar.h == 0) {
            z4 = false;
        } else {
            if (eVar.f1939i == null) {
                x xVar = null;
                if (i4 <= 1 && eVar.g <= 1 && eVar.h <= 0 && (lVar = eVar.c.f1948m) != null) {
                    synchronized (lVar) {
                        if (lVar.f1965l == 0) {
                            if (d3.c.a(lVar.f1958b.f1153a.h, eVar.f1935b.h)) {
                                xVar = lVar.f1958b;
                            }
                        }
                    }
                }
                if (xVar != null) {
                    eVar.f1939i = xVar;
                } else {
                    f.f fVar = eVar.f1936d;
                    if ((fVar == null || !fVar.c()) && (bVar = eVar.f1937e) != null) {
                        z4 = bVar.j();
                    }
                }
            }
            z4 = true;
        }
        return z4;
    }

    public a(q qVar) {
        this.f2018b = qVar;
    }
}
