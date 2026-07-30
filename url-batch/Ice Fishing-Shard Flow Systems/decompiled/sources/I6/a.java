package I6;

import D6.A;
import D6.B;
import D6.C;
import D6.C0093a;
import D6.C0097e;
import D6.E;
import D6.F;
import D6.l;
import D6.q;
import D6.r;
import D6.s;
import D6.t;
import D6.u;
import D6.w;
import D6.y;
import D6.z;
import H6.m;
import H6.x;
import K6.C0130a;
import R5.C0164d;
import T6.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1292b;

    public a(l cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f1292b = cookieJar;
    }

    public static int d(C c7, int i2) {
        String a7 = C.a(c7, "Retry-After");
        if (a7 == null) {
            return i2;
        }
        if (!new Regex("\\d+").c(a7)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a7);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D6.t
    public final C a(i chain) {
        E e7;
        boolean z7;
        boolean z8;
        SSLSocketFactory sSLSocketFactory;
        R6.c cVar;
        C0097e c0097e;
        switch (this.f1291a) {
            case 0:
                l lVar = (l) this.f1292b;
                Intrinsics.checkNotNullParameter(chain, "chain");
                z zVar = chain.f1300e;
                y o7 = zVar.o();
                s url = (s) zVar.f640c;
                A a7 = (A) zVar.f642e;
                if (a7 != null) {
                    u b7 = a7.b();
                    if (b7 != null) {
                        o7.b("Content-Type", b7.f572a);
                    }
                    long a8 = a7.a();
                    if (a8 != -1) {
                        o7.b("Content-Length", String.valueOf(a8));
                        o7.e("Transfer-Encoding");
                    } else {
                        o7.b("Transfer-Encoding", "chunked");
                        o7.e("Content-Length");
                    }
                }
                boolean z9 = false;
                if (zVar.m("Host") == null) {
                    o7.b("Host", E6.e.h(url, false));
                }
                if (zVar.m("Connection") == null) {
                    o7.b("Connection", "Keep-Alive");
                }
                if (zVar.m("Accept-Encoding") == null && zVar.m("Range") == null) {
                    o7.b("Accept-Encoding", "gzip");
                    z9 = true;
                }
                lVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                kotlin.collections.A.f6115d.getClass();
                if (zVar.m("User-Agent") == null) {
                    o7.b("User-Agent", "okhttp/5.2.1");
                }
                z request = new z(o7);
                C b8 = chain.b(request);
                q qVar = b8.f431n;
                h.b(lVar, (s) request.f640c, qVar);
                B d7 = b8.d();
                Intrinsics.checkNotNullParameter(request, "request");
                d7.f412a = request;
                if (z9 && "gzip".equalsIgnoreCase(C.a(b8, "Content-Encoding")) && h.a(b8) && (e7 = b8.f432o) != null) {
                    k kVar = new k(e7.g());
                    C4.d c7 = qVar.c();
                    c7.h("Content-Encoding");
                    c7.h("Content-Length");
                    q headers = c7.d();
                    Intrinsics.checkNotNullParameter(headers, "headers");
                    d7.f417f = headers.c();
                    j body = new j(C.a(b8, "Content-Type"), -1L, T6.b.b(kVar));
                    Intrinsics.checkNotNullParameter(body, "body");
                    d7.f418g = body;
                }
                return d7.a();
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                z zVar2 = chain.f1300e;
                H6.q call = chain.f1296a;
                kotlin.collections.A suppressed = kotlin.collections.A.f6115d;
                C networkResponse = null;
                int i2 = 0;
                z request2 = zVar2;
                while (true) {
                    boolean z10 = true;
                    while (true) {
                        Intrinsics.checkNotNullParameter(request2, "request");
                        Intrinsics.checkNotNullParameter(chain, "chain");
                        if (call.f1079r != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (call) {
                            if (call.f1081t) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (call.f1080s) {
                                throw new IllegalStateException("Check failed.");
                            }
                            Unit unit = Unit.f6114a;
                        }
                        if (z10) {
                            w wVar = call.f1070d;
                            G6.d dVar = wVar.f596A;
                            H6.s sVar = call.f1072i;
                            int i5 = wVar.f620x;
                            int i7 = wVar.f621y;
                            int i8 = chain.f1301f;
                            int i9 = chain.f1302g;
                            boolean z11 = wVar.f602e;
                            boolean z12 = wVar.f603f;
                            s url2 = (s) request2.f640c;
                            Intrinsics.checkNotNullParameter(url2, "url");
                            if (Intrinsics.a(url2.f562a, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = wVar.f611o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                R6.c cVar2 = wVar.f615s;
                                c0097e = wVar.f616t;
                                cVar = cVar2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                c0097e = null;
                            }
                            C0093a c0093a = new C0093a(url2.f565d, url2.f566e, wVar.f607k, wVar.f610n, sSLSocketFactory, cVar, c0097e, wVar.f609m, wVar.f614r, wVar.f613q, wVar.f608l);
                            call.f1072i.getClass();
                            H6.t tVar = new H6.t(dVar, sVar, i5, i7, i8, i9, z11, z12, c0093a, call.f1070d.f622z, new H6.a(call, chain));
                            w wVar2 = call.f1070d;
                            call.f1076o = wVar2.f603f ? new H6.l(tVar, wVar2.f596A) : new m(tVar, 1);
                        }
                        try {
                            if (call.f1083v) {
                                z7 = true;
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    B d8 = chain.b(request2).d();
                                    Intrinsics.checkNotNullParameter(request2, "request");
                                    d8.f412a = request2;
                                    d8.f421k = networkResponse != null ? O6.g.Z(networkResponse) : null;
                                    networkResponse = d8.a();
                                    request2 = b(networkResponse, call.f1079r);
                                    if (request2 == null) {
                                        try {
                                            Intrinsics.checkNotNullParameter(call, "call");
                                            Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                                            call.d(false);
                                            return networkResponse;
                                        } catch (Throwable th) {
                                            th = th;
                                            z8 = false;
                                        }
                                    } else {
                                        E6.c.a(networkResponse.f432o);
                                        i2++;
                                        if (i2 > 20) {
                                            Intrinsics.checkNotNullParameter(call, "call");
                                            Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                                            throw new ProtocolException("Too many follow-up requests: " + i2);
                                        }
                                        Intrinsics.checkNotNullParameter(call, "call");
                                        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
                                        call.d(true);
                                    }
                                } catch (IOException exception) {
                                    boolean c8 = c(exception, call, request2);
                                    Intrinsics.checkNotNullParameter(call, "call");
                                    Intrinsics.checkNotNullParameter(exception, "exception");
                                    if (!c8) {
                                        byte[] bArr = E6.c.f709a;
                                        Intrinsics.checkNotNullParameter(exception, "<this>");
                                        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
                                        Iterator it = suppressed.iterator();
                                        while (it.hasNext()) {
                                            C0164d.a(exception, (Exception) it.next());
                                        }
                                        throw exception;
                                    }
                                    Intrinsics.checkNotNullParameter(suppressed, "<this>");
                                    z7 = true;
                                    try {
                                        ArrayList arrayList = new ArrayList(suppressed.size() + 1);
                                        arrayList.addAll(suppressed);
                                        arrayList.add(exception);
                                        call.d(true);
                                        suppressed = arrayList;
                                        z10 = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z8 = true;
                            }
                            th = th2;
                        } catch (Throwable th4) {
                            th = th4;
                            z7 = true;
                        }
                        z8 = z7;
                        call.d(z8);
                        throw th;
                    }
                }
        }
    }

    public z b(C response, H6.h hVar) {
        r rVar;
        C c7;
        F f7 = hVar != null ? hVar.b().f1088d : null;
        int i2 = response.f429l;
        String method = (String) response.f426d.f639b;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                ((w) this.f1292b).f604g.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i2 != 421) {
                if (i2 == 503) {
                    C c8 = response.f436s;
                    if ((c8 == null || c8.f429l != 503) && d(response, Integer.MAX_VALUE) == 0) {
                        return response.f426d;
                    }
                } else {
                    if (i2 == 407) {
                        Intrinsics.b(f7);
                        if (f7.f445b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((w) this.f1292b).f609m.getClass();
                        Intrinsics.checkNotNullParameter(response, "response");
                        return null;
                    }
                    if (i2 != 408) {
                        switch (i2) {
                        }
                    } else if (((w) this.f1292b).f602e && (((c7 = response.f436s) == null || c7.f429l != 408) && d(response, 0) <= 0)) {
                        return response.f426d;
                    }
                }
            } else if (hVar != null && !Intrinsics.a(((H6.i) hVar.f1053d).c().f().f463h.f565d, ((g) hVar.f1054e).e().f().f444a.f463h.f565d)) {
                H6.r b7 = hVar.b();
                synchronized (b7) {
                    b7.f1095l = true;
                    Unit unit = Unit.f6114a;
                }
                return response.f426d;
            }
            return null;
        }
        w wVar = (w) this.f1292b;
        if (wVar.f605h) {
            String link = C.a(response, "Location");
            z zVar = response.f426d;
            if (link != null) {
                s sVar = (s) zVar.f640c;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(link, "link");
                Intrinsics.checkNotNullParameter(link, "link");
                try {
                    rVar = new r();
                    rVar.c(sVar, link);
                } catch (IllegalArgumentException unused) {
                    rVar = null;
                }
                s url = rVar != null ? rVar.a() : null;
                if (url != null && (Intrinsics.a(url.f562a, ((s) zVar.f640c).f562a) || wVar.f606i)) {
                    y o7 = zVar.o();
                    if (V6.b.I(method)) {
                        int i5 = response.f429l;
                        Intrinsics.checkNotNullParameter(method, "method");
                        boolean z7 = method.equals("PROPFIND") || i5 == 308 || i5 == 307;
                        Intrinsics.checkNotNullParameter(method, "method");
                        if (method.equals("PROPFIND") || i5 == 308 || i5 == 307) {
                            o7.d(method, z7 ? (A) zVar.f642e : null);
                        } else {
                            o7.d("GET", null);
                        }
                        if (!z7) {
                            o7.e("Transfer-Encoding");
                            o7.e("Content-Length");
                            o7.e("Content-Type");
                        }
                    }
                    if (!E6.e.a((s) zVar.f640c, url)) {
                        o7.e("Authorization");
                    }
                    Intrinsics.checkNotNullParameter(url, "url");
                    o7.f634e = url;
                    return new z(o7);
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, H6.q qVar, z zVar) {
        boolean z7 = iOException instanceof C0130a;
        if (!((w) this.f1292b).f602e) {
            return false;
        }
        if ((!z7 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z7) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        H6.h hVar = qVar.f1084w;
        if (hVar == null || !hVar.f1051b) {
            return false;
        }
        H6.i iVar = qVar.f1076o;
        Intrinsics.b(iVar);
        x c7 = iVar.c();
        H6.h hVar2 = qVar.f1084w;
        return c7.b(hVar2 != null ? hVar2.b() : null);
    }

    public a(w client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f1292b = client;
    }
}
