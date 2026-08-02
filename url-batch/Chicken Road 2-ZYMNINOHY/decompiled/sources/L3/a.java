package L3;

import E1.P;
import G3.A;
import G3.C0050a;
import G3.C0051b;
import G3.m;
import G3.n;
import G3.o;
import G3.p;
import G3.q;
import G3.s;
import G3.u;
import G3.v;
import G3.w;
import G3.x;
import G3.y;
import G3.z;
import K3.k;
import N3.C0077a;
import T3.l;
import i2.AbstractC0457a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1666a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1667b;

    public a(C0051b cookieJar) {
        i.e(cookieJar, "cookieJar");
        this.f1667b = cookieJar;
    }

    public static int d(y yVar, int i4) {
        String a3 = y.a(yVar, "Retry-After");
        if (a3 == null) {
            return i4;
        }
        Pattern compile = Pattern.compile("\\d+");
        i.d(compile, "compile(...)");
        if (!compile.matcher(a3).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a3);
        i.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // G3.q
    public final y a(g gVar) {
        long j4;
        z zVar;
        SSLSocketFactory sSLSocketFactory;
        S3.c cVar;
        G3.e eVar;
        switch (this.f1666a) {
            case 0:
                C0051b c0051b = (C0051b) this.f1667b;
                v vVar = gVar.f1674e;
                n nVar = vVar.f1014c;
                u a3 = vVar.a();
                p url = vVar.f1012a;
                w wVar = vVar.f1015d;
                if (wVar != null) {
                    j4 = -1;
                    long j5 = wVar.f1018a;
                    if (j5 != -1) {
                        a3.d("Content-Length", String.valueOf(j5));
                        ((m) a3.f1009c).i("Transfer-Encoding");
                    } else {
                        a3.d("Transfer-Encoding", "chunked");
                        ((m) a3.f1009c).i("Content-Length");
                    }
                } else {
                    j4 = -1;
                }
                boolean z = false;
                if (nVar.b("Host") == null) {
                    a3.d("Host", H3.b.t(url, false));
                }
                if (nVar.b("Connection") == null) {
                    a3.d("Connection", "Keep-Alive");
                }
                if (nVar.b("Accept-Encoding") == null && nVar.b("Range") == null) {
                    a3.d("Accept-Encoding", "gzip");
                    z = true;
                }
                c0051b.getClass();
                i.e(url, "url");
                if (nVar.b("User-Agent") == null) {
                    a3.d("User-Agent", "okhttp/4.11.0");
                }
                y b4 = gVar.b(a3.a());
                n nVar2 = b4.f1038f;
                f.b(c0051b, url, nVar2);
                x b5 = b4.b();
                b5.f1020a = vVar;
                if (z && "gzip".equalsIgnoreCase(y.a(b4, "Content-Encoding")) && f.a(b4) && (zVar = b4.f1039g) != null) {
                    l lVar = new l(zVar.b());
                    m d4 = nVar2.d();
                    d4.i("Content-Encoding");
                    d4.i("Content-Length");
                    b5.f1025f = d4.g().d();
                    y.a(b4, "Content-Type");
                    b5.f1026g = new z(j4, new T3.p(lVar), 1);
                }
                return b5.a();
            default:
                v vVar2 = gVar.f1674e;
                K3.i iVar = gVar.f1670a;
                List list = d3.q.f8333a;
                y yVar = null;
                int i4 = 0;
                v vVar3 = vVar2;
                while (true) {
                    boolean z4 = true;
                    while (iVar.f1569i == null) {
                        synchronized (iVar) {
                            try {
                                if (iVar.f1571k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f1570j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z4) {
                            K3.l lVar2 = iVar.f1563c;
                            p pVar = vVar3.f1012a;
                            s sVar = iVar.f1561a;
                            if (pVar.f955i) {
                                SSLSocketFactory sSLSocketFactory2 = sVar.o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                S3.c cVar2 = sVar.f993s;
                                eVar = sVar.f994t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                eVar = null;
                            }
                            iVar.f1567g = new K3.f(lVar2, new C0050a(pVar.f950d, pVar.f951e, sVar.f987k, sVar.n, sSLSocketFactory, cVar, eVar, sVar.f989m, sVar.f992r, sVar.f991q, sVar.f988l), iVar);
                        }
                        try {
                            if (iVar.f1573m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                y b6 = gVar.b(vVar3);
                                if (yVar != null) {
                                    x b7 = b6.b();
                                    x b8 = yVar.b();
                                    b8.f1026g = null;
                                    y a4 = b8.a();
                                    if (a4.f1039g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    b7.f1029j = a4;
                                    b6 = b7.a();
                                }
                                yVar = b6;
                                vVar3 = b(yVar, iVar.f1569i);
                                if (vVar3 == null) {
                                    iVar.d(false);
                                    return yVar;
                                }
                                z zVar2 = yVar.f1039g;
                                if (zVar2 != null) {
                                    H3.b.c(zVar2);
                                }
                                i4++;
                                if (i4 > 20) {
                                    throw new ProtocolException(i.h(Integer.valueOf(i4), "Too many follow-up requests: "));
                                }
                                iVar.d(true);
                            } catch (K3.m e4) {
                                if (!c(e4.f1594b, iVar, vVar3, false)) {
                                    IOException iOException = e4.f1593a;
                                    H3.b.x(iOException, list);
                                    throw iOException;
                                }
                                list = d3.i.i0(list, e4.f1593a);
                                iVar.d(true);
                                z4 = false;
                            } catch (IOException e5) {
                                if (!c(e5, iVar, vVar3, !(e5 instanceof C0077a))) {
                                    H3.b.x(e5, list);
                                    throw e5;
                                }
                                list = d3.i.i0(list, e5);
                                iVar.d(true);
                                z4 = false;
                            }
                        } catch (Throwable th2) {
                            iVar.d(true);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                }
        }
    }

    public v b(y yVar, K3.e eVar) {
        k kVar;
        o oVar;
        y yVar2;
        A a3 = (eVar == null || (kVar = eVar.f1549e) == null) ? null : kVar.f1575b;
        int i4 = yVar.f1036d;
        String str = yVar.f1033a.f1013b;
        if (i4 != 307 && i4 != 308) {
            if (i4 == 401) {
                ((s) this.f1667b).f983g.getClass();
                return null;
            }
            if (i4 != 421) {
                if (i4 == 503) {
                    y yVar3 = yVar.f1042j;
                    if ((yVar3 == null || yVar3.f1036d != 503) && d(yVar, Integer.MAX_VALUE) == 0) {
                        return yVar.f1033a;
                    }
                } else {
                    if (i4 == 407) {
                        i.b(a3);
                        if (a3.f847b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((s) this.f1667b).f989m.getClass();
                        return null;
                    }
                    if (i4 != 408) {
                        switch (i4) {
                        }
                    } else if (((s) this.f1667b).f982f && (((yVar2 = yVar.f1042j) == null || yVar2.f1036d != 408) && d(yVar, 0) <= 0)) {
                        return yVar.f1033a;
                    }
                }
            } else if (eVar != null && !i.a(((C0050a) eVar.f1546b.f1554e).f863h.f950d, eVar.f1549e.f1575b.f846a.f863h.f950d)) {
                k kVar2 = eVar.f1549e;
                synchronized (kVar2) {
                    kVar2.f1584k = true;
                }
                return yVar.f1033a;
            }
            return null;
        }
        s sVar = (s) this.f1667b;
        if (sVar.f984h) {
            String a4 = y.a(yVar, "Location");
            v vVar = yVar.f1033a;
            if (a4 != null) {
                p pVar = vVar.f1012a;
                pVar.getClass();
                try {
                    oVar = new o();
                    oVar.c(pVar, a4);
                } catch (IllegalArgumentException unused) {
                    oVar = null;
                }
                p a5 = oVar == null ? null : oVar.a();
                if (a5 != null && (i.a(a5.f947a, vVar.f1012a.f947a) || sVar.f985i)) {
                    u a6 = vVar.a();
                    if (AbstractC0457a.y(str)) {
                        int i5 = yVar.f1036d;
                        boolean z = str.equals("PROPFIND") || i5 == 308 || i5 == 307;
                        if (str.equals("PROPFIND") || i5 == 308 || i5 == 307) {
                            a6.g(str, z ? vVar.f1015d : null);
                        } else {
                            a6.g("GET", null);
                        }
                        if (!z) {
                            ((m) a6.f1009c).i("Transfer-Encoding");
                            ((m) a6.f1009c).i("Content-Length");
                            ((m) a6.f1009c).i("Content-Type");
                        }
                    }
                    if (!H3.b.a(vVar.f1012a, a5)) {
                        ((m) a6.f1009c).i("Authorization");
                    }
                    a6.f1007a = a5;
                    return a6.a();
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
    public boolean c(IOException iOException, K3.i iVar, v vVar, boolean z) {
        boolean z4;
        K3.n nVar;
        k kVar;
        if (!((s) this.f1667b).f982f || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        K3.f fVar = iVar.f1567g;
        i.b(fVar);
        int i4 = fVar.f1550a;
        if (i4 == 0 && fVar.f1551b == 0 && fVar.f1552c == 0) {
            z4 = false;
        } else {
            if (((A) fVar.f1558i) == null) {
                A a3 = null;
                if (i4 <= 1 && fVar.f1551b <= 1 && fVar.f1552c <= 0 && (kVar = ((K3.i) fVar.f1555f).f1568h) != null) {
                    synchronized (kVar) {
                        if (kVar.f1585l == 0) {
                            if (H3.b.a(kVar.f1575b.f846a.f863h, ((C0050a) fVar.f1554e).f863h)) {
                                a3 = kVar.f1575b;
                            }
                        }
                    }
                }
                if (a3 != null) {
                    fVar.f1558i = a3;
                } else {
                    P p2 = (P) fVar.f1556g;
                    if ((p2 == null || !p2.e()) && (nVar = (K3.n) fVar.f1557h) != null) {
                        z4 = nVar.d();
                    }
                }
            }
            z4 = true;
        }
        return z4;
    }

    public a(s client) {
        i.e(client, "client");
        this.f1667b = client;
    }
}
