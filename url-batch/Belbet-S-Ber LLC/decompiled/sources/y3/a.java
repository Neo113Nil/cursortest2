package y3;

import a0.k;
import a4.e0;
import g4.p;
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
import o2.b0;
import t3.j;
import t3.l;
import t3.o;
import t3.q;
import t3.r;
import t3.s;
import t3.u;
import t3.v;
import x3.i;
import x3.m;
import x3.n;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4111a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4112b;

    public a(t3.b bVar) {
        i3.d.e(bVar, "cookieJar");
        this.f4112b = bVar;
    }

    public static int d(s sVar, int i) {
        String m4 = s.m("Retry-After", sVar);
        if (m4 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        i3.d.d(compile, "compile(...)");
        if (!compile.matcher(m4).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(m4);
        i3.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.l
    public final s a(f fVar) {
        u uVar;
        SSLSocketFactory sSLSocketFactory;
        f4.c cVar;
        t3.d dVar;
        switch (this.f4111a) {
            case 0:
                t3.b bVar = (t3.b) this.f4112b;
                q qVar = fVar.f4117e;
                j jVar = qVar.f3508c;
                k a5 = qVar.a();
                t3.k kVar = qVar.f3506a;
                boolean z4 = false;
                if (jVar.a("Host") == null) {
                    a5.n("Host", u3.b.t(kVar, false));
                }
                if (jVar.a("Connection") == null) {
                    a5.n("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    a5.n("Accept-Encoding", "gzip");
                    z4 = true;
                }
                bVar.getClass();
                i3.d.e(kVar, "url");
                if (jVar.a("User-Agent") == null) {
                    a5.n("User-Agent", "okhttp/4.12.0");
                }
                s b2 = fVar.b(a5.d());
                j jVar2 = b2.f3523k;
                e.b(bVar, kVar, jVar2);
                r n4 = b2.n();
                n4.f3510a = qVar;
                if (z4 && "gzip".equalsIgnoreCase(s.m("Content-Encoding", b2)) && e.a(b2) && (uVar = b2.f3524l) != null) {
                    g4.k kVar2 = new g4.k(uVar.o());
                    q3.a c5 = jVar2.c();
                    c5.g("Content-Encoding");
                    c5.g("Content-Length");
                    n4.f3514f = c5.f().c();
                    n4.f3515g = new g(s.m("Content-Type", b2), -1L, new p(kVar2));
                }
                return n4.a();
            default:
                q qVar2 = fVar.f4117e;
                i iVar = fVar.f4114a;
                x2.q qVar3 = x2.q.f3887f;
                s sVar = null;
                int i = 0;
                q qVar4 = qVar2;
                while (true) {
                    boolean z5 = true;
                    while (iVar.f3919n == null) {
                        synchronized (iVar) {
                            try {
                                if (iVar.f3921p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (iVar.f3920o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z5) {
                            m mVar = iVar.h;
                            t3.k kVar3 = qVar4.f3506a;
                            o oVar = iVar.f3913f;
                            if (kVar3.i) {
                                SSLSocketFactory sSLSocketFactory2 = oVar.f3493t;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                f4.c cVar2 = oVar.f3497x;
                                dVar = oVar.f3498y;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            iVar.f3917l = new x3.e(mVar, new t3.a(kVar3.d, kVar3.f3458e, oVar.f3489p, oVar.f3492s, sSLSocketFactory, cVar, dVar, oVar.f3491r, oVar.f3496w, oVar.f3495v, oVar.f3490q), iVar);
                        }
                        try {
                            if (iVar.f3923r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                s b5 = fVar.b(qVar4);
                                if (sVar != null) {
                                    r n5 = b5.n();
                                    r n6 = sVar.n();
                                    n6.f3515g = null;
                                    s a6 = n6.a();
                                    if (a6.f3524l != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    n5.f3516j = a6;
                                    b5 = n5.a();
                                }
                                sVar = b5;
                                qVar4 = b(sVar, iVar.f3919n);
                                if (qVar4 == null) {
                                    iVar.e(false);
                                    return sVar;
                                }
                                u uVar2 = sVar.f3524l;
                                if (uVar2 != null) {
                                    u3.b.b(uVar2);
                                }
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                iVar.e(true);
                            } catch (IOException e4) {
                                if (!c(e4, iVar, qVar4, !(e4 instanceof a4.a))) {
                                    Iterator it = qVar3.iterator();
                                    while (it.hasNext()) {
                                        s.a.c(e4, (Exception) it.next());
                                    }
                                    throw e4;
                                }
                                ArrayList arrayList = new ArrayList(qVar3.size() + 1);
                                arrayList.addAll(qVar3);
                                arrayList.add(e4);
                                iVar.e(true);
                                qVar3 = arrayList;
                                z5 = false;
                            } catch (n e5) {
                                if (!c(e5.f3946g, iVar, qVar4, false)) {
                                    IOException iOException = e5.f3945f;
                                    i3.d.e(iOException, "<this>");
                                    Iterator it2 = qVar3.iterator();
                                    while (it2.hasNext()) {
                                        s.a.c(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e5.f3945f;
                                ArrayList arrayList2 = new ArrayList(qVar3.size() + 1);
                                arrayList2.addAll(qVar3);
                                arrayList2.add(iOException2);
                                iVar.e(true);
                                qVar3 = arrayList2;
                                z5 = false;
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

    public q b(s sVar, x3.d dVar) {
        b0 b0Var;
        s sVar2;
        x3.l lVar;
        v vVar = (dVar == null || (lVar = dVar.f3902e) == null) ? null : lVar.f3929b;
        int i = sVar.i;
        String str = sVar.f3520f.f3507b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((o) this.f4112b).f3485l.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    s sVar3 = sVar.f3527o;
                    if ((sVar3 == null || sVar3.i != 503) && d(sVar, Integer.MAX_VALUE) == 0) {
                        return sVar.f3520f;
                    }
                } else {
                    if (i == 407) {
                        i3.d.b(vVar);
                        if (vVar.f3534b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((o) this.f4112b).f3491r.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((o) this.f4112b).f3484k && (((sVar2 = sVar.f3527o) == null || sVar2.i != 408) && d(sVar, 0) <= 0)) {
                        return sVar.f3520f;
                    }
                }
            } else if (dVar != null && !i3.d.a(dVar.f3900b.f3904b.h.d, dVar.f3902e.f3929b.f3533a.h.d)) {
                x3.l lVar2 = dVar.f3902e;
                synchronized (lVar2) {
                    lVar2.f3935k = true;
                }
                return sVar.f3520f;
            }
            return null;
        }
        o oVar = (o) this.f4112b;
        if (oVar.f3486m) {
            String m4 = s.m("Location", sVar);
            q qVar = sVar.f3520f;
            if (m4 != null) {
                t3.k kVar = qVar.f3506a;
                kVar.getClass();
                try {
                    b0Var = new b0(1);
                    b0Var.f(kVar, m4);
                } catch (IllegalArgumentException unused) {
                    b0Var = null;
                }
                t3.k c5 = b0Var != null ? b0Var.c() : null;
                if (c5 != null && (i3.d.a(c5.f3455a, qVar.f3506a.f3455a) || oVar.f3487n)) {
                    k a5 = qVar.a();
                    if (r1.b.v(str)) {
                        int i4 = sVar.i;
                        boolean z4 = str.equals("PROPFIND") || i4 == 308 || i4 == 307;
                        if (str.equals("PROPFIND") || i4 == 308 || i4 == 307) {
                            a5.q(str, null);
                        } else {
                            a5.q("GET", null);
                        }
                        if (!z4) {
                            ((q3.a) a5.h).g("Transfer-Encoding");
                            ((q3.a) a5.h).g("Content-Length");
                            ((q3.a) a5.h).g("Content-Type");
                        }
                    }
                    if (!u3.b.a(qVar.f3506a, c5)) {
                        ((q3.a) a5.h).g("Authorization");
                    }
                    a5.f97f = c5;
                    return a5.d();
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
    public boolean c(IOException iOException, i iVar, q qVar, boolean z4) {
        boolean z5;
        com.google.android.material.datepicker.c cVar;
        x3.l lVar;
        if (!((o) this.f4112b).f3484k || ((z4 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        x3.e eVar = iVar.f3917l;
        i3.d.b(eVar);
        int i = eVar.f3907f;
        if (i == 0 && eVar.f3908g == 0 && eVar.h == 0) {
            z5 = false;
        } else {
            if (eVar.i == null) {
                v vVar = null;
                if (i <= 1 && eVar.f3908g <= 1 && eVar.h <= 0 && (lVar = eVar.f3905c.f3918m) != null) {
                    synchronized (lVar) {
                        if (lVar.f3936l == 0) {
                            if (u3.b.a(lVar.f3929b.f3533a.h, eVar.f3904b.h)) {
                                vVar = lVar.f3929b;
                            }
                        }
                    }
                }
                if (vVar != null) {
                    eVar.i = vVar;
                } else {
                    e0 e0Var = eVar.d;
                    if ((e0Var == null || !e0Var.d()) && (cVar = eVar.f3906e) != null) {
                        z5 = cVar.k();
                    }
                }
            }
            z5 = true;
        }
        return z5;
    }

    public a(o oVar) {
        this.f4112b = oVar;
    }
}
