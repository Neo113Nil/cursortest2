package r3;

import A0.q;
import C.F;
import G.W0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import m3.C0862a;
import m3.j;
import m3.l;
import m3.m;
import m3.n;
import m3.r;
import m3.v;
import m3.w;
import m3.x;
import m3.y;
import m3.z;
import n.AbstractC0864b;
import p2.C0994a;
import q3.g;
import q3.i;
import q3.k;
import t3.C1210a;
import y2.C1331f;
import z2.C1403G;
import z2.C1405I;
import z3.o;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9862a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9863b;

    public a(j cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f9863b = cookieJar;
    }

    public static int d(w wVar, int i2) {
        String a4 = w.a("Retry-After", wVar);
        if (a4 == null) {
            return i2;
        }
        if (!new Regex("\\d+").b(a4)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a4);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // m3.n
    public final w a(f chain) {
        boolean z4;
        x xVar;
        List list;
        int i2;
        SSLSocketFactory sSLSocketFactory;
        y3.c cVar;
        m3.d dVar;
        switch (this.f9862a) {
            case 0:
                boolean z5 = true;
                Intrinsics.checkNotNullParameter(chain, "chain");
                q request = chain.f9869e;
                Y0.b k4 = request.k();
                String i4 = request.i("Host");
                m url = (m) request.f362c;
                if (i4 == null) {
                    z4 = false;
                    k4.t("Host", n3.b.v(url, false));
                } else {
                    z4 = false;
                }
                if (request.i("Connection") == null) {
                    k4.t("Connection", "Keep-Alive");
                }
                if (request.i("Accept-Encoding") == null && request.i("Range") == null) {
                    k4.t("Accept-Encoding", "gzip");
                } else {
                    z5 = z4;
                }
                j jVar = (j) this.f9863b;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                C1405I.f11931d.getClass();
                if (request.i("User-Agent") == null) {
                    k4.t("User-Agent", "okhttp/4.12.0");
                }
                w b4 = chain.b(k4.d());
                l lVar = b4.f8478l;
                e.b(jVar, url, lVar);
                v b5 = b4.b();
                Intrinsics.checkNotNullParameter(request, "request");
                b5.f8460a = request;
                if (z5 && "gzip".equalsIgnoreCase(w.a("Content-Encoding", b4)) && e.a(b4) && (xVar = b4.f8479m) != null) {
                    o oVar = new o(xVar.b());
                    W0 s4 = lVar.s();
                    s4.m("Content-Encoding");
                    s4.m("Content-Length");
                    l headers = s4.b();
                    Intrinsics.checkNotNullParameter(headers, "headers");
                    b5.f8465f = headers.s();
                    b5.f8466g = new x(w.a("Content-Type", b4), -1L, z.h(oVar));
                }
                return b5.a();
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                q qVar = chain.f9869e;
                g gVar = chain.f9865a;
                List list2 = C1405I.f11931d;
                w wVar = null;
                int i5 = 0;
                q request2 = qVar;
                while (true) {
                    boolean z6 = true;
                    while (true) {
                        gVar.getClass();
                        Intrinsics.checkNotNullParameter(request2, "request");
                        if (gVar.f9396o != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (gVar) {
                            if (gVar.f9398q) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (gVar.f9397p) {
                                throw new IllegalStateException("Check failed.");
                            }
                            Unit unit = Unit.f7487a;
                        }
                        if (z6) {
                            q3.j jVar2 = gVar.f9390i;
                            m mVar = (m) request2.f362c;
                            boolean z7 = mVar.f8401i;
                            r rVar = gVar.f9388d;
                            if (z7) {
                                SSLSocketFactory sSLSocketFactory2 = rVar.f8446u;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                y3.c cVar2 = rVar.f8450y;
                                dVar = rVar.f8451z;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            list = list2;
                            i2 = i5;
                            gVar.f9394m = new q3.d(jVar2, new C0862a(mVar.f8396d, mVar.f8397e, rVar.f8442q, rVar.f8445t, sSLSocketFactory, cVar, dVar, rVar.f8444s, rVar.f8449x, rVar.f8448w, rVar.f8443r), gVar);
                        } else {
                            list = list2;
                            i2 = i5;
                        }
                        try {
                            if (gVar.f9400s) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    w b6 = chain.b(request2);
                                    if (wVar != null) {
                                        v b7 = b6.b();
                                        v b8 = wVar.b();
                                        b8.f8466g = null;
                                        w a4 = b8.a();
                                        if (a4.f8479m != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        b7.f8469j = a4;
                                        b6 = b7.a();
                                    }
                                    wVar = b6;
                                    request2 = b(wVar, gVar.f9396o);
                                    if (request2 == null) {
                                        gVar.d(false);
                                        return wVar;
                                    }
                                    x xVar2 = wVar.f8479m;
                                    if (xVar2 != null) {
                                        n3.b.c(xVar2);
                                    }
                                    i5 = i2 + 1;
                                    if (i5 > 20) {
                                        throw new ProtocolException("Too many follow-up requests: " + i5);
                                    }
                                    gVar.d(true);
                                    list2 = list;
                                } catch (IOException e4) {
                                    if (!c(e4, gVar, request2, !(e4 instanceof C1210a))) {
                                        List suppressed = list;
                                        Intrinsics.checkNotNullParameter(e4, "<this>");
                                        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                                        Iterator it = suppressed.iterator();
                                        while (it.hasNext()) {
                                            C1331f.a(e4, (Exception) it.next());
                                        }
                                        throw e4;
                                    }
                                    list2 = C1403G.A(list, e4);
                                    gVar.d(true);
                                }
                            } catch (k e5) {
                                List suppressed2 = list;
                                if (!c(e5.f9425e, gVar, request2, false)) {
                                    IOException iOException = e5.f9424d;
                                    Intrinsics.checkNotNullParameter(iOException, "<this>");
                                    Intrinsics.checkNotNullParameter(suppressed2, "suppressed");
                                    Iterator it2 = suppressed2.iterator();
                                    while (it2.hasNext()) {
                                        C1331f.a(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                list2 = C1403G.A(suppressed2, e5.f9424d);
                                gVar.d(true);
                            }
                        } catch (Throwable th) {
                            gVar.d(true);
                            throw th;
                        }
                        i5 = i2;
                        z6 = false;
                    }
                }
        }
    }

    public q b(w response, F f4) {
        String link;
        m1.k kVar;
        i iVar;
        y yVar = (f4 == null || (iVar = (i) f4.f1055e) == null) ? null : iVar.f9404b;
        int i2 = response.f8476j;
        String method = (String) response.f8473d.f363d;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                ((r) this.f9863b).f8438m.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i2 == 421) {
                if (f4 == null || Intrinsics.a(((q3.d) f4.f1053c).f9378b.f8320h.f8396d, ((i) f4.f1055e).f9404b.f8490a.f8320h.f8396d)) {
                    return null;
                }
                i iVar2 = (i) f4.f1055e;
                synchronized (iVar2) {
                    iVar2.f9413k = true;
                }
                return response.f8473d;
            }
            if (i2 == 503) {
                w wVar = response.f8482p;
                if ((wVar == null || wVar.f8476j != 503) && d(response, Integer.MAX_VALUE) == 0) {
                    return response.f8473d;
                }
                return null;
            }
            if (i2 == 407) {
                Intrinsics.c(yVar);
                if (yVar.f8491b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((r) this.f9863b).f8444s.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i2 == 408) {
                if (!((r) this.f9863b).f8437l) {
                    return null;
                }
                w wVar2 = response.f8482p;
                if ((wVar2 == null || wVar2.f8476j != 408) && d(response, 0) <= 0) {
                    return response.f8473d;
                }
                return null;
            }
            switch (i2) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        r rVar = (r) this.f9863b;
        if (!rVar.f8439n || (link = w.a("Location", response)) == null) {
            return null;
        }
        q qVar = response.f8473d;
        m mVar = (m) qVar.f362c;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            kVar = new m1.k(1);
            kVar.o(mVar, link);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        m url = kVar != null ? kVar.b() : null;
        if (url == null) {
            return null;
        }
        if (!Intrinsics.a(url.f8393a, ((m) qVar.f362c).f8393a) && !rVar.f8440o) {
            return null;
        }
        Y0.b k4 = qVar.k();
        if (AbstractC0864b.A(method)) {
            Intrinsics.checkNotNullParameter(method, "method");
            boolean equals = method.equals("PROPFIND");
            int i4 = response.f8476j;
            boolean z4 = equals || i4 == 308 || i4 == 307;
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.equals("PROPFIND") || i4 == 308 || i4 == 307) {
                k4.v(method, null);
            } else {
                k4.v("GET", null);
            }
            if (!z4) {
                k4.w("Transfer-Encoding");
                k4.w("Content-Length");
                k4.w("Content-Type");
            }
        }
        if (!n3.b.a((m) qVar.f362c, url)) {
            k4.w("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        k4.f4391j = url;
        return k4.d();
    }

    public boolean c(IOException iOException, g gVar, q qVar, boolean z4) {
        q3.l lVar;
        boolean j4;
        i iVar;
        if (!((r) this.f9863b).f8437l) {
            return false;
        }
        if ((z4 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z4)) {
            return false;
        }
        q3.d dVar = gVar.f9394m;
        Intrinsics.c(dVar);
        int i2 = dVar.f9382f;
        if (i2 == 0 && dVar.f9383g == 0 && dVar.f9384h == 0) {
            j4 = false;
        } else {
            if (dVar.f9385i == null) {
                y yVar = null;
                if (i2 <= 1 && dVar.f9383g <= 1 && dVar.f9384h <= 0 && (iVar = dVar.f9379c.f9395n) != null) {
                    synchronized (iVar) {
                        if (iVar.f9414l == 0) {
                            if (n3.b.a(iVar.f9404b.f8490a.f8320h, dVar.f9378b.f8320h)) {
                                yVar = iVar.f9404b;
                            }
                        }
                    }
                }
                if (yVar != null) {
                    dVar.f9385i = yVar;
                } else {
                    C0994a c0994a = dVar.f9380d;
                    if ((c0994a == null || !c0994a.c()) && (lVar = dVar.f9381e) != null) {
                        j4 = lVar.j();
                    }
                }
            }
            j4 = true;
        }
        return j4;
    }

    public a(r client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f9863b = client;
    }
}
