package j8;

import B2.N;
import com.google.android.gms.internal.ads.C4088vv;
import e8.C4483a;
import e8.C4484b;
import e8.m;
import e8.n;
import e8.o;
import e8.p;
import e8.q;
import e8.s;
import e8.u;
import e8.v;
import e8.w;
import e8.y;
import e8.z;
import g1.C4524d;
import i8.l;
import i8.r;
import i8.t;
import i8.x;
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
import l8.C4709a;
import q2.C4903n;
import r7.C4985p;
import u8.j;

/* loaded from: classes2.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38590a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38591b;

    public a(C4484b cookieJar) {
        kotlin.jvm.internal.h.e(cookieJar, "cookieJar");
        this.f38591b = cookieJar;
    }

    public static int d(w wVar, int i) {
        String a9 = wVar.f37535y.a("Retry-After");
        if (a9 == null) {
            a9 = null;
        }
        if (a9 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        if (!compile.matcher(a9).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a9);
        kotlin.jvm.internal.h.d(valueOf, "valueOf(...)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e8.p
    public final w a(h hVar) {
        boolean z8;
        y yVar;
        boolean z9;
        boolean z10;
        w k6;
        SSLSocketFactory sSLSocketFactory;
        s8.c cVar;
        e8.d dVar;
        switch (this.f38590a) {
            case 0:
                boolean z11 = true;
                C4903n c4903n = hVar.f38598e;
                N j9 = c4903n.j();
                u uVar = (u) c4903n.f40104x;
                if (uVar != null) {
                    q b9 = uVar.b();
                    if (b9 != null) {
                        j9.o("Content-Type", b9.f37447a);
                    }
                    long a9 = uVar.a();
                    if (a9 != -1) {
                        j9.o("Content-Length", String.valueOf(a9));
                        ((I1.b) j9.f198w).g("Transfer-Encoding");
                    } else {
                        j9.o("Transfer-Encoding", "chunked");
                        ((I1.b) j9.f198w).g("Content-Length");
                    }
                }
                m mVar = (m) c4903n.f40103w;
                String a10 = mVar.a("Host");
                o url = (o) c4903n.f40101u;
                if (a10 == null) {
                    z8 = false;
                    j9.o("Host", f8.d.i(url, false));
                } else {
                    z8 = false;
                }
                if (mVar.a("Connection") == null) {
                    j9.o("Connection", com.anythink.expressad.foundation.g.f.g.b.f19498c);
                }
                if (mVar.a("Accept-Encoding") == null && mVar.a("Range") == null) {
                    j9.o("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19499d);
                } else {
                    z11 = z8;
                }
                C4484b c4484b = (C4484b) this.f38591b;
                c4484b.getClass();
                kotlin.jvm.internal.h.e(url, "url");
                if (mVar.a("User-Agent") == null) {
                    j9.o("User-Agent", "okhttp/5.2.1");
                }
                C4903n c4903n2 = new C4903n(j9);
                w b10 = hVar.b(c4903n2);
                m mVar2 = b10.f37535y;
                g.b(c4484b, (o) c4903n2.f40101u, mVar2);
                v b11 = b10.b();
                b11.f37508a = c4903n2;
                if (z11) {
                    String a11 = mVar2.a("Content-Encoding");
                    if (a11 == null) {
                        a11 = null;
                    }
                    if (com.anythink.expressad.foundation.g.f.g.b.f19499d.equalsIgnoreCase(a11) && g.a(b10) && (yVar = b10.f37536z) != null) {
                        j jVar = new j(yVar.z());
                        I1.b d2 = mVar2.d();
                        d2.g("Content-Encoding");
                        d2.g("Content-Length");
                        b11.f37513f = d2.f().d();
                        String a12 = mVar2.a("Content-Type");
                        if (a12 == null) {
                            a12 = null;
                        }
                        b11.f37514g = new i(a12, -1L, u8.b.b(jVar));
                    }
                }
                return b11.a();
            default:
                C4903n c4903n3 = hVar.f38598e;
                i8.q qVar = hVar.f38594a;
                C4985p suppressed = C4985p.f40358n;
                w wVar = null;
                int i = 0;
                C4903n c4903n4 = c4903n3;
                while (true) {
                    boolean z12 = true;
                    while (true) {
                        qVar.getClass();
                        if (qVar.f38392C != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (qVar) {
                            try {
                                if (qVar.f38394E) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (qVar.f38393D) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z12) {
                            s sVar = qVar.f38399n;
                            h8.e eVar = sVar.f37471A;
                            i8.s sVar2 = qVar.f38401v;
                            int i4 = sVar.f37495x;
                            int i9 = sVar.f37496y;
                            int i10 = hVar.f38599f;
                            int i11 = hVar.f38600g;
                            z9 = true;
                            boolean z13 = sVar.f37477e;
                            boolean z14 = sVar.f37478f;
                            o url2 = (o) c4903n4.f40101u;
                            kotlin.jvm.internal.h.e(url2, "url");
                            if (kotlin.jvm.internal.h.a(url2.f37437a, "https")) {
                                SSLSocketFactory sSLSocketFactory2 = sVar.f37486o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                s8.c cVar2 = sVar.f37490s;
                                dVar = sVar.f37491t;
                                cVar = cVar2;
                                sSLSocketFactory = sSLSocketFactory2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            t tVar = new t(eVar, sVar2, i4, i9, i10, i11, z13, z14, new C4483a(url2.f37440d, url2.f37441e, sVar.f37482k, sVar.f37485n, sSLSocketFactory, cVar, dVar, sVar.f37484m, sVar.f37489r, sVar.f37488q, sVar.f37483l), qVar.f38399n.f37497z, new i8.a(qVar, qVar.f38401v.f38423a, hVar));
                            s sVar3 = qVar.f38399n;
                            qVar.f38405z = sVar3.f37478f ? new l(tVar, sVar3.f37471A) : new C4524d(23, tVar);
                        } else {
                            z9 = true;
                        }
                        try {
                            if (qVar.f38396G) {
                                throw new IOException("Canceled");
                            }
                            try {
                                v b12 = hVar.b(c4903n4).b();
                                b12.f37508a = c4903n4;
                                if (wVar != null) {
                                    try {
                                        k6 = w8.a.k(wVar);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z10 = z9;
                                        qVar.i(z10);
                                        throw th;
                                    }
                                } else {
                                    k6 = null;
                                }
                                b12.f37517k = k6;
                                wVar = b12.a();
                                c4903n4 = b(wVar, qVar.f38392C);
                                if (c4903n4 == null) {
                                    qVar.i(false);
                                    return wVar;
                                }
                                f8.c.a(wVar.f37536z);
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                qVar.i(z9);
                            } catch (IOException e6) {
                                if (!c(e6, qVar, c4903n4)) {
                                    byte[] bArr = f8.c.f37814a;
                                    kotlin.jvm.internal.h.e(suppressed, "suppressed");
                                    Iterator it = suppressed.iterator();
                                    while (it.hasNext()) {
                                        com.bumptech.glide.d.b(e6, (Exception) it.next());
                                    }
                                    throw e6;
                                }
                                kotlin.jvm.internal.h.e(suppressed, "<this>");
                                ArrayList arrayList = new ArrayList(suppressed.size() + 1);
                                arrayList.addAll(suppressed);
                                arrayList.add(e6);
                                qVar.i(true);
                                suppressed = arrayList;
                                z12 = false;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = true;
                        }
                    }
                }
        }
    }

    public C4903n b(w wVar, C4088vv c4088vv) {
        n nVar;
        w wVar2;
        z zVar = c4088vv != null ? c4088vv.b().f38408d : null;
        int i = wVar.f37533w;
        String str = (String) wVar.f37530n.f40102v;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((s) this.f38591b).f37479g.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    w wVar3 = wVar.f37525D;
                    if ((wVar3 == null || wVar3.f37533w != 503) && d(wVar, Integer.MAX_VALUE) == 0) {
                        return wVar.f37530n;
                    }
                } else {
                    if (i == 407) {
                        kotlin.jvm.internal.h.b(zVar);
                        if (zVar.f37541b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((s) this.f38591b).f37484m.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((s) this.f38591b).f37477e && (((wVar2 = wVar.f37525D) == null || wVar2.f37533w != 408) && d(wVar, 0) <= 0)) {
                        return wVar.f37530n;
                    }
                }
            } else if (c4088vv != null && !kotlin.jvm.internal.h.a(((i8.i) c4088vv.f34900w).j().c().f37351h.f37440d, ((f) c4088vv.f34901x).f().g().f37540a.f37351h.f37440d)) {
                r b9 = c4088vv.b();
                synchronized (b9) {
                    b9.f38416m = true;
                }
                return wVar.f37530n;
            }
            return null;
        }
        s sVar = (s) this.f38591b;
        if (sVar.f37480h) {
            String a9 = wVar.f37535y.a("Location");
            if (a9 == null) {
                a9 = null;
            }
            if (a9 != null) {
                C4903n c4903n = wVar.f37530n;
                o oVar = (o) c4903n.f40101u;
                oVar.getClass();
                try {
                    nVar = new n();
                    nVar.c(oVar, a9);
                } catch (IllegalArgumentException unused) {
                    nVar = null;
                }
                o a10 = nVar != null ? nVar.a() : null;
                if (a10 != null) {
                    if (kotlin.jvm.internal.h.a(a10.f37437a, ((o) c4903n.f40101u).f37437a) || sVar.i) {
                        N j9 = c4903n.j();
                        if (com.bumptech.glide.h.x(str)) {
                            boolean equals = str.equals("PROPFIND");
                            int i4 = wVar.f37533w;
                            boolean z8 = equals || i4 == 308 || i4 == 307;
                            if (str.equals("PROPFIND") || i4 == 308 || i4 == 307) {
                                j9.p(str, z8 ? (u) c4903n.f40104x : null);
                            } else {
                                j9.p("GET", null);
                            }
                            if (!z8) {
                                ((I1.b) j9.f198w).g("Transfer-Encoding");
                                ((I1.b) j9.f198w).g("Content-Length");
                                ((I1.b) j9.f198w).g("Content-Type");
                            }
                        }
                        if (!f8.d.a((o) c4903n.f40101u, a10)) {
                            ((I1.b) j9.f198w).g("Authorization");
                        }
                        j9.f196u = a10;
                        return new C4903n(j9);
                    }
                }
            }
        }
        return null;
    }

    public boolean c(IOException iOException, i8.q qVar, C4903n c4903n) {
        boolean z8 = iOException instanceof C4709a;
        if (!((s) this.f38591b).f37477e) {
            return false;
        }
        if ((!z8 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z8) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C4088vv c4088vv = qVar.f38397H;
        if (c4088vv == null || !c4088vv.f34898u) {
            return false;
        }
        i8.i iVar = qVar.f38405z;
        kotlin.jvm.internal.h.b(iVar);
        x j9 = iVar.j();
        C4088vv c4088vv2 = qVar.f38397H;
        return j9.a(c4088vv2 != null ? c4088vv2.b() : null);
    }

    public a(s client) {
        kotlin.jvm.internal.h.e(client, "client");
        this.f38591b = client;
    }
}
