package c6;

import Q4.j;
import X5.C0217a;
import X5.C0218b;
import X5.n;
import X5.o;
import X5.p;
import X5.q;
import X5.s;
import X5.u;
import X5.v;
import X5.w;
import X5.y;
import X5.z;
import a1.AbstractC0223a;
import b6.l;
import b6.m;
import b6.r;
import b6.t;
import b6.x;
import e6.C0355a;
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
import l5.C0512p;
import m1.AbstractC0521b;
import n6.k;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3822a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3823b;

    public a(C0218b cookieJar) {
        kotlin.jvm.internal.i.e(cookieJar, "cookieJar");
        this.f3823b = cookieJar;
    }

    public static int d(w wVar, int i7) {
        String a7 = wVar.f3066k.a("Retry-After");
        if (a7 == null) {
            a7 = null;
        }
        if (a7 == null) {
            return i7;
        }
        Pattern compile = Pattern.compile("\\d+");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        if (!compile.matcher(a7).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a7);
        kotlin.jvm.internal.i.d(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X5.p
    public final w a(h hVar) {
        y yVar;
        SSLSocketFactory sSLSocketFactory;
        l6.c cVar;
        X5.d dVar;
        switch (this.f3822a) {
            case 0:
                C0218b c0218b = (C0218b) this.f3823b;
                D0.h hVar2 = hVar.f3830e;
                n nVar = (n) hVar2.f332d;
                A.e i7 = hVar2.i();
                o url = (o) hVar2.f331c;
                u uVar = (u) hVar2.f333e;
                if (uVar != null) {
                    q b7 = uVar.b();
                    if (b7 != null) {
                        i7.h("Content-Type", b7.f2984a);
                    }
                    long a7 = uVar.a();
                    if (a7 != -1) {
                        i7.h("Content-Length", String.valueOf(a7));
                        ((j) i7.f9i).d("Transfer-Encoding");
                    } else {
                        i7.h("Transfer-Encoding", "chunked");
                        ((j) i7.f9i).d("Content-Length");
                    }
                }
                boolean z5 = false;
                if (nVar.a("Host") == null) {
                    i7.h("Host", Y5.e.h(url, false));
                }
                if (nVar.a("Connection") == null) {
                    i7.h("Connection", "Keep-Alive");
                }
                if (nVar.a("Accept-Encoding") == null && nVar.a("Range") == null) {
                    i7.h("Accept-Encoding", "gzip");
                    z5 = true;
                }
                c0218b.getClass();
                kotlin.jvm.internal.i.e(url, "url");
                if (nVar.a("User-Agent") == null) {
                    i7.h("User-Agent", "okhttp/5.2.1");
                }
                D0.h hVar3 = new D0.h(i7);
                w b8 = hVar.b(hVar3);
                n nVar2 = b8.f3066k;
                g.b(c0218b, (o) hVar3.f331c, nVar2);
                v a8 = b8.a();
                a8.f3046a = hVar3;
                if (z5) {
                    String a9 = nVar2.a("Content-Encoding");
                    if (a9 == null) {
                        a9 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a9) && g.a(b8) && (yVar = b8.f3067l) != null) {
                        k kVar = new k(yVar.e());
                        j c7 = nVar2.c();
                        c7.d("Content-Encoding");
                        c7.d("Content-Length");
                        a8.f3051f = c7.c().c();
                        String a10 = nVar2.a("Content-Type");
                        if (a10 == null) {
                            a10 = null;
                        }
                        a8.f3052g = new i(a10, -1L, n6.b.b(kVar));
                    }
                }
                return a8.a();
            default:
                D0.h hVar4 = hVar.f3830e;
                b6.q qVar = hVar.f3826a;
                C0512p suppressed = C0512p.f5303f;
                w wVar = null;
                int i8 = 0;
                D0.h hVar5 = hVar4;
                while (true) {
                    boolean z6 = true;
                    while (qVar.f3689o == null) {
                        synchronized (qVar) {
                            try {
                                if (qVar.f3691q) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (qVar.f3690p) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z6) {
                            s sVar = qVar.f3680f;
                            a6.e eVar = sVar.f3009A;
                            b6.s sVar2 = qVar.f3682h;
                            int i9 = sVar.f3034x;
                            int i10 = sVar.y;
                            int i11 = hVar.f3831f;
                            int i12 = hVar.f3832g;
                            boolean z7 = sVar.f3015e;
                            boolean z8 = sVar.f3016f;
                            o url2 = (o) hVar5.f331c;
                            kotlin.jvm.internal.i.e(url2, "url");
                            if (kotlin.jvm.internal.i.a(url2.f2974a, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = sVar.f3025o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                l6.c cVar2 = sVar.f3029s;
                                dVar = sVar.f3030t;
                                cVar = cVar2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            t tVar = new t(eVar, sVar2, i9, i10, i11, i12, z7, z8, new C0217a(url2.f2977d, url2.f2978e, sVar.f3021k, sVar.f3024n, sSLSocketFactory, cVar, dVar, sVar.f3023m, sVar.f3028r, sVar.f3027q, sVar.f3022l), qVar.f3680f.f3035z, new b6.a(qVar, qVar.f3682h.f3714a, hVar));
                            s sVar3 = qVar.f3680f;
                            qVar.f3686l = sVar3.f3016f ? new l(tVar, sVar3.f3009A) : new m(tVar);
                        }
                        try {
                            if (qVar.f3693s) {
                                throw new IOException("Canceled");
                            }
                            try {
                                v a11 = hVar.b(hVar5).a();
                                a11.f3046a = hVar5;
                                a11.f3056k = wVar != null ? AbstractC0223a.G(wVar) : null;
                                wVar = a11.a();
                                hVar5 = b(wVar, qVar.f3689o);
                                if (hVar5 == null) {
                                    qVar.d(false);
                                    return wVar;
                                }
                                Y5.c.a(wVar.f3067l);
                                i8++;
                                if (i8 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i8);
                                }
                                qVar.d(true);
                            } catch (IOException e4) {
                                if (!c(e4, qVar, hVar5)) {
                                    byte[] bArr = Y5.c.f3099a;
                                    kotlin.jvm.internal.i.e(suppressed, "suppressed");
                                    Iterator it = suppressed.iterator();
                                    while (it.hasNext()) {
                                        i6.g.a(e4, (Exception) it.next());
                                    }
                                    throw e4;
                                }
                                kotlin.jvm.internal.i.e(suppressed, "<this>");
                                ArrayList arrayList = new ArrayList(suppressed.size() + 1);
                                arrayList.addAll(suppressed);
                                arrayList.add(e4);
                                qVar.d(true);
                                suppressed = arrayList;
                                z6 = false;
                            }
                        } catch (Throwable th2) {
                            qVar.d(true);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                }
        }
    }

    public D0.h b(w wVar, U.a aVar) {
        F3.g gVar;
        w wVar2;
        z zVar = aVar != null ? aVar.b().f3698d : null;
        int i7 = wVar.f3064i;
        String str = (String) wVar.f3061f.f330b;
        if (i7 != 307 && i7 != 308) {
            if (i7 == 401) {
                ((s) this.f3823b).f3017g.getClass();
                return null;
            }
            if (i7 != 421) {
                if (i7 == 503) {
                    w wVar3 = wVar.f3071p;
                    if ((wVar3 == null || wVar3.f3064i != 503) && d(wVar, Integer.MAX_VALUE) == 0) {
                        return wVar.f3061f;
                    }
                } else {
                    if (i7 == 407) {
                        kotlin.jvm.internal.i.b(zVar);
                        if (zVar.f3080b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((s) this.f3823b).f3023m.getClass();
                        return null;
                    }
                    if (i7 != 408) {
                        switch (i7) {
                        }
                    } else if (((s) this.f3823b).f3015e && (((wVar2 = wVar.f3071p) == null || wVar2.f3064i != 408) && d(wVar, 0) <= 0)) {
                        return wVar.f3061f;
                    }
                }
            } else if (aVar != null && !kotlin.jvm.internal.i.a(((b6.i) aVar.f2484d).b().g().f2885h.f2977d, ((f) aVar.f2485e).g().f().f3079a.f2885h.f2977d)) {
                r b7 = aVar.b();
                synchronized (b7) {
                    b7.f3707m = true;
                }
                return wVar.f3061f;
            }
            return null;
        }
        s sVar = (s) this.f3823b;
        if (sVar.f3018h) {
            String a7 = wVar.f3066k.a("Location");
            if (a7 == null) {
                a7 = null;
            }
            D0.h hVar = wVar.f3061f;
            if (a7 != null) {
                o oVar = (o) hVar.f331c;
                oVar.getClass();
                try {
                    gVar = new F3.g(2);
                    gVar.q(oVar, a7);
                } catch (IllegalArgumentException unused) {
                    gVar = null;
                }
                o a8 = gVar != null ? gVar.a() : null;
                if (a8 != null && (kotlin.jvm.internal.i.a(a8.f2974a, ((o) hVar.f331c).f2974a) || sVar.f3019i)) {
                    A.e i8 = hVar.i();
                    if (AbstractC0521b.z(str)) {
                        int i9 = wVar.f3064i;
                        boolean z5 = str.equals("PROPFIND") || i9 == 308 || i9 == 307;
                        if (str.equals("PROPFIND") || i9 == 308 || i9 == 307) {
                            i8.i(str, z5 ? (u) hVar.f333e : null);
                        } else {
                            i8.i("GET", null);
                        }
                        if (!z5) {
                            ((j) i8.f9i).d("Transfer-Encoding");
                            ((j) i8.f9i).d("Content-Length");
                            ((j) i8.f9i).d("Content-Type");
                        }
                    }
                    if (!Y5.e.a((o) hVar.f331c, a8)) {
                        ((j) i8.f9i).d("Authorization");
                    }
                    i8.f8h = a8;
                    return new D0.h(i8);
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, b6.q qVar, D0.h hVar) {
        boolean z5 = iOException instanceof C0355a;
        if (!((s) this.f3823b).f3015e) {
            return false;
        }
        if ((!z5 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z5) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        U.a aVar = qVar.f3694t;
        if (aVar == null || !aVar.f2482b) {
            return false;
        }
        b6.i iVar = qVar.f3686l;
        kotlin.jvm.internal.i.b(iVar);
        x b7 = iVar.b();
        U.a aVar2 = qVar.f3694t;
        return b7.e(aVar2 != null ? aVar2.b() : null);
    }

    public a(s client) {
        kotlin.jvm.internal.i.e(client, "client");
        this.f3823b = client;
    }
}
