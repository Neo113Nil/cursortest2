package defpackage;

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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class r9 implements lv {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public r9(sl slVar) {
        slVar.getClass();
        this.b = slVar;
    }

    public static int d(v90 v90Var, int i) {
        String i2 = v90.i(v90Var, "Retry-After");
        if (i2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(i2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(i2);
        valueOf.getClass();
        return valueOf.intValue();
    }

    @Override // defpackage.lv
    public final v90 a(s70 s70Var) {
        boolean z;
        boolean z2;
        x90 x90Var;
        SSLSocketFactory sSLSocketFactory;
        m40 m40Var;
        xa xaVar;
        switch (this.a) {
            case 0:
                sl slVar = (sl) this.b;
                j90 j90Var = s70Var.e;
                wi a = j90Var.a();
                ou ouVar = (ou) j90Var.b;
                bt btVar = (bt) j90Var.d;
                if (btVar.a("Host") == null) {
                    z = false;
                    a.k("Host", zk0.t(ouVar, false));
                } else {
                    z = false;
                }
                if (btVar.a("Connection") == null) {
                    a.k("Connection", "Keep-Alive");
                }
                if (btVar.a("Accept-Encoding") == null && btVar.a("Range") == null) {
                    a.k("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                slVar.getClass();
                ouVar.getClass();
                if (btVar.a("User-Agent") == null) {
                    a.k("User-Agent", "okhttp/4.12.0");
                }
                v90 b = s70Var.b(a.c());
                bt btVar2 = b.k;
                mu.b(slVar, ouVar, btVar2);
                u90 n = b.n();
                n.a = j90Var;
                if (z2 && "gzip".equalsIgnoreCase(v90.i(b, "Content-Encoding")) && mu.a(b) && (x90Var = b.l) != null) {
                    qs qsVar = new qs(x90Var.r());
                    o0 c = btVar2.c();
                    c.E("Content-Encoding");
                    c.E("Content-Length");
                    n.f = c.x().c();
                    n.g = new t70(v90.i(b, "Content-Type"), -1L, new j70(qsVar));
                }
                return n.a();
            default:
                j90 j90Var2 = s70Var.e;
                n70 n70Var = s70Var.a;
                List list = wm.f;
                v90 v90Var = null;
                int i = 0;
                j90 j90Var3 = j90Var2;
                while (true) {
                    boolean z3 = true;
                    while (n70Var.n == null) {
                        synchronized (n70Var) {
                            try {
                                if (n70Var.p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (n70Var.o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            r70 r70Var = n70Var.h;
                            ou ouVar2 = (ou) j90Var3.b;
                            o40 o40Var = n70Var.f;
                            if (ouVar2.i) {
                                SSLSocketFactory sSLSocketFactory2 = o40Var.t;
                                if (sSLSocketFactory2 == null) {
                                    s9.u("CLEARTEXT-only client");
                                    return null;
                                }
                                m40 m40Var2 = o40Var.x;
                                xaVar = o40Var.y;
                                sSLSocketFactory = sSLSocketFactory2;
                                m40Var = m40Var2;
                            } else {
                                sSLSocketFactory = null;
                                m40Var = null;
                                xaVar = null;
                            }
                            n70Var.l = new tn(r70Var, new n2(ouVar2.d, ouVar2.e, o40Var.p, o40Var.s, sSLSocketFactory, m40Var, xaVar, o40Var.r, o40Var.w, o40Var.v, o40Var.q), n70Var);
                        }
                        try {
                            if (n70Var.r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    v90 b2 = s70Var.b(j90Var3);
                                    if (v90Var != null) {
                                        u90 n2 = b2.n();
                                        u90 n3 = v90Var.n();
                                        n3.g = null;
                                        v90 a2 = n3.a();
                                        if (a2.l != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        n2.j = a2;
                                        b2 = n2.a();
                                    }
                                    v90Var = b2;
                                    j90Var3 = b(v90Var, n70Var.n);
                                    if (j90Var3 == null) {
                                        n70Var.e(false);
                                        return v90Var;
                                    }
                                    x90 x90Var2 = v90Var.l;
                                    if (x90Var2 != null) {
                                        zk0.b(x90Var2);
                                    }
                                    i++;
                                    if (i > 20) {
                                        throw new ProtocolException("Too many follow-up requests: " + i);
                                    }
                                    n70Var.e(true);
                                } catch (IOException e) {
                                    if (!c(e, n70Var, j90Var3, !(e instanceof le))) {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            bi.f(e, (Exception) it.next());
                                        }
                                        throw e;
                                    }
                                    list = uc.l0(list, e);
                                    n70Var.e(true);
                                    z3 = false;
                                }
                            } catch (za0 e2) {
                                boolean c2 = c(e2.g, n70Var, j90Var3, false);
                                IOException iOException = e2.f;
                                if (!c2) {
                                    iOException.getClass();
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        bi.f(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                list = uc.l0(list, iOException);
                                n70Var.e(true);
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            n70Var.e(true);
                            throw th2;
                        }
                    }
                    s9.u("Check failed.");
                    return null;
                }
        }
    }

    public j90 b(v90 v90Var, rn rnVar) {
        nu nuVar;
        v90 v90Var2;
        q70 q70Var;
        ya0 ya0Var = (rnVar == null || (q70Var = rnVar.e) == null) ? null : q70Var.b;
        int i = v90Var.i;
        String str = (String) v90Var.f.c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((o40) this.b).l.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    v90 v90Var3 = v90Var.o;
                    if ((v90Var3 == null || v90Var3.i != 503) && d(v90Var, Integer.MAX_VALUE) == 0) {
                        return v90Var.f;
                    }
                } else {
                    if (i == 407) {
                        ya0Var.getClass();
                        if (ya0Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((o40) this.b).r.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((o40) this.b).k && (((v90Var2 = v90Var.o) == null || v90Var2.i != 408) && d(v90Var, 0) <= 0)) {
                        return v90Var.f;
                    }
                }
            } else if (rnVar != null && !mv.c(rnVar.b.b.h.d, rnVar.e.b.a.h.d)) {
                q70 q70Var2 = rnVar.e;
                synchronized (q70Var2) {
                    q70Var2.k = true;
                }
                return v90Var.f;
            }
            return null;
        }
        o40 o40Var = (o40) this.b;
        if (o40Var.m) {
            String i2 = v90.i(v90Var, "Location");
            j90 j90Var = v90Var.f;
            if (i2 != null) {
                ou ouVar = (ou) j90Var.b;
                ouVar.getClass();
                try {
                    nuVar = new nu(0);
                    nuVar.f(ouVar, i2);
                } catch (IllegalArgumentException unused) {
                    nuVar = null;
                }
                ou b = nuVar != null ? nuVar.b() : null;
                if (b != null && (mv.c(b.a, ((ou) j90Var.b).a) || o40Var.n)) {
                    wi a = j90Var.a();
                    if (d50.G(str)) {
                        int i3 = v90Var.i;
                        boolean z = str.equals("PROPFIND") || i3 == 308 || i3 == 307;
                        if (str.equals("PROPFIND") || i3 == 308 || i3 == 307) {
                            a.m(str, null);
                        } else {
                            a.m("GET", null);
                        }
                        if (!z) {
                            ((o0) a.h).E("Transfer-Encoding");
                            ((o0) a.h).E("Content-Length");
                            ((o0) a.h).E("Content-Type");
                        }
                    }
                    if (!zk0.a((ou) j90Var.b, b)) {
                        ((o0) a.h).E("Authorization");
                    }
                    a.f = b;
                    return a.c();
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
    public boolean c(IOException iOException, n70 n70Var, j90 j90Var, boolean z) {
        boolean z2;
        f2 f2Var;
        q70 q70Var;
        if (!((o40) this.b).k || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        tn tnVar = n70Var.l;
        tnVar.getClass();
        int i = tnVar.f;
        if (i == 0 && tnVar.g == 0 && tnVar.h == 0) {
            z2 = false;
        } else {
            if (tnVar.i == null) {
                ya0 ya0Var = null;
                if (i <= 1 && tnVar.g <= 1 && tnVar.h <= 0 && (q70Var = tnVar.c.m) != null) {
                    synchronized (q70Var) {
                        if (q70Var.l == 0) {
                            if (zk0.a(q70Var.b.a.h, tnVar.b.h)) {
                                ya0Var = q70Var.b;
                            }
                        }
                    }
                }
                if (ya0Var != null) {
                    tnVar.i = ya0Var;
                } else {
                    u2 u2Var = tnVar.d;
                    if ((u2Var == null || !u2Var.d()) && (f2Var = tnVar.e) != null) {
                        z2 = f2Var.j();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public r9(o40 o40Var) {
        this.b = o40Var;
    }
}
