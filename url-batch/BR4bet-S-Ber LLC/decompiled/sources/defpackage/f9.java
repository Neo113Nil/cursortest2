package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class f9 implements jr {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public f9(ej ejVar) {
        ejVar.getClass();
        this.b = ejVar;
    }

    public static int d(n30 n30Var, int i) {
        String f = n30.f(n30Var, "Retry-After");
        if (f == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(f).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(f);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    @Override // defpackage.jr
    public final n30 a(n10 n10Var) {
        boolean z;
        boolean z2;
        p30 p30Var;
        ?? arrayList;
        SSLSocketFactory sSLSocketFactory;
        vy vyVar;
        ea eaVar;
        switch (this.a) {
            case 0:
                ej ejVar = (ej) this.b;
                b30 b30Var = n10Var.e;
                rg a = b30Var.a();
                uq uqVar = b30Var.a;
                kp kpVar = b30Var.c;
                if (kpVar.a("Host") == null) {
                    z = false;
                    a.p("Host", cb0.t(uqVar, false));
                } else {
                    z = false;
                }
                if (kpVar.a("Connection") == null) {
                    a.p("Connection", "Keep-Alive");
                }
                if (kpVar.a("Accept-Encoding") == null && kpVar.a("Range") == null) {
                    a.p("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                ejVar.getClass();
                uqVar.getClass();
                if (kpVar.a("User-Agent") == null) {
                    a.p("User-Agent", "okhttp/4.12.0");
                }
                n30 b = n10Var.b(a.d());
                kp kpVar2 = b.k;
                sq.b(ejVar, uqVar, kpVar2);
                m30 g = b.g();
                g.a = b30Var;
                if (z2 && "gzip".equalsIgnoreCase(n30.f(b, "Content-Encoding")) && sq.a(b) && (p30Var = b.l) != null) {
                    ap apVar = new ap(p30Var.h());
                    rc0 c = kpVar2.c();
                    c.J("Content-Encoding");
                    c.J("Content-Length");
                    g.f = c.A().c();
                    g.g = new o10(n30.f(b, "Content-Type"), -1L, new e10(apVar));
                }
                return g.a();
            default:
                b30 b30Var2 = n10Var.e;
                i10 i10Var = n10Var.a;
                ik ikVar = ik.f;
                n30 n30Var = null;
                int i = 0;
                b30 b30Var3 = b30Var2;
                while (true) {
                    boolean z3 = true;
                    while (i10Var.n == null) {
                        synchronized (i10Var) {
                            try {
                                if (i10Var.p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (i10Var.o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            m10 m10Var = i10Var.h;
                            uq uqVar2 = b30Var3.a;
                            xy xyVar = i10Var.f;
                            if (uqVar2.i) {
                                SSLSocketFactory sSLSocketFactory2 = xyVar.t;
                                if (sSLSocketFactory2 == null) {
                                    g9.s("CLEARTEXT-only client");
                                    return null;
                                }
                                vy vyVar2 = xyVar.x;
                                eaVar = xyVar.y;
                                sSLSocketFactory = sSLSocketFactory2;
                                vyVar = vyVar2;
                            } else {
                                sSLSocketFactory = null;
                                vyVar = null;
                                eaVar = null;
                            }
                            i10Var.l = new wk(m10Var, new e2(uqVar2.d, uqVar2.e, xyVar.p, xyVar.s, sSLSocketFactory, vyVar, eaVar, xyVar.r, xyVar.w, xyVar.v, xyVar.q), i10Var);
                        }
                        try {
                            if (i10Var.r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                n30 b2 = n10Var.b(b30Var3);
                                if (n30Var != null) {
                                    m30 g2 = b2.g();
                                    m30 g3 = n30Var.g();
                                    g3.g = null;
                                    n30 a2 = g3.a();
                                    if (a2.l != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    g2.j = a2;
                                    b2 = g2.a();
                                }
                                n30Var = b2;
                                b30Var3 = b(n30Var, i10Var.n);
                                if (b30Var3 == null) {
                                    i10Var.e(false);
                                    return n30Var;
                                }
                                p30 p30Var2 = n30Var.l;
                                if (p30Var2 != null) {
                                    cb0.b(p30Var2);
                                }
                                i++;
                                if (i > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i);
                                }
                                i10Var.e(true);
                            } catch (IOException e) {
                                if (!c(e, i10Var, b30Var3, !(e instanceof bd))) {
                                    Iterator it = ikVar.iterator();
                                    while (it.hasNext()) {
                                        la0.f(e, (Exception) it.next());
                                    }
                                    throw e;
                                }
                                arrayList = new ArrayList(ikVar.size() + 1);
                                arrayList.addAll(ikVar);
                                arrayList.add(e);
                                i10Var.e(true);
                                ikVar = arrayList;
                                z3 = false;
                            } catch (x30 e2) {
                                boolean c2 = c(e2.g, i10Var, b30Var3, false);
                                IOException iOException = e2.f;
                                if (!c2) {
                                    iOException.getClass();
                                    Iterator it2 = ikVar.iterator();
                                    while (it2.hasNext()) {
                                        la0.f(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                arrayList = new ArrayList(ikVar.size() + 1);
                                arrayList.addAll(ikVar);
                                arrayList.add(iOException);
                                i10Var.e(true);
                                ikVar = arrayList;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            i10Var.e(true);
                            throw th2;
                        }
                    }
                    g9.s("Check failed.");
                    return null;
                }
        }
    }

    public b30 b(n30 n30Var, uk ukVar) {
        tq tqVar;
        n30 n30Var2;
        l10 l10Var;
        w30 w30Var = (ukVar == null || (l10Var = ukVar.e) == null) ? null : l10Var.b;
        int i = n30Var.i;
        String str = n30Var.f.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((xy) this.b).l.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    n30 n30Var3 = n30Var.o;
                    if ((n30Var3 == null || n30Var3.i != 503) && d(n30Var, Integer.MAX_VALUE) == 0) {
                        return n30Var.f;
                    }
                } else {
                    if (i == 407) {
                        w30Var.getClass();
                        if (w30Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((xy) this.b).r.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((xy) this.b).k && (((n30Var2 = n30Var.o) == null || n30Var2.i != 408) && d(n30Var, 0) <= 0)) {
                        return n30Var.f;
                    }
                }
            } else if (ukVar != null && !kr.b(ukVar.b.b.h.d, ukVar.e.b.a.h.d)) {
                l10 l10Var2 = ukVar.e;
                synchronized (l10Var2) {
                    l10Var2.k = true;
                }
                return n30Var.f;
            }
            return null;
        }
        xy xyVar = (xy) this.b;
        if (xyVar.m) {
            String f = n30.f(n30Var, "Location");
            b30 b30Var = n30Var.f;
            if (f != null) {
                uq uqVar = b30Var.a;
                uqVar.getClass();
                try {
                    tqVar = new tq(0);
                    tqVar.f(uqVar, f);
                } catch (IllegalArgumentException unused) {
                    tqVar = null;
                }
                uq b = tqVar != null ? tqVar.b() : null;
                if (b != null && (kr.b(b.a, b30Var.a.a) || xyVar.n)) {
                    rg a = b30Var.a();
                    if (xf.C(str)) {
                        int i2 = n30Var.i;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            a.t(str, null);
                        } else {
                            a.t("GET", null);
                        }
                        if (!z) {
                            ((rc0) a.h).J("Transfer-Encoding");
                            ((rc0) a.h).J("Content-Length");
                            ((rc0) a.h).J("Content-Type");
                        }
                    }
                    if (!cb0.a(b30Var.a, b)) {
                        ((rc0) a.h).J("Authorization");
                    }
                    a.f = b;
                    return a.d();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r6 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(IOException iOException, i10 i10Var, b30 b30Var, boolean z) {
        boolean z2;
        y1 y1Var;
        l10 l10Var;
        if (!((xy) this.b).k || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        wk wkVar = i10Var.l;
        wkVar.getClass();
        int i = wkVar.f;
        if (i == 0 && wkVar.g == 0 && wkVar.h == 0) {
            z2 = false;
        } else {
            if (wkVar.i == null) {
                w30 w30Var = null;
                if (i <= 1 && wkVar.g <= 1 && wkVar.h <= 0 && (l10Var = wkVar.c.m) != null) {
                    synchronized (l10Var) {
                        if (l10Var.l == 0) {
                            if (cb0.a(l10Var.b.a.h, wkVar.b.h)) {
                                w30Var = l10Var.b;
                            }
                        }
                    }
                }
                if (w30Var != null) {
                    wkVar.i = w30Var;
                } else {
                    l2 l2Var = wkVar.d;
                    if ((l2Var == null || !l2Var.c()) && (y1Var = wkVar.e) != null) {
                        z2 = y1Var.j();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public f9(xy xyVar) {
        this.b = xyVar;
    }
}
