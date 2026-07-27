package Y4;

import T4.B;
import T4.C;
import T4.C0151a;
import T4.C0152b;
import T4.C0154d;
import T4.o;
import T4.p;
import T4.q;
import T4.r;
import T4.s;
import T4.u;
import T4.x;
import T4.y;
import T4.z;
import X4.m;
import X4.n;
import X4.t;
import a5.C0199a;
import g4.AbstractC0465j;
import g4.C0471p;
import j5.k;
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
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3707a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3708b;

    public a(C0152b cookieJar) {
        kotlin.jvm.internal.i.e(cookieJar, "cookieJar");
        this.f3708b = cookieJar;
    }

    public static int d(z zVar, int i2) {
        String c2 = zVar.f3020f.c("Retry-After");
        if (c2 == null) {
            c2 = null;
        }
        if (c2 == null) {
            return i2;
        }
        Pattern compile = Pattern.compile("\\d+");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        if (!compile.matcher(c2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(c2);
        kotlin.jvm.internal.i.d(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    @Override // T4.r
    public final z a(i iVar) {
        boolean z;
        B b6;
        M0.e eVar;
        List list;
        z zVar;
        int i2;
        SSLSocketFactory sSLSocketFactory;
        h5.c cVar;
        C0154d c0154d;
        a aVar = this;
        switch (aVar.f3707a) {
            case 0:
                boolean z5 = true;
                M0.e eVar2 = iVar.f3716e;
                B.d k3 = eVar2.k();
                x xVar = (x) eVar2.f1786f;
                if (xVar != null) {
                    s b7 = xVar.b();
                    if (b7 != null) {
                        k3.i("Content-Type", b7.f2933a);
                    }
                    long a6 = xVar.a();
                    if (a6 != -1) {
                        k3.i("Content-Length", String.valueOf(a6));
                        ((L3.j) k3.f108d).h("Transfer-Encoding");
                    } else {
                        k3.i("Transfer-Encoding", "chunked");
                        ((L3.j) k3.f108d).h("Content-Length");
                    }
                }
                o oVar = (o) eVar2.f1785e;
                String c2 = oVar.c("Host");
                q url = (q) eVar2.f1783c;
                if (c2 == null) {
                    z = false;
                    k3.i("Host", U4.e.i(url, false));
                } else {
                    z = false;
                }
                if (oVar.c("Connection") == null) {
                    k3.i("Connection", "Keep-Alive");
                }
                if (oVar.c("Accept-Encoding") == null && oVar.c("Range") == null) {
                    k3.i("Accept-Encoding", "gzip");
                } else {
                    z5 = z;
                }
                C0152b c0152b = (C0152b) aVar.f3708b;
                c0152b.getClass();
                kotlin.jvm.internal.i.e(url, "url");
                if (oVar.c("User-Agent") == null) {
                    k3.i("User-Agent", "okhttp/5.2.1");
                }
                M0.e eVar3 = new M0.e(k3);
                z b8 = iVar.b(eVar3);
                o oVar2 = b8.f3020f;
                h.b(c0152b, (q) eVar3.f1783c, oVar2);
                y a7 = b8.a();
                a7.f3000a = eVar3;
                if (z5) {
                    String c6 = oVar2.c("Content-Encoding");
                    if (c6 == null) {
                        c6 = null;
                    }
                    if ("gzip".equalsIgnoreCase(c6) && h.a(b8) && (b6 = b8.f3021g) != null) {
                        k kVar = new k(b6.g());
                        L3.j e3 = oVar2.e();
                        e3.h("Content-Encoding");
                        e3.h("Content-Length");
                        a7.f3005f = e3.d().e();
                        String c7 = oVar2.c("Content-Type");
                        if (c7 == null) {
                            c7 = null;
                        }
                        a7.f3006g = new j(c7, -1L, j5.b.b(kVar));
                    }
                }
                return a7.a();
            default:
                M0.e eVar4 = iVar.f3716e;
                X4.r rVar = iVar.f3712a;
                List list2 = C0471p.f5750a;
                z zVar2 = null;
                int i3 = 0;
                M0.e eVar5 = eVar4;
                while (true) {
                    boolean z6 = true;
                    while (true) {
                        rVar.getClass();
                        if (rVar.f3598j != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (rVar) {
                            try {
                                try {
                                    if (rVar.f3600l) {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                    if (rVar.f3599k) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    if (z6) {
                                        u uVar = rVar.f3589a;
                                        W4.d dVar = uVar.f2958A;
                                        t tVar = rVar.f3591c;
                                        int i6 = uVar.f2983x;
                                        int i7 = uVar.f2984y;
                                        int i8 = iVar.f3717f;
                                        int i9 = iVar.f3718g;
                                        boolean z7 = uVar.f2964e;
                                        boolean z8 = uVar.f2965f;
                                        q url2 = (q) eVar5.f1783c;
                                        list = list2;
                                        kotlin.jvm.internal.i.e(url2, "url");
                                        i2 = i3;
                                        if (kotlin.jvm.internal.i.a(url2.f2923a, "https")) {
                                            SSLSocketFactory sSLSocketFactory2 = uVar.f2974o;
                                            if (sSLSocketFactory2 == null) {
                                                throw new IllegalStateException("CLEARTEXT-only client");
                                            }
                                            h5.c cVar2 = uVar.f2978s;
                                            c0154d = uVar.f2979t;
                                            cVar = cVar2;
                                            sSLSocketFactory = sSLSocketFactory2;
                                        } else {
                                            sSLSocketFactory = null;
                                            cVar = null;
                                            c0154d = null;
                                        }
                                        zVar = zVar2;
                                        eVar = eVar5;
                                        X4.u uVar2 = new X4.u(dVar, tVar, i6, i7, i8, i9, 0, z7, z8, new C0151a(url2.f2926d, url2.f2927e, uVar.f2970k, uVar.f2973n, sSLSocketFactory, cVar, c0154d, uVar.f2972m, uVar.f2977r, uVar.f2976q, uVar.f2971l), rVar.f3589a.z, new X4.a(rVar, rVar.f3591c.f3625b, iVar));
                                        u uVar3 = rVar.f3589a;
                                        rVar.f3595g = uVar3.f2965f ? new m(uVar2, uVar3.f2958A) : new n(uVar2);
                                    } else {
                                        eVar = eVar5;
                                        list = list2;
                                        zVar = zVar2;
                                        i2 = i3;
                                    }
                                    try {
                                        if (rVar.f3602n) {
                                            throw new IOException("Canceled");
                                        }
                                        M0.e eVar6 = eVar;
                                        try {
                                            y a8 = iVar.b(eVar6).a();
                                            a8.f3000a = eVar6;
                                            a8.f3010k = zVar != null ? AbstractC1477a.A(zVar) : null;
                                            zVar2 = a8.a();
                                            try {
                                                eVar5 = b(zVar2, rVar.f3598j);
                                                if (eVar5 == null) {
                                                    rVar.e(false);
                                                    return zVar2;
                                                }
                                                U4.c.b(zVar2.f3021g);
                                                i3 = i2 + 1;
                                                if (i3 > 20) {
                                                    throw new ProtocolException("Too many follow-up requests: " + i3);
                                                }
                                                rVar.e(true);
                                                aVar = this;
                                                list2 = list;
                                            } catch (Throwable th) {
                                                th = th;
                                                rVar.e(true);
                                                throw th;
                                            }
                                        } catch (IOException e6) {
                                            if (!c(e6, rVar, eVar6)) {
                                                byte[] bArr = U4.c.f3176a;
                                                List suppressed = list;
                                                kotlin.jvm.internal.i.e(suppressed, "suppressed");
                                                Iterator it = suppressed.iterator();
                                                while (it.hasNext()) {
                                                    K1.b.C(e6, (Exception) it.next());
                                                }
                                                throw e6;
                                            }
                                            list2 = AbstractC0465j.M0(list, e6);
                                            rVar.e(true);
                                            eVar5 = eVar6;
                                            aVar = this;
                                            i3 = i2;
                                            zVar2 = zVar;
                                            z6 = false;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                }
        }
    }

    public M0.e b(z zVar, X4.i iVar) {
        p pVar;
        C c2 = iVar != null ? iVar.b().f3607d : null;
        int i2 = zVar.f3018d;
        String str = (String) zVar.f3015a.f1784d;
        if (i2 != 307 && i2 != 308) {
            if (i2 == 401) {
                ((u) this.f3708b).f2966g.getClass();
                return null;
            }
            if (i2 == 421) {
                if (iVar == null || kotlin.jvm.internal.i.a(((X4.j) iVar.f3572d).c().g().f2824h.f2926d, ((g) iVar.f3573e).g().f().f2805a.f2824h.f2926d)) {
                    return null;
                }
                X4.s b6 = iVar.b();
                synchronized (b6) {
                    b6.f3617n = true;
                }
                return zVar.f3015a;
            }
            if (i2 == 503) {
                z zVar2 = zVar.f3025k;
                if ((zVar2 == null || zVar2.f3018d != 503) && d(zVar, Integer.MAX_VALUE) == 0) {
                    return zVar.f3015a;
                }
                return null;
            }
            if (i2 == 407) {
                kotlin.jvm.internal.i.b(c2);
                if (c2.f2806b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((u) this.f3708b).f2972m.getClass();
                return null;
            }
            if (i2 == 408) {
                if (!((u) this.f3708b).f2964e) {
                    return null;
                }
                z zVar3 = zVar.f3025k;
                if ((zVar3 == null || zVar3.f3018d != 408) && d(zVar, 0) <= 0) {
                    return zVar.f3015a;
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
        u uVar = (u) this.f3708b;
        if (!uVar.f2967h) {
            return null;
        }
        String c6 = zVar.f3020f.c("Location");
        if (c6 == null) {
            c6 = null;
        }
        if (c6 == null) {
            return null;
        }
        M0.e eVar = zVar.f3015a;
        q qVar = (q) eVar.f1783c;
        qVar.getClass();
        try {
            pVar = new p();
            pVar.c(qVar, c6);
        } catch (IllegalArgumentException unused) {
            pVar = null;
        }
        q a6 = pVar != null ? pVar.a() : null;
        if (a6 == null) {
            return null;
        }
        if (!kotlin.jvm.internal.i.a(a6.f2923a, ((q) eVar.f1783c).f2923a) && !uVar.f2968i) {
            return null;
        }
        B.d k3 = eVar.k();
        if (AbstractC1477a.v(str)) {
            boolean equals = str.equals("PROPFIND");
            int i3 = zVar.f3018d;
            boolean z = equals || i3 == 308 || i3 == 307;
            if (str.equals("PROPFIND") || i3 == 308 || i3 == 307) {
                k3.j(str, z ? (x) eVar.f1786f : null);
            } else {
                k3.j("GET", null);
            }
            if (!z) {
                ((L3.j) k3.f108d).h("Transfer-Encoding");
                ((L3.j) k3.f108d).h("Content-Length");
                ((L3.j) k3.f108d).h("Content-Type");
            }
        }
        if (!U4.e.a((q) eVar.f1783c, a6)) {
            ((L3.j) k3.f108d).h("Authorization");
        }
        k3.f107c = a6;
        return new M0.e(k3);
    }

    public boolean c(IOException iOException, X4.r rVar, M0.e eVar) {
        X4.i iVar;
        boolean z = iOException instanceof C0199a;
        if (!((u) this.f3708b).f2964e) {
            return false;
        }
        if ((z || !(iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && z) && (iVar = rVar.f3603o) != null && iVar.f3570b) {
            X4.j jVar = rVar.f3595g;
            kotlin.jvm.internal.i.b(jVar);
            X4.y c2 = jVar.c();
            X4.i iVar2 = rVar.f3603o;
            if (c2.f(iVar2 != null ? iVar2.b() : null)) {
                return true;
            }
        }
        return false;
    }

    public a(u client) {
        kotlin.jvm.internal.i.e(client, "client");
        this.f3708b = client;
    }
}
