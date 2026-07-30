package x7;

import a2.q;
import c0.w;
import com.android.installreferrer.api.InstallReferrerClient;
import f8.p;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import r6.k;
import s7.l;
import s7.m;
import s7.r;
import s7.s;
import s7.u;
import s7.v;
import w7.i;
import w7.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9685a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9686b;

    public a(s7.b bVar) {
        k.f(bVar, "cookieJar");
        this.f9686b = bVar;
    }

    public static int d(s sVar, int i7) {
        String b9 = s.b("Retry-After", sVar);
        if (b9 == null) {
            return i7;
        }
        Pattern compile = Pattern.compile("\\d+");
        k.e(compile, "compile(...)");
        if (!compile.matcher(b9).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b9);
        k.e(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // s7.m
    public final s a(f fVar) {
        u uVar;
        SSLSocketFactory sSLSocketFactory;
        e8.c cVar;
        s7.d dVar;
        switch (this.f9685a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s7.b bVar = (s7.b) this.f9686b;
                q qVar = fVar.f9692e;
                s7.k kVar = (s7.k) qVar.f438e;
                g3.k j8 = qVar.j();
                l lVar = (l) qVar.f436c;
                boolean z8 = false;
                if (kVar.a("Host") == null) {
                    j8.t("Host", t7.b.u(lVar, false));
                }
                if (kVar.a("Connection") == null) {
                    j8.t("Connection", "Keep-Alive");
                }
                if (kVar.a("Accept-Encoding") == null && kVar.a("Range") == null) {
                    j8.t("Accept-Encoding", "gzip");
                    z8 = true;
                }
                bVar.getClass();
                k.f(lVar, "url");
                if (kVar.a("User-Agent") == null) {
                    j8.t("User-Agent", "okhttp/4.12.0");
                }
                s b9 = fVar.b(j8.m());
                s7.k kVar2 = b9.f8688k;
                e.b(bVar, lVar, kVar2);
                r c4 = b9.c();
                c4.f8670a = qVar;
                if (z8 && "gzip".equalsIgnoreCase(s.b("Content-Encoding", b9)) && e.a(b9) && (uVar = b9.f8689l) != null) {
                    p pVar = new p(uVar.k());
                    f1.g m8 = kVar2.m();
                    m8.p("Content-Encoding");
                    m8.p("Content-Length");
                    c4.f8675f = m8.d().m();
                    c4.f8676g = new g(s.b("Content-Type", b9), -1L, a8.d.n(pVar));
                }
                return c4.a();
            default:
                q qVar2 = fVar.f9692e;
                w7.g gVar = fVar.f9688a;
                List list = e6.u.f2826f;
                s sVar = null;
                int i7 = 0;
                q qVar3 = qVar2;
                while (true) {
                    boolean z9 = true;
                    while (gVar.f9559n == null) {
                        synchronized (gVar) {
                            try {
                                if (gVar.f9561p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (gVar.f9560o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z9) {
                            j jVar = gVar.f9553h;
                            l lVar2 = (l) qVar3.f436c;
                            s7.p pVar2 = gVar.f9551f;
                            if (lVar2.f8616i) {
                                SSLSocketFactory sSLSocketFactory2 = pVar2.f8655t;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                e8.c cVar2 = pVar2.f8659x;
                                dVar = pVar2.f8660y;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            gVar.f9557l = new w7.d(jVar, new s7.a(lVar2.f8611d, lVar2.f8612e, pVar2.f8651p, pVar2.f8654s, sSLSocketFactory, cVar, dVar, pVar2.f8653r, pVar2.f8658w, pVar2.f8657v, pVar2.f8652q), gVar);
                        }
                        try {
                            if (gVar.f9563r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    s b10 = fVar.b(qVar3);
                                    if (sVar != null) {
                                        r c6 = b10.c();
                                        r c9 = sVar.c();
                                        c9.f8676g = null;
                                        s a3 = c9.a();
                                        if (a3.f8689l != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        c6.f8679j = a3;
                                        b10 = c6.a();
                                    }
                                    sVar = b10;
                                    qVar3 = b(sVar, gVar.f9559n);
                                    if (qVar3 == null) {
                                        gVar.d(false);
                                        return sVar;
                                    }
                                    u uVar2 = sVar.f8689l;
                                    if (uVar2 != null) {
                                        t7.b.c(uVar2);
                                    }
                                    i7++;
                                    if (i7 > 20) {
                                        throw new ProtocolException("Too many follow-up requests: " + i7);
                                    }
                                    gVar.d(true);
                                } catch (w7.k e9) {
                                    if (!c(e9.f9588g, gVar, qVar3, false)) {
                                        IOException iOException = e9.f9587f;
                                        k.f(iOException, "<this>");
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            d6.a.a(iOException, (Exception) it.next());
                                        }
                                        throw iOException;
                                    }
                                    list = e6.l.q0(list, e9.f9587f);
                                    gVar.d(true);
                                    z9 = false;
                                }
                            } catch (IOException e10) {
                                if (!c(e10, gVar, qVar3, !(e10 instanceof z7.a))) {
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        d6.a.a(e10, (Exception) it2.next());
                                    }
                                    throw e10;
                                }
                                list = e6.l.q0(list, e10);
                                gVar.d(true);
                                z9 = false;
                            }
                        } catch (Throwable th2) {
                            gVar.d(true);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                }
        }
    }

    public q b(s sVar, w wVar) {
        n3.k kVar;
        s sVar2;
        i iVar;
        v vVar = (wVar == null || (iVar = (i) wVar.f1517e) == null) ? null : iVar.f9567b;
        int i7 = sVar.f8686i;
        String str = (String) sVar.f8683f.f437d;
        if (i7 != 307 && i7 != 308) {
            if (i7 == 401) {
                ((s7.p) this.f9686b).f8647l.getClass();
                return null;
            }
            if (i7 != 421) {
                if (i7 == 503) {
                    s sVar3 = sVar.f8692o;
                    if ((sVar3 == null || sVar3.f8686i != 503) && d(sVar, Integer.MAX_VALUE) == 0) {
                        return sVar.f8683f;
                    }
                } else {
                    if (i7 == 407) {
                        k.c(vVar);
                        if (vVar.f8699b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((s7.p) this.f9686b).f8653r.getClass();
                        return null;
                    }
                    if (i7 != 408) {
                        switch (i7) {
                        }
                    } else if (((s7.p) this.f9686b).f8646k && (((sVar2 = sVar.f8692o) == null || sVar2.f8686i != 408) && d(sVar, 0) <= 0)) {
                        return sVar.f8683f;
                    }
                }
            } else if (wVar != null && !k.a(((w7.d) wVar.f1515c).f9541b.f8536h.f8611d, ((i) wVar.f1517e).f9567b.f8698a.f8536h.f8611d)) {
                i iVar2 = (i) wVar.f1517e;
                synchronized (iVar2) {
                    iVar2.f9576k = true;
                }
                return sVar.f8683f;
            }
            return null;
        }
        s7.p pVar = (s7.p) this.f9686b;
        if (pVar.f8648m) {
            String b9 = s.b("Location", sVar);
            q qVar = sVar.f8683f;
            if (b9 != null) {
                l lVar = (l) qVar.f436c;
                lVar.getClass();
                try {
                    kVar = new n3.k(1);
                    kVar.o(lVar, b9);
                } catch (IllegalArgumentException unused) {
                    kVar = null;
                }
                l b10 = kVar != null ? kVar.b() : null;
                if (b10 != null && (k.a(b10.f8608a, ((l) qVar.f436c).f8608a) || pVar.f8649n)) {
                    g3.k j8 = qVar.j();
                    if (u3.q.i(str)) {
                        int i8 = sVar.f8686i;
                        boolean z8 = str.equals("PROPFIND") || i8 == 308 || i8 == 307;
                        if (str.equals("PROPFIND") || i8 == 308 || i8 == 307) {
                            j8.v(str, null);
                        } else {
                            j8.v("GET", null);
                        }
                        if (!z8) {
                            ((f1.g) j8.f4162i).p("Transfer-Encoding");
                            ((f1.g) j8.f4162i).p("Content-Length");
                            ((f1.g) j8.f4162i).p("Content-Type");
                        }
                    }
                    if (!t7.b.a((l) qVar.f436c, b10)) {
                        ((f1.g) j8.f4162i).p("Authorization");
                    }
                    j8.f4160g = b10;
                    return j8.m();
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
    public boolean c(IOException iOException, w7.g gVar, q qVar, boolean z8) {
        boolean z9;
        e5.b bVar;
        i iVar;
        if (!((s7.p) this.f9686b).f8646k || ((z8 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        w7.d dVar = gVar.f9557l;
        k.c(dVar);
        int i7 = dVar.f9545f;
        if (i7 == 0 && dVar.f9546g == 0 && dVar.f9547h == 0) {
            z9 = false;
        } else {
            if (dVar.f9548i == null) {
                v vVar = null;
                if (i7 <= 1 && dVar.f9546g <= 1 && dVar.f9547h <= 0 && (iVar = dVar.f9542c.f9558m) != null) {
                    synchronized (iVar) {
                        if (iVar.f9577l == 0) {
                            if (t7.b.a(iVar.f9567b.f8698a.f8536h, dVar.f9541b.f8536h)) {
                                vVar = iVar.f9567b;
                            }
                        }
                    }
                }
                if (vVar != null) {
                    dVar.f9548i = vVar;
                } else {
                    u5.a aVar = dVar.f9543d;
                    if ((aVar == null || !aVar.c()) && (bVar = dVar.f9544e) != null) {
                        z9 = bVar.c();
                    }
                }
            }
            z9 = true;
        }
        return z9;
    }

    public a(s7.p pVar) {
        k.f(pVar, "client");
        this.f9686b = pVar;
    }
}
